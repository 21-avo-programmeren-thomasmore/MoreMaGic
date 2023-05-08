package be.thomasmore.moremagic.application.queries.getCollections;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Collection;
import be.thomasmore.moremagic.persistence.CollectionRepository;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class getCollectionsQueryHandler implements Command.Handler<getCollectionsQuery, List<Collection>>{

    private CollectionRepository _collectionRepository;

    public getCollectionsQueryHandler(CollectionRepository collectionRepository) {
        this._collectionRepository = collectionRepository;
    }

    @Override
    public List<Collection> handle(getCollectionsQuery command) {
        List<Collection> collections = _collectionRepository.findAll();
        return collections;
    }
}
