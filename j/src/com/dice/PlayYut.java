package com.sd.dice;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PlayYut extends JFrame implements ActionListener {  
  JLabel p1name, p2name, reach;
  JTextField s1, s2, what1, what2;
  JButton roll1, roll2, white;  
  int score1=0;
  int score2=0;
  Player p1, p2;
  
  public PlayYut(String one, String two) {
    this.p1 = new Player(one);
    this.p2 = new Player(two);
    
    JPanel playPanel = new JPanel(new GridLayout(3,2)); // ���� ���� �г�
    JPanel pannPanel = new JPanel(new GridLayout(1,3)); // ���� ��Ȳ �г�
    JPanel clearPanel = new JPanel(new GridLayout(1,1)); // ���� �ʱ�ȭ/�ð� �г�    
    
    ///////////////////////////////////////////////
    p1name = new JLabel(one);
    p2name = new JLabel(two);
    roll1 = new JButton("������");
    roll2 = new JButton("������");
    what1 = new JTextField(" ");
    what2 = new JTextField(" ");
        
    playPanel.add(p1name);
    playPanel.add(p2name);
    playPanel.add(what1);
    playPanel.add(what2);
    playPanel.add(roll1);
    playPanel.add(roll2);
    
    what1.setEditable(false);
    what2.setEditable(false);
    //////////////////���� ������/////////////////////
    s1 = new JTextField(score1+" p");
    reach = new JLabel("20p�� ���� �����ϸ� �¸�!");
    s2 = new JTextField(score2+" p");
    
    pannPanel.add(s1);
    pannPanel.add(reach);
    pannPanel.add(s2);
    
    s1.setEditable(false);
    s2.setEditable(false);
    //////////////////���� ��Ȳ////////////////////
    white = new JButton("���� �ʱ�ȭ");
    clearPanel.add(white);
    /////////////////���� �ʱ�ȭ////////////////////
        
    roll1.addActionListener(this);
    roll2.addActionListener(this);
    white.addActionListener(this);    
    
    add(playPanel, BorderLayout.NORTH);
    add(pannPanel, BorderLayout.CENTER);
    add(clearPanel, BorderLayout.SOUTH);
    
    setTitle("Yutnori");
    setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack(); //��Ҹ� �����Ӿȿ� ì�� �ִ°�
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e){    
    if(e.getSource()==roll1) { // player1�� ������ ��
      Yutnori y = new Yutnori();
      y.roll();
      if(y.getNum()==1){
        what1.setText("��");
        roll2.setEnabled(true);
        roll1.setEnabled(false); //player1�� ���ʰ� �������Ƿ� �ٽ� �������� ��ư�� ��Ȱ��ȭ ��Ŵ
      }else if(y.getNum()==2){
        what1.setText("��");
        roll2.setEnabled(true);
        roll1.setEnabled(false);
      }else if(y.getNum()==3){
        what1.setText("��");
        roll2.setEnabled(true);
        roll1.setEnabled(false);
      }else if(y.getNum()==4) {
        what1.setText("��! �ѹ� �� ��������!");
        roll2.setEnabled(false);
      }else if(y.getNum()==5){
        what1.setText("��! �ѹ� �� ��������!");
        roll2.setEnabled(false);
      }
      score1 += y.getNum(); //���� �� ��ŭ player1�� ������ �ø���.
      if(score1>=20) { //1. player1�� ���ӿ��� �̱� ���
        score1 = 0;
        score2 = 0;
        roll1.setEnabled(false);
        roll2.setEnabled(false);//������ �����ϸ� player1, 2�� �������ư ��Ȱ��ȭ
        s1.setText(Integer.toString(score1)+" p");
        s2.setText(Integer.toString(score2)+" p");
        what1.setText("Win!");
        what2.setText("Lose...");
        roll1.setText("��    ��");
        roll2.setText("��    ��");
        reach.setText(p1.getName()+" �¸�!!");
        white.setText(p1.getName()+"������ �������ϴ�! ������ �ʱ�ȭ�Ϸ��� ���⸦ ��������.");
      } else if(score1==score2) { //2. player1�� player2�� ���� ���  
        roll1.setEnabled(true);
        roll2.setEnabled(false);
        score2 = 0;
        s2.setText("�������ϴ�... "+Integer.toString(score2)+" p");
        s1.setText("�ѹ� �� ��������! "+Integer.toString(score1)+" p");
      } else{ //3. ���� 1, 2�� ��츦 ������ �Ϲ����� player1�� ���������Ȳ
        s1.setText(Integer.toString(score1)+" p");
      }
    }else if(e.getSource()==roll2) { // player2�� ������ ��
      Yutnori y = new Yutnori();
      y.roll();
      if(y.getNum()==1){
        what2.setText("��");
        roll1.setEnabled(true);
        roll2.setEnabled(false); //player2�� ���ʰ� �������Ƿ� �ٽ� �������� ��ư�� ��Ȱ��ȭ ��Ŵ
      }else if(y.getNum()==2){
        what2.setText("��");
        roll1.setEnabled(true);
        roll2.setEnabled(false);
      }else if(y.getNum()==3){
        what2.setText("��");
        roll1.setEnabled(true);
        roll2.setEnabled(false);
      }else if(y.getNum()==4){
        what2.setText("��! �ѹ� �� ��������!");
        roll1.setEnabled(false); //���� ������ ������ ������ ��ư�� ��Ȱ��ȭ�Ͽ� �ѹ� �� ���� �� �ְ��Ѵ�.
      }else if(y.getNum()==5){
        what2.setText("��! �ѹ� �� ��������!");//�� ������ ������ ������ ��ư�� ��Ȱ��ȭ�Ͽ� �ѹ� �� ���� �� �ְ��Ѵ�.
        roll1.setEnabled(false);
      }
      score2 += y.getNum(); //���� �� ��ŭ player2�� ������ �ø���.
      if(score2>=20) { //1. player2�� �̱�� ���
        score1 = 0;
        score2 = 0;
        roll1.setEnabled(false);
        roll2.setEnabled(false);
        s1.setText(Integer.toString(score1)+" p");
        s2.setText(Integer.toString(score2)+" p");
        what2.setText("Win!");
        what1.setText("Lose...");
        roll1.setText("��    ��");
        roll2.setText("��    ��");
        reach.setText(p2.getName()+"�¸�!!");
        white.setText(p2.getName()+"������ �������ϴ�! ������ �ʱ�ȭ�Ϸ��� ���⸦ ��������.");
      } else if(score2==score1) { // 2. player2�� player1�� ��� ���
        score1 = 0;
        roll2.setEnabled(true);
        roll1.setEnabled(false);
        s1.setText("�������ϴ�... "+Integer.toString(score1)+" p");
        s2.setText("�ѹ� �� ��������! "+Integer.toString(score2)+" p");
      } else{ //3. ���� 1, 2�� ��츦 ������ �Ϲ����� player2�� ���������Ȳ
        s2.setText(Integer.toString(score2)+" p");
      }
    }else if(e.getSource()==white) { //�ʱ�ȭ ��ư�� ������ ��
      score1=0;
      score2=0;
      roll1.setEnabled(true);
      roll2.setEnabled(true);
      roll1.setText("������");
      roll2.setText("������");
      s1.setText(Integer.toString(score1)+" p");
      s2.setText(Integer.toString(score2)+" p");
      reach.setText("20p�� ���� �����ϸ� �¸�!");
      white.setText("���� �ʱ�ȭ");
      what1.setText(" ");
      what2.setText(" ");
    }
  }
}