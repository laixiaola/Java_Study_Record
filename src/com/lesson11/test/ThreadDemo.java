package com.lesson11.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    static void main(String[] args) throws ExecutionException, InterruptedException {
//        //方法一：Thread继承实现
//        MyThread t1=new MyThread();
//        MyThread t2=new MyThread();

//        //方法二：Runnable接口实现
//        MyRun mr=new MyRun();
//        Thread t1=new Thread(mr);
//        Thread t2=new Thread(mr);

          //方法一二主函数
//        t1.setName("Thread 1");
//        t2.setName("Thread 2");
//
//        t1.start();
//        t2.start();

        //方法三：Callable接口+FutureTask对象实现（可以返回值）
        MyCall my=new MyCall();
        FutureTask<Integer> ft=new FutureTask<>(my);
        Thread t1=new Thread(ft);
        t1.start();

        //方法三主函数（接受返回值）
        Integer result= ft.get();
        System.out.println(result);
    }
}
