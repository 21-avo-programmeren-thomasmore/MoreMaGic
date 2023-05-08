package be.thomasmore.moremagic.application.commands.registerUser;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.controller.ViewModels.AuthenticationResponseViewModel;

public class RegisterUserCommand implements Command<AuthenticationResponseViewModel> {
    public String firstName;
    public String lastName;
    public String email;
    public String password;
}
