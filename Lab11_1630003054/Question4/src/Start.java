
public class Start {
	public static void main(String arg[]) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() { // run that code on the event dispatch thread
			@Override
			public void run() {
				MyFrame mf = new MyFrame();
				mf.setVisible(true);
			}
		});
	}
}
