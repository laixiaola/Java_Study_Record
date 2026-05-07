package com.lesson5;

public class Test {
    public static void main(String[] args) {
        Child c=new Child();
        c.print();
    }
}
class Parent{
    int name;
    void print(){
        System.out.println(1);
    }
}
class Child extends Parent{
    int age;
}
