/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.ISupplierDaoEdit;
import mynightout.entity.Reservation;
import mynightout.exceptions.DaoException;
import mynightout.model.Supplier;

/**
 *
 * @author Maria
 */
public class EditSupplierController {
    private ISupplierDaoEdit supplierDao;

    public EditSupplierController(ISupplierDaoEdit supplierDao) {
        this.supplierDao = supplierDao;

    }

    @SuppressWarnings("empty-statement")
    public Supplier editReservation(String firstName, String lastName, String companyName, String address, int  cellPhoneNumber, int officePhoneNumber, String email)
     throws IllegalArgumentException, DaoException { 
       
        
        if (firstName.length() < 4) {
            throw new IllegalArgumentException("Το όνομα πρέπει να έχει τουλάχιστον 4 γράμματα ");
            // TODO 
        }
        try {
            return supplierDao.selectSupplier(firstName,lastName,companyName, address,cellPhoneNumber,officePhoneNumber,email);
        } catch (DaoException e) {
            throw e;
        }
  
        
        
        
}
}