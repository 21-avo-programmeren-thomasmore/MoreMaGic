package be.thomasmore.moremagic.services;

import be.thomasmore.moremagic.domain.ScryfallCard;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import io.swagger.v3.core.util.Json;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
public interface ScryfallInterface {
    String baseUrl="https://api.scryfall.com/";
    static List<ScryfallCard> searchCards(String search){
        String url=baseUrl+"cards/search?q="+search+"&include_extras=true&order=name";
        RestTemplate restTemplate = new RestTemplate();
        JsonNode json = restTemplate.getForObject(url, JsonNode.class);
        var jsonArray = json.get("data");
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        List<ScryfallCard> scryfallCards;

        try {
            scryfallCards = mapper.readValue(jsonArray.toString(), new TypeReference<>() {});


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return scryfallCards;

    }
}
