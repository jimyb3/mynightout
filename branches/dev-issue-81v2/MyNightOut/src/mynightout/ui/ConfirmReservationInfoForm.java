/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mynightout.controllers.CreateBookController;
import mynightout.dao.NightClubDao;
import mynightout.dao.UserDao;
import mynightout.exceptions.DaoException;

/**
 *
 * @author Dimitris
 */
public class ConfirmReservationInfoForm extends javax.swing.JFrame {

    private String currentUserName;

    /**
     * Creates new form ConfirmReservationInfoForm
     */
    public ConfirmReservationInfoForm() {
        initComponents();
    }

    public ConfirmReservationInfoForm(String cUserName) {
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

        customerNameFormLabel = new javax.swing.JLabel();
        customerLastNameFormLabel = new javax.swing.JLabel();
        reservationDateFormLabel = new javax.swing.JLabel();
        reservationTableFormLabel = new javax.swing.JLabel();
        nightClubNameFormLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        customerLastNameLabel = new javax.swing.JLabel();
        nightClubNameLabel = new javax.swing.JLabel();
        reservationDateLabel = new javax.swing.JLabel();
        reservationTableLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        customerNameFormLabel.setText("Όνομα:");

        customerLastNameFormLabel.setText("Επίθετο:");

        reservationDateFormLabel.setText("Ημερομηνία κράτησης:");

        reservationTableFormLabel.setText("Τραπέζι κράτησης:");

        nightClubNameFormLabel.setText("Όνομα καταστήματος:");

        customerNameLabel.setText("customerName");

        customerLastNameLabel.setText("customerLastName");

        nightClubNameLabel.setText("nightClubName");

        reservationDateLabel.setText("reservationDate");

        reservationTableLabel.setText("reservationTable");

        confirmButton.setText("Ναι");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Όχι");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        messageLabel.setText("Είναι τα παραπάνω στοιχεία σωστά;");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerNameFormLabel)
                            .addComponent(customerLastNameFormLabel)
                            .addComponent(nightClubNameFormLabel)
                            .addComponent(reservationDateFormLabel)
                            .addComponent(reservationTableFormLabel))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reservationDateLabel)
                            .addComponent(nightClubNameLabel)
                            .addComponent(customerLastNameLabel)
                            .addComponent(customerNameLabel)
                            .addComponent(reservationTableLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(confirmButton)
                        .addGap(50, 50, 50)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(messageLabel)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerLastNameFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerLastNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nightClubNameFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nightClubNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reservationDateFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservationDateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reservationTableFormLabel)
                    .addComponent(reservationTableLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(messageLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        JFrame createBookFrame = new CreateBookForm(currentUserName);
        this.dispose();
        createBookFrame.setLocationRelativeTo(this);
        createBookFrame.setVisible(true);

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        int clubId = new NightClubDao().getNightClubDataByClubName(nightClubNameLabel.getText()).getClubId();
        int userId = new UserDao().getUserDataByUsername(this.currentUserName).getUserId();;

        String date = "01/01/2014";

        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date reservationDate = (Date) formatter.parseObject(date);
            CreateBookController cbc = new CreateBookController();
            cbc.createReservationNew(userId, clubId, reservationDate, reservationTableLabel.getText(), 5, "active");
            JOptionPane.showMessageDialog(null, "Έγινε η καταχώρηση της νέας κράτησης", "Success", JOptionPane.INFORMATION_MESSAGE);
            JFrame mainUserFrame = new UserMainForm(currentUserName);
            this.dispose();
            mainUserFrame.setLocationRelativeTo(this);
            mainUserFrame.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(ConfirmReservationInfoForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ConfirmReservationInfoForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(ConfirmReservationInfoForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_confirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmReservationInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmReservationInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmReservationInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmReservationInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmReservationInfoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel customerLastNameFormLabel;
    public javax.swing.JLabel customerLastNameLabel;
    private javax.swing.JLabel customerNameFormLabel;
    public javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel nightClubNameFormLabel;
    public javax.swing.JLabel nightClubNameLabel;
    private javax.swing.JLabel reservationDateFormLabel;
    public javax.swing.JLabel reservationDateLabel;
    private javax.swing.JLabel reservationTableFormLabel;
    public javax.swing.JLabel reservationTableLabel;
    // End of variables declaration//GEN-END:variables
}
