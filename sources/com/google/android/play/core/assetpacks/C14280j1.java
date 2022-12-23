package com.google.android.play.core.assetpacks;

import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.umo.ads.p342c.zzd;
import mc0.C12909a;
import mf0.C24362h;
import p434dd.C16548d0;
import p434dd.C16550e0;
import p434dd.C16552f0;
import vb0.C13197a;
import yb0.C13302g;
import zb0.C13375g;

/* renamed from: com.google.android.play.core.assetpacks.j1 */
public final class C14280j1 implements C16552f0, C13375g.C13376a {

    /* renamed from: b */
    public final Object f35919b;

    /* renamed from: c */
    public final Object f35920c;

    /* renamed from: d */
    public final Object f35921d;

    /* renamed from: e */
    public final Object f35922e;

    public /* synthetic */ C14280j1(C16552f0 f0Var, C16548d0 d0Var, C16552f0 f0Var2, C16552f0 f0Var3) {
        this.f35919b = f0Var;
        this.f35920c = d0Var;
        this.f35921d = f0Var2;
        this.f35922e = f0Var3;
    }

    public /* synthetic */ C14280j1(C13302g gVar, C13302g gVar2, C13302g gVar3, C13302g gVar4) {
        this.f35919b = gVar;
        this.f35920c = gVar2;
        this.f35921d = gVar3;
        this.f35922e = gVar4;
    }

    /* renamed from: a */
    public final void mo40259a(String str, C12909a aVar) {
        C24362h.m61211f(str, "spotId");
        mo42848c(str, aVar);
    }

