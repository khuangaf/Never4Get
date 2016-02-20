package com.example.huang.never4get;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.NotificationCompat;

/**
 * Created by huang on 2016/2/20.
 */
public class AlarmHelper {

    static void PopAlarm(Activity activity) {
        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(activity.getBaseContext())
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");


    }
}
