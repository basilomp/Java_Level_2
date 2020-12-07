package ru.geekbrains.java2.homework3.task2;

public class Exe {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        contacts.addContact("Joyce", "689-31-74");
        contacts.addContact("Yeats", "495-81-02");
        contacts.addContact("Celine", "509-17-64");
        contacts.addContact("Simak", "183-64-70");
        contacts.addContact("Blake", "530-72-41");
        contacts.addContact("Blake", "547-13-20");
        contacts.addContact("Gibson", "210-95-34");
        contacts.addContact("Simak", "734-10-52");
        contacts.addContact("Blake", "690-52-14");
        contacts.addContact("Proust", "062-83-19");


        System.out.println("Contact:\t" + "Phone number:");
        contacts.out("Yeats");
        contacts.out("Joyce");
        contacts.out("Simak");
        contacts.out("Celine");
        contacts.out("Blake");
        contacts.out("Gibson");
        contacts.out("Proust");

    }
}
