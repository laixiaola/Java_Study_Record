/*
    【问题描述】删除字符串中的重复字符
    【输入形式】输入一个字符串，全为字母字符
    【输出形式】输出删除重复字符后的字符串
 */
package com.exam;
import java.util.Scanner;
import java.lang.*;

public class Delete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        boolean[] hex = new boolean[10000];
        int size = t.length();
        StringBuffer res=new StringBuffer();
        for (int i = 0; i < size; i++) {
            char tem=t.charAt(i);
            if(!hex[tem]){
                res.append(tem);
                hex[tem]=true;
            }
        }
        String s=res.toString();
        System.out.println(s);
    }
}
