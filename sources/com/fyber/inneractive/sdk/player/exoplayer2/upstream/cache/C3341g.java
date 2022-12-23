package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g */
public class C3341g implements Comparable<C3341g> {

    /* renamed from: a */
    public final String f11959a;

    /* renamed from: b */
    public final long f11960b;

    /* renamed from: c */
    public final long f11961c;

    /* renamed from: d */
    public final boolean f11962d;

    /* renamed from: e */
    public final File f11963e;

    /* renamed from: f */
    public final long f11964f;

    public C3341g(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.f11959a = str;
        this.f11960b = j;
        this.f11961c = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.f11962d = z;
        this.f11963e = file;
        this.f11964f = j3;
    }

    /* renamed from: a */
    public int compareTo(C3341g gVar) {
        if (!this.f11959a.equals(gVar.f11959a)) {
            return this.f11959a.compareTo(gVar.f11959a);
        }
        int i = ((this.f11960b - gVar.f11960b) > 0 ? 1 : ((this.f11960b - gVar.f11960b) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }
}
