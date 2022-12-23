package com.moovit;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import ce0.C21100e;
import p067e1.C4522y;
import p810sz.C19577c;
import p824tp.C19746x;
import p977zz.C20943i;

public enum MoovitNotificationChannel {
    GENERAL("general", C19746x.notification_channel_general_name, C19746x.notification_channel_general_description, 3),
    METRO_ALERTS("metro_alerts", C19746x.notification_channel_metro_alerts_name, C19746x.notification_channel_metro_alerts_description, 3),
    FAVORITES_ALERTS("favorites_alerts", C19746x.notification_channel_favorites_alerts_name, C19746x.notification_channel_favorites_alerts_description, 3),
    PAYMENTS("payments", C19746x.notification_channel_payments_name, C19746x.notification_channel_payments_description, 3),
    NAVIGATION("navigation", C19746x.notification_channel_navigation_name, C19746x.notification_channel_navigation_description, 4),
    CARPOOL("carpool", C19746x.notification_channel_carpool_name, C19746x.notification_channel_carpool_description, 4),
    RIDE_SHARING("ride_sharing", C19746x.notification_channel_ride_sharing_name, C19746x.notification_channel_ride_sharing_description, 4),
    SURVEYS("surveys", C19746x.notification_channel_surveys_name, C19746x.notification_channel_surveys_description, 2),
    DEBUG("debug", 0, 0, 3);
    
    public static final C19577c<MoovitNotificationChannel> CODER = null;
    private final int channelDescription;
    private final String channelId;
    private final int channelName;
    private final int importance;

    /* access modifiers changed from: public */
    static {
        MoovitNotificationChannel moovitNotificationChannel;
        MoovitNotificationChannel moovitNotificationChannel2;
        MoovitNotificationChannel moovitNotificationChannel3;
        MoovitNotificationChannel moovitNotificationChannel4;
        MoovitNotificationChannel moovitNotificationChannel5;
        MoovitNotificationChannel moovitNotificationChannel6;
        MoovitNotificationChannel moovitNotificationChannel7;
        MoovitNotificationChannel moovitNotificationChannel8;
        MoovitNotificationChannel moovitNotificationChannel9;
        CODER = new C19577c<>(MoovitNotificationChannel.class, moovitNotificationChannel, moovitNotificationChannel2, moovitNotificationChannel3, moovitNotificationChannel4, moovitNotificationChannel5, moovitNotificationChannel6, moovitNotificationChannel7, moovitNotificationChannel8, moovitNotificationChannel9);
    }

    private MoovitNotificationChannel(String str, int i, int i2, int i3) {
        C21100e.m49373x(str, "channelId");
        this.channelId = str;
        this.channelName = i;
        this.channelDescription = i2;
        this.importance = i3;
    }

    private void ensureChannel(Context context) {
        NotificationManager notificationManager;
        String str;
        if (C20943i.m49051d(26) && (notificationManager = (NotificationManager) context.getSystemService("notification")) != null && notificationManager.getNotificationChannel(this.channelId) == null) {
            int i = this.channelName;
            if (i != 0) {
                str = context.getString(i);
            } else {
                str = this.channelId;
            }
            NotificationChannel notificationChannel = new NotificationChannel(this.channelId, str, this.importance);
            int i2 = this.channelDescription;
            if (i2 != 0) {
                notificationChannel.setDescription(context.getString(i2));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static MoovitNotificationChannel forChannelId(String str) {
        for (MoovitNotificationChannel moovitNotificationChannel : values()) {
            if (moovitNotificationChannel.channelId.equals(str)) {
                return moovitNotificationChannel;
            }
        }
        return null;
    }

    private static int toNotificationPriority(int i) {
        if (i == 1) {
            return -2;
        }
        if (i == 2) {
            return -1;
        }
        if (i == 3) {
            return 0;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 5) {
            return 2;
        }
        throw new IllegalStateException(C16759e.m42349e("Unknown notification channel importance: ", i));
    }

    public C4522y build(Context context) {
        ensureChannel(context);
        C4522y yVar = new C4522y(context, this.channelId);
        yVar.f15629j = toNotificationPriority(this.importance);
        yVar.f15637r = 1;
        return yVar;
    }

    public final NotificationChannel getChannel(Context context) {
        NotificationManager notificationManager;
        if (C20943i.m49051d(26) && (notificationManager = (NotificationManager) context.getSystemService("notification")) != null) {
            return notificationManager.getNotificationChannel(this.channelId);
        }
        return null;
    }

    public final String getChannelId() {
        return this.channelId;
    }
}
