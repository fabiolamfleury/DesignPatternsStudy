package client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import music.SimpleSong;
import music.Song;
import music.TranslationDecorator;


public class Client {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	    
	    System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Create simple song");
        System.out.println("2 - Create song with translation");
        System.out.println("4 - Quit");
        
        int choice = input.nextInt();
        input.nextLine();
        Song song;
	    switch (choice) {
	        case 1:
	        	song = createSimpleSong();
	            System.out.println(song);
	            break;
	        case 2:
	        	song = createTranslatedSong();
	        	System.out.println(song);
	            break;
	        case 3:
	            // Perform "decrypt number" case.
	            break;
	        case 4:
	            break;
	        default:
	        	System.out.println("Wrong choice");
	    }
	}
	
	private static Song createTranslatedSong() {
		Song simpleSong = createSimpleSong();
		String translatedLanguage = readString("Type language in translated lyrics: ");		
		List<String> translatedLyrics = readLyrics("Type translated song lyric(each sentence in a line, last line must be blank):");
		
		return new TranslationDecorator(simpleSong, translatedLyrics, translatedLanguage);        
	}
	
	private static Song createSimpleSong() {
		String name = readString("Type song name: ");
    	String genre = readString("Type song genre: ");
    	List<String> lyric = readLyrics("Type song lyric(each sentence in a line, last line must be blank):");
        return new SimpleSong(name, genre, lyric);
	}
	
	private static String readString(String message) {
		System.out.println(message);
		return input.nextLine();
	}
	
	private static List<String> readLyrics(String message) {
		System.out.println(message);
        List<String> lines = new ArrayList<String>();
        String lineNew;

        while (input.hasNextLine()) {
            lineNew = input.nextLine();
            if (lineNew.isEmpty()) {
                break;
            }
            lines.add(lineNew);
        }
        return lines;
	}
}
