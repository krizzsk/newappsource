package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3398p;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.l */
public final class C3359l implements C3327a0<Object> {

    /* renamed from: a */
    public final C3398p f12019a;

    /* renamed from: b */
    public int f12020b;

    /* renamed from: c */
    public long f12021c;

    /* renamed from: d */
    public long f12022d;

    /* renamed from: e */
    public long f12023e;

    /* renamed from: f */
    public long f12024f;

    /* renamed from: g */
    public long f12025g;

    public C3359l(Handler handler, C3348d dVar) {
        this((Handler) null, (C3348d) null, 2000);
    }

    /* renamed from: a */
    public synchronized void mo14508a(Object obj, C3357j jVar) {
        if (this.f12020b == 0) {
            this.f12021c = SystemClock.elapsedRealtime();
        }
        this.f12020b++;
    }

    public C3359l(Handler handler, C3348d dVar, int i) {
        this.f12019a = new C3398p(i);
        this.f12025g = -1;
    }

    /* renamed from: a */
    public synchronized void mo14507a(Object obj) {
        C3398p.C3401c cVar;
        float f;
        int i = 0;
        C3380a.m8507b(this.f12020b > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = (int) (elapsedRealtime - this.f12021c);
        long j = (long) i2;
        this.f12023e += j;
        long j2 = this.f12024f;
        long j3 = this.f12022d;
        this.f12024f = j2 + j3;
        if (i2 > 0) {
            float f2 = (float) ((8000 * j3) / j);
            C3398p pVar = this.f12019a;
            int sqrt = (int) Math.sqrt((double) j3);
            if (pVar.f12134d != 1) {
                Collections.sort(pVar.f12132b, C3398p.f12129h);
                pVar.f12134d = 1;
            }
            int i3 = pVar.f12137g;
            if (i3 > 0) {
                C3398p.C3401c[] cVarArr = pVar.f12133c;
                int i4 = i3 - 1;
                pVar.f12137g = i4;
                cVar = cVarArr[i4];
            } else {
                cVar = new C3398p.C3401c();
            }
            int i5 = pVar.f12135e;
            pVar.f12135e = i5 + 1;
            cVar.f12138a = i5;
            cVar.f12139b = sqrt;
            cVar.f12140c = f2;
            pVar.f12132b.add(cVar);
            pVar.f12136f += sqrt;
            while (true) {
                int i6 = pVar.f12136f;
                int i7 = pVar.f12131a;
                if (i6 <= i7) {
                    break;
                }
                int i8 = i6 - i7;
                C3398p.C3401c cVar2 = pVar.f12132b.get(0);
                int i9 = cVar2.f12139b;
                if (i9 <= i8) {
                    pVar.f12136f -= i9;
                    pVar.f12132b.remove(0);
                    int i11 = pVar.f12137g;
                    if (i11 < 5) {
                        C3398p.C3401c[] cVarArr2 = pVar.f12133c;
                        pVar.f12137g = i11 + 1;
                        cVarArr2[i11] = cVar2;
                    }
                } else {
                    cVar2.f12139b = i9 - i8;
                    pVar.f12136f -= i8;
                }
            }
            if (this.f12023e >= 2000 || this.f12024f >= 524288) {
                C3398p pVar2 = this.f12019a;
                if (pVar2.f12134d != 0) {
                    Collections.sort(pVar2.f12132b, C3398p.f12130i);
                    pVar2.f12134d = 0;
                }
                float f3 = 0.5f * ((float) pVar2.f12136f);
                int i12 = 0;
                while (true) {
                    if (i < pVar2.f12132b.size()) {
                        C3398p.C3401c cVar3 = pVar2.f12132b.get(i);
                        i12 += cVar3.f12139b;
                        if (((float) i12) >= f3) {
                            f = cVar3.f12140c;
                            break;
                        }
                        i++;
                    } else if (pVar2.f12132b.isEmpty()) {
                        f = Float.NaN;
                    } else {
                        ArrayList<C3398p.C3401c> arrayList = pVar2.f12132b;
                        f = arrayList.get(arrayList.size() - 1).f12140c;
                    }
                }
                this.f12025g = Float.isNaN(f) ? -1 : (long) f;
            }
        }
        int i13 = this.f12020b - 1;
        this.f12020b = i13;
        if (i13 > 0) {
            this.f12021c = elapsedRealtime;
        }
        this.f12022d = 0;
    }
}
