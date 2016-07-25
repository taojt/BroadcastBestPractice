package com.example.taojt.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by taojt on 2016/7/24.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.finishAll();
    }
}
