package com.moovit.gcm.notification;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.MoovitNotificationChannel;
import com.moovit.gcm.payload.GcmPayload;
import f10.C16936g;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19740r;

public final class GcmNotification implements Parcelable {
    public static final Parcelable.Creator<GcmNotification> CREATOR = new C15899a();

    /* renamed from: j */
    public static final int f41516j = C19740r.gcm_push_notification;

    /* renamed from: k */
    public static final C15900b f41517k = new C15900b();

    /* renamed from: l */
    public static final C15901c f41518l = new C15901c(GcmNotification.class);

    /* renamed from: b */
    public final String f41519b;

    /* renamed from: c */
    public final String f41520c;

    /* renamed from: d */
    public final String f41521d;

    /* renamed from: e */
    public final String f41522e;

    /* renamed from: f */
    public final long f41523f;

    /* renamed from: g */
    public final GcmPayload f41524g;

    /* renamed from: h */
    public final int f41525h;

    /* renamed from: i */
    public final MoovitNotificationChannel f41526i;

    /* renamed from: com.moovit.gcm.notification.GcmNotification$a */
    public class C15899a implements Parcelable.Creator<GcmNotification> {
        public final Object createFromParcel(Parcel parcel) {
            return (GcmNotification) C19612n.m46981v(parcel, GcmNotification.f41518l);
        }

        public final Object[] newArray(int i) {
            return new GcmNotification[i];
        }
    }

    /* renamed from: com.moovit.gcm.notification.GcmNotification$b */
    public class C15900b extends C19621u<GcmNotification> {
        public C15900b() {
            super(5);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            GcmNotification gcmNotification = (GcmNotification) obj;
            qVar.mo51955t(gcmNotification.f41519b);
            qVar.mo51955t(gcmNotification.f41520c);
            C16936g.f43954a.write(gcmNotification.f41524g, qVar);
            qVar.mo51939l(gcmNotification.f41525h);
            qVar.mo51955t(gcmNotification.f41521d);
            qVar.mo51955t(gcmNotification.f41522e);
            qVar.mo51940m(gcmNotification.f41523f);
            MoovitNotificationChannel.CODER.write(gcmNotification.f41526i, qVar);
        }
    }

