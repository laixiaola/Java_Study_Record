/*
    题目：
        编写如下学生信息录入窗口界面，当点击保存按钮，将用户录入信息显示在右侧的文本区中。
        使用边布局、网格布局、流式布局
                            ↑
                  其实老师上课给的答案并没有用流式布局
 */
package com.lesson10.student;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    JTextField name=new JTextField(10);
    JTextField num=new JTextField(10);
    JTextField college=new JTextField(10);
    JTextField major=new JTextField(10);
    JTextArea area=new JTextArea(5,30);

    public MainFrame(){
        setLocation(300,300);
        setSize(600,600);
        setTitle("学生信息录入");
        setLayout(new BorderLayout());

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        add("West",p1);
        add("Center",p2);

        JLabel l1=new JLabel("学生信息录入");
        JLabel l2=new JLabel("请录入学生姓名：");
        JLabel l3=new JLabel("请录入学生学院：");
        JLabel l4=new JLabel("请录入学生学院：");
        JLabel l5=new JLabel("请录入学生专业：");
        JButton b1=new JButton("保存");
        b1.addActionListener(this);

        p1.setLayout(new GridLayout(10,1,10,15));
        p1.add(l1);p1.add(l2);p1.add(name);p1.add(l3);p1.add(num);p1.add(l4);
        p1.add(college);p1.add(l5);p1.add(major);p1.add(b1);
        p1.setBorder(new EmptyBorder(0,10,5,0));

        p2.setLayout(new BorderLayout());
        p2.add("Center",area);
        p2.setBorder(new EmptyBorder(10,10,10,10));
        area.setEditable(false);
        area.setFont(new Font("宋体",Font.PLAIN,14));

        addWindowListener(new WinClose());
        setVisible(true);
    }

    static void main(String[] args) {
        new MainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        area.append("姓名："+name.getText()+" 学号："+num.getText()+" 学院："+college.getText()+" 专业："+major.getText()+"\n");
    }
}
