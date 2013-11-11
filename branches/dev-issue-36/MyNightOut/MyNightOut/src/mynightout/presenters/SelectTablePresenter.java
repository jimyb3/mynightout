/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.presenters;

import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mynightout.ui.CancelBookForm;
import mynightout.ui.SelectTableForm;

/**
 *
 * @author Dimitris
 */
public class SelectTablePresenter {

    public void createSelectTable(SelectTableForm form) {

        
        JPanel p1 = new JPanel();
        Container pane = form.getContentPane();

        JButton[] table = new JButton[20];

        int row1 = 5, row2 = 3, row3 = 4;
        int count = 1;
        for (int i = 1; i <= row1; i++) {
            table[count] = new JButton("A" + i);
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
            table[count].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                    //JOptionPane.showMessageDialog(new JFrame(), "Διάλεξες για κράτηση το " + table);
                    CancelBookForm cbf=new CancelBookForm();
                    cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι "+table);
                    cbf.setVisible(true);
                }
            });

            p1.add(table[count]);

            count = count + 1;
        }
        JPanel p2 = new JPanel();

        for (int j = 1; j <= row2; j++) {
            table[count] = new JButton("B" + j);
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());
            table[count].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String table = evt.getActionCommand();
                    //JOptionPane.showMessageDialog(new JFrame(), "Διάλεξες για κράτηση το " + table);
                    CancelBookForm cbf=new CancelBookForm();
                    cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι "+table);
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
            table[count].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String table = evt.getActionCommand();
                    //JOptionPane.showMessageDialog(new JFrame(), "Διάλεξες για κράτηση το " + table);
                    CancelBookForm cbf=new CancelBookForm();
                    cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι "+table);
                    cbf.setVisible(true);
                }
            });

            p3.add(table[count]);

            count = count + 1;
        }
        
        p1.setSize(table[1].getWidth() * row1, 40);
        p2.setSize(table[7].getWidth() * row2, 40);
        p3.setSize(table[12].getWidth() * row3, 40);
        pane.add(p1);
        pane.add(p2);
        pane.add(p3);
        p1.setLocation(0, 0);
        p2.setLocation(0, 50);
        p3.setLocation(0, 100);
        form.setSize(130*row1, 500);
        form.setVisible(true);
    }
}
