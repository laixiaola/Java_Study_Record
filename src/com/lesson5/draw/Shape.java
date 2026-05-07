package com.lesson5.draw;
import java.awt.*;

public abstract class Shape {
    int x,y;
    Color c;
    Graphics g;
    public Shape(){}
    public Shape(int x,int y,Color c,Graphics g){
        this.x=x;
        this.y=y;
        this.c=c;
        this.g=g;
    }
    public abstract double area();
    public abstract void draw();
}
