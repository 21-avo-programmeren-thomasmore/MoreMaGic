package be.thomasmore.moremagic.application.queries.userCard.getUserCard;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.UserCard;
import be.thomasmore.moremagic.persistence.UserCardRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class GetUserCardQueryHandler implements Command.Handler<GetUserCardQuery, UserCard> {
    private UserCardRepository _userCardRepository;

    @Override
    public UserCard handle(GetUserCardQuery getUserCardQuery) {
        ArrayList<UserCard> userCards = _userCardRepository.findUserCard(getUserCardQuery.oracleID, getUserCardQuery.collectionID);
        return userCards.get(0);
    }
}
