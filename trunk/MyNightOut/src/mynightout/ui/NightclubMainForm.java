/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import javax.swing.JFrame;
import mynightout.controllers.DisplayCellarController;
import mynightout.entity.Cellar;

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
        jLabel1 = new javax.swing.JLabel();
        clubNameLabel = new javax.swing.JLabel();
        setDaysClosedButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        setClosedDatesButton = new javax.swing.JButton();
        showCellarForm = new javax.swing.JButton();
        showSuppliersButton = new javax.swing.JButton();
        displayCellarButton = new javax.swing.JButton();
        changeNightClubTableProfileButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        jLabel1.setText("Διαχείρηση καταστήματος ");

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

        showCellarForm.setText("Εμφάνιση κελαριού");
        showCellarForm.setEnabled(false);
        showCellarForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCellarFormActionPerformed(evt);
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

        jButton1.setText("Αποσύνδεση");
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clubNameLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(exitButton)
                            .addComponent(checkFullnessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setDaysClosedButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showSuppliersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(112, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(displayCellarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(showCellarForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changeNightClubTableProfileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(setClosedDatesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFullnessButton)
                    .addComponent(showCellarForm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(displayCellarButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(jButton1))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void checkFullnessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFullnessButtonActionPerformed
        CheckFullnessForm checkFullnessFrame = new CheckFullnessForm(currentClubName);
        this.dispose();
        checkFullnessFrame.setLocationRelativeTo(this);
        checkFullnessFrame.setVisible(true);
    }//GEN-LAST:event_checkFullnessButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        clubNameLabel.setText(currentClubName);
    }//GEN-LAST:event_formWindowActivated

    private void setDaysClosedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDaysClosedButtonActionPerformed
        SetNightClubDaysClosedForm sncdcf = new SetNightClubDaysClosedForm(currentClubName);
        this.dispose();
        sncdcf.setLocationRelativeTo(this);
        sncdcf.setVisible(true);
    }//GEN-LAST:event_setDaysClosedButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DeleteReservationForm deleteReservationFrame = new DeleteReservationForm(currentClubName);
        this.dispose();
        deleteReservationFrame.setLocationRelativeTo(this);
        deleteReservationFrame.setVisible(true);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void setClosedDatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setClosedDatesButtonActionPerformed
        SetNightClubClosedDatesForm snccdf = new SetNightClubClosedDatesForm(currentClubName);
        snccdf.setLocationRelativeTo(this);
        this.dispose();
        snccdf.setVisible(true);
    }//GEN-LAST:event_setClosedDatesButtonActionPerformed

    private void showCellarFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCellarFormActionPerformed
        ShowCellarForm showCellarFrame = new ShowCellarForm(currentClubName);
        this.dispose();
        showCellarFrame.setLocationRelativeTo(this);
        showCellarFrame.setVisible(true);
    }//GEN-LAST:event_showCellarFormActionPerformed

    private void showSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSuppliersButtonActionPerformed
        ShowSupplierForm showSuppliersFrame = new ShowSupplierForm(currentClubName);
        this.dispose();
        showSuppliersFrame.setLocationRelativeTo(this);
        showSuppliersFrame.setVisible(true);
    }//GEN-LAST:event_showSuppliersButtonActionPerformed

    private void displayCellarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCellarButtonActionPerformed
        String clubName = "Vogue";
        DisplayCellarController dcc = new DisplayCellarController();
        Cellar cellar = dcc.displayCellar(clubName);
        DisplayCellarForm dcf = new DisplayCellarForm(currentClubName);
        this.dispose();
        dcf.cellarTable.setValueAt(cellar.getVodka(), 0, 1);
        dcf.cellarTable.setValueAt(cellar.getWhiskey(), 1, 1);
        dcf.cellarTable.setValueAt(cellar.getWine(), 2, 1);
        dcf.cellarTable.setValueAt(cellar.getLiqueur(), 3, 1);
        dcf.cellarTable.setValueAt(cellar.getRum(), 4, 1);
        dcf.cellarTable.setValueAt(cellar.getTequila(), 5, 1);
        dcf.cellarTable.setValueAt(cellar.getBeer(), 6, 1);
        dcf.secretClubNameLabel.setText(clubName);
        dcf.setLocationRelativeTo(this);
        dcf.setVisible(true);
    }//GEN-LAST:event_displayCellarButtonActionPerformed

    private void changeNightClubTableProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNightClubTableProfileButtonActionPerformed
        this.dispose();
        ChangeNightClubTableProfileForm ctpf = new ChangeNightClubTableProfileForm(currentClubName);
        ctpf.setLocationRelativeTo(this);
        ctpf.setVisible(true);
    }//GEN-LAST:event_changeNightClubTableProfileButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainFrame mainForm = new MainFrame();
        this.dispose();
        mainForm.setLocationRelativeTo(this);
        mainForm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton setClosedDatesButton;
    private javax.swing.JButton setDaysClosedButton;
    private javax.swing.JButton showCellarForm;
    private javax.swing.JButton showSuppliersButton;
    // End of variables declaration//GEN-END:variables
}
