package com.bigin.game.example.chapter07_08;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassEx7 {

    public static void main(String[] args) {
        Button button = new Button("Start");
        button.addActionListener(new EventHandler());
    }

}

class EventHandler implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!");
    }
}