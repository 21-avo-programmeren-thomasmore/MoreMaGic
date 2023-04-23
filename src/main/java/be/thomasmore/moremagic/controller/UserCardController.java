package be.thomasmore.moremagic.controller;

import an.awesome.pipelinr.Pipeline;
import be.thomasmore.moremagic.domain.ScryfallCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCardController {
    @Autowired
    Pipeline pipeline;
    @GetMapping ("*/card")
    public ScryfallCard addCard(@RequestParam ScryfallCard selectedCard){
        return null;
    }
}
