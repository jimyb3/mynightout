/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mynightout.controllers.EditReservationController;
import mynightout.dao.ReservationDaoEdit;

/**
 *
 * @author Maria
 */
public class EditReservationForm extends javax.swing.JFrame {

    private String currentUserName;

    /**
     * Creates new form EditReservationForm
     */
    public EditReservationForm(String cUserName) {
        currentUserName = cUserName;
        initComponents();
    }
public EditReservationForm() {
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

        numberOfPeopleNew = new javax.swing.JTextField();
        reservationId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        storeName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cancelbutton = new javax.swing.JButton();
        reservationDateNew = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reservationDate = new javax.swing.JTextField();
        editbutton = new javax.swing.JButton();
        numOfPeople = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        numberOfPeopleNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfPeopleNewActionPerformed(evt);
            }
        });

        reservationId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationIdActionPerformed(evt);
            }
        });

        jLabel11.setText("Εδώ βάλτε τις αλλαηγές που θέλετε να κάνετε");

        jLabel4.setText("Ημερομηνία κράτησης");

        jLabel3.setText("ID κράτησης");

        jLabel6.setText("Εδώ βάλτε τα δεδομένα της κράτησης που έχετε κανει");

        customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Ημερομηνία κράτησης");

        jLabel2.setText("Όνομα καταστήματος");

        jLabel10.setText("Πλήθος ατόμων");

        cancelbutton.setText("Ακύρωση");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        reservationDateNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationDateNewActionPerformed(evt);
            }
        });

        jLabel1.setText("Όνομα πελάτη");

        jLabel5.setText("Πλήθος ατόμων");

        editbutton.setText("Επεξεργασία");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        numOfPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfPeopleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(storeName)
                            .addComponent(reservationId)
                            .addComponent(numOfPeople)
                            .addComponent(reservationDate)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reservationDateNew)
                            .addComponent(numberOfPeopleNew))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reservationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reservationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reservationDateNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numOfPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(numberOfPeopleNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(editbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelbutton)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberOfPeopleNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfPeopleNewActionPerformed
        int newNumber = 0;

        String newNumberString = Integer.toString(newNumber);
        newNumberString = numberOfPeopleNew.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfPeopleNewActionPerformed

    private void reservationIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationIdActionPerformed
        String Id;
        Id = reservationId.getText();   // TODO add your handling code here:
    }//GEN-LAST:event_reservationIdActionPerformed

    private void customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        UserMainForm mainUserFrame = new UserMainForm(currentUserName);
        this.dispose();
        mainUserFrame.setLocationRelativeTo(this);
        mainUserFrame.setVisible(true);
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void reservationDateNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationDateNewActionPerformed
        String newDate;
        newDate = reservationDateNew.getText();  // TODO add your handling code here:
    }//GEN-LAST:event_reservationDateNewActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed

        EditReservationController controller = new EditReservationController(new ReservationDaoEdit());

        JOptionPane.showMessageDialog(null, "Τα νέα στοιχεία της κράτησης ειναι :" + reservationDateNew.getText() + "  " + numberOfPeopleNew.getText());
        UserMainForm mainUserFrame = new UserMainForm(currentUserName);
        this.dispose();
        mainUserFrame.setLocationRelativeTo(this);
        mainUserFrame.setVisible(true);
    }//GEN-LAST:event_editbuttonActionPerformed

    private void numOfPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfPeopleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numOfPeopleActionPerformed

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
            java.util.logging.Logger.getLogger(EditReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditReservationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbutton;
    private javax.swing.JTextField customerName;
    private javax.swing.JButton editbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField numOfPeople;
    private javax.swing.JTextField numberOfPeopleNew;
    private javax.swing.JTextField reservationDate;
    private javax.swing.JTextField reservationDateNew;
    private javax.swing.JTextField reservationId;
    private javax.swing.JTextField storeName;
    // End of variables declaration//GEN-END:variables
}
