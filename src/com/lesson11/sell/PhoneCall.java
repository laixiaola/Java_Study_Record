/*
    题目：
        模拟打电话程序， 模拟三个人（三个线程）给同一个人打电话，
        每个人是一个线程，随机模拟每次通话时间。
 */
package com.lesson11.sell;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.*;

public class PhoneCall extends Thread{
    Lock lock=new ReentrantLock();

    public PhoneCall(){}
    public PhoneCall(String name){super(name);}

    @Override
    public void run() {
        System.out.println(getName()+"给小明打电话，等待接通");
        synchronized (PhoneCall.class){
            System.out.println(getName()+"电话接通");

            //模拟通话过程(sleep)
            int time= ThreadLocalRandom.current().nextInt(10000)+1;
            try {
                System.out.println(getName()+"与小明通话中");
                sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(getName()+"通话结束，通话时长"+(double)time/1000+"秒");
        }
    }

    public static void main(String[] args) {
        PhoneCall call1=new PhoneCall("张三");
        PhoneCall call2=new PhoneCall("李四");
        PhoneCall call3=new PhoneCall("王五");

        call1.start();
        call2.start();
        call3.start();
    }
}
