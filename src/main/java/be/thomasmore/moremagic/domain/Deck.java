package be.thomasmore.moremagic.domain;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "Deck")
public class Deck {
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

    public Deck (String collectionName, String description) {
        this.collectionName = collectionName;
        this.description = description;
    }

    public Deck() {

    }
}


