package com.lesson5.draw;
import java.awt.*;

public class Rectangle extends Shape{
    int length,height;
    public Rectangle(){}
    public Rectangle(int x,int y,int length,int height,Color c,Graphics g){
        super(x,y,c,g);
        this.length=length;
        this.height=height;
    }
    @Override
    public double area() {
        return length*height;
    }

    @Override
    public void draw() {
        g.setColor(c);
        g.fillRect(x,y,length,height);
    }
}
