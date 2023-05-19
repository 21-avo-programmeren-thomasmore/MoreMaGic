package be.thomasmore.moremagic.application.commands.addCardToDeck;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class addCardToDeckCommand implements Command<Voidy> {
    public Integer deckId;
    public String skryfallId;
    public String name;
    public String photo;
    public String setName;
    public String collectorNumber;
    public String typeLine;
    public String rarity;
    public String lang;
    public String priceEur;

    public addCardToDeckCommand(Integer deckId, String skryfallId, String name, String photo, String setName, String collectorNumber, String typeLine, String rarity, String lang, String priceEur) {
        this.deckId = deckId;
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
