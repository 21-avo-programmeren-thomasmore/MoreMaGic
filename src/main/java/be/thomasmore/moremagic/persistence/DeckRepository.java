package be.thomasmore.moremagic.persistence;

import be.thomasmore.moremagic.domain.Collection;
import be.thomasmore.moremagic.domain.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Integer> {
    // Access properties in query by putting a ? and after the question mark the number of the property.
    // Spring Data will pass method parameters to the query in the same order they appear in the method declaration:
    @Query(value="SELECT * FROM deck d WHERE deck.deck_name = ?1", nativeQuery = true)
    List<Deck> FindByName(String name);

    @Query(value = "SELECT * FROM deck d WHERE d.created_by = ?1", nativeQuery = true)
    List<Deck> FindByUserEmail(String userEmail);
}
