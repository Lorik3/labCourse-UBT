/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Autori;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Lenovo
 */
public class AutoriSearchCombo extends AbstractListModel<String> implements ComboBoxModel<String> {
    //lista qe mban llojet e kerkimit sipas kolonave
    //,"Mbiemri","Gjinia","Adresa","Tel","Email"
    public static String [] a = {"Id","Emri"};
    List<String> cols = Arrays.asList(a);
    private String selectedItem;
    
    public AutoriSearchCombo(){}
    
    public AutoriSearchCombo(List<String>s){
        cols=s;
    }
    
    public List<String> getList(){
        return cols;
    }
    
    public void add(List<String>p){
        cols = p;
    }
   
    @Override
    public int getSize() {
        return cols.size();
    }
    
    @Override
    public String getElementAt(int index) {
        return cols.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (String) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    
    
}
