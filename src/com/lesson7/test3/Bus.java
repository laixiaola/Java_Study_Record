/*
    题目：
        定义一个“收费”的接口，包含一个方法“收取费用”，定义一个“调节温度”的接口，包含一个“AdjustTemp”的方法，
        定义公共汽车类实现“收费”的接口，定义一个出租车类实现“收费”和“调节温度”的接口，在main方法中进行测试。
 */
package com.lesson7.test3;

public class Bus implements Charge{
    @Override
    public void charge() {
        System.out.println("Bus charge");
    }
}

class Taxi implements Charge,AdjTemp{
    @Override
    public void AdjustTemp() {
        System.out.println("Adjusting temperature");
    }

    @Override
    public void charge() {
        System.out.println("Taxi charge");
    }
}

class test{
    public static void main(String[] args) {
        Bus bus=new Bus();
        Taxi taxi=new Taxi();
        bus.charge();
        taxi.charge();
        taxi.AdjustTemp();
    }
}