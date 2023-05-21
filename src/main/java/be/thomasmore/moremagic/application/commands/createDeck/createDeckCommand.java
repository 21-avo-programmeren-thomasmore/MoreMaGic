package be.thomasmore.moremagic.application.commands.createDeck;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class createDeckCommand implements Command<Voidy> {
    public String name;
    public String description;
    public String userEmail;

    public createDeckCommand(String name, String description, String userEmail) {
        this.name = name;
        this.description = description;
        this.userEmail = userEmail;
    }
}
