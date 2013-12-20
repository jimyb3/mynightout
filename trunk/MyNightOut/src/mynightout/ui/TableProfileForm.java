/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mynightout.dao.NightClubDao;
import mynightout.dao.TablesDao;
import mynightout.entity.Tables;

/**
 *
 * @author Dimitris
 */
public class TableProfileForm extends javax.swing.JFrame implements ISelectTableForm {

    private String currentClubName;

    /**
     * Creates new form SelectTableReservationForm
     */
    public TableProfileForm() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/appicon.png")).getImage());
    }

    public TableProfileForm(String nightClubName) {
        currentClubName = nightClubName;
        initComponents();
    }

    public void begin() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        okButton.setText("Ναι");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        noButton.setText("Όχι");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Είναι η κατοψη όπως θέλετε;");

        jLabel2.setText("jLabel2");
        jLabel2.setVisible(false);

        jLabel3.setText("jLabel3");
        jLabel3.setVisible(false);

        jLabel4.setText("jLabel4");
        jLabel4.setVisible(false);

        jLabel5.setText("jLabel5");
        jLabel5.setVisible(false);

        jLabel6.setText("jLabel6");
        jLabel6.setVisible(false);

        jLabel7.setText("jLabel7");
        jLabel7.setVisible(false);

        jLabel8.setText("jLabel8");
        jLabel8.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noButton))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noButton)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        this.dispose();
        ChangeNightClubTableProfileForm changeNightClubTableProfileForm = new ChangeNightClubTableProfileForm(currentClubName);
        changeNightClubTableProfileForm.setLocationRelativeTo(this);
        changeNightClubTableProfileForm.setVisible(true);
    }//GEN-LAST:event_noButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        TablesDao tableDao = new TablesDao();
        int clubId = new NightClubDao().getNightClubDataByClubName(jLabel8.getText()).getClubId();
        Tables tables = new Tables(clubId, Integer.parseInt(jLabel2.getText()),
                Integer.parseInt(jLabel3.getText()), Integer.parseInt(jLabel4.getText()),
                Integer.parseInt(jLabel5.getText()), Integer.parseInt(jLabel6.getText()),
                Integer.parseInt(jLabel7.getText()));
        if (tables.equals(tableDao.updateClubsTables(jLabel8.getText(), Integer.parseInt(jLabel2.getText()),
                Integer.parseInt(jLabel3.getText()), Integer.parseInt(jLabel4.getText()),
                Integer.parseInt(jLabel5.getText()), Integer.parseInt(jLabel6.getText()),
                Integer.parseInt(jLabel7.getText())))) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Περάστηκαν οι αλλαγές.", "Success", JOptionPane.INFORMATION_MESSAGE);
            NightclubMainForm nightclubMainForm = new NightclubMainForm(currentClubName);
            nightclubMainForm.setLocationRelativeTo(this);
            nightclubMainForm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Πρόβλημα", "Failure", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TableProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableProfileForm().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JButton noButton;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
