package be.thomasmore.moremagic.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
@Entity
@Table(name = "scryfallcards")
public class ScryfallCard {
    @Id
    @SequenceGenerator(name = "pet_seq",
            sequenceName = "pet_sequence",
            initialValue = 1, allocationSize = 100)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_seq")
    private Integer own_id;
    @JsonProperty("object")
    public String object;
    @JsonProperty("id")
    public String id;
    @JsonProperty("oracle_id")
    public String oracle_id;
    @JsonProperty("multiverse_ids")
    @Column(columnDefinition = "int[]")
    @Type(type = "be.thomasmore.moremagic.domain.mapping.CustomIntegerArrayType")
    public Integer[] multiverse_ids;
    @JsonProperty("mtgo_id")
    public int mtgo_id;
    @JsonProperty("mtgo_foil_id")
    public int mtgo_foil_id;
    @JsonProperty("tcgplayer_id")
    public int tcgplayer_id;
    @JsonProperty("cardmarket_id")
    public int cardmarket_id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("lang")
    public String lang;
    @JsonProperty("released_at")
    public Date released_at;
    @JsonProperty("uri")
    public String uri;
    @JsonProperty("scryfall_uri")
    public String scryfall_uri;
    @JsonProperty("layout")
    public String layout;
    @JsonProperty("highres_image")
    public boolean highres_image;
    @JsonProperty("image_status")
    public String image_status;
    @JsonProperty("image_uris_small")
    public String image_uris_small;
    @JsonProperty("image_uris_normal")
    public String image_uris_normal;
    @JsonProperty("image_uris.large")
    public String image_uris_large;
    @JsonProperty("image_uris.png")
    public String image_uris_png;
    @JsonProperty("image_uris.art_crop")
    public String image_uris_art_crop;
    @JsonProperty("image_uris.border_crop")
    public String image_uris_border_crop;
    @JsonProperty("mana_cost")
    public String mana_cost;
    @JsonProperty("cmc")
    public double cmc;
    @JsonProperty("type_line")
    public String type_line;
    @JsonProperty("oracle_text")
    public String oracle_text;
    @JsonProperty("power")
    public String power;
    @JsonProperty("toughness")
    public String toughness;
    @Column(columnDefinition = "text[]")
    @Type(type = "be.thomasmore.moremagic.domain.mapping.CustomStringArrayType")
    @JsonProperty("colors")
    public String[] colors;
    @JsonProperty("color_identity")
    @Column(columnDefinition = "text[]")
    @Type(type = "be.thomasmore.moremagic.domain.mapping.CustomStringArrayType")
    public String[] color_identity;
    @JsonProperty("keywords")
    @Column(columnDefinition = "text[]")
    @Type(type = "be.thomasmore.moremagic.domain.mapping.CustomStringArrayType")
    public String[] keywords;
    @JsonProperty("legalities.standard")
    public String legalities_standard;
    @JsonProperty("legalities.future")
    public String legalities_future;
    @JsonProperty("legalities.historic")
    public String legalities_historic;
    @JsonProperty("legalities.gladiator")
    public String legalities_gladiator;
    @JsonProperty("legalities.pioneer")
    public String legalities_pioneer;
    @JsonProperty("legalities.explorer")
    public String legalities_explorer;
    @JsonProperty("legalities.modern")
    public String legalities_modern;
    @JsonProperty("legalities.legacy")
    public String legalities_legacy;
    @JsonProperty("legalities.pauper")
    public String legalities_pauper;
    @JsonProperty("legalities.vintage")
    public String legalities_vintage;
    @JsonProperty("legalities.penny")
    public String legalities_penny;
    @JsonProperty("legalities.commander")
    public String legalities_commander;
    @JsonProperty("legalities.oathbreaker")
    public String legalities_oathbreaker;
    @JsonProperty("legalities.brawl")
    public String legalities_brawl;
    @JsonProperty("legalities.historicbrawl")
    public String legalities_historicbrawl;
    @JsonProperty("legalities.alchemy")
    public String legalities_alchemy;
    @JsonProperty("legalities.paupercommander")
    public String legalities_paupercommander;
    @JsonProperty("legalities.duel")
    public String legalities_duel;
    @JsonProperty("legalities.oldschool")
    public String legalities_oldschool;
    @JsonProperty("legalities.premodern")
    public String legalities_premodern;
    @JsonProperty("legalities.predh")
    public String legalities_predh;
    @JsonProperty("games")
    @Column(columnDefinition = "text[]")
    @Type(type = "be.thomasmore.moremagic.domain.mapping.CustomStringArrayType")
    public String[] games;
    @JsonProperty("reserved")
    public boolean reserved;
    @JsonProperty("foil")
    public boolean foil;
    @JsonProperty("nonfoil")
    public boolean nonfoil;
    @JsonProperty("finishes")
    @Column(columnDefinition = "text[]")
    @Type(type = "be.thomasmore.moremagic.domain.mapping.CustomStringArrayType")
    public String[] finishes;
    @JsonProperty("oversized")
    public boolean oversized;
    @JsonProperty("promo")
    public boolean promo;
    @JsonProperty("reprint")
    public boolean reprint;
    @JsonProperty("variation")
    public boolean variation;
    @JsonProperty("set_id")
    public String set_id;
    @JsonProperty("set")
    public String set;
    @JsonProperty("set_name")
    public String set_name;
    @JsonProperty("set_type")
    public String set_type;
    @JsonProperty("set_uri")
    public String set_uri;
    @JsonProperty("set_search_uri")
    public String set_search_uri;
    @JsonProperty("scryfall_set_uri")
    public String scryfall_set_uri;
    @JsonProperty("rulings_uri")
    public String rulings_uri;
    @JsonProperty("prints_search_uri")
    public String prints_search_uri;
    @JsonProperty("collector_number")
    public String collector_number;
    public boolean digital;
    public String rarity;
    @JsonProperty("flavor_text")
    public String flavor_text;
    @JsonProperty("card_back_id")
    public String card_back_id;

