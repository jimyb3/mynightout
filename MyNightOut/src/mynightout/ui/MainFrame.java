/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import javax.swing.JFrame;
import mynightout.controllers.EditReservationController;
import mynightout.dao.ReservationDaoEdit;

/**
 *
 * @author Dimitris
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        cancelReservationButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        checkFullnessButton = new javax.swing.JButton();
        createStoreButton = new javax.swing.JButton();
        createReservationButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        FAQButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyNightOut");

        cancelReservationButton.setText("Ακύρωση Κράτησης");
        cancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Κλείσιμο");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        checkFullnessButton.setText("Πληρότητα Καταστήματος");
        checkFullnessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFullnessButtonActionPerformed(evt);
            }
        });

        createStoreButton.setText("Δημιουργία Καταστήματος");
        createStoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStoreButtonActionPerformed(evt);
            }
        });

        createReservationButton.setText("Δημιουργία Κράτησης");
        createReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReservationButtonActionPerformed(evt);
            }
        });

        editButton.setText("Επεξεργασία Κράτησης");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Διαγραφή Κράτησης");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        FAQButton.setText("FAQ/Help");
        FAQButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(cancelReservationButton)
                        .addGap(5, 5, 5)
                        .addComponent(exitButton)
                        .addGap(5, 5, 5)
                        .addComponent(loginButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(checkFullnessButton)
                        .addGap(5, 5, 5)
                        .addComponent(createStoreButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(createReservationButton)
                        .addGap(5, 5, 5)
                        .addComponent(editButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(FAQButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelReservationButton)
                    .addComponent(exitButton)
                    .addComponent(loginButton))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkFullnessButton)
                    .addComponent(createStoreButton))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createReservationButton)
                    .addComponent(editButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAQButton)))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservationButtonActionPerformed
        // TODO add your handling code here:
        JFrame cancelBookFrame = new CancelBookForm();
        this.dispose();
        cancelBookFrame.setLocationRelativeTo(this);
        cancelBookFrame.setVisible(true);
    }//GEN-LAST:event_cancelReservationButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        JFrame loginFrame = new LoginForm();
        this.dispose();
        loginFrame.setLocationRelativeTo(this);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void checkFullnessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFullnessButtonActionPerformed
        // TODO add your handling code here:
        JFrame checkFullnessFrame = new CheckFullnessForm();
        this.dispose();
        checkFullnessFrame.setLocationRelativeTo(this);
        checkFullnessFrame.setVisible(true);
    }//GEN-LAST:event_checkFullnessButtonActionPerformed

    private void createReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createReservationButtonActionPerformed

        JFrame createBookFrame = new CreateBookForm();
        dispose();
        createBookFrame.setLocationRelativeTo(this);
        createBookFrame.setVisible(true);

    }//GEN-LAST:event_createReservationButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
     JFrame editReservationFrame=new EditReservationForm();
     this.dispose();
     editReservationFrame.setLocationRelativeTo(this);
     editReservationFrame.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
     JFrame deleteReservationFrame=new DeleteReservationForm();
     this.dispose();
     deleteReservationFrame.setLocationRelativeTo(this);
     deleteReservationFrame.setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void createStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStoreButtonActionPerformed
        // TODO add your handling code here:
        JFrame StoreRegisterForm = new StoreRegisterForm();
        this.dispose();
        StoreRegisterForm.setLocationRelativeTo(this);
        StoreRegisterForm.setVisible(true);
    }//GEN-LAST:event_createStoreButtonActionPerformed

    private void FAQButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQButtonActionPerformed
        // TODO add your handling code here:
        JFrame contactAdminForm=new ContactAdminForm();
     
     contactAdminForm.setLocationRelativeTo(this);
     contactAdminForm.setVisible(true);
    }//GEN-LAST:event_FAQButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FAQButton;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JButton checkFullnessButton;
    private javax.swing.JButton createReservationButton;
    private javax.swing.JButton createStoreButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
}
