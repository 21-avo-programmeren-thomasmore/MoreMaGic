package be.thomasmore.moremagic.persistence;

import be.thomasmore.moremagic.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

    @Query(value="SELECT * FROM card c WHERE c.oracle_id = ?1", nativeQuery = true)
    List<Card> FindByCardId(Integer cardId);

    @Query(value="SELECT * FROM card c WHERE c.collection_id = ?1", nativeQuery = true)
    List<Card> FindByCollectionId(Integer collectionId);

    @Query(value="SELECT * FROM card c WHERE c.wishlist_id = ?1", nativeQuery = true)
    List<Card> FindByWishlistId(Integer wishlistId);

    @Query(value="SELECT * FROM card c WHERE c.deck_id = ?1", nativeQuery = true)
    List<Card> FindByDeckId(Integer deckId);
}
