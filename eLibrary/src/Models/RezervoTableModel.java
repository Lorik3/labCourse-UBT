/*0
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import BLL.Rezervo;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lorik
 */ 


public class RezervoTableModel extends AbstractTableModel {
    
    List<Rezervo> list;
    String [] cols = {"ID", "Libri","Data e rezervimit"}; // vargu i stringjeve (cols)
    
    public RezervoTableModel(){} // konstruktor i zbrazet
    
    public RezervoTableModel(List<Rezervo> list){ //konstruktor qe pranon list personave
       this.list = list; // qe dergon lista
    }
    public void addList(List<Rezervo>list){ // per mos me thirr gjith konstruktorin
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){ // nese dojna me mar emrin e kolones ne bas te numrit te kolonave
        return cols[col];
        
    }
    
    @Override
    public int getRowCount() { // na kthen numrin e rreshtave
        
         return list.size();
    }
    public void remove(int row){
        list.remove(row); // per me fshi ni rresht ne bas te numrit te rreshtit
    }
    
    public Rezervo getRezervo(int index){   //mw kthy ni person ne baz te numrit qe marum
   
    return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length; //per me kthy nje integer
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                  // kthen nje objekt ne baz te dy parametrave
        Rezervo r = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return r.getRezervoId();
            case 1:
                return r.getFkLibriId();
            case 2:
                return r.getDataERezervimit();
             default:
                return null;
        }
    }
}
