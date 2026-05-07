/*
    题目：
     设计立体图形接口，包括计算表面积和体积的方法；设计圆柱体类和圆锥体类，分别实现立体图形接口，计算表面积和体积。
 */
package com.lesson7.ThreeD;
//立体图形接口
public interface Diagram {
    double area();
    double volume();
}

//圆柱体类
class Cylinder implements Diagram{
    double r;
    double h;
    public Cylinder(){}
    public Cylinder(double r,double h){
        this.r=r;
        this.h=h;
    }
    @Override
    public double area() {
        return 2*Math.PI*r*h+Math.PI*r*r*2;
    }

    @Override
    public double volume() {
        return Math.PI*r*r*h;
    }
}

//圆锥类
class Cone implements Diagram{
    double r;
    double h;
    public Cone(){}
    public Cone(double r,double h){
        this.r=r;
        this.h=h;
    }
    @Override
    public double area() {
        return Math.PI*r*Math.sqrt(r*r+h*h);
    }

    @Override
    public double volume() {
        return Math.PI*r*r*h/3;
    }
}
