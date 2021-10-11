package com.example.mailbox;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class MailFetcherTest {

    Mail mail;

    @Before
    public void setUp(){
        mail = new Mail("mockUser", "fitz", "hello", "Lorem ipsum dolor est", Mail.Status.unread);
    }

    /**
     * 
     */
    @Test
    public void testFetch()
    {
        MockMailFetcher mailFetcher = new MockMailFetcher();

        List<Mail> mails = mailFetcher.fetch("mockUser");

        Mail mail1 = mails.get(0);
        
        assertEquals(mail.getSender(), mail1.getSender());
        assertEquals(mail.getReceiver(), mail1.getReceiver());
        assertEquals(mail.getTitle(), mail1.getTitle());
        assertEquals(mail.getContent(), mail1.getContent());
        assertEquals(mail.getStatus(), mail1.getStatus());
    }
    
}
