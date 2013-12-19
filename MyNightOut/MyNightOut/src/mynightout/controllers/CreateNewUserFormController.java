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
public class CreateNewUserFormController {

    public User createUser(String userName, String passWord, String customerName, String customerLastname, String telephoneNum, String emailAddress) {
        if (userName.isEmpty() || passWord.isEmpty() || customerName.isEmpty() || customerLastname.isEmpty() || telephoneNum.isEmpty() || emailAddress.isEmpty()) {
            throw new IllegalArgumentException("Έχετε κενά πεδία");
        }
        for (int i = 0; i < telephoneNum.length(); i++) {
            if (!Character.isDigit(telephoneNum.charAt(i))) {
                throw new IllegalArgumentException("Παρακαλώ εισάγετε μόνο αριθμούς στο πεδίο \"Αριθμός τηλεφώνου\"");
            }
        }
        EmailValidator validator = new EmailValidator();
        if (!validator.validate(emailAddress)) {
            throw new IllegalArgumentException("Παρακαλώ ελέγξτε το email που εισάγατε");
        }

        try {
            UserDao currentUser = new UserDao();
            User user = currentUser.insertNewUserData(userName, passWord, customerName, customerLastname, telephoneNum, emailAddress);
            return user;
        } catch (Exception e) {
            throw new IllegalArgumentException("Παρακαλώ , ελέγξτε τα δεδομένα που εισάγατε");
        }

    }
}
