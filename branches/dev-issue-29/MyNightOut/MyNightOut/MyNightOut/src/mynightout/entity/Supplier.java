/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.entity;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ioanna
 */
public class Supplier implements java.io.Serializable{
    private int supplierId;
    private String firstName;
    private String lastName;
    private String companyName;
    private String address;    
    private String cellPhoneNumber;
    private String officePhoneNumber;
    private String emailAddress;
    private Set<Nightclub> nightclub = new HashSet<Nightclub>(0);

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    

   
    
    
}
