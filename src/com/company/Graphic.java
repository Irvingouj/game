package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Graphic extends JPanel implements ActionListener {
    Timer timer=new Timer(50,this);
    int x,y;
    double seconds=0;
    BufferedImage bi;
    public Graphic(){
        timer.start();
        x=100;
        y=100;

        try{
            bi= ImageIO.read(new File("ottawa.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        this.setBackground(new Color(175,255, 161));
        Image newImage=bi.getScaledInstance(600,500,Image.SCALE_DEFAULT);
        bi.setRGB(600,500,Image.SCALE_DEFAULT);
        g.drawImage(newImage,0,0,this);

        Graphics2D g2=(Graphics2D)g;

        g2.fillOval(x,y,40,20);
        g2.draw(new Rectangle(x,y,100,100));

    }
    @Override
    public void actionPerformed(ActionEvent e) {

//        seconds+=0.05;
//        x=(int)(Math.sin(seconds*Math.PI)*100+100);
//        y=(int)(Math.cos(seconds*Math.PI)*100+100);
//        repaint();
    }
}
