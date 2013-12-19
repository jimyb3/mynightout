/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import javax.swing.JOptionPane;
import mynightout.controllers.CreateNewUserFormController;
import mynightout.dao.UserDao;
import mynightout.entity.User;
import mynightout.util.JTextFieldLimit;

/**
 *
 * @author ioanna
 */
public class CreateNewUserForm extends javax.swing.JFrame {

    /**
     * Creates new form CreateNewUserForm
     */
    public CreateNewUserForm() {
        initComponents();
        userNameField.setDocument(new JTextFieldLimit(15));
        passwordField.setDocument(new JTextFieldLimit(15));
        customerNameField.setDocument(new JTextFieldLimit(30));
        customerLastNameField.setDocument(new JTextFieldLimit(30));
        telephoneNumField.setDocument(new JTextFieldLimit(10));
        eMailField.setDocument(new JTextFieldLimit(40));
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
        userNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        customerLastNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        telephoneNumField = new javax.swing.JTextField();
        eMailField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        createUserButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(489, 281));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 111, -1, -1));

        userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                userNameFieldFocusLost(evt);
            }
        });
        getContentPane().add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 108, 107, -1));

        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 149, -1, -1));

        jLabel3.setText("Όνομα");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 33, -1, -1));

        jLabel4.setText("Επώνυμο");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 73, -1, -1));

        jLabel5.setText("<html>Αριθμός <br></br>τηλεφώνου</html>");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 184, -1, -1));

        jLabel6.setText("E-mail");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        getContentPane().add(customerNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 30, 107, -1));
        getContentPane().add(customerLastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 70, 107, -1));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 146, 107, -1));
        getContentPane().add(telephoneNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 184, 107, -1));
        getContentPane().add(eMailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 107, -1));

        backButton.setText("Πίσω");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 98, 162, -1));

        resetButton.setText("Καθαρισμός πεδίων");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 64, 162, -1));

        createUserButton.setText("Δημιουργία λογαριασμού");
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(createUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 29, 162, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame mainFrame = new MainFrame();
        this.dispose();
        mainFrame.setLocationRelativeTo(this);
        mainFrame.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        customerLastNameField.setText("");
        customerNameField.setText("");
        eMailField.setText("");
        passwordField.setText("");
        telephoneNumField.setText("");
        userNameField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserButtonActionPerformed
        try {
            CreateNewUserFormController createNewUserFormController = new CreateNewUserFormController();
            User user = createNewUserFormController.createUser(userNameField.getText(), passwordField.getText(), customerNameField.getText(),
                    customerLastNameField.getText(), telephoneNumField.getText(), eMailField.getText());
            JOptionPane.showMessageDialog(null, "ο λογαριαμός δημιουργήθηκε", "Καλώς ήρθατε στο my night out", JOptionPane.INFORMATION_MESSAGE);
            MainFrame mainFrame = new MainFrame();
            this.dispose();
            mainFrame.setLocationRelativeTo(this);
            mainFrame.setVisible(true);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "Failure", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_createUserButtonActionPerformed

    private void userNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userNameFieldFocusLost
        UserDao userDao = new UserDao();
        User user = userDao.getUserDataByUsername(userNameField.getText());
        if (user.getUsername().compareTo(userNameField.getText()) == 0) {
            userNameField.setText("");
            JOptionPane.showMessageDialog(null, "Το συγκεκριμένο username υπάρχει ήδη. Παρακαλώ διαλέξτε διαφορετικό", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_userNameFieldFocusLost

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
            java.util.logging.Logger.getLogger(CreateNewUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createUserButton;
    private javax.swing.JTextField customerLastNameField;
    private javax.swing.JTextField customerNameField;
    private javax.swing.JTextField eMailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField telephoneNumField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
