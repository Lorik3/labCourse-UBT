/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.RoliL;
import static BLL.RoliL_.roliId;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;



/**
 *
 * @author Ylli
 */
public class RoliRepository extends EntMngClass implements RoliInterface{

    @Override
    public void create(RoliL r) throws eLibraryException {
         try {
            em.getTransaction().begin();
            em.persist(r);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public void edit(RoliL r) throws eLibraryException {
        try{
            em.getTransaction().begin();
            em.merge(r);
            em.getTransaction().commit();
            
            
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public void delete(RoliL r) throws eLibraryException {
        try{
            em.getTransaction().begin();
            em.remove(r);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
                    
        }
    }

    @Override
    public List<RoliL> findAll() throws eLibraryException {
        try{
            return em.createNamedQuery("RoliL.findAll").getResultList();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
   
       public RoliL findByID(Integer ID) throws eLibraryException {
       Query query = em.createQuery("SELECT r FROM RoliL r WHERE r.roliId = :roliId");
       query.setParameter("roliId", roliId);
       try{
           return (RoliL)query.getSingleResult();
       }catch(NoResultException nre){
           throw new eLibraryException("E dhëna nuk egziston!");
       }
    }
    }


