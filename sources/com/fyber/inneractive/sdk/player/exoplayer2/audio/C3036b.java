package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.b */
public interface C3036b {

    /* renamed from: a */
    public static final ByteBuffer f10381a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.b$a */
    public static final class C3037a extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C3037a(int r4, int r5, int r6) {
            /*
                r3 = this;
                java.lang.String r0 = "Unhandled format: "
                java.lang.String r1 = " Hz, "
                java.lang.String r2 = " channels in encoding "
                java.lang.StringBuilder r4 = p001a0.C0016g.m35s(r0, r4, r1, r5, r2)
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C3036b.C3037a.<init>(int, int, int):void");
        }
    }

    /* renamed from: a */
    ByteBuffer mo14010a();

    /* renamed from: a */
    void mo14011a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo14012a(int i, int i2, int i3) throws C3037a;

    /* renamed from: b */
    boolean mo14013b();

    /* renamed from: c */
    void mo14014c();

    /* renamed from: d */
    boolean mo14015d();

    /* renamed from: e */
    int mo14016e();

    /* renamed from: f */
    int mo14017f();

    void flush();

    /* renamed from: g */
    void mo14019g();
}
