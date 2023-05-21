package be.thomasmore.moremagic.application.queries.getCardsFromDeck;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Card;

import java.util.List;

public class getCardsFromDeckQuery implements Command<List<Card>> {
    public Integer deckId;
    public getCardsFromDeckQuery(Integer deckId) {
        this.deckId = deckId;

    }
}
