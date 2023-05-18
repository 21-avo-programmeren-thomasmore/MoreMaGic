package be.thomasmore.moremagic.application.queries.getCollections;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Collection;

import java.util.List;

public class getCollectionsQuery implements Command<List<Collection>> {
    public String UserEmail;

    public getCollectionsQuery(String userEmail) {
        UserEmail = userEmail;
    }
}
