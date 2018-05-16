import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

public class MyFrame extends JFrame {

	public MyFrame() {
		this.setTitle("Lab 11 MyFrame"); // set frame title
		this.setSize(400, 300); // set frame size
		BorderLayout bl1 = new BorderLayout();
		this.setLayout(bl1); // set borderlayout to the frame
		
		JPanel jp1 = new JPanel();
		JButton btn1 = new JButton("Btn1");
		JButton btn2 = new JButton("Btn2");
		jp1.add(btn1);
		jp1.add(btn2);
		this.add(jp1, BorderLayout.PAGE_START); // add two button
		
		MyPanel mp1 = new MyPanel();
		this.add(mp1, BorderLayout.CENTER); // add a panel
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
