/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import BLL.Autori;
import DAL.eLibraryException;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class AutoriTableModel extends AbstractTableModel{
    
    static List<Autori> autoret;
    String [] cols = {"Id","Emri","Mbiemri","Gjinia","Adresa","Tel","Email"};

    public AutoriTableModel() {
    }
    
    public AutoriTableModel(List<Autori>a){
        autoret = a;
    }
    
    //kthen poziten e nje autori ne list
    public int getAutoriRow(Autori a){
        for (int i = 0; i < autoret.size(); i++) {
            if(a==autoret.get(i)){
                return i;
            }
        }
        return -1;
    }
    
    public void addToList(List<Autori>a){
        autoret = a;
    }
    
    public void remove(int row){
        autoret.remove(row);
    }
    
    public void printAll(){
        for(Autori a : autoret){
            System.out.println(a);
        }
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getRowCount(){
        return autoret.size();
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }
    
    public Autori getAutori(int index){
        return autoret.get(index);
    }
    
    public Autori getAutori(String name){
        for(Autori aut : autoret){
            if(aut.getEmri().equalsIgnoreCase(name)){
            return aut;
          }
        }
        return null;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //"Id","Emri","Mbiemri","Gjinia","Adresa","Tel","Email"
        Autori a = autoret.get(rowIndex);
            switch(columnIndex){
                case 0:
                    return a.getAutoriId();
                case 1:
                    return a.getEmri();
                case 2:
                    return a.getMbiemri();
                case 3: 
                    return  a.getGjinia();
                case 4: 
                    return a.getAdressa();
                case 5: 
                    return a.getTel();
                case 6: 
                    return a.getEmail();
               default:
                   return null;
            }
        
        
    }
    
    
    
}
