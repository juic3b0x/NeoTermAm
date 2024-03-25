package io.neoterm.neotermam.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import io.neoterm.neotermam.IActivityManagerTest;

/**
 * {@link BroadcastReceiver} used in {@link IActivityManagerTest#testBroadcastIntent()}
 */
public class TestReceiver extends BroadcastReceiver {
    public static final String REPLY_DATA = "TestReceiver.REPLY_DATA:";

    @Override
    public void onReceive(Context context, Intent intent) {
        setResultData(REPLY_DATA + intent.getAction());
    }
}
