/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Libri;
import static BLL.Libri_.libriId;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author erzah
 */
public class LibriRepository extends EntMngClass implements LibriInterface{

    @Override
    public void create(Libri l) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.persist(l);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public void edit(Libri l) throws eLibraryException {
              try{
            em.getTransaction().begin();
            em.merge(l);
            em.getTransaction().commit();
            
            
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public void delete(Libri l) throws eLibraryException {
          try{
            em.getTransaction().begin();
            em.remove(l);
            em.getTransaction().commit();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
                    
        }
    }

    @Override
    public List<Libri> findAll() throws eLibraryException {
        try{
            return em.createNamedQuery("Libri.findAll").getResultList();
        }catch(Exception ex){
            throw new eLibraryException("msg \n"+ ex.getMessage());
        }
    }

    @Override
    public Libri findByID(Integer ID) throws eLibraryException {
       Query query = em.createQuery("SELECT s FROM Libri l WHERE l.libriId = :libriId");
        Object studentId = null;
       query.setParameter("libriId", libriId);
       try{
           return (Libri)query.getSingleResult();
       }catch(NoResultException nre){
           throw new eLibraryException("E dhëna nuk egziston!");
       }
    }
    }
    

