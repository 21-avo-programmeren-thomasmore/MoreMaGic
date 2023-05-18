package be.thomasmore.moremagic.persistence;

import be.thomasmore.moremagic.domain.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Integer> {
    // Access properties in query by putting a ? and after the question mark the number of the property.
    // Spring Data will pass method parameters to the query in the same order they appear in the method declaration:
    @Query(value="SELECT * FROM collection c WHERE collection.colleciton_name = ?1", nativeQuery = true)
    List<Collection> FindByName(String name);

    @Query(value = "SELECT * FROM collection c WHERE c.created_by = ?1", nativeQuery = true)
    List<Collection> FindByUserEmail(String userEmail);
}
