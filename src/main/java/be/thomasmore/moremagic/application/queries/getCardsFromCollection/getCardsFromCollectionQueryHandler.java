package be.thomasmore.moremagic.application.queries.getCardsFromCollection;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.application.queries.getCollections.getCollectionsQuery;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.Collection;
import be.thomasmore.moremagic.persistence.CardRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class getCardsFromCollectionQueryHandler implements Command.Handler<getCardsFromCollectionQuery, List<Card>>{

    private CardRepository _cardRepository;

    public getCardsFromCollectionQueryHandler(CardRepository cardRepository) {
        this._cardRepository = cardRepository;
    }

    @Override
    public List<Card> handle(getCardsFromCollectionQuery command) {
        List<Card> cards = _cardRepository.FindByCollectionId(command.collectionId);
        return cards;
    }
}
