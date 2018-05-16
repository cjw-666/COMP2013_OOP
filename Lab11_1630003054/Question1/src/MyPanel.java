import javax.swing.JPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanel extends JPanel {
	
	public MyPanel() {
		this.addMouseListener(new MouseAdapter() { // add a anonymous class
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
				System.out.println(MouseEvent.BUTTON1);
				System.out.println("X: " + e.getX() + " Y: " + e.getY());
			}
		});
	}

}
