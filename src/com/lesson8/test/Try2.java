package com.lesson8.test;

public class Try2 {
    public static void main(String[] args) {
        int i=0;
        int a[]={5,6,7,8};
        for (i = 0; i < 5; i++) {
            try{
                System.out.print("a["+i+"]/"+i+"="+(a[i]/i));
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.print("数组下标异常");
            }
            catch (ArithmeticException e){
                System.out.print("算数异常");
            }
            catch (Exception e){
                System.out.print("捕获"+e.getMessage()+"异常！");
            }
            finally {
                System.out.println("i="+i);
            }
        }
        System.out.println("继续!");
    }
}
