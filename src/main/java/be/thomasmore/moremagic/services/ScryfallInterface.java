package be.thomasmore.moremagic.services;

import be.thomasmore.moremagic.domain.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ScryfallInterface {
    //@GetMapping("/cards")
    //Call<List<Card>> getAllCards();

    //@GetMapping("/cards/named")
    //Call<Card> getCardByName(@Query("exact") String name);
}
