/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.presenters;


import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import mynightout.ui.DeleteReservationForm;
import static org.uispec4j.interception.FileChooserHandler.init;

/**
 *
 * @author Maria
 */
public class DeleteReservationPresenter  {
    
public void deleteReservation(DeleteReservationForm form){ 
  
    
    final Container pane =form.getContentPane();
     final JLabel[] label = new JLabel[11];
        final JRadioButton[] radioButton = new JRadioButton[11];
        JPanel[] p = new JPanel[13];
        int x = 40;
       
        
        for (int i = 1; i <= 10; i++) {
          radioButton[i] = new JRadioButton("Κράτηση" + i);
            p[i] = new JPanel();
            p[i].add(radioButton[i]);
            p[i].setSize(120, 30);
            p[i].setLocation(0, x);
            x = x + 40;
            pane.add(p[i]);
        }
   
   JButton button = new JButton("Επιλογή");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int x=40;
                JPanel[] p2 = new JPanel[12];
                for (int i = 1; i <= 10; i++) {
                    
                    if (radioButton[i].isSelected()) {
                        label[i] = new JLabel();
                        label[i].setText(radioButton[i].getText());
                        p2[i] = new JPanel();
                        p2[i].add(label[i]);
                        p2[i].setSize(120, 30);
                        p2[i].setLocation(250, x);
                        x=x+40;
                        pane.add(p2[i]);   
                    }
                    
                }
         //       JOptionPane.showMessageDialog(null, "Οι προμηθευτές που επέλεξες αποθηκεύθηκαν.Για να τους δεις,παρακαλω επεκτινε το παραθυρο", "Success",JOptionPane.INFORMATION_MESSAGE);
              
        
            
            }
       
           
 
        });
        p[12]=new JPanel();
        p[12].add(button);
        p[12].setSize(151,42);
        p[12].setLocation(450, 30);
        pane.add(p[12]);
        form.setSize(650, 500);   
   
     
     
 
 }  

    private void add(JScrollPane scrPane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   

   
}
