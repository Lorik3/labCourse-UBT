/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import BLL.Autori;
import BLL.RoliL;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author erzah
 */
public class AutoriComboBoxModel extends AbstractListModel<Autori> implements ComboBoxModel<Autori> {

        private List<Autori> data;
    private Autori selectedItem;
    
    public AutoriComboBoxModel(){}
    
    public AutoriComboBoxModel(List<Autori> data){
        this.data = data;
    }
    
    public void add(List<Autori> data){
        this.data = data;
    }
  
    @Override
    public int getSize() {
            return data.size();
    }

    @Override
    public Autori getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Autori) anItem;
    }

    @Override
    public Object getSelectedItem() {
            return selectedItem;
    }
    
}
