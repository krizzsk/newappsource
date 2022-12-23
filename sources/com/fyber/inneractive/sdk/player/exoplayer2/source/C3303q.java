package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C3270p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.q */
public final class C3303q extends C3270p {

    /* renamed from: g */
    public static final Object f11865g = new Object();

    /* renamed from: b */
    public final long f11866b;

    /* renamed from: c */
    public final long f11867c;

    /* renamed from: d */
    public final long f11868d;

    /* renamed from: e */
    public final long f11869e;

    /* renamed from: f */
    public final boolean f11870f;

    public C3303q(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    /* renamed from: a */
    public int mo14406a() {
        return 1;
    }

    /* renamed from: a */
    public C3270p.C3273c mo14410a(int i, C3270p.C3273c cVar, boolean z, long j) {
        C3380a.m8502a(i, 0, 1);
        Object obj = z ? f11865g : null;
        long j2 = this.f11869e;
        boolean z2 = this.f11870f;
        if (z2) {
            j2 += j;
            if (j2 > this.f11867c) {
                j2 = -9223372036854775807L;
            }
        }
        long j3 = this.f11867c;
        long j4 = this.f11868d;
        cVar.f11759a = obj;
        cVar.f11760b = z2;
        cVar.f11763e = j2;
        cVar.f11764f = j3;
        cVar.f11761c = 0;
        cVar.f11762d = 0;
        cVar.f11765g = j4;
        return cVar;
    }

    /* renamed from: b */
    public int mo14411b() {
        return 1;
    }

    public C3303q(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f11866b = j;
        this.f11867c = j2;
        this.f11868d = j3;
        this.f11869e = j4;
        this.f11870f = z2;
    }

    /* renamed from: a */
    public C3270p.C3272b mo14408a(int i, C3270p.C3272b bVar, boolean z) {
        C3380a.m8502a(i, 0, 1);
        Object obj = z ? f11865g : null;
        long j = this.f11866b;
        bVar.f11754a = obj;
        bVar.f11755b = obj;
        bVar.f11756c = 0;
        bVar.f11757d = j;
        bVar.f11758e = -this.f11868d;
        return bVar;
    }

    /* renamed from: a */
    public int mo14407a(Object obj) {
        return f11865g.equals(obj) ? 0 : -1;
    }
}
