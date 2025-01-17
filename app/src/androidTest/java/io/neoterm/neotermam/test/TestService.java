package io.neoterm.neotermam.test;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import io.neoterm.neotermam.IActivityManagerTest;

/**
 * {@link Service} used in {@link IActivityManagerTest#testStartStopService()}
 */
public class TestService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        TestComponentsService.noteEvent("Start TestService " + intent.getAction());
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        TestComponentsService.noteEvent("Stop TestService");
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
