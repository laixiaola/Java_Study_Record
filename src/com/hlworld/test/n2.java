/*
    题目：
         控制台输入一个整数n。输出从1到n的2的n次方的值。
 */
package com.hlworld.test;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        printPowersof2(i);
    }
    static void printPowersof2(int a){
        int j=1;
        for(int i=0;i<=a;i++){
            System.out.print(j+" ");
            j*=2;
        }
    }
}