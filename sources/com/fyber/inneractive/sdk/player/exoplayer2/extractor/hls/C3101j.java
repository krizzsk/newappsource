package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.MessageButton;
import com.fyber.inneractive.sdk.player.exoplayer2.C3221h;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3074d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3091c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3275b;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3276c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3283f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3301o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3302p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C3277a;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3328b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3372x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3388h;
import java.io.IOException;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j */
public final class C3101j implements C3372x.C3373a<C3277a>, C3302p, C3088h, C3074d.C3078d {

    /* renamed from: a */
    public final int f10688a;

    /* renamed from: b */
    public final C3103b f10689b;

    /* renamed from: c */
    public final C3091c f10690c;

    /* renamed from: d */
    public final C3328b f10691d;

    /* renamed from: e */
    public final C3226i f10692e;

    /* renamed from: f */
    public final int f10693f;

    /* renamed from: g */
    public final C3372x f10694g = new C3372x("Loader:HlsSampleStreamWrapper");

    /* renamed from: h */
    public final C3283f.C3284a f10695h;

    /* renamed from: i */
    public final C3091c.C3093b f10696i = new C3091c.C3093b();

    /* renamed from: j */
    public final SparseArray<C3074d> f10697j = new SparseArray<>();

    /* renamed from: k */
    public final LinkedList<C3097f> f10698k = new LinkedList<>();

    /* renamed from: l */
    public final Runnable f10699l = new C3102a();

    /* renamed from: m */
    public final Handler f10700m = new Handler();

    /* renamed from: n */
    public boolean f10701n;

    /* renamed from: o */
    public boolean f10702o;

    /* renamed from: p */
    public int f10703p;

    /* renamed from: q */
    public C3226i f10704q;

    /* renamed from: r */
    public int f10705r;

    /* renamed from: s */
    public boolean f10706s;

    /* renamed from: t */
    public C3305s f10707t;

    /* renamed from: u */
    public int f10708u;

    /* renamed from: v */
    public boolean[] f10709v;

    /* renamed from: w */
    public long f10710w;

    /* renamed from: x */
    public long f10711x;

    /* renamed from: y */
    public boolean f10712y;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$a */
    public class C3102a implements Runnable {
        public C3102a() {
        }

        public void run() {
            C3101j.this.mo14171i();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b */
    public interface C3103b {
    }

    public C3101j(int i, C3103b bVar, C3091c cVar, C3328b bVar2, long j, C3226i iVar, int i2, C3283f.C3284a aVar) {
        this.f10688a = i;
        this.f10689b = bVar;
        this.f10690c = cVar;
        this.f10691d = bVar2;
        this.f10692e = iVar;
        this.f10693f = i2;
        this.f10695h = aVar;
        this.f10710w = j;
        this.f10711x = j;
    }

    /* renamed from: a */
    public void mo14123a(C3124m mVar) {
    }

    /* renamed from: a */
    public void mo14166a(C3372x.C3375c cVar, long j, long j2, boolean z) {
        C3277a aVar = (C3277a) cVar;
        C3283f.C3284a aVar2 = this.f10695h;
        C3357j jVar = aVar.f11778a;
        int i = aVar.f11779b;
        int i2 = this.f10688a;
        C3226i iVar = aVar.f11780c;
        int i3 = aVar.f11781d;
        Object obj = aVar.f11782e;
        long j3 = aVar.f11783f;
        long j4 = aVar.f11784g;
        long c = aVar.mo14136c();
        if (aVar2.f11799b != null) {
            Handler handler = aVar2.f11798a;
            C3276c cVar2 = r2;
            C3276c cVar3 = new C3276c(aVar2, jVar, i, i2, iVar, i3, obj, j3, j4, j, j2, c);
            handler.post(cVar2);
        }
        if (!z) {
            int size = this.f10697j.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f10697j.valueAt(i4).mo14100a(this.f10709v[i4]);
            }
            ((C3098g) this.f10689b).mo14143a((C3302p) this);
        }
    }

    /* renamed from: c */
    public void mo14124c() {
        this.f10701n = true;
        this.f10700m.post(this.f10699l);
    }

