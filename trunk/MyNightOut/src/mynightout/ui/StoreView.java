/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mynightout.dao.NightClubDao;
import mynightout.dao.TablesDao;
import mynightout.entity.Tables;
import mynightout.presenters.SelectTableProfilePresenter;

/**
 *
 * @author Mustaine
 */
public class StoreView extends javax.swing.JFrame {

    private String currentUserName;

    /**
     * Creates new form StoreView
     */
    public StoreView() {
        initComponents();
    }

    public StoreView(String cUserName) {
        currentUserName = cUserName;
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

        storeName = new javax.swing.JLabel();
        StorePic = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        reservBtn = new javax.swing.JButton();
        addressLabel = new javax.swing.JLabel();
        addressTOLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        contactTOLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        reservationDateChooser = new com.toedter.calendar.JDateChooser();
        telTOLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        storeName.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        storeName.setText("Πληροφορίες Καταστήματος");

        StorePic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        backBtn.setText("Πίσω");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        reservBtn.setText("Κράτηση");
        reservBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservBtnActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addressLabel.setText("Διεύθυνση Μαγαζιού:");

        addressTOLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressTOLabel.setForeground(new java.awt.Color(51, 51, 255));

        contactLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contactLabel.setText("Επικοινωνία:");

        contactTOLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactTOLabel.setForeground(new java.awt.Color(51, 0, 255));

        messageLabel.setText("Δώσε ημερομηνία κράτησης:");

        telTOLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telTOLabel.setForeground(new java.awt.Color(0, 0, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(StorePic, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reservBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reservationDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(messageLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addressTOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contactTOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(contactLabel)
                                                .addComponent(telTOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(20, 20, 20)))))
                            .addComponent(addressLabel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(addressLabel)
                .addGap(18, 18, 18)
                .addComponent(addressTOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telTOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactTOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(messageLabel)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reservationDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reservBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(StorePic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        this.dispose();

    }//GEN-LAST:event_backBtnActionPerformed

    private void reservBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservBtnActionPerformed
        // TODO add your handling code here:
        String choice = storeName.getText();

        if (new NightClubDao().isNightClubOpenByDate(choice, reservationDateChooser.getDate()) && new NightClubDao().isNightClubOpenByWeekDay(choice, reservationDateChooser.getDate())) {
            SelectTableProfilePresenter stpp = new SelectTableProfilePresenter();

            int clubId = new NightClubDao().getNightClubDataByClubName(choice).getClubId();
            TablesDao td = new TablesDao();
            Tables t = td.getClubsTables(choice);
            try {
                stpp.showSelectTableProfile(new SelectTableProfileForm(), t.getFirstRow(),
                        t.getSecondRow(), t.getThirdRow(), t.getFourthRow(), t.getFifthRow(),
                        t.getSixthRow(), clubId, reservationDateChooser.getDate(), currentUserName);
            } catch (ParseException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            String DATE_FORMAT = "dd/MM/yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
            JOptionPane.showMessageDialog(null, "Το κατάστημα είναι κλειστό στις "+sdf.format(reservationDateChooser.getDate()), "Failure", JOptionPane.INFORMATION_MESSAGE);
            

        }
    }//GEN-LAST:event_reservBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel StorePic;
    private javax.swing.JLabel addressLabel;
    public javax.swing.JLabel addressTOLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel contactLabel;
    public javax.swing.JLabel contactTOLabel;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton reservBtn;
    private com.toedter.calendar.JDateChooser reservationDateChooser;
    public javax.swing.JLabel storeName;
    public javax.swing.JLabel telTOLabel;
    // End of variables declaration//GEN-END:variables
}
