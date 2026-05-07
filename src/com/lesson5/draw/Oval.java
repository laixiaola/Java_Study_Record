package com.lesson5.draw;
import java.awt.*;

public class Oval extends Shape {
    double r;
    public Oval(int x,int y,double r,Color c,Graphics g){
        super(x,y,c,g);
        this.r=r;
    }
    public void draw(){
        g.setColor(c);
        g.fillOval(x,y,(int) r*2,(int) r*2);
    }
    public double area(){
        return Math.PI*this.r*this.r;
    }
}
