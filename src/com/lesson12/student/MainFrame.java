/*
    题目：
        在lesson8/student的基础上，实现一个“保存到文件”按钮
 */
package com.lesson12.student;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MainFrame extends JFrame implements ActionListener {
    JTextField name=new JTextField(10);
    JTextField num=new JTextField(10);
    JTextField college=new JTextField(10);
    JTextField major=new JTextField(10);
    JTextArea area=new JTextArea(5,30);
    JButton b1=new JButton("保存");
    //新增“保存到文件”按钮
    JButton b2=new JButton("保存到文件");

    public MainFrame(){
        setLocation(300,300);
        setSize(600,600);
        setTitle("学生信息录入");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        add("West",p1);
        add("Center",p2);

        JLabel l1=new JLabel("学生信息录入");
        JLabel l2=new JLabel("请录入学生姓名：");
        JLabel l3=new JLabel("请录入学生学号：");
        JLabel l4=new JLabel("请录入学生学院：");
        JLabel l5=new JLabel("请录入学生专业：");

        b1.addActionListener(this);
        b2.addActionListener(this);

        p1.setLayout(new GridLayout(11,1,10,15));
        p1.add(l1);p1.add(l2);p1.add(name);p1.add(l3);p1.add(num);p1.add(l4);
        p1.add(college);p1.add(l5);p1.add(major);p1.add(b1);p1.add(b2);
        p1.setBorder(new EmptyBorder(0,10,5,0));

        p2.setLayout(new BorderLayout());
        p2.add("Center",area);
        p2.setBorder(new EmptyBorder(10,10,10,10));
        area.setEditable(false);
        area.setFont(new Font("宋体",Font.PLAIN,14));

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            area.append("姓名：" + name.getText() + " 学号：" + num.getText() + " 学院：" + college.getText() + " 专业：" + major.getText() + "\n");
        }
        //实现保存到文件的按钮事件
        else if(e.getSource()==b2){
            try(FileOutputStream fos=new FileOutputStream("src/com/lesson12/student/studentfile.txt")) {
                byte[] bytes=area.getText().getBytes();
                fos.write(bytes);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
