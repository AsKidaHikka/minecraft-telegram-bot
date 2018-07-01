package com.askida.mod.util;

public class Cleaner {

    public String CleanFromColorCodes(String str){

        StringBuilder sb = new StringBuilder();
        boolean isPreviuseColorCode = false;

        for (int i = 0; i < str.toCharArray().length; i++){

            if (str.toCharArray()[i] == '\u00a7'){
                isPreviuseColorCode = true;
            } else {
                if (!isPreviuseColorCode)
                    sb.append(str.toCharArray()[i]);
                else
                    isPreviuseColorCode = false;
            }

        }

        return sb.toString();
    }

}
