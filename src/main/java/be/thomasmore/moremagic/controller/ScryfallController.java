package be.thomasmore.moremagic.controller;

import be.thomasmore.moremagic.domain.ScryfallCard;
import be.thomasmore.moremagic.services.ScryfallInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ScryfallController {

    @GetMapping("search")
    public ArrayList<ScryfallCard> searchCards(@RequestParam String search,
                                               @RequestParam Optional<String> orderBy ){
        return ScryfallInterface.searchCards(search, orderBy.orElse("name"));
    }
}
