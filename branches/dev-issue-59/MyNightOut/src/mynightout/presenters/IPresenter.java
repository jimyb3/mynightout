/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.presenters;

import mynightout.ui.IContactAdminForm;
import mynightout.ui.IStoreRegisterForm;
import mynightout.ui.StoreRegisterForm;

/**
 *
 * @author Mustaine
 */
public interface IPresenter {
   // public void storeregister(IStoreRegisterForm form, String DesiredUsername, String DesiredPassword,
   //         String CompanyName, String Street, String Postcode, String Telephone1, String Telephone2,
   //         String Mobile, String Fax, String Email);
    //
     public void sendHelp(IContactAdminForm form, String msgtosend);
     
     public void sendEmail(StoreRegisterForm form, String DesiredUsername, String DesiredPassword,
            String CompanyName, String Street, String Postcode, String Telephone1, String Telephone2,
            String Mobile, String Fax, String Email);
    
}
