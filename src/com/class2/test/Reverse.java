/*
    【问题描述】
      编写一个程序，实现字符串大小写的转换并倒序输出，要求如下
        1）输入一行字符串，使用for循环将字符串从最后一个字符开始遍历。
        2）遍历的当前字符如果是大写字符，就使用toLowerCase()方法将其转换为小写字符，
        反之则使用toUpperCase() 方法将其转换为大写字符。如果是其它字符，不做转换。
        3）定义一个StringBuffer对象，调用append()方法依次添加遍历的字符，最后调用StringBuffer对象的toString()方法，并将得到的结果输出。
 */
package com.class2.test;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int siz=s.length();
        StringBuffer sb=new StringBuffer();

        for(int i=siz-1;i>=0;i--){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }
            else{
                sb.append(c);
            }
        }
        String res=sb.toString();
        System.out.print(res);
    }
}
