package ru.geekbrains.java2.homework3.task2;

import java.util.HashMap;
import java.util.HashSet;

public class Contacts {
    HashMap<String, HashSet<String>> contact;

    public Contacts() {
        this.contact = new HashMap<>();
    }

    public void addContact(String lastName, String phoneNumber) {
        HashSet<String> contactsEntry = contact.getOrDefault(lastName, new HashSet<>());
        contactsEntry.add(phoneNumber);
        contact.put(lastName, contactsEntry);
    }

    public void out(String name) {
        System.out.println(name + "\t\t" + contact.getOrDefault(name, new HashSet<>()));
    }
}
