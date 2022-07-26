package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

public class SwingTest{
    public static JFrame getJFrame(){
            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension=toolkit.getScreenSize();
        frame.setSize(700,600);
            frame.setLocation(dimension.width/2-350,dimension.height/2-250);
            return frame;


    }
}
class MyComponent extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2 =(Graphics2D)g;
        g2.setStroke(new BasicStroke(5));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Path2D path = new Path2D.Double();
        path.moveTo(100,400);
        path.curveTo(95,310,235,310,230,400);
        path.lineTo(400,400);
        path.curveTo(400,310,530,310,530,400);
        path.lineTo(600,400);
        path.curveTo(620,390,620,380,615,370);
        path.curveTo(625,350,600,260,480,260);
        path.curveTo(380,160,200,130,60,270);
        path.curveTo(45,300,40,290,35,340);
        path.lineTo(20,355);
        path.curveTo(18,370,17,380,45,400);
        path.closePath();
        g2.setColor(Color.YELLOW);
        g2.fill(path);
        g2.setColor(Color.black);
        g2.draw(path);
        g2.fillArc(100,197,350,197,0,180);
        g2.setColor(Color.white);
        g2.fillArc(108,203,334,175,0,180);
        g2.setColor(Color.YELLOW);

        g2.fillRect(100,265,400,40);
        g2.setColor(Color.black);
        g2.drawLine(112,265,437,265);
        g2.setColor(Color.YELLOW);
        g2.fillRect(250,197,20,100);
        g2.setColor(Color.black);
        g2.drawLine(247,200,247,265);
        g2.drawLine(270,200,270,265);
        g2.setStroke(new BasicStroke(6));
        g2.drawLine(280,290,310,290);
        g2.setStroke(new BasicStroke(5));

        Ellipse2D el1 = new Ellipse2D.Double(108,341,115,110);
        g2.fill(el1);
        Ellipse2D el2 = new Ellipse2D.Double(408,341,115,110);
        g2.fill(el2);
        g2.setColor(Color.white);
        Ellipse2D el3 = new Ellipse2D.Double(137,367,55,55);
        g2.fill(el3);
        Ellipse2D el4 = new Ellipse2D.Double(437,367,55,55);
        g2.fill(el4);
        Path2D path2 = new Path2D.Double();

        path2.moveTo(525,290);
        path2.curveTo(555,285,565,287,580,320);
        path2.curveTo(540,320,530,310,525,290);
        path2.closePath();
        g2.fill(path2);
        g2.setColor(Color.black);
        g2.draw(path2);




    }

}