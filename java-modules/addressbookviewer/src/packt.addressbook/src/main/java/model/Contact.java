package model;

public class Contact implements Comparable {
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    public Contact(String id, String firstName,
                   String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this. phoneNumber = phoneNumber;
    }
    // Getters and setters omitted for brevity
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
    public int compareTo(Object other) {
        Contact otherContact = (Contact)other;
        return this.lastName.compareTo(otherContact.lastName);
    }
}
