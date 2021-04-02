
package Models;

/**
 *
 * @author Ylli
 */
import BLL.Perdorusi;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class UserTableModel extends AbstractTableModel {
    
    
    
    List <Perdorusi> list;
    String []  cols =  {"ID e Perdorusit", "Perdorusi", "Password","Roli"};
    public UserTableModel(){}
    
    public UserTableModel(List<Perdorusi> list){
        this.list = list;
    }
    
    public void addList(List<Perdorusi> list){
        this.list = list;
    }
    
    @Override
    public String getColumnName(int col){
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return list.size();
       
    }
    public void remove(int row){
        list.remove(row);
    }
    public Perdorusi getPerdorusi(int index){
        return list.get(index);
    }

    @Override
    public int getColumnCount() {
       return cols.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Perdorusi p = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return p.getUsersid();
            case 1:
                return p.getUsername();
            case 2:
                return p.getPassword();
            case 3:
                return p.getFkRoliId();
            default: 
                return null;
       }
    }
    
}
