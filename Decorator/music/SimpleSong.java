package music;

import java.util.List;

public class SimpleSong extends Song{

	public SimpleSong(String name, String genre, List<String> lyrics){
		this.name = name;
		this.genre = genre;
		this.lyrics = lyrics;
	}
	
	@Override
	public String toString() {
		return "Music Name:" + super.name + "\nMusic Genre: " + super.genre + "\nMusic lyrics" + super.lyrics;
	}

}
