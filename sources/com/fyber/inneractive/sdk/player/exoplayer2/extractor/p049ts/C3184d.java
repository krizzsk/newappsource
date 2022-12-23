package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3079e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3383c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3392j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.d */
public final class C3184d implements C3188h {

    /* renamed from: r */
    public static final byte[] f11306r = {73, 68, 51};

    /* renamed from: a */
    public final boolean f11307a;

    /* renamed from: b */
    public final C3392j f11308b = new C3392j(new byte[7]);

    /* renamed from: c */
    public final C3393k f11309c = new C3393k(Arrays.copyOf(f11306r, 10));

    /* renamed from: d */
    public final String f11310d;

    /* renamed from: e */
    public String f11311e;

    /* renamed from: f */
    public C3161n f11312f;

    /* renamed from: g */
    public C3161n f11313g;

    /* renamed from: h */
    public int f11314h;

    /* renamed from: i */
    public int f11315i;

    /* renamed from: j */
    public int f11316j;

    /* renamed from: k */
    public boolean f11317k;

    /* renamed from: l */
    public boolean f11318l;

    /* renamed from: m */
    public long f11319m;

    /* renamed from: n */
    public int f11320n;

    /* renamed from: o */
    public long f11321o;

    /* renamed from: p */
    public C3161n f11322p;

    /* renamed from: q */
    public long f11323q;

    public C3184d(boolean z, String str) {
        mo14248c();
        this.f11307a = z;
        this.f11310d = str;
    }

    /* renamed from: a */
    public void mo14242a() {
        mo14248c();
    }

    /* renamed from: b */
    public void mo14246b() {
    }

    /* renamed from: c */
    public final void mo14248c() {
        this.f11314h = 0;
        this.f11315i = 0;
        this.f11316j = 256;
    }

    /* renamed from: a */
    public void mo14244a(C3088h hVar, C3210v.C3214d dVar) {
        dVar.mo14271a();
        this.f11311e = dVar.mo14272b();
        this.f11312f = hVar.mo14122a(dVar.mo14273c(), 1);
        if (this.f11307a) {
            dVar.mo14271a();
            C3161n a = hVar.mo14122a(dVar.mo14273c(), 4);
            this.f11313g = a;
            a.mo14098a(C3226i.m8181a(dVar.mo14272b(), "application/id3", (String) null, -1, (C3059a) null));
            return;
        }
        this.f11313g = new C3079e();
    }

    /* renamed from: a */
    public void mo14243a(long j, boolean z) {
        this.f11321o = j;
    }

    /* renamed from: a */
    public void mo14245a(C3393k kVar) {
        C3393k kVar2 = kVar;
        while (kVar.mo14537a() > 0) {
            int i = this.f11314h;
            boolean z = true;
            if (i == 0) {
                byte[] bArr = kVar2.f12121a;
                int i2 = kVar2.f12122b;
                int i3 = kVar2.f12123c;
                while (true) {
                    if (i2 >= i3) {
                        kVar2.mo14549e(i2);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2] & 255;
                    int i5 = this.f11316j;
                    if (i5 != 512 || b < 240 || b == 255) {
                        byte b2 = b | i5;
                        if (b2 == 329) {
                            this.f11316j = 768;
                        } else if (b2 == 511) {
                            this.f11316j = 512;
                        } else if (b2 != 836) {
                            if (b2 == 1075) {
                                this.f11314h = 1;
                                this.f11315i = f11306r.length;
                                this.f11320n = 0;
                                this.f11309c.mo14549e(0);
                                kVar2.mo14549e(i4);
                                break;
                            } else if (i5 != 256) {
                                this.f11316j = 256;
                                i2 = i4 - 1;
                            }
                        } else {
                            this.f11316j = 1024;
                        }
                        i2 = i4;
                    } else {
                        if ((b & 1) != 0) {
                            z = false;
                        }
                        this.f11317k = z;
                        this.f11314h = 2;
                        this.f11315i = 0;
                        kVar2.mo14549e(i4);
                    }
                }
            } else if (i != 1) {
                if (i == 2) {
                    if (mo14247a(kVar2, this.f11308b.f12117a, this.f11317k ? 7 : 5)) {
                        this.f11308b.mo14534b(0);
                        if (!this.f11318l) {
                            int a = this.f11308b.mo14532a(2) + 1;
                            if (a != 2) {
                                a = 2;
                            }
                            int a2 = this.f11308b.mo14532a(4);
                            this.f11308b.mo14536c(1);
                            byte[] bArr2 = {(byte) (((a << 3) & 248) | ((a2 >> 1) & 7)), (byte) (((a2 << 7) & RecyclerView.C1119a0.FLAG_IGNORE) | ((this.f11308b.mo14532a(3) << 3) & 120))};
                            Pair<Integer, Integer> a3 = C3383c.m8512a(bArr2);
                            C3226i a4 = C3226i.m8178a(this.f11311e, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), -1, (List<byte[]>) Collections.singletonList(bArr2), (C3059a) null, 0, this.f11310d);
                            this.f11319m = 1024000000 / ((long) a4.f11646s);
                            this.f11312f.mo14098a(a4);
                            this.f11318l = true;
                        } else {
                            this.f11308b.mo14536c(10);
                        }
                        this.f11308b.mo14536c(4);
                        int a5 = (this.f11308b.mo14532a(13) - 2) - 5;
                        if (this.f11317k) {
                            a5 -= 2;
                        }
                        C3161n nVar = this.f11312f;
                        long j = this.f11319m;
                        this.f11314h = 3;
                        this.f11315i = 0;
                        this.f11322p = nVar;
                        this.f11323q = j;
                        this.f11320n = a5;
                    }
                } else if (i == 3) {
                    int min = Math.min(kVar.mo14537a(), this.f11320n - this.f11315i);
                    this.f11322p.mo14099a(kVar2, min);
                    int i6 = this.f11315i + min;
                    this.f11315i = i6;
                    int i7 = this.f11320n;
                    if (i6 == i7) {
                        this.f11322p.mo14096a(this.f11321o, 1, i7, 0, (byte[]) null);
                        this.f11321o += this.f11323q;
                        mo14248c();
                    }
                }
            } else if (mo14247a(kVar2, this.f11309c.f12121a, 10)) {
                this.f11313g.mo14099a(this.f11309c, 10);
                this.f11309c.mo14549e(6);
                C3161n nVar2 = this.f11313g;
                this.f11314h = 3;
                this.f11315i = 10;
                this.f11322p = nVar2;
                this.f11323q = 0;
                this.f11320n = this.f11309c.mo14556k() + 10;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo14247a(C3393k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo14537a(), i - this.f11315i);
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, this.f11315i, min);
        kVar.f12122b += min;
        int i2 = this.f11315i + min;
        this.f11315i = i2;
        return i2 == i;
    }
}
