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
import BLL.Huazimi;
import DAL.eLibraryException;

public interface HuazimiInterface {
    void create (Huazimi h ) throws eLibraryException;
    void edit (Huazimi h ) throws eLibraryException;
    void delte (Huazimi h) throws eLibraryException;
    List <Huazimi> findAll() throws eLibraryException;
    Huazimi findbyID (Integer ID) throws eLibraryException;
    
}
