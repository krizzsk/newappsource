package com.appboy.p044ui.activities;

import android.app.Activity;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.braze.Braze;

@Deprecated
/* renamed from: com.appboy.ui.activities.AppboyBaseActivity */
public class AppboyBaseActivity extends Activity {
    public void onPause() {
        super.onPause();
        AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(this);
    }

    public void onResume() {
        super.onResume();
        AppboyInAppMessageManager.getInstance().registerInAppMessageManager(this);
    }

    public void onStart() {
        super.onStart();
        Braze.getInstance(this).openSession(this);
    }

    public void onStop() {
        super.onStop();
        Braze.getInstance(this).closeSession(this);
    }
}
