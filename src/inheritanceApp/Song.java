
public class Song extends Recording {
	String composer;

	Song(String name, float length, int listeners, int yearMade, String composer){
		super(name, length, listeners, yearMade);
		this.composer = composer;
	}
	
	public String getComposer() {
		return composer;
	}

}
