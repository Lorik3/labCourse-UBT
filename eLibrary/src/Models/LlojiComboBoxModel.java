/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import BLL.Lloji;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author erzah
 */
public class LlojiComboBoxModel extends AbstractListModel<Lloji> implements ComboBoxModel <Lloji> {

        
      private List<Lloji> data;
    private Lloji selectedItem;
    
    public LlojiComboBoxModel(){}
    
    public LlojiComboBoxModel(List<Lloji> data){
        this.data = data;
    }
    
    public void add(List<Lloji> data){
        this.data = data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Lloji getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Lloji) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}
