package be.thomasmore.moremagic.application.commands.createWishlist;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

import be.thomasmore.moremagic.domain.Wishlist;
import be.thomasmore.moremagic.persistence.WishlistRepository;
import org.springframework.stereotype.Component;

@Component
public class createWishlistCommandHandler implements Command.Handler<createWishlistCommand, Voidy>{

    private final WishlistRepository _wishlistRepository;

    public createWishlistCommandHandler(WishlistRepository wishlistRepository) {
        _wishlistRepository = wishlistRepository;
    }

    @Override
    public Voidy handle(createWishlistCommand command) {
        Wishlist wishlist = new Wishlist(command.name, command.description, command.userEmail);
        _wishlistRepository.save(wishlist);
        return null;
    }
}
