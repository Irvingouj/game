package com.company;

import javax.swing.*;

public class GameFrame extends JFrame {
    Graphic gameGraphic=new Graphic();




    public GameFrame(){
        this.setSize(840,840);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GraphicMouseHandle());
        this.setVisible(true);
    }
}
