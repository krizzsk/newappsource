package com.google.android.play.core.appupdate;

import android.app.PendingIntent;

/* renamed from: com.google.android.play.core.appupdate.a */
public final class C14223a {

    /* renamed from: a */
    public final int f35738a;

    /* renamed from: b */
    public final int f35739b;

    /* renamed from: c */
    public final long f35740c;

    /* renamed from: d */
    public final long f35741d;

    /* renamed from: e */
    public final PendingIntent f35742e;

    /* renamed from: f */
    public final PendingIntent f35743f;

    /* renamed from: g */
    public final PendingIntent f35744g;

    /* renamed from: h */
    public final PendingIntent f35745h;

    /* renamed from: i */
    public boolean f35746i = false;

    public C14223a(int i, int i2, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f35738a = i;
        this.f35739b = i2;
        this.f35740c = j;
        this.f35741d = j2;
        this.f35742e = pendingIntent;
        this.f35743f = pendingIntent2;
        this.f35744g = pendingIntent3;
        this.f35745h = pendingIntent4;
    }

    /* renamed from: a */
    public final PendingIntent mo42688a(C14241s sVar) {
        int i = sVar.f35785a;
        boolean z = false;
        if (i == 0) {
            PendingIntent pendingIntent = this.f35743f;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (sVar.f35786b && this.f35740c <= this.f35741d) {
                z = true;
            }
            if (z) {
                return this.f35745h;
            }
            return null;
        }
        if (i == 1) {
            PendingIntent pendingIntent2 = this.f35742e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (sVar.f35786b && this.f35740c <= this.f35741d) {
                z = true;
            }
            if (z) {
                return this.f35744g;
            }
        }
        return null;
    }
}
