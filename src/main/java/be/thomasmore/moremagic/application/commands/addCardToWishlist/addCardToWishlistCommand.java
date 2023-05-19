package be.thomasmore.moremagic.application.commands.addCardToWishlist;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class addCardToWishlistCommand implements Command<Voidy> {
    public Integer collectionId;
    public String skryfallId;
    public String name;
    public String photo;
    public String setName;
    public String collectorNumber;
    public String typeLine;
    public String rarity;
    public String lang;
    public String priceEur;

    public addCardToWishlistCommand(Integer collectionId, String skryfallId, String name, String photo, String setName, String collectorNumber, String typeLine, String rarity, String lang, String priceEur) {
        this.collectionId = collectionId;
        this.skryfallId = skryfallId;
        this.name = name;
        this.photo = photo;
        this.setName = setName;
        this.collectorNumber = collectorNumber;
        this.typeLine = typeLine;
        this.rarity = rarity;
        this.lang = lang;
        this.priceEur = priceEur;

    }
}
