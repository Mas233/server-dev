package contact.web;


import javax.validation.Valid;

import contact.Contact;
import contact.data.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/")
public class ContactController {

    private final ContactRepository contactRepo;
    @Autowired
    public ContactController(ContactRepository contactRepo) {
        this.contactRepo = contactRepo;
    }

    @GetMapping
    public String showContactForm() {
        return "home";
    }

    @ModelAttribute(name = "contact")
    public Contact contact(){
        return new Contact();
    }

    @ModelAttribute(name = "contacts")
    public List<Contact> contacts(){
        return (List<Contact>)contactRepo.findAll();
    }

    @PostMapping
    public String processContact(
            @Valid Contact contact, Errors errors){
        if(errors.hasErrors()){
            return "home";
        }
        contact.setId((long) (this.contacts().size()));
        contactRepo.save(contact);
        return "redirect:/";
    }
}
