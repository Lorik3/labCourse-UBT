
package DAL;

/**
 *
 * @author Ylli
 */
import java.util.List;
import BLL.Studenti;
import static BLL.Studenti_.studentId;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class StudentiRepository extends EntMngClass implements StudentiInterface{

    @Override
    public void create(Studenti s) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.persist(s);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public void edit(Studenti s) throws eLibraryException {
        try{
            em.getTransaction().begin();
            em.merge(s);
            em.getTransaction().commit();
            
            
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public void delete(Studenti s) throws eLibraryException {
        try{
            em.getTransaction().begin();
            em.remove(s);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
                    
        }
    }

    @Override
    public List<Studenti> findAll() throws eLibraryException {
        try{
            return em.createNamedQuery("Studenti.findAll").getResultList();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public Studenti findByID(Integer ID) throws eLibraryException {
       Query query = em.createQuery("SELECT s FROM Studenti s WHERE s.studentId = :studentId");
       query.setParameter("studentId", studentId);
       try{
           return (Studenti)query.getSingleResult();
       }catch(NoResultException nre){
           throw new eLibraryException("E dhëna nuk egziston!");
       }
    }
    
}
    
    
