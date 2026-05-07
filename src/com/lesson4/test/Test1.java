/*
    题目：
        输入两个整数a和b，求他们的最大公约数和最小公倍数数。
 */
package com.lesson4.test;
import java.util.Scanner;
import java.lang.Math;
public class Test1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int big=Math.max(a,b);
        int lil=Math.min(a,b);
        int yue=1,bei=100000;
//        for (int i = lil; i >1; i--) {
//            if(lil%i==0 && big%i==0){
//                yue=i;
//                break;
//            }
//        }
        yue=syue(a,b);
        for (int i = 1; i <=lil; i++) {
            if((big*i)%lil==0){
                bei=i*big;
                break;
            }
        }
        System.out.println(yue+" "+bei);
    }
    public static int syue(int a,int b){
        if(a%b==0){
            return b;
        }
        return syue(b,a%b);
    }
}
