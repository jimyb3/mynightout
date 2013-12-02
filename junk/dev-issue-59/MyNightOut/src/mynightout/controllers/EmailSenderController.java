/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Mustaine
 * Δημιουργία Controller ο οποίος αναλαμβάνει την άμεση
 * αποστολή αίτησης νέου καταστήματος μέσω email.
 */

public class EmailSenderController {
    
    public static boolean sendMail(String from, String password, String message, String to){
        String host = "smtp.gmail.com";
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.auth", "true");
        
        Session session = Session.getDefaultInstance(props, null);
        MimeMessage mimeMessage = new MimeMessage(session);
        
        try{
            mimeMessage.setFrom(new InternetAddress(from));
            InternetAddress toAddress = new InternetAddress(to);
       
            
            
            mimeMessage.addRecipient(RecipientType.TO, toAddress);
            
           //Προσθήκη Θέματος.
           mimeMessage.setSubject("Δήλωση Νέου Καταστήματος");
           
           //Προσθήκη Μηνύματος.
           mimeMessage.setText(message);
           
           Transport transport = session.getTransport("smtp");
           transport.connect(host, from, password);
           transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
           transport.close();
           
           return true;                  
        }
        catch(MessagingException me){
            me.printStackTrace();            
        }            
        return false;
    }
    
}
