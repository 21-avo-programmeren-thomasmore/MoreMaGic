package be.thomasmore.moremagic.application.commands.createUser;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.domain.User;
import be.thomasmore.moremagic.persistence.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateUserCommandHandler implements Command.Handler<CreateUserCommand, Voidy>{

    private final UserRepository _userRepository;

    public CreateUserCommandHandler(UserRepository userRepository) {
        _userRepository = userRepository;
    }

    @Override
    public Voidy handle(CreateUserCommand createUserCommand) {
        User user = new User(createUserCommand.FirstName, createUserCommand.LastName, createUserCommand.Email);
        _userRepository.save(user);
        return null;
    }
}
