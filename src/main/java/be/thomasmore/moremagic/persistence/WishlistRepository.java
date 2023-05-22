package be.thomasmore.moremagic.persistence;

import be.thomasmore.moremagic.domain.Deck;
import be.thomasmore.moremagic.domain.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {
    // Access properties in query by putting a ? and after the question mark the number of the property.
    // Spring Data will pass method parameters to the query in the same order they appear in the method declaration:
    @Query(value="SELECT * FROM wishlist w WHERE wishlist.wishlist_name = ?1", nativeQuery = true)
    List<Wishlist> FindByName(String name);

    @Query(value = "SELECT * FROM wishlist w WHERE w.created_by = ?1", nativeQuery = true)
    List<Wishlist> FindByUserEmail(String userEmail);
}

