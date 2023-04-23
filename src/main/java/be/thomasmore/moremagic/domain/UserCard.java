package be.thomasmore.moremagic.domain;

import an.awesome.pipelinr.repack.org.checkerframework.checker.units.qual.C;

import javax.persistence.*;

@Entity
@Table(name="UserCards")
public class UserCard {
    @Id
    @GeneratedValue
    @Column(name="UserCardId", nullable = false)
    private Integer id;

    @Column(name = "CollectionId")
    private Integer collectionId;

    @Column(name = "OracleId")
    private Integer oracleId;

    @Column (name = "Amount")
    private Integer amount;

    @Column (name = "UserCardset")
    private String cardSet;

    @Column (name = "UserCardNumber")
    private String cardnumber;

    @Column (name = "UserCardName")
    private String name;

    @Column (name = "UserCardType")
    private String cardType;

    @Column (name = "UserCardManaCost")
    private String cmc;

    @Column (name = "UserCardRarity")
    private String rarity;

    @Column (name = "UserCardLanguage")
    private String language;

    public UserCard(Integer id, Integer collectionId, Integer oracleId, Integer amount, String cardSet, String cardnumber, String name, String cardType, String cmc, String rarity, String language) {
        this.id = id;
        this.collectionId = collectionId;
        this.oracleId = oracleId;
        this.amount = amount;
        this.cardSet = cardSet;
        this.cardnumber = cardnumber;
        this.name = name;
        this.cardType = cardType;
        this.cmc = cmc;
        this.rarity = rarity;
        this.language = language;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getOracleId() {
        return oracleId;
    }

    public void setOracleId(Integer oracleId) {
        this.oracleId = oracleId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCardSet() {
        return cardSet;
    }

    public void setCardSet(String cardSet) {
        this.cardSet = cardSet;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCmc() {
        return cmc;
    }

    public void setCmc(String cmc) {
        this.cmc = cmc;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}


