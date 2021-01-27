package academy.learnprogramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("000000000");
    public static void main(String[] args) {
        //SortedArray.sortedArrayChallenge();
        //MinimumElement.runMinimumElement();
        //ReverseArray.runReverseArray();

        //mobile phone challenge
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
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

}
