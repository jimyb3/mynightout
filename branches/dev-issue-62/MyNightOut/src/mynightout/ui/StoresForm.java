package mynightout.ui;




import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import java.util.ArrayList;
import static javassist.compiler.ast.ASTList.append;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
/**
 *
 * @author Mustaine
 */
public class StoresForm extends javax.swing.JFrame {

    private final static int button_width   =   145;        // button width
    private final static int button_height  =   140;        // button height
    private final static int horizontalGap  =   10;         // horizontal gap in button
    private final static int verticalGap    =   10;         // verticle gap in button
    private final static int numberOfColumns=   4;          // number of colums in the button panel
    private final static int fontSize       =   11;         // font size of button name
    private final static int fontType       =   Font.BOLD;  // font type
    private final static String fontName    =   "Thoma";    // font name
    private final static Color  fontColor   =   new Color(0, 51, 255);  // font colot

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        pnl_main.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 300, 80));

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
        System.exit(0);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane jsc_item;
    private javax.swing.JPanel pnl_button;
    private javax.swing.JPanel pnl_main;
    // End of variables declaration//GEN-END:variables


    private void addMainMenue() {
        
        
        
        
        pnl_button.removeAll();
        repaint();

        Image img, sub;
        ImageIcon icon;
        String imagePath,imag = "/com/images/";

         ArrayList menue = new ArrayList();
        ArrayList itemName = new ArrayList();

        ItemDB getstorenames = new ItemDB();
        
        String[] storestablenames= getstorenames.getclubs();
        
        //List<String> wordList = Arrays.asList(storestablenames);
        this.jTextArea1.append(storestablenames);
        
     //   storestablenames=convertStringToArraylist(storestablenames);
     //   storestablenames = convertStringArrayToArraylist(storestablenames);
       // List<String> myList = new ArrayList<String>(Arrays.asList(storestablenames.split(",")));
       // List mylist = Lists.newArrayList(Splitter.on(" , ").split(storestablenames));
        
         //   String[] items = (split(storestablenames));
         //   List<String> container = Arrays.asList(items);
           // ArrayList<String> myllist = (ArrayList<String>) Arrays.asList(storestablenames);
       // List<String> myllist = Arrays.asList(storestablenames);
       // public String mainMenuCodes[] = ItemDB.getclubs();
        
        
        
        
        for (int size = 0; size < ItemDB.mainMenuCodes.length; size++) {
            menue.add(ItemDB.mainMenuCodes[size]);
           // itemName.add(ItemDB.mainMenuDesc[size]);
        }
        
        
        
        
        
        
        JButton[] buttons = new JButton[menue.size()];

        for (int i = 0; i < buttons.length; i++) {
              
            imagePath   = imag+menue.get(i).toString()+".jpeg";

            URL url     = getClass().getResource(imagePath);
//                System.out.println(imagePath +"   Get Res : " +getClass().getResource(imagePath));

            if(url!=null){
                img         = Toolkit.getDefaultToolkit().getImage(url);
                sub         = img.getScaledInstance(button_width - 8, button_height - 30, Image.SCALE_FAST);
                icon        = new ImageIcon(sub);
            }
            else
               icon        = new ImageIcon();

            buttons[i]  = new JButton(itemName.get(i).toString(), icon);
            buttons[i].setVerticalTextPosition(AbstractButton.BOTTOM);
            buttons[i].setHorizontalTextPosition(AbstractButton.CENTER);

            buttons[i].setBorder(javax.swing.BorderFactory.createEtchedBorder());
            buttons[i].setFont(new java.awt.Font("Tahoma", 1, 13));
            buttons[i].setForeground(new java.awt.Color(0, 51, 255));

            buttons[i].setActionCommand(menue.get(i).toString());
            buttons[i].addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    //String choice = e.getActionCommand();
                   // addSubmenue(choice);
                }
            });
        }

        int b       =   0;
        int vGap    =   verticalGap;
        int hGap    =   horizontalGap;
        int bLength =   buttons.length;
        int bRows   =   bLength/numberOfColumns +1;

        L1:    for (int j = 0; j <bRows; j++) {
                vGap = 10;
                for (int k = 0; k < numberOfColumns; k++) {

                    pnl_button.add(buttons[b], new org.netbeans.lib.awtextra.AbsoluteConstraints(vGap, hGap, button_width, button_height));
                    repaint();
                    vGap +=button_width+verticalGap;
                    b++;
                    if(b>=bLength){
                        break L1;
                    }
                }
                hGap +=button_height+horizontalGap;
        }
        pack();
    }

  /*  private void addSubmenue(String choice) {
        pnl_button.removeAll();
        repaint();

        Image img, sub;
        ImageIcon icon;
        String imagePath,imag = "/com/images/";

        ArrayList menue = new ArrayList();
        ArrayList itemName = new ArrayList();

        ArrayList   list  =   ItemDB.getSubMenu(choice);
        String subCode[]  =   (String[]) list.get(0);
        String subDesc[]  =   (String[]) list.get(1);

        for (int size = 0 ; size<subCode.length; size++) {
            menue.add(subCode[size]);
            itemName.add(subDesc[size]);
        }

        JButton[] buttons = new JButton[menue.size()];

        for (int i = 0; i < buttons.length; i++) {

            imagePath   = imag+menue.get(i).toString()+".jpeg";

            URL url     = getClass().getResource(imagePath);
//                System.out.println(imagePath +"   Get Reso : " +getClass().getResource(imagePath));

            if(url!=null){
                img         = Toolkit.getDefaultToolkit().getImage(url);
                sub         = img.getScaledInstance(button_width - 8, button_height - 30, Image.SCALE_FAST);
                icon        = new ImageIcon(sub);
            }
            else
               icon        = new ImageIcon();



            buttons[i]  = new JButton(itemName.get(i).toString(), icon);
            buttons[i].setVerticalTextPosition(AbstractButton.BOTTOM);
            buttons[i].setHorizontalTextPosition(AbstractButton.CENTER);

            buttons[i].setBorder(javax.swing.BorderFactory.createEtchedBorder());
            buttons[i].setFont(new java.awt.Font("Tahoma", 1, 13));
            buttons[i].setForeground(new java.awt.Color(0, 51, 255));


            buttons[i].setActionCommand(menue.get(i).toString());
            buttons[i].addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    String choice = e.getActionCommand();
                    addItems(choice);
                }
            });
        }
        int b       =   0;
        int vGap    =   verticalGap;
        int hGap    =   horizontalGap;
        int bLength =   buttons.length;
        int bRows   =   bLength/numberOfColumns +1;

        L1:    for (int j = 0; j <bRows; j++) {
                vGap = 10;
                for (int k = 0; k < numberOfColumns; k++) {

                    pnl_button.add(buttons[b], new org.netbeans.lib.awtextra.AbsoluteConstraints(vGap, hGap, button_width, button_height));
                    repaint();
                    vGap +=button_width+verticalGap;
                    b++;
                    if(b>=bLength){
                        break L1;
                    }
                }
                hGap +=button_height+horizontalGap;
        }
        pack();
    }

    private void addItems(String choice) {

        if(choice.equals("P"))
            choice  =   "PIZZA";
        else if(choice.equals("B"))
            choice  =   "BURGER";
        else if(choice.equals("FJ"))
            choice  =   "FRUIT JUICE";
        else if(choice.equals("HB"))
            choice  =   "HOT BEVERAGES";
        JOptionPane.showMessageDialog(this, "You have select  "+choice);
    }
    
public ArrayList convertStringToArraylist(String str) {
    ArrayList charList = new ArrayList();      
    for(int i = 0; i<str.length();i++){
        charList.add(str.charAt(i));
    }
    return charList;
}

public static ArrayList convertStringArrayToArraylist(String[] strArr){
    ArrayList stringList = new ArrayList();
    for (String s : strArr) {
        stringList.add(s);
    }
    return stringList;
}

*/
}
