package com.usebutton.sdk.internal.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ButtonRepository;
import com.usebutton.sdk.internal.commands.ImageDownloadCommand;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.models.PostInstallNotificationConfig;
import com.usebutton.sdk.internal.notifications.BaseNotificationProvider;
import com.usebutton.sdk.internal.receivers.InstallNotificationReceiver;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.util.concurrent.atomic.AtomicInteger;
import p067e1.C4522y;

class PostInstallNotificationProvider extends BaseNotificationProvider<PostInstallNotificationConfig> implements FailableReceiver<ImageDownloadCommand.RemoteImage> {
    public static final String KEY_BG = "background";
    public static final String KEY_IC = "icon";
    private static final String TAG = "PostInstallNotificationProvider";
    private final Context context;
    private BaseNotificationProvider.NotificationProviderListener listener;
    private AtomicInteger loadCount;
    private Bitmap logoBitmap;
    private C4522y notificationBuilder;
    private RemoteViews remoteView;
    private final ButtonRepository repository;

    public PostInstallNotificationProvider(Context context2, ButtonRepository buttonRepository) {
        this.context = context2.getApplicationContext();
        this.repository = buttonRepository;
    }

    private Bitmap scaleDownIcon(Bitmap bitmap) {
        float f = this.context.getResources().getDisplayMetrics().density / 3.0f;
        return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * f), (int) (((float) bitmap.getHeight()) * f), false);
    }

    public void onError() {
        ButtonLog.warn(TAG, "Error downloading post-install notification image.");
    }

    public void displayNotification(Intent intent, PostInstallNotificationConfig postInstallNotificationConfig, BaseNotificationProvider.NotificationProviderListener notificationProviderListener) {
        this.listener = notificationProviderListener;
        this.loadCount = new AtomicInteger(2);
        String string = this.context.getString(BaseNotificationProvider.NOTIFICATION_CHANNEL_ID);
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), C12238R.layout.btn_view_install_notification);
        this.remoteView = remoteViews;
        int i = C12238R.C12240id.tv_title;
        remoteViews.setTextViewText(i, postInstallNotificationConfig.getTitle().getCopy());
        this.remoteView.setTextColor(i, postInstallNotificationConfig.getTitle().getColor());
        RemoteViews remoteViews2 = this.remoteView;
        int i2 = C12238R.C12240id.tv_cta;
        remoteViews2.setTextViewText(i2, postInstallNotificationConfig.getCta().getCopy());
        this.remoteView.setTextColor(i2, postInstallNotificationConfig.getCta().getColor());
        this.remoteView.setInt(i2, "setBackgroundColor", postInstallNotificationConfig.getCtaBackgroundColor());
        Context context2 = this.context;
        PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, InstallNotificationReceiver.openIntent(context2, intent), 134217728);
        Context context3 = this.context;
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context3, 0, InstallNotificationReceiver.cancelIntent(context3, intent), 134217728);
        C4522y yVar = new C4522y(this.context, string);
        yVar.f15644y.icon = C12238R.C12239drawable.btn_ic_app_installed_action;
        yVar.mo20032d(postInstallNotificationConfig.getTitle().getCopy());
        yVar.mo20031c(postInstallNotificationConfig.getCta().getCopy());
        yVar.f15629j = 2;
        yVar.mo20033e(-1);
        yVar.f15626g = broadcast;
        yVar.f15644y.deleteIntent = broadcast2;
        yVar.mo20034f(16, true);
        this.notificationBuilder = yVar;
        this.repository.getImage(this.context, KEY_BG, postInstallNotificationConfig.getBackgroundImage(), C12238R.C12239drawable.btn_bg_post_install, this);
        this.repository.getImage(this.context, "icon", postInstallNotificationConfig.getIcon(), 0, this);
    }

    public void onResult(ImageDownloadCommand.RemoteImage remoteImage) {
        int decrementAndGet = this.loadCount.decrementAndGet();
        String key = remoteImage.getKey();
        key.getClass();
        if (key.equals(KEY_BG)) {
            this.remoteView.setImageViewBitmap(C12238R.C12240id.iv_background, remoteImage.getBitmap());
        } else if (key.equals("icon")) {
            if (remoteImage.getBitmap() != null) {
                this.remoteView.setImageViewBitmap(C12238R.C12240id.iv_logo, remoteImage.getBitmap());
                this.logoBitmap = scaleDownIcon(remoteImage.getBitmap());
            } else {
                this.remoteView.setViewVisibility(C12238R.C12240id.iv_logo, 8);
            }
        }
        if (decrementAndGet == 0) {
            C4522y yVar = this.notificationBuilder;
            RemoteViews remoteViews = this.remoteView;
            yVar.f15641v = remoteViews;
            yVar.f15640u = remoteViews;
            yVar.mo20035g(this.logoBitmap);
            this.listener.onNotificationReady(BaseNotificationProvider.NotificationType.POST_INSTALL_NOTIFICATION, yVar.mo20030a());
        }
    }
}
