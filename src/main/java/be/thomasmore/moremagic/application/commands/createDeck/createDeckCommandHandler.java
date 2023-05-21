package be.thomasmore.moremagic.application.commands.createDeck;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.domain.Deck;
import be.thomasmore.moremagic.domain.Wishlist;
import be.thomasmore.moremagic.persistence.DeckRepository;
import be.thomasmore.moremagic.persistence.WishlistRepository;
import org.springframework.stereotype.Component;

@Component
public class createDeckCommandHandler implements Command.Handler<createDeckCommand, Voidy>{

    private final DeckRepository _deckRepository;

    public createDeckCommandHandler(DeckRepository deckRepository) {
        _deckRepository = deckRepository;
    }

    @Override
    public Voidy handle(createDeckCommand command) {
        System.out.println(command.name);
        Deck deck = new Deck(command.name, command.description, command.userEmail);
        _deckRepository.save(deck);
             return null;
    }
}
