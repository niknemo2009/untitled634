import java.awt.*;
import java.awt.event.*;
import java.util.Set;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Wed Jun 24 19:11:49 EEST 2015
 */



/**
 * @author Nezdoliy Yura
 */
public class Tree1 extends JFrame {
    public Tree1() {
        initComponents();

    }

    private void button1ActionPerformed(ActionEvent e) {
        Role role;
        String login=textField1_login.getText();
        String password=new String(passwordField1_passw.getPassword());
        Set<User> spr=User.getSprUser();
        for(User temp:spr){
          if(login.equals(temp.login)){
              if(password.equals(temp.password)){
               role=temp.getUserRole();
                  setPrava(role);
              }else{
                  JOptionPane.showMessageDialog(this,"Password incorrect");
              }

          }else{
            JOptionPane.showMessageDialog(this,"Login is bad");
          }
            textField1_login.setText("");
            passwordField1_passw.setText("");
        }


        // TODO add your code here
    }

    private void setPrava(Role role) {
      switch (role){
          case Pokupatel:
              menu2_pokup.setEnabled(true);
              menu3_prodav.setEnabled(false);
           break;
          case Prodavech:
              menu2_pokup.setEnabled(true);
              menu3_prodav.setEnabled(true);
              break;
      }
    }

    private void menuItem1ActionPerformed(ActionEvent e) {
//        System.out.println("sdsdss sffdd");
//        new First().setVisible(true);
    }

    private void menuItem2_registrActionPerformed(ActionEvent e) {
        new RegistarationForm().setVisible(true);
    }

    private void menuItem1_showVitrinActionPerformed(ActionEvent e) {
        new FormShowVitrina().setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        menuBar1 = new JMenuBar();
        menu1_gost = new JMenu();
        menuItem1_showVitrin = new JMenuItem();
        menuItem2_registr = new JMenuItem();
        menu2_pokup = new JMenu();
        menuItem3_zakazU = new JMenuItem();
        menu3_prodav = new JMenu();
        menuItem4_tovar = new JMenuItem();
        menuItem5_order = new JMenuItem();
        menuItem6_users = new JMenuItem();
        panel1 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1_login = new JTextField();
        passwordField1_passw = new JPasswordField();
        button1 = new JButton();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(52, 52, 202));
        setTitle("InternetShop v. 1.0");
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1_gost ========
            {
                menu1_gost.setText("\u0413\u043e\u0441\u0442\u044c");

                //---- menuItem1_showVitrin ----
                menuItem1_showVitrin.setText("\u041f\u0440\u043e\u0441\u043c\u043e\u0442\u0440 \u0432\u0438\u0442\u0440\u0438\u043d\u044b");
                menuItem1_showVitrin.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        menuItem1ActionPerformed(e);
                        menuItem1_showVitrinActionPerformed(e);
                    }
                });
                menu1_gost.add(menuItem1_showVitrin);

                //---- menuItem2_registr ----
                menuItem2_registr.setText("\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044f");
                menuItem2_registr.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        menuItem2_registrActionPerformed(e);
                    }
                });
                menu1_gost.add(menuItem2_registr);
            }
            menuBar1.add(menu1_gost);

            //======== menu2_pokup ========
            {
                menu2_pokup.setText("\u041f\u043e\u043a\u0443\u043f\u0430\u0442\u0435\u043b\u044c");
                menu2_pokup.setEnabled(false);

                //---- menuItem3_zakazU ----
                menuItem3_zakazU.setText("\u041c\u043e\u0438 \u0437\u0430\u043a\u0430\u0437\u044b");
                menu2_pokup.add(menuItem3_zakazU);
            }
            menuBar1.add(menu2_pokup);

            //======== menu3_prodav ========
            {
                menu3_prodav.setText("\u041f\u0440\u043e\u0434\u0430\u0432\u0435\u0446");
                menu3_prodav.setEnabled(false);

                //---- menuItem4_tovar ----
                menuItem4_tovar.setText("\u0420\u0430\u0431\u043e\u0442\u0430 \u0441 \u0442\u043e\u0432\u0430\u0440\u043e\u043c");
                menu3_prodav.add(menuItem4_tovar);

                //---- menuItem5_order ----
                menuItem5_order.setText("\u0420\u0430\u0431\u043e\u0442\u0430 \u0441 \u0437\u0430\u043a\u0430\u0437\u0430\u043c\u0438");
                menu3_prodav.add(menuItem5_order);

                //---- menuItem6_users ----
                menuItem6_users.setText("\u0420\u0430\u0431\u043e\u0442\u0430 \u0441 \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f\u043c\u0438");
                menu3_prodav.add(menuItem6_users);
            }
            menuBar1.add(menu3_prodav);
        }
        setJMenuBar(menuBar1);

        //======== panel1 ========
        {
            panel1.setBorder(new TitledBorder("\u041f\u0430\u043d\u0435\u043b\u044c \u0430\u0432\u0442\u043e\u0440\u0438\u0437\u0430\u0446\u0438\u0438"));

            //---- label1 ----
            label1.setText("\u041b\u043e\u0433\u0438\u043d -");

            //---- label2 ----
            label2.setText("\u041f\u0430\u0440\u043e\u043b\u044c -");

            //---- button1 ----
            button1.setText("\u0432\u0445\u043e\u0434");
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1ActionPerformed(e);
                    button1ActionPerformed(e);
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(label1, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(label2, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField1_login, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(passwordField1_passw, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(button1))
                        .addContainerGap(14, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1_login, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(passwordField1_passw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button1)
                        .addContainerGap(9, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(257, Short.MAX_VALUE)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(136, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JMenuBar menuBar1;
    private JMenu menu1_gost;
    private JMenuItem menuItem1_showVitrin;
    private JMenuItem menuItem2_registr;
    private JMenu menu2_pokup;
    private JMenuItem menuItem3_zakazU;
    private JMenu menu3_prodav;
    private JMenuItem menuItem4_tovar;
    private JMenuItem menuItem5_order;
    private JMenuItem menuItem6_users;
    private JPanel panel1;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1_login;
    private JPasswordField passwordField1_passw;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
