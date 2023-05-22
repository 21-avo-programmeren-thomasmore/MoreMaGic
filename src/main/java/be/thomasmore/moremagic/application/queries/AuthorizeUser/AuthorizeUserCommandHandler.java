package be.thomasmore.moremagic.application.queries.AuthorizeUser;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.User;
import be.thomasmore.moremagic.persistence.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
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
            if( users.get(0).getPassword().equals(authorizeUserCommand.password)) return users.get(0);
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
