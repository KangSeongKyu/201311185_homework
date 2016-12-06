package com.sd.gui;

import javax.swing.*;
import java.awt.*;

public class CalcAreaGUIMain extends JFrame  {
  public static void main(String[] args) {
    JFrame f = new JFrame(); //hasa방식
    JPanel panel = new JPanel(new GridLayout(3,2)); //3행 2열의 버튼
    f.getContentPane().add(panel);
    JLabel label1 = new JLabel("Radius");
    JTextField radiusTf1 = new JTextField(10);
    JLabel label2 = new JLabel("Area");
    JTextField areaTf1 = new JTextField(15);
    JButton b1 = new JButton("Compute");
    JButton b2 = new JButton("Cancel");
    panel.add(label1);
    panel.add(radiusTf1);
    panel.add(label2);
    panel.add(areaTf1);
    panel.add(b1);
    panel.add(b2);
    f.pack(); //요소를 프레임안에 챙겨 넣는것
    f.setVisible(true);
  }
}