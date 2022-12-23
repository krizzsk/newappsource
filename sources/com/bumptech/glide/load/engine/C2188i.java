package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import com.bumptech.glide.load.engine.C2169c;
import java.io.IOException;
import java.util.ArrayList;
import p025b6.C1487b;
import p060d6.C4382c;
import p060d6.C4401o;
import p108h6.C5104n;

/* renamed from: com.bumptech.glide.load.engine.i */
public final class C2188i implements C2169c, C2169c.C2170a {

    /* renamed from: b */
    public final C2171d<?> f7136b;

    /* renamed from: c */
    public final C2169c.C2170a f7137c;

    /* renamed from: d */
    public volatile int f7138d;

    /* renamed from: e */
    public volatile C2168b f7139e;

    /* renamed from: f */
    public volatile Object f7140f;

    /* renamed from: g */
    public volatile C5104n.C5105a<?> f7141g;

    /* renamed from: h */
    public volatile C4382c f7142h;

    public C2188i(C2171d<?> dVar, C2169c.C2170a aVar) {
        this.f7136b = dVar;
        this.f7137c = aVar;
    }

    /* renamed from: a */
    public final void mo10922a(C1487b bVar, Object obj, C2142d<?> dVar, DataSource dataSource, C1487b bVar2) {
        this.f7137c.mo10922a(bVar, obj, dVar, this.f7141g.f17106c.mo6610d(), bVar);
    }

