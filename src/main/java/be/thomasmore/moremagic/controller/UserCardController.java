package be.thomasmore.moremagic.controller;

import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.application.commands.userCard.addUserCard.AddUserCardCommand;
import be.thomasmore.moremagic.domain.ScryfallCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserCardController {
    @Autowired
    Pipeline pipeline;
    @PostMapping("*/add_card/*")
    public Voidy CreateUserCard(@RequestBody AddUserCardCommand cmd){return pipeline.send(cmd);}
}
