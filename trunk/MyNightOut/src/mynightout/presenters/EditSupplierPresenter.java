/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.presenters;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mynightout.dao.NightClubDao;
import mynightout.dao.SupplierDao;
import mynightout.dao.SupplyDao;
import mynightout.entity.Supplier;
import mynightout.ui.EditSupplierForm;
import mynightout.ui.NightclubMainForm;

/**
 *
 * @author Dimitris
 */
public class EditSupplierPresenter {

    public void editSupplier(final EditSupplierForm form, final String clubName) {
        List suppliersList = new SupplierDao().getAllSuppliers();
        final int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
        final int suppliersTotal = suppliersList.size();
        final Container pane = form.getContentPane();

        final JCheckBox[] checkBox = new JCheckBox[suppliersTotal + 1];
        JPanel[] p = new JPanel[suppliersTotal + 9];
        int x = 40;

        Supplier s = new Supplier();
        int i = 0;
        for (Object o : suppliersList) {
            s = (Supplier) o;
            checkBox[i] = new JCheckBox(s.getFirstName() + " " + s.getLastName());
            checkBox[i].setName("" + s.getSupplierId());
            p[i] = new JPanel();
            p[i].add(checkBox[i]);
            p[i].setSize(300, 30);
            p[i].setLocation(0, x);
            x = x + 40;
            pane.add(p[i]);
            i++;
        }

        JButton okButton = new JButton("Αποθήκευση");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new SupplyDao().deleteSuppliersByClubId(clubId);
                for (int i = 0; i < suppliersTotal; i++) {
                    if (checkBox[i].isSelected()) {
                        new SupplyDao().insertNewSupply(clubId, Integer.parseInt(checkBox[i].getName()));
                    }
                }
                form.dispose();
                JOptionPane.showMessageDialog(null, "Οι προμηθευτές που επέλεξες αποθηκεύθηκαν.", "Success", JOptionPane.INFORMATION_MESSAGE);
                NightclubMainForm nightclubMainFrame = new NightclubMainForm(clubName);
                nightclubMainFrame.setLocationRelativeTo(form);
                nightclubMainFrame.setVisible(true);
            }
        });
        JButton backButton = new JButton("Πίσω");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form.dispose();
                NightclubMainForm nightclubMainFrame = new NightclubMainForm(clubName);
                nightclubMainFrame.setLocationRelativeTo(form);
                nightclubMainFrame.setVisible(true);
            }
        });
        p[12] = new JPanel();
        p[12].add(okButton);
        p[12].add(backButton);
        p[12].setSize(151, 150);
        p[12].setLocation(450, 30);
        pane.add(p[12]);
        form.setSize(650, 500);
        form.setVisible(true);
    }

}
