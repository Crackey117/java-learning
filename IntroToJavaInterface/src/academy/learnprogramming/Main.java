package academy.learnprogramming;

import java.util.*;

public class Main {
	private static List<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	    ITelephone myPhone;
	    myPhone = new DeskPhone(235343);
	    myPhone.powerOn();;
	    myPhone.callPhone(235343);
	    myPhone.answer();
	    myPhone = new MobilePhone(12345);
	    myPhone.powerOn();
        myPhone.callPhone(12345);
        myPhone.answer();

		Album album = new Album("The Ineffable Truth", "G Jones");
		album.addSong("Arbitor's Theme", 3.4);
		album.addSong("Time", 4.2);
		album.addSong("Soundtrack to the Machine", 3.1);
		album.addSong("In Your Head", 3.2);
		albums.add(album);

		album = new Album("Infinity", "Liquid Stranger");
		album.addSong("Run for Cover", 3.3);
		album.addSong("Jetpacks", 3.2);
		albums.add(album);

		List<Song> playList = new Vector<>();
		albums.get(0).addToPlaylist("In Your Head", playList);
		albums.get(1).addToPlaylist("Run for Cover", playList);
		albums.get(0).addToPlaylist("Helix", playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(12, playList);
		play(playList);
    }


	private static void play(List<Song> playList){
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;

		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0){
			System.out.println("No songs in playlist");
		}else {
			System.out.println("Now playing: " + listIterator.next().toString());
			printMenu();

		}

		while(!quit){
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action){
				case 0:
					System.out.println("Playlist complete");
					quit = true;
					break;
				case 1:
					if(!forward){
						if(listIterator.hasNext()){
							listIterator.next();
						}
						forward = true;
					}
					if(listIterator.hasNext()){
						System.out.println("Now playing " + listIterator.next().toString());
					}else {
						System.out.println("Reached end of playlist");
						forward = false;
					}
					break;
				case 2:
					if(forward){
						if(listIterator.hasPrevious()){
							listIterator.previous();
						}
						forward = false;
					}
					if(listIterator.hasPrevious()){
						System.out.println("Now playing " + listIterator.previous().toString());
					}else {
						System.out.println("At start of playlist");
						forward = false;
					}
					break;
				case 3:
					if(forward) {
						if(listIterator.hasPrevious()){
							System.out.println("Now replaying " + listIterator.previous().toString());
							forward = false;
						}else {
							System.out.println("We are at the start of the list");
						}
					}else {
						if(listIterator.hasNext()){
							System.out.println("Now replaying " + listIterator.next().toString());
							forward = true;
						}else {
							System.out.println("We have reached the end of the list");
						}
					}

					break;
				case 4:
					printList(playList);
					break;
				case 5:
					printMenu();
					break;
				case 6:
					if(playList.size() > 0){
						listIterator.remove();
						if(listIterator.hasNext()){
							System.out.println("Now playing " + listIterator.next());
						}else if(listIterator.hasPrevious()){
							System.out.println("Now playing " + listIterator.previous());
						}
					}
					break;
			}
		}
	}
	private  static  void printMenu() {
		System.out.println("Actions:\n (0 to quit, 1 for next, 2 for previous, 3 to replay current, 4 to list songs, 5 to print options, 6 to delete current song from playlist)");
	}
	private static void printList(List<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("=======");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("========");
	}
}
