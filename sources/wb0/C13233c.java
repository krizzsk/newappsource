package wb0;

import ac0.C7557a;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineBannerCreativeType;
import com.cubic.umo.p045ad.types.AKAdUIConfig;
import com.cubic.umo.p045ad.types.AKBannerParams;
import com.cubic.umo.p045ad.types.AKHostedConfig;
import com.cubic.umo.p045ad.types.AKRollParams;
import com.cubic.umo.p045ad.types.AKUmoVideoAdUIConfig;
import com.umo.ads.p344g.zzl;
import com.umo.ads.p350u.zzi;
import com.umo.ads.p350u.zzn;
import java.lang.ref.WeakReference;
import java.util.List;
import mc0.C12912d;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p061d7.C4402a;
import p080f2.C4646a;
import p583jk.C17884p;
import p584jl.C17885a;
import p988j$.util.concurrent.ConcurrentHashMap;
import yb0.C13295d;
import yb0.C13302g;
import yb0.C13308i;

/* renamed from: wb0.c */
public final class C13233c {

    /* renamed from: a */
    public static Context f32842a;

    /* renamed from: b */
    public static final Handler f32843b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public static C4402a f32844c;

    /* renamed from: d */
    public static AKHostedConfig f32845d;

    /* renamed from: e */
    public static zzn f32846e = zzn.NONE;

    /* renamed from: f */
    public static zzl f32847f;

    /* renamed from: g */
    public static ConcurrentHashMap<String, C13295d> f32848g;

    /* renamed from: h */
    public static ConcurrentHashMap<String, WeakReference<ViewGroup>> f32849h;

    /* renamed from: i */
    public static ConcurrentHashMap<String, C12912d> f32850i;

    /* renamed from: a */
    public static int m33332a(C12912d dVar) {
        Integer num;
        AKBannerParams bannerParams;
        UMOAdKitBannerParams uMOAdKitBannerParams;
        if (dVar == null || (uMOAdKitBannerParams = dVar.f31966b) == null) {
            num = null;
        } else {
            num = Integer.valueOf(uMOAdKitBannerParams.mo11121p());
        }
        if (num != null) {
            return num.intValue();
        }
        AKHostedConfig aKHostedConfig = f32845d;
        if (aKHostedConfig == null || (bannerParams = aKHostedConfig.getBannerParams()) == null) {
            return 5;
        }
        return bannerParams.getRequestTimeoutSeconds();
    }

    /* renamed from: b */
    public static Context m33333b() {
        Context context = f32842a;
        if (context != null) {
            return context;
        }
        C24362h.m61217l("appContext");
        throw null;
    }

    /* renamed from: c */
    public static ViewGroup m33334c(String str) {
        String str2;
        WeakReference weakReference;
        if (!C12954d.m32800c(str)) {
            return null;
        }
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        ConcurrentHashMap<String, WeakReference<ViewGroup>> concurrentHashMap = f32849h;
        if (concurrentHashMap == null) {
            weakReference = null;
        } else {
            weakReference = concurrentHashMap.get(str);
        }
        if (weakReference != null) {
            C7557a.f23040a.mo6666c(C24362h.m61216k(str2, "AKMGR_WEAK_AD_VIEW: AdView EXISTS"));
            ViewGroup viewGroup = (ViewGroup) weakReference.get();
            if (viewGroup != null) {
                return viewGroup;
            }
            C7557a.f23040a.mo6667d(C24362h.m61216k(str2, "AKMGR_WEAK_AD_VIEW: AdView seems to be Garbage Collected"));
        }
        C7557a.f23040a.mo6666c(C24362h.m61216k(str2, "AKMGR_WEAK_AD_VIEW: AdView DOESN'T EXIST"));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.cubic.umo.ad.types.AKBannerResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.cubic.umo.ad.types.AKBannerResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.cubic.umo.ad.types.AKBannerResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.cubic.umo.ad.types.AKBannerResponse} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.cubic.umo.p045ad.types.AKBannerResponse m33335d(java.lang.String r4, java.util.List r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            goto L_0x002d
        L_0x0004:
            java.util.Iterator r5 = r5.iterator()
        L_0x0008:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r5.next()
            r2 = r1
            com.cubic.umo.ad.types.AKBannerResponse r2 = (com.cubic.umo.p045ad.types.AKBannerResponse) r2
            java.lang.String r3 = r2.f7432b
            boolean r3 = nc0.C12954d.m32800c(r3)
            if (r3 == 0) goto L_0x0027
            java.lang.String r2 = r2.f7432b
            boolean r2 = mf0.C24362h.m61206a(r2, r4)
            if (r2 == 0) goto L_0x0027
            r2 = 1
            goto L_0x0028
        L_0x0027:
            r2 = 0
        L_0x0028:
            if (r2 == 0) goto L_0x0008
            r0 = r1
        L_0x002b:
            com.cubic.umo.ad.types.AKBannerResponse r0 = (com.cubic.umo.p045ad.types.AKBannerResponse) r0
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wb0.C13233c.m33335d(java.lang.String, java.util.List):com.cubic.umo.ad.types.AKBannerResponse");
    }

