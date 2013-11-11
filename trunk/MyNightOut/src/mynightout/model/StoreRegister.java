/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.model;

/**
 *
 * @author Mustaine
 */
public class StoreRegister {
    
    private String DesiredUsername;
    private String DesiredPassword;
    private String CompanyName;
    private String Street;
    private String Postcode;
    private String Telephone1;
    private String Telephone2;
    private String Mobile;
    private String Fax;
    private String Email;

    public String getDesiredUsername() {
        return DesiredUsername;
    }

    public void setDesiredUsername(String DesiredUsername) {
        this.DesiredUsername = DesiredUsername;
    }

    public String getDesiredPassword() {
        return DesiredPassword;
    }

    public void setDesiredPassword(String DesiredPassword) {
        this.DesiredPassword = DesiredPassword;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public String getTelephone1() {
        return Telephone1;
    }

    public void setTelephone1(String Telephone1) {
        this.Telephone1 = Telephone1;
    }

    public String getTelephone2() {
        return Telephone2;
    }

    public void setTelephone2(String Telephone2) {
        this.Telephone2 = Telephone2;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
        
}
