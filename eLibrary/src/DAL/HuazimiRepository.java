/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Huazimi;
import BLL.Libri;
import DAL.eLibraryException;
import DAL.EntMngClass;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */

public class HuazimiRepository extends EntMngClass implements HuazimiInterface{
    

    public void create(Huazimi a) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }


    public void edit(Huazimi a) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }


    public void delete(Huazimi a) throws eLibraryException {
        try {
            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }


    public List<Huazimi> findAll() throws eLibraryException {
        try{
             return em.createNamedQuery("Huazimi.findAll").getResultList();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }
    
    public List<Libri> findAllLibrat() throws eLibraryException {
        try{
             return em.createNamedQuery("Libri.findAll").getResultList();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }


    public Huazimi findByID(Integer id) throws eLibraryException {
        try{
             return (Huazimi) em.createNamedQuery("Huazimi.findByHuazimiId").setParameter("huazimiId", id).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }
    //Libri.findByTitulli
    public Libri findLibriByTitulli(String id) throws eLibraryException {
        try{
             return (Libri) em.createNamedQuery("Libri.findByTitulli").setParameter("titulli", id).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }
    
    public Libri findLibriByID(Integer id) throws eLibraryException {
        try{
             return (Libri) em.createNamedQuery("Libri.findByLibriId").setParameter("libriId", id).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }


    public Huazimi findByDataHuazimit(Date date) throws eLibraryException {
        try{
             return (Huazimi) em.createNamedQuery("Huazimi.findByDataEHuazimit").setParameter("dataERikthimit", date).getSingleResult();
        }catch(Exception e){
            throw new eLibraryException(e.getMessage());
        }
    }

    @Override
    public void delte(Huazimi h) throws eLibraryException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Huazimi findbyID(Integer ID) throws eLibraryException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
} 
