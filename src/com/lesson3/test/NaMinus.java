/*
    题目：
        输入两个整数a（大于等于1且小于等于9）和n（大于等于1且小于等于80），编程求得并输出下面等式的值：
        aa..a(n个a) - aa..a(n-1个a) - .... - aa - a
        例如：若输入的a为5，n为6，则要计算下面公式的值：
        555555-55555-5555-555-55-5。
 */
package com.lesson3.test;
import java.util.Scanner;
import java.math.BigInteger;
public class NaMinus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        int n=sc.nextInt();
        String t="1";
        for (int i = 1; i < n; i++) {
            t=t+"1";
        }
        String s=String.valueOf(a);
        BigInteger b1=new BigInteger(s);
        BigInteger b2=new BigInteger(t);
        BigInteger res=b2.subtract(caculate(n-1));
        res=res.multiply(b1);
        System.out.print(res);
    }
    public static BigInteger caculate(int n){
        if(n<1){
            return new BigInteger("0");
        }
        if(n==1){
            return new BigInteger("1");
        }
        String t="1";
        for (int i = 1; i < n; i++) {
            t=t+"1";
        }
        BigInteger t1=new BigInteger(t);
        return t1.add(caculate(n-1));
    }
}
