package be.thomasmore.moremagic.application.queries.AuthorizeUser;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.User;

public class AuthorizeUserCommand implements Command<User> {

    public String email;
    public String password;

    public AuthorizeUserCommand(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
