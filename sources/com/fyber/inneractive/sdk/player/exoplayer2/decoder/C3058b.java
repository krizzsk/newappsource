package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.b */
public class C3058b {

    /* renamed from: a */
    public int f10526a;

    /* renamed from: b */
    public final C3055a f10527b = new C3055a();

    /* renamed from: c */
    public ByteBuffer f10528c;

    /* renamed from: d */
    public long f10529d;

    /* renamed from: e */
    public final int f10530e;

    public C3058b(int i) {
        this.f10530e = i;
    }

    /* renamed from: b */
    public static C3058b m7664b() {
        return new C3058b(0);
    }

    /* renamed from: a */
    public void mo14057a() {
        this.f10526a = 0;
        ByteBuffer byteBuffer = this.f10528c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: b */
    public final boolean mo14058b(int i) {
        return (this.f10526a & i) == i;
    }

    /* renamed from: a */
    public final ByteBuffer mo14056a(int i) {
        int i2 = this.f10530e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f10528c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i + ")");
    }
}
