package com.example.moremagic.controller;

import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Voidy;
import com.example.moremagic.application.commands.createUser.CreateUserCommand;
import com.example.moremagic.application.queries.getUser.GetUserQuery;
import com.example.moremagic.application.queries.getUsers.GetUsersQuery;
import com.example.moremagic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    Pipeline pipeline;
    @GetMapping("/say-hello")
    public List<User> SayHello(){

        return pipeline.send(new GetUsersQuery());
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

}
