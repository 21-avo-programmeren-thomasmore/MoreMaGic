package be.thomasmore.moremagic.application.queries.getDecks;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Deck;
import be.thomasmore.moremagic.domain.Wishlist;
import be.thomasmore.moremagic.persistence.DeckRepository;
import be.thomasmore.moremagic.persistence.WishlistRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class getDecksQueryHandler implements Command.Handler<getDecksQuery, List<Deck>>{

    private DeckRepository _deckRepository;

    public getDecksQueryHandler(DeckRepository deckRepository) {
        this._deckRepository = deckRepository;
    }

    @Override
    public List<Deck> handle(getDecksQuery command) {
        List<Deck> decks = _deckRepository.FindByUserEmail(command.UserEmail);
        return decks;
    }
}
