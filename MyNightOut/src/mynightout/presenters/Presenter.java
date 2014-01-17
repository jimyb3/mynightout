/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.presenters;

import javax.swing.JOptionPane;
import mynightout.controllers.EmailSenderController;
import mynightout.ui.ContactAdminForm;
import mynightout.ui.IContactAdminForm;
import mynightout.ui.StoreRegisterForm;

/**
 *
 * @author Mustaine
 */
public class Presenter implements IPresenter{
    
    
    
  /**
 *
 * @author panos
 */
    
    
    
     @Override
    public void sendHelp(ContactAdminForm form, String msgtosend){
         String userMessage=msgtosend;
         String subMessage="Απορία/Παράπονα Χρήστη";
        
        String to = "mynightoutdevelopers@gmail.com";
        
        try{
            
        if(EmailSenderController.sendMail("mynightouttest@gmail.com", "dge457hdw3", userMessage, to, subMessage )){
            System.out.println("Επιτυχής Αποστολή!");
            JOptionPane.showMessageDialog(null, "Επιτυχής αποστολή ", "Success",JOptionPane.INFORMATION_MESSAGE);
          }
        }catch (Exception e){
        
            System.out.println("Παρουσιάστηκε κάποιο πρόβλημα.");
            JOptionPane.showMessageDialog(null, e.getMessage(), "Failure", JOptionPane.INFORMATION_MESSAGE);
                                  
        }
        
        
    }
    
  
    
    /**
 *
 * @author Mustaine
 */
    
    
    
    @Override
    public void sendEmail(StoreRegisterForm form, String DesiredUsername, String DesiredPassword,
            String CompanyName, String Street, String Postcode, String Telephone1, String Telephone2,
            String Mobile, String Fax, String Email){
        
        
        
        
        String userMessage="Επιθυμητό Όνομα Χρήστη: "+DesiredUsername+"\n"+"Επιθυμητός Kωδικός Xρήστη: "+DesiredPassword+"\n"+"Επωνυμία Εταιρείας: "+CompanyName+"\n"
                +"Διεύθυνση Εταιρείας: "+Street+"\n"+"Ταχυδρομικός Κώδικας: "+Postcode+"\n"+"Τηλέφωνο 1: "+Telephone1+"\n"+"Τηλέφωνο 2: "+Telephone2+"\n"
                +"Mobile: "+Mobile+"\n"+"fax: "+Fax+"\n"+"Email: "+Email;
        
        String subMessage="Δήλωση Νέου Καταστήματος";
        
        String to = "mynightoutdevelopers@gmail.com";
        
        try{
            
        if(EmailSenderController.sendMail("mynightouttest@gmail.com", "dge457hdw3", userMessage, to, subMessage))
        {
            System.out.println("Επιτυχής Αποστολή!");
            JOptionPane.showMessageDialog(null, "Επιτυχής αποστολή ", "Success",JOptionPane.INFORMATION_MESSAGE);
        }
        
               
        } catch (Exception e){
            
            System.out.println("Παρουσιάστηκε κάποιο πρόβλημα.");
            JOptionPane.showMessageDialog(null, e.getMessage(), "Failure", JOptionPane.INFORMATION_MESSAGE);
           
            
        }
        }
            
        }

   
  
    
    
    

