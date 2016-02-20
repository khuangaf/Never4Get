package com.example.huang.never4get;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.NotificationCompat;

/**
 * Created by huang on 2016/2/20.
 */
public class AlarmHelper {

    static void PopAlarm(Activity activity) {
       android.support.v4.app.NotificationCompat.Builder mBuilder =
               new android.support.v4.app.NotificationCompat.Builder(activity.getBaseContext())
                       .setSmallIcon(R.drawable.logo)
                       .setContentTitle("My notification")
                       .setContentText("Hello World!");
        Intent resultIntent = new Intent(activity.getBaseContext(), RegisterNewItem.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        activity.getBaseContext(),
                        0,
                        resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );

// Sets an ID for the notification
        int mNotificationId = 001;
// Gets an instance of the NotificationManager service
        NotificationManager mNotifyMgr =
                (NotificationManager) activity.getSystemService(Activity.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        Vibrator v = (Vibrator) activity.getBaseContext().getSystemService(Context.VIBRATOR_SERVICE);
        // Vibrate for 500 milliseconds
        v.vibrate(500);
        MediaPlayer mp = MediaPlayer.create(activity.getBaseContext(), R.raw.sound);
        //mp.start();
    }
}
