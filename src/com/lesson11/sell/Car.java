/*
    题目：
        编写一个程序，绘制一辆小车，
        然后让小车在窗体中从左侧中间位置平行移动，到中间以后向下继续移动。
 */

package com.lesson11.sell;

import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class Car extends Frame implements Runnable{
    //小车车身中心最初在左侧中间位置
    int x=40;
    int y=280;

    public Car(){
        setLocation(200,200);
        setSize(600,600);
        setTitle("小车移动");
        setBackground(Color.LIGHT_GRAY);


        setVisible(true);
    }

    public void paint(Graphics g){
        //画小车
        g.setColor(Color.red);
        g.fillRect(x,y,80,40);
        g.setColor(Color.green);
        g.fillOval(x-20,y+40,40,40);
        g.fillOval(x+60,y+40,40,40);
    }

    public static void main(String[] args) {
        Car car=new Car();
        Thread t1=new Thread(car);
        t1.start();
    }

    @Override
    public void run() {
        //从左侧走到中间
        while(x<280){
            x++;
            repaint();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //从中间开始往下走
        while(y<600){
            y++;
            repaint();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
