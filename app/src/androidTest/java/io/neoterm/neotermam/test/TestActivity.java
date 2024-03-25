package io.neoterm.neotermam.test;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import io.neoterm.neotermam.IActivityManagerTest;

/**
 * {@link Activity} used for {@link IActivityManagerTest#testStartActivity()}
 */
public class TestActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestComponentsService.noteEvent("TestActivity " + getIntent().getAction());
        finish();
    }
}
