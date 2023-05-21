package be.thomasmore.moremagic.domain;

import javax.persistence.*;
import java.time.LocalDateTime;


    @Entity
    @Table(name = "wishlist")
    public class Wishlist {
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

        public Wishlist (String collectionName, String description , String userEmail) {
            this.collectionName = collectionName;
            this.description = description;
            this.createdBy = userEmail;
            this.createdOn = LocalDateTime.now();
            this.modifiedOn = LocalDateTime.now();
        }

        public Wishlist() {

        }

        public Integer getCollectionId() {
            return collectionId;
        }

        public void setCollectionId(Integer collectionId) {
            collectionId = collectionId;
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
    }

