package be.thomasmore.moremagic.application.queries.getWishlists;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Wishlist;
import be.thomasmore.moremagic.persistence.WishlistRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class getWishlistsQueryHandler implements Command.Handler<getWishlistsQuery, List<Wishlist>>{

    private WishlistRepository _wishlistRepository;

    public getWishlistsQueryHandler(WishlistRepository wishlistRepository) {
        this._wishlistRepository = wishlistRepository;
    }

    @Override
    public List<Wishlist> handle(getWishlistsQuery command) {
        List<Wishlist> wishlists = _wishlistRepository.findAll();
        return wishlists;
    }
}
