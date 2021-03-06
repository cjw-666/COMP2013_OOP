import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class MyFrame extends JFrame {

	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BorderLayout bl1 = new BorderLayout();
		this.setLayout(bl1);
		
		// Button Area
		
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		
		BorderLayout bl2 = new BorderLayout();
		JPanel bp = new JPanel();
		bp.setLayout(bl2);
		bp.setBackground(Color.BLUE);
		bp.add(b1, BorderLayout.LINE_START);
		bp.add(b2, BorderLayout.LINE_END);

		this.add(bp, BorderLayout.PAGE_START);
		
		// Text Field Area

		JLabel l = new JLabel("Enter your name: ");
		JTextField tx = new JTextField("Type Text Here");
		
		FlowLayout fl1 = new FlowLayout(FlowLayout.CENTER);
		JPanel tf = new JPanel();
		tf.setLayout(fl1);
		tf.setBackground(Color.GREEN);
		tf.add(l);
		tf.add(tx);
		
		this.add(tf, BorderLayout.CENTER);
		
		// Multiple Components Area
		
		JCheckBox cb = new JCheckBox("I agree");
		JRadioButton rb = new JRadioButton("Yes");
		JComboBox<String> cb1 = new JComboBox<String>(new String[] { "Red", "Green", "Blue" });
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[] { 2, 7, -3, 24 });
		
		GridLayout gl1 = new GridLayout(2, 2);
		JPanel stuff = new JPanel();
		stuff.setLayout(gl1);
		stuff.setBackground(Color.RED);
		stuff.add(cb);
		stuff.add(rb);
		stuff.add(cb1);
		stuff.add(cb2);
		
		this.add(stuff, BorderLayout.PAGE_END);

		this.setLocationRelativeTo(null); // this window will align to the middle
		this.setVisible(true);
	}

}