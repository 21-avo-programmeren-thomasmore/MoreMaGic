package be.thomasmore.moremagic.application.queries.AuthorizeUser;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.User;
import be.thomasmore.moremagic.persistence.UserRepository;

import java.util.List;

public class AuthorizeUserCommandHandler implements Command.Handler<AuthorizeUserCommand, User>{
    private UserRepository _userRepository;

    public AuthorizeUserCommandHandler(UserRepository _userRepository) {
        this._userRepository = _userRepository;
    }

    @Override
    public User handle(AuthorizeUserCommand authorizeUserCommand) {
        try {
            List<User> users = _userRepository.FindByEmail(authorizeUserCommand.email);
            if( users.isEmpty()) throw new Exception("No user found");
            if( users.get(0).getEmail().equals(authorizeUserCommand.password)) return users.get(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;

    }
}
