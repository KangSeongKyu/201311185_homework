package com.sd.ch8;

class Cube extends Rectangle {
    double height;
    public Cube(double l, double w, double h) {
        super(l,h);
        this.height=w;
    }
    public double getHeight() {
        return height;
    }
    
    public void setSelected(boolean b) {
        isSelected=b;
        System.out.println("Select: Cube");
    }
    public boolean getSelected() {
        return isSelected;
    }
}