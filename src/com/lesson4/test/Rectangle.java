/*
    题目：
        编写一个Java Application程序，文件名为 长方体.java。
        目的：掌握类的结构，对象的引用，熟悉属性、方法的使用。
        要求：：
        1.   建立一个类，
        ①  矩形的属性长、宽、高、面积、体积分别为length, width、height，S、L；
        ②  方法setBox( )，设置length，width和height的初始值，
        ③  方法getArea( )，计算矩形的面积Ｓ。
        ④  方法getL(　)，计算矩形的体积L。
        2.   在主类的main方法中，输出矩形的长、宽、高和面积、体积。
        3.   增加三个构造方法，对长方体进行初始化。
 */
package com.lesson4.test;

public class Rectangle {
    int length;     //长
    int width;      //宽
    int height;     //高
    int S;      //面积
    int L;      //体积

    public void setBox(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
        S=length*width;
        L=length*width*height;
    }

    public int getArea(){
        return S;
    }

    public int getL(){
        return L;
    }

    public void print(){
        System.out.println("长："+length+" "+"宽："+width+" "+"高："+height+" "+"面积："+S+" "+"体积："+L);
    }
    //构造方法
    //构造方法一：空参
    public Rectangle(){}
    //构造方法二：部分参
    public Rectangle(int length,int width,int height){
        setBox(length,width,height);
    }
    //构造方法三：全参
    public Rectangle(int length,int width,int height,int S,int L){
        this.length=length;
        this.width=width;
        this.height=height;
        this.S=S;
        this.L=L;
    }

    //主函数
    public static void main(String[] args){
        //构造方法一测试
        System.out.println("构造方法一测试：");
        Rectangle rect1=new Rectangle();
        rect1.setBox(2,2,2);
        rect1.print();
        //构造方法二测试
        System.out.println("构造方法二测试：");
        Rectangle rect2=new Rectangle(2,2,2);
        rect2.print();
        //构造方法三测试
        System.out.println("构造方法三测试：");
        Rectangle rect3=new Rectangle(2,2,2,4,8);
        rect3.print();
    }
}
