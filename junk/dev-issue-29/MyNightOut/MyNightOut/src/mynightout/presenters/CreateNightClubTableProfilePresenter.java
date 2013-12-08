/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.presenters;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mynightout.dao.TablesDao;
import mynightout.ui.TableProfileForm;

/**
 *
 * @author Dimitris
 */
public class CreateNightClubTableProfilePresenter {

    public void createNightClubTableProfile(TableProfileForm form, int row1, int row2, int row3, int row4, int row5, int row6, String nightClubName) {
        /**
         * hack Να κάνω αλλαγή του ονόματος της συναρτησης όπως επίσης να
         * προσθέσω στο τέλος κώδικα για επιβεβαίωση της κάτοψης από τον
         * καταστηματαρχη.
         */
        
        int max = Collections.max(Arrays.asList(row1, row2, row3, row4, row5, row6));
        JPanel p1 = new JPanel();
        form.jLabel2.setText(Integer.toString(row1));
        form.jLabel3.setText(Integer.toString(row2));
        form.jLabel4.setText(Integer.toString(row3));
        form.jLabel5.setText(Integer.toString(row4));
        form.jLabel6.setText(Integer.toString(row5));
        form.jLabel7.setText(Integer.toString(row6));
        form.jLabel8.setText(nightClubName);
        Container pane = form.getContentPane();
        int tableNumber = row1 + row2 + row3 + row4 + row5 + row6 + 1;
        JButton[] table = new JButton[tableNumber];
        String tablesImage = "/images/freeTable.png";
        URL url = getClass().getResource(tablesImage);
        
        ImageIcon icon = new ImageIcon(url);
        /**
         * hack Να αντικατασταθεί ο κωδικας από τα κουμπιά με κώδικα που θα
         * επιτρέπει την αλλαγή των θέσεων.
         */
        int count = 1;
        for (int i = 1; i <= row1; i++) {
            table[count] = new JButton("A" + i);
            table[count].setSize(120, 20);
            table[count].setIcon(icon);
            table[count].setOpaque(false);
            table[count].setBorderPainted(false);
            table[count].setContentAreaFilled(false);
            table[count].setFocusPainted(false); 
            p1.add(table[count]);
            count = count + 1;
        }

        JPanel p2 = new JPanel();

        for (int i = 1; i <= row2; i++) {
            table[count] = new JButton("B" + i);
            table[count].setSize(120, 20);
            table[count].setIcon(icon);
            table[count].setOpaque(false);
            table[count].setBorderPainted(false);
            table[count].setContentAreaFilled(false);
            table[count].setFocusPainted(false); 
            p2.add(table[count]);
            count = count + 1;
        }

        JPanel p3 = new JPanel();

        for (int i = 1; i <= row3; i++) {
            table[count] = new JButton("Γ" + i);
            table[count].setSize(120, 20);
            table[count].setIcon(icon);
            table[count].setOpaque(false);
            table[count].setBorderPainted(false);
            table[count].setContentAreaFilled(false);
            table[count].setFocusPainted(false); 
            p3.add(table[count]);
            count = count + 1;
        }

        JPanel p4 = new JPanel();

        for (int i = 1; i <= row4; i++) {
            table[count] = new JButton("Δ" + i);
            table[count].setSize(120, 20);
            table[count].setIcon(icon);
            table[count].setOpaque(false);
            table[count].setBorderPainted(false);
            table[count].setContentAreaFilled(false);
            table[count].setFocusPainted(false); 
            p4.add(table[count]);
            count = count + 1;
        }

        JPanel p5 = new JPanel();

        for (int i = 1; i <= row5; i++) {
            table[count] = new JButton("Ε" + i);
            table[count].setSize(120, 20);
            table[count].setIcon(icon);
            table[count].setOpaque(false);
            table[count].setBorderPainted(false);
            table[count].setContentAreaFilled(false);
            table[count].setFocusPainted(false); 
            p5.add(table[count]);
            count = count + 1;
        }

        JPanel p6 = new JPanel();

        for (int i = 1; i <= row6; i++) {
            table[count] = new JButton("Ζ" + i);
            table[count].setSize(120, 20);
            table[count].setIcon(icon);
            table[count].setOpaque(false);
            table[count].setBorderPainted(false);
            table[count].setForeground(new Color(00,00,00,00));
            table[count].setFocusPainted(false); 
            p6.add(table[count]);
            count = count + 1;
        }
        
        
        p1.setSize(110 * max, 120);
        p2.setSize(110 * max, 120);
        p3.setSize(110 * max, 120);
        p4.setSize(110 * max, 120);
        p5.setSize(110 * max, 120);
        p6.setSize(110 * max, 120);

        p1.setLocation(0, 100);
        p2.setLocation(0, 220);
        p3.setLocation(0, 340);
        p4.setLocation(0, 460);
        p5.setLocation(0, 580);
        p6.setLocation(0, 700);
        pane.setLayout(null);
        pane.add(p1);
        pane.add(p2);
        pane.add(p3);
        pane.add(p4);
        pane.add(p5);
        pane.add(p6);

        /**
         * hack να βρίσκει με βάση τις σειρές από τραπέζια ποιο θα ήταν το
         * ιδανικό ύψος του παραθύρου ώστε να το ορίζει στην εντολή
         * setSize(maxRow*120,numberRow*50)
         */
        
        form.setSize(max * 115, 8 * 120);
        form.setVisible(true);
    }

}
