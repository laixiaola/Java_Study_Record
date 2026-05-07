package com.lesson9.ui;

import java.awt.*;
import java.awt.event.*;

public class FrameL extends Frame {
    public FrameL(){
        setSize(250,300);
        setLocation(200,200);
        setBackground(Color.GRAY);
        setTitle("用户登录");
        setVisible(true);
        setLayout(new FlowLayout());

        Label label=new Label("Username");
        add(label);
        TextField tx1=new TextField(20);
        add(tx1);

        Label l2=new Label("password");
        add(l2);
        TextField tx2=new TextField(20);
        add(tx2);
        tx2.setEchoChar('*');

        Button b1=new Button("Log in");
        add(b1);
        b1.addActionListener(new LogHandler(this,tx1,tx2));

        Button b2=new Button("Exit");
        add(b2);
        b2.addActionListener(new ExitHandler());
    }

    public static void main(String[] args) {
        new FrameL();
    }
}
