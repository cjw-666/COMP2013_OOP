// import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class MyFrame extends JFrame {

	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// GridLayout gl = new GridLayout(5, 5);
		// this.setLayout(gl);
		
		BorderLayout bl = new BorderLayout();
		this.setLayout(bl);
		

		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		this.add(b1);
		// this.add(b1); //Only one button will be add if you try to add the same button
		// twice
		this.add(b2);

		JLabel l = new JLabel("Enter your name: ");
		JTextField tx = new JTextField("Type Text Here");
		JCheckBox cb = new JCheckBox("I agree");
		JRadioButton rb = new JRadioButton("Yes");
		JComboBox<String> cb1 = new JComboBox<String>(new String[] { "Red", "Green", "Blue" });
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[] { 2, 7, -3, 24 });

		//this.add(l);
		this.add(BorderLayout.PAGE_START, l);
		//this.add(tx);
		this.add(BorderLayout.PAGE_END, tx);
		//this.add(cb);
		this.add(BorderLayout.LINE_START, cb);
		//this.add(rb);
		this.add(BorderLayout.LINE_END, rb);
		//this.add(cb1);
		this.add(BorderLayout.CENTER, cb1);
		//this.add(cb2);
		this.add(BorderLayout.CENTER, cb2); // this component will override the cb1

		this.setLocationRelativeTo(null); // this window will align to the middle
		this.setVisible(true);
	}

}