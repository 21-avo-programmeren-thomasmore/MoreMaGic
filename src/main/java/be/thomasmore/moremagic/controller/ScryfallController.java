package be.thomasmore.moremagic.controller;

import be.thomasmore.moremagic.domain.ScryfallCard;
import be.thomasmore.moremagic.services.ScryfallInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScryfallController {

    @GetMapping("search")
    public List<ScryfallCard> searchCards(){
        return ScryfallInterface.searchCards("Brago");
    }
}
