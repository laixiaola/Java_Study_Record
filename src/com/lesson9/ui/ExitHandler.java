package com.lesson9.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(-1);
    }
}
