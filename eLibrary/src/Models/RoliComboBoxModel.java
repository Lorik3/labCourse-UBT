
package Models;

/**
 *
 * @author Ylli
 */
import BLL.RoliL;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class RoliComboBoxModel extends AbstractListModel<RoliL> implements ComboBoxModel<RoliL> {
    
    private List<RoliL> data;
    private RoliL selectedItem;
    
    public RoliComboBoxModel(){}
    
    public RoliComboBoxModel(List<RoliL> data){
        this.data = data;
    }
    
    public void add(List<RoliL> data){
        this.data = data;
    }
  
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public RoliL getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (RoliL) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}
