/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.UserDao;
import mynightout.entity.User;

/**
 *
 * @author ioanna
 */
public class EditUserInformationController {

    //private String currentUserName;
    //  public EditUserInformationController(String cUserName) {
    //    currentUserName = cUserName;
    //}
    public User getUserInfo(String currentUserName) {
        try {
            UserDao currentUser = new UserDao();
            User user = currentUser.getUserDataByUsername(currentUserName);
            return user;
        } catch (Exception e) {
            throw new IllegalArgumentException("Πρόβλημα στην βάση");
        }
    }

    public User saveChanges(String userName, String password, String customerName,
            String customerLastname, String telephoneNum, String email) {
        try {
            UserDao currentUser = new UserDao();
            User user = currentUser.updateUserData(userName, password, customerName, customerLastname, telephoneNum, email);
            return user;
        } catch (Exception e) {
            throw new IllegalArgumentException("Πρόβλημα στην βάση");
        }

    }
}
