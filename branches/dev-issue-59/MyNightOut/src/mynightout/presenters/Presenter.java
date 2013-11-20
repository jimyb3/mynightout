/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.presenters;

import mynightout.controllers.EmailSenderController;
import mynightout.ui.IContactAdminForm;
import mynightout.ui.StoreRegisterForm;

/**
 *
 * @author Mustaine
 */
public class Presenter implements IPresenter{
    /*@Override
    public void storeregister(IStoreRegisterForm form, String DesiredUsername, String DesiredPassword,
            String CompanyName, String Street, String Postcode, String Telephone1, String Telephone2,
            String Mobile, String Fax, String Email){
        
        if(DesiredUsername.equalsIgnoreCase(DesiredPassword)){
            //TO DO: Αποστολή στοιχείων με e-mail.
            
            form.display("Επιτυχής Αποστολή!");
            
        }
        else{
            form.display("Αποτυχία Αποστολής!");
        }
        
        
    }*/
    
    
     @Override
    public void sendHelp(IContactAdminForm form, String msgtosend){
        
        
    }
    
    @Override
    public void sendEmail(StoreRegisterForm form, String DesiredUsername, String DesiredPassword,
            String CompanyName, String Street, String Postcode, String Telephone1, String Telephone2,
            String Mobile, String Fax, String Email){
        String userMessage="Επιθυμητό Όνομα Χρήστη: "+DesiredUsername+"\n"+"Επιθυμητός Kωδικός Xρήστη: "+DesiredPassword+"\n"+"Επωνυμία Εταιρείας: "+CompanyName+"\n"
                +"Διεύθυνση Εταιρείας: "+Street+"\n"+"Ταχυδρομικός Κώδικας: "+Postcode+"\n"+"Τηλέφωνο 1: "+Telephone1+"\n"+"Τηλέφωνο 2: "+Telephone2+"\n"
                +"Mobile: "+Mobile+"\n"+"fax: "+Fax+"\n"+"Email: "+Email;
        
        String to = "mynightoutdevelopers@gmail.com";
        
        if(EmailSenderController.sendMail("mynightouttest@gmail.com", "dge457hdw3", userMessage, to)){
            System.out.println("Επιτυχής Αποστολή!");
            form.display("Επιτυχής Αποστολή!");
        }
        else{
            System.out.println("Παρουσιάστηκε κάποιο πρόβλημα.");
            form.display("Παρουσιάστηκε κάποιο πρόβλημα, ξαναπροσπαθήστε.");
        }
        
            
        }

   // @Override
   // public void storeregister(IStoreRegisterForm form, String DesiredUsername, String DesiredPassword, String CompanyName, String Street, String Postcode, String Telephone1, String Telephone2, String Mobile, String Fax, String Email) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }

    //@Override
   //  @Override
   // public void sendEmail(StoreRegisterForm form, String DesiredUsername, String DesiredPassword,
    //        String CompanyName, String Street, String Postcode, String Telephone1, String Telephone2,
     //       String Mobile, String Fax, String Email) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }
        
        
    }
    
    

