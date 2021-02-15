package com.addressbook;


import java.util.*;

class AddressBookMain {
	public static Scanner sc = new Scanner(System.in);
	
	// main class
	
    public static void main(String[] args) {
    	
        System.out.println("Welcome to the Address Book  System  ");
       
		AddressBook addressBook = new AddressBook();
		boolean flag = true;

		while(flag) {

			System.out.println("1.Add Contact");
			System.out.println("2.Edit Contact");
			System.out.println("3.Delete Contact");
			System.out.println("4.Exit");
			System.out.println("Enter Choice: ");

			int option = sc.nextInt();

			switch (option)
			{
			case 1: 
				addressBook.addContactDetails();
				int noOfContacts = sc.nextInt();
				for(int i = 0; i < noOfContacts; i++) {
					addressBook.addContactDetails();
				}
				break;
				

			case 2: 
				System.out.println("Enter the Person First name to edit details: ");
				String personName = sc.next();

				boolean listEdited = addressBook.editContactDetails(personName);
				if (listEdited) {
					System.out.println("List Edited Successfully");
				} else {
					System.out.println("List Cannot be Edited");
				}
				break;
			case 3:
				System.out.println("Enter the Contact to be deleted:");
				String firstName = sc.next();
				boolean listDeleted = addressBook.deleteContact(firstName);
				if (listDeleted) {
					System.out.println("Deleted Contact from the List");
				} else {
					System.out.println("List Cannot be Deleted");
				}
				break;
			case 4: 
				flag =false;
				break;

			}
		}

	}
}