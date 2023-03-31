package be.thomasmore.moremagic.services;

import be.thomasmore.moremagic.domain.ScryfallCard;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class CustomDeserializer extends StdDeserializer<ScryfallCard> {
    public CustomDeserializer() {
        this(null);
    }

    public CustomDeserializer(Class<?> vc) {
        super(vc);
    }
    @Override
    public ScryfallCard deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        ScryfallCard scryfallCard = new ScryfallCard();
        ObjectCodec codec = parser.getCodec();
        JsonNode node = codec.readTree(parser);


        return scryfallCard;
    }
}
