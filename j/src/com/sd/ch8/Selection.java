package com.sd.ch8;

public class Selection {
    Selection(){}
    
    public void select(Rectangle r) {
        r.setSelected(true);
        System.out.println("selected: "+r.isSelected);
    }
    
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(20, 30);
        Rectangle r2 = new Cube(10,20,30);
        
        Selection s = new Selection();
        
        s.select(r1);
        s.select(r2);
        
        Rectangle[] sArr={r1, r2};
        for(int i=0; i<sArr.length; i++)
          s.select(sArr[i]);
    }
}