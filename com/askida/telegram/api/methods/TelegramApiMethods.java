package com.askida.telegram.api.methods;

import com.askida.telegram.api.json.Result;
import com.askida.telegram.api.json.Update;
import com.google.gson.Gson;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TelegramApiMethods {

    private String DOMEN;

    public String callMethod(String methodName, String methodArgsLine){
        try {

            URL url = new URL(DOMEN+"/"+methodName+"?"+methodArgsLine);
            URLConnection urlConnection = url.openConnection();

            StringBuilder finalString = new StringBuilder();
            InputStream inputStream = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            String temp = "";

            while ((temp = reader.readLine()) != null){
                finalString.append(temp);
            }

            return finalString.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Update getUpdate(){
        return new Gson().fromJson(callMethod("getUpdates", ""), Update.class);
    }

    public void cleanHistory(int lastID){
        callMethod("getUpdates", "offset="+lastID);
    }

    public void sendMessage(String text, int ReplyID, int ChatID){

        String arg_line = "chat_id=%id&reply_to_message_id=%reply_id&text=%text";

        arg_line = arg_line.replace("%id", new StringBuilder().append(ChatID).toString());
        arg_line = arg_line.replace("%reply_id", new StringBuilder().append(ReplyID).toString());
        arg_line = arg_line.replace("%text", text);

        System.out.println("Calling \n"+arg_line);
        callMethod("sendMessage", arg_line);
    }

    public void sendAsHTML(String text, int ChatID){

        String arg_line = "chat_id=%id&parse_mode=HTML&text=%text";

        arg_line = arg_line.replace("%id", new StringBuilder().append(ChatID).toString());
        arg_line = arg_line.replace("%text", text);

        System.out.println("Calling \n"+arg_line);
        callMethod("sendMessage", arg_line);
    }

    public void sendMessage(String text, int ChatID){
        String arg_line = "chat_id=%id&text=%text";

        arg_line = arg_line.replace("%id", new StringBuilder().append(ChatID).toString());
        arg_line = arg_line.replace("%text", text);

        System.out.println("Calling \n"+arg_line);
        callMethod("sendMessage", arg_line);
    }

    public TelegramApiMethods(String DOMEN){
        this.DOMEN = DOMEN;
    }

}