    public String artist;
    @JsonProperty("artist_ids")
    @Column(columnDefinition = "text[]")
    @Type(type = "be.thomasmore.moremagic.domain.mapping.CustomStringArrayType")
    public String[] artist_ids;
    @JsonProperty("illustration_id")
    public String illustration_id;
    @JsonProperty("border_color")
    public String border_color;
    public String frame;
    @JsonProperty("full_art")
    public boolean full_art;
    @JsonProperty("textless")
    public boolean textless;
    public boolean booster;
    @JsonProperty("story_spotlight")
    public boolean story_spotlight;
    public int edhrec_rank;
    public int penny_rank;
    public String prices_usd;
    public String prices_usd_foil;
    public String prices_usd_etched;
    public String prices_eur;
    public String prices_eur_foil;
    public String prices_tix;
    public String related_uris_gatherer;
    public String related_uris_tcgplayer_infinite_articles;
    public String related_uris_tcgplayer_infinite_decks;
    public String related_uris_edhrec;
    public String purchase_uris_tcgplayer;
    public String purchase_uris_cardmarket;
    public String purchase_uris_cardhoarder;

    @SuppressWarnings("unchecked")
    @JsonProperty("image_uris")
    private void unpackNestedImageUris(Map<String, Object> imageUris){
        this.setImage_uris_small((String)imageUris.get("small"));
        this.setImage_uris_large((String)imageUris.get("large"));
        this.setImage_uris_normal((String)imageUris.get("normal"));
        this.setImage_uris_png((String)imageUris.get("png"));
        this.setImage_uris_art_crop((String)imageUris.get("art_crop"));
        this.setImage_uris_border_crop((String)imageUris.get("border_crop"));
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("legalities")
    private void unpackNestedLegalities(Map<String, Object> legalities){
        this.setLegalities_alchemy((String)legalities.get("alchemy"));
        this.setLegalities_brawl((String)legalities.get("brawl"));
        this.setLegalities_commander((String)legalities.get("commander"));
        this.setLegalities_duel((String)legalities.get("duel"));
        this.setLegalities_explorer((String)legalities.get("explorer"));
        this.setLegalities_future((String)legalities.get("future"));
        this.setLegalities_gladiator((String)legalities.get("gladiator"));
        this.setLegalities_historic((String)legalities.get("historic"));
        this.setLegalities_historicbrawl((String)legalities.get("historicbrawl"));
        this.setLegalities_legacy((String)legalities.get("legacy"));
        this.setLegalities_modern((String)legalities.get("modern"));
        this.setLegalities_oathbreaker((String)legalities.get("oathbreaker"));
        this.setLegalities_oldschool((String)legalities.get("oldschool"));
        this.setLegalities_pauper((String)legalities.get("pauper"));
        this.setLegalities_paupercommander((String)legalities.get("paupercommander"));
        this.setLegalities_penny((String)legalities.get("penny"));
        this.setLegalities_pioneer((String)legalities.get("pioneer"));
        this.setLegalities_predh((String)legalities.get("predh"));
        this.setLegalities_premodern((String)legalities.get("premodern"));
        this.setLegalities_standard((String)legalities.get("standard"));
        this.setLegalities_vintage((String)legalities.get("vintage"));
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("prices")
    private void unpackNestedPrices(Map<String, Object> prices){
        this.setPrices_usd((String)prices.get("usd"));
        this.setPrices_usd_foil((String)prices.get("usd_foil"));
        this.setPrices_usd_etched((String)prices.get("usd_etched"));
        this.setPrices_eur((String)prices.get("eur"));
        this.setPrices_eur_foil((String)prices.get("eur_foil"));
        this.setPrices_tix((String)prices.get("tix"));
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("related_uris")
    private void unpackNestedRelatedUris(Map<String, Object> relatedUris){
        this.setRelated_uris_gatherer((String)relatedUris.get("gatherer"));
        this.setRelated_uris_edhrec((String)relatedUris.get("edhrec"));
        this.setRelated_uris_tcgplayer_infinite_decks((String)relatedUris.get("tcgplayer_infinite_decks"));
        this.setRelated_uris_tcgplayer_infinite_articles((String)relatedUris.get("tcgplayer_infinite_articles"));
    }

    @SuppressWarnings("unchecked")
    @JsonProperty("purchase_uris")
    private void unpackNestedPurchaseUris(Map<String, Object> purchaseUris){
        this.setPurchase_uris_tcgplayer((String)purchaseUris.get("tcgplayer"));
        this.setPurchase_uris_cardhoarder((String)purchaseUris.get("cardhoarder"));
        this.setPurchase_uris_cardmarket((String)purchaseUris.get("cardmarket"));
    }


    public ScryfallCard() {
    }
    public static ScryfallCard fromJson(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, ScryfallCard.class);
    }

    public Integer getOwn_id() {
        return own_id;
    }

    public void setOwn_id(Integer own_id) {
        this.own_id = own_id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOracle_id() {
        return oracle_id;
    }

    public void setOracle_id(String oracle_id) {
        this.oracle_id = oracle_id;
    }

    public Integer[] getMultiverse_ids() {
        return multiverse_ids;
    }

    public void setMultiverse_ids(Integer[] multiverse_ids) {
        this.multiverse_ids = multiverse_ids;
    }

    public int getMtgo_id() {
        return mtgo_id;
    }

    public void setMtgo_id(int mtgo_id) {
        this.mtgo_id = mtgo_id;
    }

    public int getMtgo_foil_id() {
        return mtgo_foil_id;
    }

    public void setMtgo_foil_id(int mtgo_foil_id) {
        this.mtgo_foil_id = mtgo_foil_id;
    }

    public int getTcgplayer_id() {
        return tcgplayer_id;
    }

    public void setTcgplayer_id(int tcgplayer_id) {
        this.tcgplayer_id = tcgplayer_id;
    }

    public int getCardmarket_id() {
        return cardmarket_id;
    }

    public void setCardmarket_id(int cardmarket_id) {
        this.cardmarket_id = cardmarket_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Date getReleased_at() {
        return released_at;
    }

    public void setReleased_at(Date released_at) {
        this.released_at = released_at;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getScryfall_uri() {
        return scryfall_uri;
    }

    public void setScryfall_uri(String scryfall_uri) {
        this.scryfall_uri = scryfall_uri;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public boolean isHighres_image() {
        return highres_image;
    }

    public void setHighres_image(boolean highres_image) {
        this.highres_image = highres_image;
    }

    public String getImage_status() {
        return image_status;
    }

    public void setImage_status(String image_status) {
        this.image_status = image_status;
    }

    public String getImage_uris_small() {
        return image_uris_small;
    }

    public void setImage_uris_small(String image_uris_small) {
        this.image_uris_small = image_uris_small;
    }

    public String getImage_uris_normal() {
        return image_uris_normal;
    }

    public void setImage_uris_normal(String image_uris_normal) {
        this.image_uris_normal = image_uris_normal;
    }

    public String getImage_uris_large() {
        return image_uris_large;
    }

    public void setImage_uris_large(String image_uris_large) {
        this.image_uris_large = image_uris_large;
    }

    public String getImage_uris_png() {
        return image_uris_png;
    }

    public void setImage_uris_png(String image_uris_png) {
        this.image_uris_png = image_uris_png;
    }

    public String getImage_uris_art_crop() {
        return image_uris_art_crop;
    }

    public void setImage_uris_art_crop(String image_uris_art_crop) {
        this.image_uris_art_crop = image_uris_art_crop;
    }

    public String getImage_uris_border_crop() {
        return image_uris_border_crop;
    }

    public void setImage_uris_border_crop(String image_uris_border_crop) {
        this.image_uris_border_crop = image_uris_border_crop;
    }

    public String getMana_cost() {
        return mana_cost;
    }

    public void setMana_cost(String mana_cost) {
        this.mana_cost = mana_cost;
    }

    public double getCmc() {
        return cmc;
    }

    public void setCmc(double cmc) {
        this.cmc = cmc;
    }

    public String getType_line() {
        return type_line;
    }

    public void setType_line(String type_line) {
        this.type_line = type_line;
    }

    public String getOracle_text() {
        return oracle_text;
    }

    public void setOracle_text(String oracle_text) {
        this.oracle_text = oracle_text;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String[] getColor_identity() {
        return color_identity;
    }

    public void setColor_identity(String[] color_identity) {
        this.color_identity = color_identity;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public String getLegalities_standard() {
        return legalities_standard;
    }

    public void setLegalities_standard(String legalities_standard) {
        this.legalities_standard = legalities_standard;
    }

    public String getLegalities_future() {
        return legalities_future;
    }

    public void setLegalities_future(String legalities_future) {
        this.legalities_future = legalities_future;
    }

    public String getLegalities_historic() {
        return legalities_historic;
    }

    public void setLegalities_historic(String legalities_historic) {
        this.legalities_historic = legalities_historic;
    }

    public String getLegalities_gladiator() {
        return legalities_gladiator;
    }

    public void setLegalities_gladiator(String legalities_gladiator) {
        this.legalities_gladiator = legalities_gladiator;
    }

    public String getLegalities_pioneer() {
        return legalities_pioneer;
    }

    public void setLegalities_pioneer(String legalities_pioneer) {
        this.legalities_pioneer = legalities_pioneer;
    }

    public String getLegalities_explorer() {
        return legalities_explorer;
    }

    public void setLegalities_explorer(String legalities_explorer) {
        this.legalities_explorer = legalities_explorer;
    }

    public String getLegalities_modern() {
        return legalities_modern;
    }

    public void setLegalities_modern(String legalities_modern) {
        this.legalities_modern = legalities_modern;
    }

    public String getLegalities_legacy() {
        return legalities_legacy;
    }

    public void setLegalities_legacy(String legalities_legacy) {
        this.legalities_legacy = legalities_legacy;
    }

    public String getLegalities_pauper() {
        return legalities_pauper;
    }

    public void setLegalities_pauper(String legalities_pauper) {
        this.legalities_pauper = legalities_pauper;
    }

    public String getLegalities_vintage() {
        return legalities_vintage;
    }

    public void setLegalities_vintage(String legalities_vintage) {
        this.legalities_vintage = legalities_vintage;
    }

    public String getLegalities_penny() {
        return legalities_penny;
    }

    public void setLegalities_penny(String legalities_penny) {
        this.legalities_penny = legalities_penny;
    }

    public String getLegalities_commander() {
        return legalities_commander;
    }

    public void setLegalities_commander(String legalities_commander) {
        this.legalities_commander = legalities_commander;
    }

    public String getLegalities_oathbreaker() {
        return legalities_oathbreaker;
    }

    public void setLegalities_oathbreaker(String legalities_oathbreaker) {
        this.legalities_oathbreaker = legalities_oathbreaker;
    }

    public String getLegalities_brawl() {
        return legalities_brawl;
    }

    public void setLegalities_brawl(String legalities_brawl) {
        this.legalities_brawl = legalities_brawl;
    }

    public String getLegalities_historicbrawl() {
        return legalities_historicbrawl;
    }

    public void setLegalities_historicbrawl(String legalities_historicbrawl) {
        this.legalities_historicbrawl = legalities_historicbrawl;
    }

    public String getLegalities_alchemy() {
        return legalities_alchemy;
    }

    public void setLegalities_alchemy(String legalities_alchemy) {
        this.legalities_alchemy = legalities_alchemy;
    }

    public String getLegalities_paupercommander() {
        return legalities_paupercommander;
    }

    public void setLegalities_paupercommander(String legalities_paupercommander) {
        this.legalities_paupercommander = legalities_paupercommander;
    }

    public String getLegalities_duel() {
        return legalities_duel;
    }

    public void setLegalities_duel(String legalities_duel) {
        this.legalities_duel = legalities_duel;
    }

    public String getLegalities_oldschool() {
        return legalities_oldschool;
    }

    public void setLegalities_oldschool(String legalities_oldschool) {
        this.legalities_oldschool = legalities_oldschool;
    }

    public String getLegalities_premodern() {
        return legalities_premodern;
    }

    public void setLegalities_premodern(String legalities_premodern) {
        this.legalities_premodern = legalities_premodern;
    }

    public String getLegalities_predh() {
        return legalities_predh;
    }

    public void setLegalities_predh(String legalities_predh) {
        this.legalities_predh = legalities_predh;
    }

    public String[] getGames() {
        return games;
    }

    public void setGames(String[] games) {
        this.games = games;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isFoil() {
        return foil;
    }

    public void setFoil(boolean foil) {
        this.foil = foil;
    }

    public boolean isNonfoil() {
        return nonfoil;
    }

    public void setNonfoil(boolean nonfoil) {
        this.nonfoil = nonfoil;
    }

    public String[] getFinishes() {
        return finishes;
    }

    public void setFinishes(String[] finishes) {
        this.finishes = finishes;
    }

    public boolean isOversized() {
        return oversized;
    }

    public void setOversized(boolean oversized) {
        this.oversized = oversized;
    }

    public boolean isPromo() {
        return promo;
    }

    public void setPromo(boolean promo) {
        this.promo = promo;
    }

    public boolean isReprint() {
        return reprint;
    }

    public void setReprint(boolean reprint) {
        this.reprint = reprint;
    }

    public boolean isVariation() {
        return variation;
    }

    public void setVariation(boolean variation) {
        this.variation = variation;
    }

    public String getSet_id() {
        return set_id;
    }

    public void setSet_id(String set_id) {
        this.set_id = set_id;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getSet_name() {
        return set_name;
    }

    public void setSet_name(String set_name) {
        this.set_name = set_name;
    }

    public String getSet_type() {
        return set_type;
    }

    public void setSet_type(String set_type) {
        this.set_type = set_type;
    }

    public String getSet_uri() {
        return set_uri;
    }

    public void setSet_uri(String set_uri) {
        this.set_uri = set_uri;
    }

    public String getSet_search_uri() {
        return set_search_uri;
    }

    public void setSet_search_uri(String set_search_uri) {
        this.set_search_uri = set_search_uri;
    }

    public String getScryfall_set_uri() {
        return scryfall_set_uri;
    }

    public void setScryfall_set_uri(String scryfall_set_uri) {
        this.scryfall_set_uri = scryfall_set_uri;
    }

    public String getRulings_uri() {
        return rulings_uri;
    }

    public void setRulings_uri(String rulings_uri) {
        this.rulings_uri = rulings_uri;
    }

    public String getPrints_search_uri() {
        return prints_search_uri;
    }

    public void setPrints_search_uri(String prints_search_uri) {
        this.prints_search_uri = prints_search_uri;
    }

    public String getCollector_number() {
        return collector_number;
    }

    public void setCollector_number(String collector_number) {
        this.collector_number = collector_number;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getFlavor_text() {
        return flavor_text;
    }

    public void setFlavor_text(String flavor_text) {
        this.flavor_text = flavor_text;
    }

    public String getCard_back_id() {
        return card_back_id;
    }

    public void setCard_back_id(String card_back_id) {
        this.card_back_id = card_back_id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String[] getArtist_ids() {
        return artist_ids;
    }

    public void setArtist_ids(String[] artist_ids) {
        this.artist_ids = artist_ids;
    }

    public String getIllustration_id() {
        return illustration_id;
    }

    public void setIllustration_id(String illustration_id) {
        this.illustration_id = illustration_id;
    }

    public String getBorder_color() {
        return border_color;
    }

    public void setBorder_color(String border_color) {
        this.border_color = border_color;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public boolean isFull_art() {
        return full_art;
    }

    public void setFull_art(boolean full_art) {
        this.full_art = full_art;
    }

    public boolean isTextless() {
        return textless;
    }

    public void setTextless(boolean textless) {
        this.textless = textless;
    }

    public boolean isBooster() {
        return booster;
    }

    public void setBooster(boolean booster) {
        this.booster = booster;
    }

    public boolean isStory_spotlight() {
        return story_spotlight;
    }

    public void setStory_spotlight(boolean story_spotlight) {
        this.story_spotlight = story_spotlight;
    }

    public int getEdhrec_rank() {
        return edhrec_rank;
    }

    public void setEdhrec_rank(int edhrec_rank) {
        this.edhrec_rank = edhrec_rank;
    }

    public int getPenny_rank() {
        return penny_rank;
    }

    public void setPenny_rank(int penny_rank) {
        this.penny_rank = penny_rank;
    }

    public String getPrices_usd() {
        return prices_usd;
    }

    public void setPrices_usd(String prices_usd) {
        this.prices_usd = prices_usd;
    }

    public String getPrices_usd_foil() {
        return prices_usd_foil;
    }

    public void setPrices_usd_foil(String prices_usd_foil) {
        this.prices_usd_foil = prices_usd_foil;
    }

    public String getPrices_usd_etched() {
        return prices_usd_etched;
    }

    public void setPrices_usd_etched(String prices_usd_etched) {
        this.prices_usd_etched = prices_usd_etched;
    }

    public String getPrices_eur() {
        return prices_eur;
    }

    public void setPrices_eur(String prices_eur) {
        this.prices_eur = prices_eur;
    }

    public String getPrices_eur_foil() {
        return prices_eur_foil;
    }

    public void setPrices_eur_foil(String prices_eur_foil) {
        this.prices_eur_foil = prices_eur_foil;
    }

    public String getPrices_tix() {
        return prices_tix;
    }

    public void setPrices_tix(String prices_tix) {
        this.prices_tix = prices_tix;
    }

    public String getRelated_uris_gatherer() {
        return related_uris_gatherer;
    }

    public void setRelated_uris_gatherer(String related_uris_gatherer) {
        this.related_uris_gatherer = related_uris_gatherer;
    }

    public String getRelated_uris_tcgplayer_infinite_articles() {
        return related_uris_tcgplayer_infinite_articles;
    }

    public void setRelated_uris_tcgplayer_infinite_articles(String related_uris_tcgplayer_infinite_articles) {
        this.related_uris_tcgplayer_infinite_articles = related_uris_tcgplayer_infinite_articles;
    }

    public String getRelated_uris_tcgplayer_infinite_decks() {
        return related_uris_tcgplayer_infinite_decks;
    }

    public void setRelated_uris_tcgplayer_infinite_decks(String related_uris_tcgplayer_infinite_decks) {
        this.related_uris_tcgplayer_infinite_decks = related_uris_tcgplayer_infinite_decks;
    }

    public String getRelated_uris_edhrec() {
        return related_uris_edhrec;
    }

    public void setRelated_uris_edhrec(String related_uris_edhrec) {
        this.related_uris_edhrec = related_uris_edhrec;
    }

    public String getPurchase_uris_tcgplayer() {
        return purchase_uris_tcgplayer;
    }

    public void setPurchase_uris_tcgplayer(String purchase_uris_tcgplayer) {
        this.purchase_uris_tcgplayer = purchase_uris_tcgplayer;
    }

    public String getPurchase_uris_cardmarket() {
        return purchase_uris_cardmarket;
    }

    public void setPurchase_uris_cardmarket(String purchase_uris_cardmarket) {
        this.purchase_uris_cardmarket = purchase_uris_cardmarket;
    }

    public String getPurchase_uris_cardhoarder() {
        return purchase_uris_cardhoarder;
    }

    public void setPurchase_uris_cardhoarder(String purchase_uris_cardhoarder) {
        this.purchase_uris_cardhoarder = purchase_uris_cardhoarder;
    }
}
