package com.askida.mod.util;

import com.askida.telegram.api.api.MessageAPI;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EventHandler {

    @SubscribeEvent
    public void onClientChatReceivedEvent(ClientChatReceivedEvent event) {

        onChatReceivedEvent method = new onChatReceivedEvent(event);

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(method);

    }

}
