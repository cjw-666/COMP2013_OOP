import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import java.util.ArrayList;

public class MyPanel extends JPanel {

	private ArrayList<Point> pointArray = new ArrayList<Point>();

	public MyPanel() {
		this.addMouseListener(new MouseAdapter() { // add a anonymous class
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				System.out.println(MouseEvent.BUTTON1);
				System.out.println("X: " + e.getX() + " Y: " + e.getY());
				pointArray.add(e.getPoint()); // get a Point from mouse event
				repaint(); // force Swing to repaint
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		if (pointArray != null) { // draw every point using Enhanced For loop
			for (Point point : pointArray) {
				g.drawRect((int)point.getX(), (int)point.getY(), 1, 1); // drawRect only accept int value
			}
		}
	}

}
