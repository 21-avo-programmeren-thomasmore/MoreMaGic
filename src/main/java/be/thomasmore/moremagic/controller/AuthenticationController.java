package be.thomasmore.moremagic.controller;

import an.awesome.pipelinr.Pipeline;
import be.thomasmore.moremagic.application.commands.authentication.AuthenticationCommand;
import be.thomasmore.moremagic.application.commands.registerUser.RegisterUserCommand;
import be.thomasmore.moremagic.controller.ViewModels.AuthenticationResponseViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    Pipeline pipeline;
    @PostMapping("/auth/register")
    public AuthenticationResponseViewModel register(
            @RequestBody RegisterUserCommand request
    ){
       return pipeline.send(request);
    }

    @PostMapping("/auth/authenticate")
    public AuthenticationResponseViewModel register(
            @RequestBody AuthenticationCommand request
    ){
        return pipeline.send(request);
    }
}
