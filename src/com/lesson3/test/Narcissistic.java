/*
    【问题描述】
        编写一个程序，求出100~400之间的所有水仙花数。
        所谓的水仙花数是：如果一个三位数的个位数、十位数、百位数的立方和等于该数自身，就称这个数为水仙花数。
 */
package com.lesson3.test;

public class Narcissistic {
    public static void main(String[] args){
        for (int i = 100; i <400 ; i++) {
            int res=0;
            int num=i;
            for (int j = 0; j < 3; j++) {
                int t=num%10;
                res+=(t*t*t);
                num/=10;
            }
            if(res==i){
                System.out.println(i);
            }
        }
    }
}
