package com.example.socials;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("vt44uykAJy4Sd7uUUzoQxgmHzNOSqAJNRHryKHJs")
                .clientKey("QeiIcHrGIwNlpfq2g55a7uX0obf6sd1Cre1ue0zy")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
