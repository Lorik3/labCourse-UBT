
package DAL;

/**
 *
 * @author Ylli
 */

import BLL.Perdorusi;
import static BLL.Perdorusi_.usersid;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;


public class UserRepository extends EntMngClass implements UserInterface {

    @Override
    public void create(Perdorusi p) throws eLibraryException {
        try{
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        }catch(Exception ex){
            
            throw new eLibraryException("msg \n"+ ex.getMessage());
            
        }
    }

    @Override
    public void edit(Perdorusi p) throws eLibraryException {
        try{
            em.getTransaction().begin();
            em.merge(p);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public void delete(Perdorusi p) throws eLibraryException {
        try{
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public List<Perdorusi> findAll() throws eLibraryException {
       try{
           return em.createNamedQuery("Perdorusi.findAll").getResultList();
           
       }catch(Exception ex){
           throw new eLibraryException("msg \n"+ ex.getMessage());
       }
    }

    @Override
    public Perdorusi findByID(Integer ID) throws eLibraryException {
       Query query = em.createQuery("SELECT p FROM Perdorusi p WHERE p.usersid = :usersid");
       query.setParameter("usersid", usersid);
       try{
           return (Perdorusi)query.getSingleResult();
       }catch(NoResultException nre){
           throw new eLibraryException("E dhëna nuk egziston!");
       }
    }
    
 public Perdorusi loginByUsernameAndPassword(String u, String p) throws eLibraryException {
        try {
            Query query = em.createQuery("SELECT p FROM Perdorusi p WHERE p.username = :us AND p.password=:psw");
            query.setParameter("us", u);
            query.setParameter("psw", p);
            return (Perdorusi) query.getSingleResult();
        } catch (Exception e) {
            throw new eLibraryException("Msg! \n" + e.getMessage());
        }
  }
  }
