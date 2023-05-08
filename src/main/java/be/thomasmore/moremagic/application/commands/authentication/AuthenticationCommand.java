package be.thomasmore.moremagic.application.commands.authentication;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.controller.ViewModels.AuthenticationResponseViewModel;

public class AuthenticationCommand implements Command<AuthenticationResponseViewModel> {

    public String email;
    public String password;
}
