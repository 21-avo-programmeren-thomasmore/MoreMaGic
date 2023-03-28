package be.thomasmore.moremagic.controller;

import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.application.commands.createUser.CreateUserCommand;
import be.thomasmore.moremagic.application.commands.editUser.EditUserCommand;
import be.thomasmore.moremagic.application.commands.triggerJsonMap.triggerJsonMapCommand;
import be.thomasmore.moremagic.application.queries.ScryfallTest.ScryfallTestQuery;
import be.thomasmore.moremagic.application.queries.getUser.GetUserQuery;
import be.thomasmore.moremagic.application.queries.getUsers.GetUsersQuery;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    Pipeline pipeline;
    @GetMapping("/say-hello")
    public List<User> SayHello(){

        return pipeline.send(new GetUsersQuery());
    }

    @GetMapping("/transformJson")
    public List<Card> transformJson(){
        return pipeline.send(new triggerJsonMapCommand());
    }
    @GetMapping("/userByName")
    public User GetUserByName(@RequestParam String name){
        return pipeline.send(new GetUserQuery(name));
    }

    @PostMapping("/user")
    public Voidy CreateUser(@RequestBody CreateUserCommand cmd)
    {
        return pipeline.send(cmd);
    }

    @PutMapping("/user")
    public Voidy EditUser(@RequestBody EditUserCommand cmd) {
        return pipeline.send(cmd);
    }

    @GetMapping("/scryfall")
    public Voidy GetSomething(){

        return pipeline.send(new ScryfallTestQuery());
    }
}
