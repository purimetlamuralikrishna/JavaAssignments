package collection.songs;

import java.util.ArrayList;
import java.util.List;


public class PlayList {
	
	
	 public List<Song> songs = new ArrayList<>();
	 
	 
	 public void addSong(Song song){
		 
		 Boolean available = false;

		 for(Song s:songs){
				 if(s.equals(song)) {
					 available = true;
					 System.out.println("Song is already added in the playlist");
					 break;
				 }
		 }
		 
		 if(available==false && song!=null) {
			 System.out.println("Song added to the playlist successfully");
			 songs.add(song);
		 } 
	 }


	@Override
	public String toString() {
		return "PlayList [songs=" + songs + "]";
	} 
	 
}
