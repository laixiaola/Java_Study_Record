/*
    【问题描述】
        从键盘输入一个整数，判断该数字能否被5整除。如果能被5整除，则输出yes，如果不能则输出no
 */

package com.hlworld.test;

import java.util.Scanner;

public class Prog2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        if(i%5==0) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
