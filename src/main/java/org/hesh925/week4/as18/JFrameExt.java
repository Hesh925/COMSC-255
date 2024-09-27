package org.hesh925.week4.as18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class JFrameExt extends JFrame implements ActionListener {
    DecimalFormat df = new DecimalFormat("0.###");

    private JFrame MainFrame = new JFrame();

    private JPanel Panel_1 = new JPanel();
    private JPanel Panel_2 = new JPanel();
    private JPanel Panel_3 = new JPanel();
    private JPanel Panel_4 = new JPanel();

    private JLabel Label_NUM_1 = new JLabel("First Number      ");
    private JLabel Label_NUM_2 = new JLabel("Second Number ");
    private JLabel Label_RESULT = new JLabel("Result ");

    private JTextField Text_NUM_1 = new JTextField(10);
    private JTextField Text_NUM_2 = new JTextField(10);
    private JTextField Text_RESULT = new JTextField(15);

    private JButton Button_ADD = new JButton("Add");
    private JButton Button_SUBTRACT = new JButton("Subtract");
    private JButton Button_MULTIPLY = new JButton("Multiply");
    private JButton Button_DIVIDE = new JButton("Divide");
    private JButton Button_CLEAR = new JButton("Clear");

    private JMenuBar MB = new JMenuBar();
    private JMenu MB_OPS = new JMenu("Operations");
    private JMenuItem MB_ADD = new JMenuItem("Add");
    private JMenuItem MB_SUBTRACT = new JMenuItem("Subtract");
    private JMenuItem MB_MULTIPLY = new JMenuItem("Multiply");
    private JMenuItem MB_DIVIDE = new JMenuItem("Divide");
    private JMenuItem MB_CLEAR = new JMenuItem("Clear");

    private JMenu MB_MISC = new JMenu();
    private JMenuItem MB_Resize = new JMenuItem("Resize Window");
    private JMenuItem MB_Column_W = new JMenuItem("Set Width");

    JFrameExt() {
        super();
        MainFrame.setSize(400, 400);
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setLayout(new BoxLayout(MainFrame.getContentPane(), BoxLayout.Y_AXIS));
        GridLayout layout = new GridLayout(4, 1);
        MainFrame.setLayout(layout);

        Panel_1.add(Label_NUM_1);
        Panel_1.add(Text_NUM_1);

        Panel_2.add(Label_NUM_2);
        Panel_2.add(Text_NUM_2);

        Panel_3.add(Label_RESULT);
        Panel_3.add(Text_RESULT);

        Panel_4.add(Button_ADD);
        Panel_4.add(Button_SUBTRACT);
        Panel_4.add(Button_MULTIPLY);
        Panel_4.add(Button_DIVIDE);
        Panel_4.add(Button_CLEAR);

        MainFrame.add(Panel_1);
        MainFrame.add(Panel_2);
        MainFrame.add(Panel_3);
        MainFrame.add(Panel_4);
        Text_RESULT.setEditable(false);

        Button_ADD.addActionListener(this);
        Button_SUBTRACT.addActionListener(this);
        Button_MULTIPLY.addActionListener(this);
        Button_DIVIDE.addActionListener(this);
        Button_CLEAR.addActionListener(this);

        MainFrame.setJMenuBar(MB);
        MB.add(MB_OPS);

        MB_OPS.add(MB_ADD);
        MB_OPS.add(MB_SUBTRACT);
        MB_OPS.add(MB_MULTIPLY);
        MB_OPS.add(MB_DIVIDE);
        MB_OPS.add(MB_CLEAR);

        MB_ADD.addActionListener(this);
        MB_SUBTRACT.addActionListener(this);
        MB_MULTIPLY.addActionListener(this);
        MB_DIVIDE.addActionListener(this);
        MB_CLEAR.addActionListener(this);

        MainFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String S_NUM_1 = Text_NUM_1.getText();
        String S_NUM_2 = Text_NUM_2.getText();

        // if S_NUM_1 or S_NUM_2 is empty, set the empty string to "0" else set it to the value of the text field
        // prevents NumberFormatException
        S_NUM_1 = S_NUM_1.equals("") ? "0" : S_NUM_1;
        S_NUM_2 = S_NUM_2.equals("") ? "0" : S_NUM_2;

        double num1 = Double.parseDouble(S_NUM_1);
        double num2 = Double.parseDouble(S_NUM_2);

        System.out.println(e.getSource());

        if (e.getSource() == Button_ADD | e.getSource() == MB_ADD) {
            double sum = num1 + num2;;
            Text_RESULT.setText(df.format(sum));

        } else if (e.getSource() == Button_SUBTRACT | e.getSource() == MB_SUBTRACT) {
            double sum = num1 - num2;
            Text_RESULT.setText(df.format(sum));

        } else if (e.getSource() == Button_MULTIPLY | e.getSource() == MB_MULTIPLY) {
            double sum = num1 * num2;
            Text_RESULT.setText(df.format(sum));

        } else if (e.getSource() == Button_DIVIDE | e.getSource() == MB_DIVIDE) {
            if(num2 == 0) {
                Text_RESULT.setText("Cannot divide by zero");
                return;
            }
            double sum = num1 / num2;
            Text_RESULT.setText(df.format(sum));

        } else if (e.getSource() == Button_CLEAR | e.getSource() == MB_CLEAR) {
            Text_NUM_1.setText("");
            Text_NUM_2.setText("");
            Text_RESULT.setText("");
        }
    }
}
