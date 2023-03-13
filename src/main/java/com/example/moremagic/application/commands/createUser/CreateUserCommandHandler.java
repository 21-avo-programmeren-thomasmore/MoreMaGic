package com.example.moremagic.application.commands.createUser;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import com.example.moremagic.domain.User;
import com.example.moremagic.persistence.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateUserCommandHandler implements Command.Handler<CreateUserCommand, Voidy>{

    private final UserRepository _userRepository;

    public CreateUserCommandHandler(UserRepository userRepository) {
        _userRepository = userRepository;
    }

    @Override
    public Voidy handle(CreateUserCommand createUserCommand) {
        User user = new User(createUserCommand.Name, createUserCommand.Address);
        _userRepository.save(user);
        return null;
    }
}
