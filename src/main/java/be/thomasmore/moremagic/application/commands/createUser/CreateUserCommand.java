package be.thomasmore.moremagic.application.commands.createUser;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class CreateUserCommand implements Command<Voidy> {
    public String FirstName;
    public String LastName;
    public String Email;
    public String Password;

    public CreateUserCommand(String firstName, String lastName, String email, String password) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
    }
}
