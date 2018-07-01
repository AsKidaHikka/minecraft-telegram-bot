package com.askida.telegram.api.api;

import com.askida.telegram.api.methods.ReceivedEvent;
import com.askida.telegram.api.methods.TelegramApiMethods;
import com.askida.telegram.engine.Reference;

public class MessageAPI {

    TelegramApiMethods api = new TelegramApiMethods(Reference.HOST+Reference.TOKEN);
    int ChatID;

    public void sendMessage(String text){
        api.sendMessage(text, ChatID);
    }

    public void sendReply(String text, int ReplyID){
        api.sendMessage(text, ReplyID, ChatID);
    }

    public void sendAsHTML(String html){
        api.sendAsHTML(html, ChatID);
    }

    public MessageAPI(ReceivedEvent event){
        ChatID = event.getChatInfo().getId();
    }
    public MessageAPI(int ChatID) {
        this.ChatID = ChatID;
    }

}
