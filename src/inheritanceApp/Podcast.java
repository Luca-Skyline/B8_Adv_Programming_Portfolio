
public class Podcast extends Recording {
	private String[] podcasters;
	
	Podcast(String name, float length, int listeners, int yearMade, String[] podcasters){
		super(name, length, listeners, yearMade);
	}
	
	public String[] getPodcasters() {
		return podcasters;
	}

}
