/*
    题目：
    已知温度转换代码如下:
        import javax.swing.*;
        public class TestWendu {
        public static void main(String[] args) {
              String input=JOptionPane.showInputDialog("请输入华氏度：");
              double 华氏度=Double.parseDouble(input);
              double 摄氏度=(5.0/9)*(华氏度-32);
              JOptionPane.showMessageDialog(null, "摄氏度:"+摄氏度);
        }
        }
        请输入a进行测试，运行异常处理知识改造上述代码，实现任意次数随意输入代码仍能稳定运行，直到运行正确后退出。
 */
package com.lesson8.test;

import javax.swing.*;

public class TestWendu {
    public static void main(String[] args) {
        double 华氏度;
        String input;
        while(true) {
            try {
                input = JOptionPane.showInputDialog("请输入华氏度：");
                华氏度 = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "捕获到数字格式异常,请重新输入","警告",JOptionPane.WARNING_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "捕获到" + e.getMessage() + "异常,请重新输入","警告",JOptionPane.WARNING_MESSAGE);
            }
        }
        double 摄氏度=(5.0/9)*(华氏度-32);
        JOptionPane.showMessageDialog(null, "摄氏度:"+摄氏度);
    }

}