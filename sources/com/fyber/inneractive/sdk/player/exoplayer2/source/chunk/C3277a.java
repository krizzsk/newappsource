package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3372x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a */
public abstract class C3277a implements C3372x.C3375c {

    /* renamed from: a */
    public final C3357j f11778a;

    /* renamed from: b */
    public final int f11779b;

    /* renamed from: c */
    public final C3226i f11780c;

    /* renamed from: d */
    public final int f11781d;

    /* renamed from: e */
    public final Object f11782e;

    /* renamed from: f */
    public final long f11783f;

    /* renamed from: g */
    public final long f11784g;

    /* renamed from: h */
    public final C3353g f11785h;

    public C3277a(C3353g gVar, C3357j jVar, int i, C3226i iVar, int i2, Object obj, long j, long j2) {
        this.f11785h = (C3353g) C3380a.m8503a(gVar);
        this.f11778a = (C3357j) C3380a.m8503a(jVar);
        this.f11779b = i;
        this.f11780c = iVar;
        this.f11781d = i2;
        this.f11782e = obj;
        this.f11783f = j;
        this.f11784g = j2;
    }

    /* renamed from: c */
    public abstract long mo14136c();
}
