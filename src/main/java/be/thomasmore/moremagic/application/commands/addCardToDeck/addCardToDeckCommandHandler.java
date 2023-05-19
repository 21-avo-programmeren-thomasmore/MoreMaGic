package be.thomasmore.moremagic.application.commands.addCardToDeck;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.application.commands.addCardToWishlist.addCardToWishlistCommand;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.persistence.CardRepository;
import org.springframework.stereotype.Component;

@Component
public class addCardToDeckCommandHandler implements Command.Handler<addCardToDeckCommand, Voidy>{

    private final CardRepository _cardRepository;

    public addCardToDeckCommandHandler(CardRepository cardRepository) {
        _cardRepository = cardRepository;
    }

    @Override
    public Voidy handle(addCardToDeckCommand command) {
        Card card = new Card(command.collectionId, command.skryfallId, command.name, command.photo, command.setName, command.collectorNumber, command.typeLine, command.rarity, command.lang, command.priceEur);
        _cardRepository.save(card);
        return null;
    }
}
