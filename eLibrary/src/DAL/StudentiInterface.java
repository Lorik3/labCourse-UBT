
package DAL;

/**
 *
 * @author Ylli
 */
import BLL.Studenti;
import java.util.List;


public interface StudentiInterface {
    void create(Studenti s) throws eLibraryException;
    void edit(Studenti s) throws eLibraryException;
    void delete(Studenti s) throws eLibraryException;
    
    List<Studenti> findAll() throws eLibraryException;
    Studenti findByID(Integer ID) throws eLibraryException;
}
