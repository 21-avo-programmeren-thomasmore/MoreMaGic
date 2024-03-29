package be.thomasmore.moremagic.controller;

import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.application.commands.createUser.CreateUserCommand;
import be.thomasmore.moremagic.application.commands.editUser.EditUserCommand;
import be.thomasmore.moremagic.application.queries.AuthorizeUser.AuthorizeUserCommand;
import be.thomasmore.moremagic.application.queries.getUser.GetUserQuery;
import be.thomasmore.moremagic.application.queries.getUsers.GetUsersQuery;
import be.thomasmore.moremagic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    Pipeline pipeline;
    @GetMapping("/users/allUsers")
    public List<User> SayHello(){

        return pipeline.send(new GetUsersQuery());
    }

    @GetMapping("/users/userByEmail")
    public User GetUserByName(@RequestParam String email){
        return pipeline.send(new GetUserQuery(email));
    }

    @PostMapping("/users/create-user")
    public Voidy CreateUser(@RequestBody CreateUserCommand cmd)
    {
        return pipeline.send(cmd);
    }

    @PutMapping("/users/user")
    public Voidy EditUser(@RequestBody EditUserCommand cmd) {
        return pipeline.send(cmd);
    }

    @GetMapping("users/has-account")
    public User authorizeUser(@RequestParam String email, @RequestParam String password) {
        return pipeline.send(new AuthorizeUserCommand(email, password));}

}
