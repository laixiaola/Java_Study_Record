/*
    题目：
    (1)自定义两个异常类非法姓名异常IllegaNameException和非法地址异常IllegalAddressException。
    (2)定义Student类包含Name和Address属性，和setName、setAddress方法，
      当姓名长度小于1或者大于5抛出IllegaNameExceptio，当地址中不含有”省”或者“市”关键字抛出IllegalAddressException。
    (3)在main方法中进行捕获试验。
 */
package com.lesson8.cexc;

public class Test {
    public static void main(String[] args) {
        Student st=new Student();
        try {
            st.setName("陀思妥耶夫斯基");
        }
        catch (IllegalNameException e){
            System.out.println("捕获到名字异常");
        }

        try{
            st.setAddress("北京");
        }
        catch (IllegalAddressException e){
            System.out.println("捕获到地址命名异常");
        }
    }
}
