/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mynightout.controllers.CreateBookController;
import mynightout.dao.ReservationDaoCreate;
import mynightout.entity.Reservation;

/**
 *
 * @author Miltos
 */
public class CreateBookForm extends javax.swing.JFrame {

    /**
     * Creates new form CreateReservationForm
     */
    public CreateBookForm() {

        initComponents();
        Date date = new Date();
        this.reservationDateChooser.setDate(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reservationOkButton = new javax.swing.JButton();
        reservationNightClubSelectionLabel = new javax.swing.JLabel();
        reservationNightClubSelection = new javax.swing.JComboBox();
        reservationCustomerNameLabel = new javax.swing.JLabel();
        reservationPartyNumberLabel = new javax.swing.JLabel();
        reservationPartyNumberTextField = new javax.swing.JTextField();
        reservationDateLabel = new javax.swing.JLabel();
        reservationButtonClose = new javax.swing.JButton();
        reservationDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reservationOkButton.setText("Καταχώρηση Κράτησης");
        reservationOkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationOkButtonActionPerformed(evt);
            }
        });

        reservationNightClubSelectionLabel.setText("Επιλογή Καταστήματος");

        reservationNightClubSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Επιλέξτε Καταστημα...", "Μας πήραν είδηση..", "Ραντεβού", "13 Φεγγάρια", "Item 4", "Item 5" }));

        reservationCustomerNameLabel.setText("εδώ εμφανιζει το ονομα του πελατη");

        reservationPartyNumberLabel.setText("Αριθμός Ατόμων");

        reservationDateLabel.setText("Επιλογή Ημερομηνίας");

        reservationButtonClose.setText("Άκυρο");
        reservationButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationButtonCloseActionPerformed(evt);
            }
        });

        reservationDateChooser.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(reservationOkButton))
                    .addComponent(reservationCustomerNameLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reservationNightClubSelectionLabel)
                            .addComponent(reservationPartyNumberLabel)
                            .addComponent(reservationDateLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(reservationPartyNumberTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reservationNightClubSelection, 0, 150, Short.MAX_VALUE)
                            .addComponent(reservationDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(reservationButtonClose)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(reservationCustomerNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reservationNightClubSelectionLabel)
                    .addComponent(reservationNightClubSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reservationPartyNumberLabel)
                    .addComponent(reservationPartyNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reservationDateLabel)
                        .addGap(52, 52, 52)
                        .addComponent(reservationOkButton)
                        .addGap(18, 18, 18)
                        .addComponent(reservationButtonClose))
                    .addComponent(reservationDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reservationOkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationOkButtonActionPerformed
        /**
         * Η βάση μέσα στoν πίνακα κράτηση κρατάει μόνο το userId, το clubId, την ημερομηνία
         * κράτησης, των αριθμό θέσεων, και μια ένα status που μας δειχνει αν ειναι ενεργή
         * η κράτηση. Σαν προεπιλογή θα θέτουμε το status με active.
         * 
         * Γενικά στο προγραμμα θα έχουμε πάντα κρατημένο το username του χρήστη,
         * με το username θα παίρνουμε το userId που χρειαζόμαστε υπάρχει η συναρτηση
         * με το clubName που θα παίρνουμε πριν ανοιξει η φορμα για την κράτηση θα 
         * μπορουμε να πάρουμε το clubId υπάρχει η συνάρτηση, την ημερομηνία και
         * των αριθμο θέσεων θα τα παιρνουμε από τη φορμα, και το status απλά θα το 
         * θέτουμε.
         * 
         * 
         */
         
        
       
        CreateBookController controller = new CreateBookController(new ReservationDaoCreate());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = new Date();
        String c = sdf.format(reservationDate);

        try {
            try {
                int seatNumber = Integer.parseInt(reservationPartyNumberTextField.getText());

                Reservation createReservation = controller.createReservationNew(1,2,
                        this.reservationDateChooser.getDate(), "θέση τραπεζιού",
                        seatNumber, "active");
                JOptionPane.showMessageDialog(null, "Η καταχώρηση ήταν επιτυχής",
                        "Success", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Failure",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),
                    "Failure", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_reservationOkButtonActionPerformed

    private void reservationButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationButtonCloseActionPerformed

        JFrame mainFrame = new MainFrame();
        dispose();
        mainFrame.setLocationRelativeTo(this);
        mainFrame.setVisible(true);

    }//GEN-LAST:event_reservationButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton reservationButtonClose;
    private javax.swing.JLabel reservationCustomerNameLabel;
    private com.toedter.calendar.JDateChooser reservationDateChooser;
    private javax.swing.JLabel reservationDateLabel;
    private javax.swing.JComboBox reservationNightClubSelection;
    private javax.swing.JLabel reservationNightClubSelectionLabel;
    private javax.swing.JButton reservationOkButton;
    private javax.swing.JLabel reservationPartyNumberLabel;
    private javax.swing.JTextField reservationPartyNumberTextField;
    // End of variables declaration//GEN-END:variables
}
