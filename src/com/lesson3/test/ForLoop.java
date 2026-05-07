/*
    题目：
        有红、黄、黑、白4色球各一个，放置在编号为1，2，3，4的4个盒子里面，每个盒子一个球，顺序未知。甲、乙、丙三个人猜测放置顺序如下：
        甲：黑球在1号盒子，黄球在2号盒子；
        乙：黑球在2号盒子，白球在3号盒子；
        丙：红球在2号盒子，白球在4号盒子；
        结果证明：甲、乙、丙三人各猜中一半，试通过程序求出4色球在盒子中的放置位置。
        代码不超过30行。
 */
package com.lesson3.test;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean jia=false,yi=false,bin=false,diff=false;
        for(int r=1;r<=4;r++){   //红色
            for(int y=1;y<=4;y++){   //黄色
                for(int b=1;b<=4;b++){   //黑色
                    for(int w=1;w<=4;w++){   //白色
                        jia=((b==1)&&(y!=2))||((b!=1)&&(y==2));  //甲判断条件成立
                        yi=((b==2)&&(w!=3))||((b!=2)&&(w==3));   //乙判断条件成立
                        bin=((r==2)&&(w!=4))||((r!=2)&&(w==4));   //丙判断条件成立
                        diff=!((r==w)||(r==y)||(r==b)||(w==b)||(w==y)||(b==y)); //保证每个盒子只有一个球
                        if(jia && yi && bin && diff){
                            System.out.print("红球在"+r+"号盒子\n"+"黄球在"+y+"号盒子\n"+
                                            "黑球在"+b+"号盒子\n"+"白球在"+w+"号盒子\n");
                            break;
                        }
                    }
                    if(jia&&yi&&bin&&diff) break;
                }
                if(jia&&yi&&bin&diff) break;
            }
            if(jia&&yi&&bin&&diff) break;
        }
    }
}