package p389bl;

import ac0.C7557a;
import android.content.Context;
import android.graphics.Rect;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdOrientation;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity;
import com.cubic.umo.p045ad.types.AKBannerResponse;
import com.umo.ads.p342c.zza;
import com.umo.ads.p342c.zzd;
import com.umo.ads.p347l.zzb;
import com.umo.ads.p350u.zzc;
import com.umo.ads.p350u.zzk;
import gc0.C12724b;
import hc0.C12751a;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.text.C24179b;
import mc0.C12909a;
import mc0.C12912d;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p304x.C7041e;
import p490fl.C17036d;
import p491fm.C17038a;
import p583jk.C17875h;
import p583jk.C17884p;
import p584jl.C17885a;
import p868vl.C20154a;
import p913xi.C20531d;
import vb0.C13197a;
import vb0.C13198b;
import vb0.C13199c;
import vb0.C13200d;
import vb0.C13201e;
import wb0.C13233c;
import zb0.C13366b;
import zb0.C13375g;

/* renamed from: bl.f */
public final class C13640f implements C13201e, C13366b.C13367a, C13375g.C13376a {

    /* renamed from: h */
    public static WeakReference f33654h;

    /* renamed from: b */
    public final Object f33655b;

    /* renamed from: c */
    public final Object f33656c;

    /* renamed from: d */
    public final Object f33657d;

    /* renamed from: e */
    public final Object f33658e;

    /* renamed from: f */
    public final Object f33659f;

    /* renamed from: g */
    public final Object f33660g;

