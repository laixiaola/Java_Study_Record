/*
    题目：
        多线程试验。
        模拟航班售票系统，实现3个售票窗口并行发售机票,
        窗口1发售东航航班MU2151的100张机票,
        窗口2发售海航航班HA2058的100张机票,
        窗口3发售国航CA3136的100张机票,
        一个售票窗口用一个线程表示。要求不能重复发售。
 */

package com.lesson11.sell;

public class Window implements Runnable {
    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        for (int i = 1; i <= 100; i++) {
            System.out.println(name + " 出售第"+i+"张机票");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Window win=new Window();
        Thread t1=new Thread(win,"窗口1 东航航班MU2151");
        Thread t2=new Thread(win,"窗口2 海航航班HA2058");
        Thread t3=new Thread(win,"窗口3 国航CA3136");

        t1.start();
        t2.start();
        t3.start();
    }
}
