package contact;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Contacts {

    private final List<Contact> contacts=new ArrayList<>();

    private Contacts(){}
    private static Contacts instance=new Contacts();
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public static Contacts getInstance(){
        if(instance==null)instance=new Contacts();
        return instance;
    }
}
