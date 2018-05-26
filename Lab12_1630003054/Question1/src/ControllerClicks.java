import java.awt.Point;

public class ControllerClicks extends Controller {

	public ControllerClicks(Model m) {
		super(m);
	}
	
	public void mouseClicked(Point p) {
		m.addPoint(p); // call when click on the panel
	}
	
	public void resetClicked() {
		m.clearAllPoints(); // call when reset button was clicked
	}
	
	public void undoClicked() {
		m.deleteLastPoint(); // call when undo button was clicked
	}

}
