package contact;


import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class ContactController {
    @GetMapping
    public String showContactForm() {
        return "home";
    }

    @ModelAttribute(name = "contact")
    public Contact contact(){
        return new Contact();
    }

    @ModelAttribute(name = "contacts")
    public Contacts contacts(){
        return Contacts.getInstance();
    }

    @PostMapping
    public String processContact(
            @Valid Contact contact, Errors errors,
            @ModelAttribute Contacts contacts){
        if(errors.hasErrors()){
            return "home";
        }
        contact.setId((long) (contacts.getContacts().size() + 1));
        contacts.addContact(contact);
        return "redirect:/";
    }
}
