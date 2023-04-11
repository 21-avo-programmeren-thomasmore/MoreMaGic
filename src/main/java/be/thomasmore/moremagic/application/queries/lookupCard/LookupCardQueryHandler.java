package be.thomasmore.moremagic.application.queries.lookupCard;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.persistence.CardRepository;
import be.thomasmore.moremagic.persistence.ScryfallCardRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LookupCardQueryHandler implements Command.Handler<LookupCardQuery, List<Card>> {

    private ScryfallCardRepository _scryfallCardRepository;
    public LookupCardQueryHandler(ScryfallCardRepository _scryfallCardRepository) {

        _scryfallCardRepository = _scryfallCardRepository;
    }

    @Override
    public List<Card> handle(LookupCardQuery lookupCardQuery) {
        return _scryfallCardRepository.findIfContains(lookupCardQuery.letter);
    }
}
