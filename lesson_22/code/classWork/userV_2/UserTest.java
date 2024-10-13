package classWork.userV_2;

import classWork.userV_1.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    classWork.userV_1.User user;

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
    void testValidPassword() {
        assertEquals("123456Az!", user.getPassword());


    }

    @Test
    void setXxxPassword(){

    }

}// end of class