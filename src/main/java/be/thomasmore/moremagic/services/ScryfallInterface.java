package be.thomasmore.moremagic.services;

//import be.thomasmore.moremagic.domain.ScryfallCard;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

//@RestController
//public interface ScryfallInterface {
//    String baseUrl="https://api.scryfall.com/";
//    static ArrayList<ScryfallCard> searchCards(String search, String orderBy){
//        String url=baseUrl+"cards/search";
//        URI uri = UriComponentsBuilder.fromUriString(url)
//                .queryParam("q", search)
//                .queryParam("include_extras", true)
//                .queryParam("order", orderBy)
//                .build()
//                .toUri();
//        RestTemplate restTemplate = new RestTemplate();
//        JsonNode json = restTemplate.getForObject(uri, JsonNode.class);
//        ArrayList<ScryfallCard> scryfallCards = new ArrayList<>();
//        if (json == null)
//            return scryfallCards;
//        var jsonArray = json.get("data");
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
//
//        try {
//            scryfallCards = mapper.readValue(jsonArray.toString(), new TypeReference<>() {});
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        return scryfallCards;
//
//    }
//}
