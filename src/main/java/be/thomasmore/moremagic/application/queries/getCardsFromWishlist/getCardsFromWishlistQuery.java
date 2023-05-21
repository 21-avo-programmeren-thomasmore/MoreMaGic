package be.thomasmore.moremagic.application.queries.getCardsFromWishlist;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Card;

import java.util.List;

public class getCardsFromWishlistQuery implements Command<List<Card>> {
    public Integer wishlistId;
    public getCardsFromWishlistQuery(Integer wishlistId) {
        this.wishlistId = wishlistId;

    }
}
