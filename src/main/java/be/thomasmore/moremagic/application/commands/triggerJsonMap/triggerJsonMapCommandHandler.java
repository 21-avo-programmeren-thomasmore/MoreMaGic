package be.thomasmore.moremagic.application.commands.triggerJsonMap;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.domain.Card;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Component
public class triggerJsonMapCommandHandler implements Command.Handler<triggerJsonMapCommand, List<Card>> {
    @Override
    public List<Card> handle(triggerJsonMapCommand triggerJsonMapCommand) {
        File file = new File("C:/Users/mdecat/Downloads/default-cards.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        List<Card> cards;

        try {
            cards = mapper.readValue(file, new TypeReference<List<Card>>() {});
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return cards;
    }
}
