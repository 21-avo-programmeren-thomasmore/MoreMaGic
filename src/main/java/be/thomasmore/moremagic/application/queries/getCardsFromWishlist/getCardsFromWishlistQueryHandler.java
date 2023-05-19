package be.thomasmore.moremagic.application.queries.getCardsFromWishlist;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.persistence.CardRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class getCardsFromWishlistQueryHandler implements Command.Handler<getCardsFromWishlistQuery, List<Card>>{

    private CardRepository _cardRepository;

    public getCardsFromWishlistQueryHandler(CardRepository cardRepository) {
        this._cardRepository = cardRepository;
    }

    @Override
    public List<Card> handle(getCardsFromWishlistQuery command) {
        List<Card> cards = _cardRepository.FindByWishlistId(command.wishlistId);
        return cards;
    }
}
