/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mynightout.controllers.DisplayCellarController;
import mynightout.dao.NightClubDao;
import mynightout.dao.ReservationDao;
import mynightout.dao.SupplierDao;
import mynightout.dao.SupplyDao;
import mynightout.dao.UserDao;
import mynightout.entity.Cellar;
import mynightout.entity.Reservation;
import mynightout.entity.Supply;
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

        showSuppliersButton.setText("Εμφάνιση προμηθευτών");
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
                .addComponent(checkFullnessButton)
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
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void checkFullnessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFullnessButtonActionPerformed
        CheckFullnessForm checkFullnessForm = new CheckFullnessForm(currentClubName);
        this.dispose();
        checkFullnessForm.setLocationRelativeTo(this);
        checkFullnessForm.setVisible(true);
    }//GEN-LAST:event_checkFullnessButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        clubNameLabel.setText(currentClubName);
    }//GEN-LAST:event_formWindowActivated

    private void setDaysClosedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDaysClosedButtonActionPerformed
        SetNightClubDaysClosedForm setNightClubDaysClosedForm = new SetNightClubDaysClosedForm(currentClubName);
        this.dispose();
        setNightClubDaysClosedForm.setLocationRelativeTo(this);
        setNightClubDaysClosedForm.setVisible(true);
    }//GEN-LAST:event_setDaysClosedButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DeleteReservationForm deleteReservationForm = new DeleteReservationForm(currentClubName);
        deleteReservationForm.clubNameLabel.setText(currentClubName);
        this.dispose();
        ReservationDao reservationDao = new ReservationDao();
        List resultList = reservationDao.getClubCurrentReservations(currentClubName);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id κράτησης");
        tableHeaders.add("Όνομα πελάτη");
        tableHeaders.add("Επίθετο πελάτη");
        tableHeaders.add("Reservation Date");
        tableHeaders.add("Τραπέζι");
        String dateFormat = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);

        for (Object reservationInfo : resultList) {
            Reservation reservation = (Reservation) reservationInfo;
            Vector<Object> oneRow = new Vector<Object>();
            String customerName = new UserDao().getUserDataById(reservation.getId().getUserId()).getCustomerName();
            String customerLastName = new UserDao().getUserDataById(reservation.getId().getUserId()).getCustomerLastname();
            oneRow.add(reservation.getId().getReservationId());
            oneRow.add(customerName);
            oneRow.add(customerLastName);
            String reservationDate = simpleDateFormat.format(reservation.getReservationDate());
            oneRow.add(reservationDate);
            oneRow.add(reservation.getTrapezi());
            tableData.add(oneRow);
        }
        deleteReservationForm.clubReservationsTable.setModel(new DefaultTableModel(tableData, tableHeaders));
        deleteReservationForm.setLocationRelativeTo(this);
        deleteReservationForm.setVisible(true);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void setClosedDatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setClosedDatesButtonActionPerformed
        SetNightClubClosedDatesForm setNightClubClosedDatesForm = new SetNightClubClosedDatesForm(currentClubName);
        setNightClubClosedDatesForm.setLocationRelativeTo(this);
        this.dispose();
        setNightClubClosedDatesForm.setVisible(true);
    }//GEN-LAST:event_setClosedDatesButtonActionPerformed

    private void showSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSuppliersButtonActionPerformed
        ShowSupplierForm showSupplierForm = new ShowSupplierForm(currentClubName);
        this.dispose();
        showSupplierForm.clubName.setText(currentClubName);
        SupplyDao supplyDao = new SupplyDao();
        NightClubDao nightClub = new NightClubDao();
        List resultList = supplyDao.getSupplyByClubId(nightClub.getNightClubDataByClubName(currentClubName).getClubId());
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id");
        tableHeaders.add("Όνομα");
        tableHeaders.add("Επίθετο");
        tableHeaders.add("Eπιχείρηση");
        tableHeaders.add("Διεύθυνση");
        tableHeaders.add("Κινητό");
        tableHeaders.add("Εταιρικό τηλέφωνο");
        tableHeaders.add("e-mail");
        
        for (Object supplierInfo : resultList) {
            Supply supply = (Supply) supplierInfo;
            Vector<Object> oneRow = new Vector<Object>();
            int supplierId = supply.getId().getSupplierId();
            oneRow.add(supplierId);
            oneRow.add(new SupplierDao().getSupplierDataById(supplierId).getFirstName());
            oneRow.add(new SupplierDao().getSupplierDataById(supplierId).getLastName());
            oneRow.add(new SupplierDao().getSupplierDataById(supplierId).getCompanyName());
            oneRow.add(new SupplierDao().getSupplierDataById(supplierId).getAddress());
            oneRow.add(new SupplierDao().getSupplierDataById(supplierId).getCellphoneNum());
            oneRow.add(new SupplierDao().getSupplierDataById(supplierId).getOfficephoneNum());
            oneRow.add(new SupplierDao().getSupplierDataById(supplierId).getEmailAddress());
            tableData.add(oneRow);
            
        }
        
        showSupplierForm.suppliersTable.setModel(new DefaultTableModel(tableData, tableHeaders));
        showSupplierForm.suppliersTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        showSupplierForm.suppliersTable.sizeColumnsToFit(5);
        showSupplierForm.setLocationRelativeTo(this);
        
        showSupplierForm.setVisible(true);
    }//GEN-LAST:event_showSuppliersButtonActionPerformed

    private void displayCellarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCellarButtonActionPerformed

        DisplayCellarController displayCellarController = new DisplayCellarController();
        Cellar cellar = displayCellarController.displayCellar(currentClubName);
        DisplayCellarForm displayCellarForm = new DisplayCellarForm(currentClubName);
        this.dispose();
        displayCellarForm.cellarTable.setValueAt(cellar.getVodka(), 0, 1);
        displayCellarForm.cellarTable.setValueAt(cellar.getWhiskey(), 1, 1);
        displayCellarForm.cellarTable.setValueAt(cellar.getWine(), 2, 1);
        displayCellarForm.cellarTable.setValueAt(cellar.getLiqueur(), 3, 1);
        displayCellarForm.cellarTable.setValueAt(cellar.getRum(), 4, 1);
        displayCellarForm.cellarTable.setValueAt(cellar.getTequila(), 5, 1);
        displayCellarForm.cellarTable.setValueAt(cellar.getBeer(), 6, 1);
        displayCellarForm.secretClubNameLabel.setText(currentClubName);
        displayCellarForm.setLocationRelativeTo(this);
        displayCellarForm.setVisible(true);
    }//GEN-LAST:event_displayCellarButtonActionPerformed

    private void changeNightClubTableProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNightClubTableProfileButtonActionPerformed
        this.dispose();
        ChangeNightClubTableProfileForm changeNightClubTableProfileForm = new ChangeNightClubTableProfileForm(currentClubName);
        changeNightClubTableProfileForm.setLocationRelativeTo(this);
        changeNightClubTableProfileForm.setVisible(true);
    }//GEN-LAST:event_changeNightClubTableProfileButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        MainFrame mainFrame = new MainFrame();
        this.dispose();
        mainFrame.setLocationRelativeTo(this);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void showReservationHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReservationHistoryButtonActionPerformed
        NightclubReservationsHistoryForm nightclubReservationHistoryForm = new NightclubReservationsHistoryForm(currentClubName);
        nightclubReservationHistoryForm.clubName.setText(currentClubName);
        this.dispose();
        ReservationDao reservationDao = new ReservationDao();
        List resultList = reservationDao.getClubReservations(currentClubName);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id κράτησης");
        tableHeaders.add("Όνομα πελάτη");
        tableHeaders.add("Επίθετο πελάτη");
        tableHeaders.add("Reservation Date");
        tableHeaders.add("Τραπέζι");
        String dateFormat = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);

        for (Object reservationInfo : resultList) {
            Reservation reservation = (Reservation) reservationInfo;
            Vector<Object> oneRow = new Vector<Object>();
            String customerName = new UserDao().getUserDataById(reservation.getId().getUserId()).getCustomerName();
            String customerLastName = new UserDao().getUserDataById(reservation.getId().getUserId()).getCustomerLastname();
            oneRow.add(reservation.getId().getReservationId());
            oneRow.add(customerName);
            oneRow.add(customerLastName);
            String reservationDate = simpleDateFormat.format(reservation.getReservationDate());
            oneRow.add(reservationDate);
            oneRow.add(reservation.getTrapezi());
            tableData.add(oneRow);
        }
        nightclubReservationHistoryForm.clubReservationsTable.setModel(new DefaultTableModel(tableData, tableHeaders));
        nightclubReservationHistoryForm.setLocationRelativeTo(this);
        nightclubReservationHistoryForm.setVisible(true);

    }//GEN-LAST:event_showReservationHistoryButtonActionPerformed

    private void editSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSuppliersButtonActionPerformed
        this.dispose();
        EditSupplierPresenter editSupplierPresenter = new EditSupplierPresenter();
        editSupplierPresenter.editSupplier(new EditSupplierForm(), currentClubName);
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
    private javax.swing.JButton showReservationHistoryButton;
    private javax.swing.JButton showSuppliersButton;
    // End of variables declaration//GEN-END:variables
}