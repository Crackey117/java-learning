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
        Bank bank = new Bank("National Aussie Bank");
        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Mike", 50.05);
        bank.addCustomer("Sydney", "Jeff", 23.55);
        bank.addCustomer("Sydney", "Kelly", 78.35);
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Timmy", 1.02);
        bank.addCustomerTransaction("Adelaide", "Timmy", 24.13);
        bank.addCustomerTransaction("Sydney", "Kelly", 446.23);
        bank.addCustomerTransaction("Adelaide", "Timmy", 1.34);
        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        if(!bank.addCustomer("Melbourne", "Brian", 5.33)){
            System.out.println("Error Melbourne branch doesnt exist");
        }
        if(!bank.addBranch("Sydney")){
            System.out.println("Error branch Sydney already exists");
        }
        if(!bank.addCustomerTransaction("Sydney", "Jamie", 34.55)){
            System.out.println("Error customer does not exist at branch");
        }
        if(!bank.addCustomer("Sydney", "Mike", 5.33)){
            System.out.println("Error Customer Mike already exist");
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
