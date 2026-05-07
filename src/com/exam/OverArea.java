/*
    【问题描述】求两个矩形的重叠部分面积
            输入：第一行：第一个矩形的左上角坐标和右下角坐标，
                 第二行：第二个矩形的左上角坐标和右下角坐标，每个数用空格隔开。
            输出：重叠部分面积
 */
package com.exam;
import java.util.Scanner;
import java.lang.Math;
public class OverArea {
    public static void main(String[] args){
        int ax1,ax2,ay1,ay2,bx1,bx2,by1,by2;
        Scanner sc=new Scanner(System.in);
        ax1=sc.nextInt();ay1=sc.nextInt();ax2=sc.nextInt();ay2=sc.nextInt();
        bx1=sc.nextInt();by1=sc.nextInt();bx2=sc.nextInt();by2=sc.nextInt();
        int max_ax=Math.max(ax1,ax2);int min_ax=Math.min(ax1,ax2);
        int max_bx=Math.max(bx1,bx2);int min_bx=Math.min(bx1,bx2);
        int max_ay=Math.max(ay1,ay2);int min_ay=Math.min(ay1,ay2);
        int max_by=Math.max(by1,by2);int min_by=Math.min(by1,by2);
        int length=Math.min(max_ax,max_bx)-Math.max(min_ax,min_bx);
        int width=Math.min(max_ay,max_by)-Math.max(min_ay,min_by);
        if(length>0&&width>0){
            System.out.println(length*width);
        }
        else{
            System.out.println(0);
        }
    }
}
