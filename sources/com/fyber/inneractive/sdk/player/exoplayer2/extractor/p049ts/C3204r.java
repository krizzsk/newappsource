package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.r */
public final class C3204r implements C3210v {

    /* renamed from: a */
    public final C3203q f11485a;

    /* renamed from: b */
    public final C3393k f11486b = new C3393k(32);

    /* renamed from: c */
    public int f11487c;

    /* renamed from: d */
    public int f11488d;

    /* renamed from: e */
    public boolean f11489e;

    /* renamed from: f */
    public boolean f11490f;

    public C3204r(C3203q qVar) {
        this.f11485a = qVar;
    }

    /* renamed from: a */
    public void mo14265a(C3403r rVar, C3088h hVar, C3210v.C3214d dVar) {
        this.f11485a.mo14268a(rVar, hVar, dVar);
        this.f11490f = true;
    }

    /* renamed from: a */
    public void mo14262a() {
        this.f11490f = true;
    }

    /* renamed from: a */
    public void mo14264a(C3393k kVar, boolean z) {
        int i;
        if (z) {
            i = kVar.f12122b + kVar.mo14557l();
        } else {
            i = -1;
        }
        if (this.f11490f) {
            if (z) {
                this.f11490f = false;
                kVar.mo14549e(i);
                this.f11488d = 0;
            } else {
                return;
            }
        }
        while (kVar.mo14537a() > 0) {
            int i2 = this.f11488d;
            boolean z2 = true;
            if (i2 < 3) {
                if (i2 == 0) {
                    int l = kVar.mo14557l();
                    kVar.mo14549e(kVar.f12122b - 1);
                    if (l == 255) {
                        this.f11490f = true;
                        return;
                    }
                }
                int min = Math.min(kVar.mo14537a(), 3 - this.f11488d);
                kVar.mo14541a(this.f11486b.f12121a, this.f11488d, min);
                int i3 = this.f11488d + min;
                this.f11488d = i3;
                if (i3 == 3) {
                    this.f11486b.mo14545c(3);
                    this.f11486b.mo14551f(1);
                    int l2 = this.f11486b.mo14557l();
                    int l3 = this.f11486b.mo14557l();
                    if ((l2 & RecyclerView.C1119a0.FLAG_IGNORE) == 0) {
                        z2 = false;
                    }
                    this.f11489e = z2;
                    this.f11487c = (((l2 & 15) << 8) | l3) + 3;
                    int b = this.f11486b.mo14542b();
                    int i4 = this.f11487c;
                    if (b < i4) {
                        C3393k kVar2 = this.f11486b;
                        byte[] bArr = kVar2.f12121a;
                        kVar2.mo14545c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f11486b.f12121a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(kVar.mo14537a(), this.f11487c - this.f11488d);
                kVar.mo14541a(this.f11486b.f12121a, this.f11488d, min2);
                int i5 = this.f11488d + min2;
                this.f11488d = i5;
                int i6 = this.f11487c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f11489e) {
                        byte[] bArr2 = this.f11486b.f12121a;
                        int i7 = C3406u.f12148a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = C3406u.f12155h[((i8 >>> 24) ^ (bArr2[i9] & 255)) & 255] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f11490f = true;
                            return;
                        }
                        this.f11486b.mo14545c(this.f11487c - 4);
                    } else {
                        this.f11486b.mo14545c(i6);
                    }
                    this.f11485a.mo14267a(this.f11486b);
                    this.f11488d = 0;
                }
            }
        }
    }
}
