package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.d */
public final class C3167d {

    /* renamed from: a */
    public final C3168e f11233a = new C3168e();

    /* renamed from: b */
    public final C3393k f11234b = new C3393k(new byte[65025], 0);

    /* renamed from: c */
    public int f11235c = -1;

    /* renamed from: d */
    public int f11236d;

    /* renamed from: e */
    public boolean f11237e;

    /* renamed from: a */
    public boolean mo14233a(C3087g gVar) throws IOException, InterruptedException {
        int i;
        C3380a.m8507b(gVar != null);
        if (this.f11237e) {
            this.f11237e = false;
            this.f11234b.mo14563r();
        }
        while (!this.f11237e) {
            if (this.f11235c < 0) {
                if (!this.f11233a.mo14235a(gVar, true)) {
                    return false;
                }
                C3168e eVar = this.f11233a;
                int i2 = eVar.f11242d;
                if ((eVar.f11239a & 1) == 1 && this.f11234b.f12123c == 0) {
                    i2 += mo14232a(0);
                    i = this.f11236d + 0;
                } else {
                    i = 0;
                }
                ((C3072b) gVar).mo14088c(i2);
                this.f11235c = i;
            }
            int a = mo14232a(this.f11235c);
            int i3 = this.f11235c + this.f11236d;
            if (a > 0) {
                int b = this.f11234b.mo14542b();
                C3393k kVar = this.f11234b;
                int i4 = kVar.f12123c + a;
                if (b < i4) {
                    kVar.f12121a = Arrays.copyOf(kVar.f12121a, i4);
                }
                C3393k kVar2 = this.f11234b;
                ((C3072b) gVar).mo14087b(kVar2.f12121a, kVar2.f12123c, a, false);
                C3393k kVar3 = this.f11234b;
                kVar3.mo14547d(kVar3.f12123c + a);
                this.f11237e = this.f11233a.f11244f[i3 + -1] != 255;
            }
            if (i3 == this.f11233a.f11241c) {
                i3 = -1;
            }
            this.f11235c = i3;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo14232a(int i) {
        int i2;
        int i3 = 0;
        this.f11236d = 0;
        do {
            int i4 = this.f11236d;
            int i5 = i + i4;
            C3168e eVar = this.f11233a;
            if (i5 >= eVar.f11241c) {
                break;
            }
            int[] iArr = eVar.f11244f;
            this.f11236d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
