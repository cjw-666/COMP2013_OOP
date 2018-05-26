
import javax.swing.JFrame;

public abstract class View extends JFrame implements ModelListener{
	
	protected Model m;
	
	public View(Model m) {
		this.m = m;
	}

	@Override
	public abstract void update(); // abstract method will override later

}
