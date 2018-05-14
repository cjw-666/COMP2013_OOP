import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame {

	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 20, 40);
		this.setLayout(fl);
		
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		this.add(b1);
		// this.add(b1); //Only one button will be add if you try to add the same button twice
		this.add(b2);
		
		this.setLocationRelativeTo(null); // this window will align to the middle
		this.setVisible(true);
	}

}