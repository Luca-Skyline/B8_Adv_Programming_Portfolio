
public class PopSong extends Song {
	String lyrics;
	
	public PopSong(String name, float length, int listeners, int yearMade, String composer, String lyrics){
		super(name, length, listeners, yearMade, composer);
		this.lyrics = lyrics;
	}
	
	public String getLyrics() {
		return lyrics;
	}
}
