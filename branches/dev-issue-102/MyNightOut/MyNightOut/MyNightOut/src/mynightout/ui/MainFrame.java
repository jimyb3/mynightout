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
import mynightout.controllers.DisplayCellarController;
import mynightout.dao.TablesDao;
import mynightout.entity.Cellar;
import mynightout.entity.Tables;
import mynightout.presenters.SelectTableProfilePresenter;

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
        createStoreButton = new javax.swing.JButton();
        createReservationButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        faqButton = new javax.swing.JButton();
        SelectTableButton = new javax.swing.JButton();
        confirmReservationButton = new javax.swing.JButton();
        nightclubLoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyNightOut");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        loginButton.setText("Είσοδος χρήστη");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
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

        faqButton.setText("FAQ/Help");
        faqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqButtonActionPerformed(evt);
            }
        });

        SelectTableButton.setText("Επιλογή τραπεζιού");
        SelectTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectTableButtonActionPerformed(evt);
            }
        });

        confirmReservationButton.setText("<html>Επιβεβαίωση των <br></br>\nστοιχειων της κράτησης</html>");
        confirmReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmReservationButtonActionPerformed(evt);
            }
        });

        nightclubLoginButton.setText("Είσοδος καταστήματος");
        nightclubLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nightclubLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(createReservationButton)
                        .addGap(18, 18, 18)
                        .addComponent(SelectTableButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createStoreButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(faqButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelReservationButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton)))))
                .addGap(0, 67, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(nightclubLoginButton)
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(nightclubLoginButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createReservationButton)
                    .addComponent(SelectTableButton)
                    .addComponent(createStoreButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(faqButton)
                    .addComponent(cancelReservationButton)
                    .addComponent(exitButton))
                .addGap(18, 18, 18)
                .addComponent(confirmReservationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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
        JFrame loginFrame = new UserLoginForm();
        this.dispose();
        loginFrame.setLocationRelativeTo(this);
        loginFrame.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void createReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createReservationButtonActionPerformed
        
        JFrame createBookFrame = new CreateBookForm();
        dispose();
        createBookFrame.setLocationRelativeTo(this);
        createBookFrame.setVisible(true);

    }//GEN-LAST:event_createReservationButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        JFrame editReservationFrame = new EditReservationForm();
        this.dispose();
        editReservationFrame.setLocationRelativeTo(this);
        editReservationFrame.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_editButtonActionPerformed

    private void createStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStoreButtonActionPerformed
        // TODO add your handling code here:
        JFrame StoreRegisterForm = new StoreRegisterForm();
        this.dispose();
        StoreRegisterForm.setLocationRelativeTo(this);
        StoreRegisterForm.setVisible(true);
    }//GEN-LAST:event_createStoreButtonActionPerformed

    private void faqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqButtonActionPerformed
        // TODO add your handling code here:
        JFrame contactAdminForm = new ContactAdminForm();
        
        contactAdminForm.setLocationRelativeTo(this);
        contactAdminForm.setVisible(true);
    }//GEN-LAST:event_faqButtonActionPerformed

    private void SelectTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectTableButtonActionPerformed
        // TODO add your handling code here:

        SelectTableProfilePresenter stpp = new SelectTableProfilePresenter();
        int clubId = 1;
        TablesDao td = new TablesDao();
        Tables t = td.getClubsTables("Vogue");
        try {
            this.dispose();
            stpp.showSelectTableProfile(new SelectTableProfileForm(), t.getFirstRow(), t.getSecondRow(), t.getThirdRow(), t.getFourthRow(), t.getFifthRow(), t.getSixthRow(), clubId);
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SelectTableButtonActionPerformed

    private void confirmReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmReservationButtonActionPerformed
        // TODO add your handling code here:
        ConfirmReservationInfoForm crif = new ConfirmReservationInfoForm();
        crif.customerLastNameLabel.setText("Λαλακίδης");
        crif.customerNameLabel.setText("Λαλάκης");
        crif.nightClubNameLabel.setText("Vogue");
        crif.reservationDateLabel.setText("01/01/2014");
        crif.reservationTableLabel.setText("Α3");
        this.dispose();
        crif.setVisible(true);
    }//GEN-LAST:event_confirmReservationButtonActionPerformed

    private void nightclubLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nightclubLoginButtonActionPerformed
        JFrame clubLoginFrame = new NightclubLoginForm();
        this.dispose();
        clubLoginFrame.setLocationRelativeTo(this);
        clubLoginFrame.setVisible(true);
    }//GEN-LAST:event_nightclubLoginButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JButton SelectTableButton;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JButton confirmReservationButton;
    private javax.swing.JButton createReservationButton;
    private javax.swing.JButton createStoreButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton faqButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton nightclubLoginButton;
    // End of variables declaration//GEN-END:variables
}
