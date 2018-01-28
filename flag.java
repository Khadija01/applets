import java.awt.*;
import java.applet.*;
 public class flag extends Applet
 {
     public void paint(Graphics g)
     {
         g.setColor(Color.green);
         g.fillRect(170, 100, 90, 60);
         g.setColor(Color.red);
           g.fillOval(195,110,40,40);
     }
 }
