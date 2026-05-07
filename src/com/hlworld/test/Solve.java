/*
    题目：
    计算以下方程式x与y的值：
        3.4x + 50.2y = 44.5
        2.1x + 0.55y = 5.9
 */
package com.hlworld.test;

public class Solve {
    public static void main(String[] args) {
        double  a=3.4 ,b=50.2,c=2.1,d=0.55,
                e=44.5,f=5.9 ,x,y;
        //Cramer规则
        x=(e*d-b*f)/(a*d-b*c);
        y=(a*f-e*c)/(a*d-b*c);
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}


