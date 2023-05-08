package be.thomasmore.moremagic.controller;

import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Voidy;
//import be.thomasmore.moremagic.application.queries.searchCards.SearchCardsQuery;
//import be.thomasmore.moremagic.domain.ScryfallCard;
//import be.thomasmore.moremagic.services.ScryfallInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ScryfallController {

    @Autowired
    Pipeline pipeline;
    @GetMapping("scryfall/search")
    public String searchCards(@RequestParam String search,
                                        @RequestParam String orderBy ){
        return "pipeline.send(new SearchCardsQuery(search, orderBy))";
    }

    /* WeenHoekje
    // test for translation from json to domain model
    @GetMapping("/users/transformJson")
    public ScryfallCard transformJson(){
        return pipeline.send(new triggerJsonMapQuery());
    }*/
}
