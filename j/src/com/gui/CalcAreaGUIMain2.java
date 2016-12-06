package com.sd.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Panel;
import java.awt.GridLayout;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener {
  
  JTextField radiusTf1;
  JTextField areaTf2;
  JButton b1 = new JButton("Compute");
  JButton b2 = new JButton("Cancel");
  
  public CalcAreaGUIMain2() {
    JPanel panel = new JPanel(new GridLayout(3,2));
    getContentPane().add(panel);
    JLabel label1 = new JLabel("Radius");
    radiusTf1 = new JTextField(10);
    JLabel label2 = new JLabel("Area");
    areaTf2 = new JTextField(15);
    
    b1.addActionListener(this);
    b2.addActionListener(this);    
    
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf2);
    panel.add(b1);
    panel.add(b2);
    pack();
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1) {
      b1.setText("Calculated Complete!");
      Double r=Double.parseDouble(radiusTf1.getText());
      areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
    }else if(e.getSource()==b2) {
      radiusTf1.setText(" ");
      areaTf2.setText(" ");
      b1.setText("Compute");
    }
  }
  public static void main(String[] args) {
    CalcAreaGUIMain2 c = new CalcAreaGUIMain2();
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    c.pack();
    c.setVisible(true);
  }
}
