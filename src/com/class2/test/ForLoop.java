/*
    题目：
        编写一个for循环输出如下结果：
            1 4 9 16 25 36 49 64 81 100
        为了增加难度，要求代码中不能使用乘法运算符（*）。（提示：考虑相邻两个数之间的差值。）
 */
package com.class2.test;

public class ForLoop {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<=100;i+=a){
            System.out.print(i+" ");
            a+=2;
        }
    }
}
