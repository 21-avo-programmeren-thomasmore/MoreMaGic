package be.thomasmore.moremagic.application.commands.addCardToWishlist;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.persistence.CardRepository;
import org.springframework.stereotype.Component;

@Component
public class addCardToWishlistCommandHandler implements Command.Handler<addCardToWishlistCommand, Voidy>{

    private final CardRepository _cardRepository;

    public addCardToWishlistCommandHandler(CardRepository cardRepository) {
        _cardRepository = cardRepository;
    }

    @Override
    public Voidy handle(addCardToWishlistCommand command) {
        Card card = new Card(null, command.skryfallId, command.name, command.photo, command.setName, command.collectorNumber, command.typeLine, command.rarity, command.lang, command.priceEur, command.wishlistId, null);
        _cardRepository.save(card);
        return null;
    }
}
