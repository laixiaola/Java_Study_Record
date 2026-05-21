/*  题目：
        编写程序将一个小文件切割成三个更小的同等大小文件，按照原来的文件名加上-1,-2等进行保存，
        然后编写程序将它们再合并成一个新文件。
 */
package com.lesson12.test;

import java.io.*;

public class MyFile {
    public static void main(String[] args) throws IOException {
        byte[] bytes=new byte[2000];

        //读取原文件
        File f1 = new File("src\\com\\lesson12\\test\\aaa");
        FileInputStream fis=new FileInputStream(f1);
        int count=fis.read(bytes);
        fis.close();

        //将分割原文件成三份
        int size=count/3;
        byte[] b1=new byte[size];
        byte[] b2=new byte[size];
        byte[] b3=new byte[size];
        for (int i = 0; i < size; i++) {
            b1[i]=bytes[i];
        }
        for (int i = 0; i < size; i++) {
            b2[i]=bytes[i+size];
        }
        for (int i = 0; i < size; i++) {
            b3[i]=bytes[i+2*size];
        }

        //输出分割出的三个文件
        FileOutputStream fos1=new FileOutputStream("src\\com\\lesson12\\test\\aaa-1");
        fos1.write(b1);
        fos1.close();
        FileOutputStream fos2=new FileOutputStream("src\\com\\lesson12\\test\\aaa-2");
        fos2.write(b2);
        fos2.close();
        FileOutputStream fos3=new FileOutputStream("src\\com\\lesson12\\test\\aaa-3");
        fos3.write(b3);
        fos3.close();

        //合并分割出的三个文件
        FileOutputStream fosnew=new FileOutputStream("src\\com\\lesson12\\test\\new-aaa");
        for (int i = 1; i <= 3; i++) {
            byte[] tb=new byte[size];
            String filepath="src\\com\\lesson12\\test\\aaa-"+i;
            FileInputStream in=new FileInputStream(filepath);
            int len=in.read(tb);
            fosnew.write(tb,0,len);
            in.close();
        }
        fosnew.close();
    }

}
