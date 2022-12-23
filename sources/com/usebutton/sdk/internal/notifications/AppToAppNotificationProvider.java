package com.usebutton.sdk.internal.notifications;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.notifications.BaseNotificationProvider;
import p067e1.C4522y;

class AppToAppNotificationProvider extends BaseNotificationProvider<Configuration> {
    private final Context context;
    private final Handler handler;

    public AppToAppNotificationProvider(Context context2, Handler handler2) {
        this.context = context2.getApplicationContext();
        this.handler = handler2;
    }

    private String getApplicationName(Intent intent) {
        PackageManager packageManager = this.context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(intent.getPackage(), RecyclerView.C1119a0.FLAG_IGNORE)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private String getLocalizedString(Configuration configuration, String str, int i, Object... objArr) {
        return configuration.getCopy().getFormattedString(this.context, str, i, objArr);
    }

    public void displayNotification(Intent intent, Configuration configuration, final BaseNotificationProvider.NotificationProviderListener notificationProviderListener) {
        String string = this.context.getString(BaseNotificationProvider.NOTIFICATION_CHANNEL_ID);
        String localizedString = getLocalizedString(configuration, "APP_TO_APP_NOTIFICATION_TITLE", C12238R.string.btn_app_to_app_notification_title, new Object[0]);
        String localizedString2 = getLocalizedString(configuration, "APP_TO_APP_NOTIFICATION_BODY", C12238R.string.btn_app_to_app_notification_body, getApplicationName(intent));
        PendingIntent activity = PendingIntent.getActivity(this.context, -1, intent, 134217728);
        C4522y yVar = new C4522y(this.context, string);
        yVar.f15644y.icon = C12238R.C12239drawable.btn_ic_app_installed_action;
        yVar.f15629j = 1;
        yVar.mo20033e(-1);
        yVar.f15626g = activity;
        yVar.mo20032d(localizedString);
        yVar.mo20031c(localizedString2);
        yVar.mo20034f(16, true);
        final Notification a = yVar.mo20030a();
        this.handler.postDelayed(new Runnable() {
            public void run() {
                notificationProviderListener.onNotificationReady(BaseNotificationProvider.NotificationType.APP_TO_APP_NOTIFICATION, a);
            }
        }, InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS);
    }
}
