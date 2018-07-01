package com.askida.telegram.api.json;

public class Chat {

    int id;

    String type;
    String title;
    String username;
    String first_name;
    String last_name;
    String description;
    String invite_link;
    String sticker_set_name;

    boolean all_members_are_administrators;
    boolean can_set_sticker_set;

    ChatPhoto photo;
    Message pinned_message;

    public int getId() {return id;}

    public String getType() {return type;}
    public String getTitle() {return title;}
    public String getUsername() {return username;}
    public String getFirst_name() {return first_name;}
    public String getLast_name() {return last_name;}
    public String getDescription() {return description;}
    public String getInvite_link() {return invite_link;}
    public String getSticker_set_name() {return sticker_set_name;}

    public boolean isAll_members_are_administrators() {
        return all_members_are_administrators;
    }

    public boolean isCan_set_sticker_set() {
        return can_set_sticker_set;
    }

    public ChatPhoto getPhoto() {
        return photo;
    }

    public Message getPinned_message(){
        return pinned_message;
    }

    public Chat(
            int id,
            String type,
            String title,
            String first_name,
            String last_name,
            String username,
            String description,
            String invite_link,
            String sticker_set_name,
            boolean all_members_are_administrators,
            boolean can_set_sticker_set,
            ChatPhoto photo,
            Message pinned_message
    ){
        this.id = id;
        this.type = type;
        this.title = title;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.description = description;
        this.invite_link = invite_link;
        this.all_members_are_administrators = all_members_are_administrators;
        this.can_set_sticker_set = can_set_sticker_set;
        this.photo = photo;
        this.pinned_message = pinned_message;
    }

    public Chat (){

    }

}
