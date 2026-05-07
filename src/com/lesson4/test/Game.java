/*
    题目：
        编写一个掷色子数字游戏：一个游戏类Game有两个成员变量v、num，
        v有一个初值1，v的取值范围为1到6。
        定义一个方法throw，扔色子，随机产生1-6的值
        定义一个方法guess，弹出提示框，让用户输入一个整数来猜，保存到num.
        对Game类的成员变量v，用num进行猜。如果大了则提示大了，小了则提示小了。
        等于则提示猜测成功。
 */
package com.lesson4.test;

import java.util.Scanner;
import java.util.Random;

public class Game {
    int v=1;
    int num;
    public void Throw(){
       Random rd=new Random();
       v=rd.nextInt(6)+1;
    }
    public boolean guess(){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        this.num=num;
        if(num==v){
            System.out.println("猜测成功");
            return true;
        }
        else if(num>v){
            System.out.println("大了");
            return false;
        }
        else{
            System.out.println("小了");
            return false;
        }
    }

    public static void main(String[] args){
        Game game=new Game();
        game.Throw();
        boolean success=false;
        while(!success) {
            success=game.guess();
        }
    }
}
