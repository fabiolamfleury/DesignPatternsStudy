package music;

import java.util.List;

public abstract class Song {
	protected String name;
	protected String genre;
	protected List<String> lyrics;
	
	@Override
	public abstract String toString();

}
