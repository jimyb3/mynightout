/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

/**
 *
 * @author Mustaine
 */
public class StoreRegisterController {
    
    public void sendNewRegister(String DesiredUsername, 
   String DesiredPassword, String CompanyName, String Street, String Postcode, int Telephone1, int Telephone2, int Mobile, int Fax, String Email)
        
        throws IllegalArgumentException {
        if(DesiredUsername.length() < 4){
            throw new IllegalArgumentException("Username must be at least six characters/numbers long.");
        }
        if(DesiredPassword.length() < 6){
            throw new IllegalArgumentException("Password must be at least six characters/numbers long.");
        }
       
    }
    
            
}
