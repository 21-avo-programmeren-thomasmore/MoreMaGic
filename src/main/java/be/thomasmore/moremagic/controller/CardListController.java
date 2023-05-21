package be.thomasmore.moremagic.controller;

import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.application.commands.addCardToCollection.addCardToCollectionCommand;
import be.thomasmore.moremagic.application.commands.addCardToDeck.addCardToDeckCommand;
import be.thomasmore.moremagic.application.commands.addCardToWishlist.addCardToWishlistCommand;
import be.thomasmore.moremagic.application.commands.createCollection.createCollectionCommand;
import be.thomasmore.moremagic.application.commands.createDeck.createDeckCommand;
import be.thomasmore.moremagic.application.commands.createWishlist.createWishlistCommand;
import be.thomasmore.moremagic.application.queries.getCardsFromCollection.getCardsFromCollectionQuery;
import be.thomasmore.moremagic.application.queries.getCardsFromDeck.getCardsFromDeckQuery;
import be.thomasmore.moremagic.application.queries.getCardsFromWishlist.getCardsFromWishlistQuery;
import be.thomasmore.moremagic.application.queries.getCollections.getCollectionsQuery;
import be.thomasmore.moremagic.application.queries.getDecks.getDecksQuery;
import be.thomasmore.moremagic.application.queries.getUser.GetUserQuery;
import be.thomasmore.moremagic.application.queries.getWishlists.getWishlistsQuery;
import be.thomasmore.moremagic.domain.*;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardListController {

    @Autowired
    Pipeline pipeline;
    // COLLECTIONS //
    @PostMapping ("cardlist/createCollection")
    public Voidy createCollection(@RequestBody createCollectionCommand cmd ){
        return pipeline.send(cmd);
    }

    @PostMapping ("cardlist/addCardToCollection")
    public Voidy addCardToCollection(
                                     @RequestParam Integer collectionId,
                                     @RequestParam String skryfallId,
                                     @RequestParam String name,
                                     @RequestParam String photo,
                                     @RequestParam String setName,
                                     @RequestParam String collectorNumber,
                                     @RequestParam String typeLine,
                                     @RequestParam String rarity,
                                     @RequestParam String lang,
                                     @RequestParam String priceEur
                                     ) {
        return pipeline.send(new addCardToCollectionCommand(collectionId, skryfallId, name, photo, setName, collectorNumber, typeLine, rarity, lang, priceEur));
    }

    @GetMapping ("cardlist/getCollections")
    public List<Collection> getCollections(@RequestParam String userMail) {
        return pipeline.send(new getCollectionsQuery(userMail));
    }

    @GetMapping("cardlist/getCardsFromCollection")
    public List<Card> getCardsFromCollection(@RequestParam Integer collectionId){
        return pipeline.send(new getCardsFromCollectionQuery(collectionId));
    }

    // WISHLISTS //
    @PostMapping ("cardlist/createWishlist")
    public Voidy createWishlist(@RequestParam String name,
                                  @RequestParam String description ){
        return pipeline.send(new createWishlistCommand(name, description));
    }

    @PostMapping ("cardlist/addCardToWishlist")
    public Voidy addCardToWishlist(
            @RequestParam Integer collectionId,
            @RequestParam String skryfallId,
            @RequestParam String name,
            @RequestParam String photo,
            @RequestParam String setName,
            @RequestParam String collectorNumber,
            @RequestParam String typeLine,
            @RequestParam String rarity,
            @RequestParam String lang,
            @RequestParam String priceEur
    ) {
        return pipeline.send(new addCardToWishlistCommand(collectionId, skryfallId, name, photo, setName, collectorNumber, typeLine, rarity, lang, priceEur));
    }

    @GetMapping ("cardlist/getWishlists")
    public List<Wishlist> getWishlists(@RequestParam String userEmail) {
        return pipeline.send(new getWishlistsQuery(userEmail));
    }

    @GetMapping("cardlist/getCardsFromWishlist")
    public List<Card> getCardsFromWishlist(@RequestParam Integer wishlistId){
        return pipeline.send(new getCardsFromWishlistQuery(wishlistId));
    }

    // DECKS //
    @PostMapping ("cardlist/createDeck")
    public Voidy createDeck(@RequestBody createDeckCommand cmd ){
        return pipeline.send(cmd);
    }

    @PostMapping ("cardlist/addCardToDeck")
    public Voidy addCardToDeck(
            @RequestParam Integer collectionId,
            @RequestParam String skryfallId,
            @RequestParam String name,
            @RequestParam String photo,
            @RequestParam String setName,
            @RequestParam String collectorNumber,
            @RequestParam String typeLine,
            @RequestParam String rarity,
            @RequestParam String lang,
            @RequestParam String priceEur
    ) {
        return pipeline.send(new addCardToDeckCommand(collectionId, skryfallId, name, photo, setName, collectorNumber, typeLine, rarity, lang, priceEur));
    }

    @GetMapping ("cardlist/getDecks")
    public List<Deck> getDecks(@RequestParam String userMail) {
        return pipeline.send(new getDecksQuery(userMail));
    }

    @GetMapping("cardlist/getCardsFromDeck")
    public List<Card> getCardsFromDeck(@RequestParam Integer deckId){
        return pipeline.send(new getCardsFromDeckQuery(deckId));
    }
}

