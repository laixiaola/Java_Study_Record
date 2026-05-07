package com.lesson9.music;

import java.awt.*;
import java.awt.event.*;

public class Play extends Frame implements ActionListener{
    Button[] btn=new Button[17];
    public Play(){
        setLocation(200,200);
        setSize(400,500);
        setTitle("钢琴演奏");
        setBackground(Color.GRAY);
        setVisible(true);
        setLayout(new GridLayout(1,17));

        for (int i = 0; i < 17; i++) {
            char c=(char)('A'+i);
            btn[i]=new Button(""+c);
            add(btn[i]);
            btn[i].addActionListener(this);
        }

        addWindowListener(new WinClose());
    }

    static void main(String[] args) {
        new Play();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 17; i++) {
            if(e.getSource()==btn[i]){
                char c=(char)('a'+i%7);
                String path="src\\com\\lesson9\\music\\钢琴素材\\"+c+"1.wav";
                new AudioPlay2(path);
            }
        }
    }


}
