package be.thomasmore.moremagic.application.queries.maartensWeenHoekje;

import an.awesome.pipelinr.Command;
//import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.ScryfallCard;
//import be.thomasmore.moremagic.persistence.CardRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class triggerJsonMapQueryHandler implements Command.Handler<triggerJsonMapQuery, ScryfallCard> {
//    private CardRepository _repository;
//    Card card = new Card();
//
//    public triggerJsonMapQueryHandler(CardRepository _repository) {
//        this._repository = _repository;
//    }

    // save a srcyfall json file on your local machine and adjust the path
    // in the below code, it will return record 666 from the json file
    @Override
    public ScryfallCard handle(triggerJsonMapQuery triggerJsonMapQuery) {
        File file = new File("C:/Users/mdecat/Downloads/default-cards.json");
        //File file = new File("C:/Users/de-ma/Downloads/default-cards.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        List<ScryfallCard> scryfallCards;
        ScryfallCard scryfallCard;

        try {
            scryfallCards = mapper.readValue(file, new TypeReference<>() {});
            scryfallCard = scryfallCards.get(666);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return scryfallCard;
    }
}
