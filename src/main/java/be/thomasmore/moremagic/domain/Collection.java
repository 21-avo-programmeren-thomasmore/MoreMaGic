package be.thomasmore.moremagic.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Collection")
public class Collection {
    @Id
    @GeneratedValue
    @Column(name = "CollectionId", nullable = false)
    private Integer collectionId;
    @Column(name = "CollectionName")
    private String collectionName;
    @Column(name = "CreatedBy")
    private String createdBy;
    @Column(name = "CreatedOn")
    private LocalDateTime createdOn;
    @Column(name = "ModifiedOn")
    private LocalDateTime modifiedOn;
    @Column(name = "Description")
    private String description;
    @Column(name = "CollectionStoragePlace")
    private String collectionStoragePlace;
    @Column(name = "CollectionDeckId")
    private Integer collectionDeckId;

    public Collection (String collectionName, String description) {
        this.collectionName = collectionName;
        this.description = description;
    }

    public Collection() {

    }

    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(LocalDateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCollectionDeckId() {
        return collectionDeckId;
    }

    public void setCollectionDeckId(Integer collectionDeckId) {
        this.collectionDeckId = collectionDeckId;
    }

    public String getCollectionStoragePlace() {
        return collectionStoragePlace;
    }

    public void setCollectionStoragePlace(String collectionStoragePlace) {
        this.collectionStoragePlace = collectionStoragePlace;
    }
}
