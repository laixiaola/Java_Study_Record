/*
    【问题描述】求100以内的素数
 */
package com.lesson3.test;
import java.lang.Math;
public class Prime {
    public static void main(String[] args){
        for (int i = 2; i < 100; i++) {
            int count=0;
            int mid=(int)Math.sqrt((double)i)+1;
            for (int j = 2; j < mid; j++) {
                if(i%j==0) {count=1;break;}
            }
            if(count==0) System.out.print(i+" ");
        }
    }
}
