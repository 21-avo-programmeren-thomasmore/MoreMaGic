package be.thomasmore.moremagic.application.commands.createDeck;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class createDeckCommand implements Command<Voidy> {
    public String name;
    public String description;

    public createDeckCommand(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
