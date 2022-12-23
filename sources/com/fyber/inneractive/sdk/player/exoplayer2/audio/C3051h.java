package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.audio.C3036b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.h */
public final class C3051h implements C3036b {

    /* renamed from: b */
    public int f10496b = -1;

    /* renamed from: c */
    public int f10497c = -1;

    /* renamed from: d */
    public C3050g f10498d;

    /* renamed from: e */
    public float f10499e = 1.0f;

    /* renamed from: f */
    public float f10500f = 1.0f;

    /* renamed from: g */
    public ByteBuffer f10501g;

    /* renamed from: h */
    public ShortBuffer f10502h;

    /* renamed from: i */
    public ByteBuffer f10503i;

    /* renamed from: j */
    public long f10504j;

    /* renamed from: k */
    public long f10505k;

    /* renamed from: l */
    public boolean f10506l;

    public C3051h() {
        ByteBuffer byteBuffer = C3036b.f10381a;
        this.f10501g = byteBuffer;
        this.f10502h = byteBuffer.asShortBuffer();
        this.f10503i = byteBuffer;
    }

    /* renamed from: a */
    public boolean mo14012a(int i, int i2, int i3) throws C3036b.C3037a {
        if (i3 != 2) {
            throw new C3036b.C3037a(i, i2, i3);
        } else if (this.f10497c == i && this.f10496b == i2) {
            return false;
        } else {
            this.f10497c = i;
            this.f10496b = i2;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo14013b() {
        C3050g gVar;
        if (!this.f10506l || ((gVar = this.f10498d) != null && gVar.f10489r != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo14014c() {
        int i;
        C3050g gVar = this.f10498d;
        int i2 = gVar.f10488q;
        float f = gVar.f10486o;
        float f2 = gVar.f10487p;
        int i3 = gVar.f10489r + ((int) ((((((float) i2) / (f / f2)) + ((float) gVar.f10490s)) / f2) + 0.5f));
        gVar.mo14046a((gVar.f10476e * 2) + i2);
        int i4 = 0;
        while (true) {
            i = gVar.f10476e * 2;
            int i5 = gVar.f10473b;
            if (i4 >= i * i5) {
                break;
            }
            gVar.f10479h[(i5 * i2) + i4] = 0;
            i4++;
        }
        gVar.f10488q += i;
        gVar.mo14045a();
        if (gVar.f10489r > i3) {
            gVar.f10489r = i3;
        }
        gVar.f10488q = 0;
        gVar.f10491t = 0;
        gVar.f10490s = 0;
        this.f10506l = true;
    }

    /* renamed from: d */
    public boolean mo14015d() {
        return Math.abs(this.f10499e - 1.0f) >= 0.01f || Math.abs(this.f10500f - 1.0f) >= 0.01f;
    }

    /* renamed from: e */
    public int mo14016e() {
        return 2;
    }

    /* renamed from: f */
    public int mo14017f() {
        return this.f10496b;
    }

    public void flush() {
        C3050g gVar = new C3050g(this.f10497c, this.f10496b);
        this.f10498d = gVar;
        gVar.f10486o = this.f10499e;
        gVar.f10487p = this.f10500f;
        this.f10503i = C3036b.f10381a;
        this.f10504j = 0;
        this.f10505k = 0;
        this.f10506l = false;
    }

    /* renamed from: g */
    public void mo14019g() {
        this.f10498d = null;
        ByteBuffer byteBuffer = C3036b.f10381a;
        this.f10501g = byteBuffer;
        this.f10502h = byteBuffer.asShortBuffer();
        this.f10503i = byteBuffer;
        this.f10496b = -1;
        this.f10497c = -1;
        this.f10504j = 0;
        this.f10505k = 0;
        this.f10506l = false;
    }

    /* renamed from: a */
    public void mo14011a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f10504j += (long) remaining;
            C3050g gVar = this.f10498d;
            gVar.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i = gVar.f10473b;
            int i2 = remaining2 / i;
            gVar.mo14046a(i2);
            asShortBuffer.get(gVar.f10479h, gVar.f10488q * gVar.f10473b, ((i * i2) * 2) / 2);
            gVar.f10488q += i2;
            gVar.mo14045a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = this.f10498d.f10489r * this.f10496b * 2;
        if (i3 > 0) {
            if (this.f10501g.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.f10501g = order;
                this.f10502h = order.asShortBuffer();
            } else {
                this.f10501g.clear();
                this.f10502h.clear();
            }
            C3050g gVar2 = this.f10498d;
            ShortBuffer shortBuffer = this.f10502h;
            gVar2.getClass();
            int min = Math.min(shortBuffer.remaining() / gVar2.f10473b, gVar2.f10489r);
            shortBuffer.put(gVar2.f10481j, 0, gVar2.f10473b * min);
            int i4 = gVar2.f10489r - min;
            gVar2.f10489r = i4;
            short[] sArr = gVar2.f10481j;
            int i5 = gVar2.f10473b;
            System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
            this.f10505k += (long) i3;
            this.f10501g.limit(i3);
            this.f10503i = this.f10501g;
        }
    }

    /* renamed from: a */
    public ByteBuffer mo14010a() {
        ByteBuffer byteBuffer = this.f10503i;
        this.f10503i = C3036b.f10381a;
        return byteBuffer;
    }
}
