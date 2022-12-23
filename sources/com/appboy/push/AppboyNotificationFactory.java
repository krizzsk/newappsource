package com.appboy.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.appboy.IAppboyNotificationFactory;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.push.BrazeNotificationPayload;
import com.appboy.support.AppboyLogger;
import com.braze.configuration.BrazeConfigurationProvider;
import p067e1.C4522y;

public class AppboyNotificationFactory implements IAppboyNotificationFactory {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyNotificationFactory.class);
    private static volatile AppboyNotificationFactory sInstance = null;

    public static AppboyNotificationFactory getInstance() {
        if (sInstance == null) {
            synchronized (AppboyNotificationFactory.class) {
                if (sInstance == null) {
                    sInstance = new AppboyNotificationFactory();
                }
            }
        }
        return sInstance;
    }

    public static C4522y populateNotificationBuilder(BrazeNotificationPayload brazeNotificationPayload) {
        String str = TAG;
        AppboyLogger.m5457v(str, "Using BrazeNotificationPayload: " + brazeNotificationPayload);
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            AppboyLogger.m5448d(str, "BrazeNotificationPayload has null context. Not creating notification");
            return null;
        }
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (configurationProvider == null) {
            AppboyLogger.m5448d(str, "BrazeNotificationPayload has null app configuration provider. Not creating notification");
            return null;
        }
        Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
        AppboyNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(context, notificationExtras, brazeNotificationPayload.getAppboyExtras());
        C4522y yVar = new C4522y(context, AppboyNotificationUtils.getOrCreateNotificationChannelId(brazeNotificationPayload));
        yVar.mo20034f(16, true);
        AppboyNotificationUtils.setTitleIfPresent(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setContentIfPresent(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setTickerIfPresent(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setSetShowWhen(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setContentIntentIfPresent(context, yVar, notificationExtras);
        AppboyNotificationUtils.setDeleteIntent(context, yVar, notificationExtras);
        AppboyNotificationUtils.setSmallIcon(configurationProvider, yVar);
        AppboyNotificationUtils.setLargeIconIfPresentAndSupported(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setSoundIfPresentAndSupported(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setSummaryTextIfPresentAndSupported(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setPriorityIfPresentAndSupported(yVar, notificationExtras);
        AppboyNotificationStyleFactory.setStyleIfSupported(yVar, brazeNotificationPayload);
        AppboyNotificationActionUtils.addNotificationActions(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setAccentColorIfPresentAndSupported(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setCategoryIfPresentAndSupported(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setVisibilityIfPresentAndSupported(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setPublicVersionIfPresentAndSupported(yVar, brazeNotificationPayload);
        AppboyNotificationUtils.setNotificationBadgeNumberIfPresent(yVar, brazeNotificationPayload);
        return yVar;
    }

    @Deprecated
    public Notification createNotification(AppboyConfigurationProvider appboyConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        return createNotification(new BrazeNotificationPayload(context, appboyConfigurationProvider, bundle, bundle2));
    }

    public Notification createNotification(BrazeNotificationPayload brazeNotificationPayload) {
        C4522y populateNotificationBuilder = populateNotificationBuilder(brazeNotificationPayload);
        if (populateNotificationBuilder != null) {
            return populateNotificationBuilder.mo20030a();
        }
        AppboyLogger.m5453i(TAG, "Notification could not be built. Returning null as created notification");
        return null;
    }
}
