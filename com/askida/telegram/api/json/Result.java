package com.askida.telegram.api.json;

public class Result {

    int update_id;
    Message message;

    public int getUpdateId(){return update_id;}
    public Message getMessage() {return message;}

    public Result(int update_id, Message message){
        this.update_id = update_id;
        this.message = message;
    }

}
