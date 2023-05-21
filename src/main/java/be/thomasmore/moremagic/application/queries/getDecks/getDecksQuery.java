package be.thomasmore.moremagic.application.queries.getDecks;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Deck;
import be.thomasmore.moremagic.domain.Wishlist;

import java.util.List;

public class getDecksQuery implements Command<List<Deck>> {
    public String UserEmail;
    public getDecksQuery(String userEmail) {
        UserEmail = userEmail;
    }
}
