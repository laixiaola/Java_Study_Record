/*
    题目：
        多线程试验。模拟航班售票系统，
        实现4个售票窗口同时发售东航航班MU2151的100张机票，
        一个售票窗口用一个线程表示。要求不能重复发售。
 */

package com.lesson11.sell;

public class MutexWindow extends Thread{

    static int ticket=0;

    public MutexWindow(){}
    public MutexWindow(String name){super(name);}

    @Override
    public void run() {
        while(true){
            synchronized (MutexWindow.class){
                if(ticket<100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    ticket++;
                    System.out.println(getName()+"出售了东航航班MU2151第"+ticket+"张票");
                }
                else{
                    break;
                }
            }
        }
    }

    public void main(String[] args) {
        MutexWindow win1=new MutexWindow("窗口1");
        MutexWindow win2=new MutexWindow("窗口2");
        MutexWindow win3=new MutexWindow("窗口3");
        MutexWindow win4=new MutexWindow("窗口4");

        win1.start();
        win2.start();
        win3.start();
        win4.start();
    }
}
