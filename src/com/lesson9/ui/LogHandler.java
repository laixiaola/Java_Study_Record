package com.lesson9.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LogHandler implements ActionListener {
    private Component component;
    private TextComponent usrname;
    private TextComponent password;

    public LogHandler(Component c){
        component=c;
    }
    public LogHandler(Component c, TextComponent usrname, TextComponent password){
        component=c;
        this.usrname=usrname;
        this.password=password;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Random rd=new Random();
        component.setBackground(new Color(rd.nextInt(256),rd.nextInt(256),rd.nextInt(256)));

        String usrname=this.usrname.getText();
        String pasword=this.password.getText();
        if(usrname.isEmpty()||pasword.isEmpty()){
            System.out.println("usrname or password should not be empty!");
        }
    }
}
