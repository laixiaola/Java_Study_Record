/*
    【问题描述】
        完全数，又称为完美数或完备数，是一些特殊的自然数，它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
        例如，第一个完全数是6，它的约数1、2、3、6，去除它本身6外，其余3个数相加，1+2+3=6.
        第二个完全数是28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。编程求10000以内的完全数。
    【输出形式】输出10000以内的完全数，并输出每个完数的真因子。完数及各真因子之间用空格隔开，一个完数一行
 */

package com.class2.test;
import java.lang.Math;
import java.util.ArrayDeque;
import java.util.Deque;

public class PerfectNumber {
    public static void main(String[] args){
            for(int i=4;i<=10000;i++){
                int sum=1;
                Deque<Integer> stack=new ArrayDeque<>();
                Deque<Integer> que=new ArrayDeque<>();
                int maxy=(int) Math.sqrt(i)+1;
                for(int j=2;j<maxy;j++){
                    if(i%j==0){
                        int ano=i/j;
                        sum=sum+j+ano;
                        if(sum>i) break;
                        if(j*j==i){
                            que.offer(j);
                        }
                        else {
                            stack.push(ano);
                            que.offer(j);
                        }
                    }
                }
                if(sum==i) {
                    System.out.print(i+" "+1);
                    while (!que.isEmpty()) System.out.print(" " + que.pop());
                    while (!stack.isEmpty()) System.out.print(" " + stack.pop());
                    System.out.print("\n");
                }
            }
    }
}
