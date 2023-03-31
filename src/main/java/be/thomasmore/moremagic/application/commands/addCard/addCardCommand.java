package be.thomasmore.moremagic.application.commands.addCard;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.domain.ScryfallCard;

public class addCardCommand implements Command<Voidy> {
    public ScryfallCard scryfallCard;
}
