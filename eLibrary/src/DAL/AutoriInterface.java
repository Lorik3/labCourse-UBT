/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Autori;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface AutoriInterface {
    public void create(Autori a) throws eLibraryException;
    public void edit(Autori a) throws eLibraryException;
    public void delete(Autori a) throws eLibraryException;
    List<Autori> findAll() throws eLibraryException;
    Autori findByID(Integer id) throws eLibraryException;
    Autori findByName(String name) throws eLibraryException;
    
}
