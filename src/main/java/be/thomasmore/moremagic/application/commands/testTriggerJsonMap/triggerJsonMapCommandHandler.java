package be.thomasmore.moremagic.application.commands.testTriggerJsonMap;

import an.awesome.pipelinr.Command;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.ScryfallCard;
import be.thomasmore.moremagic.persistence.CardRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class triggerJsonMapCommandHandler implements Command.Handler<triggerJsonMapCommand, List<ScryfallCard>> {
    private CardRepository _repository;
    Card card = new Card();

    public triggerJsonMapCommandHandler(CardRepository _repository) {
        this._repository = _repository;
    }

    @Override
    public List<ScryfallCard> handle(triggerJsonMapCommand triggerJsonMapCommand) {
        File file = new File("C:/Users/mdecat/Downloads/default-cards.json");
        //File file = new File("C:/Users/de-ma/Downloads/default-cards.json");
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        List<ScryfallCard> scryfallCards;

        try {
            scryfallCards = mapper.readValue(file, new TypeReference<List<ScryfallCard>>() {});
            ScryfallCard scryfallCard = scryfallCards.get(666);

            setCard(scryfallCard);
            List<Card> cards = _repository.FindByOracleId(card.getOracleId());
            if(cards.isEmpty())
                _repository.save(card);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return scryfallCards.subList(222,225);
    }
    private void setCard(ScryfallCard scryfallCard){
        card.setCmc(scryfallCard.getCmc());
        card.setColors(scryfallCard.getColors());
        card.setFoil(scryfallCard.isFoil());
        card.setLayout(scryfallCard.getLayout());
        card.setKeywords(scryfallCard.getKeywords());
        card.setName(scryfallCard.getName());
        card.setSetId(scryfallCard.getSet_id());
        card.setSetName(scryfallCard.getSet_name());
        card.setOversized(scryfallCard.isOversized());
        card.setPromo(scryfallCard.isPromo());
        card.setRarity(scryfallCard.getRarity());
        card.setReprint(scryfallCard.isReprint());
        card.setScryfallId(scryfallCard.getId());
        card.setOracleId(scryfallCard.getOracle_id());
        card.setReserved(scryfallCard.isReserved());
        card.setArist(scryfallCard.getArtist());
        card.setBorderColor(scryfallCard.getBorder_color());
        card.setFlavorText(scryfallCard.getFlavor_text());
        card.setCollecterNumber(scryfallCard.getCollector_number());
        card.setOracleText(scryfallCard.getOracle_text());
        card.setTypeLine(scryfallCard.getType_line());
        card.setManaCost(scryfallCard.getMana_cost());
        card.setLanguage(scryfallCard.getLang());
        card.setVariation(scryfallCard.isVariation());
        card.setLegalities_alchemy(scryfallCard.getLegalities_alchemy() == "legal");
        card.setLegalities_standard(scryfallCard.getLegalities_standard() == "legal");
        card.setLegalities_future(scryfallCard.getLegalities_future() == "legal");
        card.setLegalities_historic(scryfallCard.getLegalities_historic() == "legal");
        card.setLegalities_gladiator(scryfallCard.getLegalities_gladiator() == "legal");
        card.setLegalities_pioneer(scryfallCard.getLegalities_pioneer() == "legal");
        card.setLegalities_explorer(scryfallCard.getLegalities_explorer() == "legal");
        card.setLegalities_modern(scryfallCard.getLegalities_modern() == "legal");
        card.setLegalities_legacy(scryfallCard.getLegalities_legacy() == "legal");
        card.setLegalities_pauper(scryfallCard.getLegalities_pauper() == "legal");
        card.setLegalities_vintage(scryfallCard.getLegalities_vintage() == "legal");
        card.setLegalities_penny(scryfallCard.getLegalities_penny() == "legal");
        card.setLegalities_commander(scryfallCard.getLegalities_commander() == "legal");
        card.setLegalities_oathbreaker(scryfallCard.getLegalities_oathbreaker() == "legal");
        card.setLegalities_brawl(scryfallCard.getLegalities_brawl() == "legal");
        card.setLegalities_historicbrawl(scryfallCard.getLegalities_historicbrawl() == "legal");
        card.setLegalities_paupercommander(scryfallCard.getLegalities_paupercommander() == "legal");
        card.setLegalities_duel(scryfallCard.getLegalities_duel() == "legal");
        card.setLegalities_oldschool(scryfallCard.getLegalities_premodern() == "legal");
        card.setLegalities_predh(scryfallCard.getLegalities_predh() == "legal");


    }
}
