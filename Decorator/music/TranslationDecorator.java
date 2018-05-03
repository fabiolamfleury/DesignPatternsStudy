package music;

import java.util.ArrayList;
import java.util.List;

public class TranslationDecorator extends SongDecorator{
	private List<String> translation;
	private String translationLanguage;
	
	public TranslationDecorator(Song song, List<String> translation, String lyricLanguage) {
		super(song);
		
		setLyricTranslation(translation, lyricLanguage);
	}
	
	private void setLyricTranslation(List<String> translation, String lyricLanguage) {
		if (translation.size() == super.song.lyrics.size()) {
			this.translation = translation;
			this.translationLanguage = lyricLanguage;
		}
		else {
			System.out.println("Invalid translation, all lyric lines must be translated");
		}
	}
	
	@Override
	public String toString() {
		System.out.println(super.toString() + "\n\n");
		System.out.format("%-50s", "Original");
		System.out.format("%-50s", "Translated in "+ translationLanguage + "\n\n\n");
		for (int i = 0; i < super.song.lyrics.size(); i++) {
			System.out.format("%-50s %-50s\n", super.song.lyrics.get(i), translation.get(i));
		}
		return "";
	}

}
