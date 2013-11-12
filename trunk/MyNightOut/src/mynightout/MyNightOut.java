/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout;

import javax.swing.JFrame;
import mynightout.ui.MainFrame;

/**
 *  Εδώ είναι η main του προγράμματος, που φτιάχνει το αρχικό 
 * παράθυρο του προγράμματος
 * @author Dimitris
 */
public class MyNightOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame mainFrame=new MainFrame();
        mainFrame.setVisible(true);     
    }
    
}
