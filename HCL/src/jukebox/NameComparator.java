package jukebox;

import java.util.Comparator;

public class NameComparator implements Comparator<Song> {

	@Override
	public int compare(Song o1, Song o2) {	
		return o1.getSongName().compareTo(o2.getSongName());
	}

}
