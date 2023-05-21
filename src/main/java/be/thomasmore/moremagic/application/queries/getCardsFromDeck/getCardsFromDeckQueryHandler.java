package be.thomasmore.moremagic.application.queries.getCardsFromDeck;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.persistence.CardRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class getCardsFromDeckQueryHandler implements Command.Handler<getCardsFromDeckQuery, List<Card>>{

    private CardRepository _cardRepository;

    public getCardsFromDeckQueryHandler(CardRepository cardRepository) {
        this._cardRepository = cardRepository;
    }

    @Override
    public List<Card> handle(getCardsFromDeckQuery command) {
        List<Card> cards = _cardRepository.FindByDeckId(command.deckId);
        return cards;
    }
}
