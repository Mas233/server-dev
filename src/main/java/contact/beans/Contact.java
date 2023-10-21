package contact.beans;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Contact {
    @Id
    private String id;

    @NotNull(message="First name must not be empty!")
    @Size(min = 1, message = "First name at least contains 1 character!")
    private String firstName;

    @NotNull(message = "Last name must not be empty!")
    @Size(min = 1, message = "Last name at least contains 1 character!")
    private String lastName;

    @Pattern(regexp = "^1([34578])\\d{9}", message = "Phone number must be valid!")
    private String phoneNumber;

    @NotNull
    @Email(message = "Email address must be valid!")
    private String emailAddress;

}