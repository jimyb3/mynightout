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
import mynightout.controllers.SetNightClubClosedDatesController;

/**
 *
 * @author Dimitris
 */
public class ConfirmNightClubClosedDatesForm extends javax.swing.JFrame {

    private String currentClubName;

    /**
     * Creates new form ConfirmNightClubClosedDatesForm
     */
    public ConfirmNightClubClosedDatesForm() {
        initComponents();
    }

    public ConfirmNightClubClosedDatesForm(String nightClubName) {
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

        messageLabel1 = new javax.swing.JLabel();
        closedFromLabel = new javax.swing.JLabel();
        closedThroughLabel = new javax.swing.JLabel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        closedFromDateLabel = new javax.swing.JLabel();
        closedThroughDateLabel = new javax.swing.JLabel();
        messageLabel2 = new javax.swing.JLabel();
        clubNameLabel = new javax.swing.JLabel();
        nightClubNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        messageLabel1.setText("Το κατάστημα θα παραμείνει κλειστό για τις παρακάτω ημερομηνίες:");

        closedFromLabel.setText("Κλειστό από:");

        closedThroughLabel.setText("Κλειστό μέχρι:");

        yesButton.setText("Ναι");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });

        noButton.setText("Όχι");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        closedFromDateLabel.setText("closedFromDate");

        closedThroughDateLabel.setText("closedThroughDate");

        messageLabel2.setText("Είναι σωστές οι παραπάνω ημερομηνίες;");

        clubNameLabel.setText("Όνομα καταστήματος:");

        nightClubNameLabel.setText("nightClubName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(messageLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(closedFromLabel)
                                    .addComponent(closedThroughLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(closedThroughDateLabel)
                                            .addComponent(closedFromDateLabel)
                                            .addComponent(nightClubNameLabel)))))
                            .addComponent(clubNameLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(messageLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(messageLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clubNameLabel)
                    .addComponent(nightClubNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closedFromLabel)
                    .addComponent(closedFromDateLabel))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closedThroughLabel)
                    .addComponent(closedThroughDateLabel))
                .addGap(35, 35, 35)
                .addComponent(messageLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesButton)
                    .addComponent(noButton))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        this.dispose();
        SetNightClubClosedDatesForm setNightclubClosedDatesForm = new SetNightClubClosedDatesForm(currentClubName);
        setNightclubClosedDatesForm.setLocationRelativeTo(this);
        setNightclubClosedDatesForm.setVisible(true);
    }//GEN-LAST:event_noButtonActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed

        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date closedFromDate = new Date();
        Date closedThroughDate = new Date();
        try {
            closedFromDate = (Date) formatter.parseObject(closedFromDateLabel.getText());
            closedThroughDate = (Date) formatter.parseObject(closedThroughDateLabel.getText());
        } catch (ParseException exception) {
            Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(Level.SEVERE, null, exception);
        }
        try {
            SetNightClubClosedDatesController setNightClubClosedDatesController = new SetNightClubClosedDatesController();
            setNightClubClosedDatesController.setClubClosedDates(nightClubNameLabel.getText(), closedFromDate, closedThroughDate);
            JOptionPane.showMessageDialog(null, "Ορίστηκαν σωστά οι νέες ημερομηνίες!", "Success", JOptionPane.INFORMATION_MESSAGE);
            NightclubMainForm nightclubMainForm = new NightclubMainForm(currentClubName);
            this.dispose();
            nightclubMainForm.setLocationRelativeTo(this);
            nightclubMainForm.setVisible(true);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Failure", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_yesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmNightClubClosedDatesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel closedFromDateLabel;
    private javax.swing.JLabel closedFromLabel;
    public javax.swing.JLabel closedThroughDateLabel;
    private javax.swing.JLabel closedThroughLabel;
    private javax.swing.JLabel clubNameLabel;
    private javax.swing.JLabel messageLabel1;
    private javax.swing.JLabel messageLabel2;
    public javax.swing.JLabel nightClubNameLabel;
    private javax.swing.JButton noButton;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
