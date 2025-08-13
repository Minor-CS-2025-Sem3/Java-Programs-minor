/*
20. Write an applet program to draw a Rectangle (color = orange) and a Right aligned oval.
*/
import java.applet.Applet;
import java.awt.*;

// <applet code="DrawShapesApplet" width="400" height="200"></applet>
public class DrawShapesApplet extends Applet {
    public void paint(Graphics g) {
        // Draw orange rectangle
        g.setColor(Color.ORANGE);
        g.fillRect(20, 40, 150, 100);

        // Draw right-aligned oval (touching the right edge)
        int w = getWidth();
        int h = getHeight();
        int ovalWidth = 120;
        int ovalHeight = 100;
        int x = w - ovalWidth - 20; // 20 px right margin
        int y = (h - ovalHeight) / 2;
        g.setColor(Color.BLACK);
        g.drawOval(x, y, ovalWidth, ovalHeight);
    }
}
