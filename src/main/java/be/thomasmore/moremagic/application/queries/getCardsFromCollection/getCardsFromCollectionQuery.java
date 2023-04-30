package be.thomasmore.moremagic.application.queries.getCardsFromCollection;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Card;

import java.util.List;

public class getCardsFromCollectionQuery implements Command<List<Card>> {
    public Integer collectionId;
    public getCardsFromCollectionQuery(Integer collectionId) {
        this.collectionId = collectionId;

    }
}