    /* renamed from: e */
    public static String m33336e(C12912d dVar, String str) {
        String str2;
        String str3;
        AKBannerParams bannerParams;
        String str4 = "";
        if (dVar == null) {
            return str4;
        }
        AKHostedConfig aKHostedConfig = f32845d;
        if (aKHostedConfig == null || (bannerParams = aKHostedConfig.getBannerParams()) == null) {
            str2 = null;
        } else {
            str2 = bannerParams.getQsParams();
        }
        if (C12954d.m32800c(str2)) {
            str3 = String.valueOf(str2);
        } else {
            str3 = str4;
        }
        if (C12954d.m32800c(str)) {
            if (!C24362h.m61206a(str3, str4)) {
                str3 = str3 + '&' + str;
            } else {
                str3 = String.valueOf(str);
            }
        }
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("BANNER_QS_PARAMS");
        String str5 = dVar.f31965a;
        if (C12954d.m32800c(str5)) {
            str4 = C17885a.m44403H0(str5);
        }
        J0.append(str4);
        J0.append(": ");
        J0.append(str3);
        logger.mo6672i(J0.toString());
        return str3;
    }

    /* renamed from: f */
    public static void m33337f(ViewGroup viewGroup, String str) {
        ViewGroup viewGroup2;
        String str2;
        String str3;
        WeakReference weakReference;
        C24362h.m61211f(viewGroup, "adView");
        if (C12954d.m32800c(str)) {
            if (f32849h == null) {
                f32849h = new ConcurrentHashMap<>();
            }
            ConcurrentHashMap<String, WeakReference<ViewGroup>> concurrentHashMap = f32849h;
            if (concurrentHashMap == null || (weakReference = concurrentHashMap.get(str)) == null) {
                viewGroup2 = null;
            } else {
                viewGroup2 = (ViewGroup) weakReference.get();
            }
            if (!C24362h.m61206a(viewGroup2, viewGroup)) {
                if (viewGroup2 == null) {
                    str2 = "Adding";
                } else {
                    str2 = "Replacing";
                }
                Logger logger = C7557a.f23040a;
                StringBuilder d0 = C17884p.m44363d0("AKMGR_WEAK_AD_VIEW: ", str2, " AdView");
                if (C12954d.m32800c(str)) {
                    str3 = C17885a.m44403H0(str);
                } else {
                    str3 = "";
                }
                d0.append(str3);
                logger.mo6666c(d0.toString());
                ConcurrentHashMap<String, WeakReference<ViewGroup>> concurrentHashMap2 = f32849h;
                if (concurrentHashMap2 != null) {
                    C24362h.m61208c(str);
                    WeakReference put = concurrentHashMap2.put(str, new WeakReference(viewGroup));
                }
            }
        }
    }

    /* renamed from: g */
    public static void m33338g(zzn zzn) {
        C24362h.m61211f(zzn, "newState");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("AK_INIT_STATE_UPDATE: [");
        J0.append(f32846e);
        J0.append(" -> ");
        J0.append(zzn);
        J0.append(']');
        logger.mo6672i(J0.toString());
        f32846e = zzn;
    }

    /* renamed from: h */
    public static boolean m33339h(UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType) {
        return uMOAdKitInlineBannerCreativeType == UMOAdKitInlineBannerCreativeType.VIDEO;
    }

    /* renamed from: i */
    public static int m33340i() {
        AKBannerParams bannerParams;
        AKHostedConfig aKHostedConfig = f32845d;
        if (aKHostedConfig == null || (bannerParams = aKHostedConfig.getBannerParams()) == null) {
            return 10;
        }
        return bannerParams.getConnectionTimeoutSeconds();
    }

