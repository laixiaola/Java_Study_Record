/*
    【问题描述】
        已知cosx的近似计算公式如下：
        cosx = 1 - x2/2! + x4/4! - x6/6! + ... + (-1)nx2n/(2n)!
        其中x为弧度，n为大于等于0的整数。
        编写程序根据用户输入的x和n的值，利用上述近似计算公式计算cosx的近似值，要求输出结果小数点后保留8位。
 */
package com.lesson3.test;
import java.util.Scanner;

public class Cosx {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        int n=sc.nextInt();
        double res=1,d=1,m=1,s=1;
        x*=x;
        for (int i = 1; i <=n ; i++) {
            d*=(i*2)*(i*2-1);
            m*=x;
            if(s%2==1) s=-1;
            else s=1;
            res+=m/d*s;
//            System.out.print(d+" "+m+" "+res+"\n");
        }
        System.out.printf("%.8f",res);
    }
}
