package com.askida.telegram.engine;

import com.askida.telegram.api.api.MessageAPI;
import com.askida.telegram.api.methods.ReceivedEvent;
import com.askida.telegram.api.methods.telegramApiEventsHandler;

public class EventsHandler implements telegramApiEventsHandler{

    @Override
    public void onReceived(ReceivedEvent event){

        MessageAPI msg = new MessageAPI(event);

        msg.sendReply("Тест", event.getMessageInfo().getId());

    }

    @Override
    public void onAwake(){
        System.out.println("Ready to work.");
    }

}
