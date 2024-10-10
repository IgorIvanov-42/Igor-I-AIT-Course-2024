package classWork.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;

    final String email = "peter@mail.de";// ideal email
    final String password = "123456Az!";// ideal password

    @BeforeEach
    void setUp() {
        user = new User(email, password);// create new "fresh" object user
    }

    @Test
    void testValidEmail(){
    user.setEmail(email);
    assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailNotAt() {
        String email = "petermail.de";// wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());// email didn't change
    }

    @Test
    void setEmailNotDot(){
        String email = "peter@mailde";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }
    @Test
    void setEmail(){
        String email = "peter@mail.";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailUnd(){
        String email = "peter_@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setEmailDig(){
        String email = "peter2024@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

    @Test
    void setPassword() {

    }
}