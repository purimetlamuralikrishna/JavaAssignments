package collection.songs;

import java.util.Objects;

public class Song {
	
	private String movieName;
	private String songName;
	
	public Song(String movie,String song) {
		movieName = movie;
		songName = song;
	}
	
	void play() {
		System.out.println(songName+" of "+movieName+" is Playing.....!");
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieName, songName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return this.songName.equalsIgnoreCase(other.songName);
	}

	@Override
	public String toString() {
		return "Song [movieName=" + movieName + ", songName=" + songName + "]";
	}
	
}
