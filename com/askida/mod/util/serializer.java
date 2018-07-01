package com.askida.mod.util;

public class serializer {

    static final String REFERENCE = "<b>%p</b><pre>%t</pre>";

    public String getHTML(String msg){

        String name = "";
        String text;

        boolean first = true;

        StringBuilder builder = new StringBuilder();

        for (char l : msg.toCharArray()){

            if (first){

                if (l != ':'){
                    builder.append(l);
                } else {
                    first = false;
                    name = builder.toString();
                    builder = new StringBuilder();
                }

            } else
                builder.append(l);

        }

        text = builder.toString();

        msg = REFERENCE.replace("%p", name).replace("%t", text);

        return msg;
    }

}
