/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.ui;

import javax.swing.JFrame;
import mynightout.presenters.Presenter;

/**
 *
 * @author panos
 */
public class ContactAdminForm extends javax.swing.JFrame {

    /**
     * Creates new form ContactAdminForm
     */
    public ContactAdminForm() {
        initComponents();
        
        
        this.FAQPanel.setVisible(false);
        this.SendHelpPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        ReserveHelp = new javax.swing.JButton();
        LogHelp = new javax.swing.JButton();
        FAQPanel = new javax.swing.JPanel();
        FAQHelp = new javax.swing.JTextField();
        Other = new javax.swing.JButton();
        SendHelpPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        HelpText = new javax.swing.JTextField();
        SendHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Frequently Asked Questions ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Αντιμετωπίζω πρόβλημα με:");

        BackButton.setText("Πίσω");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ReserveHelp.setText("Κράτηση");
        ReserveHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveHelpActionPerformed(evt);
            }
        });

        LogHelp.setText("Σύνδεση");
        LogHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogHelpActionPerformed(evt);
            }
        });

        FAQHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAQHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FAQPanelLayout = new javax.swing.GroupLayout(FAQPanel);
        FAQPanel.setLayout(FAQPanelLayout);
        FAQPanelLayout.setHorizontalGroup(
            FAQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FAQPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FAQHelp, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );
        FAQPanelLayout.setVerticalGroup(
            FAQPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FAQPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FAQHelp, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        Other.setText("Άλλο:");
        Other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherActionPerformed(evt);
            }
        });

        jLabel3.setText("Περιγράψτε το πρόβλημα που αντιμετωπίζετε:");

        SendHelp.setText("Αποστολή");
        SendHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SendHelpPanelLayout = new javax.swing.GroupLayout(SendHelpPanel);
        SendHelpPanel.setLayout(SendHelpPanelLayout);
        SendHelpPanelLayout.setHorizontalGroup(
            SendHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SendHelpPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SendHelpPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SendHelp)
                .addGap(133, 133, 133))
            .addComponent(HelpText, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        SendHelpPanelLayout.setVerticalGroup(
            SendHelpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SendHelpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HelpText, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(SendHelp))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(ReserveHelp)
                .addGap(57, 57, 57)
                .addComponent(LogHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Other)
                .addGap(190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(128, 128, 128)))
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FAQPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SendHelpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ReserveHelp)
                            .addComponent(LogHelp)
                            .addComponent(Other))
                        .addGap(33, 33, 33)
                        .addComponent(FAQPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SendHelpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        JFrame mainFrame = new MainFrame();
        this.dispose();
        mainFrame.setLocationRelativeTo(this);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ReserveHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveHelpActionPerformed
        // TODO add your handling code here:

        this.FAQHelp.setText("Βεβαιωθείτε οτι δώσατε σωστά στοιχεία μαγαζιού και κράτησης και εισήλθατε με έγκυρο λογαριασμό.");

        this.FAQPanel.setVisible(true);
    }//GEN-LAST:event_ReserveHelpActionPerformed

    private void LogHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogHelpActionPerformed
        // TODO add your handling code here:
        this.FAQHelp.setText("Βεβαιωθείτε οτι δώσατε σωστό όνομα χρήστη και κωδικό. Αν δεν θυμάστε τα στοιχεία σας επικοινωνήστε με τους διαχειριστές του συστήματος για ανάκτηση των στοιχείων σας.");
        this.FAQPanel.setVisible(true);

    }//GEN-LAST:event_LogHelpActionPerformed

    private void OtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherActionPerformed
        // TODO add your handling code here:
        this.SendHelpPanel.setVisible(true);
    }//GEN-LAST:event_OtherActionPerformed

    private void SendHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendHelpActionPerformed
        // TODO add your handling code here:
        Presenter prsreg=new Presenter();
        
        prsreg.sendHelp(this, HelpText.getText());
        
    }//GEN-LAST:event_SendHelpActionPerformed

    private void FAQHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAQHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FAQHelpActionPerformed

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
            java.util.logging.Logger.getLogger(ContactAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactAdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactAdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField FAQHelp;
    private javax.swing.JPanel FAQPanel;
    private javax.swing.JTextField HelpText;
    private javax.swing.JButton LogHelp;
    private javax.swing.JButton Other;
    private javax.swing.JButton ReserveHelp;
    private javax.swing.JButton SendHelp;
    private javax.swing.JPanel SendHelpPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    public void display(String επιτυχής_Αποστολή) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
