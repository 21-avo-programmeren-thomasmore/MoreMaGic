package be.thomasmore.moremagic.application.commands.addCardToCollection;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class addCardToCollectionCommand implements Command<Voidy> {
    public Integer collectionId;
    public String skryfallId;

    public addCardToCollectionCommand (Integer collectionId, String skryfallId) {
        this.collectionId = collectionId;
        this.skryfallId = skryfallId;
    }
}
