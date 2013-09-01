package com.example.androidstudy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by ben on 24/08/13.
 */


public class ScreenONReceiver extends BroadcastReceiver {

    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)){

            Toast.makeText(context,"Welcome Back",Toast.LENGTH_LONG).show();
        }
        if (intent.getAction().equals(Intent.ACTION_SCREEN_OFF)){
            Toast.makeText(context,"Welcome Back",Toast.LENGTH_LONG).show();
        }
    }
}
