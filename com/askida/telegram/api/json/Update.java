package com.askida.telegram.api.json;

public class Update {

    boolean ok;
    Result[] result;

    public boolean isOk() {
        return ok;
    }

    public Result[] getResult() {
        return result;
    }

    public Update(boolean ok, Result[] result){
        this.ok = ok;
        this.result = result;
    }

}
