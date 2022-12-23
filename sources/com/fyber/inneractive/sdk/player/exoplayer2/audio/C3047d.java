package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C3036b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.d */
public final class C3047d implements C3036b {

    /* renamed from: b */
    public int f10455b = -1;

    /* renamed from: c */
    public int f10456c = -1;

    /* renamed from: d */
    public int[] f10457d;

    /* renamed from: e */
    public boolean f10458e;

    /* renamed from: f */
    public int[] f10459f;

    /* renamed from: g */
    public ByteBuffer f10460g;

    /* renamed from: h */
    public ByteBuffer f10461h;

    /* renamed from: i */
    public boolean f10462i;

    public C3047d() {
        ByteBuffer byteBuffer = C3036b.f10381a;
        this.f10460g = byteBuffer;
        this.f10461h = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo14012a(int i, int i2, int i3) throws C3036b.C3037a {
        boolean z = !Arrays.equals(this.f10457d, this.f10459f);
        int[] iArr = this.f10457d;
        this.f10459f = iArr;
        if (iArr == null) {
            this.f10458e = false;
            return z;
        } else if (i3 != 2) {
            throw new C3036b.C3037a(i, i2, i3);
        } else if (!z && this.f10456c == i && this.f10455b == i2) {
            return false;
        } else {
            this.f10456c = i;
            this.f10455b = i2;
            this.f10458e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f10459f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 < i2) {
                    this.f10458e = (i5 != i4) | this.f10458e;
                    i4++;
                } else {
                    throw new C3036b.C3037a(i, i2, i3);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo14013b() {
        return this.f10462i && this.f10461h == C3036b.f10381a;
    }

    /* renamed from: c */
    public void mo14014c() {
        this.f10462i = true;
    }

    /* renamed from: d */
    public boolean mo14015d() {
        return this.f10458e;
    }

    /* renamed from: e */
    public int mo14016e() {
        return 2;
    }

    /* renamed from: f */
    public int mo14017f() {
        int[] iArr = this.f10459f;
        return iArr == null ? this.f10455b : iArr.length;
    }

    public void flush() {
        this.f10461h = C3036b.f10381a;
        this.f10462i = false;
    }

    /* renamed from: g */
    public void mo14019g() {
        flush();
        this.f10460g = C3036b.f10381a;
        this.f10455b = -1;
        this.f10456c = -1;
        this.f10459f = null;
        this.f10458e = false;
    }

    /* renamed from: a */
    public void mo14011a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.f10455b * 2)) * this.f10459f.length * 2;
        if (this.f10460g.capacity() < length) {
            this.f10460g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f10460g.clear();
        }
        while (position < limit) {
            for (int i : this.f10459f) {
                this.f10460g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f10455b * 2;
        }
        byteBuffer.position(limit);
        this.f10460g.flip();
        this.f10461h = this.f10460g;
    }

    /* renamed from: a */
    public ByteBuffer mo14010a() {
        ByteBuffer byteBuffer = this.f10461h;
        this.f10461h = C3036b.f10381a;
        return byteBuffer;
    }
}
