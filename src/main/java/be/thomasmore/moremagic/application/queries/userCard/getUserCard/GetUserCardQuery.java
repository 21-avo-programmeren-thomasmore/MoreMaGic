package be.thomasmore.moremagic.application.queries.userCard.getUserCard;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.UserCard;

import java.util.ArrayList;

public class GetUserCardQuery implements Command<UserCard>{
    public String oracleID;
    public int collectionID;


    public GetUserCardQuery(String oracleID,int collectionID) {
        this.oracleID = oracleID;
        this.collectionID = collectionID;
    }
}
