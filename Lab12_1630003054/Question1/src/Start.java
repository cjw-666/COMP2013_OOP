public class Start {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Model m = new Model(); // create the model to store the data
				ControllerClicks c = new ControllerClicks(m); // create the controller to listen the click
				MyFrame mf = new MyFrame(m, c);	// create the frame(view) to show the buttons and lines
				m.addListener(mf);
			}
		});
	}
}
