package be.thomasmore.moremagic.application.commands.addCardToCollection;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.application.commands.createCollection.createCollectionCommand;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.Collection;
import be.thomasmore.moremagic.persistence.CardRepository;
import be.thomasmore.moremagic.persistence.CollectionRepository;
import org.springframework.stereotype.Component;

@Component
public class addCardToCollectionCommandHandler implements Command.Handler<addCardToCollectionCommand, Voidy>{

    private final CardRepository _cardRepository;

    public addCardToCollectionCommandHandler(CardRepository cardRepository) {
        _cardRepository = cardRepository;
    }

    @Override
    public Voidy handle(addCardToCollectionCommand command) {
        Card card = new Card(command.collectionId, command.skryfallId, command.name, command.photo, command.setName, command.collectorNumber, command.typeLine, command.rarity, command.lang, command.priceEur, null, null);
        _cardRepository.save(card);
        return null;
    }
}
