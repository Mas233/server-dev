package contact.data;

import contact.beans.Contact;
import org.springframework.data.repository.CrudRepository;


public interface ContactRepository extends CrudRepository<Contact,String> {

}
