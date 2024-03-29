package be.thomasmore.moremagic.application.commands.editUser;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.application.commands.createUser.CreateUserCommand;
import be.thomasmore.moremagic.domain.User;
import be.thomasmore.moremagic.persistence.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class EditUserCommandHandler implements Command.Handler<EditUserCommand, Voidy> {
    private final UserRepository _userRepository;

    public EditUserCommandHandler(UserRepository userRepository) {
        _userRepository = userRepository;
    }

    @Override
    public Voidy handle(EditUserCommand editUserCommand) {
        User user = _userRepository.getById(editUserCommand.id);
        user.editUser(editUserCommand.firstName, editUserCommand.lastName);

        _userRepository.save(user);
        return null;
    }
}
