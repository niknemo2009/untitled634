import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Fri Jul 17 18:52:37 EEST 2015
 */



/**
 * @author yura
 */
public class AdminUsersForm extends JFrame {
    UserSqlController userSqlController=new UserSqlController();
    public AdminUsersForm() {
        initComponents();
        DefaultComboBoxModel<User> mod=new DefaultComboBoxModel<>(userSqlController.firstLoadSprUser());
    list1.setModel(mod);
    }

    private void button1_delActionPerformed(ActionEvent e) {
        User delUser= (User) list1.getSelectedValue();
      userSqlController.deleteUser(delUser);
        ((DefaultComboBoxModel)list1.getModel()).removeElement(delUser);
       // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        button1_del = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }

        //---- button1_del ----
        button1_del.setText("\u0423\u0434\u0430\u043b\u0438\u0442\u044c");
        button1_del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1_delActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(button1_del)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(310, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(button1_del)
                    .addContainerGap(62, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JScrollPane scrollPane1;
    private JList list1;
    private JButton button1_del;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
