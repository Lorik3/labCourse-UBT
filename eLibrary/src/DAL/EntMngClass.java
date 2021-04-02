
package DAL;

/**
 * // na mundeson me i mar te dhenat prej databazes
 * @author Ylli
 */
import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public abstract class EntMngClass {
    
    EntityManager em = Persistence.createEntityManagerFactory("eLibraryPU").createEntityManager();
    
}
