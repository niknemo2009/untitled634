import java.awt.*;
import java.awt.event.*;
import java.util.Set;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Wed Jul 15 17:29:46 EEST 2015
 */



/**
 * @author yura
 */

public class RegistarationForm extends JFrame {
    public RegistarationForm() {
        initComponents();
        MyVerifer my1=new MyVerifer();
       textField2_login.setInputVerifier(my1);
        textField4_conf_passw.setInputVerifier(my1);
    }
private class MyVerifer extends  InputVerifier{

    @Override
    public boolean verify(JComponent jComponent) {
        boolean result=true;
        System.out.println(jComponent.getName());
        String message="";
        Set<User> spr=User.getSprUser();
        switch (jComponent.getName()){
            case  "login":
                String loginScreen=textField2_login.getText();
                if(spr.size()!=0){
                    for (User temp:spr){
                        if(temp.login.compareTo(loginScreen)==0) {
                            result=false;
                            break;
                        }
                    }

                }
                message=result?"Логин корректен ":"Дублирование логина ";
                break;
            case  "confirm":
            if (textField3_passw.getText().equals(textField4_conf_passw.getText())){
               message="Пароль норма";
            }else{
                message="Пароль  не  норма";
                result=false;
            }
        }
        JOptionPane.showMessageDialog(RegistarationForm.this,message);
        return result;
    }
}


    private void button1ActionPerformed(ActionEvent e) {


     String fio=textField1_fio.getText();
     String login=textField2_login.getText();
        String password=textField3_passw.getText();
        String telef=textField5_telef.getText();
        String emeil=textField6_emeil.getText();
        new User(fio,login,password,emeil,
                Integer.valueOf(telef.trim()).intValue(),Role.Pokupatel);
        System.out.println(User.getSprUser());
        this.setVisible(false);
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        textField1_fio = new JTextField();
        textField2_login = new JTextField();
        textField3_passw = new JTextField();
        textField4_conf_passw = new JTextField();
        textField5_telef = new JTextField();
        textField6_emeil = new JTextField();
        button1 = new JButton();

        //======== this ========
        setTitle("\u0424\u043e\u0440\u043c\u0430 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438");
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u0424\u0418\u041e -");

        //---- label2 ----
        label2.setText("\u041b\u043e\u0433\u0438\u043d -");

        //---- label3 ----
        label3.setText("\u041f\u0430\u0440\u043e\u043b\u044c -");

        //---- label4 ----
        label4.setText("\u041f\u043e\u0432\u0442\u043e\u0440 \u043f\u0430\u0440\u043e\u043b\u044f - ");

        //---- label5 ----
        label5.setText("\u0422\u0435\u043b\u0435\u0444\u043e\u043d -");

        //---- label6 ----
        label6.setText("\u0415\u043c\u0435\u0439\u043b - ");

        //---- textField2_login ----
        textField2_login.setName("login");

        //---- textField4_conf_passw ----
        textField4_conf_passw.setName("confirm");

        //---- button1 ----
        button1.setText("\u0417\u0430\u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0438\u0440\u043e\u0432\u0430\u0442\u044c");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1ActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label5)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField5_telef))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField4_conf_passw))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField3_passw, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField1_fio, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2)
                            .addGap(18, 18, 18)
                            .addComponent(textField2_login, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(label6)
                            .addGap(18, 18, 18)
                            .addComponent(textField6_emeil)))
                    .addContainerGap(78, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(34, Short.MAX_VALUE)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                    .addGap(180, 180, 180))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(textField1_fio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textField2_login, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(textField3_passw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(textField4_conf_passw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(textField5_telef, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(textField6_emeil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(32, 32, 32)
                    .addComponent(button1)
                    .addContainerGap(31, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField1_fio;
    private JTextField textField2_login;
    private JTextField textField3_passw;
    private JTextField textField4_conf_passw;
    private JTextField textField5_telef;
    private JTextField textField6_emeil;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
