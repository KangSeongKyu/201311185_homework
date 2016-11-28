package com.sd.ch8;

class Rectangle {
    protected double length;
    protected double width;
    protected boolean isSelected;
    public Rectangle(double l, double w) {
        this.length=l;
        this.width=w;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setSelected(boolean b) {
        isSelected=b;
        System.out.println("Select: Rectangle");
    }
    public boolean getSelected() {
        return isSelected;
    }
}