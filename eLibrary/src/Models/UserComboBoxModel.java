
package Models;

/**
 *
 * @author Ylli
 */
import BLL.Perdorusi;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;


public class UserComboBoxModel extends AbstractListModel<Perdorusi> implements ComboBoxModel<Perdorusi>{
    
    private List<Perdorusi> data;
    private Perdorusi selectedItem;
    
    public UserComboBoxModel(){}
    
    public UserComboBoxModel(List<Perdorusi> data){
        
        this.data = data;

    }
    
    public void add(List<Perdorusi> data){
        this.data = data;
    }
            

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Perdorusi)anItem;
    }

    @Override
    public Object getSelectedItem() {
       return selectedItem;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Perdorusi getElementAt(int index) {
        return data.get(index);
    }

}
