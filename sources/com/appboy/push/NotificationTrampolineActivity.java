package com.appboy.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.appboy.AppboyAdmReceiver;
import com.appboy.BrazePushReceiver;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import p304x.C7073m;

public class NotificationTrampolineActivity extends Activity {
    private static final String TAG = AppboyLogger.getBrazeLogTag(NotificationTrampolineActivity.class);

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onResume$0() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppboyLogger.m5457v(TAG, "NotificationTrampolineActivity created");
    }

    public void onPause() {
        super.onPause();
        AppboyLogger.m5457v(TAG, "Notification trampoline activity paused and finishing");
        finish();
    }

    public void onResume() {
        super.onResume();
        try {
            Intent intent = getIntent();
            if (intent == null) {
                AppboyLogger.m5448d(TAG, "Notification trampoline activity received null intent. Doing nothing.");
                finish();
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                AppboyLogger.m5448d(TAG, "Notification trampoline activity received intent with null action. Doing nothing.");
                finish();
                return;
            }
            String str = TAG;
            AppboyLogger.m5457v(str, "Notification trampoline activity received intent: " + intent);
            Intent intent2 = new Intent(action).setClass(this, AppboyNotificationUtils.getNotificationReceiverClass());
            if (intent.getExtras() != null) {
                intent2.putExtras(intent.getExtras());
            }
            if (Constants.IS_AMAZON.booleanValue()) {
                AppboyAdmReceiver.handleReceivedIntent(this, intent2);
            } else {
                BrazePushReceiver.handleReceivedIntent(this, intent2, false);
            }
            new Handler(getMainLooper()).postDelayed(new C7073m(this, 4), 200);
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Failed to route intent to notification receiver", e);
        }
    }
}
