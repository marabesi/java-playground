package main.utilities;

import packt.addressbook.main.model.Contact;

import java.util.Arrays;
import java.util.List;

public class ContactUtil {

    public List<Contact> getContacts() {
        List<Contact> contacts = Arrays.asList(
                new Contact("1", "Edsger", "Dijkstra", "345-678-9012"),
                new Contact("2", "Alan", "Turing", "456-789-0123"),
                new Contact("3", "Ada", "Lovelace", "234-567-8901"),
                new Contact("4", "Charles", "Babbage", "123-456-7890"),
                new Contact("5", "Tim", "Berners-Lee", "456-789-0123")
        );
        return contacts;
    }
}
