package com.lesson4.table;

public class Table {
    public String Shape;
    public int Leg;
    public int Hight;
    public int Area;
    public Table(String Shape,int Leg,int Hight,int Area){
        this.Shape=Shape;
        this.Leg=Leg;
        this.Hight=Hight;
        this.Area=Area;
    }
    public void print(){
        System.out.println("Shape:"+Shape);
        System.out.println("Legs:"+Leg);
        System.out.println("Hight:"+Hight);
        System.out.print("Area:"+Area);
    }
}
