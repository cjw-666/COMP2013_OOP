import java.awt.Point;
import java.util.ArrayList;

public class Model {

	private ArrayList<Point> points;
	// stores all the data about the points
	
	private ArrayList<ModelListener> listeners;
	
	public Model() {
		points = new ArrayList<Point>();
		listeners = new ArrayList<ModelListener>();
	}
	
	
	public void addListener(ModelListener listener) {
		listeners.add(listener);
	}
	
	public ArrayList<Point> getPoints(){
		return points;
	}
	
	public void addPoint(Point p) {
		points.add(p);
		notifyListeners();
	}
	
	public void clearAllPoints() {
		points.clear(); // clean all points
		notifyListeners();
	}
	
	public void deleteLastPoint() {
		if (points.size() > 0) {
			points.remove(points.size() - 1); // remove only when the array is not empty
		}
		notifyListeners();
	}
	
	public int numberOfPoints() {
		return points.size();
	}
	
	private void notifyListeners() {
		for (ModelListener listener: listeners) {
			listener.update(); // must call after points change
		}
	}
	
	public static void testModel() {
		
	}
}
