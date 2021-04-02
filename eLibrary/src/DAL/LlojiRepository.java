/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Lloji;
import BLL.Lloji;
import DAL.EntMngClass;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */

public class LlojiRepository extends EntMngClass implements LlojiInterface{
    

    public void create(Lloji a) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }


    public void edit(Lloji a) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception: - " + e.getMessage());
        }
    }


    public void delete(Lloji a) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }


    public List<Lloji> findAll() throws eLibraryException {
        try{
             return em.createNamedQuery("Lloji.findAll").getResultList();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }
    
    public List<Lloji> findAllLibrat() throws eLibraryException {
        try{
             return em.createNamedQuery("Lloji.findAll").getResultList();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }


    public Lloji findByID(Integer id) throws eLibraryException {
        try{
             return (Lloji) em.createNamedQuery("Lloji.findByLlojiId").setParameter("huazimiId", id).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }
    //Lloji.findByEmri
    public Lloji findLlojiByEmri(String id) throws eLibraryException {
        try{
             return (Lloji) em.createNamedQuery("Lloji.findByEmri").setParameter("emri", id).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }
    
    public Lloji findLlojiByID(Integer id) throws eLibraryException {
        try{
             return (Lloji) em.createNamedQuery("Lloji.findByLlojiId").setParameter("llojiId", id).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }


    public Lloji findByDataLlojit(Date date) throws eLibraryException {
        try{
             return (Lloji) em.createNamedQuery("Lloji.findByDataELlojit").setParameter("dataERikthimit", date).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }

    @Override
    public void delte(Lloji h) throws eLibraryException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Lloji findbyID(Integer ID) throws eLibraryException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
} 
