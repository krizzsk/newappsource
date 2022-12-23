package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import p137ja.C5409a;
import p137ja.C5410b;

public class DecoderInputBuffer extends C5409a {

    /* renamed from: c */
    public final C5410b f13646c = new C5410b();

    /* renamed from: d */
    public ByteBuffer f13647d;

    /* renamed from: e */
    public boolean f13648e;

    /* renamed from: f */
    public long f13649f;

    /* renamed from: g */
    public ByteBuffer f13650g;

    /* renamed from: h */
    public final int f13651h;

    /* renamed from: i */
    public final int f13652i;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InsufficientCapacityException(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 44
                r0.<init>(r1)
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " < "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.currentCapacity = r3
                r2.requiredCapacity = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException.<init>(int, int):void");
        }
    }

    public DecoderInputBuffer(int i) {
        this.f13651h = i;
        this.f13652i = 0;
    }

    /* renamed from: h */
    public void mo15948h() {
        this.f17757b = 0;
        ByteBuffer byteBuffer = this.f13647d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f13650g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f13648e = false;
    }

    /* renamed from: i */
    public final ByteBuffer mo15949i(int i) {
        int i2;
        int i3 = this.f13651h;
        if (i3 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f13647d;
        if (byteBuffer == null) {
            i2 = 0;
        } else {
            i2 = byteBuffer.capacity();
        }
        throw new InsufficientCapacityException(i2, i);
    }

    /* renamed from: j */
    public final void mo15950j(int i) {
        int i2 = i + this.f13652i;
        ByteBuffer byteBuffer = this.f13647d;
        if (byteBuffer == null) {
            this.f13647d = mo15949i(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f13647d = byteBuffer;
            return;
        }
        ByteBuffer i4 = mo15949i(i3);
        i4.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            i4.put(byteBuffer);
        }
        this.f13647d = i4;
    }

    /* renamed from: k */
    public final void mo15951k() {
        ByteBuffer byteBuffer = this.f13647d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f13650g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
