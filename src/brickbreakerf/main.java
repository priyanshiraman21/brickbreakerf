package brickbreakerf;

import brickbreakerf.gameplay;

import javax.swing.*;

public class main {
    public static void main(String [] args)
    {
        JFrame obj = new JFrame();
        gameplay gameplay1 = new gameplay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("BreakoutBall");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay1);
    }
}
