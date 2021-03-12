package com.bignerdranch.android.instragramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initializes Parse SDK
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0Z1r4vbPzmOK9nLfjRKO59K3ovDiLUev3D9OxQyl")
                .clientKey("Lnc0zKAvqGpyraBNMjZBuo51ZZsm6p1GR1deIosC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

