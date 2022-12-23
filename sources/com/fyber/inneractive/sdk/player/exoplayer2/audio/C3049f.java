package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C3036b;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.f */
public final class C3049f implements C3036b {

    /* renamed from: b */
    public int f10466b = -1;

    /* renamed from: c */
    public int f10467c = -1;

    /* renamed from: d */
    public int f10468d = 0;

    /* renamed from: e */
    public ByteBuffer f10469e;

    /* renamed from: f */
    public ByteBuffer f10470f;

    /* renamed from: g */
    public boolean f10471g;

    public C3049f() {
        ByteBuffer byteBuffer = C3036b.f10381a;
        this.f10469e = byteBuffer;
        this.f10470f = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo14012a(int i, int i2, int i3) throws C3036b.C3037a {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new C3036b.C3037a(i, i2, i3);
        } else if (this.f10466b == i && this.f10467c == i2 && this.f10468d == i3) {
            return false;
        } else {
            this.f10466b = i;
            this.f10467c = i2;
            this.f10468d = i3;
            if (i3 != 2) {
                return true;
            }
            this.f10469e = C3036b.f10381a;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo14013b() {
        return this.f10471g && this.f10470f == C3036b.f10381a;
    }

    /* renamed from: c */
    public void mo14014c() {
        this.f10471g = true;
    }

    /* renamed from: d */
    public boolean mo14015d() {
        int i = this.f10468d;
        return (i == 0 || i == 2) ? false : true;
    }

    /* renamed from: e */
    public int mo14016e() {
        return 2;
    }

    /* renamed from: f */
    public int mo14017f() {
        return this.f10467c;
    }

    public void flush() {
        this.f10470f = C3036b.f10381a;
        this.f10471g = false;
    }

    /* renamed from: g */
    public void mo14019g() {
        flush();
        this.f10469e = C3036b.f10381a;
        this.f10466b = -1;
        this.f10467c = -1;
        this.f10468d = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14011a(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f10468d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 * 2
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f10469e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f10469e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f10469e
            r2.clear()
        L_0x003f:
            int r2 = r7.f10468d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f10469e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f10469e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f10469e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f10469e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f10469e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f10469e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f10469e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f10469e
            r7.f10470f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C3049f.mo14011a(java.nio.ByteBuffer):void");
    }

    /* renamed from: a */
    public ByteBuffer mo14010a() {
        ByteBuffer byteBuffer = this.f10470f;
        this.f10470f = C3036b.f10381a;
        return byteBuffer;
    }
}
