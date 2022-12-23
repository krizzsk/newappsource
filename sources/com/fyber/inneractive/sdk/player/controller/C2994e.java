package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2649j;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.enums.C3025b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p050ui.C3449a;
import com.fyber.inneractive.sdk.player.p050ui.C3450b;
import com.fyber.inneractive.sdk.player.p050ui.C3452d;
import com.fyber.inneractive.sdk.player.p050ui.C3457i;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.e */
public class C2994e extends C3009k<C3020s> {

    /* renamed from: A */
    public boolean f10251A;

    /* renamed from: y */
    public boolean f10252y;

    /* renamed from: z */
    public boolean f10253z = false;

    public C2994e(C2948c cVar, C3452d dVar, C2703z zVar, C2666s sVar, boolean z, boolean z2, Skip skip, boolean z3) {
        super(cVar, dVar, zVar, sVar, z2, skip);
        this.f10252y = z;
        this.f10251A = z3;
    }

    /* renamed from: a */
    public void mo13840a(boolean z) {
        C2948c cVar;
        C2997g gVar;
        if (z && (cVar = this.f10287a) != null && (gVar = cVar.f10083b) != null && !gVar.f10260e.equals(C3025b.Completed) && !this.f10290d.mo14699d()) {
            mo13877h(false);
        }
        super.mo13840a(z);
    }

    /* renamed from: b */
    public void mo13841b() {
        if (this.f10294h) {
            mo13896q();
        } else {
            mo13842i();
        }
    }

