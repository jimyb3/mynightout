/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import mynightout.dao.TablesDao;
import mynightout.entity.Tables;
import mynightout.presenters.SelectTableProfilePresenter;

/**
 *
 * @author ioanna
 */
public class UserMainForm extends javax.swing.JFrame {

    private String currentUserName;

    /**
     * Creates new form UserMainForm
     */
    public UserMainForm() {
        initComponents();
    }

    public UserMainForm(String cUserName) {
        currentUserName = cUserName;
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

        userNameLabel = new javax.swing.JLabel();
        reservationEditButton = new javax.swing.JButton();
        cancelReservationButton = new javax.swing.JButton();
        createReservationButton = new javax.swing.JButton();
        confirmReservationButton = new javax.swing.JButton();
        SelectTableButton = new javax.swing.JButton();
        showStoresButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        userNameLabel.setText("jLabel1");

        reservationEditButton.setText("Επεξεργασία κράτησης");
        reservationEditButton.setEnabled(false);
        reservationEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationEditButtonActionPerformed(evt);
            }
        });

        cancelReservationButton.setText("Ακύρωση κράτησης");
        cancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationButtonActionPerformed(evt);
            }
        });

        createReservationButton.setText("Δημιουργία κράτησης");
        createReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReservationButtonActionPerformed(evt);
            }
        });

        confirmReservationButton.setText("<html>Επιβεβαίωση των <br></br>\nστοιχειων της κράτησης</html>");
        confirmReservationButton.setEnabled(false);
        confirmReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmReservationButtonActionPerformed(evt);
            }
        });

        SelectTableButton.setText("Επιλογή τραπεζιού");
        SelectTableButton.setEnabled(false);
        SelectTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectTableButtonActionPerformed(evt);
            }
        });

        showStoresButton.setText("Προβολή καταστημάτων");
        showStoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStoresButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("Αποσύνδεση");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(userNameLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(showStoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(reservationEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cancelReservationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(createReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(confirmReservationButton)
                                            .addComponent(SelectTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userNameLabel)
                .addGap(18, 18, 18)
                .addComponent(showStoresButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reservationEditButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelReservationButton))
                    .addComponent(confirmReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createReservationButton)
                    .addComponent(SelectTableButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutButton)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        userNameLabel.setText(currentUserName);
    }//GEN-LAST:event_formWindowActivated

    private void reservationEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationEditButtonActionPerformed
        JFrame editReservationFrame = new EditReservationForm(currentUserName);
        this.dispose();
        editReservationFrame.setLocationRelativeTo(this);
        editReservationFrame.setVisible(true);
    }//GEN-LAST:event_reservationEditButtonActionPerformed

    private void cancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservationButtonActionPerformed
        JFrame cancelBookFrame = new CancelBookForm(currentUserName);
        this.dispose();
        cancelBookFrame.setLocationRelativeTo(this);
        cancelBookFrame.setVisible(true);
    }//GEN-LAST:event_cancelReservationButtonActionPerformed

    private void createReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createReservationButtonActionPerformed
        JFrame createBookFrame = new CreateBookForm(currentUserName);
        this.dispose();
        createBookFrame.setLocationRelativeTo(this);
        createBookFrame.setVisible(true);
    }//GEN-LAST:event_createReservationButtonActionPerformed

    private void confirmReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmReservationButtonActionPerformed
        ConfirmReservationInfoForm crif = new ConfirmReservationInfoForm(currentUserName);
        crif.customerLastNameLabel.setText("Λαλακίδης");
        crif.customerNameLabel.setText("Λαλάκης");
        crif.nightClubNameLabel.setText("Vogue");
        crif.reservationDateLabel.setText("01/01/2014");
        crif.reservationTableLabel.setText("Α3");
        this.dispose();
        crif.setVisible(true);
    }//GEN-LAST:event_confirmReservationButtonActionPerformed

    private void SelectTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectTableButtonActionPerformed
        SelectTableProfilePresenter stpp = new SelectTableProfilePresenter();
        int clubId = 1;
        TablesDao td = new TablesDao();
        Tables t = td.getClubsTables("Vogue");
        try {
            this.dispose();
            stpp.showSelectTableProfile(new SelectTableProfileForm(currentUserName), t.getFirstRow(), t.getSecondRow(), t.getThirdRow(), t.getFourthRow(), t.getFifthRow(), t.getSixthRow(), clubId);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SelectTableButtonActionPerformed

    private void showStoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStoresButtonActionPerformed
        JFrame nightClubs = new StoresForm(currentUserName);
        this.dispose();
        nightClubs.setLocationRelativeTo(this);
        nightClubs.setVisible(true);
    }//GEN-LAST:event_showStoresButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        JFrame mainFrame = new MainFrame();
        this.dispose();
        mainFrame.setLocationRelativeTo(this);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_logOutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SelectTableButton;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JButton confirmReservationButton;
    private javax.swing.JButton createReservationButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton reservationEditButton;
    private javax.swing.JButton showStoresButton;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