    /* renamed from: j */
    public static Lifecycle m33341j(String str) {
        C24362h.m61211f(str, "spotId");
        ViewGroup c = m33334c(str);
        Lifecycle lifecycle = null;
        if (c == null) {
            return null;
        }
        C1033p pVar = (C1033p) c.getTag(C4646a.view_tree_lifecycle_owner);
        if (pVar == null) {
            ViewParent parent = c.getParent();
            while (pVar == null && (parent instanceof View)) {
                View view = (View) parent;
                pVar = (C1033p) view.getTag(C4646a.view_tree_lifecycle_owner);
                parent = view.getParent();
            }
        }
        if (pVar != null) {
            lifecycle = pVar.getLifecycle();
        }
        if (lifecycle != null) {
            return lifecycle;
        }
        Context context = c.getContext();
        if (context != null) {
            return ((C1033p) context).getLifecycle();
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
    }

    /* renamed from: k */
    public static String m33342k(C12912d dVar) {
        UMOAdKitBannerParams uMOAdKitBannerParams;
        String d;
        if (dVar == null || (uMOAdKitBannerParams = dVar.f31966b) == null || (d = uMOAdKitBannerParams.mo11107d()) == null) {
            return "";
        }
        return d;
    }

    /* renamed from: l */
    public static AKBannerParams m33343l() {
        AKHostedConfig aKHostedConfig = f32845d;
        if (aKHostedConfig == null) {
            return null;
        }
        return aKHostedConfig.getBannerParams();
    }

    /* renamed from: m */
    public static C13295d m33344m(String str) {
        C13295d dVar;
        String str2 = " (Key: " + str + ')';
        if (!C12954d.m32800c(str)) {
            return null;
        }
        ConcurrentHashMap<String, C13295d> concurrentHashMap = f32848g;
        if (concurrentHashMap == null) {
            dVar = null;
        } else {
            dVar = concurrentHashMap.get(str);
        }
        if (dVar != null) {
            C7557a.f23040a.mo6666c(C24362h.m61216k(str2, "AKMGR_BANNER_AD_HANDLER: AKBannerAdHandler EXISTS"));
            return dVar;
        }
        C7557a.f23040a.mo6666c(C24362h.m61216k(str2, "AKMGR_BANNER_AD_HANDLER: AKBannerAdHandler DOESN'T EXIST"));
        return null;
    }

    /* renamed from: n */
    public static boolean m33345n(C12912d dVar) {
        zzi zzi;
        UMOAdKitBannerParams uMOAdKitBannerParams;
        if (dVar == null || (uMOAdKitBannerParams = dVar.f31966b) == null) {
            zzi = null;
        } else {
            zzi = uMOAdKitBannerParams.mo11118m();
        }
        if (zzi == zzi.INTERSTITIAL) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static void m33346o(C12912d dVar) {
        String str;
        dVar.f31970f = null;
        dVar.f31978n = null;
        C13308i iVar = dVar.f31974j;
        if (iVar != null) {
            iVar.mo40216a(false);
        }
        Logger logger = C7557a.f23040a;
        String str2 = dVar.f31965a;
        if (C12954d.m32800c(str2)) {
            str = C17885a.m44403H0(str2);
        } else {
            str = "";
        }
        logger.mo6666c(C24362h.m61216k(str, "AKMGR_BANNER_INFO: Removing BannerInfo"));
        ConcurrentHashMap<String, C12912d> concurrentHashMap = f32850i;
        if (concurrentHashMap != null) {
            C12912d remove = concurrentHashMap.remove(dVar.f31965a);
        }
    }

    /* renamed from: p */
    public static int m33347p() {
        AKRollParams rollParams;
        AKHostedConfig aKHostedConfig = f32845d;
        if (aKHostedConfig == null || (rollParams = aKHostedConfig.getRollParams()) == null) {
            return 10;
        }
        return rollParams.getConnectionTimeoutSeconds();
    }

    /* renamed from: q */
    public static C12912d m33348q(String str) {
        String str2;
        C12912d dVar;
        if (!C12954d.m32800c(str)) {
            return null;
        }
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        ConcurrentHashMap<String, C12912d> concurrentHashMap = f32850i;
        if (concurrentHashMap == null) {
            dVar = null;
        } else {
            dVar = concurrentHashMap.get(str);
        }
        if (dVar != null) {
            C7557a.f23040a.mo6666c(C24362h.m61216k(str2, "AKMGR_BANNER_INFO: BannerInfo EXISTS"));
            return dVar;
        }
        C7557a.f23040a.mo6666c(C24362h.m61216k(str2, "AKMGR_BANNER_INFO: BannerInfo DOESN'T EXIST"));
        return null;
    }

    /* renamed from: r */
    public static int m33349r() {
        AKRollParams rollParams;
        C13302g gVar = C13302g.f33013b;
        AKHostedConfig aKHostedConfig = f32845d;
        if (aKHostedConfig == null || (rollParams = aKHostedConfig.getRollParams()) == null) {
            return 5;
        }
        return rollParams.getRequestTimeoutSeconds();
    }

    /* renamed from: s */
    public static UMOAdKitBannerView m33350s(String str) {
        String str2;
        if (!C12954d.m32800c(str)) {
            return null;
        }
        ViewGroup c = m33334c(str);
        if (c != null && (c instanceof UMOAdKitBannerView)) {
            return (UMOAdKitBannerView) c;
        }
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "AKMGR_WEAK_AD_VIEW: UMOAdKitBannerView DOESN'T EXIST"));
        return null;
    }

