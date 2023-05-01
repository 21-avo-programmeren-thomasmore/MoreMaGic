package be.thomasmore.moremagic.persistence;

import be.thomasmore.moremagic.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Access properties in query by putting a ? and after the question mark the number of the property.
    // Spring Data will pass method parameters to the query in the same order they appear in the method declaration:
    @Query(value="SELECT * FROM users u WHERE u.name = ?1", nativeQuery = true)
    List<User> FindByName(String name);

    Optional<User> findByEmail(String email);
}
