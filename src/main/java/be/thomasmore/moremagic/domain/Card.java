package be.thomasmore.moremagic.domain;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Card {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "scryfall_id")
    private String scryfallId;
    @Column(name = "oracle_id")

    private String oracleId;
    private String name;
    private String language;
    private String layout;
    @Column(name = "mana_cost")

    private String manaCost;
    private double cmc;
    @Column(name = "type_line")

    private String typeLine;
    @Column(name = "oracle_text")

    private String oracleText;
    @Column(columnDefinition = "text[]")
    @Type(type = "be.thomasmore.moremagic.domain.mapping.CustomStringArrayType")
    private String[] colors;
    @Column(columnDefinition = "text[]")
    @Type(type = "be.thomasmore.moremagic.domain.mapping.CustomStringArrayType")
    private String[] keywords;
    private Boolean legalities_standard;
    private Boolean legalities_future;
    private Boolean legalities_historic;
    private Boolean legalities_gladiator;
    private Boolean legalities_pioneer;
    private Boolean legalities_explorer;
    private Boolean legalities_modern;
    private Boolean legalities_legacy;
    private Boolean legalities_pauper;
    private Boolean legalities_vintage;
    private Boolean legalities_penny;
    private Boolean legalities_commander;
    private Boolean legalities_oathbreaker;
    private Boolean legalities_brawl;
    private Boolean legalities_historicbrawl;
    private Boolean legalities_alchemy;
    private Boolean legalities_paupercommander;
    private Boolean legalities_duel;
    private Boolean legalities_oldschool;
    private Boolean legalities_premodern;
    private Boolean legalities_predh;
    private Boolean foil;
    private Boolean reserved;
    private Boolean oversized;
    private Boolean promo;
    private Boolean reprint;
    private Boolean variation;
    @Column(name = "set_id")

    private String setId;
    @Column(name = "set_name")

    private String setName;
    @Column(name = "collector_number")

    private String collectorNumber;
    private String rarity;
    @Column(name = "flavor_text")

    private String flavorText;
    private String artist;
    @Column(name = "border_color")

    private String borderColor;

    public Card() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScryfallId() {
        return scryfallId;
    }

    public void setScryfallId(String scryfallId) {
        this.scryfallId = scryfallId;
    }

    public String getOracleId() {
        return oracleId;
    }

    public void setOracleId(String oracleId) {
        this.oracleId = oracleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public double getCmc() {
        return cmc;
    }

    public void setCmc(double cmc) {
        this.cmc = cmc;
    }

    public String getTypeLine() {
        return typeLine;
    }

    public void setTypeLine(String typeLine) {
        this.typeLine = typeLine;
    }

    public String getOracleText() {
        return oracleText;
    }

    public void setOracleText(String oracleText) {
        this.oracleText = oracleText;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public Boolean getLegalities_standard() {
        return legalities_standard;
    }

    public void setLegalities_standard(Boolean legalities_standard) {
        this.legalities_standard = legalities_standard;
    }

    public Boolean getLegalities_future() {
        return legalities_future;
    }

    public void setLegalities_future(Boolean legalities_future) {
        this.legalities_future = legalities_future;
    }

    public Boolean getLegalities_historic() {
        return legalities_historic;
    }

    public void setLegalities_historic(Boolean legalities_historic) {
        this.legalities_historic = legalities_historic;
    }

    public Boolean getLegalities_gladiator() {
        return legalities_gladiator;
    }

    public void setLegalities_gladiator(Boolean legalities_gladiator) {
        this.legalities_gladiator = legalities_gladiator;
    }

    public Boolean getLegalities_pioneer() {
        return legalities_pioneer;
    }

    public void setLegalities_pioneer(Boolean legalities_pioneer) {
        this.legalities_pioneer = legalities_pioneer;
    }

    public Boolean getLegalities_explorer() {
        return legalities_explorer;
    }

    public void setLegalities_explorer(Boolean legalities_explorer) {
        this.legalities_explorer = legalities_explorer;
    }

    public Boolean getLegalities_modern() {
        return legalities_modern;
    }

    public void setLegalities_modern(Boolean legalities_modern) {
        this.legalities_modern = legalities_modern;
    }

    public Boolean getLegalities_legacy() {
        return legalities_legacy;
    }

    public void setLegalities_legacy(Boolean legalities_legacy) {
        this.legalities_legacy = legalities_legacy;
    }

    public Boolean getLegalities_pauper() {
        return legalities_pauper;
    }

    public void setLegalities_pauper(Boolean legalities_pauper) {
        this.legalities_pauper = legalities_pauper;
    }

    public Boolean getLegalities_vintage() {
        return legalities_vintage;
    }

    public void setLegalities_vintage(Boolean legalities_vintage) {
        this.legalities_vintage = legalities_vintage;
    }

    public Boolean getLegalities_penny() {
        return legalities_penny;
    }

    public void setLegalities_penny(Boolean legalities_penny) {
        this.legalities_penny = legalities_penny;
    }

    public Boolean getLegalities_commander() {
        return legalities_commander;
    }

    public void setLegalities_commander(Boolean legalities_commander) {
        this.legalities_commander = legalities_commander;
    }

    public Boolean getLegalities_oathbreaker() {
        return legalities_oathbreaker;
    }

    public void setLegalities_oathbreaker(Boolean legalities_oathbreaker) {
        this.legalities_oathbreaker = legalities_oathbreaker;
    }

    public Boolean getLegalities_brawl() {
        return legalities_brawl;
    }

    public void setLegalities_brawl(Boolean legalities_brawl) {
        this.legalities_brawl = legalities_brawl;
    }

    public Boolean getLegalities_historicbrawl() {
        return legalities_historicbrawl;
    }

    public void setLegalities_historicbrawl(Boolean legalities_historicbrawl) {
        this.legalities_historicbrawl = legalities_historicbrawl;
    }

    public Boolean getLegalities_alchemy() {
        return legalities_alchemy;
    }

    public void setLegalities_alchemy(Boolean legalities_alchemy) {
        this.legalities_alchemy = legalities_alchemy;
    }

    public Boolean getLegalities_paupercommander() {
        return legalities_paupercommander;
    }

    public void setLegalities_paupercommander(Boolean legalities_paupercommander) {
        this.legalities_paupercommander = legalities_paupercommander;
    }

    public Boolean getLegalities_duel() {
        return legalities_duel;
    }

    public void setLegalities_duel(Boolean legalities_duel) {
        this.legalities_duel = legalities_duel;
    }

    public Boolean getLegalities_oldschool() {
        return legalities_oldschool;
    }

    public void setLegalities_oldschool(Boolean legalities_oldschool) {
        this.legalities_oldschool = legalities_oldschool;
    }

    public Boolean getLegalities_premodern() {
        return legalities_premodern;
    }

    public void setLegalities_premodern(Boolean legalities_premodern) {
        this.legalities_premodern = legalities_premodern;
    }

    public Boolean getLegalities_predh() {
        return legalities_predh;
    }

    public void setLegalities_predh(Boolean legalities_predh) {
        this.legalities_predh = legalities_predh;
    }

    public Boolean getFoil() {
        return foil;
    }

    public void setFoil(Boolean foil) {
        this.foil = foil;
    }

    public Boolean getReserved() {
        return reserved;
    }

    public void setReserved(Boolean reserved) {
        this.reserved = reserved;
    }

    public Boolean getOversized() {
        return oversized;
    }

    public void setOversized(Boolean oversized) {
        this.oversized = oversized;
    }

    public Boolean getPromo() {
        return promo;
    }

    public void setPromo(Boolean promo) {
        this.promo = promo;
    }

    public Boolean getReprint() {
        return reprint;
    }

    public void setReprint(Boolean reprint) {
        this.reprint = reprint;
    }

    public Boolean getVariation() {
        return variation;
    }

    public void setVariation(Boolean variation) {
        this.variation = variation;
    }

    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getCollecterNumber() {
        return collectorNumber;
    }

    public void setCollecterNumber(String collecterNumber) {
        this.collectorNumber = collecterNumber;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
}
