package music;

import java.util.List;

public class TablatureDecorator extends SongDecorator{
	private List<String> tablature;
	private String instrumentType;
	
	public TablatureDecorator(Song song, List<String> tablature, String instrumentType) {
		super(song);
		this.tablature = tablature;
		this.instrumentType = instrumentType;
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString() + "\n\n");
		System.out.println("Tablature for: " + instrumentType + "\n");
		System.out.println(tablature);
		return "";
	}

}
