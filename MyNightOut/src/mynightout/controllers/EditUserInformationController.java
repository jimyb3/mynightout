/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.UserDao;
import mynightout.entity.User;
import mynightout.util.EmailValidator;

/**
 *
 * @author ioanna
 */
public class EditUserInformationController {

    //private String currentUserName;
    //  public EditUserInformationController(String cUserName) {
    //    currentUserName = cUserName;
    //}
   

    public User saveChanges(String userName, String password, String customerName,
            String customerLastname, String telephoneNum, String email) {
        
        if (userName.isEmpty() || password.isEmpty() || customerName.isEmpty() || customerLastname.isEmpty() || telephoneNum.isEmpty() || email.isEmpty()) {
            throw new IllegalArgumentException("Έχετε κενά πεδία");
        }
        
        if (userName.length()<4) {
            throw new IllegalArgumentException("Το Username που επιλεξατε ειναι πολυ μικρο");
        }
        else if(userName.length()>15){
            throw new IllegalArgumentException("Το Username που επιλεξατε ειναι πολυ μεγαλο");
        }        
        else if(password.length()<4){
            throw new IllegalArgumentException("Το Password που επιλεξατε ειναι πολυ μικρο");
        }
        else if(password.length()>15 ) {
            throw new IllegalArgumentException("Το Password που επιλεξατε ειναι πολυ μεγαλο");
        }        
        else if(customerName.length()<4){
            throw new IllegalArgumentException("Το Όνομα που επιλεξατε ειναι πολυ μικρο");
        }
        else if(customerName.length()>30) {
            throw new IllegalArgumentException("Το Όνομα που επιλεξατε ειναι πολυ μεγαλο");
        }        
        else if(customerLastname.length()<4){
            throw new IllegalArgumentException("Το Επώνυμο που επιλεξατε ειναι πολυ μικρο");
        }
        else if(customerLastname.length()>30) {
            throw new IllegalArgumentException("Το Επώνυμο που επιλεξατε ειναι πολυ μεγαλο");
        }        
        else if(telephoneNum.length()<10){
            throw new IllegalArgumentException("Το Τηλέφωνο που επιλεξατε ειναι πολυ μικρο");
        }
        else if(telephoneNum.length()>10) {
            throw new IllegalArgumentException("Το Τηλέφωνο που επιλεξατε ειναι πολυ μεγαλο");
        }        
        else if(email.length()<6){
            throw new IllegalArgumentException("Το E-mail που επιλεξατε ειναι πολυ μικρο");
        }
        else if(email.length()>40) {
            throw new IllegalArgumentException("Το E-mail που επιλεξατε ειναι πολυ μεγαλο");
        }
        for (int i = 0; i < telephoneNum.length(); i++) {
            if (!Character.isDigit(telephoneNum.charAt(i))) {
                throw new IllegalArgumentException("Παρακαλώ εισάγετε μόνο αριθμούς στο πεδίο \"Αριθμός τηλεφώνου\"");
            }
        }
        EmailValidator validator = new EmailValidator();
        if (!validator.validate(email)) {
            throw new IllegalArgumentException("Παρακαλώ ελέγξτε το email που εισάγατε");
        }
        try {
            UserDao currentUser = new UserDao();
            User user = currentUser.updateUserData(userName, password, customerName, customerLastname, telephoneNum, email);
            return user;
        } catch (Exception e) {
            throw new IllegalArgumentException("Πρόβλημα στην βάση, ελέγξτε τα δεδομένα που εισάγατε");
        }

    }
}
