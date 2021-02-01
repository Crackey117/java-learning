package academy.learnprogramming;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        //interface challenge
        Player jeff = new Player("jeff", 10, 15);
        System.out.println(jeff.toString());
        saveObject(jeff);
        jeff.setHitPoints(8);
        System.out.println(jeff);
        jeff.setWeapon("Excalibur");
        saveObject(jeff);
        //loadObject(jeff);
        System.out.println(jeff);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        saveObject(werewolf);

        //inner class challenge
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

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("In Your Head", playList);
        albums.get(1).addToPlaylist("Run for Cover", playList);
        albums.get(0).addToPlaylist("Helix", playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(12, playList);
        play(playList);
    }

    public  static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose \n1 to enter a string\n0 to quit");
        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }


    private static void play(LinkedList<Song> playList){
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
    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("========");
    }


}
