package contact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactConfig {
    @Bean
    public ContactService contactService(ContactRepository cr){return new ContactServiceImpl(cr);}

    @Bean
    public ContactRepository contactRepository(){return new ContactRepositoryImpl();}

}
