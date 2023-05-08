package be.thomasmore.moremagic.controller;

import an.awesome.pipelinr.Pipeline;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.application.commands.addCardToCollection.addCardToCollectionCommand;
import be.thomasmore.moremagic.application.commands.createCollection.createCollectionCommand;
import be.thomasmore.moremagic.application.queries.getCardsFromCollection.getCardsFromCollectionQuery;
import be.thomasmore.moremagic.application.queries.getCollections.getCollectionsQuery;
import be.thomasmore.moremagic.application.queries.getUser.GetUserQuery;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.Collection;
import be.thomasmore.moremagic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardListController {

    @Autowired
    Pipeline pipeline;
    @PostMapping ("cardlist/createCollection")
    public Voidy createCollection(@RequestParam String name,
                                  @RequestParam String description ){
        return pipeline.send(new createCollectionCommand(name, description));
    }

    @PostMapping ("cardlist/addCardToCollection")
    public Voidy addCardToCollection(
                                     @RequestParam Integer collectionId,
                                     @RequestParam String skryfallId
                                     ) {
        return pipeline.send(new addCardToCollectionCommand(collectionId, skryfallId));
    }

    @GetMapping ("cardlist/getCollections")
    public List<Collection> getCollections() {
        return pipeline.send(new getCollectionsQuery());
    }

    @GetMapping("cardlist/getCardsFromCollection")
    public List<Card> getCardsFromCollection(@RequestParam Integer collectionId){
        return pipeline.send(new getCardsFromCollectionQuery(collectionId));
    }
}

