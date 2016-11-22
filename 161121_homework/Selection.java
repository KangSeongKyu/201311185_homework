package com.sd.ch8;

class Selection {
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
    }
}