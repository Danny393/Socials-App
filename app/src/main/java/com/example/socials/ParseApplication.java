package com.example.socials;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {

        //register parse models
        ParseObject.registerSubclass(Post.class);

        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("vt44uykAJy4Sd7uUUzoQxgmHzNOSqAJNRHryKHJs")
                .clientKey("QeiIcHrGIwNlpfq2g55a7uX0obf6sd1Cre1ue0zy")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
