/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import mynightout.controllers.DisplayCellarController;
import mynightout.dao.ReservationDao;
import mynightout.dao.UserDao;
import mynightout.entity.Cellar;
import mynightout.entity.Reservation;
import mynightout.presenters.EditSupplierPresenter;

/**
 *
 * @author ioanna
 */
public class NightclubMainForm extends javax.swing.JFrame {

    private String currentClubName;

    /**
     * Creates new form NightclubMainFrame
     */
    public NightclubMainForm() {
        initComponents();
    }

    public NightclubMainForm(String nightClubName) {
        currentClubName = nightClubName;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        checkFullnessButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        clubNameLabel = new javax.swing.JLabel();
        setDaysClosedButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        setClosedDatesButton = new javax.swing.JButton();
        showCellarForm = new javax.swing.JButton();
        showSuppliersButton = new javax.swing.JButton();
        displayCellarButton = new javax.swing.JButton();
        changeNightClubTableProfileButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        showReservationHistoryButton = new javax.swing.JButton();
        editSuppliersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        exitButton.setText("Κλείσιμο");
        exitButton.setFocusPainted(false);
        exitButton.setFocusable(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        checkFullnessButton.setText("Πληρότητα Καταστήματος");
        checkFullnessButton.setFocusPainted(false);
        checkFullnessButton.setFocusable(false);
        checkFullnessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFullnessButtonActionPerformed(evt);
            }
        });

        messageLabel.setText("Διαχείριση καταστήματος ");

        clubNameLabel.setText("clubName");

        setDaysClosedButton.setText("Μέρες κλειστό");
        setDaysClosedButton.setFocusPainted(false);
        setDaysClosedButton.setFocusable(false);
        setDaysClosedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDaysClosedButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Διαγραφή κράτησης");
        deleteButton.setFocusPainted(false);
        deleteButton.setFocusable(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        setClosedDatesButton.setText("Διάστημα κλειστό");
        setClosedDatesButton.setFocusPainted(false);
        setClosedDatesButton.setFocusable(false);
        setClosedDatesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setClosedDatesButtonActionPerformed(evt);
            }
        });

        showCellarForm.setText("Εμφάνιση κελαριού");
        showCellarForm.setEnabled(false);
        showCellarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCellarFormActionPerformed(evt);
            }
        });

        showSuppliersButton.setText("Εμφάνιση προμηθευτών");
        showSuppliersButton.setEnabled(false);
        showSuppliersButton.setFocusPainted(false);
        showSuppliersButton.setFocusable(false);
        showSuppliersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSuppliersButtonActionPerformed(evt);
            }
        });

        displayCellarButton.setText("Εμφάνιση/επεξεργασία κάβας");
        displayCellarButton.setFocusPainted(false);
        displayCellarButton.setFocusable(false);
        displayCellarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCellarButtonActionPerformed(evt);
            }
        });

        changeNightClubTableProfileButton.setText("Αλλαγή στην κάτοψη");
        changeNightClubTableProfileButton.setFocusPainted(false);
        changeNightClubTableProfileButton.setFocusable(false);
        changeNightClubTableProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNightClubTableProfileButtonActionPerformed(evt);
            }
        });

        logoutButton.setText("Αποσύνδεση");
        logoutButton.setFocusPainted(false);
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        showReservationHistoryButton.setText("Ιστορικό κρατήσεων");
        showReservationHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReservationHistoryButtonActionPerformed(evt);
            }
        });

        editSuppliersButton.setText("Επεξεργασία προμηθευτών");
        editSuppliersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSuppliersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clubNameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(showReservationHistoryButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkFullnessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setDaysClosedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showSuppliersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(displayCellarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showCellarForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeNightClubTableProfileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(setClosedDatesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editSuppliersButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageLabel)
                    .addComponent(clubNameLabel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showSuppliersButton)
                    .addComponent(changeNightClubTableProfileButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setDaysClosedButton)
                    .addComponent(setClosedDatesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFullnessButton)
                    .addComponent(showCellarForm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(displayCellarButton))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showReservationHistoryButton)
                    .addComponent(editSuppliersButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(logoutButton))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void checkFullnessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFullnessButtonActionPerformed
        CheckFullnessForm checkFullnessFrame = new CheckFullnessForm(currentClubName);
        this.dispose();
        checkFullnessFrame.setLocationRelativeTo(this);
        checkFullnessFrame.setVisible(true);
    }//GEN-LAST:event_checkFullnessButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        clubNameLabel.setText(currentClubName);
    }//GEN-LAST:event_formWindowActivated

    private void setDaysClosedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDaysClosedButtonActionPerformed
        SetNightClubDaysClosedForm sncdcf = new SetNightClubDaysClosedForm(currentClubName);
        this.dispose();
        sncdcf.setLocationRelativeTo(this);
        sncdcf.setVisible(true);
    }//GEN-LAST:event_setDaysClosedButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DeleteReservationForm deleteReservationFrame = new DeleteReservationForm(currentClubName);
        deleteReservationFrame.clubNameLabel.setText(currentClubName);
        this.dispose();
        ReservationDao reservation = new ReservationDao();
        List resultList = reservation.getClubCurrentReservations(currentClubName);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id κράτησης");
        tableHeaders.add("Όνομα πελάτη");
        tableHeaders.add("Επίθετο πελάτη");
        tableHeaders.add("Reservation Date");
        tableHeaders.add("Τραπέζι");
        String DATE_FORMAT = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

        for (Object o : resultList) {
            Reservation res = (Reservation) o;
            Vector<Object> oneRow = new Vector<Object>();
            String customerName = new UserDao().getUserDataById(res.getId().getUserId()).getCustomerName();
            String customerLastName = new UserDao().getUserDataById(res.getId().getUserId()).getCustomerLastname();
            oneRow.add(res.getId().getReservationId());
            oneRow.add(customerName);
            oneRow.add(customerLastName);
            String reservationDate = sdf.format(res.getReservationDate());
            oneRow.add(reservationDate);
            oneRow.add(res.getTrapezi());
            tableData.add(oneRow);
        }
        deleteReservationFrame.clubReservationsTable.setModel(new DefaultTableModel(tableData, tableHeaders));
        deleteReservationFrame.setLocationRelativeTo(this);
        deleteReservationFrame.setVisible(true);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void setClosedDatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setClosedDatesButtonActionPerformed
        SetNightClubClosedDatesForm snccdf = new SetNightClubClosedDatesForm(currentClubName);
        snccdf.setLocationRelativeTo(this);
        this.dispose();
        snccdf.setVisible(true);
    }//GEN-LAST:event_setClosedDatesButtonActionPerformed

    private void showCellarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCellarFormActionPerformed
        ShowCellarForm showCellarFrame = new ShowCellarForm(currentClubName);
        this.dispose();
        showCellarFrame.setLocationRelativeTo(this);
        showCellarFrame.setVisible(true);
    }//GEN-LAST:event_showCellarFormActionPerformed

    private void showSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSuppliersButtonActionPerformed
        ShowSupplierForm showSuppliersFrame = new ShowSupplierForm(currentClubName);
        this.dispose();
        showSuppliersFrame.setLocationRelativeTo(this);
        showSuppliersFrame.setVisible(true);
    }//GEN-LAST:event_showSuppliersButtonActionPerformed

    private void displayCellarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCellarButtonActionPerformed

        DisplayCellarController dcc = new DisplayCellarController();
        Cellar cellar = dcc.displayCellar(currentClubName);
        DisplayCellarForm dcf = new DisplayCellarForm(currentClubName);
        this.dispose();
        dcf.cellarTable.setValueAt(cellar.getVodka(), 0, 1);
        dcf.cellarTable.setValueAt(cellar.getWhiskey(), 1, 1);
        dcf.cellarTable.setValueAt(cellar.getWine(), 2, 1);
        dcf.cellarTable.setValueAt(cellar.getLiqueur(), 3, 1);
        dcf.cellarTable.setValueAt(cellar.getRum(), 4, 1);
        dcf.cellarTable.setValueAt(cellar.getTequila(), 5, 1);
        dcf.cellarTable.setValueAt(cellar.getBeer(), 6, 1);
        dcf.secretClubNameLabel.setText(currentClubName);
        dcf.setLocationRelativeTo(this);
        dcf.setVisible(true);
    }//GEN-LAST:event_displayCellarButtonActionPerformed

    private void changeNightClubTableProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNightClubTableProfileButtonActionPerformed
        this.dispose();
        ChangeNightClubTableProfileForm ctpf = new ChangeNightClubTableProfileForm(currentClubName);
        ctpf.setLocationRelativeTo(this);
        ctpf.setVisible(true);
    }//GEN-LAST:event_changeNightClubTableProfileButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        MainFrame mainForm = new MainFrame();
        this.dispose();
        mainForm.setLocationRelativeTo(this);
        mainForm.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void showReservationHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReservationHistoryButtonActionPerformed
        NightclubReservationsHistoryForm historyForm = new NightclubReservationsHistoryForm(currentClubName);
        historyForm.clubName.setText(currentClubName);
        this.dispose();
        ReservationDao reservation = new ReservationDao();
        List resultList = reservation.getClubReservations(currentClubName);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id κράτησης");
        tableHeaders.add("Όνομα πελάτη");
        tableHeaders.add("Επίθετο πελάτη");
        tableHeaders.add("Reservation Date");
        tableHeaders.add("Τραπέζι");
        String DATE_FORMAT = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

        for (Object o : resultList) {
            Reservation res = (Reservation) o;
            Vector<Object> oneRow = new Vector<Object>();
            String customerName = new UserDao().getUserDataById(res.getId().getUserId()).getCustomerName();
            String customerLastName = new UserDao().getUserDataById(res.getId().getUserId()).getCustomerLastname();
            oneRow.add(res.getId().getReservationId());
            oneRow.add(customerName);
            oneRow.add(customerLastName);
            String reservationDate = sdf.format(res.getReservationDate());
            oneRow.add(reservationDate);
            oneRow.add(res.getTrapezi());
            tableData.add(oneRow);
        }
        historyForm.clubReservationsTable.setModel(new DefaultTableModel(tableData, tableHeaders));
        historyForm.setLocationRelativeTo(this);
        historyForm.setVisible(true);

    }//GEN-LAST:event_showReservationHistoryButtonActionPerformed

    private void editSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSuppliersButtonActionPerformed
        this.dispose();
        EditSupplierPresenter ed = new EditSupplierPresenter();
        ed.editSupplier(new EditSupplierForm(), currentClubName);
    }//GEN-LAST:event_editSuppliersButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NightclubMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NightclubMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NightclubMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NightclubMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NightclubMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeNightClubTableProfileButton;
    private javax.swing.JButton checkFullnessButton;
    private javax.swing.JLabel clubNameLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton displayCellarButton;
    private javax.swing.JButton editSuppliersButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton setClosedDatesButton;
    private javax.swing.JButton setDaysClosedButton;
    private javax.swing.JButton showCellarForm;
    private javax.swing.JButton showReservationHistoryButton;
    private javax.swing.JButton showSuppliersButton;
    // End of variables declaration//GEN-END:variables
}
