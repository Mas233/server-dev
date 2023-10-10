package contact;
import java.util.List;
public class ContactServiceImpl implements  ContactService{
    ContactRepository cr;
    public ContactServiceImpl(ContactRepository cr){
        this.cr=cr;
    }
    @Override
    public void add(Contact contact) {
        cr.save(contact);
    }
    @Override
    public List<Contact> getAll() {
        return cr.findAll();
    }

}
