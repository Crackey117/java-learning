package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("000000000");

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        //SortedArray.sortedArrayChallenge();
        //MinimumElement.runMinimumElement();
        //ReverseArray.runReverseArray();

        //mobile phone challenge
        //boolean quit = false;
        //startPhone();
        //printActions();
        //while(!quit){
        //    System.out.println("Enter action: (6 to show available actions)");
        //    int action = scanner.nextInt();
        //    scanner.nextLine();

        //    switch (action) {
        //        case 0:
        //            System.out.println("Shutting down");
        //            quit = true;
        //            break;
        //        case 1:
        //            mobilePhone.printContacts();
        //            break;
        //        case 2:
        //            addNewContact();
        //            break;
        //        case 3:
        //            updateContact();
        //            break;
        //        case 4:
        //            removeContact();
        //            break;
        //        case 5:
        //            queryContact();
        //            break;
        //        case 6:
        //            printActions();
        //            break;
        //    }
        //}

        //banking challenge
        //Bank bank = new Bank("National Aussie Bank");
        //bank.addBranch("Sydney");
        //bank.addCustomer("Sydney", "Mike", 50.05);
        //bank.addCustomer("Sydney", "Jeff", 23.55);
        //bank.addCustomer("Sydney", "Kelly", 78.35);
        //bank.addBranch("Adelaide");
        //bank.addCustomer("Adelaide", "Timmy", 1.02);
        //bank.addCustomerTransaction("Adelaide", "Timmy", 24.13);
        //bank.addCustomerTransaction("Sydney", "Kelly", 446.23);
        //bank.addCustomerTransaction("Adelaide", "Timmy", 1.34);
        //bank.listCustomers("Adelaide", true);
        //bank.listCustomers("Sydney", true);

        //if(!bank.addCustomer("Melbourne", "Brian", 5.33)){
        //    System.out.println("Error Melbourne branch doesnt exist");
        //}
        //if(!bank.addBranch("Sydney")){
        //    System.out.println("Error branch Sydney already exists");
        //}
        //if(!bank.addCustomerTransaction("Sydney", "Jamie", 34.55)){
        //    System.out.println("Error customer does not exist at branch");
        //}
        //if(!bank.addCustomer("Sydney", "Mike", 5.33)){
        //   System.out.println("Error Customer Mike already exist");
        //}

        //Playlist Challenge
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

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: " + name + ", phone = " + phone);
        }else{
            System.out.println("Cannot add, " + name  + " already on file");
        }
    }

    private  static  void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord ==  null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        }else {
            System.out.println("Error updating record");
        }
    }

    private  static  void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.printf("Successfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }
    }

    private  static  void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name " + existingContactRecord.getName() + " phone number is: " + existingContactRecord.getPhoneNumber());

    }
    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    private  static void printActions() {
        System.out.println("\n Available actions:\npress");
        System.out.println("0(shutdown), 1(print contacts), 2(add contact), 3(update contact), 4(remove contact), 5(search contact), 6(print list of actions)");
        System.out.println("Choose your action: ");
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
