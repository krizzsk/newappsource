package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.e */
public final class C3385e {

    /* renamed from: a */
    public final int f12094a;

    /* renamed from: b */
    public final int f12095b;

    /* renamed from: c */
    public final int f12096c;

    /* renamed from: d */
    public final long f12097d;

    public C3385e(byte[] bArr, int i) {
        C3392j jVar = new C3392j(bArr);
        jVar.mo14534b(i * 8);
        jVar.mo14532a(16);
        jVar.mo14532a(16);
        jVar.mo14532a(24);
        jVar.mo14532a(24);
        this.f12094a = jVar.mo14532a(20);
        this.f12095b = jVar.mo14532a(3) + 1;
        this.f12096c = jVar.mo14532a(5) + 1;
        this.f12097d = ((((long) jVar.mo14532a(4)) & 15) << 32) | (((long) jVar.mo14532a(32)) & 4294967295L);
    }
}
