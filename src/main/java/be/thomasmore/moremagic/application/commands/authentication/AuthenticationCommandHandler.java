package be.thomasmore.moremagic.application.commands.authentication;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.configuration.JwtService;
import be.thomasmore.moremagic.controller.ViewModels.AuthenticationResponseViewModel;
import be.thomasmore.moremagic.domain.User;
import be.thomasmore.moremagic.persistence.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationCommandHandler implements Command.Handler<AuthenticationCommand, AuthenticationResponseViewModel> {
    private final UserRepository _userRepository;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public AuthenticationCommandHandler(UserRepository _userRepository, AuthenticationManager authenticationManager, JwtService jwtService) {
        this._userRepository = _userRepository;
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    @Override
    public AuthenticationResponseViewModel handle(AuthenticationCommand authenticationCommand) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationCommand.email,
                        authenticationCommand.password
                )
        );

        User user = _userRepository.findByEmail(authenticationCommand.email)
                .orElseThrow();
        String jwtToken = jwtService.generateToken(user);

        return new AuthenticationResponseViewModel(jwtToken);
    }
}
