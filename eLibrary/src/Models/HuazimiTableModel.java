/*0
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import BLL.Huazimi;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lorik
 */
public class HuazimiTableModel extends AbstractTableModel {
        
        List<Huazimi> list;

    String [] cols = {"ID", "Libri", "Data e huazimit", "Data e rikthimit"}; // vargu i stringjeve (cols)
    
    public HuazimiTableModel(){} // konstruktor i zbrazet
    
    public HuazimiTableModel(List<Huazimi> list){ //konstruktor qe pranon list personave
       this.list = list; // qe dergon lista
    }
    public void addList(List<Huazimi>list){ // per mos me thirr gjith konstruktorin
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
    
    public Huazimi getHuazimi(int index){   //mw kthy ni person ne baz te numrit qe marum
   
    return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length; //per me kthy nje integer
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                  // kthen nje objekt ne baz te dy parametrave
        Huazimi h = list.get(rowIndex);
        switch(columnIndex){
            case 0: 
                return h.getHuazimiId();
            case 1: 
                return h.getFkLibriId();
            case 2:
                return h.getDataEHuazimit();
            case 3:    
                return h.getDataERikthimit();
        
            default:
                return null;
        }
    }
}
