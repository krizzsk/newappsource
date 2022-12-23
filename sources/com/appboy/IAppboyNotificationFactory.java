package com.appboy;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.push.BrazeNotificationPayload;

@Keep
public interface IAppboyNotificationFactory {
    @Deprecated
    Notification createNotification(AppboyConfigurationProvider appboyConfigurationProvider, Context context, Bundle bundle, Bundle bundle2);

    Notification createNotification(BrazeNotificationPayload brazeNotificationPayload);
}