    /* renamed from: t */
    public static AKUmoVideoAdUIConfig m33351t() {
        AKAdUIConfig adUIConfig;
        AKHostedConfig aKHostedConfig = f32845d;
        if (aKHostedConfig == null || (adUIConfig = aKHostedConfig.getAdUIConfig()) == null) {
            return null;
        }
        return adUIConfig.getUmoVideoAdUIConfig();
    }

    /* renamed from: u */
    public static void m33352u(String str) {
        WeakReference weakReference;
        String str2;
        String str3;
        if (C12954d.m32800c(str)) {
            ConcurrentHashMap<String, WeakReference<ViewGroup>> concurrentHashMap = f32849h;
            UMOAdKitBannerType uMOAdKitBannerType = null;
            if (concurrentHashMap == null) {
                weakReference = null;
            } else {
                weakReference = concurrentHashMap.get(str);
            }
            if (weakReference != null) {
                Logger logger = C7557a.f23040a;
                if (C12954d.m32800c(str)) {
                    str2 = C17885a.m44403H0(str);
                } else {
                    str2 = "";
                }
                logger.mo6666c(C24362h.m61216k(str2, "AKMGR_WEAK_AD_VIEW: Removing AdView"));
                UMOAdKitBannerView s = m33350s(str);
                if (s != null && f32846e == zzn.DEINIT_IN_PROGRESS) {
                    C4402a aVar = f32844c;
                    if (aVar == null) {
                        str3 = null;
                    } else {
                        str3 = aVar.f15461g;
                    }
                    s.setPlaceholderClickUrl$ads_release(str3);
                    UMOAdKitBannerParams bannerParams = s.getBannerParams();
                    if (bannerParams != null) {
                        uMOAdKitBannerType = bannerParams.mo11122q();
                    }
                    if (uMOAdKitBannerType == null) {
                        uMOAdKitBannerType = s.getDefaultPHBannerType$ads_release();
                    }
                    s.setStaticOrDefaultPlaceholder$ads_release(uMOAdKitBannerType);
                }
                ConcurrentHashMap<String, WeakReference<ViewGroup>> concurrentHashMap2 = f32849h;
                if (concurrentHashMap2 != null) {
                    WeakReference remove = concurrentHashMap2.remove(str);
                }
            }
        }
    }

    /* renamed from: v */
    public static List m33353v() {
        AKRollParams rollParams;
        AKHostedConfig aKHostedConfig = f32845d;
        if (aKHostedConfig == null || (rollParams = aKHostedConfig.getRollParams()) == null) {
            return null;
        }
        return rollParams.getVideoMimesListByPriority();
    }

    /* renamed from: w */
    public static void m33354w(String str) {
        C13295d dVar;
        String str2 = " (Key: " + str + ')';
        if (C12954d.m32800c(str)) {
            ConcurrentHashMap<String, C13295d> concurrentHashMap = f32848g;
            if (concurrentHashMap == null) {
                dVar = null;
            } else {
                dVar = concurrentHashMap.get(str);
            }
            if (dVar != null) {
                C7557a.f23040a.mo6666c(C24362h.m61216k(str2, "AKMGR_BANNER_AD_HANDLER: Removing AKBannerAdHandler"));
                ConcurrentHashMap<String, C13295d> concurrentHashMap2 = f32848g;
                if (concurrentHashMap2 != null) {
                    C13295d remove = concurrentHashMap2.remove(str);
                }
            }
        }
    }
}
