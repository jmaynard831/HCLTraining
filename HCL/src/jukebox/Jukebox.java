package jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox {

	
	ArrayList<Song> al = new ArrayList<Song>();
	public static void main(String[] args) {
		new Jukebox().go();
	}
	
	
	private void go() {
		getSongs();
		Collections.sort(al, new RatingComp());
		System.out.println(al);
	}
	
	private void getSongs() {
		try {
			File file = new File("Songs.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String l = null;
			
			while((l=br.readLine())!=null) {
				addSongs(l);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void addSongs(String line) {
		String[] tokens = line.split("/");
		Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
		al.add(nextSong);
	}
	
}