    /* renamed from: d */
    public void mo14168d(long j) {
        this.f10710w = j;
        this.f10711x = j;
        this.f10712y = false;
        this.f10698k.clear();
        if (this.f10694g.mo14516b()) {
            this.f10694g.mo14515a();
            return;
        }
        int size = this.f10697j.size();
        for (int i = 0; i < size; i++) {
            this.f10697j.valueAt(i).mo14100a(this.f10709v[i]);
        }
    }

    /* renamed from: g */
    public void mo14169g() {
        if (!this.f10702o) {
            mo14144a(this.f10710w);
        }
    }

    /* renamed from: h */
    public final boolean mo14170h() {
        return this.f10711x != -9223372036854775807L;
    }

    /* renamed from: i */
    public final void mo14171i() {
        C3226i iVar;
        if (!this.f10706s && !this.f10702o && this.f10701n) {
            int size = this.f10697j.size();
            int i = 0;
            while (i < size) {
                if (this.f10697j.valueAt(i).mo14105e() != null) {
                    i++;
                } else {
                    return;
                }
            }
            int size2 = this.f10697j.size();
            int i2 = 0;
            char c = 0;
            int i3 = -1;
            while (true) {
                char c2 = 3;
                if (i2 >= size2) {
                    break;
                }
                String str = this.f10697j.valueAt(i2).mo14105e().f11633f;
                if (!C3388h.m8522e(str)) {
                    if (C3388h.m8521d(str)) {
                        c2 = 2;
                    } else if (MessageButton.TEXT.equals(C3388h.m8519b(str))) {
                        c2 = 1;
                    } else {
                        c2 = 0;
                    }
                }
                if (c2 > c) {
                    i3 = i2;
                    c = c2;
                } else if (c2 == c && i3 != -1) {
                    i3 = -1;
                }
                i2++;
            }
            C3304r rVar = this.f10690c.f10624f;
            int i4 = rVar.f11871a;
            this.f10708u = -1;
            this.f10709v = new boolean[size2];
            C3304r[] rVarArr = new C3304r[size2];
            for (int i5 = 0; i5 < size2; i5++) {
                C3226i e = this.f10697j.valueAt(i5).mo14105e();
                if (i5 == i3) {
                    C3226i[] iVarArr = new C3226i[i4];
                    for (int i6 = 0; i6 < i4; i6++) {
                        iVarArr[i6] = m7790a(rVar.f11872b[i6], e);
                    }
                    rVarArr[i5] = new C3304r(iVarArr);
                    this.f10708u = i5;
                } else {
                    if (c != 3 || !C3388h.m8521d(e.f11633f)) {
                        iVar = null;
                    } else {
                        iVar = this.f10692e;
                    }
                    rVarArr[i5] = new C3304r(m7790a(iVar, e));
                }
            }
            this.f10707t = new C3305s(rVarArr);
            this.f10702o = true;
            C3098g gVar = (C3098g) this.f10689b;
            int i7 = gVar.f10675k - 1;
            gVar.f10675k = i7;
            if (i7 <= 0) {
                int i8 = 0;
                for (C3101j jVar : gVar.f10678n) {
                    i8 += jVar.f10707t.f11875a;
                }
                C3304r[] rVarArr2 = new C3304r[i8];
                int i9 = 0;
                for (C3101j jVar2 : gVar.f10678n) {
                    int i11 = jVar2.f10707t.f11875a;
                    int i12 = 0;
                    while (i12 < i11) {
                        rVarArr2[i9] = jVar2.f10707t.f11876b[i12];
                        i12++;
                        i9++;
                    }
                }
                gVar.f10677m = new C3305s(rVarArr2);
                ((C3221h) gVar.f10674j).f11576f.obtainMessage(8, gVar).sendToTarget();
            }
        }
    }

