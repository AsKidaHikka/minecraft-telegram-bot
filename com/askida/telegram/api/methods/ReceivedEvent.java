package com.askida.telegram.api.methods;

import com.askida.telegram.api.json.*;
import com.google.gson.Gson;

public class ReceivedEvent {

    Gson gson = new Gson();
    Result result;

    public Chat getChatInfo(){
        if (true)
            return result.getMessage().getChat();
        else
            System.out.println("ERROR (ok:false)");

        return new Chat();
    }

    public User getFromInfo(){
        return result.getMessage().getFrom();
    }

    public Message getMessageInfo(){
        return result.getMessage();
    }

    public ReceivedEvent(Result result){
        this.result = result;
    }

}
