package com.example.mailbox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MailTest {

    Mail mail, outMail, inMail;
    String username;

    @Before
    public void setUp(){
        username = "mockUser";
        mail = new Mail("sender", "receiver", "title", "content", Mail.Status.unread);
        outMail = new Mail(username, "receiver", "title", "content", Mail.Status.unread);
        inMail = new Mail("sender", username, "title", "content", Mail.Status.unread);
    }

    @Test
    public void testDetails(){
        assertEquals("sender", mail.getSender());
        assertEquals("receiver", mail.getReceiver());
        assertEquals("title", mail.getTitle());
        assertEquals("content", mail.getContent());
        assertEquals(Mail.Status.unread, mail.getStatus());
        assertNotEquals(Mail.Status.archived, mail.getStatus());
    }

    @Test
    public void testDirection(){
        assertEquals(Mail.Direction.outgoing, outMail.getDirection(username));
        assertEquals(Mail.Direction.incoming, inMail.getDirection(username));
    }

    @After
    public void tearDown(){
        mail = null;
    }
}
