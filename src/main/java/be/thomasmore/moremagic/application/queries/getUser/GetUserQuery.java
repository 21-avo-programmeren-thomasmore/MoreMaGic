package be.thomasmore.moremagic.application.queries.getUser;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.User;

public class GetUserQuery implements Command<User> {
    public String Email;

    public GetUserQuery(String email) {
        Email = email;
    }
}
