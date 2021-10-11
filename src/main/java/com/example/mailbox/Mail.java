package com.example.mailbox;

public class Mail {

    private String sender;
    private String receiver;
    private String title;
    private String content;
    public Status status;

    // ctor

    public Mail(String sender, String receiver, String title, String content, Mail.Status status) {
        this.sender = sender;
        this.receiver = receiver;
        this.title = title;
        this.content = content;
        this.status = status;
    }

    public enum Status{
        read,
        unread,
        archived,
        deleted
    }

    public enum Direction{
        incoming,
        outgoing
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Direction getDirection(String username){
        if(this.sender == username) return Direction.outgoing;
        else if (this.receiver == username) return Direction.incoming;
        else return null; // decide on state (draft????)
    }
    
}
