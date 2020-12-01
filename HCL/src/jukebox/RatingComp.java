package jukebox;

import java.util.Comparator;

public class RatingComp implements Comparator<Song>{

	@Override
	public int compare(Song o1, Song o2) {
		// TODO Auto-generated method stub
		return Integer.parseInt(o1.getRating())-Integer.parseInt(o2.getRating());
	}

}
