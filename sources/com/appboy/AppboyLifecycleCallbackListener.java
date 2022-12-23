package com.appboy;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.push.NotificationTrampolineActivity;
import com.appboy.support.AppboyLogger;
import com.braze.Braze;
import java.util.Collections;
import java.util.Set;

public class AppboyLifecycleCallbackListener implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyLifecycleCallbackListener.class);
    private Set<Class<?>> mInAppMessagingRegistrationBlocklist;
    private final boolean mRegisterInAppMessageManager;
    private Set<Class<?>> mSessionHandlingBlocklist;
    private final boolean mSessionHandlingEnabled;

    public AppboyLifecycleCallbackListener() {
        this(true, true, Collections.emptySet(), Collections.emptySet());
    }

    private boolean shouldHandleLifecycleMethodsInActivity(Activity activity, boolean z) {
        Class<?> cls = activity.getClass();
        if (cls.equals(NotificationTrampolineActivity.class)) {
            AppboyLogger.m5457v(TAG, "Skipping all automatic registration of notification trampoline activity class");
            return false;
        } else if (z) {
            return !this.mSessionHandlingBlocklist.contains(cls);
        } else {
            return !this.mInAppMessagingRegistrationBlocklist.contains(cls);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.mRegisterInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            AppboyLogger.m5457v(TAG, "Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents");
            AppboyInAppMessageManager.getInstance().ensureSubscribedToInAppMessageEvents(activity.getApplicationContext());
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (this.mRegisterInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            AppboyLogger.m5457v(TAG, "Automatically calling lifecycle method: unregisterInAppMessageManager");
            AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        if (this.mRegisterInAppMessageManager && shouldHandleLifecycleMethodsInActivity(activity, false)) {
            AppboyLogger.m5457v(TAG, "Automatically calling lifecycle method: registerInAppMessageManager");
            AppboyInAppMessageManager.getInstance().registerInAppMessageManager(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.mSessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            AppboyLogger.m5457v(TAG, "Automatically calling lifecycle method: openSession");
            Braze.getInstance(activity.getApplicationContext()).openSession(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.mSessionHandlingEnabled && shouldHandleLifecycleMethodsInActivity(activity, true)) {
            AppboyLogger.m5457v(TAG, "Automatically calling lifecycle method: closeSession");
            Braze.getInstance(activity.getApplicationContext()).closeSession(activity);
        }
    }

    public AppboyLifecycleCallbackListener(boolean z, boolean z2, Set<Class<?>> set, Set<Class<?>> set2) {
        this.mRegisterInAppMessageManager = z2;
        this.mSessionHandlingEnabled = z;
        this.mInAppMessagingRegistrationBlocklist = set == null ? Collections.emptySet() : set;
        this.mSessionHandlingBlocklist = set2 == null ? Collections.emptySet() : set2;
        String str = TAG;
        StringBuilder k = C13555b.m33972k("AppboyLifecycleCallbackListener using in-app messaging blocklist: ");
        k.append(this.mInAppMessagingRegistrationBlocklist);
        AppboyLogger.m5457v(str, k.toString());
        AppboyLogger.m5457v(str, "AppboyLifecycleCallbackListener using session handling blocklist: " + this.mSessionHandlingBlocklist);
    }
}
