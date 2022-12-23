package com.fyber.inneractive.sdk.player.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.fyber.inneractive.sdk.player.exoplayer2.C3067e;
import com.fyber.inneractive.sdk.player.exoplayer2.C3221h;
import com.fyber.inneractive.sdk.player.exoplayer2.C3270p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3323f;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3324g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.g */
public final class C3220g implements C3067e {

    /* renamed from: a */
    public final C3268n[] f11543a;

    /* renamed from: b */
    public final C3324g f11544b;

    /* renamed from: c */
    public final C3323f f11545c;

    /* renamed from: d */
    public final Handler f11546d;

    /* renamed from: e */
    public final C3221h f11547e;

    /* renamed from: f */
    public final CopyOnWriteArraySet<C3067e.C3068a> f11548f;

    /* renamed from: g */
    public final C3270p.C3273c f11549g;

    /* renamed from: h */
    public final C3270p.C3272b f11550h;

    /* renamed from: i */
    public boolean f11551i;

    /* renamed from: j */
    public boolean f11552j;

    /* renamed from: k */
    public int f11553k;

    /* renamed from: l */
    public int f11554l;

    /* renamed from: m */
    public int f11555m;

    /* renamed from: n */
    public boolean f11556n;

    /* renamed from: o */
    public C3270p f11557o;

    /* renamed from: p */
    public Object f11558p;

    /* renamed from: q */
    public C3305s f11559q;

    /* renamed from: r */
    public C3323f f11560r;

    /* renamed from: s */
    public C3231m f11561s;

    /* renamed from: t */
    public C3221h.C3223b f11562t;

    /* renamed from: u */
    public int f11563u;

    /* renamed from: v */
    public long f11564v;

    @SuppressLint({"HandlerLeak"})
    public C3220g(C3268n[] nVarArr, C3324g gVar, C3053c cVar) {
        boolean z;
        Looper looper;
        int i = C3406u.f12148a;
        if (nVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C3380a.m8507b(z);
        this.f11543a = (C3268n[]) C3380a.m8503a(nVarArr);
        this.f11544b = (C3324g) C3380a.m8503a(gVar);
        this.f11552j = false;
        this.f11553k = 1;
        this.f11548f = new CopyOnWriteArraySet<>();
        C3323f fVar = new C3323f(new C3321e[nVarArr.length]);
        this.f11545c = fVar;
        this.f11557o = C3270p.f11753a;
        this.f11549g = new C3270p.C3273c();
        this.f11550h = new C3270p.C3272b();
        this.f11559q = C3305s.f11874d;
        this.f11560r = fVar;
        this.f11561s = C3231m.f11655d;
        if (Looper.myLooper() != null) {
            looper = Looper.myLooper();
        } else {
            looper = Looper.getMainLooper();
        }
        C3219f fVar2 = new C3219f(this, looper);
        this.f11546d = fVar2;
        C3221h.C3223b bVar = new C3221h.C3223b(0, 0);
        this.f11562t = bVar;
        this.f11547e = new C3221h(nVarArr, gVar, cVar, this.f11552j, fVar2, bVar, this);
    }

    /* renamed from: a */
    public void mo14277a(boolean z) {
        if (this.f11552j != z) {
            this.f11552j = z;
            this.f11547e.f11576f.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            Iterator<C3067e.C3068a> it = this.f11548f.iterator();
            while (it.hasNext()) {
                it.next().mo13929a(z, this.f11553k);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|24|21|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x000f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0017 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14279b() {
        /*
            r3 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.h r0 = r3.f11547e
            monitor-enter(r0)
            boolean r1 = r0.f11588r     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            goto L_0x0025
        L_0x0009:
            android.os.Handler r1 = r0.f11576f     // Catch:{ all -> 0x002c }
            r2 = 6
            r1.sendEmptyMessage(r2)     // Catch:{ all -> 0x002c }
        L_0x000f:
            boolean r1 = r0.f11588r     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x001f
            r0.wait()     // Catch:{ InterruptedException -> 0x0017 }
            goto L_0x000f
        L_0x0017:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002c }
            r1.interrupt()     // Catch:{ all -> 0x002c }
            goto L_0x000f
        L_0x001f:
            android.os.HandlerThread r1 = r0.f11577g     // Catch:{ all -> 0x002c }
            r1.quit()     // Catch:{ all -> 0x002c }
            monitor-exit(r0)
        L_0x0025:
            android.os.Handler r0 = r3.f11546d
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C3220g.mo14279b():void");
    }

    /* renamed from: a */
    public void mo14276a(int i, long j) {
        if (i < 0 || (!this.f11557o.mo14412c() && i >= this.f11557o.mo14411b())) {
            throw new C3229k(this.f11557o, i, j);
        }
        this.f11554l++;
        this.f11563u = i;
        if (!this.f11557o.mo14412c()) {
            this.f11557o.mo14410a(i, this.f11549g, false, 0);
            long j2 = j == -9223372036854775807L ? this.f11549g.f11763e : j;
            C3270p.C3273c cVar = this.f11549g;
            int i2 = cVar.f11761c;
            long a = C3052b.m7657a(j2) + cVar.f11765g;
            long j3 = this.f11557o.mo14408a(i2, this.f11550h, false).f11757d;
            while (j3 != -9223372036854775807L && a >= j3 && i2 < this.f11549g.f11762d) {
                a -= j3;
                i2++;
                j3 = this.f11557o.mo14408a(i2, this.f11550h, false).f11757d;
            }
        }
        if (j == -9223372036854775807L) {
            this.f11564v = 0;
            this.f11547e.f11576f.obtainMessage(3, new C3221h.C3224c(this.f11557o, i, -9223372036854775807L)).sendToTarget();
            return;
        }
        this.f11564v = j;
        this.f11547e.f11576f.obtainMessage(3, new C3221h.C3224c(this.f11557o, i, C3052b.m7657a(j))).sendToTarget();
        Iterator<C3067e.C3068a> it = this.f11548f.iterator();
        while (it.hasNext()) {
            it.next().mo13923a();
        }
    }

    /* renamed from: a */
    public void mo14278a(C3067e.C3070c... cVarArr) {
        C3221h hVar = this.f11547e;
        if (!hVar.f11588r) {
            hVar.f11593w++;
            hVar.f11576f.obtainMessage(11, cVarArr).sendToTarget();
        }
    }

    /* renamed from: a */
    public int mo14275a() {
        if (this.f11557o.mo14412c() || this.f11554l > 0) {
            return this.f11563u;
        }
        return this.f11557o.mo14408a(this.f11562t.f11616a, this.f11550h, false).f11756c;
    }
}
