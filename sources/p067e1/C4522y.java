package p067e1;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import p055d1.C4327c;

/* renamed from: e1.y */
public final class C4522y {

    /* renamed from: a */
    public Context f15620a;

    /* renamed from: b */
    public ArrayList<C4514t> f15621b = new ArrayList<>();

    /* renamed from: c */
    public ArrayList<C4489h0> f15622c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<C4514t> f15623d = new ArrayList<>();

    /* renamed from: e */
    public CharSequence f15624e;

    /* renamed from: f */
    public CharSequence f15625f;

    /* renamed from: g */
    public PendingIntent f15626g;

    /* renamed from: h */
    public Bitmap f15627h;

    /* renamed from: i */
    public int f15628i;

    /* renamed from: j */
    public int f15629j;

    /* renamed from: k */
    public boolean f15630k = true;

    /* renamed from: l */
    public C4471a0 f15631l;

    /* renamed from: m */
    public CharSequence f15632m;

    /* renamed from: n */
    public boolean f15633n = false;

    /* renamed from: o */
    public String f15634o;

    /* renamed from: p */
    public Bundle f15635p;

    /* renamed from: q */
    public int f15636q = 0;

    /* renamed from: r */
    public int f15637r = 0;

    /* renamed from: s */
    public Notification f15638s;

    /* renamed from: t */
    public RemoteViews f15639t;

    /* renamed from: u */
    public RemoteViews f15640u;

    /* renamed from: v */
    public RemoteViews f15641v;

    /* renamed from: w */
    public String f15642w;

    /* renamed from: x */
    public boolean f15643x;

    /* renamed from: y */
    public Notification f15644y;
    @Deprecated

    /* renamed from: z */
    public ArrayList<String> f15645z;

    public C4522y(Context context, String str) {
        Notification notification = new Notification();
        this.f15644y = notification;
        this.f15620a = context;
        this.f15642w = str;
        notification.when = System.currentTimeMillis();
        this.f15644y.audioStreamType = -1;
        this.f15629j = 0;
        this.f15645z = new ArrayList<>();
        this.f15643x = true;
    }

    /* renamed from: b */
    public static CharSequence m11766b(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* renamed from: a */
    public final Notification mo20030a() {
        RemoteViews remoteViews;
        Notification notification;
        Bundle bundle;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        C4480d0 d0Var = new C4480d0(this);
        C4471a0 a0Var = d0Var.f15542c.f15631l;
        if (a0Var != null) {
            a0Var.apply(d0Var);
        }
        if (a0Var != null) {
            remoteViews = a0Var.makeContentView(d0Var);
        } else {
            remoteViews = null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            notification = d0Var.f15541b.build();
        } else if (i >= 24) {
            notification = d0Var.f15541b.build();
        } else {
            d0Var.f15541b.setExtras(d0Var.f15545f);
            notification = d0Var.f15541b.build();
            RemoteViews remoteViews2 = d0Var.f15543d;
            if (remoteViews2 != null) {
                notification.contentView = remoteViews2;
            }
            RemoteViews remoteViews3 = d0Var.f15544e;
            if (remoteViews3 != null) {
                notification.bigContentView = remoteViews3;
            }
            RemoteViews remoteViews4 = d0Var.f15546g;
            if (remoteViews4 != null) {
                notification.headsUpContentView = remoteViews4;
            }
        }
        if (remoteViews != null) {
            notification.contentView = remoteViews;
        } else {
            RemoteViews remoteViews5 = d0Var.f15542c.f15639t;
            if (remoteViews5 != null) {
                notification.contentView = remoteViews5;
            }
        }
        if (!(a0Var == null || (makeBigContentView = a0Var.makeBigContentView(d0Var)) == null)) {
            notification.bigContentView = makeBigContentView;
        }
        if (!(a0Var == null || (makeHeadsUpContentView = d0Var.f15542c.f15631l.makeHeadsUpContentView(d0Var)) == null)) {
            notification.headsUpContentView = makeHeadsUpContentView;
        }
        if (!(a0Var == null || (bundle = notification.extras) == null)) {
            a0Var.addCompatExtras(bundle);
        }
        return notification;
    }

    /* renamed from: c */
    public final void mo20031c(CharSequence charSequence) {
        this.f15625f = m11766b(charSequence);
    }

    /* renamed from: d */
    public final void mo20032d(CharSequence charSequence) {
        this.f15624e = m11766b(charSequence);
    }

    /* renamed from: e */
    public final void mo20033e(int i) {
        Notification notification = this.f15644y;
        notification.defaults = i;
        if ((i & 4) != 0) {
            notification.flags |= 1;
        }
    }

    /* renamed from: f */
    public final void mo20034f(int i, boolean z) {
        if (z) {
            Notification notification = this.f15644y;
            notification.flags = i | notification.flags;
            return;
        }
        Notification notification2 = this.f15644y;
        notification2.flags = (~i) & notification2.flags;
    }

    /* renamed from: g */
    public final void mo20035g(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f15620a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C4327c.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C4327c.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
        }
        this.f15627h = bitmap;
    }

    /* renamed from: h */
    public final void mo20036h(Uri uri) {
        Notification notification = this.f15644y;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
    }

    /* renamed from: i */
    public final void mo20037i(C4471a0 a0Var) {
        if (this.f15631l != a0Var) {
            this.f15631l = a0Var;
            if (a0Var != null) {
                a0Var.setBuilder(this);
            }
        }
    }

    /* renamed from: j */
    public final void mo20038j(CharSequence charSequence) {
        this.f15644y.tickerText = m11766b(charSequence);
    }
}
