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
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				System.out.println(MouseEvent.BUTTON1);
				System.out.println("X: " + e.getX() + " Y: " + e.getY());
				pointArray.add(e.getPoint());
				repaint(); // force Swing to repaint
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); // clean the panel
		g.setColor(Color.RED);
		if (pointArray != null) {
			for (int i = 0; i < pointArray.size(); i++) {
				if (i == 0) { // if the point if the first point
					g.drawRect((int)pointArray.get(i).getX(), (int)pointArray.get(i).getY(), 1, 1); // just draw
				}else {
					// draw the end point (latest click point)
					g.drawRect((int)pointArray.get(i).getX(), (int)pointArray.get(i).getY(), 1, 1);
					// draw the line
					g.drawLine((int)pointArray.get(i).getX(), (int)pointArray.get(i).getY(), (int)pointArray.get(i-1).getX(), (int)pointArray.get(i-1).getY());
				}
			}
		}
	}
}
