package projava;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class SampleFrom2 {
  public static void main(String[] args) {
    var f = new JFrame("drawing");

    var label = new JLabel("test");
    f.add(label);

    var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
    label.setIcon(new ImageIcon(image));

    var g = image.createGraphics();
    g.drawLine(0,0, 600,400);
    g.setColor(Color.RED);
    g.fillRect(300, 200, 150, 100);

    f.setVisible(true);
    f.pack();
    label.repaint();
  }
}
