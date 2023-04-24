package be.thomasmore.moremagic.application.commands.createCollection;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class createCollectionCommand implements Command<Voidy> {
    public String name;
    public String description;

    public createCollectionCommand (String name, String description) {
        this.name = name;
        this.description = description;
    }
}
