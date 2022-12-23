package com.vungle.warren.downloader;

import android.text.TextUtils;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.vungle.warren.downloader.h */
public final class C23127h {

    /* renamed from: a */
    public final int f58713a;

    /* renamed from: b */
    public final String f58714b;

    /* renamed from: c */
    public final String f58715c;

    /* renamed from: d */
    public final boolean f58716d;

    /* renamed from: e */
    public AtomicReference<C23125f> f58717e = new AtomicReference<>();

    /* renamed from: f */
    public final String f58718f;

    /* renamed from: g */
    public final String f58719g;

    /* renamed from: h */
    public AtomicBoolean f58720h = new AtomicBoolean(false);

    public C23127h(C23125f fVar, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Url or path is empty");
        }
        this.f58713a = 3;
        this.f58717e.set(fVar);
        this.f58714b = str;
        this.f58715c = str2;
        this.f58718f = UUID.nameUUIDFromBytes((str2 + "_" + str).getBytes()).toString();
        this.f58716d = false;
        this.f58719g = str3;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DownloadRequest{networkType=");
        k.append(this.f58713a);
        k.append(", priority=");
        k.append(this.f58717e);
        k.append(", url='");
        C25541a.m63890u(k, this.f58714b, '\'', ", path='");
        C25541a.m63890u(k, this.f58715c, '\'', ", pauseOnConnectionLost=");
        k.append(this.f58716d);
        k.append(", id='");
        C25541a.m63890u(k, this.f58718f, '\'', ", cookieString='");
        C25541a.m63890u(k, this.f58719g, '\'', ", cancelled=");
        k.append(this.f58720h);
        k.append('}');
        return k.toString();
    }
}
