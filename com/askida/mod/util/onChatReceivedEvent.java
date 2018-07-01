package com.askida.mod.util;

import com.askida.telegram.api.api.MessageAPI;
import net.minecraftforge.client.event.ClientChatReceivedEvent;

public class onChatReceivedEvent implements Runnable{

    String message;
    MessageAPI api = new MessageAPI(com.askida.telegram.engine.Reference.ChatID);
    serializer ser = new serializer();

    @Override
    public void run(){

        if (message.contains("[клан]")) {
            message = ser.getHTML(message.replace("[клан]", ""));
            api.sendAsHTML(message);
        }

    }

    public onChatReceivedEvent(ClientChatReceivedEvent event){

        this.message = new Cleaner().CleanFromColorCodes(event.getMessage().getFormattedText()).toLowerCase();

    }

}
