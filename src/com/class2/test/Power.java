/*
    【问题描述】
        从键盘输入两个整数a和b，a与b不为0，编程，求a的b次幂，并输出。
 */
package com.class2.test;
import java.util.Scanner;
public class Power{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong();
        double dres=1;
        long lres=1;
        for(long i=0;i<b;i++){
            lres*=a;
        }
        for (long i = 0; i < -b; i++) {
            dres *= a;
        }
        if(b==0){
            System.out.print(1);
        }
        else if(b<0){
            System.out.print(1/dres);
        }
        else{
            System.out.print(lres);
        }
    }
}
