/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.presenters;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import mynightout.ui.CancelBookForm;
import mynightout.ui.SelectTableForm;

/**
 *
 * @author Dimitris
 */
public class SelectTablePresenter {
    

    public void createSelectTable(SelectTableForm form, int row1, int row2, int row3, int row4) {
        /**hack Να κάνω αλλαγή του ονόματος της συναρτησης όπως επίσης να προσθέσω στο τέλος
         * κώδικα για επιβεβαίωση της κάτοψης από τον καταστηματαρχη, να αφαιρεθεί ο κώδικας
         * από τα κουμπιά.
        */
        
        JPanel p1 = new JPanel();
        Container pane = form.getContentPane();
        int tableNumber = row1 + row2 + row3 + row4 + 1;
        JButton[] table = new JButton[tableNumber];
        String imagePath="/images/1236721_44678719210121_1766361339_n.jpg";
        URL url =getClass().getResource(imagePath);
        
        ImageIcon icon=new ImageIcon(url);
        /**hack Να αντικατασταθεί ο κωδικας από τα κουμπιά με κώδικα που θα επιτρέπει
         * την αλλαγή των θέσεων.
         */
        int count = 1;
        for (int i = 1; i <= row1; i++) {
            table[count] = new JButton("A" + i);
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
            if(i==2 || i==4){
                imagePath="/images/1236721_44678719210121_1766361339_n.jpg";
                url =getClass().getResource(imagePath);
                
                icon=new ImageIcon(url);
            }else{
                imagePath="/images/164217_10151537190287697_1858435540_n.jpg";
                url =getClass().getResource(imagePath);
                
                icon=new ImageIcon(url);
            }
            table[count].setIcon(icon);
            table[count].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                    
                    CancelBookForm cbf = new CancelBookForm();
                    cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                    cbf.setVisible(true);
                }
            });

            p1.add(table[count]);

            count = count + 1;
        }
        
        JPanel p2 = new JPanel();
        for (int i = 1; i <= row2; i++) {
            table[count] = new JButton("B" + i);
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());
            if(i==1 || i==2){
                imagePath="/images/1236721_44678719210121_1766361339_n.jpg";
                url =getClass().getResource(imagePath);
                
                icon=new ImageIcon(url);
            }else{
                imagePath="/images/164217_10151537190287697_1858435540_n.jpg";
                url =getClass().getResource(imagePath);
                
                icon=new ImageIcon(url);
            }
            table[count].setIcon(icon);
            table[count].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String table = evt.getActionCommand();
                    
                    CancelBookForm cbf = new CancelBookForm();
                    cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                    cbf.setVisible(true);
                }
            });
            p2.add(table[count]);

            count = count + 1;
        }
        
        JPanel p3 = new JPanel();
        for (int i = 1; i <= row3; i++) {
            table[count] = new JButton("Γ" + i);
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());
            if(i==2 || i==3){
                imagePath="/images/1236721_44678719210121_1766361339_n.jpg";
                url =getClass().getResource(imagePath);
                
                icon=new ImageIcon(url);
            }else{
                imagePath="/images/164217_10151537190287697_1858435540_n.jpg";
                url =getClass().getResource(imagePath);
                
                icon=new ImageIcon(url);
            }
            table[count].setIcon(icon);
            table[count].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String table = evt.getActionCommand();
                    
                    CancelBookForm cbf = new CancelBookForm();
                    cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                    cbf.setVisible(true);
                }
            });

            p3.add(table[count]);

            count = count + 1;
        }
/*
        JPanel p4 = new JPanel();
        for (int i = 1; i <= row4; i++) {
            table[count] = new JButton("Δ" + i);
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
            table[count].setIcon(icon);
            table[count].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                    //JOptionPane.showMessageDialog(new JFrame(), "Διάλεξες για κράτηση το " + table);
                    CancelBookForm cbf = new CancelBookForm();
                    cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                    cbf.setVisible(true);
                }
            });

            p4.add(table[count]);

            count = count + 1;
        }
*/
        p1.setSize(250 * row1, 120);
        p2.setSize(250 * row2, 120);
        p3.setSize(250 * row3, 120);
       // p4.setSize(table[row4].getWidth() * row4, 120);
        pane.add(p1);
        pane.add(p2);
        pane.add(p3);
       // pane.add(p4);
        p1.setLocation(0, 0);
        p2.setLocation(0, 130);
        p3.setLocation(0, 260);
        //p4.setLocation(0, 390);
        
        /**hack να βρίσκει ποια σειρά από τραπέζια έχει τα περισσότερα τραπέζια και
         * και να ορίζει αυτή στην εντολή για το μέγεθος του παραθύρου
         * setSize(maxRow*120,500)
         */
        
        /**hack να βρίσκει με βάση τις σειρές από τραπέζια ποιο θα ήταν το ιδανικό ύψος 
         * του παραθύρου ώστε να το ορίζει στην εντολή setSize(maxRow*120,numberRow*50)
         */
        
       
        
        form.setSize(1500, 500);
        form.setVisible(true);
    }
}
