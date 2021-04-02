/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author lorik
 */
import java.util.List;
import BLL.Rezervo;


public interface RezervoInterface {
    void create (Rezervo h ) throws eLibraryException;
    void edit (Rezervo h ) throws eLibraryException;
    void delte (Rezervo h) throws eLibraryException;
    List <Rezervo> findAll() throws eLibraryException;
    Rezervo findbyID (Integer ID) throws eLibraryException;
    
}
