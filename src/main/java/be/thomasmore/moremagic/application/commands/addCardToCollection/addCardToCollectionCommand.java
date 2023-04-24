package be.thomasmore.moremagic.application.commands.addCardToCollection;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class addCardToCollectionCommand implements Command<Voidy> {
    public Integer collectionId;
    public Integer skryfallId;

    public addCardToCollectionCommand (Integer collectionId, Integer skryfallId) {
        this.collectionId = collectionId;
        this.skryfallId = skryfallId;
    }
}
