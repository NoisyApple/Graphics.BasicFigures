package com.noisyapple;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

// Figures class.
@SuppressWarnings("serial")
public class Figures extends JFrame {

  // Panel bounds.
  private int width, height;

  // Class constructor.
  public Figures(int width, int height) {
    this.width = width;
    this.height = height;

    // Window configuration.
    this.setTitle("Basic Figures");
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);

    // Panel is added to the window.
    this.add(new CustomCanvas());

    // Window position and size.
    this.pack();
    this.setLocationRelativeTo(null);
  }

  // CustomCanvas inner class.
  class CustomCanvas extends JPanel {

    // Overwritten method paintComponent.
    public void paintComponent(Graphics g) {

      // Graphics context g is then casted to Graphics2D.
      Graphics2D g2d = (Graphics2D) g;

      // Context configuration, antialiasing enabled for smoother graphics.
      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

      // Background gets drawn.
      g2d.setColor(Color.decode("#000000"));
      g2d.fillRect(0, 0, width, height);

      // Figures.
      g2d.setColor(Color.getHSBColor((float) Math.random(), 0.6f, 1f));
      g2d.drawLine(100, 50, 200, 50);
      g2d.drawLine(200, 50, 200, 100);
      g2d.drawLine(100, 50, 100, 100);
      g2d.drawLine(100, 100, 200, 100);

      g2d.setColor(Color.getHSBColor((float) Math.random(), 0.6f, 1f));
      g2d.drawLine(100, 50, 150, 20);
      g2d.drawLine(200, 50, 150, 20);

      g2d.setColor(Color.getHSBColor((float) Math.random(), 0.6f, 1f));
      g2d.drawRect(280, 50, 100, 50);
      g2d.fillRect(280, 110, 100, 50);

      g2d.setColor(Color.getHSBColor((float) Math.random(), 0.6f, 1f));
      g2d.drawRoundRect(450, 50, 100, 50, 50, 50);
      g2d.fillRoundRect(450, 110, 100, 50, 20, 20);

      g2d.setColor(Color.getHSBColor((float) Math.random(), 0.6f, 1f));
      g2d.drawOval(100, 200, 80, 80);
      g2d.fillOval(100, 290, 50, 50);

      g2d.setColor(Color.getHSBColor((float) Math.random(), 0.6f, 1f));
      g2d.drawOval(200, 200, 80, 40);
      g2d.fillOval(280, 290, 40, 80);

      g2d.setColor(Color.getHSBColor((float) Math.random(), 0.6f, 1f));
      g2d.drawLine(450, 300, 550, 300);
      g2d.drawLine(450, 300, 500, 250);
      g2d.drawLine(550, 300, 500, 250);

      g2d.setColor(Color.getHSBColor((float) Math.random(), 0.6f, 1f));
      g2d.drawString("Example text", 200, 400);

      g2d.setColor(Color.getHSBColor((float) Math.random(), 0.6f, 1f));
      g2d.drawArc(450, 350, 100, 100, 0, 180);
      g2d.fillArc(550, 350, 100, 50, 90, -180);
    }

    // Overwriten method getPreferredSize for window bounds to fit panel size.
    public Dimension getPreferredSize() {
      return (new Dimension(width, height));
    }

  }

}