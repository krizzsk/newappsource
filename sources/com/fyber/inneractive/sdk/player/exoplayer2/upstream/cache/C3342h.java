package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.util.TreeSet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h */
public final class C3342h {

    /* renamed from: a */
    public final int f11965a;

    /* renamed from: b */
    public final String f11966b;

    /* renamed from: c */
    public final TreeSet<C3347l> f11967c = new TreeSet<>();

    /* renamed from: d */
    public long f11968d;

    public C3342h(int i, String str, long j) {
        this.f11965a = i;
        this.f11966b = str;
        this.f11968d = j;
    }

    /* renamed from: a */
    public int mo14483a() {
        int d = C13715c.m34238d(this.f11966b, this.f11965a * 31, 31);
        long j = this.f11968d;
        return d + ((int) (j ^ (j >>> 32)));
    }
}
