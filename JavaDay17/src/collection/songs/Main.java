package collection.songs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PlayList playlist1 = new PlayList();
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(count<4) {
			
			System.out.println("Enter Song Movie name");
			String movie = sc.next();
			System.out.println("Enter Song name");
			String song = sc.next();
			
			Song songs = new Song(movie, song);
			playlist1.addSong(songs);
			count++;
			
		}
		
		for(Song s:playlist1.songs) {
			System.out.println(s);
		}
		
		sc.close();
	}

}