    public /* synthetic */ C13640f(String str, C13197a aVar, C13198b bVar, C13199c cVar, C13200d dVar, C13201e eVar) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(aVar, "displayListener");
        C24362h.m61211f(bVar, "fetchListener");
        C24362h.m61211f(cVar, "interactionListener");
        C24362h.m61211f(dVar, "internalBrowserListener");
        C24362h.m61211f(eVar, "richMediaListener");
        this.f33655b = str;
        this.f33656c = aVar;
        this.f33657d = bVar;
        this.f33658e = cVar;
        this.f33659f = dVar;
        this.f33660g = eVar;
    }

    /* renamed from: A */
    public final void mo39549A(String str) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: E */
    public final void mo39553E(String str) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: a */
    public final void mo40259a(String str, C12909a aVar) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Context context = C13233c.f32842a;
        if (C13233c.m33348q((String) this.f33655b) != null) {
            String str3 = (String) this.f33655b;
            if (C12954d.m32800c(str3)) {
                str2 = C17885a.m44403H0(str3);
            } else {
                str2 = "";
            }
            if (C13233c.m33334c((String) this.f33655b) == null) {
                C7557a.f23040a.mo6667d(C24362h.m61216k(str2, "Invalid Banner Ad Container View"));
                ((C13197a) this.f33656c).mo39578v((String) this.f33655b, UMOAdKitError.INVALID_AD_VIEW);
                return;
            }
            Logger logger = C7557a.f23040a;
            StringBuilder d0 = C17884p.m44363d0("Rendering VAST VPaid Ad in Banner Slot", str2, ": ");
            d0.append(aVar.f31950e);
            logger.mo6672i(d0.toString());
            C13233c.f32843b.post(new C7041e(16, this, aVar));
        }
    }

    /* renamed from: b */
    public final void mo40260b(String str, UMOAdKitError uMOAdKitError) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        mo40524d(uMOAdKitError);
    }

    /* renamed from: c */
    public final void mo39559c(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
    }

    /* renamed from: d */
    public final void mo40524d(UMOAdKitError uMOAdKitError) {
        ((C13197a) this.f33656c).mo39578v((String) this.f33655b, uMOAdKitError);
    }

    /* renamed from: e */
    public final void mo40525e(AKBannerResponse aKBannerResponse, String str, String str2, zza zza) {
        String str3;
        UMOAdKitAdOrientation uMOAdKitAdOrientation;
        Context context = C13233c.f32842a;
        C12912d q = C13233c.m33348q((String) this.f33655b);
        if (q != null) {
            if (C24362h.m61206a(aKBannerResponse.f7440j, "NONE") && C24179b.m60565M(aKBannerResponse.f7439i, "data-rp-type", 0, false, 6) > -1 && C24179b.m60565M(aKBannerResponse.f7439i, "data-rp-impression-id", 0, false, 6) > -1 && C24179b.m60565M(aKBannerResponse.f7439i, "data-rp-aqid", 0, false, 6) > -1) {
                aKBannerResponse.f7440j = "RUBICON";
            }
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("Rendering ");
            J0.append(zza.name());
            J0.append(" Banner");
            String str4 = (String) this.f33655b;
            if (C12954d.m32800c(str4)) {
                str3 = C17885a.m44403H0(str4);
            } else {
                str3 = "";
            }
            J0.append(str3);
            J0.append("...");
            logger.mo6672i(J0.toString());
            UMOAdKitAdOrientation uMOAdKitAdOrientation2 = null;
            if (C13233c.m33345n(q)) {
                mo40526g(zza);
                WeakReference<AKInterstitialAdActivity> weakReference = AKInterstitialAdActivity.f7325A;
                String str5 = (String) this.f33655b;
                UMOAdKitBannerParams uMOAdKitBannerParams = q.f31966b;
                if (uMOAdKitBannerParams != null) {
                    uMOAdKitAdOrientation2 = uMOAdKitBannerParams.mo11105b();
                }
                if (uMOAdKitAdOrientation2 == null) {
                    uMOAdKitAdOrientation = UMOAdKitAdOrientation.UNSPECIFIED;
                } else {
                    uMOAdKitAdOrientation = uMOAdKitAdOrientation2;
                }
                if (!AKInterstitialAdActivity.C2227a.m5863a(str5, aKBannerResponse, zza, str, str2, uMOAdKitAdOrientation)) {
                    mo40524d(UMOAdKitError.AD_PLAY_FAILED);
                    return;
                }
                return;
            }
            C12751a aVar = new C12751a((String) this.f33655b, aKBannerResponse, (C12751a.C12752a) null);
            aVar.f31499d = (C13197a) this.f33656c;
            aVar.f31500e = (C13199c) this.f33658e;
            aVar.mo39544b(zza, str, str2, zzc.INLINE);
        }
    }

    /* renamed from: f */
    public final void mo39562f(String str) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: g */
    public final void mo40526g(zza zza) {
        List list;
        zza zza2 = zza.HTML;
        if (zza == zza2 || zza == zza.IMAGE || zza == zza.MRAID) {
            if (zza == zza2) {
                list = C17875h.m44281E(zzk.BROADCAST_ACTION_INTERSTITIAL_SHOW, zzk.BROADCAST_ACTION_INTERSTITIAL_FAIL, zzk.BROADCAST_ACTION_INTERSTITIAL_CLICK, zzk.BROADCAST_ACTION_INTERSTITIAL_DISMISS);
            } else {
                list = C17875h.m44281E(zzk.BROADCAST_ACTION_INTERSTITIAL_SHOW, zzk.BROADCAST_ACTION_INTERSTITIAL_FAIL, zzk.BROADCAST_ACTION_INTERSTITIAL_CLICK, zzk.BROADCAST_ACTION_INTERSTITIAL_DISMISS);
            }
            zzb zzb = new zzb(C13233c.m33333b(), (String) this.f33655b, list);
            zzb.f30823h = (C13197a) this.f33656c;
            zzb.f30824i = (C13199c) this.f33658e;
            if (zza == zza.MRAID) {
                zzb.f30825j = (C13201e) this.f33660g;
                zzb.f30822g = (C13200d) this.f33659f;
            }
            f33654h = new WeakReference(zzb);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.util.DisplayMetrics} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.util.DisplayMetrics} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.util.DisplayMetrics} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: android.util.DisplayMetrics} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.util.DisplayMetrics} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: android.util.DisplayMetrics} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.util.DisplayMetrics} */
    /* JADX WARNING: type inference failed for: r2v9, types: [com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40527h(java.lang.String r12) {
        /*
            r11 = this;
            android.content.Context r0 = wb0.C13233c.f32842a
            java.lang.Object r0 = r11.f33655b
            java.lang.String r0 = (java.lang.String) r0
            mc0.d r0 = wb0.C13233c.m33348q(r0)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L_0x0019
            com.cubic.umo.ad.ext.types.UMOAdKitError r12 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.EMPTY_RICH_MEDIA_AD_CONTENT
            r11.mo40524d(r12)
            return
        L_0x0019:
            r1 = 0
            java.lang.String r2 = "mraid.js"
            boolean r1 = kotlin.text.C24179b.m60559G(r12, r2, r1)
            if (r1 != 0) goto L_0x0028
            com.cubic.umo.ad.ext.types.UMOAdKitError r12 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.MISSING_MRAID_JS_IN_MRAID
            r11.mo40524d(r12)
            return
        L_0x0028:
            boolean r1 = wb0.C13233c.m33345n(r0)
            r2 = 0
            if (r1 == 0) goto L_0x005b
            com.umo.ads.c.zza r5 = com.umo.ads.p342c.zza.MRAID
            r11.mo40526g(r5)
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKInterstitialAdActivity> r1 = com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity.f7325A
            java.lang.Object r1 = r11.f33655b
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r7 = 0
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r0 = r0.f31966b
            if (r0 != 0) goto L_0x0042
            goto L_0x0046
        L_0x0042:
            com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation r2 = r0.mo11105b()
        L_0x0046:
            if (r2 != 0) goto L_0x004c
            com.cubic.umo.ad.ext.types.UMOAdKitAdOrientation r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitAdOrientation.UNSPECIFIED
            r8 = r0
            goto L_0x004d
        L_0x004c:
            r8 = r2
        L_0x004d:
            r6 = r12
            boolean r12 = com.cubic.umo.p045ad.playback.p046ui.activities.AKInterstitialAdActivity.C2227a.m5863a(r3, r4, r5, r6, r7, r8)
            if (r12 != 0) goto L_0x014b
            com.cubic.umo.ad.ext.types.UMOAdKitError r12 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            r11.mo40524d(r12)
            goto L_0x014b
        L_0x005b:
            hc0.b r0 = new hc0.b
            java.lang.Object r1 = r11.f33655b
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1, r2)
            java.lang.Object r1 = r11.f33656c
            vb0.a r1 = (vb0.C13197a) r1
            r0.f31510e = r1
            java.lang.Object r1 = r11.f33660g
            vb0.e r1 = (vb0.C13201e) r1
            r0.f31509d = r1
            java.lang.Object r1 = r11.f33658e
            vb0.c r1 = (vb0.C13199c) r1
            r0.f31511f = r1
            java.lang.Object r1 = r11.f33659f
            vb0.d r1 = (vb0.C13200d) r1
            r0.f31512g = r1
            java.lang.String r1 = r0.f31507b
            mc0.d r1 = wb0.C13233c.m33348q(r1)
            if (r1 != 0) goto L_0x0086
            goto L_0x014b
        L_0x0086:
            java.lang.String r3 = r0.f31507b
            android.view.ViewGroup r3 = wb0.C13233c.m33334c(r3)
            if (r3 != 0) goto L_0x0090
            goto L_0x014b
        L_0x0090:
            kc0.i r4 = new kc0.i
            java.lang.String r5 = r0.f31507b
            android.content.Context r6 = r3.getContext()
            java.lang.String r7 = "containerView.context"
            mf0.C24362h.m61210e(r6, r7)
            r4.<init>(r5, r6, r0)
            r0.f31513h = r4
            com.umo.ads.u.zzc r5 = com.umo.ads.p350u.zzc.INLINE
            r4.setAdPlacement(r5)
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r1 = r1.f31966b
            if (r1 != 0) goto L_0x00ad
            goto L_0x0148
        L_0x00ad:
            int r4 = r1.mo11123r()
            int r5 = r1.mo11124s()
            int r6 = r1.mo11116k()
            int r1 = r1.mo11117l()
            android.content.Context r7 = zb0.C13364a.f33155a
            android.content.Context r7 = r3.getContext()
            kotlin.Pair r7 = zb0.C13364a.m33638a(r7)
            kc0.i r8 = r0.f31513h
            java.lang.String r9 = "getSystem().displayMetrics"
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r8 != 0) goto L_0x00d0
            goto L_0x010a
        L_0x00d0:
            if (r5 > 0) goto L_0x0103
            java.lang.Object r4 = r7.mo59068c()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            android.content.Context r5 = r3.getContext()
            if (r5 != 0) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            android.content.res.Resources r5 = r5.getResources()
            if (r5 != 0) goto L_0x00eb
        L_0x00e9:
            r5 = r2
            goto L_0x00ef
        L_0x00eb:
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
        L_0x00ef:
            if (r5 != 0) goto L_0x00fc
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            mf0.C24362h.m61210e(r5, r9)
        L_0x00fc:
            float r4 = (float) r4
            float r5 = r5.density
            float r4 = r4 / r5
            float r4 = r4 + r10
            int r4 = (int) r4
            goto L_0x0107
        L_0x0103:
            int r4 = java.lang.Math.max(r4, r5)
        L_0x0107:
            r8.setMaxWidth(r4)
        L_0x010a:
            kc0.i r4 = r0.f31513h
            if (r4 != 0) goto L_0x010f
            goto L_0x0148
        L_0x010f:
            if (r1 > 0) goto L_0x0141
            java.lang.Object r1 = r7.mo59069d()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.content.Context r3 = r3.getContext()
            if (r3 != 0) goto L_0x0122
            goto L_0x012d
        L_0x0122:
            android.content.res.Resources r3 = r3.getResources()
            if (r3 != 0) goto L_0x0129
            goto L_0x012d
        L_0x0129:
            android.util.DisplayMetrics r2 = r3.getDisplayMetrics()
        L_0x012d:
            if (r2 != 0) goto L_0x013a
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            mf0.C24362h.m61210e(r2, r9)
        L_0x013a:
            float r1 = (float) r1
            float r2 = r2.density
            float r1 = r1 / r2
            float r1 = r1 + r10
            int r1 = (int) r1
            goto L_0x0145
        L_0x0141:
            int r1 = java.lang.Math.max(r6, r1)
        L_0x0145:
            r4.setMaxHeight(r1)
        L_0x0148:
            r0.mo39558b(r12)
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13640f.mo40527h(java.lang.String):void");
    }

    /* renamed from: j */
    public final void mo39566j(String str, boolean z) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: m */
    public final void mo39569m(String str) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: q */
    public final void mo39573q(String str, C12724b bVar) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: s */
    public final void mo39575s(String str, Rect rect) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: w */
    public final void mo39579w(String str, zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzd, "vastError");
    }

    /* renamed from: x */
    public final void mo39580x(String str) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: y */
    public final void mo39581y(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zza(String str, boolean z) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzb(String str, String str2) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzc(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final boolean zze(String str, String str2) {
        C24362h.m61211f(str, "spotId");
        return false;
    }

    public final void zzg(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzh(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzn(String str) {
        C24362h.m61211f(str, "spotId");
        ((C13199c) this.f33658e).zzi(str);
    }

    public final void zzp(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzq(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzt(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzy(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zze(String str) {
        C24362h.m61211f(str, "spotId");
        ((C13199c) this.f33658e).mo39567k(str);
    }

    public /* synthetic */ C13640f(C17036d dVar, C17038a aVar, C13639e eVar, C20531d dVar2, C13638d dVar3, C20154a aVar2) {
        this.f33655b = dVar;
        this.f33656c = aVar;
        this.f33657d = eVar;
        this.f33658e = dVar2;
        this.f33659f = dVar3;
        this.f33660g = aVar2;
    }
}