    /* renamed from: b */
    public final void mo10923b(C1487b bVar, Exception exc, C2142d<?> dVar, DataSource dataSource) {
        this.f7137c.mo10923b(bVar, exc, dVar, this.f7141g.f17106c.mo6610d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo10986c(java.lang.Object r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "SourceGenerator"
            int r1 = p311x6.C7171h.f22255a
            android.os.SystemClock.elapsedRealtimeNanos()
            r1 = 0
            r2 = 1
            com.bumptech.glide.load.engine.d<?> r3 = r10.f7136b     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.f r3 = r3.f7044c     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.Registry r3 = r3.f6909b     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.load.data.e r3 = r3.mo10832f(r11)     // Catch:{ all -> 0x0052 }
            java.lang.Object r4 = r3.mo10898a()     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.load.engine.d<?> r5 = r10.f7136b     // Catch:{ all -> 0x0052 }
            b6.a r5 = r5.mo10959e(r4)     // Catch:{ all -> 0x0052 }
            d6.d r6 = new d6.d     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.load.engine.d<?> r7 = r10.f7136b     // Catch:{ all -> 0x0052 }
            b6.e r7 = r7.f7050i     // Catch:{ all -> 0x0052 }
            r6.<init>(r5, r4, r7)     // Catch:{ all -> 0x0052 }
            d6.c r4 = new d6.c     // Catch:{ all -> 0x0052 }
            h6.n$a<?> r7 = r10.f7141g     // Catch:{ all -> 0x0052 }
            b6.b r7 = r7.f17104a     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.load.engine.d<?> r8 = r10.f7136b     // Catch:{ all -> 0x0052 }
            b6.b r9 = r8.f7055n     // Catch:{ all -> 0x0052 }
            r4.<init>(r7, r9)     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.load.engine.DecodeJob$e r7 = r8.f7049h     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.load.engine.e$c r7 = (com.bumptech.glide.load.engine.C2172e.C2177c) r7     // Catch:{ all -> 0x0052 }
            f6.a r7 = r7.mo10966a()     // Catch:{ all -> 0x0052 }
            r7.mo20209e(r4, r6)     // Catch:{ all -> 0x0052 }
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r0, r6)     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0054
            r4.toString()     // Catch:{ all -> 0x0052 }
            r11.toString()     // Catch:{ all -> 0x0052 }
            r5.toString()     // Catch:{ all -> 0x0052 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0052 }
            goto L_0x0054
        L_0x0052:
            r11 = move-exception
            goto L_0x00a5
        L_0x0054:
            java.io.File r5 = r7.mo20207c(r4)     // Catch:{ all -> 0x0052 }
            if (r5 == 0) goto L_0x0075
            r10.f7142h = r4     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.load.engine.b r11 = new com.bumptech.glide.load.engine.b     // Catch:{ all -> 0x0052 }
            h6.n$a<?> r0 = r10.f7141g     // Catch:{ all -> 0x0052 }
            b6.b r0 = r0.f17104a     // Catch:{ all -> 0x0052 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x0052 }
            com.bumptech.glide.load.engine.d<?> r3 = r10.f7136b     // Catch:{ all -> 0x0052 }
            r11.<init>(r0, r3, r10)     // Catch:{ all -> 0x0052 }
            r10.f7139e = r11     // Catch:{ all -> 0x0052 }
            h6.n$a<?> r11 = r10.f7141g
            com.bumptech.glide.load.data.d<Data> r11 = r11.f17106c
            r11.mo6608b()
            return r2
        L_0x0075:
            r4 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0084
            d6.c r0 = r10.f7142h     // Catch:{ all -> 0x0052 }
            java.util.Objects.toString(r0)     // Catch:{ all -> 0x0052 }
            r11.toString()     // Catch:{ all -> 0x0052 }
        L_0x0084:
            com.bumptech.glide.load.engine.c$a r11 = r10.f7137c     // Catch:{ all -> 0x00a3 }
            h6.n$a<?> r0 = r10.f7141g     // Catch:{ all -> 0x00a3 }
            b6.b r4 = r0.f17104a     // Catch:{ all -> 0x00a3 }
            java.lang.Object r5 = r3.mo10898a()     // Catch:{ all -> 0x00a3 }
            h6.n$a<?> r0 = r10.f7141g     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.load.data.d<Data> r6 = r0.f17106c     // Catch:{ all -> 0x00a3 }
            h6.n$a<?> r0 = r10.f7141g     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.load.data.d<Data> r0 = r0.f17106c     // Catch:{ all -> 0x00a3 }
            com.bumptech.glide.load.DataSource r7 = r0.mo6610d()     // Catch:{ all -> 0x00a3 }
            h6.n$a<?> r0 = r10.f7141g     // Catch:{ all -> 0x00a3 }
            b6.b r8 = r0.f17104a     // Catch:{ all -> 0x00a3 }
            r3 = r11
            r3.mo10922a(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a3 }
            return r1
        L_0x00a3:
            r11 = move-exception
            r1 = 1
        L_0x00a5:
            if (r1 != 0) goto L_0x00ae
            h6.n$a<?> r0 = r10.f7141g
            com.bumptech.glide.load.data.d<Data> r0 = r0.f17106c
            r0.mo6608b()
        L_0x00ae:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C2188i.mo10986c(java.lang.Object):boolean");
    }

    public final void cancel() {
        C5104n.C5105a<?> aVar = this.f7141g;
        if (aVar != null) {
            aVar.f17106c.cancel();
        }
    }

    /* renamed from: d */
    public final boolean mo10954d() {
        boolean z;
        boolean z2;
        if (this.f7140f != null) {
            Object obj = this.f7140f;
            this.f7140f = null;
            try {
                if (!mo10986c(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f7139e != null && this.f7139e.mo10954d()) {
            return true;
        }
        this.f7139e = null;
        this.f7141g = null;
        boolean z3 = false;
        while (!z3) {
            if (this.f7138d < this.f7136b.mo10956b().size()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            ArrayList b = this.f7136b.mo10956b();
            int i = this.f7138d;
            this.f7138d = i + 1;
            this.f7141g = (C5104n.C5105a) b.get(i);
            if (this.f7141g != null) {
                if (!this.f7136b.f7057p.mo19904c(this.f7141g.f17106c.mo6610d())) {
                    if (this.f7136b.mo10957c(this.f7141g.f17106c.mo6607a()) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                    }
                }
                this.f7141g.f17106c.mo6611e(this.f7136b.f7056o, new C4401o(this, this.f7141g));
                z3 = true;
            }
        }
        return z3;
    }

    /* renamed from: g */
    public final void mo10928g() {
        throw new UnsupportedOperationException();
    }
}
