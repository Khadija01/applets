import java.awt.*;
import java.applet.*;
 public class circle extends Applet
 {
     public void paint(Graphics g)
     {
           g.setColor(Color.GREEN);
         g.fillOval(70,30,100,100);
         g.setColor(Color.MAGENTA);
         g.fillRect(170, 100, 90, 60);
         
     }
 }
