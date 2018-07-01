package com.askida.telegram.api.methods;

import com.askida.telegram.api.json.Update;
import com.askida.telegram.engine.Reference;

public class TelegramAPI implements Runnable{

    private telegramApiEventsHandler EventsHandler;

    private TelegramApiMethods methods;

    @Override
    public void run(){

        System.out.println("Configuring..");
        System.out.println("Configured.");

        int last_id = 0;

        // Working on all previues updates
        Update update = methods.getUpdate();

        EventsHandler.onAwake();

        for (int i = 0; i < update.getResult().length; i++){

            EventsHandler.onReceived(new ReceivedEvent(update.getResult()[i]));

            if (update.isOk())
                last_id = update.getResult()[update.getResult().length-1].getUpdateId();
            else
                System.out.println("FATAL ERROR ok:false");

        }

        // Setting the latest Update id and cleaning up the Updates history
        methods.cleanHistory(last_id+1);

        System.out.println("All unreceived messages are done.\nUpdates history is clean");

        // Working just with the latest update
        while (true) {

            update = methods.getUpdate();

            if (update.getResult().length > 0) {
                if (last_id < update.getResult()[update.getResult().length - 1].getUpdateId()) {
                    last_id++;
                    EventsHandler.onReceived(new ReceivedEvent(update.getResult()[update.getResult().length - 1]));
                }
            }

        }

    }

    public TelegramAPI(telegramApiEventsHandler EventsHandler){
        this.EventsHandler = EventsHandler;
        methods = new TelegramApiMethods(Reference.HOST+Reference.TOKEN);
    }

}
