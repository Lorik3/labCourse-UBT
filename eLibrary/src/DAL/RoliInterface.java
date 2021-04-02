/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.RoliL;
import java.util.List;

/**
 *
 * @author Ylli
 */
public interface RoliInterface {
    void create(RoliL s) throws eLibraryException;
    void edit(RoliL s) throws eLibraryException;
    void delete(RoliL s) throws eLibraryException;
    
    List<RoliL> findAll() throws eLibraryException;
    RoliL findByID(Integer ID) throws eLibraryException;
}
