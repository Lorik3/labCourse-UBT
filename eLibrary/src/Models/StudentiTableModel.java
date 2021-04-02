
package Models;

/**
 *
 * @author Ylli
 */
import BLL.Studenti;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;




public class StudentiTableModel extends AbstractTableModel {
    
    List<Studenti> list;
    String [] cols = {"ID", "Emri", "Mbiemri", "Data e Lindjes", "Gjinia", "Adresa", "Tel", "Email", "Perdorusi"}; // vargu i stringjeve (cols)
    
    public StudentiTableModel(){} // konstruktor i zbrazet
    
    public StudentiTableModel(List<Studenti> list){ //konstruktor qe pranon list personave
       this.list = list; // qe dergon lista
    }
    public void addList(List<Studenti>list){ // per mos me thirr gjith konstruktorin
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
    
    public Studenti getStudenti(int index){   //mw kthy ni person ne baz te numrit qe marum
   
    return list.get(index);
    }
    
    @Override
    public int getColumnCount() {
        return cols.length; //per me kthy nje integer
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                  // kthen nje objekt ne baz te dy parametrave
        Studenti s = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return s.getStudentId();
            case 1:
                return s.getEmri();
            case 2: 
                return s.getMbiemri();
            case 3:
                return s.getDataELindjes();
            case 4:
                return s.getGjinia();
            case 5:
                return s.getAdressa();
            case 6:
                return s.getNrTelefonit();
            case 7: 
                return s.getEmail();
            case 8:
                return s.getFkUserId();
            default:
                return null;
        }
    }
    
      public String getDateToString(Date d){
        DateFormat da = new SimpleDateFormat("dd-MM-yyyy");
        return da.format(d);
    }
    
}
  
  
    

