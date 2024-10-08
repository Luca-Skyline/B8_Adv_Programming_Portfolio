
public class Recording {
	
	private String name;
	private float length;
	private int listeners;
	private int yearMade;
	
	public Recording(String name, float length, int listeners, int yearMade){
		this.name = name;
		this.length = length;
		this.listeners = listeners;
		this.yearMade = yearMade;
	}
	
	public void addListener() {
		listeners++;
	}
	
	
	public String getName() {
		return name;
	}

	public float getLength() {
		return length;
	}

	public int getListeners() {
		return listeners;
	}
	public void setListeners(int listeners) {
		this.listeners = listeners;
	}
	public int getYearMade() {
		return yearMade;
	}
}
