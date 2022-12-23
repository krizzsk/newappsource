package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3392j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.o */
public final class C3200o implements C3210v {

    /* renamed from: a */
    public final C3188h f11459a;

    /* renamed from: b */
    public final C3392j f11460b = new C3392j(new byte[10]);

    /* renamed from: c */
    public int f11461c = 0;

    /* renamed from: d */
    public int f11462d;

    /* renamed from: e */
    public C3403r f11463e;

    /* renamed from: f */
    public boolean f11464f;

    /* renamed from: g */
    public boolean f11465g;

    /* renamed from: h */
    public boolean f11466h;

    /* renamed from: i */
    public int f11467i;

    /* renamed from: j */
    public int f11468j;

    /* renamed from: k */
    public boolean f11469k;

    /* renamed from: l */
    public long f11470l;

    public C3200o(C3188h hVar) {
        this.f11459a = hVar;
    }

    /* renamed from: a */
    public void mo14265a(C3403r rVar, C3088h hVar, C3210v.C3214d dVar) {
        this.f11463e = rVar;
        this.f11459a.mo14244a(hVar, dVar);
    }

    /* renamed from: a */
    public final void mo14262a() {
        this.f11461c = 0;
        this.f11462d = 0;
        this.f11466h = false;
        this.f11459a.mo14242a();
    }

    /* renamed from: a */
    public final void mo14264a(C3393k kVar, boolean z) {
        boolean z2;
        if (z) {
            int i = this.f11461c;
            if (i != 2 && i == 3) {
                this.f11459a.mo14246b();
            }
            mo14263a(1);
        }
        while (kVar.mo14537a() > 0) {
            int i2 = this.f11461c;
            if (i2 != 0) {
                int i3 = 0;
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (mo14266a(kVar, this.f11460b.f12117a, Math.min(10, this.f11467i)) && mo14266a(kVar, (byte[]) null, this.f11467i)) {
                            this.f11460b.mo14534b(0);
                            this.f11470l = -9223372036854775807L;
                            if (this.f11464f) {
                                this.f11460b.mo14536c(4);
                                this.f11460b.mo14536c(1);
                                this.f11460b.mo14536c(1);
                                long a = (((long) this.f11460b.mo14532a(3)) << 30) | ((long) (this.f11460b.mo14532a(15) << 15)) | ((long) this.f11460b.mo14532a(15));
                                this.f11460b.mo14536c(1);
                                if (!this.f11466h && this.f11465g) {
                                    this.f11460b.mo14536c(4);
                                    this.f11460b.mo14536c(1);
                                    this.f11460b.mo14536c(1);
                                    long a2 = (long) this.f11460b.mo14532a(15);
                                    this.f11460b.mo14536c(1);
                                    this.f11463e.mo14584b(a2 | (((long) this.f11460b.mo14532a(3)) << 30) | ((long) (this.f11460b.mo14532a(15) << 15)));
                                    this.f11466h = true;
                                }
                                this.f11470l = this.f11463e.mo14584b(a);
                            }
                            this.f11459a.mo14243a(this.f11470l, this.f11469k);
                            mo14263a(3);
                        }
                    } else if (i2 == 3) {
                        int a3 = kVar.mo14537a();
                        int i4 = this.f11468j;
                        if (i4 != -1) {
                            i3 = a3 - i4;
                        }
                        if (i3 > 0) {
                            a3 -= i3;
                            kVar.mo14547d(kVar.f12122b + a3);
                        }
                        this.f11459a.mo14245a(kVar);
                        int i5 = this.f11468j;
                        if (i5 != -1) {
                            int i6 = i5 - a3;
                            this.f11468j = i6;
                            if (i6 == 0) {
                                this.f11459a.mo14246b();
                                mo14263a(1);
                            }
                        }
                    }
                } else if (mo14266a(kVar, this.f11460b.f12117a, 9)) {
                    this.f11460b.mo14534b(0);
                    if (this.f11460b.mo14532a(24) != 1) {
                        this.f11468j = -1;
                        z2 = false;
                    } else {
                        this.f11460b.mo14536c(8);
                        int a4 = this.f11460b.mo14532a(16);
                        this.f11460b.mo14536c(5);
                        this.f11469k = this.f11460b.mo14535b();
                        this.f11460b.mo14536c(2);
                        this.f11464f = this.f11460b.mo14535b();
                        this.f11465g = this.f11460b.mo14535b();
                        this.f11460b.mo14536c(6);
                        int a5 = this.f11460b.mo14532a(8);
                        this.f11467i = a5;
                        if (a4 == 0) {
                            this.f11468j = -1;
                        } else {
                            this.f11468j = ((a4 + 6) - 9) - a5;
                        }
                        z2 = true;
                    }
                    if (z2) {
                        i3 = 2;
                    }
                    mo14263a(i3);
                }
            } else {
                kVar.mo14551f(kVar.mo14537a());
            }
        }
    }

    /* renamed from: a */
    public final void mo14263a(int i) {
        this.f11461c = i;
        this.f11462d = 0;
    }

    /* renamed from: a */
    public final boolean mo14266a(C3393k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo14537a(), i - this.f11462d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kVar.mo14551f(min);
        } else {
            System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, this.f11462d, min);
            kVar.f12122b += min;
        }
        int i2 = this.f11462d + min;
        this.f11462d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }
}
