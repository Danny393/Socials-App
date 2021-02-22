package com.example.socials;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESC = "description";
    public static final String KEY_IMG = "image";
    public static final String KEY_USER = "user";

    public String getDescription(){
        return getString(KEY_DESC);
    }

    public void setDescription(String desc){
        put(KEY_DESC, desc);
    }

    public ParseFile getImage(){
        return getParseFile(KEY_IMG);
    }

    public void setImage(ParseFile file){
        put(KEY_IMG, file);
    }

    public ParseUser getUser(){
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }
}
