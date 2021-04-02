
package DAL;

/**
 *
 * @author Ylli
 */


import BLL.Perdorusi;
import java.util.List;

public interface UserInterface {
    
    void create(Perdorusi p) throws eLibraryException;
    void edit(Perdorusi p) throws eLibraryException;
    void delete(Perdorusi p) throws eLibraryException;
    
    List<Perdorusi> findAll() throws eLibraryException;
    Perdorusi findByID(Integer ID )  throws eLibraryException;
    
}