    /* renamed from: d */
    public void mo13829d(boolean z) {
        boolean z2;
        C2997g gVar;
        C3025b bVar;
        super.mo13829d(z);
        if (this.f10252y) {
            this.f10290d.mo14701f();
            this.f10290d.mo14698d(false);
            this.f10292f = 0;
        }
        mo13897x();
        C2948c cVar = this.f10287a;
        if (cVar == null || (gVar = cVar.f10083b) == null || !((bVar = gVar.f10260e) == C3025b.Preparing || bVar == C3025b.Prepared)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f10290d.mo14695b(z2);
        this.f10290d.mo14697c(false);
        C3457i iVar = this.f10290d;
        C3450b bVar2 = new C3450b();
        bVar2.f12306b = false;
        iVar.mo14691a(new C3449a(bVar2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo13842i() {
        /*
            r7 = this;
            super.mo13842i()
            com.fyber.inneractive.sdk.player.c r0 = r7.f10287a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0079
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f10083b
            if (r0 == 0) goto L_0x0079
            boolean r0 = r7.f10253z
            if (r0 == 0) goto L_0x0012
            goto L_0x0079
        L_0x0012:
            r0 = 2
            com.fyber.inneractive.sdk.player.ui.i r3 = r7.f10290d     // Catch:{ all -> 0x002c }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x002c }
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ all -> 0x002c }
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch:{ all -> 0x002c }
            int r4 = r3.getRingerMode()     // Catch:{ all -> 0x002c }
            int r3 = r3.getStreamVolume(r0)     // Catch:{ all -> 0x002a }
            goto L_0x002f
        L_0x002a:
            goto L_0x002e
        L_0x002c:
            r4 = 0
        L_0x002e:
            r3 = 0
        L_0x002f:
            boolean r5 = r7.f10252y
            if (r5 != 0) goto L_0x0043
            com.fyber.inneractive.sdk.config.z r5 = r7.f10288b
            com.fyber.inneractive.sdk.config.y r5 = (com.fyber.inneractive.sdk.config.C2702y) r5
            com.fyber.inneractive.sdk.config.a0 r5 = r5.f9427f
            java.lang.Boolean r5 = r5.f9250d
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 != 0) goto L_0x0071
            boolean r5 = r7.f10251A
            if (r5 == 0) goto L_0x0058
            com.fyber.inneractive.sdk.config.z r5 = r7.f10288b
            com.fyber.inneractive.sdk.config.y r5 = (com.fyber.inneractive.sdk.config.C2702y) r5
            com.fyber.inneractive.sdk.config.a0 r5 = r5.f9427f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = r5.f9256j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r5 == r6) goto L_0x0058
            r5 = 1
            goto L_0x0059
        L_0x0058:
            r5 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x005c
            goto L_0x0071
        L_0x005c:
            if (r3 <= 0) goto L_0x0074
            if (r4 != r0) goto L_0x0074
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = com.fyber.inneractive.sdk.util.IAlog.m9899a((java.lang.Object) r7)
            r0[r2] = r3
            java.lang.String r3 = "%s setting default volume. unmuting player"
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r3, r0)
            r7.mo13892i(r2)
            goto L_0x0074
        L_0x0071:
            r7.mo13888f(r2)
        L_0x0074:
            r7.mo13898z()
            r7.f10253z = r1
        L_0x0079:
            r7.mo13877h(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C2994e.mo13842i():boolean");
    }

    /* renamed from: l */
    public int mo13843l() {
        return IAConfigManager.f9202J.f9234v.f9337b.mo13271a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo13844n() {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f9202J
            com.fyber.inneractive.sdk.config.i r0 = r0.f9234v
            com.fyber.inneractive.sdk.config.h r0 = r0.f9337b
            com.fyber.inneractive.sdk.config.z r1 = r6.f10288b
            com.fyber.inneractive.sdk.config.enums.Skip r2 = r6.f10310x
            java.lang.String r3 = "vast_configuration"
            com.fyber.inneractive.sdk.config.f r0 = r0.mo13272a((java.lang.String) r3)
            java.lang.String r3 = "skip_d"
            r0.getClass()
            r4 = -1
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.f9286a     // Catch:{ Exception -> 0x002c }
            boolean r5 = r5.containsKey(r3)     // Catch:{ Exception -> 0x002c }
            if (r5 == 0) goto L_0x002d
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f9286a     // Catch:{ Exception -> 0x002c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x002c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x002c }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x002c }
            goto L_0x002e
        L_0x002c:
        L_0x002d:
            r0 = -1
        L_0x002e:
            int r0 = java.lang.Math.max(r0, r4)
            if (r0 <= r4) goto L_0x0035
            goto L_0x004d
        L_0x0035:
            if (r2 != 0) goto L_0x003d
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C2702y) r1
            com.fyber.inneractive.sdk.config.a0 r0 = r1.f9427f
            com.fyber.inneractive.sdk.config.enums.Skip r2 = r0.f9254h
        L_0x003d:
            com.fyber.inneractive.sdk.config.enums.Skip r0 = com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT
            if (r2 != r0) goto L_0x0045
            r0 = 99999(0x1869f, float:1.40128E-40)
            goto L_0x004d
        L_0x0045:
            java.lang.Integer r0 = r2.value()
            int r0 = r0.intValue()
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C2994e.mo13844n():int");
    }

    /* renamed from: p */
    public void mo13845p() {
        this.f10307u = true;
        IAlog.m9902a("%s onBufferingTimeout reached. Skipping to end card", IAlog.m9899a((Object) this));
        mo13827c(false);
    }

    /* renamed from: r */
    public void mo13846r() {
        ListenerT listenert = this.f10293g;
        if (listenert != null) {
            listenert.mo13948k();
        }
    }

    /* renamed from: t */
    public void mo13847t() {
        this.f10290d.mo14698d(true);
        mo13897x();
        mo13893k();
        mo13842i();
        mo13877h(true);
    }

    /* renamed from: v */
    public void mo13848v() {
        super.mo13848v();
        this.f10290d.mo14695b(false);
        if (this.f10252y) {
            this.f10290d.mo14701f();
        }
    }

    /* renamed from: w */
    public boolean mo13849w() {
        return !this.f10252y;
    }

    /* renamed from: y */
    public void mo13850y() {
        C2997g gVar;
        super.mo13850y();
        C2948c cVar = this.f10287a;
        if (cVar != null && (gVar = cVar.f10083b) != null && gVar.f10260e.equals(C3025b.Completed) && this.f10252y) {
            this.f10290d.mo14701f();
        }
    }

    /* renamed from: a */
    public void mo13839a(C3721p0 p0Var) {
        C2649j.C2651b bVar;
        TapAction tapAction = ((C2702y) this.f10288b).f9427f.f9255i;
        if (tapAction == TapAction.CTR) {
            mo13886a(false, VideoClickOrigin.VIDEO, p0Var);
        } else if (tapAction == TapAction.FULLSCREEN || tapAction == TapAction.DO_NOTHING) {
            String a = ((C2649j) this.f10289c.mo13264a(C2649j.class)).mo13237a("click_action", "none");
            C2649j.C2651b[] values = C2649j.C2651b.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = C2649j.C2651b.NONE;
                    break;
                }
                bVar = values[i];
                if (a.equalsIgnoreCase(bVar.f9309a)) {
                    break;
                }
                i++;
            }
            if (bVar.equals(C2649j.C2651b.OPEN)) {
                mo13886a(false, VideoClickOrigin.VIDEO, p0Var);
            }
        } else {
            IAlog.m9902a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m9899a((Object) this), tapAction);
        }
    }
}
