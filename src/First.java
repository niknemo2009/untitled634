import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/*
 * Created by JFormDesigner on Wed Jun 24 14:23:54 EEST 2015
 */



/**
 * @author Nezdoliy Yura
 */
public class First extends JFrame {
    public First() {
        initComponents();
        User temp1=new User("Petrov","qwq1@qwe.com",123456);
        User temp2=new User("Petrov1","qwq2@qwe.com",2123456);
        User temp3=new User("Petrov2","qwq3@qwe.com",3123456);
        DefaultComboBoxModel<User> model=new DefaultComboBoxModel<User>(User.getSprUser());
list1.setModel(model);
        comboBox1.setModel(model);
        Vector<String> header=new Vector<String>();
        header.add("Имя");
        header.add("емейл");
        header.add("Телефон");
        Vector<Vector> data=new Vector<Vector>();
        for(User tempUser:User.getSprUser()){
            Vector temp=new Vector();
            temp.add(tempUser.name);
            temp.add(tempUser.emeil);
            temp.add(tempUser.telefon);
            data.add(temp);

        }
        DefaultTableModel tabl=new DefaultTableModel(data,header);
table1.setModel(tabl);
    }

    private void button1_addActionPerformed(ActionEvent e) {
        // TODO add your code here
       String message=null;
        try {
            User user = new User(textField1_name.getText(),
                    textField2_emeil.getText(), Integer.valueOf(textField3_telefon.getText()));
            message = "Успешно создан";
            textField1_name.setText("");
            textField2_emeil.setText("");
            textField3_telefon.setText("");

        }catch (NumberFormatException ex){
            message="Разберитесь с телефоном";
        }finally {
            JOptionPane.showMessageDialog(this,message);
        }



    }

    private void list1ValueChanged(ListSelectionEvent e) {

        System.out.println(list1.getSelectedValue());
    }

    private void list1MouseReleased(MouseEvent e) {
        User temp=(User) list1.getSelectedValue();
        textField1_name.setText(temp.name);
        textField2_emeil.setText(temp.emeil);
        textField3_telefon.setText(Integer.valueOf(temp.telefon).toString());
    }

    private void button3_updateActionPerformed(ActionEvent e) {
        String message=null;
        User temp=(User) list1.getSelectedValue();
        try {
            temp.name=textField1_name.getText();
            temp.emeil=textField2_emeil.getText();
            temp.telefon=Integer.valueOf(textField3_telefon.getText());
            message = "Успешно преобразован";
            textField1_name.setText("");
            textField2_emeil.setText("");
            textField3_telefon.setText("");

        }catch (NumberFormatException ex){
            message="Разберитесь с телефоном";
        }finally {
            JOptionPane.showMessageDialog(this,message);
        }
    }

    private void button2_deleteActionPerformed(ActionEvent e) {
        int index = list1.getSelectedIndex();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Nezdoliy Yura
        panel1 = new JPanel();
        button1_add = new JButton();
        button2_delete = new JButton();
        button3_update = new JButton();
        textField1_name = new JTextField();
        textField2_emeil = new JTextField();
        textField3_telefon = new JTextField();
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        comboBox1 = new JComboBox();
        scrollPane2 = new JScrollPane();
        table1 = new JTable();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setBorder(new TitledBorder("\u041f\u0430\u043d\u0435\u043b\u044c \u0443\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044f\u043c\u0438"));

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- button1_add ----
            button1_add.setText("add");
            button1_add.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button1_addActionPerformed(e);
                }
            });

            //---- button2_delete ----
            button2_delete.setText("delete");
            button2_delete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button2_deleteActionPerformed(e);
                }
            });

            //---- button3_update ----
            button3_update.setText("update");
            button3_update.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button3_updateActionPerformed(e);
                }
            });

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1_add)
                        .addGap(48, 48, 48)
                        .addComponent(button2_delete)
                        .addGap(40, 40, 40)
                        .addComponent(button3_update)
                        .addContainerGap(247, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button2_delete)
                            .addComponent(button3_update)
                            .addComponent(button1_add)))
            );
        }

        //---- textField1_name ----
        textField1_name.setToolTipText("name");

        //======== scrollPane1 ========
        {

            //---- list1 ----
            list1.setDoubleBuffered(true);
            list1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    list1MouseReleased(e);
                }
            });
            scrollPane1.setViewportView(list1);
        }

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(table1);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textField1_name, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(textField2_emeil, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(textField3_telefon, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(textField1_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textField2_emeil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textField3_telefon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Nezdoliy Yura
    private JPanel panel1;
    private JButton button1_add;
    private JButton button2_delete;
    private JButton button3_update;
    private JTextField textField1_name;
    private JTextField textField2_emeil;
    private JTextField textField3_telefon;
    private JScrollPane scrollPane1;
    private JList list1;
    private JComboBox comboBox1;
    private JScrollPane scrollPane2;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
