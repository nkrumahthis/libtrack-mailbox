package com.example.mailbox;

import java.util.ArrayList;
import java.util.List;

public class MockMailFetcher implements IMailFetcher{

    @Override
    public List<Mail> fetch(String username) {
        List<Mail> mails = new ArrayList<Mail>();

        mails.add(new Mail(username, "fitz", "hello", "Lorem ipsum dolor est", Mail.Status.unread));
        mails.add(new Mail(username, "fitz", "hello", "Lorem ipsum dolor est", Mail.Status.unread));

        return mails;
    }

    
}
