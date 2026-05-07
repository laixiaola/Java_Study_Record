/*
    【问题描述】
        输入两个字符串str和tok。其中tok由若干字符构成，每个字符均可作为一个分隔字符对str进行分隔。
        注意：str和tok中均可以包含空格。如果tok含有空格，则空格也作为str的分隔字符。
    【输入形式】控制台分两行输入两个字符串str和tok。
    【输出形式】分行输出str被分隔后的各字符串。
    【样例输入】
        jfi,dpf.,jfpe&df-jfpf/□□jfoef$djfo□,pe
        ,. □/&$-
        （上例中&ldquo;□&rdquo;代表一个空格）
    【样例输出】
        jfi
        dpf
        jfpe
        df
        jfpf
        jfoef
        djfo
        pe
 */
package com.class2.test;
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),tox=sc.nextLine();
        int strsiz=str.length(),toxsiz=tox.length();
        char[] cstr=str.toCharArray();
        char[] ctox=tox.toCharArray();
        int[] hash=new int[128];
        for(int i=0;i<toxsiz;i++){
            int j=ctox[i]%128;
            if(hash[j]==0){
                hash[j]=1;
            }
//            System.out.print(ctox[i]);
        }
//        System.out.print("\n");
        boolean edl=true;
        for (int i = 0; i < strsiz; i++) {
            int j=cstr[i]%128;
            if(hash[j]==0){
                System.out.print(cstr[i]);
                edl=false;
            }
            else{
                if(!edl) {
                    System.out.print("\n");
                    edl=true;
                }
            }
//            System.out.print(cstr[i]);
        }
    }
}
