package com.askida.telegram.api.methods;

public interface telegramApiEventsHandler {

    public void onReceived(ReceivedEvent event);
    public void onAwake();

}
