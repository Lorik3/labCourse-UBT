/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import BLL.Libri;
import java.util.List;
import javax.swing.table.AbstractTableModel;



/**
 *
 * @author erzah
 */
public class LibriTableModel extends AbstractTableModel {
    
    List<Libri> list;
    String [] cols = {"ID", "Emri i Librit","Numri i faqeve", "Botuesi", "Autori", "Lloji i librit",}; // vargu i stringjeve (cols)
    
    public LibriTableModel(){} // konstruktor i zbrazet
    
    public LibriTableModel(List<Libri> list){ //konstruktor qe pranon list personave
       this.list = list; // qe dergon lista
    }
    public void addList(List<Libri>list){ // per mos me thirr gjith konstruktorin
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
    
    public Libri getLibri(int index){   //mw kthy ni person ne baz te numrit qe marum
   
    return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length; //per me kthy nje integer
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                  // kthen nje objekt ne baz te dy parametrave
        Libri l = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return l.getLibriId();
            case 1:
                return l.getTitulli();
            case 2:
                return l.getNumriIFaqeve();
            case 3:
                return l.getBotusi();
            case 4:
                return l.getFkIdAutori();
            case 5:
                return l.getFkLlojiId();
            default:
                return null;
        }
    }
}
    