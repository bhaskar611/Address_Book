package com.addressbook;
import java.util.ArrayList;
public class AddressBook {
	public ArrayList<ContactDetails> contactList = new ArrayList<>();

	public  ArrayList<ContactDetails> contactList(ContactDetails cd){
		contactList.add(cd);
		return contactList;
	}
}
