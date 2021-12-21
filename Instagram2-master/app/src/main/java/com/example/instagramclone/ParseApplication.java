package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kYfjPqpnWMZyEHfoC7b94GkozhGvzP1IM2raikob")
                .clientKey("pQ7efGjDXWO9X2ZTwfbbLULlPvckEQi7JG8diRg3")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
