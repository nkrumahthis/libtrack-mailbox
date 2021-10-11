package com.example.mailbox;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MailControllerTest {
    Mail mail;
    

    @Before
    public void setUp(){
        mail = new Mail("mock", "fitz", "hello", "Lorem ipsum dolor est", Mail.Status.unread);
    }

    @Test
    public void testRead(){
        MailController.read(mail);
        assertEquals(Mail.Status.read, mail.status);
    }

    @Test
    public void testUnread(){
        MailController.unread(mail);
        assertEquals(Mail.Status.unread, mail.status);
    }

    @Test
    public void testArchive(){
        MailController.archive(mail);
        assertEquals(Mail.Status.archived, mail.status);
    }

    @Test
    public void testDelete(){
        MailController.delete(mail);
        assertEquals(Mail.Status.deleted, mail.status);
    }

    @After
    public void tearDown(){
        mail = null;
    }
    
}
