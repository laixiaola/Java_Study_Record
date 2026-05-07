package com.lesson8.test;

class Father {
    public static void show() {
        System.out.println("父类静态方法");
    }
}

class Son extends Father {
    // 隐藏父类静态方法，不是重写

}

public class Test {
    public static void main(String[] args) {
        // 1. 类名直接调用
        Father.show();  // 父类静态方法
        Son.show();     // 子类静态方法

        // 2. 静态绑定：看左边引用类型
        Father f = new Son();
        f.show();       // 父类静态方法 ✅ 不是多态
    }
}