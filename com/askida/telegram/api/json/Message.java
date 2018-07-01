package com.askida.telegram.api.json;

public class Message {

    int message_id;
    int date;

    String text;

    Chat chat;
    User from;

    // GETTERS

    public String getText(){
        return text;
    }

    public int getId(){
        return message_id;
    }

    public int getDate(){
        return date;
    }

    public Chat getChat(){
        return chat;
    }

    public User getFrom(){
        return from;
    }

    // Construcor
    public Message(int message_id, int date, Chat chat, User from, String text){
        this.chat = chat;
        this.date = date;
        this.message_id = message_id;
        this.from = from;
        this.text = text;
    }

}
