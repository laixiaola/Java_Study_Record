/*
    题目：
        假设一个跑步者1小时40分钟35秒内跑了24英里，求他的平均速度（公里每小时）
 */
package com.hlworld.test;

public class Averagepace {
    public static void main(String[] args){
        //输入时间时分秒
        double hour=1,minute=40,second=35;
        //时间单位转换，全部变成小时
        hour+=(minute+(second/60))/60;
        //输入路程（英里）
        double dis=24;
        //路程单位转换（公里）
        dis*=1.6;
        //计算平均速度
        double v=dis/hour;
        System.out.print("平均速度是"+v+"公里每小时");
    }
}
