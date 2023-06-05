package main;

import main.utilities.ContactUtil;
import packt.addressbook.main.model.Contact;
import main.sort.SortUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContactUtil contactUtil = new ContactUtil();
        SortUtil sortUtil = new SortUtil();
        List<Contact> contacts = contactUtil.getContacts();
        sortUtil.sortList(contacts);
        System.out.println(contacts);
    }
}