package MobilePhoneOdev2;

import java.util.ArrayList;
import java.util.List;

public class Odev2Main {
    public static void main(String[] args) {

        List<Contact> contactList = new ArrayList<>();


        MobilePhone phone =new MobilePhone("123123",contactList);
        Contact gokmen = new Contact("Gokmen","1234");


        phone.addNewContact(new Contact("Nergis","12345"));
        phone.addNewContact(new Contact("Dogan","12354656"));
        phone.addNewContact(new Contact("Kadir","1237777"));
        phone.addNewContact(gokmen);
        phone.addNewContact(new Contact("Dogancan","1234"));
        phone.printContact();

        System.out.println("Index: " + phone.findContact(gokmen));
        System.out.println("Index Name : "+ phone.findContact("Dogancan"));
        System.out.println("QueryContact : " + phone.queryContact("Dogan"));

    }
}
