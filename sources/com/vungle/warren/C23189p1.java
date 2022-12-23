package com.vungle.warren;

import com.vungle.warren.Vungle;
import qd0.C24732e;

/* renamed from: com.vungle.warren.p1 */
public final class C23189p1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C24732e f58869b;

    /* renamed from: c */
    public final /* synthetic */ Vungle.C23068c.C23069a f58870c;

    public C23189p1(Vungle.C23068c.C23069a aVar, C24732e eVar) {
        this.f58870c = aVar;
        this.f58869b = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            java.lang.String r0 = "Vungle#playAd"
            qd0.e r1 = r5.f58869b
            boolean r1 = r1.mo61217a()
            r2 = 0
            if (r1 == 0) goto L_0x006a
            qd0.e r1 = r5.f58869b
            T r1 = r1.f62602b
            ag.i r1 = (p359ag.C13452i) r1
            if (r1 == 0) goto L_0x006a
            java.lang.String r3 = "ad"
            boolean r4 = r1.mo40354L(r3)
            if (r4 == 0) goto L_0x006a
            ag.i r1 = r1.mo40353K(r3)     // Catch:{ IllegalArgumentException -> 0x0062, Exception -> 0x0049 }
            od0.c r3 = new od0.c     // Catch:{ IllegalArgumentException -> 0x0062, Exception -> 0x0049 }
            r3.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0062, Exception -> 0x0049 }
            com.vungle.warren.Vungle$c$a r1 = r5.f58870c     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            com.vungle.warren.Vungle$c r1 = com.vungle.warren.Vungle.C23068c.this     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            com.vungle.warren.AdConfig r1 = r1.f58523g     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            if (r1 != 0) goto L_0x0034
            com.vungle.warren.AdConfig r1 = new com.vungle.warren.AdConfig     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            r3.f62224w = r1     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            goto L_0x0036
        L_0x0034:
            r3.f62224w = r1     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
        L_0x0036:
            com.vungle.warren.Vungle$c$a r1 = r5.f58870c     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            com.vungle.warren.Vungle$c r1 = com.vungle.warren.Vungle.C23068c.this     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            com.vungle.warren.persistence.a r2 = r1.f58522f     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            java.lang.String r1 = r1.f58519c     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            r4 = 0
            r2.mo58290y(r3, r1, r4)     // Catch:{ IllegalArgumentException -> 0x0047, Exception -> 0x0044 }
            r2 = r3
            goto L_0x006a
        L_0x0044:
            r1 = move-exception
            r2 = r3
            goto L_0x004a
        L_0x0047:
            r2 = r3
            goto L_0x0062
        L_0x0049:
            r1 = move-exception
        L_0x004a:
            java.lang.String r3 = "streaming ads Exception :"
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r3)
            java.lang.String r1 = r1.getLocalizedMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.vungle.warren.VungleLogger.m57029b(r0, r1)
            java.lang.String unused = com.vungle.warren.Vungle.TAG
            goto L_0x006a
        L_0x0062:
            java.lang.String r1 = "streaming ads IllegalArgumentException"
            com.vungle.warren.VungleLogger.m57028a(r0, r1)
            java.lang.String unused = com.vungle.warren.Vungle.TAG
        L_0x006a:
            com.vungle.warren.Vungle$c$a r0 = r5.f58870c
            boolean r1 = r0.f58527a
            if (r1 == 0) goto L_0x008e
            if (r2 != 0) goto L_0x0082
            com.vungle.warren.Vungle$c r0 = com.vungle.warren.Vungle.C23068c.this
            java.lang.String r1 = r0.f58519c
            com.vungle.warren.f0 r0 = r0.f58521e
            com.vungle.warren.error.VungleException r2 = new com.vungle.warren.error.VungleException
            r3 = 1
            r2.<init>((int) r3)
            com.vungle.warren.Vungle.onPlayError(r1, r0, r2)
            goto L_0x009b
        L_0x0082:
            com.vungle.warren.AdRequest r1 = r0.f58528b
            com.vungle.warren.Vungle$c r3 = com.vungle.warren.Vungle.C23068c.this
            com.vungle.warren.f0 r3 = r3.f58521e
            od0.m r0 = r0.f58529c
            com.vungle.warren.Vungle.renderAd(r1, r3, r0, r2)
            goto L_0x009b
        L_0x008e:
            com.vungle.warren.AdRequest r1 = r0.f58528b
            com.vungle.warren.Vungle$c r2 = com.vungle.warren.Vungle.C23068c.this
            com.vungle.warren.f0 r2 = r2.f58521e
            od0.m r3 = r0.f58529c
            od0.c r0 = r0.f58530d
            com.vungle.warren.Vungle.renderAd(r1, r2, r3, r0)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.C23189p1.run():void");
    }
}
