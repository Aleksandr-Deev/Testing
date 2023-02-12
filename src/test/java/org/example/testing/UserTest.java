package org.example.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user = new User("login ", "emal@mail.ru");

    @Test
    @DisplayName("When the login and email are passed to the user user," +
            " then the user user returns the correct login and email")
    void getLoginAndEmail() {
        String actualResult = user.getLogin();
        assertEquals("login ", actualResult);
        String actualResult1 = user.getEmail();
        assertEquals("emal@mail.ru", actualResult1);
    }

    @Test
    @DisplayName("When empty login and email fields are passed to user user," +
            " then user user returns empty login and email fields")
    void getEmptyLoginAndEmail() {
        User user = new User("", "");
        String actualResult = user.getLogin();
        assertEquals("", actualResult);
        String actualResult1 = user.getEmail();
        assertEquals("", actualResult1);
    }

    @Test
    @DisplayName("When the @ and dot are passed to the user in the email address," +
            " then the user returns the correct email address")
    void getCorrectEmail() {
        String actualResult = user.getEmail();
        if (!actualResult.contains("@") && !actualResult.contains(".")) {
            throw new DivisionByZeroException();
        }
        assertEquals("emal@mail.ru", actualResult);
    }

    @Test
    @DisplayName("When the login and email are sent to the user," +
            " then the user returns the login and email that do not match each other")
    void getLoginEqualsEmail() {
        String actualResult = user.getLogin();
        String actualResult1 = user.getEmail();
        if (actualResult.equals(actualResult1)) {
            throw new DivisionByZeroException();
        }
        assertEquals("login ", actualResult);
        assertEquals("emal@mail.ru", actualResult1);
    }
}