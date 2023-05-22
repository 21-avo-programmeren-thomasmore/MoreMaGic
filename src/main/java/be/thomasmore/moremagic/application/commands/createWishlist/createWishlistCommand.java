package be.thomasmore.moremagic.application.commands.createWishlist;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;

public class createWishlistCommand implements Command<Voidy> {
    public String name;
    public String description;
    public String userEmail;

    public createWishlistCommand(String name, String description, String userEmail) {
        this.name = name;
        this.description = description;
        this.userEmail = userEmail;
    }
}
