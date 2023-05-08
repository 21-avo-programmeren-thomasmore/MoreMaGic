package be.thomasmore.moremagic.application.commands.registerUser;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.configuration.JwtService;
import be.thomasmore.moremagic.controller.ViewModels.AuthenticationResponseViewModel;
import be.thomasmore.moremagic.domain.User;
import be.thomasmore.moremagic.persistence.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

public class RegisterUserCommandHandler implements Command.Handler<RegisterUserCommand, AuthenticationResponseViewModel>{
    private final UserRepository _userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public RegisterUserCommandHandler(UserRepository _userRepository, PasswordEncoder passwordEncoder, JwtService jwtService) {
        this._userRepository = _userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    @Override
    public AuthenticationResponseViewModel handle(RegisterUserCommand registerUserCommand) {

        User user = new User(registerUserCommand.firstName, registerUserCommand.lastName, registerUserCommand.email, passwordEncoder.encode(registerUserCommand.password));
        _userRepository.save(user);

        String jwtToken = jwtService.generateToken(user);

        return new AuthenticationResponseViewModel(jwtToken);
    }
}
