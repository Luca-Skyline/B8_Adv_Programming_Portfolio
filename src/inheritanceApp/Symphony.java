
public class Symphony extends Song {
	int movements;
	
	public Symphony(String name, float length, int listeners, int yearMade, String composer, int movements){
		super(name, length, listeners, yearMade, composer);
		this.movements = movements;
	}
	
	public int getMovements() {
		return movements;
	}
}
