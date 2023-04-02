package be.thomasmore.moremagic.application.commands.addCard;

import an.awesome.pipelinr.Command;
import an.awesome.pipelinr.Voidy;
import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.ScryfallCard;
import be.thomasmore.moremagic.persistence.CardRepository;

import java.util.List;

public class addCardCommandHandler implements Command.Handler<addCardCommand, Voidy>{

    private CardRepository _repository;
    Card card = new Card();
    public addCardCommandHandler(CardRepository _repository) {
        this._repository = _repository;
    }

    @Override
    public Voidy handle(addCardCommand addCardCommand) {

        setCard(addCardCommand.scryfallCard);
        List<Card> cards = _repository.FindByOracleId(card.getOracleId());

        if(cards.isEmpty())
            _repository.save(card);

        return null;
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
        card.setArtist(scryfallCard.getArtist());
        card.setBorderColor(scryfallCard.getBorder_color());
        card.setFlavorText(scryfallCard.getFlavor_text());
        card.setCollecterNumber(scryfallCard.getCollector_number());
        card.setOracleText(scryfallCard.getOracle_text());
        card.setTypeLine(scryfallCard.getType_line());
        card.setManaCost(scryfallCard.getMana_cost());
        card.setLanguage(scryfallCard.getLang());
        card.setVariation(scryfallCard.isVariation());
        card.setLegalities_alchemy(scryfallCard.getLegalities_alchemy().equals("legal"));
        card.setLegalities_standard(scryfallCard.getLegalities_standard().equals("legal"));
        card.setLegalities_future(scryfallCard.getLegalities_future().equals("legal"));
        card.setLegalities_historic(scryfallCard.getLegalities_historic().equals("legal"));
        card.setLegalities_gladiator(scryfallCard.getLegalities_gladiator().equals("legal"));
        card.setLegalities_pioneer(scryfallCard.getLegalities_pioneer().equals("legal"));
        card.setLegalities_explorer(scryfallCard.getLegalities_explorer().equals("legal"));
        card.setLegalities_modern(scryfallCard.getLegalities_modern().equals("legal"));
        card.setLegalities_legacy(scryfallCard.getLegalities_legacy().equals("legal"));
        card.setLegalities_pauper(scryfallCard.getLegalities_pauper().equals("legal"));
        card.setLegalities_vintage(scryfallCard.getLegalities_vintage().equals("legal"));
        card.setLegalities_penny(scryfallCard.getLegalities_penny().equals("legal"));
        card.setLegalities_commander(scryfallCard.getLegalities_commander().equals("legal"));
        card.setLegalities_oathbreaker(scryfallCard.getLegalities_oathbreaker().equals("legal"));
        card.setLegalities_brawl(scryfallCard.getLegalities_brawl().equals("legal"));
        card.setLegalities_historicbrawl(scryfallCard.getLegalities_historicbrawl().equals("legal"));
        card.setLegalities_paupercommander(scryfallCard.getLegalities_paupercommander().equals("legal"));
        card.setLegalities_duel(scryfallCard.getLegalities_duel().equals("legal"));
        card.setLegalities_oldschool(scryfallCard.getLegalities_premodern().equals("legal"));
        card.setLegalities_predh(scryfallCard.getLegalities_predh().equals("legal"));


    }
}
