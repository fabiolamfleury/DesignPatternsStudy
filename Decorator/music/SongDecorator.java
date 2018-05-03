package music;

import java.util.List;

public abstract class SongDecorator extends Song {	
	Song song;
	
	SongDecorator(Song song) {
		this.song = song;
	}

	@Override
	public String toString() {
		return song.toString();
	}
	
	public Song getSong() {
		return this.song;
	}

}
