package be.thomasmore.moremagic.persistence;

import be.thomasmore.moremagic.domain.UserCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserCardRepository extends JpaRepository <UserCard,Integer> {

    @Query(value="SELECT * FROM UserCard uc WHERE uc.oracleId = ?3 AND uc.collectionID = ?2", nativeQuery = true)
    ArrayList<UserCard> findUserCard(String oracleID, int collectionId);

}
