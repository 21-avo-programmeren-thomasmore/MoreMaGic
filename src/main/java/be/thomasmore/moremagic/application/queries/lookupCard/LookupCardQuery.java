package be.thomasmore.moremagic.application.queries.lookupCard;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.User;

import java.util.List;

public class LookupCardQuery implements Command<List<Card>> {
    public String letter;

    public LookupCardQuery(String letter) {this.letter = letter;}

}
