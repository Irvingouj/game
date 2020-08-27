package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GraphicMouseHandle extends JPanel implements MouseListener {

    int x,y;
    public GraphicMouseHandle(){
        x=0;
        y=0;
        this.addMouseListener(this);
    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;

        g2.fillOval(x,y,20,20);

        System.out.println(x+":"+y);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

//        x=getX();
//        y=getY();
//        System.out.println("mouse clicked and x="+x+" y="+y);
//        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point point;
        point=this.getLocation();
        x=point.x+e.getX();
        y=point.y+e.getY();

//        System.out.println("mouse pressed and x="+x+" y="+y);
        repaint();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
