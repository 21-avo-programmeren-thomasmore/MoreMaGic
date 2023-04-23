package be.thomasmore.moremagic.application.queries.userCard.addUserCard;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.ScryfallCard;
import be.thomasmore.moremagic.domain.UserCard;

public class AddUserCardQuery implements Command<UserCard> {
    public ScryfallCard scryfallCard;
    public int collectionID;

    public AddUserCardQuery(ScryfallCard scryfallCard, int collectionID) {
        this.scryfallCard = scryfallCard;
        this.collectionID = collectionID;
    }
}
