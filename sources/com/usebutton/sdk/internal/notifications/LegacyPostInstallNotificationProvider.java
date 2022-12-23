package com.usebutton.sdk.internal.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.notifications.BaseNotificationProvider;
import com.usebutton.sdk.internal.receivers.InstallNotificationReceiver;
import com.usebutton.sdk.internal.util.ButtonLog;
import p067e1.C4522y;

class LegacyPostInstallNotificationProvider extends BaseNotificationProvider<Configuration> {
    private static final String TAG = "LegacyPostInstallNotificationProvider";
    private final Context context;

    public LegacyPostInstallNotificationProvider(Context context2) {
        this.context = context2.getApplicationContext();
    }

    private Bitmap getApplicationIcon(Intent intent) {
        PackageManager packageManager = this.context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(intent.getPackage(), RecyclerView.C1119a0.FLAG_IGNORE);
            return BitmapFactory.decodeResource(packageManager.getResourcesForApplication(applicationInfo), applicationInfo.icon);
        } catch (PackageManager.NameNotFoundException e) {
            ButtonLog.warn(TAG, "Could not find application", e);
            return null;
        } catch (OutOfMemoryError e2) {
            ButtonLog.warn(TAG, "Ran out of memory while decoding app icon", e2);
            return null;
        }
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

    public void displayNotification(Intent intent, Configuration configuration, BaseNotificationProvider.NotificationProviderListener notificationProviderListener) {
        String string = this.context.getString(BaseNotificationProvider.NOTIFICATION_CHANNEL_ID);
        String localizedString = getLocalizedString(configuration, "GO_TO_APP_STRING", C12238R.string.btn_go_to_app, new Object[0]);
        String localizedString2 = getLocalizedString(configuration, "WAS_INSTALLED_STRING", C12238R.string.btn_was_installed, getApplicationName(intent));
        Context context2 = this.context;
        PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, InstallNotificationReceiver.openIntent(context2, intent), 134217728);
        Context context3 = this.context;
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context3, 0, InstallNotificationReceiver.cancelIntent(context3, intent), 134217728);
        C4522y yVar = new C4522y(this.context, string);
        yVar.f15644y.icon = C12238R.C12239drawable.btn_ic_app_installed_action;
        yVar.mo20035g(getApplicationIcon(intent));
        yVar.mo20032d(localizedString);
        yVar.mo20031c(localizedString2);
        yVar.f15626g = broadcast;
        yVar.f15644y.deleteIntent = broadcast2;
        yVar.mo20034f(16, true);
        notificationProviderListener.onNotificationReady(BaseNotificationProvider.NotificationType.POST_INSTALL_NOTIFICATION, yVar.mo20030a());
    }
}
