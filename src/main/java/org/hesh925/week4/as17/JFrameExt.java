package org.hesh925.week4.as17;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;


public class JFrameExt extends JFrame implements ActionListener {
    private JPanel P_Main = new JPanel();
    private JPanel F_Top =  new JPanel();
    private JPanel F_Mid =  new JPanel();
    private JPanel F_Bot =  new JPanel();

    private JLabel L_From = new JLabel("From");
    private JLabel L_To =   new JLabel("To  ");

    private JTextField TextIn_From = new JTextField(10);
    private JTextField TextOut_To =   new JTextField(10);

    private final JButton Button_F2C = new JButton("FtoC");
    private final JButton Button_C2F = new JButton("CToF");

    public JFrameExt () {
        setTitle ("Temprature Converter");
        setSize(400, 200);
        setVisible(true);
        //set jpMain layout
        GridLayout gl = new GridLayout (3,1);
        P_Main.setLayout(gl);
        //add panels to jpMain
        P_Main.add(F_Top);
        P_Main.add(F_Bot);
        P_Main.add(F_Mid);
        F_Top.setBackground(Color.BLUE);
        F_Mid.setBackground(Color.lightGray);
        F_Bot.setBackground(Color.GREEN);
        //Make jpMain as the content pane
        this.setContentPane(P_Main);
        //add components to panels
        F_Top.add(L_From);
        F_Top.add(TextIn_From);
        F_Mid.add(L_To);
        F_Mid.add(TextOut_To);
        F_Bot.add(Button_F2C);
        F_Bot.add(Button_C2F);
        TextOut_To.setEditable(false);
        //register this object as a listener with buttons
        Button_F2C.addActionListener(this);
        Button_C2F.addActionListener(this);
    }
    //Listener method
    public void actionPerformed(ActionEvent ev) {
        DecimalFormat df = new DecimalFormat("0.0#");
        String S_From;
        double D_From, D_To;

        S_From = TextIn_From.getText().trim();

        if(S_From.isEmpty()) {
            // set default value to 0
            S_From = "0";
            TextIn_From.setText(S_From);
        }

        System.out.println(S_From);

        D_From = Double.parseDouble(S_From);

        if (ev.getSource() == Button_F2C){
            D_To = 5.0/9.0 * (D_From - 32.0);
            TextOut_To.setText(df.format(D_To) + " C");
        }
        else if (ev.getSource() == Button_C2F){
            D_To = (9.0/5.0 * D_From) + 32.0;
            TextOut_To.setText(df.format(D_To) + " F");
        }
    }
}
