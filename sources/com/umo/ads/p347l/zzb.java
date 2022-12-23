package com.umo.ads.p347l;

import android.content.Context;
import com.umo.ads.p350u.zzk;
import java.util.List;
import mf0.C24362h;
import vb0.C13197a;
import vb0.C13199c;
import vb0.C13200d;
import vb0.C13201e;

/* renamed from: com.umo.ads.l.zzb */
public final class zzb extends zzd {

    /* renamed from: e */
    public final String f30820e;

    /* renamed from: f */
    public boolean f30821f = true;

    /* renamed from: g */
    public C13200d f30822g;

    /* renamed from: h */
    public C13197a f30823h;

    /* renamed from: i */
    public C13199c f30824i;

    /* renamed from: j */
    public C13201e f30825j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzb(Context context, String str, List<? extends zzk> list) {
        super(context, str, list);
        C24362h.m61211f(str, "spotId");
        this.f30820e = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitError} */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            java.lang.String r5 = "intent"
            mf0.C24362h.m61211f(r6, r5)
            java.lang.String r5 = "BROADCAST_IDENTIFIER"
            java.lang.String r5 = r6.getStringExtra(r5)
            java.lang.String r0 = r4.f30829b
            boolean r5 = mf0.C24362h.m61206a(r0, r5)
            if (r5 != 0) goto L_0x0014
            return
        L_0x0014:
            java.lang.String r5 = "BROADCAST_ACTION_DATA"
            java.lang.String r5 = r6.getStringExtra(r5)
            java.lang.String r6 = r6.getAction()
            java.lang.String r0 = "com.umoak.broadcast.action.browser.open"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x0033
            vb0.d r5 = r4.f30822g
            if (r5 != 0) goto L_0x002c
            goto L_0x0357
        L_0x002c:
            java.lang.String r6 = r4.f30820e
            r5.mo39577u(r6)
            goto L_0x0357
        L_0x0033:
            java.lang.String r0 = "com.umoak.broadcast.action.browser.dismiss"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0057
            vb0.d r5 = r4.f30822g
            if (r5 != 0) goto L_0x0041
            goto L_0x0046
        L_0x0041:
            java.lang.String r6 = r4.f30820e
            r5.zzb(r6)
        L_0x0046:
            boolean r5 = r4.f30821f
            if (r5 == 0) goto L_0x0357
            r4.f30822g = r1
            android.content.Context r5 = r4.f30828a
            j2.a r5 = p130j2.C5367a.m13473a(r5)
            r5.mo21148d(r4)
            goto L_0x0357
        L_0x0057:
            java.lang.String r0 = "com.umoak.broadcast.action.interstitial.show"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x006c
            vb0.a r5 = r4.f30823h
            if (r5 != 0) goto L_0x0065
            goto L_0x0357
        L_0x0065:
            java.lang.String r6 = r4.f30820e
            r5.mo39570n(r1, r6)
            goto L_0x0357
        L_0x006c:
            java.lang.String r0 = "com.umoak.broadcast.action.interstitial.fail"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x008c
            if (r5 != 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            com.cubic.umo.ad.ext.types.UMOAdKitError r1 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.valueOf(r5)
        L_0x007b:
            if (r1 != 0) goto L_0x007f
            com.cubic.umo.ad.ext.types.UMOAdKitError r1 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
        L_0x007f:
            vb0.a r5 = r4.f30823h
            if (r5 != 0) goto L_0x0085
            goto L_0x0357
        L_0x0085:
            java.lang.String r6 = r4.f30820e
            r5.mo39578v(r6, r1)
            goto L_0x0357
        L_0x008c:
            java.lang.String r0 = "com.umoak.broadcast.action.interstitial.click"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x00a1
            vb0.c r6 = r4.f30824i
            if (r6 != 0) goto L_0x009a
            goto L_0x0357
        L_0x009a:
            java.lang.String r0 = r4.f30820e
            r6.zzc(r0, r5)
            goto L_0x0357
        L_0x00a1:
            java.lang.String r0 = "com.umoak.broadcast.action.interstitial.dismiss"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x00be
            vb0.c r5 = r4.f30824i
            if (r5 != 0) goto L_0x00ae
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r6 = r4.f30820e
            r5.zzu(r6)
        L_0x00b3:
            android.content.Context r5 = r4.f30828a
            j2.a r5 = p130j2.C5367a.m13473a(r5)
            r5.mo21148d(r4)
            goto L_0x0357
        L_0x00be:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.playback.started"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            r2 = 0
            if (r0 == 0) goto L_0x00d4
            vb0.a r5 = r4.f30823h
            if (r5 != 0) goto L_0x00cd
            goto L_0x0357
        L_0x00cd:
            java.lang.String r6 = r4.f30820e
            r5.zzc(r6, r2)
            goto L_0x0357
        L_0x00d4:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.playback.completed"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x00e9
            vb0.a r5 = r4.f30823h
            if (r5 != 0) goto L_0x00e2
            goto L_0x0357
        L_0x00e2:
            java.lang.String r6 = r4.f30820e
            r5.zzl(r6)
            goto L_0x0357
        L_0x00e9:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.playback.timedout"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x0107
            vb0.a r6 = r4.f30823h
            if (r6 != 0) goto L_0x00f7
            goto L_0x0357
        L_0x00f7:
            java.lang.String r0 = r4.f30820e
            com.umo.ads.c.zzd$a r1 = com.umo.ads.p342c.zzd.zzb
            r1.getClass()
            com.umo.ads.c.zzd r5 = com.umo.ads.p342c.zzd.C12081a.m32036a(r5)
            r6.mo39576t(r0, r5)
            goto L_0x0357
        L_0x0107:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.playback.failed"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x0127
            vb0.a r6 = r4.f30823h
            if (r6 != 0) goto L_0x0115
            goto L_0x0357
        L_0x0115:
            java.lang.String r0 = r4.f30820e
            com.cubic.umo.ad.ext.types.UMOAdKitError r1 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            com.umo.ads.c.zzd$a r2 = com.umo.ads.p342c.zzd.zzb
            r2.getClass()
            com.umo.ads.c.zzd r5 = com.umo.ads.p342c.zzd.C12081a.m32036a(r5)
            r6.mo39550B(r0, r1, r5)
            goto L_0x0357
        L_0x0127:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.playback.stopped"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x013c
            vb0.a r5 = r4.f30823h
            if (r5 != 0) goto L_0x0135
            goto L_0x0357
        L_0x0135:
            java.lang.String r6 = r4.f30820e
            r5.mo39552D(r6)
            goto L_0x0357
        L_0x013c:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.playback.progress.update"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            r3 = -1
            if (r0 == 0) goto L_0x0177
            vb0.a r6 = r4.f30823h
            if (r6 != 0) goto L_0x014b
            goto L_0x0357
        L_0x014b:
            java.lang.String r0 = r4.f30820e
            if (r5 != 0) goto L_0x0150
            goto L_0x016b
        L_0x0150:
            java.lang.Integer r1 = uh0.C25080g.m62829y(r5)
            if (r1 != 0) goto L_0x0163
            java.lang.Float r5 = uh0.C25080g.m62828x(r5)
            if (r5 != 0) goto L_0x015d
            goto L_0x0167
        L_0x015d:
            float r5 = r5.floatValue()
            int r3 = (int) r5
            goto L_0x0167
        L_0x0163:
            int r3 = r1.intValue()
        L_0x0167:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
        L_0x016b:
            mf0.C24362h.m61208c(r1)
            int r5 = r1.intValue()
            r6.zza(r5, r0)
            goto L_0x0357
        L_0x0177:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.playback.currpos.update"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x01b1
            vb0.a r6 = r4.f30823h
            if (r6 != 0) goto L_0x0185
            goto L_0x0357
        L_0x0185:
            java.lang.String r0 = r4.f30820e
            if (r5 != 0) goto L_0x018a
            goto L_0x01a5
        L_0x018a:
            java.lang.Integer r1 = uh0.C25080g.m62829y(r5)
            if (r1 != 0) goto L_0x019d
            java.lang.Float r5 = uh0.C25080g.m62828x(r5)
            if (r5 != 0) goto L_0x0197
            goto L_0x01a1
        L_0x0197:
            float r5 = r5.floatValue()
            int r3 = (int) r5
            goto L_0x01a1
        L_0x019d:
            int r3 = r1.intValue()
        L_0x01a1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
        L_0x01a5:
            mf0.C24362h.m61208c(r1)
            int r5 = r1.intValue()
            r6.mo39565i(r0, r5)
            goto L_0x0357
        L_0x01b1:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.clicked"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x01c6
            vb0.c r5 = r4.f30824i
            if (r5 != 0) goto L_0x01bf
            goto L_0x0357
        L_0x01bf:
            java.lang.String r6 = r4.f30820e
            r5.zzd(r6)
            goto L_0x0357
        L_0x01c6:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.impression"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x01db
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x01d4
            goto L_0x0357
        L_0x01d4:
            java.lang.String r6 = r4.f30820e
            r5.mo39580x(r6)
            goto L_0x0357
        L_0x01db:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.start"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x01f0
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x01e9
            goto L_0x0357
        L_0x01e9:
            java.lang.String r6 = r4.f30820e
            r5.mo39562f(r6)
            goto L_0x0357
        L_0x01f0:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.first_quartile"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x0205
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x01fe
            goto L_0x0357
        L_0x01fe:
            java.lang.String r6 = r4.f30820e
            r5.mo39569m(r6)
            goto L_0x0357
        L_0x0205:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.midpoint"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x021a
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x0213
            goto L_0x0357
        L_0x0213:
            java.lang.String r6 = r4.f30820e
            r5.mo39581y(r6)
            goto L_0x0357
        L_0x021a:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.third.quartile"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x022f
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x0228
            goto L_0x0357
        L_0x0228:
            java.lang.String r6 = r4.f30820e
            r5.zzg(r6)
            goto L_0x0357
        L_0x022f:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.completed"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x0244
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x023d
            goto L_0x0357
        L_0x023d:
            java.lang.String r6 = r4.f30820e
            r5.zzy(r6)
            goto L_0x0357
        L_0x0244:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.paused"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x0259
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x0252
            goto L_0x0357
        L_0x0252:
            java.lang.String r6 = r4.f30820e
            r5.mo39549A(r6)
            goto L_0x0357
        L_0x0259:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.resumed"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x026e
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x0267
            goto L_0x0357
        L_0x0267:
            java.lang.String r6 = r4.f30820e
            r5.zzh(r6)
            goto L_0x0357
        L_0x026e:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.timedout"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x028c
            vb0.e r6 = r4.f30825j
            if (r6 != 0) goto L_0x027c
            goto L_0x0357
        L_0x027c:
            java.lang.String r0 = r4.f30820e
            com.umo.ads.c.zzd$a r1 = com.umo.ads.p342c.zzd.zzb
            r1.getClass()
            com.umo.ads.c.zzd r5 = com.umo.ads.p342c.zzd.C12081a.m32036a(r5)
            r6.mo39579w(r0, r5)
            goto L_0x0357
        L_0x028c:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.error"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x02ac
            vb0.e r6 = r4.f30825j
            if (r6 != 0) goto L_0x029a
            goto L_0x0357
        L_0x029a:
            java.lang.String r0 = r4.f30820e
            com.cubic.umo.ad.ext.types.UMOAdKitError r1 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            com.umo.ads.c.zzd$a r2 = com.umo.ads.p342c.zzd.zzb
            r2.getClass()
            com.umo.ads.c.zzd r5 = com.umo.ads.p342c.zzd.C12081a.m32036a(r5)
            r6.mo39559c(r0, r1, r5)
            goto L_0x0357
        L_0x02ac:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.user.accept.invitation"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x02c1
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x02ba
            goto L_0x0357
        L_0x02ba:
            java.lang.String r6 = r4.f30820e
            r5.zzc(r6)
            goto L_0x0357
        L_0x02c1:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.skipped"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x02d6
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x02cf
            goto L_0x0357
        L_0x02cf:
            java.lang.String r6 = r4.f30820e
            r5.zzq(r6)
            goto L_0x0357
        L_0x02d6:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.stopped"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x02f2
            vb0.e r6 = r4.f30825j
            if (r6 != 0) goto L_0x02e4
            goto L_0x0357
        L_0x02e4:
            java.lang.String r0 = r4.f30820e
            if (r5 != 0) goto L_0x02e9
            goto L_0x02ed
        L_0x02e9:
            boolean r2 = java.lang.Boolean.parseBoolean(r5)
        L_0x02ed:
            r6.zza(r0, r2)
            goto L_0x0357
        L_0x02f2:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.volume.changed"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x030c
            vb0.e r6 = r4.f30825j
            if (r6 != 0) goto L_0x02ff
            goto L_0x0357
        L_0x02ff:
            java.lang.String r0 = r4.f30820e
            if (r5 != 0) goto L_0x0304
            goto L_0x0308
        L_0x0304:
            boolean r2 = java.lang.Boolean.parseBoolean(r5)
        L_0x0308:
            r6.mo39566j(r0, r2)
            goto L_0x0357
        L_0x030c:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.user.close"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x031f
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x0319
            goto L_0x0357
        L_0x0319:
            java.lang.String r6 = r4.f30820e
            r5.mo39553E(r6)
            goto L_0x0357
        L_0x031f:
            java.lang.String r0 = "com.umoak.broadcast.action.ad.clickthru"
            boolean r0 = mf0.C24362h.m61206a(r6, r0)
            if (r0 == 0) goto L_0x0332
            vb0.e r6 = r4.f30825j
            if (r6 != 0) goto L_0x032c
            goto L_0x0357
        L_0x032c:
            java.lang.String r0 = r4.f30820e
            r6.zzb(r0, r5)
            goto L_0x0357
        L_0x0332:
            java.lang.String r5 = "com.umoak.broadcast.action.ad.expanded"
            boolean r5 = mf0.C24362h.m61206a(r6, r5)
            if (r5 == 0) goto L_0x0345
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x033f
            goto L_0x0357
        L_0x033f:
            java.lang.String r6 = r4.f30820e
            r5.zzn(r6)
            goto L_0x0357
        L_0x0345:
            java.lang.String r5 = "com.umoak.broadcast.action.ad.collapsed"
            boolean r5 = mf0.C24362h.m61206a(r6, r5)
            if (r5 == 0) goto L_0x0357
            vb0.e r5 = r4.f30825j
            if (r5 != 0) goto L_0x0352
            goto L_0x0357
        L_0x0352:
            java.lang.String r6 = r4.f30820e
            r5.zze(r6)
        L_0x0357:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p347l.zzb.onReceive(android.content.Context, android.content.Intent):void");
    }
}
