package contact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class ContactConfigAOP {
    @Bean
    public ContactService contactService(ContactRepository cr){return new ContactServiceImpl(cr);}
    @Bean
    public ContactRepository contactRepository(){return new ContactRepositoryImpl();}
    @Bean
    public ContactServiceAOP contactServiceAOP(){return new ContactServiceAOP();}
}
