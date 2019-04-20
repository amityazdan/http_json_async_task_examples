package com.example.jsonexample.T4;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import com.example.jsonexample.R;


public class BackMusicService extends Service {

    public static MediaPlayer mp;


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (!mp.isPlaying()) {
            mp.start();
        }
        return START_NOT_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO Auto-generated method stub
        return null;
    }

    public void onCreate() {
        mp = MediaPlayer.create(this, R.raw.back_music);
        mp.setLooping(true);
//        mp.setVolume(0,0);
    }

    public void onDestroy() {
        mp.stop();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        mp.stop();

        return true;
    }

}