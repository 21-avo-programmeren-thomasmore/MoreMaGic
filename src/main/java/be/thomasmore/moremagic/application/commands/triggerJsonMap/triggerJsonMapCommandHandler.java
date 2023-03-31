package be.thomasmore.moremagic.application.commands.triggerJsonMap;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.ScryfallCard;
import be.thomasmore.moremagic.persistence.ScryfallCardRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class triggerJsonMapCommandHandler implements Command.Handler<triggerJsonMapCommand, List<ScryfallCard>> {
    private ScryfallCardRepository _repository;

    public triggerJsonMapCommandHandler(ScryfallCardRepository _repository) {
        this._repository = _repository;
    }

    @Override
    public List<ScryfallCard> handle(triggerJsonMapCommand triggerJsonMapCommand) {
//        File file = new File("C:/Users/mdecat/Downloads/default-cards.json");
        File file = new File("C:/Users/de-ma/Downloads/default-cards.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        List<ScryfallCard> scryfallCards;

        try {
            scryfallCards = mapper.readValue(file, new TypeReference<List<ScryfallCard>>() {});
            _repository.saveAll(scryfallCards);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return scryfallCards.subList(333,666);
    }
}
