package be.thomasmore.moremagic.domain;

public class UserCard {
    public String name;
    public String magicSetName;
    public String manaCost;
    public String ype;
    public String rarity;
    public String language;
    public String artistName;
    //public float price;

    public UserCard(String name, String magicSetName, String manaCost, String ype, String rarity, String language, String artistName) {
        this.name = name;
        this.magicSetName = magicSetName;
        this.manaCost = manaCost;
        this.ype = ype;
        this.rarity = rarity;
        this.language = language;
        this.artistName = artistName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMagicSetName() {
        return magicSetName;
    }

    public void setMagicSetName(String magicSetName) {
        this.magicSetName = magicSetName;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getYpe() {
        return ype;
    }

    public void setYpe(String ype) {
        this.ype = ype;
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

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
