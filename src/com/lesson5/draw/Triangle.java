package com.lesson5.draw;
import java.awt.*;

public class Triangle extends Shape {
    int[] xPoints=new int[3];
    int[] yPoints=new int[3];
    public Triangle(){}
    public Triangle(int x1,int x2,int x3,int y1,int y2,int y3,Color c,Graphics g){
        super(x1,y1,c,g);
        xPoints[0]=x1;xPoints[1]=x2;xPoints[2]=x3;
        yPoints[0]=y1;yPoints[1]=y2;yPoints[2]=y3;
    }
    public void draw(){
        g.setColor(c);
        g.fillPolygon(xPoints,yPoints,3);
    }
    public double area(){
        double s=xPoints[0]*(yPoints[1]-yPoints[2])+xPoints[1]*(yPoints[2]-yPoints[0])
                +xPoints[2]*(yPoints[0]-yPoints[1]);
        s=s>0?s:-s;
        return s/2;
    }
}
