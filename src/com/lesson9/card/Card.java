package com.lesson9.card;

import com.lesson9.music.WinClose;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card extends Frame implements ActionListener {
    CardLayout card=new CardLayout();
    Panel p=new Panel(card);
    public Card(){
        setSize(500,500);
        setLocation(200,200);
        setTitle("Card");
        setLayout(new BorderLayout());

        add("Center",p);
        for (int i = 1; i < 16; i++) {
            JLabel l1=new JLabel(new ImageIcon("src\\com\\lesson9\\动画素材\\frame-"+i+".gif"));
            p.add(l1);
        }
        Button b1=new Button("flip");
        add("South",b1);
        b1.addActionListener(this);

        addWindowListener(new WinClose());;

        setVisible(true);
    }

    static void main(String[] args) {
        new Card();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(p);
    }
}
