/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Rezervo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */

public class RezervoRepository extends EntMngClass implements RezervoInterface{
    

    public void create(Rezervo a) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }


    public void edit(Rezervo a) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception: - " + e.getMessage());
        }
    }


    public void delete(Rezervo a) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }


    public List<Rezervo> findAll() throws eLibraryException {
        try{
             return em.createNamedQuery("Rezervo.findAll").getResultList();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }
    
    public List<Rezervo> findAllLibrat() throws eLibraryException {
        try{
             return em.createNamedQuery("Rezervo.findAll").getResultList();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }


    public Rezervo findByID(Integer id) throws eLibraryException {
        try{
             return (Rezervo) em.createNamedQuery("Rezervo.findByRezervoId").setParameter("huazimiId", id).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }
    //Rezervo.findByEmri
    public Rezervo findRezervoByEmri(String id) throws eLibraryException {
        try{
             return (Rezervo) em.createNamedQuery("Rezervo.findByEmri").setParameter("emri", id).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }
    
    public Rezervo findRezervoByID(Integer id) throws eLibraryException {
        try{
             return (Rezervo) em.createNamedQuery("Rezervo.findByRezervoId").setParameter("rezervoId", id).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }


    public Rezervo findByDataRezervot(Date date) throws eLibraryException {
        try{
             return (Rezervo) em.createNamedQuery("Rezervo.findByDataERezervot").setParameter("dataERikthimit", date).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }

    @Override
    public void delte(Rezervo h) throws eLibraryException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rezervo findbyID(Integer ID) throws eLibraryException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
} 
