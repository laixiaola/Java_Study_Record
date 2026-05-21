/*
    【问题描述】设计学生类Student，实现接口MoveAble中方法，显示学生移动信息
    【输入形式】无
    【输出形式】move with owner
 */
package com.lesson12.exam;

public class Student implements MoveAble{
    @Override
    public void move() {
        System.out.println("move with owner");
    }

    public static void main(String[] args) {
        new Student().move();
    }
}
