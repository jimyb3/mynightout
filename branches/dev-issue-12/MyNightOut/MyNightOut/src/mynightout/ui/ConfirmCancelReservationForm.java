/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mynightout.controllers.CancelBookController;
import mynightout.dao.NightClubDao;
import mynightout.dao.ReservationDao;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationPk;

/**
 *
 * @author Dimitris
 */
public class ConfirmCancelReservationForm extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmCancelReservationForm
     */
    public ConfirmCancelReservationForm() {
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

        messageLabel = new javax.swing.JLabel();
        reservationIdLabel = new javax.swing.JLabel();
        clubNameLabel = new javax.swing.JLabel();
        reservationDateLabel = new javax.swing.JLabel();
        trapeziLabel = new javax.swing.JLabel();
        reservationIdDataLabel = new javax.swing.JLabel();
        clubNameDataLabel = new javax.swing.JLabel();
        reservationDateDataLabel = new javax.swing.JLabel();
        trapeziDataLabel = new javax.swing.JLabel();
        message2Label = new javax.swing.JLabel();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        userNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        messageLabel.setText("Θα ακυρώσεις την κράτηση με τα παρακάτω στοιχεία.");

        reservationIdLabel.setText("Id κράτησης:");

        clubNameLabel.setText("Όνομα καταστηματος:");

        reservationDateLabel.setText("Ημερομηνία κράτησης:");

        trapeziLabel.setText("Τραπέζι κράτησης:");

        reservationIdDataLabel.setText("reservationId");

        clubNameDataLabel.setText("clubName");

        reservationDateDataLabel.setText("reservationDate");

        trapeziDataLabel.setText("trapezi");

        message2Label.setText("Είναι σωστά τα παραπάνω στοιχεία;");

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

        userNameLabel.setText("userNameLabel");
        userNameLabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNameLabel)
                        .addGap(238, 238, 238))
                    .addComponent(messageLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(message2Label)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(yesButton)
                                .addGap(86, 86, 86)
                                .addComponent(noButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reservationDateLabel)
                                    .addComponent(trapeziLabel)
                                    .addComponent(clubNameLabel)
                                    .addComponent(reservationIdLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reservationIdDataLabel)
                                    .addComponent(clubNameDataLabel)
                                    .addComponent(trapeziDataLabel)
                                    .addComponent(reservationDateDataLabel))))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(userNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reservationIdLabel)
                    .addComponent(reservationIdDataLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clubNameDataLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clubNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reservationDateLabel)
                    .addComponent(reservationDateDataLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trapeziLabel)
                    .addComponent(trapeziDataLabel))
                .addGap(18, 18, 18)
                .addComponent(message2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesButton)
                    .addComponent(noButton))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        // TODO add your handling code here:
        CancelBookController controller = new CancelBookController();
        int reservationId = Integer.parseInt(reservationIdDataLabel.getText());

        try {
            ReservationPk cancelReservation = controller.cancelReservation(userNameLabel.getText(), reservationId);
            JOptionPane.showMessageDialog(null, "Reservation canceled with id: " + reservationId, "Success", JOptionPane.INFORMATION_MESSAGE);
            CancelBookForm cancelBookFrame = new CancelBookForm(userNameLabel.getText());
            cancelBookFrame.userNameLabel.setText(userNameLabel.getText());
            this.dispose();
            ReservationDao reservation = new ReservationDao();
            List resultList = reservation.getUserCurrentReservations(userNameLabel.getText());
            Vector<String> tableHeaders = new Vector<String>();
            Vector tableData = new Vector();
            tableHeaders.add("Id κράτησης");
            tableHeaders.add("Club Name");
            tableHeaders.add("Reservation Date");
            tableHeaders.add("Τραπέζι");
            String DATE_FORMAT = "dd/MM/yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

            for (Object o : resultList) {
                Reservation res = (Reservation) o;
                Vector<Object> oneRow = new Vector<Object>();
                String clubName = new NightClubDao().getNightClubDataByClubId(res.getId().getClubId()).getClubName();
                oneRow.add(res.getId().getReservationId());
                oneRow.add(clubName);
                String reservationDate = sdf.format(res.getReservationDate());
                oneRow.add(reservationDate);
                oneRow.add(res.getTrapezi());
                tableData.add(oneRow);
            }
            cancelBookFrame.userReservationsTable.setModel(new DefaultTableModel(tableData, tableHeaders));
            cancelBookFrame.setLocationRelativeTo(this);
            cancelBookFrame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Failure", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_yesButtonActionPerformed

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        // TODO add your handling code here:
        CancelBookForm cancelBookFrame = new CancelBookForm(userNameLabel.getText());
        cancelBookFrame.userNameLabel.setText(userNameLabel.getText());
        this.dispose();
        ReservationDao reservation = new ReservationDao();
        List resultList = reservation.getUserReservations(userNameLabel.getText());
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id κράτησης");
        tableHeaders.add("Club Name");
        tableHeaders.add("Reservation Date");
        tableHeaders.add("Τραπέζι");
        String DATE_FORMAT = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        
        for (Object o : resultList) {
            Reservation res = (Reservation) o;
            Vector<Object> oneRow = new Vector<Object>();
            String clubName = new NightClubDao().getNightClubDataByClubId(res.getId().getClubId()).getClubName();
            oneRow.add(res.getId().getReservationId());
            oneRow.add(clubName);
            String reservationDate = sdf.format(res.getReservationDate());
            oneRow.add(reservationDate);
            oneRow.add(res.getTrapezi());
            tableData.add(oneRow);
        }
        cancelBookFrame.userReservationsTable.setModel(new DefaultTableModel(tableData, tableHeaders));
        cancelBookFrame.setLocationRelativeTo(this);
        cancelBookFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_noButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmCancelReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmCancelReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmCancelReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmCancelReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmCancelReservationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel clubNameDataLabel;
    private javax.swing.JLabel clubNameLabel;
    private javax.swing.JLabel message2Label;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton noButton;
    public javax.swing.JLabel reservationDateDataLabel;
    private javax.swing.JLabel reservationDateLabel;
    public javax.swing.JLabel reservationIdDataLabel;
    private javax.swing.JLabel reservationIdLabel;
    public javax.swing.JLabel trapeziDataLabel;
    private javax.swing.JLabel trapeziLabel;
    public javax.swing.JLabel userNameLabel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
