package mynightout.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import mynightout.dao.NightClubDao;
import mynightout.entity.Nightclub;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Mustaine
 */
public class StoresForm extends javax.swing.JFrame {

    private final static int button_width = 145;        // button width
    private final static int button_height = 140;        // button height
    private final static int horizontalGap = 10;         // horizontal gap in button
    private final static int verticalGap = 10;         // verticle gap in button
    private final static int numberOfColumns = 4;          // number of colums in the button panel
    private final static int fontSize = 11;         // font size of button name
    private final static int fontType = Font.BOLD;  // font type
    private final static String fontName = "Thoma";    // font name
    private final static Color fontColor = new Color(0, 51, 255);  // font colot
    public static String mainMenuDesc[] = {"Stages", "Clubs/Bars", "Alternative"};
    private static List list;
    
    private String currentUserName;
    
public StoresForm(String cUserName) {
        currentUserName = cUserName;
        initComponents();
    }
    
    
    public StoresForm() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (Exception ex) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_main = new javax.swing.JPanel();
        btn_exit = new javax.swing.JButton();
        jsc_item = new javax.swing.JScrollPane();
        pnl_button = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnl_main.setBackground(new java.awt.Color(140, 205, 250));
        pnl_main.setForeground(new java.awt.Color(140, 205, 250));
        pnl_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        pnl_main.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 120, 50));

        jsc_item.setBackground(new java.awt.Color(140, 205, 250));
        jsc_item.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jsc_item.setAutoscrolls(true);

        pnl_button.setBackground(new java.awt.Color(102, 153, 255));
        pnl_button.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(255, 0, 51)));
        pnl_button.setForeground(new java.awt.Color(140, 205, 250));
        pnl_button.setAutoscrolls(true);
        pnl_button.setEnabled(false);
        pnl_button.setOpaque(false);
        pnl_button.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jsc_item.setViewportView(pnl_button);

        pnl_main.add(jsc_item, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 650, 270));

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        pnl_main.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 120, 50));

        jLabel1.setText("jLabel1");
        pnl_main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(691, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        addMainMenue();
    }//GEN-LAST:event_formWindowOpened

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        //System.exit(0);
        this.dispose();
        JFrame mainUserFrame = new UserMainForm(currentUserName);
        this.dispose();
        mainUserFrame.setLocationRelativeTo(this);
        mainUserFrame.setVisible(true);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        addMainMenue();
    }//GEN-LAST:event_btn_backActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoresForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jsc_item;
    private javax.swing.JPanel pnl_button;
    private javax.swing.JPanel pnl_main;
    // End of variables declaration//GEN-END:variables

    private void addMainMenue() {

        pnl_button.removeAll();
        repaint();

        Image img, sub;
        ImageIcon icon;
        String imagePath, imag = "/com/images/";

        List<String> menue = new ArrayList();
        List<String> itemName = new ArrayList();

        for (int size = 0; size < mainMenuDesc.length; size++) {
            menue.add(mainMenuDesc[size]);
            itemName.add(mainMenuDesc[size]);
        }

        JButton[] buttons = new JButton[menue.size()];

        for (int i = 0; i < buttons.length; i++) {

            imagePath = imag + menue.get(i).toString() + ".jpeg";

            URL url = getClass().getResource(imagePath);
//                System.out.println(imagePath +"   Get Res : " +getClass().getResource(imagePath));

            if (url != null) {
                img = Toolkit.getDefaultToolkit().getImage(url);
                sub = img.getScaledInstance(button_width - 8, button_height - 30, Image.SCALE_FAST);
                icon = new ImageIcon(sub);
            } else {
                icon = new ImageIcon();
            }

            buttons[i] = new JButton(itemName.get(i).toString(), icon);
            buttons[i].setVerticalTextPosition(AbstractButton.BOTTOM);
            buttons[i].setHorizontalTextPosition(AbstractButton.CENTER);

            buttons[i].setBorder(javax.swing.BorderFactory.createEtchedBorder());
            buttons[i].setFont(new java.awt.Font("Tahoma", 1, 13));
            buttons[i].setForeground(new java.awt.Color(0, 51, 255));

            buttons[i].setActionCommand(menue.get(i).toString());
            buttons[i].addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    String choice = e.getActionCommand();
                    JOptionPane.showMessageDialog(null, choice, "Success", JOptionPane.INFORMATION_MESSAGE);
                    addSubmenue(choice);
                }
            });
        }

        int b = 0;
        int vGap = verticalGap;
        int hGap = horizontalGap;
        int bLength = buttons.length;
        int bRows = bLength / numberOfColumns + 1;

        L1:
        for (int j = 0; j < bRows; j++) {
            vGap = 10;
            for (int k = 0; k < numberOfColumns; k++) {

                pnl_button.add(buttons[b], new org.netbeans.lib.awtextra.AbsoluteConstraints(vGap, hGap, button_width, button_height));
                repaint();
                vGap += button_width + verticalGap;
                b++;
                if (b >= bLength) {
                    break L1;
                }
            }
            hGap += button_height + horizontalGap;
        }
        pack();
    }

    private void addSubmenue(String choice) {

        pnl_button.removeAll();
        repaint();

        Image img, sub;
        ImageIcon icon;
        String imagePath, imag = "/com/images/";

        List<String> menue = new ArrayList();
        List<String> itemName = new ArrayList();

        String[] list = getSubMenu(choice);
        // String subCode[]  =   (String[]) list.get(0);
        // String subDesc[]  =   (String[]) list.get(1);

        for (int i = 1; i < list.length; i++) {
            menue.add(list[i]);
            itemName.add(list[i]);
        }

        JButton[] buttons = new JButton[menue.size()];

        for (int i = 0; i < buttons.length; i++) {

            imagePath = imag + menue.get(i).toString() + ".jpeg";

            URL url = getClass().getResource(imagePath);
//                System.out.println(imagePath +"   Get Reso : " +getClass().getResource(imagePath));

            if (url != null) {
                img = Toolkit.getDefaultToolkit().getImage(url);
                sub = img.getScaledInstance(button_width - 8, button_height - 30, Image.SCALE_FAST);
                icon = new ImageIcon(sub);
            } else {
                icon = new ImageIcon();
            }

            buttons[i] = new JButton(itemName.get(i).toString(), icon);
            buttons[i].setVerticalTextPosition(AbstractButton.BOTTOM);
            buttons[i].setHorizontalTextPosition(AbstractButton.CENTER);

            buttons[i].setBorder(javax.swing.BorderFactory.createEtchedBorder());
            buttons[i].setFont(new java.awt.Font("Tahoma", 1, 13));
            buttons[i].setForeground(new java.awt.Color(0, 51, 255));

            buttons[i].setActionCommand(menue.get(i).toString());
            buttons[i].addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    String choice = e.getActionCommand();

                    getSubMenu(choice);

                    StoreView storeV = new StoreView();
                    URL url = null;
                    try {
                        url = new URL(new NightClubDao().getNightClubDataByClubName(choice).getClubImage());
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(StoresForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Image img = null;
                    try {
                        img = ImageIO.read(url);
                    } catch (IOException ex) {
                        Logger.getLogger(StoresForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ImageIcon icon = new ImageIcon(img);
                    storeV.StorePic.setIcon(icon);
                    storeV.StorePic.setIcon(icon);
                    storeV.setVisible(true);
                    storeV.storeName.setText(choice);
                }

            });
        }
        int b = 0;
        int vGap = verticalGap;
        int hGap = horizontalGap;
        int bLength = buttons.length;
        int bRows = bLength / numberOfColumns + 1;

        L1:
        for (int j = 0; j < bRows; j++) {
            vGap = 10;
            for (int k = 0; k < numberOfColumns; k++) {

                pnl_button.add(buttons[b], new org.netbeans.lib.awtextra.AbsoluteConstraints(vGap, hGap, button_width, button_height));
                repaint();
                vGap += button_width + verticalGap;
                b++;
                if (b >= bLength) {
                    break L1;
                }
            }
            hGap += button_height + horizontalGap;
        }
        pack();
    }

    public String[] getSubMenu(String mainMenuCodes) {

        //list = new ArrayList();
        String nightClubs = "";
        Nightclub nightClub = new Nightclub();
        NightClubDao getstores = new NightClubDao();
        List allNightClubs = getstores.getAllNightClubs();

        JOptionPane.showMessageDialog(null, mainMenuCodes, "Success", JOptionPane.INFORMATION_MESSAGE);

        if (mainMenuCodes.equals("Stages")) {

            for (Object o : allNightClubs) {
                nightClub = (Nightclub) o;
                if (nightClub.getCategory().equals("1")) {

                    nightClubs = nightClubs + "," + nightClub.getClubName();
                }
            }

            String[] nightClubArray = nightClubs.split(",");
            return nightClubArray;
            //list.add(nightClubArray);

        } else if (mainMenuCodes.equals("Clubs/Bars")) {

            for (Object o : allNightClubs) {
                nightClub = (Nightclub) o;
                if (nightClub.getCategory().equals("2")) {
                    nightClubs = nightClubs + "," + nightClub.getClubName();
                }
            }

            String[] nightClubArray = nightClubs.split(",");
            return nightClubArray;
            //list.add(nightClubArray);
        } else {

            for (Object o : allNightClubs) {
                nightClub = (Nightclub) o;
                if (nightClub.getCategory().equals("3")) {
                    nightClubs = nightClubs + "," + nightClub.getClubName();
                }
            }

            String[] nightClubArray = nightClubs.split(",");

            return nightClubArray;
            //list.add(nightClubArray);
        }
    }
}
