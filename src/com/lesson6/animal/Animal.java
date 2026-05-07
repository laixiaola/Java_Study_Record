/*
    题目：
     假设有一个Animal类，其中包含一个名为sayHello()的方法，请根据要求创建相应的子类和实现方法：
        （1）创建两个子类分别为Cat和Dog类；
        （2）在Cat类中重写sayHello()方法，使其输出"Hello, I am a cat";
        （3）在Dog类中重写sayHello()方法，使其输出"Hello, I am a dog";
        （4）创建一个Animal数组，使用多态的方式分别将Cat和Dog的对象存入数组。
        （5）遍历Animal数组，并调用每个对象的sayHello()方法
 */
package com.lesson6.animal;

public abstract class Animal {
    long String=0x11L;
    public abstract void sayHello();
}

class Cat extends Animal{
    @Override
    public void sayHello() {
        System.out.println("Hello, I am a cat");
    }
}

class Dog extends Animal{
    @Override
    public void sayHello() {
        System.out.println("Hello, I am a dog");
    }
}

class Test{
    public static void main(String[] args){
        Animal[] animal=new Animal[2];
        animal[0]=new Cat();
        animal[1]=new Dog();
        for (int i = 0; i < 2; i++) {
            animal[i].sayHello();
        }
    }
}
