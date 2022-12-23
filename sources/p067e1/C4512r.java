package p067e1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* renamed from: e1.r */
public final class C4512r {

    /* renamed from: a */
    public final String f15587a;

    /* renamed from: b */
    public CharSequence f15588b;

    /* renamed from: c */
    public int f15589c;

    /* renamed from: d */
    public String f15590d;

    /* renamed from: e */
    public String f15591e;

    /* renamed from: f */
    public boolean f15592f = true;

    /* renamed from: g */
    public Uri f15593g = Settings.System.DEFAULT_NOTIFICATION_URI;

    /* renamed from: h */
    public AudioAttributes f15594h;

    /* renamed from: i */
    public boolean f15595i;

    /* renamed from: j */
    public int f15596j = 0;

    /* renamed from: k */
    public boolean f15597k;

    /* renamed from: l */
    public long[] f15598l;

    /* renamed from: m */
    public String f15599m;

    /* renamed from: n */
    public String f15600n;

    public C4512r(NotificationChannel notificationChannel) {
        String id = notificationChannel.getId();
        int importance = notificationChannel.getImportance();
        id.getClass();
        this.f15587a = id;
        this.f15589c = importance;
        this.f15594h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        this.f15588b = notificationChannel.getName();
        this.f15590d = notificationChannel.getDescription();
        this.f15591e = notificationChannel.getGroup();
        this.f15592f = notificationChannel.canShowBadge();
        this.f15593g = notificationChannel.getSound();
        this.f15594h = notificationChannel.getAudioAttributes();
        this.f15595i = notificationChannel.shouldShowLights();
        this.f15596j = notificationChannel.getLightColor();
        this.f15597k = notificationChannel.shouldVibrate();
        this.f15598l = notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f15599m = notificationChannel.getParentChannelId();
            this.f15600n = notificationChannel.getConversationId();
        }
        notificationChannel.canBypassDnd();
        notificationChannel.getLockscreenVisibility();
        if (i >= 29) {
            notificationChannel.canBubble();
        }
        if (i >= 30) {
            notificationChannel.isImportantConversation();
        }
    }

    /* renamed from: a */
    public final NotificationChannel mo20026a() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.f15587a, this.f15588b, this.f15589c);
        notificationChannel.setDescription(this.f15590d);
        notificationChannel.setGroup(this.f15591e);
        notificationChannel.setShowBadge(this.f15592f);
        notificationChannel.setSound(this.f15593g, this.f15594h);
        notificationChannel.enableLights(this.f15595i);
        notificationChannel.setLightColor(this.f15596j);
        notificationChannel.setVibrationPattern(this.f15598l);
        notificationChannel.enableVibration(this.f15597k);
        if (!(i < 30 || (str = this.f15599m) == null || (str2 = this.f15600n) == null)) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }
}
