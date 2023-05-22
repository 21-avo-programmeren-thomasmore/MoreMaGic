package be.thomasmore.moremagic.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Collection")
public class Collection {
    @Id
    @GeneratedValue
    @Column(name = "collection_id", nullable = false)
    private Integer collectionId;
    @Column(name = "collection_name")
    private String collectionName;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_on")
    private LocalDateTime createdOn;
    @Column(name = "modified_on")
    private LocalDateTime modifiedOn;
    @Column(name = "description")
    private String description;
    @Column(name = "collection_storage_place")
    private String collectionStoragePlace;
    @Column(name = "collection_deck_id")
    private Integer collectionDeckId;

    public Collection (String collectionName, String description, String createdBy) {
        this.collectionName = collectionName;
        this.description = description;
        this.createdBy = createdBy;
        this.createdOn = LocalDateTime.now();
        this.modifiedOn = LocalDateTime.now();
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
