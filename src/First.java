import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Wed Jun 24 14:23:54 EEST 2015
 */



/**
 * @author Nezdoliy Yura
 */
public class First extends JFrame {
    public First() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Nezdoliy Yura
        textField1 = new JTextField();
        radioButton1 = new JRadioButton();
        button1 = new JButton();
        toggleButton1 = new JToggleButton();
        radioButton2 = new JRadioButton();
        checkBox1 = new JCheckBox();

        //======== this ========
        Container contentPane = getContentPane();

        //---- radioButton1 ----
        radioButton1.setText("text");

        //---- button1 ----
        button1.setText("text");

        //---- toggleButton1 ----
        toggleButton1.setText("text");

        //---- radioButton2 ----
        radioButton2.setText("text");

        //---- checkBox1 ----
        checkBox1.setText("text");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(button1)
                                .addComponent(radioButton1))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toggleButton1)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                    .addComponent(radioButton2)
                    .addGap(101, 101, 101))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(checkBox1)
                    .addContainerGap(392, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(86, Short.MAX_VALUE)
                    .addComponent(checkBox1)
                    .addGap(9, 9, 9)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(radioButton1)
                            .addGap(28, 28, 28))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addComponent(toggleButton1)
                            .addGap(16, 16, 16)))
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(radioButton2))
                    .addGap(18, 18, 18)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Nezdoliy Yura
    private JTextField textField1;
    private JRadioButton radioButton1;
    private JButton button1;
    private JToggleButton toggleButton1;
    private JRadioButton radioButton2;
    private JCheckBox checkBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
