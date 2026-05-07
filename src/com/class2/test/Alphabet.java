/*
    【问题描述】
        输出26个小写字母，要求十个字母换行一次，不允许出现汉字
 */

package com.class2.test;

public class Alphabet {
    public static void main(String[] args){
        int count=0;
        for(char s='a';s!='z'+1;s++){
            System.out.print(s+" ");
            count++;
            if(count==10){
                System.out.print("\n");
                count=0;
            }
        }
    }
}
