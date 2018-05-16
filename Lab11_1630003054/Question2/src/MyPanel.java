import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;


public class MyPanel extends JPanel {
	private int x = -1;
	private int y = -1;
	
	public MyPanel() {
		this.addMouseListener(new MouseAdapter() { // add a anonymous class
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				System.out.println(MouseEvent.BUTTON1);
				System.out.println("X: " + e.getX() + " Y: " + e.getY());
				x = e.getX();
				y = e.getY();
				repaint(); // force Swing to repaint
			}
		});
	}
	
	@Override 
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.drawRect(this.x, this.y, 1, 1); // draw a red point
	}

}


