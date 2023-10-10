package contact;

import java.util.ArrayList;
import java.util.List;

public class ContactRepositoryImpl implements ContactRepository{
    List<Contact> list=new ArrayList<>();
    @Override
    public void save(Contact contact) {
        list.add(contact);
    }
    @Override
    public void clear() {
        list.clear();
    }
    @Override
    public java.util.List<Contact> findAll() {
        return list;
    }
}
