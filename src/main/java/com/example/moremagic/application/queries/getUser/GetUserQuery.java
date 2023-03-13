package com.example.moremagic.application.queries.getUser;

import an.awesome.pipelinr.Command;
import com.example.moremagic.domain.User;

public class GetUserQuery implements Command<User> {
    public String Name;

    public GetUserQuery(String name) {
        Name = name;
    }
}
