package Coding_Activity_2.FlyweightPattern;

import java.awt.Color;
import java.awt.Graphics;

public class Line implements Shape {

    public Line() {
        System.out.println("Creating Line object");
        // adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }
    
}
