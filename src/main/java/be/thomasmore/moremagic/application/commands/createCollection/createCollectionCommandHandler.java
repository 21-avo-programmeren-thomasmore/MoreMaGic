package be.thomasmore.moremagic.application.commands.createCollection;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.domain.Collection;
import be.thomasmore.moremagic.persistence.CollectionRepository;
import org.springframework.stereotype.Component;

@Component
public class createCollectionCommandHandler implements Command.Handler<createCollectionCommand, Voidy>{

    private final CollectionRepository _collectionRepository;

    public createCollectionCommandHandler(CollectionRepository collectionRepository) {
        _collectionRepository = collectionRepository;
    }

    @Override
    public Voidy handle(createCollectionCommand command) {
        Collection collection = new Collection(command.name, command.description, command.userEmail);
        _collectionRepository.save(collection);
        return null;
    }
}
