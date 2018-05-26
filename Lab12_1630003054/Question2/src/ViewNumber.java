import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ViewNumber extends View {

	private Controller c;
	
	private JLabel label;
	
	public ViewNumber(Model m, Controller c) {
		super(m);
		this.c = c;
		this.setTitle("Number of points");
		this.setSize(150, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		label = new JLabel(m.numberOfPoints() + " point(s)"); // init the label
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		label.setText(m.numberOfPoints() + "point(s)");
		repaint();
	}

}