    /* renamed from: j */
    public void mo14172j() throws IOException {
        this.f10694g.mo14517c();
        C3091c cVar = this.f10690c;
        IOException iOException = cVar.f10628j;
        if (iOException == null) {
            C3106a.C3107a aVar = cVar.f10629k;
            if (aVar != null) {
                C3113e.C3114a aVar2 = cVar.f10623e.f10783e.get(aVar);
                aVar2.f10794b.mo14517c();
                IOException iOException2 = aVar2.f10802j;
                if (iOException2 != null) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public void mo14165a(C3372x.C3375c cVar, long j, long j2) {
        C3277a aVar = (C3277a) cVar;
        C3091c cVar2 = this.f10690c;
        cVar2.getClass();
        if (aVar instanceof C3091c.C3092a) {
            C3091c.C3092a aVar2 = (C3091c.C3092a) aVar;
            cVar2.f10627i = aVar2.f11786i;
            cVar2.mo14126a(aVar2.f11778a.f12004a, aVar2.f10635l, aVar2.f10636m);
        }
        C3283f.C3284a aVar3 = this.f10695h;
        C3357j jVar = aVar.f11778a;
        int i = aVar.f11779b;
        int i2 = this.f10688a;
        C3226i iVar = aVar.f11780c;
        int i3 = aVar.f11781d;
        Object obj = aVar.f11782e;
        long j3 = aVar.f11783f;
        long j4 = aVar.f11784g;
        long c = aVar.mo14136c();
        if (aVar3.f11799b != null) {
            aVar3.f11798a.post(new C3275b(aVar3, jVar, i, i2, iVar, i3, obj, j3, j4, j, j2, c));
        }
        if (!this.f10702o) {
            mo14144a(this.f10710w);
        } else {
            ((C3098g) this.f10689b).mo14143a((C3302p) this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14162a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3372x.C3375c r30, long r31, long r33, java.io.IOException r35) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C3277a) r1
            long r2 = r1.mo14136c()
            boolean r4 = r1 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3097f
            r5 = 1
            if (r4 == 0) goto L_0x0018
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r2 = 0
            goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c r3 = r0.f10690c
            r3.getClass()
            if (r2 == 0) goto L_0x003b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r2 = r3.f10634p
            com.fyber.inneractive.sdk.player.exoplayer2.source.r r3 = r3.f10624f
            com.fyber.inneractive.sdk.player.exoplayer2.i r7 = r1.f11780c
            int r3 = r3.mo14430a((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r7)
            int r3 = r2.mo14444c(r3)
            r7 = 60000(0xea60, double:2.9644E-319)
            r15 = r35
            boolean r2 = com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C3278b.m8283a(r2, r3, r15, r7)
            if (r2 == 0) goto L_0x003d
            r2 = 1
            goto L_0x003e
        L_0x003b:
            r15 = r35
        L_0x003d:
            r2 = 0
        L_0x003e:
            if (r2 == 0) goto L_0x005f
            if (r4 == 0) goto L_0x0060
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.f10698k
            java.lang.Object r2 = r2.removeLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3097f) r2
            if (r2 != r1) goto L_0x004e
            r2 = 1
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r2)
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.f10698k
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0060
            long r2 = r0.f10710w
            r0.f10711x = r2
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            com.fyber.inneractive.sdk.player.exoplayer2.source.f$a r10 = r0.f10695h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r11 = r1.f11778a
            int r12 = r1.f11779b
            int r13 = r0.f10688a
            com.fyber.inneractive.sdk.player.exoplayer2.i r14 = r1.f11780c
            int r2 = r1.f11781d
            java.lang.Object r3 = r1.f11782e
            long r7 = r1.f11783f
            r17 = r7
            long r6 = r1.f11784g
            long r25 = r1.mo14136c()
            com.fyber.inneractive.sdk.player.exoplayer2.source.f r1 = r10.f11799b
            if (r1 == 0) goto L_0x0094
            android.os.Handler r1 = r10.f11798a
            com.fyber.inneractive.sdk.player.exoplayer2.source.d r4 = new com.fyber.inneractive.sdk.player.exoplayer2.source.d
            r9 = r4
            r15 = r2
            r16 = r3
            r19 = r6
            r21 = r31
            r23 = r33
            r27 = r35
            r28 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27, r28)
            r1.post(r4)
        L_0x0094:
            if (r5 == 0) goto L_0x00a9
            boolean r1 = r0.f10702o
            if (r1 != 0) goto L_0x00a0
            long r1 = r0.f10710w
            r0.mo14144a((long) r1)
            goto L_0x00a7
        L_0x00a0:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b r1 = r0.f10689b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3098g) r1
            r1.mo14143a((com.fyber.inneractive.sdk.player.exoplayer2.source.C3302p) r0)
        L_0x00a7:
            r6 = 2
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3101j.mo14162a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$c, long, long, java.io.IOException):int");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C3161n mo14122a(int i, int i2) {
        return mo14163a(i);
    }

