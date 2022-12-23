package com.veriff.sdk.internal;

import android.util.Size;
import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/internal/data/Resolution;", "", "width", "", "height", "(Ljava/lang/String;III)V", "getHeight", "()I", "portraitSize", "Landroid/util/Size;", "getPortraitSize", "()Landroid/util/Size;", "size", "getSize", "getWidth", "R360P", "R480P", "R720P", "R1080P", "R1440P", "R2160P", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.js */
public enum C21886js {
    R360P(640, 360),
    R480P(854, 480),
    R720P(1280, 720),
    R1080P(1920, 1080),
    R1440P(2560, 1440),
    R2160P(3840, 2160);
    

    /* renamed from: h */
    private final Size f55332h;

    /* renamed from: i */
    private final Size f55333i;

    /* renamed from: j */
    private final int f55334j;

    /* renamed from: k */
    private final int f55335k;

    private C21886js(int i, int i2) {
        this.f55334j = i;
        this.f55335k = i2;
        this.f55332h = new Size(i, i2);
        this.f55333i = new Size(i2, i);
    }

    /* renamed from: a */
    public final Size mo55600a() {
        return this.f55332h;
    }

    /* renamed from: b */
    public final Size mo55601b() {
        return this.f55333i;
    }

    /* renamed from: c */
    public final int mo55602c() {
        return this.f55334j;
    }

    /* renamed from: d */
    public final int mo55603d() {
        return this.f55335k;
    }
}
