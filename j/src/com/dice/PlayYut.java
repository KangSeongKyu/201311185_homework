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
    
    JPanel playPanel = new JPanel(new GridLayout(3,2)); // 게임 실행 패널
    JPanel pannPanel = new JPanel(new GridLayout(1,3)); // 점수 현황 패널
    JPanel clearPanel = new JPanel(new GridLayout(1,1)); // 게임 초기화/시간 패널    
    
    ///////////////////////////////////////////////
    p1name = new JLabel(one);
    p2name = new JLabel(two);
    roll1 = new JButton("던지기");
    roll2 = new JButton("던지기");
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
    //////////////////게임 실행판/////////////////////
    s1 = new JTextField(score1+" p");
    reach = new JLabel("20p에 먼저 도달하면 승리!");
    s2 = new JTextField(score2+" p");
    
    pannPanel.add(s1);
    pannPanel.add(reach);
    pannPanel.add(s2);
    
    s1.setEditable(false);
    s2.setEditable(false);
    //////////////////점수 현황////////////////////
    white = new JButton("게임 초기화");
    clearPanel.add(white);
    /////////////////게임 초기화////////////////////
        
    roll1.addActionListener(this);
    roll2.addActionListener(this);
    white.addActionListener(this);    
    
    add(playPanel, BorderLayout.NORTH);
    add(pannPanel, BorderLayout.CENTER);
    add(clearPanel, BorderLayout.SOUTH);
    
    setTitle("Yutnori");
    setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack(); //요소를 프레임안에 챙겨 넣는것
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e){    
    if(e.getSource()==roll1) { // player1의 차례일 때
      Yutnori y = new Yutnori();
      y.roll();
      if(y.getNum()==1){
        what1.setText("도");
        roll2.setEnabled(true);
        roll1.setEnabled(false); //player1의 차례가 끝났으므로 다시 못누르게 버튼을 비활성화 시킴
      }else if(y.getNum()==2){
        what1.setText("개");
        roll2.setEnabled(true);
        roll1.setEnabled(false);
      }else if(y.getNum()==3){
        what1.setText("걸");
        roll2.setEnabled(true);
        roll1.setEnabled(false);
      }else if(y.getNum()==4) {
        what1.setText("윷! 한번 더 던지세요!");
        roll2.setEnabled(false);
      }else if(y.getNum()==5){
        what1.setText("모! 한번 더 던지세요!");
        roll2.setEnabled(false);
      }
      score1 += y.getNum(); //나온 수 만큼 player1의 점수를 올린다.
      if(score1>=20) { //1. player1이 게임에서 이긴 경우
        score1 = 0;
        score2 = 0;
        roll1.setEnabled(false);
        roll2.setEnabled(false);//게임이 종료하면 player1, 2의 던지기버튼 비활성화
        s1.setText(Integer.toString(score1)+" p");
        s2.setText(Integer.toString(score2)+" p");
        what1.setText("Win!");
        what2.setText("Lose...");
        roll1.setText("게    임");
        roll2.setText("종    료");
        reach.setText(p1.getName()+" 승리!!");
        white.setText(p1.getName()+"게임이 끝났습니다! 게임을 초기화하려면 여기를 누르세요.");
      } else if(score1==score2) { //2. player1이 player2를 잡은 경우  
        roll1.setEnabled(true);
        roll2.setEnabled(false);
        score2 = 0;
        s2.setText("잡혔습니다... "+Integer.toString(score2)+" p");
        s1.setText("한번 더 던지세요! "+Integer.toString(score1)+" p");
      } else{ //3. 위의 1, 2번 경우를 제외한 일반적인 player1의 게임진행상황
        s1.setText(Integer.toString(score1)+" p");
      }
    }else if(e.getSource()==roll2) { // player2의 차례일 때
      Yutnori y = new Yutnori();
      y.roll();
      if(y.getNum()==1){
        what2.setText("도");
        roll1.setEnabled(true);
        roll2.setEnabled(false); //player2의 차례가 끝났으므로 다시 못누르게 버튼을 비활성화 시킴
      }else if(y.getNum()==2){
        what2.setText("개");
        roll1.setEnabled(true);
        roll2.setEnabled(false);
      }else if(y.getNum()==3){
        what2.setText("걸");
        roll1.setEnabled(true);
        roll2.setEnabled(false);
      }else if(y.getNum()==4){
        what2.setText("윷! 한번 더 던지세요!");
        roll1.setEnabled(false); //윷이 나오면 상대방의 던지기 버튼을 비활성화하여 한번 더 누를 수 있게한다.
      }else if(y.getNum()==5){
        what2.setText("모! 한번 더 던지세요!");//모가 나오면 상대방의 던지기 버튼을 비활성화하여 한번 더 누를 수 있게한다.
        roll1.setEnabled(false);
      }
      score2 += y.getNum(); //나온 수 만큼 player2의 점수를 올린다.
      if(score2>=20) { //1. player2가 이기는 경우
        score1 = 0;
        score2 = 0;
        roll1.setEnabled(false);
        roll2.setEnabled(false);
        s1.setText(Integer.toString(score1)+" p");
        s2.setText(Integer.toString(score2)+" p");
        what2.setText("Win!");
        what1.setText("Lose...");
        roll1.setText("게    임");
        roll2.setText("종    료");
        reach.setText(p2.getName()+"승리!!");
        white.setText(p2.getName()+"게임이 끝났습니다! 게임을 초기화하려면 여기를 누르세요.");
      } else if(score2==score1) { // 2. player2가 player1을 잡는 경우
        score1 = 0;
        roll2.setEnabled(true);
        roll1.setEnabled(false);
        s1.setText("잡혔습니다... "+Integer.toString(score1)+" p");
        s2.setText("한번 더 던지세요! "+Integer.toString(score2)+" p");
      } else{ //3. 위의 1, 2번 경우를 제외한 일반적인 player2의 게임진행상황
        s2.setText(Integer.toString(score2)+" p");
      }
    }else if(e.getSource()==white) { //초기화 버튼을 눌렀을 때
      score1=0;
      score2=0;
      roll1.setEnabled(true);
      roll2.setEnabled(true);
      roll1.setText("던지기");
      roll2.setText("던지기");
      s1.setText(Integer.toString(score1)+" p");
      s2.setText(Integer.toString(score2)+" p");
      reach.setText("20p에 먼저 도달하면 승리!");
      white.setText("게임 초기화");
      what1.setText(" ");
      what2.setText(" ");
    }
  }
}