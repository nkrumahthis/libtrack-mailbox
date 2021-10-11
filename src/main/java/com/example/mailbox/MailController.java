package com.example.mailbox;

import com.example.mailbox.Mail.Status;

public class MailController {

    public static void read(Mail mail){
        mail.setStatus(Status.read);;
    }

    public static void unread(Mail mail){
        mail.setStatus(Status.unread);

    }

    public static void archive(Mail mail){
        mail.setStatus(Status.archived);
    }

    public static void delete(Mail mail){
        mail.setStatus(Status.deleted);
        
    }

}
