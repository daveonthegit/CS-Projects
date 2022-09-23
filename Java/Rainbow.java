// ________________________________________________

import java.awt.*;
import javax.swing.*;

public class Rainbow extends JPanel
{
  // Declare skyColor:
  Color skycolor = Color.CYAN;
  public Rainbow()
  {
    setBackground(skycolor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    int xCenter = width/2;
    int yCenter = height/2;
 
    // Declare and initialize the radius of the large semicircle:
    int largeR = 200;

    g.setColor(Color.RED);

    // Draw the large semicircle:
    g.fillArc(xCenter-largeR/2, yCenter-largeR/2, largeR, largeR, 0, 180);

    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    int mediumR = 150;
    g.setColor(Color.GREEN);
    g.fillArc(xCenter-mediumR/2, yCenter-mediumR/2, mediumR, mediumR, 0, 180);
    int smallR = 100;
    g.setColor(Color.MAGENTA);
    g.fillArc(xCenter-smallR/2, yCenter-smallR/2, smallR, smallR, 0, 180);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    int smallestR = ((largeR - mediumR) + (mediumR -smallR))/2;

    // Draw the sky-color semicircle:
    g.setColor(skycolor);
    g.fillArc(xCenter-smallestR/2, yCenter-smallestR/2, smallestR, smallestR, 0, 180);
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(400, 400, 400, 300);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow());
    w.setVisible(true);
  }
}