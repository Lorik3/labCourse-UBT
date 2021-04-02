/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Libri;
import java.util.List;

/**
 *
 * @author erzah
 */
public interface LibriInterface {
    void create(Libri l) throws eLibraryException;
    void edit(Libri l) throws eLibraryException;
    void delete(Libri l) throws eLibraryException;
    
    List<Libri> findAll() throws eLibraryException;
    Libri findByID(Integer ID) throws eLibraryException;
}

    

