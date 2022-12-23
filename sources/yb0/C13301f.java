package yb0;

import ac0.C7557a;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKit;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.umo.ads.p343d.zza;
import com.umo.ads.p350u.zzn;
import p043ch.qos.logback.classic.Logger;
import p145k5.C5484c;
import p389bl.C13637c;
import p584jl.C17886b;
import wb0.C13233c;

/* renamed from: yb0.f */
public final class C13301f {

    /* renamed from: a */
    public static final C13301f f33010a = new C13301f();

    /* renamed from: b */
    public static UMOAdKitError f33011b;

    /* renamed from: c */
    public static UMOAdKitError f33012c;

    static {
        UMOAdKitError uMOAdKitError = UMOAdKitError.NONE;
        f33011b = uMOAdKitError;
        f33012c = uMOAdKitError;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0182  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m33524a() throws com.umo.ads.p343d.zza {
        /*
            m33526e()
            android.content.Context r0 = wb0.C13233c.f32842a
            com.umo.ads.u.zzn r0 = com.umo.ads.p350u.zzn.DEINIT_IN_PROGRESS
            wb0.C13233c.m33338g(r0)
            yb0.g r0 = yb0.C13302g.f33013b
            int r1 = yb0.C13302g.f33016e
            r2 = 7
            r3 = 0
            yb0.C13302g.m33529F(r2, r3)
            java.lang.String r2 = yb0.C13302g.f33014c
            mc0.a r2 = yb0.C13302g.m33533M(r2)
            java.lang.String r4 = ""
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x0022
            r0 = r6
            goto L_0x00cf
        L_0x0022:
            int r1 = p584jl.C17885a.m44413M0(r1)
            if (r1 == r5) goto L_0x00ca
            r7 = 3
            if (r1 == r7) goto L_0x00b3
            r8 = 4
            if (r1 == r8) goto L_0x00ca
            r9 = 5
            if (r1 == r9) goto L_0x0036
            r0.mo40208K(r3)
            goto L_0x00cd
        L_0x0036:
            java.lang.String r0 = yb0.C13302g.f33014c
            com.umo.ads.u.zzf r1 = r2.f31947b
            java.lang.String r2 = "adType"
            mf0.C24362h.m61211f(r1, r2)
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r9 = "Removing Roll Ad ("
            java.lang.StringBuilder r9 = ce0.C21100e.m49315J0(r9)
            java.lang.String r10 = r1.name()
            r9.append(r10)
            r10 = 41
            r9.append(r10)
            boolean r10 = nc0.C12954d.m32800c(r0)
            if (r10 == 0) goto L_0x005e
            java.lang.String r0 = p584jl.C17885a.m44403H0(r0)
            goto L_0x005f
        L_0x005e:
            r0 = r4
        L_0x005f:
            r9.append(r0)
            java.lang.String r0 = "..."
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r2.mo6672i(r0)
            int r0 = r1.ordinal()
            if (r0 == r7) goto L_0x0097
            if (r0 == r8) goto L_0x0077
            goto L_0x00cd
        L_0x0077:
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKVPaidAdActivity> r0 = com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity.f7330z
            if (r0 != 0) goto L_0x007c
            goto L_0x00cd
        L_0x007c:
            java.lang.Object r0 = r0.get()
            com.cubic.umo.ad.playback.ui.activities.AKVPaidAdActivity r0 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity) r0
            if (r0 != 0) goto L_0x0085
            goto L_0x00cd
        L_0x0085:
            hc0.c r1 = r0.f7332y
            if (r1 != 0) goto L_0x008a
            goto L_0x0092
        L_0x008a:
            gc0.b r1 = r1.f31518e
            if (r1 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r1.mo39526f(r5)
        L_0x0092:
            com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity.f7329A = r6
            r0.f7332y = r6
            goto L_0x00cd
        L_0x0097:
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKVideoAdActivity> r0 = com.cubic.umo.p045ad.playback.p046ui.activities.AKVideoAdActivity.f7333A
            if (r0 != 0) goto L_0x009c
            goto L_0x00cd
        L_0x009c:
            java.lang.Object r0 = r0.get()
            com.cubic.umo.ad.playback.ui.activities.AKVideoAdActivity r0 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKVideoAdActivity) r0
            if (r0 != 0) goto L_0x00a5
            goto L_0x00cd
        L_0x00a5:
            hc0.d r0 = r0.f7336z
            if (r0 != 0) goto L_0x00aa
            goto L_0x00cd
        L_0x00aa:
            com.umo.ads.o.zzc r0 = r0.f31524e
            if (r0 != 0) goto L_0x00af
            goto L_0x00cd
        L_0x00af:
            r0.mo35819z(r5)
            goto L_0x00cd
        L_0x00b3:
            yb0.a r1 = yb0.C13302g.f33020i
            if (r1 != 0) goto L_0x00b8
            goto L_0x00bb
        L_0x00b8:
            r1.mo40154b(r3)
        L_0x00bb:
            yb0.C13302g.f33020i = r6
            java.lang.String r1 = yb0.C13302g.f33014c
            com.cubic.umo.ad.ext.types.UMOAdKitRollAdEvent r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitRollAdEvent.AD_REMOVED
            com.cubic.umo.ad.ext.types.UMOAdKitError r7 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            yb0.C13302g.m33530H(r1, r2, r7)
            r0.mo40208K(r3)
            goto L_0x00cd
        L_0x00ca:
            yb0.C13302g.m33529F(r5, r3)
        L_0x00cd:
            bf0.d r0 = bf0.C21050d.f52856a
        L_0x00cf:
            if (r0 != 0) goto L_0x00d4
            yb0.C13302g.m33529F(r5, r3)
        L_0x00d4:
            yb0.C13302g.f33015d = r5
            yb0.C13302g.f33014c = r4
            yb0.C13302g.f33019h = r6
            yb0.a r0 = yb0.C13302g.f33020i
            if (r0 != 0) goto L_0x00df
            goto L_0x00e2
        L_0x00df:
            r0.mo40154b(r3)
        L_0x00e2:
            p389bl.C13637c.f33647n = r3
            j$.util.concurrent.ConcurrentHashMap r0 = p389bl.C13637c.f33649p
            if (r0 != 0) goto L_0x00e9
            goto L_0x00ec
        L_0x00e9:
            r0.clear()
        L_0x00ec:
            p389bl.C13637c.f33649p = r6
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity> r0 = com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity.f7325A
            if (r0 != 0) goto L_0x00f3
            goto L_0x00fb
        L_0x00f3:
            java.lang.Object r0 = r0.get()
            com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity r0 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity) r0
            if (r0 != 0) goto L_0x00fd
        L_0x00fb:
            r0 = r6
            goto L_0x00ff
        L_0x00fd:
            hc0.a r0 = r0.f7326x
        L_0x00ff:
            if (r0 != 0) goto L_0x0116
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity> r0 = com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity.f7325A
            if (r0 != 0) goto L_0x0106
            goto L_0x010e
        L_0x0106:
            java.lang.Object r0 = r0.get()
            com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity r0 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity) r0
            if (r0 != 0) goto L_0x0110
        L_0x010e:
            r0 = r6
            goto L_0x0112
        L_0x0110:
            hc0.b r0 = r0.f7327y
        L_0x0112:
            if (r0 != 0) goto L_0x0116
            r0 = 0
            goto L_0x0117
        L_0x0116:
            r0 = 1
        L_0x0117:
            if (r0 == 0) goto L_0x017d
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity> r0 = com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity.f7325A
            if (r0 != 0) goto L_0x011e
            goto L_0x017d
        L_0x011e:
            java.lang.Object r0 = r0.get()
            com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity r0 = (com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity) r0
            if (r0 != 0) goto L_0x0127
            goto L_0x017d
        L_0x0127:
            hc0.a r1 = r0.f7326x
            if (r1 != 0) goto L_0x012c
            goto L_0x0152
        L_0x012c:
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r7 = r1.f31496a
            boolean r8 = nc0.C12954d.m32800c(r7)
            if (r8 == 0) goto L_0x013b
            java.lang.String r7 = p584jl.C17885a.m44403H0(r7)
            goto L_0x013c
        L_0x013b:
            r7 = r4
        L_0x013c:
            java.lang.String r8 = "Removing HTML Interstitial Ad"
            java.lang.String r7 = mf0.C24362h.m61216k(r7, r8)
            r2.mo6672i(r7)
            kc0.b r2 = r1.f31501f
            if (r2 != 0) goto L_0x014a
            goto L_0x014d
        L_0x014a:
            r2.destroy()
        L_0x014d:
            java.lang.String r1 = r1.f31496a
            r0.mo11140b1(r1)
        L_0x0152:
            hc0.b r1 = r0.f7327y
            if (r1 != 0) goto L_0x0157
            goto L_0x017d
        L_0x0157:
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.String r7 = r1.f31507b
            boolean r8 = nc0.C12954d.m32800c(r7)
            if (r8 == 0) goto L_0x0166
            java.lang.String r7 = p584jl.C17885a.m44403H0(r7)
            goto L_0x0167
        L_0x0166:
            r7 = r4
        L_0x0167:
            java.lang.String r8 = "Removing MRAID Interstitial Ad"
            java.lang.String r7 = mf0.C24362h.m61216k(r7, r8)
            r2.mo6672i(r7)
            kc0.i r2 = r1.f31513h
            if (r2 != 0) goto L_0x0175
            goto L_0x0178
        L_0x0175:
            r2.mo39704t()
        L_0x0178:
            java.lang.String r1 = r1.f31507b
            r0.mo11140b1(r1)
        L_0x017d:
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, yb0.d> r0 = wb0.C13233c.f32848g
            if (r0 != 0) goto L_0x0182
            goto L_0x01ab
        L_0x0182:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x018a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01a9
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            yb0.d r1 = (yb0.C13295d) r1
            r1.mo40164F0()
            wb0.C13233c.m33354w(r2)
            goto L_0x018a
        L_0x01a9:
            wb0.C13233c.f32848g = r6
        L_0x01ab:
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, mc0.d> r0 = wb0.C13233c.f32850i
            if (r0 != 0) goto L_0x01b0
            goto L_0x01ce
        L_0x01b0:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01b8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01ce
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            mc0.d r1 = (mc0.C12912d) r1
            wb0.C13233c.m33346o(r1)
            goto L_0x01b8
        L_0x01ce:
            wb0.C13233c.f32850i = r6
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<android.view.ViewGroup>> r0 = wb0.C13233c.f32849h
            if (r0 != 0) goto L_0x01d6
            goto L_0x02de
        L_0x01d6:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x01de:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02dc
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 != 0) goto L_0x0200
            goto L_0x02d6
        L_0x0200:
            boolean r7 = r1 instanceof com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView
            if (r7 == 0) goto L_0x02d6
            r7 = r1
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView r7 = (com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView) r7
            android.content.Context r8 = wb0.C13233c.f32842a
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r8 = r7.f7242b
            if (r8 != 0) goto L_0x020f
            r8 = r6
            goto L_0x0213
        L_0x020f:
            java.lang.String r8 = r8.mo11107d()
        L_0x0213:
            mc0.d r8 = wb0.C13233c.m33348q(r8)
            if (r8 != 0) goto L_0x021b
            goto L_0x02b9
        L_0x021b:
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r10 = "UMOAdKitBannerView: performCleanup()"
            r9.mo6666c(r10)
            java.lang.String r9 = r8.f31967c
            yb0.d r9 = wb0.C13233c.m33344m(r9)
            if (r9 != 0) goto L_0x022b
            goto L_0x0230
        L_0x022b:
            java.lang.String r9 = r8.f31965a
            yb0.C13295d.m33441X(r9)
        L_0x0230:
            android.view.ViewTreeObserver r9 = r7.getViewTreeObserver()
            r9.removeOnScrollChangedListener(r7)
            yb0.d r9 = r7.mo11063j(r3)
            if (r9 != 0) goto L_0x023e
            goto L_0x0298
        L_0x023e:
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r11 = "BANNER_AD_HANDLER: Releasing AKBannerAdHandler"
            java.lang.StringBuilder r11 = ce0.C21100e.m49315J0(r11)
            java.util.List<java.lang.String> r12 = r9.f32986c
            if (r12 == 0) goto L_0x0253
            boolean r13 = r12.isEmpty()
            r13 = r13 ^ r5
            if (r13 == 0) goto L_0x0253
            r13 = 1
            goto L_0x0254
        L_0x0253:
            r13 = 0
        L_0x0254:
            if (r13 == 0) goto L_0x0273
            java.lang.StringBuilder r15 = p172m9.C5720b.m14044L(r12)
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 62
            java.lang.String r13 = ", "
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            java.lang.String r12 = kotlin.collections.C23825c.m58520q0(r12, r13, r14, r15, r16, r17)
            java.lang.String r5 = com.google.android.play.core.appupdate.C14226d.m35344K0(r5, r12)
            goto L_0x0274
        L_0x0273:
            r5 = r4
        L_0x0274:
            r11.append(r5)
            java.lang.String r5 = " (Key: "
            r11.append(r5)
            java.lang.String r5 = r9.f32985b
            java.lang.String r12 = "mapKey"
            if (r5 == 0) goto L_0x02d2
            r11.append(r5)
            java.lang.String r5 = ")..."
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            r10.mo6666c(r5)
            java.lang.String r5 = r9.f32985b
            if (r5 == 0) goto L_0x02ce
            wb0.C13233c.m33354w(r5)
        L_0x0298:
            java.lang.String r5 = r8.f31965a
            boolean r9 = nc0.C12954d.m32800c(r5)
            if (r9 != 0) goto L_0x02a1
            goto L_0x02b2
        L_0x02a1:
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, mc0.d> r9 = wb0.C13233c.f32850i
            if (r9 != 0) goto L_0x02a6
            goto L_0x02b2
        L_0x02a6:
            java.lang.Object r5 = r9.get(r5)
            mc0.d r5 = (mc0.C12912d) r5
            if (r5 != 0) goto L_0x02af
            goto L_0x02b2
        L_0x02af:
            wb0.C13233c.m33346o(r5)
        L_0x02b2:
            java.lang.String r5 = r8.f31965a
            wb0.C13233c.m33352u(r5)
            r8.f31978n = r6
        L_0x02b9:
            r5 = -2
            r7.mo11064k(r5, r5)
            android.widget.FrameLayout r5 = r7.getPlaceholderLayout$ads_release()
            if (r5 != 0) goto L_0x02c4
            goto L_0x02c7
        L_0x02c4:
            r5.removeAllViews()
        L_0x02c7:
            com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView.m5802h(r7, r3)
            r1.removeAllViews()
            goto L_0x02d6
        L_0x02ce:
            mf0.C24362h.m61217l(r12)
            throw r6
        L_0x02d2:
            mf0.C24362h.m61217l(r12)
            throw r6
        L_0x02d6:
            wb0.C13233c.m33352u(r2)
            r5 = 1
            goto L_0x01de
        L_0x02dc:
            wb0.C13233c.f32849h = r6
        L_0x02de:
            wb0.C13233c.f32844c = r6
            wb0.C13233c.f32845d = r6
            wb0.C13233c.f32847f = r6
            com.umo.ads.u.zzn r0 = com.umo.ads.p350u.zzn.NONE
            wb0.C13233c.m33338g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13301f.m33524a():void");
    }

    /* renamed from: c */
    public static void m33525c(boolean z, UMOAdKitError uMOAdKitError) {
        zzn zzn;
        if (C13233c.f32846e == zzn.INIT_IN_PROGRESS) {
            if (z) {
                zzn = zzn.INITIALIZED;
            } else {
                zzn = zzn.NONE;
            }
            C13233c.m33338g(zzn);
            Logger logger = C7557a.f23040a;
            logger.mo6672i("AK_INIT: Notifying UMO Ad Kit Init Status to App: InitStatus: " + z + " (Error: " + uMOAdKitError.name() + ")...");
            C13233c.f32843b.post(new C5484c(z, uMOAdKitError));
        }
    }

    /* renamed from: e */
    public static void m33526e() throws zza {
        UMOAdKit.f7238a.getClass();
        if (!UMOAdKit.Companion.m5801a()) {
            throw new zza(UMOAdKitError.AD_KIT_NOT_INITIALIZED.getDesc());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03d4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40204b(p061d7.C4402a r10) throws com.umo.ads.p343d.zza {
        /*
            r9 = this;
            java.lang.String r0 = "adKitParams"
            mf0.C24362h.m61211f(r10, r0)
            com.cubic.umo.ad.ext.interfaces.UMOAdKit$Companion r0 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKit.f7238a
            r0.getClass()
            boolean r0 = com.cubic.umo.p045ad.ext.interfaces.UMOAdKit.Companion.m5801a()
            if (r0 != 0) goto L_0x042a
            java.lang.String r0 = r10.f15456b
            boolean r1 = nc0.C12954d.m32800c(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x001b
            goto L_0x0028
        L_0x001b:
            boolean r1 = android.webkit.URLUtil.isHttpUrl(r0)
            if (r1 != 0) goto L_0x002a
            boolean r0 = android.webkit.URLUtil.isHttpsUrl(r0)
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = 0
            goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 == 0) goto L_0x041e
            java.lang.String r0 = r10.f15455a
            boolean r0 = nc0.C12954d.m32800c(r0)
            if (r0 == 0) goto L_0x0412
            com.umo.ads.u.zzn r0 = wb0.C13233c.f32846e
            com.umo.ads.u.zzn r1 = com.umo.ads.p350u.zzn.INIT_IN_PROGRESS
            if (r0 == r1) goto L_0x0406
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "************** Initializing UMO Ad Kit with Ad Kit Params: "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r5 = " **************"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.mo6672i(r4)
            r0 = 511(0x1ff, float:7.16E-43)
            r4 = 0
            d7.a r10 = p061d7.C4402a.m11578a(r10, r4, r0)
            wb0.C13233c.f32844c = r10
            wb0.C13233c.m33338g(r1)
            android.content.Context r10 = zb0.C13364a.f33155a
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r0 = "Collecting Meta Data like App Data, Device Data etc.,"
            r10.mo6672i(r0)
            java.lang.String r10 = zb0.C13364a.f33156b
            boolean r10 = nc0.C12954d.m32800c(r10)
            if (r10 != 0) goto L_0x00a6
            android.content.Context r10 = zb0.C13364a.f33155a     // Catch:{ NameNotFoundException -> 0x0095 }
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0095 }
            java.lang.String r1 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x0095 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0095 }
            java.lang.String r1 = "appContext.packageManage…ppContext.packageName, 0)"
            mf0.C24362h.m61210e(r0, r1)     // Catch:{ NameNotFoundException -> 0x0095 }
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0095 }
            java.lang.CharSequence r10 = r10.getApplicationLabel(r0)     // Catch:{ NameNotFoundException -> 0x0095 }
            java.lang.String r10 = r10.toString()     // Catch:{ NameNotFoundException -> 0x0095 }
            zb0.C13364a.f33156b = r10     // Catch:{ NameNotFoundException -> 0x0095 }
            goto L_0x00a6
        L_0x0095:
            r10 = move-exception
            java.lang.String r0 = "Unknown_App_Name"
            zb0.C13364a.f33156b = r0
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = r10.getLocalizedMessage()
            r0.mo6667d(r1)
            r10.printStackTrace()
        L_0x00a6:
            java.lang.String r10 = zb0.C13364a.f33157c
            boolean r10 = nc0.C12954d.m32800c(r10)
            if (r10 != 0) goto L_0x00d7
            android.content.Context r10 = zb0.C13364a.f33155a     // Catch:{ NameNotFoundException -> 0x00c6 }
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c6 }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c6 }
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r10, r3)     // Catch:{ NameNotFoundException -> 0x00c6 }
            java.lang.String r10 = r10.versionName     // Catch:{ NameNotFoundException -> 0x00c6 }
            java.lang.String r0 = "pInfo.versionName"
            mf0.C24362h.m61210e(r10, r0)     // Catch:{ NameNotFoundException -> 0x00c6 }
            zb0.C13364a.f33157c = r10     // Catch:{ NameNotFoundException -> 0x00c6 }
            goto L_0x00d7
        L_0x00c6:
            r10 = move-exception
            java.lang.String r0 = "Unknown_App_Version"
            zb0.C13364a.f33157c = r0
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = r10.getLocalizedMessage()
            r0.mo6667d(r1)
            r10.printStackTrace()
        L_0x00d7:
            android.content.Context r10 = zb0.C13364a.f33155a
            java.lang.String r0 = r10.getPackageName()
            java.lang.String r1 = "appContext.packageName"
            mf0.C24362h.m61210e(r0, r1)
            zb0.C13364a.f33158d = r0
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "*************** APP_NAME: "
            java.lang.StringBuilder r1 = ce0.C21100e.m49315J0(r1)
            java.lang.String r5 = zb0.C13364a.f33156b
            r1.append(r5)
            java.lang.String r5 = ", APP_VERSION: "
            r1.append(r5)
            java.lang.String r5 = zb0.C13364a.f33157c
            r1.append(r5)
            java.lang.String r5 = ", APP_BUNDLE: "
            r1.append(r5)
            java.lang.String r5 = zb0.C13364a.f33158d
            r1.append(r5)
            java.lang.String r5 = " ***************"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.mo6672i(r1)
            java.lang.String r0 = zb0.C13364a.f33159e
            boolean r0 = nc0.C12954d.m32800c(r0)
            if (r0 != 0) goto L_0x0123
            android.os.Handler r0 = wb0.C13233c.f32843b
            x.i r1 = new x.i
            r1.<init>(r2)
            r0.post(r1)
        L_0x0123:
            zb0.C13364a.m33639b()
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            zb0.C13364a.f33171q = r1
            int r0 = r0.heightPixels
            zb0.C13364a.f33170p = r0
            int r0 = zb0.C13364a.m33640c()
            r1 = 2
            r5 = 3
            if (r0 != r1) goto L_0x013f
            goto L_0x0149
        L_0x013f:
            if (r0 != r5) goto L_0x0149
            int r0 = zb0.C13364a.f33171q
            int r1 = zb0.C13364a.f33170p
            zb0.C13364a.f33171q = r1
            zb0.C13364a.f33170p = r0
        L_0x0149:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "Device Resolution: Width: "
            java.lang.StringBuilder r1 = ce0.C21100e.m49315J0(r1)
            int r6 = zb0.C13364a.f33171q
            r1.append(r6)
            java.lang.String r6 = ", Height: "
            r1.append(r6)
            int r6 = zb0.C13364a.f33170p
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.mo6672i(r1)
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r10.getSystemService(r0)
            if (r0 == 0) goto L_0x03fe
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = r0.getSimOperatorName()
            java.lang.String r6 = "telephonyMgr.simOperatorName"
            mf0.C24362h.m61210e(r1, r6)
            zb0.C13364a.f33177w = r1
            java.lang.String r0 = r0.getNetworkOperator()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x01e3
            java.lang.String r1 = "networkOperator"
            mf0.C24362h.m61210e(r0, r1)
            java.lang.String r1 = r0.substring(r3, r5)
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            mf0.C24362h.m61210e(r1, r6)
            java.lang.Integer r6 = uh0.C25080g.m62829y(r1)
            r7 = -1
            if (r6 != 0) goto L_0x01a9
            java.lang.Float r1 = uh0.C25080g.m62828x(r1)
            if (r1 != 0) goto L_0x01a3
            r1 = -1
            goto L_0x01ad
        L_0x01a3:
            float r1 = r1.floatValue()
            int r1 = (int) r1
            goto L_0x01ad
        L_0x01a9:
            int r1 = r6.intValue()
        L_0x01ad:
            java.lang.String r0 = r0.substring(r5)
            java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
            mf0.C24362h.m61210e(r0, r6)
            java.lang.Integer r6 = uh0.C25080g.m62829y(r0)
            if (r6 != 0) goto L_0x01c9
            java.lang.Float r0 = uh0.C25080g.m62828x(r0)
            if (r0 != 0) goto L_0x01c3
            goto L_0x01cd
        L_0x01c3:
            float r0 = r0.floatValue()
            int r7 = (int) r0
            goto L_0x01cd
        L_0x01c9:
            int r7 = r6.intValue()
        L_0x01cd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            zb0.C13364a.f33178x = r0
        L_0x01e3:
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            if (r0 < r5) goto L_0x01f3
            r0 = 1
            goto L_0x01f4
        L_0x01f3:
            r0 = 0
        L_0x01f4:
            if (r0 == 0) goto L_0x0213
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.densityDpi
            r1 = 160(0xa0, float:2.24E-43)
            if (r0 == r1) goto L_0x0211
            r1 = 213(0xd5, float:2.98E-43)
            if (r0 == r1) goto L_0x0211
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 == r1) goto L_0x0211
            r1 = 320(0x140, float:4.48E-43)
            if (r0 == r1) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r0 = 1
            goto L_0x0214
        L_0x0213:
            r0 = 0
        L_0x0214:
            android.content.res.Resources r1 = r10.getResources()
            int r5 = p026b7.C1497b.umoak_is_device_a_tablet
            boolean r1 = r1.getBoolean(r5)
            ch.qos.logback.classic.Logger r5 = ac0.C7557a.f23040a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "********** AK_DEVICE_TYPE: isDeviceATablet1 ("
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = "), isDeviceATablet2 ("
            r6.append(r0)
            r6.append(r1)
            r0 = 41
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r5.mo6672i(r0)
            if (r1 == 0) goto L_0x0245
            r0 = 5
            goto L_0x0246
        L_0x0245:
            r0 = 4
        L_0x0246:
            zb0.C13364a.f33164j = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            mf0.C24362h.m61210e(r0, r1)
            zb0.C13364a.f33165k = r0
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            mf0.C24362h.m61210e(r0, r1)
            zb0.C13364a.f33166l = r0
            java.lang.String r0 = "Android"
            zb0.C13364a.f33167m = r0
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = "RELEASE"
            mf0.C24362h.m61210e(r0, r1)
            zb0.C13364a.f33168n = r0
            java.lang.String r0 = android.os.Build.HARDWARE
            java.lang.String r1 = "HARDWARE"
            mf0.C24362h.m61210e(r0, r1)
            zb0.C13364a.f33169o = r0
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.densityDpi
            zb0.C13364a.f33172r = r0
            zb0.C13364a.f33173s = r2
            zb0.C13364a.f33174t = r3
            java.lang.String r0 = ""
            zb0.C13364a.f33175u = r0
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r1 = r1.getConfiguration()
            n1.h r1 = p177n1.C5804e.m14236a(r1)
            java.util.Locale r1 = r1.mo21675a(r3)
            if (r1 != 0) goto L_0x0297
            goto L_0x029d
        L_0x0297:
            java.lang.String r1 = r1.getISO3Language()
            if (r1 != 0) goto L_0x029e
        L_0x029d:
            r1 = r0
        L_0x029e:
            zb0.C13364a.f33176v = r1
            java.lang.String r1 = "connectivity"
            java.lang.Object r10 = r10.getSystemService(r1)
            if (r10 == 0) goto L_0x03f6
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()
            if (r10 == 0) goto L_0x02c7
            boolean r1 = r10.isConnected()
            if (r1 != 0) goto L_0x02b7
            goto L_0x02c7
        L_0x02b7:
            int r1 = r10.getType()
            if (r1 != r2) goto L_0x02be
            goto L_0x02c7
        L_0x02be:
            int r1 = r10.getType()
            if (r1 != 0) goto L_0x02c7
            r10.getSubtype()
        L_0x02c7:
            d7.a r10 = wb0.C13233c.f32844c
            java.lang.String r1 = "/"
            if (r10 != 0) goto L_0x02ce
            goto L_0x02f0
        L_0x02ce:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r10.f15456b
            java.lang.String r6 = "<this>"
            mf0.C24362h.m61211f(r5, r6)
            boolean r6 = uh0.C25081h.m62836z(r5, r1, r2)
            if (r6 == 0) goto L_0x02e1
            goto L_0x02e5
        L_0x02e1:
            java.lang.String r5 = mf0.C24362h.m61216k(r1, r5)
        L_0x02e5:
            r0.append(r5)
            java.lang.String r10 = r10.f15455a
            java.lang.String r5 = "/umo_ad_kit_params.json"
            java.lang.String r0 = p001a0.C0016g.m31o(r0, r10, r5)
        L_0x02f0:
            java.lang.String r10 = com.umo.ads.p351v.zza.m32114a(r0)
            r5 = 46
            if (r10 != 0) goto L_0x02fa
            r10 = r4
            goto L_0x031e
        L_0x02fa:
            com.cubic.umo.ad.types.AKHostedConfig r10 = p584jl.C17886b.m44490q(r10, r2)
            if (r10 != 0) goto L_0x033b
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "AK_INIT: Hosted Config Data available in Local Cache but it is INVALID, Key: "
            r6.append(r7)
            r6.append(r0)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r10.mo6667d(r6)
            com.umo.ads.p351v.zza.m32116c(r0)
            bf0.d r10 = bf0.C21050d.f52856a
        L_0x031e:
            if (r10 != 0) goto L_0x0339
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "AK_INIT: No Hosted Config Data available in Local Cache, Key: "
            r6.append(r7)
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            r10.mo6672i(r0)
        L_0x0339:
            r10 = r4
            goto L_0x0354
        L_0x033b:
            ch.qos.logback.classic.Logger r6 = ac0.C7557a.f23040a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "AK_INIT: Hosted Config Data available in Local Cache, Key: "
            r7.append(r8)
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            r6.mo6672i(r0)
        L_0x0354:
            if (r10 != 0) goto L_0x0358
            r10 = 0
            goto L_0x035c
        L_0x0358:
            boolean r10 = p584jl.C17886b.m44493t(r10, r2)
        L_0x035c:
            bl.c r0 = p389bl.C13637c.f33645l
            d7.a r6 = wb0.C13233c.f32844c
            if (r6 != 0) goto L_0x0363
            goto L_0x0367
        L_0x0363:
            java.lang.String r6 = r6.f15456b
            if (r6 != 0) goto L_0x0369
        L_0x0367:
            r1 = r4
            goto L_0x037a
        L_0x0369:
            boolean r7 = uh0.C25081h.m62836z(r6, r1, r2)
            if (r7 == 0) goto L_0x0370
            goto L_0x0374
        L_0x0370:
            java.lang.String r6 = mf0.C24362h.m61216k(r1, r6)
        L_0x0374:
            java.lang.String r1 = "ad_templates/umo_ad_kit_ad_templates_android.json"
            java.lang.String r1 = mf0.C24362h.m61216k(r1, r6)
        L_0x037a:
            mf0.C24362h.m61208c(r1)
            java.lang.String r6 = com.umo.ads.p351v.zza.m32114a(r1)
            if (r6 != 0) goto L_0x0385
            r6 = r4
            goto L_0x039b
        L_0x0385:
            com.cubic.umo.ad.types.AKHostedAdTemplatesData r6 = p389bl.C13637c.m34060O(r6, r2)
            if (r6 != 0) goto L_0x03b7
            ch.qos.logback.classic.Logger r6 = ac0.C7557a.f23040a
            java.lang.String r7 = "AK_INIT: Cleaning-up INVALID Ad Rendering Templates available in Local Cache, Key: "
            java.lang.String r7 = mf0.C24362h.m61216k(r1, r7)
            r6.mo6667d(r7)
            com.umo.ads.p351v.zza.m32116c(r1)
            bf0.d r6 = bf0.C21050d.f52856a
        L_0x039b:
            if (r6 != 0) goto L_0x03d1
            ch.qos.logback.classic.Logger r6 = ac0.C7557a.f23040a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "AK_INIT: No Ad Rendering Templates available in Local Cache, Key: "
            r7.append(r8)
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = r7.toString()
            r6.mo6672i(r1)
            goto L_0x03d1
        L_0x03b7:
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "AK_INIT: Ad Rendering Templates available in Local Cache, Key: "
            r7.append(r8)
            r7.append(r1)
            r7.append(r5)
            java.lang.String r1 = r7.toString()
            r4.mo6672i(r1)
            r4 = r6
        L_0x03d1:
            if (r4 != 0) goto L_0x03d4
            goto L_0x03d8
        L_0x03d4:
            boolean r3 = r0.mo40522R(r4, r2)
        L_0x03d8:
            if (r10 == 0) goto L_0x03e8
            if (r3 == 0) goto L_0x03e8
            ch.qos.logback.classic.Logger r10 = ac0.C7557a.f23040a
            java.lang.String r0 = "AK_INIT: LOCAL Config Data & Ad Templates READY to be utilized..."
            r10.mo6672i(r0)
            com.cubic.umo.ad.ext.types.UMOAdKitError r10 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            m33525c(r2, r10)
        L_0x03e8:
            java.lang.Thread r10 = new java.lang.Thread
            r8.a r0 = new r8.a
            r0.<init>(r2)
            r10.<init>(r0)
            r10.start()
            return
        L_0x03f6:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.net.ConnectivityManager"
            r10.<init>(r0)
            throw r10
        L_0x03fe:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r10.<init>(r0)
            throw r10
        L_0x0406:
            com.umo.ads.d.zza r10 = new com.umo.ads.d.zza
            com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_KIT_INITIALIZATION_ALREADY_IN_PROGRESS
            java.lang.String r0 = r0.getDesc()
            r10.<init>(r0)
            throw r10
        L_0x0412:
            com.umo.ads.d.zza r10 = new com.umo.ads.d.zza
            com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.INVALID_PUBLISHER_ID
            java.lang.String r0 = r0.getDesc()
            r10.<init>(r0)
            throw r10
        L_0x041e:
            com.umo.ads.d.zza r10 = new com.umo.ads.d.zza
            com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.INVALID_CONFIG_BASE_PATH
            java.lang.String r0 = r0.getDesc()
            r10.<init>(r0)
            throw r10
        L_0x042a:
            com.umo.ads.d.zza r10 = new com.umo.ads.d.zza
            com.cubic.umo.ad.ext.types.UMOAdKitError r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_KIT_ALREADY_INITIALIZED
            java.lang.String r0 = r0.getDesc()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13301f.mo40204b(d7.a):void");
    }

    /* renamed from: d */
    public final void mo40205d(boolean z) {
        UMOAdKitError uMOAdKitError;
        if (C13233c.f32846e == zzn.INIT_IN_PROGRESS) {
            boolean z2 = C17886b.f45891e;
            boolean z3 = C13637c.f33646m;
            if (z2) {
                C7557a.f23040a.mo6672i("AK_INIT: Ad Templates Operation finished. Waiting for the Hosted Config Operation to be finished...");
            } else if (!z3) {
                UMOAdKitError uMOAdKitError2 = f33011b;
                UMOAdKitError uMOAdKitError3 = UMOAdKitError.NONE;
                if (uMOAdKitError2 != uMOAdKitError3) {
                    Logger logger = C7557a.f23040a;
                    StringBuilder J0 = C21100e.m49315J0("AK_INIT: Both Hosted Config & Ad Templates Operations finished; Hosted Config Operation failed for some reason (");
                    J0.append(f33011b);
                    J0.append(").");
                    logger.mo6667d(J0.toString());
                    m33525c(false, f33011b);
                } else if (!C13637c.f33647n) {
                    Logger logger2 = C7557a.f23040a;
                    StringBuilder J02 = C21100e.m49315J0("AK_INIT: Both Hosted Config & Ad Templates Operations finished; Ad Templates Operation failed for some reason (");
                    J02.append(f33012c);
                    J02.append(").");
                    logger2.mo6667d(J02.toString());
                    m33525c(false, f33012c);
                } else {
                    m33525c(true, uMOAdKitError3);
                }
            } else if (!z || f33011b != (uMOAdKitError = UMOAdKitError.NONE)) {
                Logger logger3 = C7557a.f23040a;
                StringBuilder J03 = C21100e.m49315J0("AK_INIT: Hosted Config Operation failed for some reason while Ad Templates Operation is in progress (");
                J03.append(f33011b);
                J03.append(").");
                logger3.mo6667d(J03.toString());
                C7557a.f23040a.mo6672i("AK_INIT: Cancelling Ad Rendering Templates Json Request...");
                m33525c(false, f33011b);
            } else if (C13637c.f33647n) {
                C7557a.f23040a.mo6672i("AK_INIT: Hosted Config Operation finished. Not waiting for the Ad Templates Operation to be finished as Locally Saved Ad Templates are available.");
                m33525c(true, uMOAdKitError);
            } else {
                C7557a.f23040a.mo6672i("AK_INIT: Hosted Config Operation finished. Waiting for the Ad Templates Operation to be finished...");
            }
        }
    }
}
