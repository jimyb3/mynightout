/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.presenters;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import mynightout.dao.ReservationDao;
import mynightout.ui.CancelBookForm;
import mynightout.ui.SelectTableProfileForm;

/**
 *
 * @author Dimitris
 */
public class SelectTableProfilePresenter {

    public void showSelectTableProfile(SelectTableProfileForm form, int row1, int row2, int row3, int row4,
            int row5, int row6, int clubId) throws ParseException {

        int max = Collections.max(Arrays.asList(row1, row2, row3, row4, row5, row6));
        JPanel p1 = new JPanel();
        ReservationDao rDao = new ReservationDao();
        clubId = 1;
        String date = "01/01/2014";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        List reservedTables = rDao.listWithReservationTablesByDate(clubId, reservationDate);
        Container pane = form.getContentPane();
        int tableNumber = row1 + row2 + row3 + row4 + row5 + row6 + 1;
        JButton[] table = new JButton[tableNumber];
        String imagePath = "/images/freeTable.jpg";
        URL url = getClass().getResource(imagePath);

        ImageIcon icon = new ImageIcon(url);
        /**
         * hack Να αντικατασταθεί ο κωδικας από τα κουμπιά με κώδικα που θα
         * επιτρέπει την αλλαγή των θέσεων.
         */
        int count = 1;
        for (int i = 1; i <= row1; i++) {
            table[count] = new JButton("Α" + i);
            String tab = "Α" + i;
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
            boolean find = false;
            int j = 0;
            while (j < reservedTables.size() && !find) {
                if ((tab).equals(reservedTables.get(j))) {
                    find = true;
                }
                j++;
            }

            if (find) {
                imagePath = "/images/NoFreeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
            } else {
                imagePath = "/images/freeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
                table[count].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                        CancelBookForm cbf = new CancelBookForm();
                        cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                        cbf.setVisible(true);
                    }
                });

            }
            table[count].setIcon(icon);
            p1.add(table[count]);
            count = count + 1;
        }

        JPanel p2 = new JPanel();

        for (int i = 1;i <= row2;i++) {
            table[count] = new JButton("Β" + i);
            String tab = "Β" + i;
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
            boolean find = false;
            int j = 0;
            while (j < reservedTables.size() && !find) {
                if ((tab).equals(reservedTables.get(j))) {
                    find = true;
                }
                j++;
            }

            if (find) {
                imagePath = "/images/NoFreeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
            } else {
                imagePath = "/images/freeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
                table[count].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                        CancelBookForm cbf = new CancelBookForm();
                        cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                        cbf.setVisible(true);
                    }
                });

            }
            table[count].setIcon(icon);

            p2.add(table[count]);

            count = count + 1;
        }

        JPanel p3 = new JPanel();

        for (int i = 1;
                i <= row3;
                i++) {
            table[count] = new JButton("Γ" + i);
            String tab = "Γ" + i;
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
            boolean find = false;
            int j = 0;
            while (j < reservedTables.size() && !find) {
                if ((tab).equals(reservedTables.get(j))) {
                    find = true;
                }
                j++;
            }

            if (find) {
                imagePath = "/images/NoFreeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
            } else {
                imagePath = "/images/freeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
                table[count].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                        CancelBookForm cbf = new CancelBookForm();
                        cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                        cbf.setVisible(true);
                    }
                });

            }
            table[count].setIcon(icon);

            p3.add(table[count]);

            count = count + 1;
        }

        JPanel p4 = new JPanel();

        for (int i = 1;
                i <= row4;
                i++) {
            table[count] = new JButton("Δ" + i);
            String tab = "Δ" + i;
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
            boolean find = false;
            int j = 0;
            while (j < reservedTables.size() && !find) {
                if ((tab).equals(reservedTables.get(j))) {
                    find = true;
                }
                j++;
            }

            if (find) {
                imagePath = "/images/NoFreeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
            } else {
                imagePath = "/images/freeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
                table[count].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                        CancelBookForm cbf = new CancelBookForm();
                        cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                        cbf.setVisible(true);
                    }
                });

            }
            table[count].setIcon(icon);

            p4.add(table[count]);

            count = count + 1;
        }

        JPanel p5 = new JPanel();

        for (int i = 1;
                i <= row5;
                i++) {
            table[count] = new JButton("Ε" + i);
            String tab = "Ε" + i;
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
            boolean find = false;
            int j = 0;
            while (j < reservedTables.size() && !find) {
                if ((tab).equals(reservedTables.get(j))) {
                    find = true;
                }
                j++;
            }

            if (find) {
                imagePath = "/images/NoFreeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
            } else {
                imagePath = "/images/freeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
                table[count].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                        CancelBookForm cbf = new CancelBookForm();
                        cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                        cbf.setVisible(true);
                    }
                });

            }
            table[count].setIcon(icon);

            p5.add(table[count]);

            count = count + 1;
        }

        JPanel p6 = new JPanel();

        for (int i = 1;
                i <= row6;
                i++) {
            table[count] = new JButton("Ζ" + i);
            String tab = "Ζ" + i;
            table[count].setSize(120, 20);
            table[count].setActionCommand(table[count].getText());//Δίνουμε στο Action το text που θέλουμε.
            boolean find = false;
            int j = 0;
            while (j < reservedTables.size() && !find) {
                if ((tab).equals(reservedTables.get(j))) {
                    find = true;
                }
                j++;
            }

            if (find) {
                imagePath = "/images/NoFreeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
            } else {
                imagePath = "/images/freeTable.jpg";
                url = getClass().getResource(imagePath);
                icon = new ImageIcon(url);
                table[count].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        String table = evt.getActionCommand();//Παίρνουμε πίσω το text που δώσαμε.
                        CancelBookForm cbf = new CancelBookForm();
                        cbf.mesageLabel.setText("Θα κάνεις ακύρωση κράτηση για το τραπέζι " + table);
                        cbf.setVisible(true);
                    }
                });

            }
            table[count].setIcon(icon);

            p6.add(table[count]);

            count = count + 1;
        }

        p1.setSize(110 * max, 120);
        p2.setSize(110 * max, 120);
        p3.setSize(110 * max, 120);
        p4.setSize(110 * max, 120);
        p5.setSize(110 * max, 120);
        p6.setSize(115 * max, 120);

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
         * hack να βρίσκει ποια σειρά από τραπέζια έχει τα περισσότερα τραπέζια
         * και και να ορίζει αυτή στην εντολή για το μέγεθος του παραθύρου
         * setSize(maxRow*120,500)
         */
        /**
         * hack να βρίσκει με βάση τις σειρές από τραπέζια ποιο θα ήταν το
         * ιδανικό ύψος του παραθύρου ώστε να το ορίζει στην εντολή
         * setSize(maxRow*120,numberRow*50)
         */
        form.setSize(max* 115, 8 * 120);
        form.setVisible(true);
    }
}
