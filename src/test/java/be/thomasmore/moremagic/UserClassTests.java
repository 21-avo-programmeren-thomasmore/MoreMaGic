package be.thomasmore.moremagic;

import be.thomasmore.moremagic.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserClassTests {
    @Test
    void canCreateUser() {
        User user = new User("test", "testLastName", "email", "password");
        assertEquals(user.getFirstName(),"test");
        assertEquals(user.getLastName(), "testLastName");
        assertEquals(user.getEmail(), "email");
        assertEquals(user.getPassword(), "password");
    }

    @Test
    void canEditUser(){
        User user = new User("test", "testLastName", "email", "password");
        user.editUser("newFirstName", "newLastName");
        assertEquals(user.getFirstName(), "newFirstName");
        assertEquals(user.getLastName(), "newLastName");
    }

}



