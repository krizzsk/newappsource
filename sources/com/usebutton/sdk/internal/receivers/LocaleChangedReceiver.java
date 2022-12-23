package com.usebutton.sdk.internal.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.usebutton.sdk.Button;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.util.ButtonLog;

public class LocaleChangedReceiver extends BroadcastReceiver {
    private static final String TAG = "LocaleChangedReceiver";

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            ButtonLog.info(TAG, "Locale changed, let's trigger config update.");
            try {
                ButtonPrivate button = ButtonPrivate.getButton();
                if (button != null && button.internalIsStarted()) {
                    Button.onLocaleChanged(context);
                }
            } catch (Throwable th) {
                ButtonLog.warn(TAG, "Exception while handling locale changed intent " + intent, th);
            }
        }
    }
}
