package music;

import java.util.List;

public class ChordDecorator extends SongDecorator{
	private List<String> chords;
	private String instrumentType;
	
	public ChordDecorator(Song song, List<String> chords, String instrumentType) {
		super(song);
		setSongChords(chords, instrumentType);
	}
	
	private void setSongChords(List<String> chords, String instrumentType) {
		if (chords.size() == super.song.lyrics.size()) {
			this.chords = chords;
			this.instrumentType = instrumentType;
		}
		else {
			System.out.println("Invalid chords, all lyrics lines must have chords");
		}
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString() + "\n\n");
		System.out.println("Chords for : " + instrumentType);
		for (int i = 0; i < super.song.lyrics.size(); i++) {
			System.out.println(this.chords.get(i));
			System.out.println(super.song.lyrics.get(i));
		}
		return "";
	}

}
