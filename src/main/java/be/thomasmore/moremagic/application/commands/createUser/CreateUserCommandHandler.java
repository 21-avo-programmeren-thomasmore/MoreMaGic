package be.thomasmore.moremagic.application.commands.createUser;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.domain.User;
import be.thomasmore.moremagic.persistence.UserRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CreateUserCommandHandler implements Command.Handler<CreateUserCommand, Voidy>{

    private final UserRepository _userRepository;

    public CreateUserCommandHandler(UserRepository userRepository) {
        _userRepository = userRepository;
    }

    @Override
    public Voidy handle(CreateUserCommand createUserCommand) {
        try{
            List<User> existingUser = _userRepository.FindByEmail(createUserCommand.Email);
            if(!existingUser.isEmpty()) throw new Exception("Email already exists");

            User user = new User(createUserCommand.FirstName, createUserCommand.LastName, createUserCommand.Email, createUserCommand.Password);
            _userRepository.save(user);
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
