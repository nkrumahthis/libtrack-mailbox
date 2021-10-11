package com.example.mailbox;

import java.util.List;

public interface IMailFetcher {
    public List<Mail> fetch(String username);
}
