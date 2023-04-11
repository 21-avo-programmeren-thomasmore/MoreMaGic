package be.thomasmore.moremagic.persistence;

import be.thomasmore.moremagic.domain.Card;
import be.thomasmore.moremagic.domain.ScryfallCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScryfallCardRepository extends JpaRepository<ScryfallCard, String> {
    @Query(value="SELECT * FROM users u WHERE u.letter = ?1", nativeQuery = true) //change to api call for scryfall
    List<Card> findIfContains(String letter);
}
