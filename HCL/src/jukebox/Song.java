package jukebox;


public class Song {

	private String songName;
	private String artistName;
	private String rating;
	private String singerName;
	
	
	@Override
	public String toString() {
		return "["+ songName + ", " + artistName + ", " + rating + "/100, "
				+ singerName + "]\n";
	}
	public Song(String songName, String artistName, String rating, String singerName) {
		super();
		this.songName = songName;
		this.artistName = artistName;
		this.rating = rating;
		this.singerName = singerName;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	
	
	
	
}
