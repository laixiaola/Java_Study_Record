/*
    【问题描述】编写一个程序，从键盘接收一个字符串，然后按照字符顺序从小到大进行排序，并删除重复的字符。
 */

package com.class2.test;
import java.util.Scanner;
import java.util.Arrays;
public class SortString {
    public static void main(String[] args){
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int size=s.length();
        StringBuffer ans=new StringBuffer();
        int[] hash=new int[29];
        for(int i=0;i<size;i++){
            char j=s.charAt(i);
            int temp=j%26;
            if(hash[temp]==0){
                hash[temp]=1;
                ans.append(j);
            }
        }
        s=ans.toString();
        char[] res=s.toCharArray();
        Arrays.sort(res);
        String result=new String(res);
        System.out.println(result);
    }
}
