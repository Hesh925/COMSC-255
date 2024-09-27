package org.hesh925.week4.as16;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JFrameExt extends JFrame implements ActionListener {
    private JTextField message = new JTextField(10);
    private JButton button = new JButton("Click Me");
    private JButton button2 = new JButton("Click Me Too");
    private JPanel panel = new JPanel();

    private int count = 0;

    public JFrameExt() {
        super();
        FlowLayout fl = new FlowLayout();
        this.panel.setLayout(fl);
        this.setContentPane(this.panel);
        this.panel.add(this.button);
        this.panel.add(this.message);
        this.panel.add(this.button2);

        this.message.setEditable(false);

        this.button.addActionListener(this);
        this.button2.addActionListener(this);

    }

    public void display() {
        this.setVisible(true);
    }

    public void close() {
        this.setVisible(false);
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
       if(e.getSource() == this.button) {
           this.count++;
           this.message.setText("Hello " + this.count);
       } else if(e.getSource() == this.button2) {
           this.count--;
           this.message.setText("Hello " + this.count);
       }
    }
}
