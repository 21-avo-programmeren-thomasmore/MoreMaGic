package be.thomasmore.moremagic.application.queries.getWishlists;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Wishlist;

import java.util.List;

public class getWishlistsQuery implements Command<List<Wishlist>> {
    public String UserEmail;

    public getWishlistsQuery(String userEmail) {
        UserEmail = userEmail;
    }
}
