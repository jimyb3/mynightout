/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.model;

/**
 *
 * @author Maria
 */
public class Supplier {
    private String firstName;
    private String lastName;
    private String companyName;
    private String address;
    private int cellPhoneNumber;
    private int officePhoneNumber;
    private String email;
    private boolean showSupplierSuccessful;

    public Supplier(String firstName, String lastName, String companyName, String address, int cellPhoneNumber, int officePhoneNumber, String email) {
    this.firstName =firstName;
    this.lastName = lastName;
    this.companyName=companyName;
    this.address= address;
    this.cellPhoneNumber= cellPhoneNumber;
    this.officePhoneNumber= officePhoneNumber;
    this.email=email;
       
    }

   

   
  
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(int cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public int getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public void setOfficePhoneNumber(int officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setShowSupplierSuccessful(boolean cancelSuccessful) {
         this.showSupplierSuccessful= cancelSuccessful;
    }

}