    /* renamed from: a */
    public boolean mo14167a(C3321e[] eVarArr, boolean[] zArr, C3301o[] oVarArr, boolean[] zArr2, boolean z) {
        C3321e eVar;
        C3380a.m8507b(this.f10702o);
        for (int i = 0; i < eVarArr.length; i++) {
            C3100i iVar = oVarArr[i];
            if (iVar != null && (eVarArr[i] == null || !zArr[i])) {
                int i2 = iVar.f10686a;
                mo14164a(i2, false);
                this.f10697j.valueAt(i2).mo14102b();
                oVarArr[i] = null;
            }
        }
        C3321e eVar2 = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (oVarArr[i3] == null && (eVar = eVarArr[i3]) != null) {
                int a = this.f10707t.mo14434a(eVar.mo14442b());
                mo14164a(a, true);
                if (a == this.f10708u) {
                    this.f10690c.f10634p = eVar;
                    eVar2 = eVar;
                }
                oVarArr[i3] = new C3100i(this, a);
                zArr2[i3] = true;
                z2 = true;
            }
        }
        if (z) {
            int size = this.f10697j.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f10709v[i4]) {
                    this.f10697j.valueAt(i4).mo14102b();
                }
            }
            if (eVar2 != null && !this.f10698k.isEmpty()) {
                eVar2.mo14128a(0);
                if (eVar2.mo14437a() != this.f10690c.f10624f.mo14430a(this.f10698k.getLast().f11780c)) {
                    mo14168d(this.f10710w);
                }
            }
        }
        if (this.f10703p == 0) {
            this.f10690c.f10628j = null;
            this.f10704q = null;
            this.f10698k.clear();
            if (this.f10694g.mo14516b()) {
                this.f10694g.mo14515a();
            }
        }
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0112  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14144a(long r37) {
        /*
            r36 = this;
            r0 = r36
            boolean r1 = r0.f10712y
            if (r1 != 0) goto L_0x02fd
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.x r1 = r0.f10694g
            boolean r1 = r1.mo14516b()
            if (r1 == 0) goto L_0x0010
            goto L_0x02fd
        L_0x0010:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c r1 = r0.f10690c
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r3 = r0.f10698k
            boolean r3 = r3.isEmpty()
            r4 = 0
            if (r3 == 0) goto L_0x001d
            r3 = r4
            goto L_0x0025
        L_0x001d:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r3 = r0.f10698k
            java.lang.Object r3 = r3.getLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3097f) r3
        L_0x0025:
            long r5 = r0.f10711x
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r5 = r37
        L_0x0033:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$b r9 = r0.f10696i
            if (r3 != 0) goto L_0x0039
            r8 = -1
            goto L_0x0041
        L_0x0039:
            com.fyber.inneractive.sdk.player.exoplayer2.source.r r8 = r1.f10624f
            com.fyber.inneractive.sdk.player.exoplayer2.i r10 = r3.f11780c
            int r8 = r8.mo14430a((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r10)
        L_0x0041:
            r1.f10629k = r4
            r10 = 0
            if (r3 != 0) goto L_0x0048
            goto L_0x004f
        L_0x0048:
            long r13 = r3.f11783f
            long r13 = r13 - r5
            long r10 = java.lang.Math.max(r10, r13)
        L_0x004f:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r12 = r1.f10634p
            r12.mo14128a((long) r10)
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r10 = r1.f10634p
            int r10 = r10.mo14437a()
            r13 = 1
            if (r8 == r10) goto L_0x005f
            r11 = 1
            goto L_0x0060
        L_0x005f:
            r11 = 0
        L_0x0060:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a[] r12 = r1.f10622d
            r12 = r12[r10]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r14 = r1.f10623e
            boolean r14 = r14.mo14180b((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a.C3107a) r12)
            if (r14 != 0) goto L_0x0072
            r9.f10639c = r12
            r1.f10629k = r12
            goto L_0x0257
        L_0x0072:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r14 = r1.f10623e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r14 = r14.mo14179a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a.C3107a) r12)
            if (r3 == 0) goto L_0x0085
            if (r11 == 0) goto L_0x007d
            goto L_0x0085
        L_0x007d:
            int r5 = r3.f11789i
            int r5 = r5 + r13
            r15 = r5
        L_0x0081:
            r8 = r10
            r2 = r12
            goto L_0x0105
        L_0x0085:
            if (r3 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            long r5 = r3.f11783f
        L_0x008a:
            boolean r11 = r14.f10738j
            if (r11 != 0) goto L_0x00a9
            r11 = r8
            long r7 = r14.f10732d
            r21 = r3
            long r2 = r14.f10743o
            long r7 = r7 + r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ac
            int r2 = r14.f10735g
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r3 = r14.f10741m
            int r3 = r3.size()
            int r3 = r3 + r2
            r15 = r3
            r8 = r10
            r2 = r12
            r3 = r21
            goto L_0x0105
        L_0x00a9:
            r21 = r3
            r11 = r8
        L_0x00ac:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r2 = r14.f10741m
            long r7 = r14.f10732d
            long r5 = r5 - r7
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r5 = r1.f10623e
            boolean r5 = r5.f10792n
            if (r5 == 0) goto L_0x00c0
            if (r21 != 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r5 = 0
            goto L_0x00c1
        L_0x00c0:
            r5 = 1
        L_0x00c1:
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            int r6 = java.util.Collections.binarySearch(r2, r3)
            if (r6 >= 0) goto L_0x00cd
            int r6 = r6 + 2
            int r2 = -r6
            goto L_0x00e0
        L_0x00cd:
            r7 = -1
        L_0x00ce:
            int r6 = r6 + r7
            if (r6 < 0) goto L_0x00de
            java.lang.Object r8 = r2.get(r6)
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00de
            goto L_0x00ce
        L_0x00de:
            int r2 = r6 + 1
        L_0x00e0:
            if (r5 == 0) goto L_0x00e7
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x00e7:
            int r3 = r14.f10735g
            int r2 = r2 + r3
            if (r2 >= r3) goto L_0x0100
            if (r21 == 0) goto L_0x0100
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a[] r2 = r1.f10622d
            r2 = r2[r11]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r3 = r1.f10623e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r14 = r3.mo14179a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a.C3107a) r2)
            r3 = r21
            int r5 = r3.f11789i
            int r5 = r5 + r13
            r15 = r5
            r8 = r11
            goto L_0x0105
        L_0x0100:
            r3 = r21
            r15 = r2
            goto L_0x0081
        L_0x0105:
            int r5 = r14.f10735g
            if (r15 >= r5) goto L_0x0112
            com.fyber.inneractive.sdk.player.exoplayer2.source.g r2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.g
            r2.<init>()
            r1.f10628j = r2
            goto L_0x0257
        L_0x0112:
            int r5 = r15 - r5
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r6 = r14.f10741m
            int r6 = r6.size()
            if (r5 < r6) goto L_0x012a
            boolean r3 = r14.f10738j
            if (r3 == 0) goto L_0x0124
            r9.f10638b = r13
            goto L_0x0257
        L_0x0124:
            r9.f10639c = r2
            r1.f10629k = r2
            goto L_0x0257
        L_0x012a:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r6 = r14.f10741m
            java.lang.Object r5 = r6.get(r5)
            r12 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r12 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3108b.C3109a) r12
            boolean r5 = r12.f10748e
            if (r5 == 0) goto L_0x019f
            java.lang.String r5 = r14.f10753a
            java.lang.String r6 = r12.f10749f
            android.net.Uri r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3405t.m8584a(r5, r6)
            android.net.Uri r6 = r1.f10630l
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x018d
            java.lang.String r2 = r12.f10750g
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r3 = r1.f10634p
            int r3 = r3.mo14129d()
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r6 = r1.f10634p
            java.lang.Object r6 = r6.mo14131g()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r7 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j
            r27 = 0
            r29 = 0
            r31 = -1
            r33 = 0
            r34 = 1
            r26 = 0
            r24 = r7
            r25 = r5
            r24.<init>(r25, r26, r27, r29, r31, r33, r34)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$a r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$a
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r10 = r1.f10620b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a[] r11 = r1.f10622d
            r8 = r11[r8]
            com.fyber.inneractive.sdk.player.exoplayer2.i r8 = r8.f10729b
            byte[] r1 = r1.f10627i
            r24 = r5
            r25 = r10
            r26 = r7
            r27 = r8
            r28 = r3
            r29 = r6
            r30 = r1
            r31 = r2
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r9.f10637a = r5
            goto L_0x0257
        L_0x018d:
            java.lang.String r6 = r12.f10750g
            java.lang.String r7 = r1.f10632n
            boolean r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8596a((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 != 0) goto L_0x01a7
            java.lang.String r6 = r12.f10750g
            byte[] r7 = r1.f10631m
            r1.mo14126a(r5, r6, r7)
            goto L_0x01a7
        L_0x019f:
            r1.f10630l = r4
            r1.f10631m = r4
            r1.f10632n = r4
            r1.f10633o = r4
        L_0x01a7:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r5 = r14.f10740l
            if (r5 == 0) goto L_0x01cc
            java.lang.String r6 = r14.f10753a
            java.lang.String r7 = r5.f10744a
            android.net.Uri r25 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3405t.m8584a(r6, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r6 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j
            long r7 = r5.f10751h
            long r10 = r5.f10752i
            r33 = 0
            r34 = 0
            r26 = 0
            r24 = r6
            r27 = r7
            r29 = r7
            r31 = r10
            r24.<init>(r25, r26, r27, r29, r31, r33, r34)
            r8 = r6
            goto L_0x01cd
        L_0x01cc:
            r8 = r4
        L_0x01cd:
            long r5 = r14.f10732d
            long r10 = r12.f10747d
            long r20 = r5 + r10
            int r5 = r14.f10734f
            int r6 = r12.f10746c
            int r11 = r5 + r6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.k r5 = r1.f10621c
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r6 = r5.f10714a
            java.lang.Object r6 = r6.get(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r6 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r) r6
            if (r6 != 0) goto L_0x01f6
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r6 = new com.fyber.inneractive.sdk.player.exoplayer2.util.r
            r7 = r14
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.<init>(r13)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r5 = r5.f10714a
            r5.put(r11, r6)
            goto L_0x01f7
        L_0x01f6:
            r7 = r14
        L_0x01f7:
            r24 = r6
            java.lang.String r5 = r7.f10753a
            java.lang.String r6 = r12.f10744a
            android.net.Uri r26 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3405t.m8584a(r5, r6)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r25 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j
            r7 = r25
            long r5 = r12.f10751h
            long r13 = r12.f10752i
            r34 = 0
            r35 = 0
            r27 = 0
            r28 = r5
            r30 = r5
            r32 = r13
            r25.<init>(r26, r27, r28, r30, r32, r34, r35)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r13 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f
            r5 = r13
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r6 = r1.f10619a
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.i> r10 = r1.f10625g
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r14 = r1.f10634p
            int r14 = r14.mo14129d()
            r25 = r11
            r11 = r14
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r14 = r1.f10634p
            java.lang.Object r14 = r14.mo14131g()
            r4 = r12
            r12 = r14
            r38 = r13
            long r13 = r4.f10745b
            long r13 = r20 + r13
            r4 = r15
            r15 = r13
            boolean r13 = r1.f10626h
            r19 = r13
            byte[] r13 = r1.f10631m
            r22 = r13
            byte[] r1 = r1.f10633o
            r23 = r1
            r1 = r9
            r9 = r2
            r2 = r38
            r13 = r20
            r17 = r4
            r18 = r25
            r20 = r24
            r21 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            r1.f10637a = r2
        L_0x0257:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$b r1 = r0.f10696i
            boolean r2 = r1.f10638b
            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r3 = r1.f10637a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r4 = r1.f10639c
            r5 = 0
            r1.f10637a = r5
            r6 = 0
            r1.f10638b = r6
            r1.f10639c = r5
            if (r2 == 0) goto L_0x026d
            r1 = 1
            r0.f10712y = r1
            return r1
        L_0x026d:
            r1 = 1
            if (r3 != 0) goto L_0x0285
            if (r4 == 0) goto L_0x0283
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b r1 = r0.f10689b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3098g) r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r1 = r1.f10665a
            java.util.IdentityHashMap<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$a> r1 = r1.f10783e
            java.lang.Object r1 = r1.get(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e.C3114a) r1
            r1.mo14183b()
        L_0x0283:
            r1 = 0
            return r1
        L_0x0285:
            boolean r2 = r3 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3097f
            if (r2 == 0) goto L_0x02d0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f10711x = r4
            r2 = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3097f) r2
            r2.f10645D = r0
            int r4 = r2.f10648j
            boolean r5 = r2.f10658t
            r0.f10705r = r4
            r6 = 0
        L_0x029c:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r7 = r0.f10697j
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x02b3
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r7 = r0.f10697j
            java.lang.Object r7 = r7.valueAt(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3074d) r7
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$c r7 = r7.f10555c
            r7.f10588r = r4
            int r6 = r6 + 1
            goto L_0x029c
        L_0x02b3:
            if (r5 == 0) goto L_0x02cb
            r4 = 0
        L_0x02b6:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r5 = r0.f10697j
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x02cb
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r5 = r0.f10697j
            java.lang.Object r5 = r5.valueAt(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3074d) r5
            r5.f10565m = r1
            int r4 = r4 + 1
            goto L_0x02b6
        L_0x02cb:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r4 = r0.f10698k
            r4.add(r2)
        L_0x02d0:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.x r2 = r0.f10694g
            int r4 = r0.f10693f
            long r17 = r2.mo14514a(r3, r0, r4)
            com.fyber.inneractive.sdk.player.exoplayer2.source.f$a r6 = r0.f10695h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r7 = r3.f11778a
            int r8 = r3.f11779b
            int r9 = r0.f10688a
            com.fyber.inneractive.sdk.player.exoplayer2.i r10 = r3.f11780c
            int r11 = r3.f11781d
            java.lang.Object r12 = r3.f11782e
            long r13 = r3.f11783f
            long r2 = r3.f11784g
            com.fyber.inneractive.sdk.player.exoplayer2.source.f r4 = r6.f11799b
            if (r4 == 0) goto L_0x02fc
            android.os.Handler r4 = r6.f11798a
            com.fyber.inneractive.sdk.player.exoplayer2.source.a r15 = new com.fyber.inneractive.sdk.player.exoplayer2.source.a
            r5 = r15
            r1 = r15
            r15 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
            r4.post(r1)
            r1 = 1
        L_0x02fc:
            return r1
        L_0x02fd:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C3101j.mo14144a(long):boolean");
    }

    /* renamed from: a */
    public long mo14138a() {
        if (mo14170h()) {
            return this.f10711x;
        }
        if (this.f10712y) {
            return Long.MIN_VALUE;
        }
        return this.f10698k.getLast().f11784g;
    }

    /* renamed from: a */
    public C3074d mo14163a(int i) {
        if (this.f10697j.indexOfKey(i) >= 0) {
            return this.f10697j.get(i);
        }
        C3074d dVar = new C3074d(this.f10691d);
        dVar.f10566n = this;
        dVar.f10555c.f10588r = this.f10705r;
        this.f10697j.put(i, dVar);
        return dVar;
    }

    /* renamed from: a */
    public void mo14111a(C3226i iVar) {
        this.f10700m.post(this.f10699l);
    }

    /* renamed from: a */
    public final void mo14164a(int i, boolean z) {
        int i2 = 1;
        C3380a.m8507b(this.f10709v[i] != z);
        this.f10709v[i] = z;
        int i3 = this.f10703p;
        if (!z) {
            i2 = -1;
        }
        this.f10703p = i3 + i2;
    }

    /* renamed from: a */
    public static C3226i m7790a(C3226i iVar, C3226i iVar2) {
        C3226i iVar3 = iVar;
        C3226i iVar4 = iVar2;
        if (iVar3 == null) {
            return iVar4;
        }
        String str = null;
        int c = C3388h.m8520c(iVar4.f11633f);
        if (c == 1) {
            str = m7791a(iVar3.f11630c, 1);
        } else if (c == 2) {
            str = m7791a(iVar3.f11630c, 2);
        }
        return new C3226i(iVar3.f11628a, iVar4.f11632e, iVar4.f11633f, str, iVar3.f11629b, iVar4.f11634g, iVar3.f11637j, iVar3.f11638k, iVar4.f11639l, iVar4.f11640m, iVar4.f11641n, iVar4.f11643p, iVar4.f11642o, iVar4.f11644q, iVar4.f11645r, iVar4.f11646s, iVar4.f11647t, iVar4.f11648u, iVar4.f11649v, iVar3.f11651x, iVar3.f11652y, iVar4.f11653z, iVar4.f11650w, iVar4.f11635h, iVar4.f11636i, iVar4.f11631d);
    }

    /* renamed from: a */
    public static String m7791a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (i == C3388h.m8520c(C3388h.m8518a(str2))) {
                if (sb.length() > 0) {
                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
