package be.thomasmore.moremagic.services;

import be.thomasmore.moremagic.domain.Card;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class CustomDeserializer extends StdDeserializer<Card> {
    public CustomDeserializer() {
        this(null);
    }

    public CustomDeserializer(Class<?> vc) {
        super(vc);
    }
    @Override
    public Card deserialize(JsonParser parser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Card card = new Card();
        ObjectCodec codec = parser.getCodec();
        JsonNode node = codec.readTree(parser);


        return card;
    }
}
