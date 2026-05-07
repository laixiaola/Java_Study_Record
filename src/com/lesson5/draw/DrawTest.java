/*
    题目：
        编写并调试运行Java程序，进行类的设计，掌握构造函数及类的继承的设计方法。
        抽象类试验。定义一组具有继承关系的类。
        Shape（形状）类是一个抽象类，包含4个数据成员（坐标x,y,颜色c,图形对象g(Graphics类对象)）,一个构造方法和两个抽象方法（求面积area()和draw方法）。
        Triangle（三角形）由Shape派生，Rectangle（矩形）由Shape派生，Oval（圆类）由Shape派生。
        对上述类进行测试。
        尝试实现：根据坐标和颜色使用图形对象的方法进行图形对象的绘制和面积输出。
        图形绘制利用Frame类以及该类paint()方法进行实现，此处利用的面向对象进行重写。
*/
package com.lesson5.draw;
import java.awt.*;

public class DrawTest extends Frame
{
    public DrawTest()
    {
        setLocation(200,200);
        setSize(800,600);
        setVisible(true);
    }
    public void paint(Graphics g)
    {
        Oval oval=new Oval(50,50,50,Color.red,g);
        oval.draw();
        System.out.println("Oval Area:"+oval.area());

        Triangle triangle=new Triangle(100,200,300,100,30,100,Color.blue,g);
        triangle.draw();
        System.out.println("Triangle Area:"+triangle.area());

        Rectangle rectangle=new Rectangle(400,400,100,100,Color.black,g);
        rectangle.draw();
        System.out.println("Rectangle Area:"+rectangle.area());
    }
    public static void main(String[] args)
    {
        new DrawTest();
    }
}