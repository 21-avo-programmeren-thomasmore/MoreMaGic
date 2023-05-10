package be.thomasmore.moremagic.application.commands.addCardToCollection;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class addCardToCollectionCommand implements Command<Voidy> {
    public Integer collectionId;
    public String skryfallId;
    public String name;
    public String photo;

    public addCardToCollectionCommand (Integer collectionId, String skryfallId, String name, String photo) {
        this.collectionId = collectionId;
        this.skryfallId = skryfallId;
        this.name = name;
        this.photo = photo;
    }
}