    /* renamed from: b */
    public final void mo40260b(String str, UMOAdKitError uMOAdKitError) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        ((C13197a) this.f35919b).mo39550B("", uMOAdKitError, zzd.NONE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42848c(java.lang.String r11, mc0.C12909a r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f35919b
            vb0.a r0 = (vb0.C13197a) r0
            mf0.C24368m.f61691c = r0
            java.lang.Object r0 = r10.f35920c
            vb0.c r0 = (vb0.C13199c) r0
            mf0.C24368m.f61692d = r0
            java.lang.Object r0 = r10.f35921d
            vb0.d r0 = (vb0.C13200d) r0
            mf0.C24368m.f61693e = r0
            java.lang.Object r0 = r10.f35922e
            vb0.e r0 = (vb0.C13201e) r0
            mf0.C24368m.f61694f = r0
            java.lang.String r0 = "spotId"
            mf0.C24362h.m61211f(r11, r0)
            com.umo.ads.u.zzf r0 = r12.f31947b
            int r0 = r0.ordinal()
            r1 = 1
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r4 = "FULLSCREEN_AD_ORIENTATION"
            java.lang.String r5 = "BROADCAST_IDENTIFIER"
            java.lang.String r6 = "adOrientation"
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            java.lang.String r8 = "<set-?>"
            r9 = 3
            if (r0 == r9) goto L_0x00f8
            r9 = 4
            if (r0 == r9) goto L_0x0046
            com.cubic.umo.ad.ext.types.UMOAdKitError r11 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_TYPE_UNSUPPORTED
            vb0.a r12 = mf0.C24368m.f61691c
            if (r12 != 0) goto L_0x003f
            goto L_0x01ce
        L_0x003f:
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.NONE
            r12.mo39550B(r2, r11, r0)
            goto L_0x01ce
        L_0x0046:
            com.umo.ads.u.zzf r0 = r12.f31947b
            mf0.C24368m.m61235k(r11, r0)
            com.umo.ads.u.zzr r0 = new com.umo.ads.u.zzr
            r0.<init>(r3)
            r0.f30879b = r11
            java.lang.String r9 = r12.f31950e
            mf0.C24362h.m61208c(r9)
            r0.f30880c = r9
            java.lang.String r9 = r12.f31952g
            r0.f30882e = r9
            com.cubic.umo.ad.ext.types.UMOAdKitInlineVideoPlayMode r9 = wb0.C13231a.f32839c
            mf0.C24362h.m61211f(r9, r8)
            r0.f30883f = r9
            com.umo.ads.u.zzc r9 = com.umo.ads.p350u.zzc.INTERSTITIAL
            mf0.C24362h.m61211f(r9, r8)
            r0.f30884g = r9
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKVPaidAdActivity> r8 = com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity.f7330z
            java.lang.String r12 = r12.f31951f
            com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity.f7329A = r12
            yb0.g r12 = yb0.C13302g.f33013b
            com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation r12 = com.cubic.umo.p045ad.ext.types.UMOAdKitAdOrientation.UNSPECIFIED
            mf0.C24362h.m61211f(r12, r6)
            boolean r6 = nc0.C12954d.m32800c(r11)
            if (r6 == 0) goto L_0x0083
            java.lang.String r6 = p584jl.C17885a.m44403H0(r11)
            goto L_0x0084
        L_0x0083:
            r6 = r2
        L_0x0084:
            java.lang.String r8 = com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity.f7329A
            boolean r8 = nc0.C12954d.m32800c(r8)
            if (r8 != 0) goto L_0x0098
            ch.qos.logback.classic.Logger r11 = ac0.C7557a.f23040a
            java.lang.String r12 = "VPAID_PLAYER: Invalid VPaid Ad Content"
            java.lang.String r12 = mf0.C24362h.m61216k(r6, r12)
            r11.mo6667d(r12)
            goto L_0x00e6
        L_0x0098:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r9 = "VPAID_AD_INFO"
            r8.putParcelable(r9, r0)
            r8.putString(r5, r11)
            java.lang.String r11 = r12.name()
            r8.putString(r4, r11)
            android.content.Context r11 = wb0.C13233c.m33333b()
            android.content.Intent r12 = new android.content.Intent
            java.lang.Class<com.cubic.umo.ad.playback.ui.activities.AKVPaidAdActivity> r0 = com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity.class
            r12.<init>(r11, r0)
            boolean r11 = r11 instanceof android.app.Activity
            if (r11 != 0) goto L_0x00be
            r12.addFlags(r7)
        L_0x00be:
            r12.putExtras(r8)
            android.content.Context r11 = wb0.C13233c.m33333b()     // Catch:{ zzc -> 0x00d7 }
            boolean r0 = r11 instanceof android.app.Activity     // Catch:{ zzc -> 0x00d7 }
            if (r0 != 0) goto L_0x00cc
            r12.addFlags(r7)     // Catch:{ zzc -> 0x00d7 }
        L_0x00cc:
            r11.startActivity(r12)     // Catch:{ ActivityNotFoundException -> 0x00d0 }
            goto L_0x00e7
        L_0x00d0:
            r11 = move-exception
            com.umo.ads.d.zzc r12 = new com.umo.ads.d.zzc     // Catch:{ zzc -> 0x00d7 }
            r12.<init>(r11)     // Catch:{ zzc -> 0x00d7 }
            throw r12     // Catch:{ zzc -> 0x00d7 }
        L_0x00d7:
            r11 = move-exception
            r11.printStackTrace()
            ch.qos.logback.classic.Logger r11 = ac0.C7557a.f23040a
            java.lang.String r12 = "VPAID_PLAYER: Unable to start Activity for playing VPaid Ad"
            java.lang.String r12 = mf0.C24362h.m61216k(r6, r12)
            r11.mo6667d(r12)
        L_0x00e6:
            r1 = 0
        L_0x00e7:
            if (r1 != 0) goto L_0x01ce
            com.cubic.umo.ad.ext.types.UMOAdKitError r11 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            vb0.a r12 = mf0.C24368m.f61691c
            if (r12 != 0) goto L_0x00f1
            goto L_0x01ce
        L_0x00f1:
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.NONE
            r12.mo39550B(r2, r11, r0)
            goto L_0x01ce
        L_0x00f8:
            com.umo.ads.u.zzf r0 = r12.f31947b
            mf0.C24368m.m61235k(r11, r0)
            com.umo.ads.u.zzt r0 = new com.umo.ads.u.zzt
            r0.<init>(r3)
            r0.f30885b = r11
            java.lang.String r12 = r12.f31950e
            mf0.C24362h.m61208c(r12)
            r0.f30886c = r12
            android.content.Context r12 = wb0.C13233c.f32842a
            yb0.g r12 = yb0.C13302g.f33013b
            com.cubic.umo.ad.types.AKHostedConfig r12 = wb0.C13233c.f32845d
            if (r12 != 0) goto L_0x0114
            goto L_0x011a
        L_0x0114:
            com.cubic.umo.ad.types.AKRollParams r12 = r12.getRollParams()
            if (r12 != 0) goto L_0x011c
        L_0x011a:
            r12 = 6
            goto L_0x0120
        L_0x011c:
            int r12 = r12.getVideoTimeoutSeconds()
        L_0x0120:
            r0.f30887d = r12
            com.cubic.umo.ad.ext.types.UMOAdKitInlineVideoPlayMode r12 = wb0.C13231a.f32839c
            mf0.C24362h.m61211f(r12, r8)
            r0.f30888e = r12
            com.umo.ads.u.zzc r12 = com.umo.ads.p350u.zzc.INTERSTITIAL
            mf0.C24362h.m61211f(r12, r8)
            r0.f30889f = r12
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKVideoAdActivity> r12 = com.cubic.umo.p045ad.playback.p046ui.activities.AKVideoAdActivity.f7333A
            com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation r12 = com.cubic.umo.p045ad.ext.types.UMOAdKitAdOrientation.UNSPECIFIED
            mf0.C24362h.m61211f(r12, r6)
            java.lang.String r6 = r0.f30886c
            boolean r8 = nc0.C12954d.m32800c(r6)
            if (r8 != 0) goto L_0x0140
            goto L_0x014d
        L_0x0140:
            boolean r8 = android.webkit.URLUtil.isHttpUrl(r6)
            if (r8 != 0) goto L_0x014f
            boolean r6 = android.webkit.URLUtil.isHttpsUrl(r6)
            if (r6 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r6 = 0
            goto L_0x0150
        L_0x014f:
            r6 = 1
        L_0x0150:
            if (r6 != 0) goto L_0x0160
            ch.qos.logback.classic.Logger r11 = ac0.C7557a.f23040a
            java.lang.String r12 = r0.f30886c
            java.lang.String r0 = "VIDEO_PLAYER: Invalid Video Ad Url:"
            java.lang.String r12 = mf0.C24362h.m61216k(r12, r0)
            r11.mo6667d(r12)
            goto L_0x01bf
        L_0x0160:
            bf0.d r6 = bf0.C21050d.f52856a
            if (r6 != 0) goto L_0x0165
            goto L_0x01bf
        L_0x0165:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r8 = "VIDEO_AD_INFO"
            r6.putParcelable(r8, r0)
            r6.putString(r5, r11)
            java.lang.String r12 = r12.name()
            r6.putString(r4, r12)
            android.content.Context r12 = wb0.C13233c.m33333b()
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.cubic.umo.ad.playback.ui.activities.AKVideoAdActivity> r4 = com.cubic.umo.p045ad.playback.p046ui.activities.AKVideoAdActivity.class
            r0.<init>(r12, r4)
            boolean r12 = r12 instanceof android.app.Activity
            if (r12 != 0) goto L_0x018b
            r0.addFlags(r7)
        L_0x018b:
            r0.putExtras(r6)
            android.content.Context r12 = wb0.C13233c.m33333b()     // Catch:{ zzc -> 0x01a4 }
            boolean r4 = r12 instanceof android.app.Activity     // Catch:{ zzc -> 0x01a4 }
            if (r4 != 0) goto L_0x0199
            r0.addFlags(r7)     // Catch:{ zzc -> 0x01a4 }
        L_0x0199:
            r12.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x019d }
            goto L_0x01c0
        L_0x019d:
            r12 = move-exception
            com.umo.ads.d.zzc r0 = new com.umo.ads.d.zzc     // Catch:{ zzc -> 0x01a4 }
            r0.<init>(r12)     // Catch:{ zzc -> 0x01a4 }
            throw r0     // Catch:{ zzc -> 0x01a4 }
        L_0x01a4:
            r12 = move-exception
            r12.printStackTrace()
            ch.qos.logback.classic.Logger r12 = ac0.C7557a.f23040a
            boolean r0 = nc0.C12954d.m32800c(r11)
            if (r0 == 0) goto L_0x01b5
            java.lang.String r11 = p584jl.C17885a.m44403H0(r11)
            goto L_0x01b6
        L_0x01b5:
            r11 = r2
        L_0x01b6:
            java.lang.String r0 = "VIDEO_PLAYER: Unable to start Activity for playing Video Ad"
            java.lang.String r11 = mf0.C24362h.m61216k(r11, r0)
            r12.mo6667d(r11)
        L_0x01bf:
            r1 = 0
        L_0x01c0:
            if (r1 != 0) goto L_0x01ce
            com.cubic.umo.ad.ext.types.UMOAdKitError r11 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            vb0.a r12 = mf0.C24368m.f61691c
            if (r12 != 0) goto L_0x01c9
            goto L_0x01ce
        L_0x01c9:
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.NONE
            r12.mo39550B(r2, r11, r0)
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14280j1.mo42848c(java.lang.String, mc0.a):void");
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        Object zza = ((C16552f0) this.f35919b).zza();
        return new C14276i1((C14243a0) zza, C16550e0.m42052a((C16552f0) this.f35920c), (C14335x0) ((C16552f0) this.f35921d).zza(), C16550e0.m42052a((C16552f0) this.f35922e));
    }
}
