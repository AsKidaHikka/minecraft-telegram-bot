package com.askida.telegram.api.json;

public class User {

    int id;
    boolean is_bot;

    String first_name;
    String last_name;
    String username;
    String language_code;

    // GETTERS
    public int getId(){
        return id;
    }

    public boolean isbot() {
        return is_bot;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getUsername() {
        return username;
    }

    // Full
    public User(int id, boolean is_bot, String first_name, String last_name, String username, String language_code){
        this.id = id;
        this.is_bot = is_bot;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.language_code = language_code;
    }

}
