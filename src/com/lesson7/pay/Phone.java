/*
    【问题描述】
        定义一个接口PayAble，包含计算电话话费的方法pay()。
        定义电话类Phone，包括属性号码code。定义手机类MobilePhone继承Phone类，包含属性有通话时间time，话费单价price。
        手机类实现PayAble接口计算话费。话费计算方法：手机类话费=通话时间*话费单价+上网费用+短信费用。
        要点提示：在手机类和固定电话类中实现接口PayAble。
    【输入形式】输入通话时长，话费单价
    【输出形式】话费
    【样例输入】120 0.6
    【样例输出】Fee=72.0
 */
package com.lesson7.pay;
import java.util.Scanner;

public class Phone implements PayAble{
    int code;

    @Override
    public double pay() {
        return 0;
    }
}

class MobilePhone extends Phone implements PayAble{
    int time;
    double price;

    public MobilePhone(){}
    public MobilePhone(int t,double p){
        time=t;
        price=p;
    }

    @Override
    public double pay() {
        return time*price;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MobilePhone ios=new MobilePhone(sc.nextInt(),sc.nextDouble());
        System.out.print("Fee="+ios.pay());
    }
}