package com.example.mailbox;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testLogin() {
        App app = new App();

        String mockUsername = "emma";
        app.setUsername(mockUsername);
        assertEquals(mockUsername, app.getUsername());
    }

}