    /* renamed from: com.moovit.gcm.notification.GcmNotification$c */
    public class C15901c extends C19620t<GcmNotification> {
        public C15901c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 5;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            int i2;
            String str;
            String str2;
            long j;
            MoovitNotificationChannel moovitNotificationChannel;
            String t = pVar.mo51948t();
            String t2 = pVar.mo51948t();
            GcmPayload gcmPayload = (GcmPayload) C16936g.f43954a.read(pVar);
            if (i >= 1) {
                i2 = pVar.mo51924l();
            } else {
                i2 = GcmNotification.f41516j;
            }
            int i3 = i2;
            if (i >= 2) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i >= 3) {
                str2 = pVar.mo51948t();
            } else {
                str2 = null;
            }
            if (i >= 4) {
                j = pVar.mo51925m();
            } else {
                j = System.currentTimeMillis();
            }
            if (i >= 5) {
                moovitNotificationChannel = (MoovitNotificationChannel) C13555b.m33968g(MoovitNotificationChannel.CODER, pVar);
            } else {
                moovitNotificationChannel = MoovitNotificationChannel.GENERAL;
            }
            return new GcmNotification(t, t2, str, str2, j, gcmPayload, i3, moovitNotificationChannel);
        }
    }

    public GcmNotification(String str, String str2, String str3, String str4, long j, GcmPayload gcmPayload, int i, MoovitNotificationChannel moovitNotificationChannel) {
        this.f41519b = str;
        this.f41520c = str2;
        this.f41521d = str3;
        this.f41522e = str4;
        this.f41523f = j;
        C21100e.m49373x(gcmPayload, "payload");
        this.f41524g = gcmPayload;
        this.f41525h = i;
        C21100e.m49373x(moovitNotificationChannel, "channel");
        this.f41526i = moovitNotificationChannel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0083 A[SYNTHETIC, Splitter:B:9:0x0083] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Notification mo47968b(android.content.Context r10, android.app.PendingIntent r11, android.app.PendingIntent r12) {
        /*
            r9 = this;
            n.c r0 = new n.c
            int r1 = p824tp.C19747y.MoovitTheme
            r0.<init>((android.content.Context) r10, (int) r1)
            int r10 = p824tp.C19735m.colorSecondary
            int r10 = p977zz.C20941h.m49043f(r10, r0)
            com.moovit.MoovitNotificationChannel r1 = r9.f41526i
            e1.y r1 = r1.build(r0)
            int r2 = p824tp.C19739q.ic_notification_alert
            android.app.Notification r3 = r1.f15644y
            r3.icon = r2
            java.lang.String r2 = r9.f41521d
            r3 = 3000(0xbb8, double:1.482E-320)
            r5 = 0
            if (r2 != 0) goto L_0x0021
            goto L_0x0059
        L_0x0021:
            r2 = 1109393408(0x42200000, float:40.0)
            android.content.res.Resources r6 = r0.getResources()     // Catch:{ Exception -> 0x0058 }
            int r2 = com.moovit.commons.utils.UiUtils.m40249h(r6, r2)     // Catch:{ Exception -> 0x0058 }
            r10.e r6 = p583jk.C17884p.m44353X(r0)     // Catch:{ Exception -> 0x0058 }
            r10.d r6 = r6.mo10870l()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r7 = r9.f41521d     // Catch:{ Exception -> 0x0058 }
            com.bumptech.glide.i r6 = r6.mo10859b0(r7)     // Catch:{ Exception -> 0x0058 }
            r10.d r6 = (r10.C19220d) r6     // Catch:{ Exception -> 0x0058 }
            r6.getClass()     // Catch:{ Exception -> 0x0058 }
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c r7 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f7149b     // Catch:{ Exception -> 0x0058 }
            k6.j r8 = new k6.j     // Catch:{ Exception -> 0x0058 }
            r8.<init>()     // Catch:{ Exception -> 0x0058 }
            t6.a r6 = r6.mo22718I(r7, r8)     // Catch:{ Exception -> 0x0058 }
            r10.d r6 = (r10.C19220d) r6     // Catch:{ Exception -> 0x0058 }
            t6.e r2 = r6.mo10863e0(r2, r2)     // Catch:{ Exception -> 0x0058 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r2 = r2.get(r3, r6)     // Catch:{ Exception -> 0x0058 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ Exception -> 0x0058 }
            goto L_0x005a
        L_0x0058:
        L_0x0059:
            r2 = r5
        L_0x005a:
            r1.mo20035g(r2)
            r1.f15636q = r10
            java.lang.String r10 = r9.f41519b
            r1.mo20032d(r10)
            java.lang.String r10 = r9.f41519b
            r1.mo20038j(r10)
            java.lang.String r10 = r9.f41520c
            r1.mo20031c(r10)
            r10 = -1
            r1.mo20033e(r10)
            r10 = 8
            r2 = 1
            r1.mo20034f(r10, r2)
            r1.f15626g = r11
            android.app.Notification r10 = r1.f15644y
            r10.deleteIntent = r12
            java.lang.String r10 = r9.f41522e
            if (r10 != 0) goto L_0x0083
            goto L_0x00a4
        L_0x0083:
            r10.e r10 = p583jk.C17884p.m44353X(r0)     // Catch:{ Exception -> 0x00a3 }
            r10.d r10 = r10.mo10870l()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r11 = r9.f41522e     // Catch:{ Exception -> 0x00a3 }
            com.bumptech.glide.i r10 = r10.mo10859b0(r11)     // Catch:{ Exception -> 0x00a3 }
            r10.d r10 = (r10.C19220d) r10     // Catch:{ Exception -> 0x00a3 }
            t6.c r10 = r10.mo10862d0()     // Catch:{ Exception -> 0x00a3 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x00a3 }
            t6.e r10 = (p260t6.C6599e) r10     // Catch:{ Exception -> 0x00a3 }
            java.lang.Object r10 = r10.get(r3, r11)     // Catch:{ Exception -> 0x00a3 }
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10     // Catch:{ Exception -> 0x00a3 }
            r5 = r10
            goto L_0x00a4
        L_0x00a3:
        L_0x00a4:
            if (r5 == 0) goto L_0x00b8
            e1.u r10 = new e1.u
            r10.<init>()
            androidx.core.graphics.drawable.IconCompat r11 = new androidx.core.graphics.drawable.IconCompat
            r11.<init>(r2)
            r11.f3345b = r5
            r10.f15616a = r11
            r1.mo20037i(r10)
            goto L_0x00cc
        L_0x00b8:
            java.lang.String r10 = r9.f41520c
            if (r10 == 0) goto L_0x00cc
            e1.x r10 = new e1.x
            r10.<init>()
            java.lang.String r11 = r9.f41520c
            java.lang.CharSequence r11 = p067e1.C4522y.m11766b(r11)
            r10.f15619a = r11
            r1.mo20037i(r10)
        L_0x00cc:
            android.app.Notification r10 = r1.mo20030a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.gcm.notification.GcmNotification.mo47968b(android.content.Context, android.app.PendingIntent, android.app.PendingIntent):android.app.Notification");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GcmNotification)) {
            return false;
        }
        return this.f41524g.equals(((GcmNotification) obj).f41524g);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f41524g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41517k);
    }
}
