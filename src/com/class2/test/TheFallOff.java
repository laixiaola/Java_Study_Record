/*
    【问题描述】
        一球从100米高度(high)自由落下，每次落地后反跳回原高度的一半；再落下。
        编写一个方法(static double statLength(int n)，n表示落下的次数)计算球在第n次落地时，共经过多少米？在main方法中调用
        该方法计算并输出球在第10次落地时经过的距离。
 */
package com.class2.test;

public class TheFallOff {
    public static void main(String[] args){
        System.out.print(fall(10,100*2)-100);
    }
    public static double fall(int a,double start){
        if(a==1){
            return start;
        }
        double res=start;
        res+=fall(a-1,start/2);
        return res;
    }
}
