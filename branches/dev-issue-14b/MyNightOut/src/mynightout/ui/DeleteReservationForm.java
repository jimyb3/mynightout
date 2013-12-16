/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mynightout.controllers.DeleteReservationController;
import mynightout.dao.ReservationDaoDelete;
import mynightout.entity.ReservationPk;

/**
 *
 * @author Maria
 */
public class DeleteReservationForm extends javax.swing.JFrame {
private String currentClubName;
    /**
     * Creates new form DeleteReservationForm
     */
    public DeleteReservationForm() {
        initComponents();
    }
public DeleteReservationForm(String nightClubName) {
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

        Cancel = new javax.swing.JButton();
        GivenId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        givenClubName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        GivenId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GivenIdActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Όνομα Μαγαζιού");

        givenClubName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                givenClubNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GivenId, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(givenClubName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cancel)
                            .addComponent(Delete))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(givenClubName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GivenId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Delete)
                .addGap(18, 18, 18)
                .addComponent(Cancel)
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
       JFrame mainNightClubFrame=new NightclubMainForm(currentClubName);
            this.dispose();
            mainNightClubFrame.setLocationRelativeTo(this);
            mainNightClubFrame.setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed

    private void GivenIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GivenIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GivenIdActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DeleteReservationController controller=new DeleteReservationController(new ReservationDaoDelete());
        try{
            int reservationId=Integer.parseInt(GivenId.getText());
           //int clubName=Integer.parseInt(givenClubName.getText());
            ReservationPk deleteReservation=controller.deleteReservation( givenClubName.getText(),reservationId);
            JOptionPane.showMessageDialog(null,"Το Id της διεγραμένης κράτησης ειναι :" +GivenId.getText(),
                "Success",JOptionPane.INFORMATION_MESSAGE);
            JFrame mainNightClubFrame=new NightclubMainForm(currentClubName);
            this.dispose();
            mainNightClubFrame.setLocationRelativeTo(this);
            mainNightClubFrame.setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),
                "Failure",JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_DeleteActionPerformed

    private void givenClubNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_givenClubNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_givenClubNameActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteReservationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField GivenId;
    private javax.swing.JTextField givenClubName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
