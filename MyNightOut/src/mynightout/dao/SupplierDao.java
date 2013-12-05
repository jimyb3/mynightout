/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.model.Supplier;


/**
 *
 * @author Maria
 */
public class SupplierDao implements ISupplierDao{
  
    @Override   
    public Supplier selectSupplier(String firstName, String lastName, String companyName, String address, int  cellPhoneNumber, int officePhoneNumber, String email) throws DaoException{
    return new Supplier(firstName,lastName,companyName,address,cellPhoneNumber,officePhoneNumber,email);
    }
    
    
}
