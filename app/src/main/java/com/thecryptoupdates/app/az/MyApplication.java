package com.thecryptoupdates.app.az;

import android.app.Application;



public class MyApplication extends Application {



    private static MyApplication mInstense;




    public MyApplication(){


        mInstense = this;

    }


    @Override
    public void onCreate() {
        super.onCreate();

        mInstense = this;



//        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
//
//        // OneSignal Initialization
//        OneSignal.initWithContext(this);
//        OneSignal.setAppId(ONESIGNAL_APP_ID);


//        OneSignal.startInit(this)
//                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
//                .unsubscribeWhenNotificationsAreDisabled(true)
//                .init();

    }



    public static synchronized MyApplication getmInstense(){

        return mInstense;
    }





}
