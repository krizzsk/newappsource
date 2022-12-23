package yb0;

import ac0.C7557a;
import android.graphics.Rect;
import android.view.ViewGroup;
import bf0.C21050d;
import ce0.C21100e;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.ext.types.UMOAdKitRollAdEvent;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKVPaidAdActivity;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKVideoAdActivity;
import com.cubic.umo.p045ad.types.AKBannerResponse;
import com.google.android.play.core.assetpacks.C14280j1;
import com.umo.ads.p342c.zzb;
import com.umo.ads.p342c.zzd;
import com.umo.ads.p343d.zza;
import com.umo.ads.p348o.zzc;
import com.umo.ads.p350u.zzf;
import gc0.C12724b;
import hc0.C12755c;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kc0.C12836b;
import mc0.C12909a;
import mc0.C12911c;
import mf0.C24362h;
import mf0.C24368m;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p130j2.C5367a;
import p217q2.C6160i;
import p583jk.C17875h;
import p584jl.C17885a;
import vb0.C13197a;
import vb0.C13198b;
import vb0.C13199c;
import vb0.C13200d;
import vb0.C13201e;
import w10.C20268a;
import wb0.C13233c;
import yb0.C13290a;

/* renamed from: yb0.g */
public final class C13302g implements C13198b, C13197a, C13199c, C13200d, C13201e, C13290a.C13291a {

    /* renamed from: b */
    public static final C13302g f33013b;

    /* renamed from: c */
    public static String f33014c = "";

    /* renamed from: d */
    public static boolean f33015d = true;

    /* renamed from: e */
    public static int f33016e = 1;

    /* renamed from: f */
    public static final C20268a f33017f;

    /* renamed from: g */
    public static final C14280j1 f33018g;

    /* renamed from: h */
    public static Map<String, C12909a> f33019h;

    /* renamed from: i */
    public static C13290a f33020i;

    /* renamed from: yb0.g$a */
    public /* synthetic */ class C13303a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33021a;

        static {
            int[] iArr = new int[C17885a.m44417O0(7).length];
            iArr[1] = 1;
            iArr[4] = 2;
            iArr[3] = 3;
            iArr[5] = 4;
            iArr[0] = 5;
            iArr[2] = 6;
            iArr[6] = 7;
            f33021a = iArr;
            int[] iArr2 = new int[zzf.values().length];
            iArr2[3] = 1;
            iArr2[4] = 2;
        }
    }

    static {
        C13302g gVar = new C13302g();
        f33013b = gVar;
        f33017f = new C20268a(gVar);
        f33018g = new C14280j1(gVar, gVar, gVar, gVar);
    }

    /* renamed from: F */
    public static void m33529F(int i, boolean z) throws zza {
        if (!m33532L(i) && z) {
            throw new zza(UMOAdKitError.ROLLAD_OPERATION_NOT_ALLOWED_NOW.getDesc());
        }
    }

    /* renamed from: H */
    public static void m33530H(String str, UMOAdKitRollAdEvent uMOAdKitRollAdEvent, UMOAdKitError uMOAdKitError) {
        String str2;
        if (uMOAdKitRollAdEvent != UMOAdKitRollAdEvent.AD_CLICKED) {
            UMOAdKitRollAdEvent uMOAdKitRollAdEvent2 = UMOAdKitRollAdEvent.NONE;
        }
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("Notifying UMO Ad Kit Roll Ad Event to App");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        J0.append(str2);
        J0.append(": Event: ");
        J0.append(uMOAdKitRollAdEvent);
        J0.append(", Error: ");
        J0.append(uMOAdKitError);
        J0.append("...");
        logger.mo6672i(J0.toString());
        C13233c.f32843b.post(new C6160i(7, str, uMOAdKitRollAdEvent, uMOAdKitError));
    }

    /* renamed from: J */
    public static void m33531J(List list, zzd zzd) {
        C12911c cVar;
        C12911c cVar2;
        C12909a M = m33533M(f33014c);
        if (M != null) {
            int ordinal = M.f31947b.ordinal();
            if (ordinal == 3) {
                int r = C13233c.m33349r();
                int p = C13233c.m33347p();
                C24362h.m61211f(list, "beaconTypes");
                C24362h.m61211f(zzd, "vastError");
                LinkedHashMap linkedHashMap = M.f31953h;
                if (linkedHashMap != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        zzb zzb = (zzb) it.next();
                        if (!(zzb == zzb.NONE || (cVar = (C12911c) linkedHashMap.get(zzb)) == null)) {
                            cVar.mo39779a(M.f31946a, true, r, p, zzd);
                        }
                    }
                }
            } else if (ordinal == 4) {
                int r2 = C13233c.m33349r();
                int p2 = C13233c.m33347p();
                C24362h.m61211f(list, "beaconTypes");
                C24362h.m61211f(zzd, "vastError");
                LinkedHashMap linkedHashMap2 = M.f31953h;
                if (linkedHashMap2 != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzb zzb2 = (zzb) it2.next();
                        if (!(zzb2 == zzb.NONE || (cVar2 = (C12911c) linkedHashMap2.get(zzb2)) == null)) {
                            cVar2.mo39779a(M.f31946a, true, r2, p2, zzd);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r2 != 5) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        if (r2 != 4) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (yb0.C13302g.C13303a.f33021a[p584jl.C17885a.m44413M0(f33016e)] == 5) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r2 != 2) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (yb0.C13302g.C13303a.f33021a[p584jl.C17885a.m44413M0(f33016e)] == 3) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        if (yb0.C13302g.C13303a.f33021a[p584jl.C17885a.m44413M0(f33016e)] == 5) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        if (r2 != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        r7 = ac0.C7557a.f23040a;
        r7.mo6667d("$$$$$ ROLL_STATE_UPDATE_ERROR" + r0 + " $$$$$");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c8, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r2 = ac0.C7557a.f23040a;
        r2.mo6672i("$$$$$ ROLL_STATE_UPDATE" + r0 + " $$$$$");
        f33016e = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        return true;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m33532L(int r7) {
        /*
            int r0 = f33016e
            r1 = 1
            if (r0 != r7) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = f33014c
            boolean r3 = nc0.C12954d.m32800c(r2)
            if (r3 == 0) goto L_0x0018
            java.lang.String r2 = p584jl.C17885a.m44403H0(r2)
            goto L_0x001a
        L_0x0018:
            java.lang.String r2 = ""
        L_0x001a:
            r0.append(r2)
            java.lang.String r2 = ": ["
            r0.append(r2)
            int r2 = f33016e
            java.lang.String r2 = p172m9.C5720b.m14043K(r2)
            r0.append(r2)
            java.lang.String r2 = " -> "
            r0.append(r2)
            java.lang.String r2 = p172m9.C5720b.m14043K(r7)
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            if (r7 == 0) goto L_0x00e5
            int r2 = r7 + -1
            r3 = 4
            r4 = 3
            r5 = 5
            r6 = 0
            switch(r2) {
                case 0: goto L_0x009e;
                case 1: goto L_0x0091;
                case 2: goto L_0x0084;
                case 3: goto L_0x0078;
                case 4: goto L_0x006b;
                case 5: goto L_0x0060;
                case 6: goto L_0x0051;
                default: goto L_0x004b;
            }
        L_0x004b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0051:
            int r2 = f33016e
            int r2 = p584jl.C17885a.m44413M0(r2)
            if (r2 == r1) goto L_0x00a8
            if (r2 == r4) goto L_0x00a8
            if (r2 == r3) goto L_0x00a8
            if (r2 == r5) goto L_0x00a8
            goto L_0x00aa
        L_0x0060:
            int r2 = f33016e
            int r2 = p584jl.C17885a.m44413M0(r2)
            if (r2 == r4) goto L_0x00a8
            if (r2 == r3) goto L_0x00a8
            goto L_0x00aa
        L_0x006b:
            int r2 = f33016e
            int[] r3 = yb0.C13302g.C13303a.f33021a
            int r2 = p584jl.C17885a.m44413M0(r2)
            r2 = r3[r2]
            if (r2 != r5) goto L_0x00aa
            goto L_0x00a8
        L_0x0078:
            int r2 = f33016e
            int r2 = p584jl.C17885a.m44413M0(r2)
            if (r2 == r1) goto L_0x00a8
            r3 = 2
            if (r2 == r3) goto L_0x00a8
            goto L_0x00aa
        L_0x0084:
            int r2 = f33016e
            int[] r3 = yb0.C13302g.C13303a.f33021a
            int r2 = p584jl.C17885a.m44413M0(r2)
            r2 = r3[r2]
            if (r2 != r4) goto L_0x00aa
            goto L_0x00a8
        L_0x0091:
            int r2 = f33016e
            int[] r3 = yb0.C13302g.C13303a.f33021a
            int r2 = p584jl.C17885a.m44413M0(r2)
            r2 = r3[r2]
            if (r2 != r5) goto L_0x00aa
            goto L_0x00a8
        L_0x009e:
            int r2 = f33016e
            int r2 = p584jl.C17885a.m44413M0(r2)
            switch(r2) {
                case 1: goto L_0x00a8;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a8;
                case 4: goto L_0x00a8;
                case 5: goto L_0x00a8;
                case 6: goto L_0x00a8;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            goto L_0x00aa
        L_0x00a8:
            r2 = 1
            goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            java.lang.String r3 = " $$$$$"
            if (r2 != 0) goto L_0x00c9
            ch.qos.logback.classic.Logger r7 = ac0.C7557a.f23040a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "$$$$$ ROLL_STATE_UPDATE_ERROR"
            r1.append(r2)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r7.mo6667d(r0)
            return r6
        L_0x00c9:
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "$$$$$ ROLL_STATE_UPDATE"
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r2.mo6672i(r0)
            f33016e = r7
            return r1
        L_0x00e5:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13302g.m33532L(int):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, mc0.a>] */
    /* renamed from: M */
    public static C12909a m33533M(String str) {
        ? r0;
        if (str == null || (r0 = f33019h) == 0) {
            return null;
        }
        return (C12909a) r0.get(str);
    }

    /* renamed from: A */
    public final void mo39549A(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdPaused()"));
        m33531J(C17875h.m44280D(zzb.PAUSE), zzd.NONE);
    }

    /* renamed from: B */
    public final void mo39550B(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
        mo40206G(uMOAdKitError, zzd);
    }

    /* renamed from: C */
    public final void mo40076C(String str, UMOAdKitError uMOAdKitError) {
        C24362h.m61211f(uMOAdKitError, "akError");
        m33532L(1);
        m33530H(str, UMOAdKitRollAdEvent.AD_ERROR, uMOAdKitError);
    }

    /* renamed from: D */
    public final void mo39552D(String str) {
        C24362h.m61211f(str, "spotId");
        if (C12954d.m32800c(f33014c)) {
            m33530H(f33014c, UMOAdKitRollAdEvent.AD_REMOVED, UMOAdKitError.NONE);
        }
        mo40208K(false);
    }

    /* renamed from: E */
    public final void mo39553E(String str) {
        C24362h.m61211f(str, "spotId");
        C7557a.f23040a.mo6666c("onAdUserClose()");
        m33531J(C17875h.m44281E(zzb.CLOSE, zzb.CLOSE_LINEAR), zzd.NONE);
    }

    /* renamed from: G */
    public final void mo40206G(UMOAdKitError uMOAdKitError, zzd zzd) {
        m33531J(C17875h.m44280D(zzb.ERROR), zzd);
        m33530H(f33014c, UMOAdKitRollAdEvent.AD_ERROR, uMOAdKitError);
        mo40208K(false);
    }

    /* renamed from: I */
    public final void mo40207I(String str, String str2) {
        String str3;
        C12909a M = m33533M(str);
        Object obj = null;
        if (str2 == null) {
            if (M == null) {
                str2 = null;
            } else {
                str2 = M.f31954i;
            }
        }
        String str4 = "";
        if (str2 != null) {
            m33531J(C17875h.m44280D(zzb.CLICK), zzd.NONE);
            if (M != null) {
                zzf zzf = M.f31947b;
                C24362h.m61211f(str, "spotId");
                C24362h.m61211f(zzf, "adType");
                if (C12954d.m32800c(str)) {
                    str3 = C17885a.m44403H0(str);
                } else {
                    str3 = str4;
                }
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("Opening ");
                J0.append(zzf.name());
                J0.append(" Roll Ad Click Url");
                J0.append(str3);
                J0.append(": ");
                J0.append(str2);
                J0.append("...");
                logger.mo6672i(J0.toString());
                if (zzf == zzf.VIDEO) {
                    WeakReference<AKVideoAdActivity> weakReference = AKVideoAdActivity.f7333A;
                    if (weakReference != null) {
                        obj = weakReference.get();
                    }
                } else {
                    WeakReference<AKVPaidAdActivity> weakReference2 = AKVPaidAdActivity.f7330z;
                    if (weakReference2 != null) {
                        obj = weakReference2.get();
                    }
                }
                if (obj == null) {
                    Logger logger2 = C7557a.f23040a;
                    StringBuilder J02 = C21100e.m49315J0("Opening ");
                    J02.append(zzf.name());
                    J02.append(" Roll Ad ClickThrough failed; Invalid Activity Context");
                    J02.append(str3);
                    logger2.mo6667d(J02.toString());
                } else {
                    WeakReference<AKBrowserActivity> weakReference3 = AKBrowserActivity.f7313G;
                    AKBrowserActivity.C2225b.m5861a(str, str2, true);
                }
                obj = C21050d.f52856a;
            }
        }
        if (obj == null) {
            Logger logger3 = C7557a.f23040a;
            if (C12954d.m32800c(str)) {
                str4 = C17885a.m44403H0(str);
            }
            logger3.mo6667d(C24362h.m61216k(str4, "Invalid ClickThrough Url"));
        }
    }

    /* renamed from: K */
    public final void mo40208K(boolean z) {
        com.umo.ads.p347l.zzb zzb;
        m33529F(1, false);
        WeakReference weakReference = C24368m.f61695g;
        if (!(weakReference == null || (zzb = (com.umo.ads.p347l.zzb) weakReference.get()) == null)) {
            C5367a.m13473a(zzb.f30828a).mo21148d(zzb);
        }
        f33014c = "";
        f33019h = null;
        f33015d = true;
    }

    /* renamed from: a */
    public final void mo40077a(String str, C12909a aVar) {
    }

    /* renamed from: b */
    public final void mo40078b(String str, UMOAdKitError uMOAdKitError) {
        C24362h.m61211f(uMOAdKitError, "akError");
    }

    /* renamed from: c */
    public final void mo39559c(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        String str2;
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("onAdError()");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        J0.append(str2);
        J0.append(": vastError: ");
        J0.append(zzd);
        logger.mo6666c(J0.toString());
        mo40206G(uMOAdKitError, zzd);
    }

    /* renamed from: d */
    public final void mo39560d(String str) {
        C24362h.m61211f(str, "spotId");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40079e(java.lang.String r11, mc0.C12909a r12) {
        /*
            r10 = this;
            boolean r0 = nc0.C12954d.m32800c(r11)
            if (r0 == 0) goto L_0x0009
            p584jl.C17885a.m44403H0(r11)
        L_0x0009:
            com.umo.ads.u.zzf r0 = r12.f31947b
            com.umo.ads.u.zzf r1 = com.umo.ads.p350u.zzf.VPAID
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 != r1) goto L_0x003f
            boolean r0 = p389bl.C13637c.f33647n
            if (r0 != 0) goto L_0x0017
            goto L_0x0034
        L_0x0017:
            j$.util.concurrent.ConcurrentHashMap r0 = p389bl.C13637c.f33649p
            if (r0 != 0) goto L_0x001d
            r0 = r2
            goto L_0x0025
        L_0x001d:
            java.lang.String r5 = "VPAID_AD_TEMPLATE"
            java.lang.Object r0 = r0.get(r5)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0025:
            boolean r0 = nc0.C12954d.m32800c(r0)
            if (r0 == 0) goto L_0x002d
            r0 = 1
            goto L_0x0035
        L_0x002d:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r5 = "@@@@@@@@@@@@@@ Ad Rendering Template Missing (VPAID_AD_TEMPLATE) @@@@@@@@@@@@@@ "
            r0.mo6667d(r5)
        L_0x0034:
            r0 = 0
        L_0x0035:
            if (r0 != 0) goto L_0x003f
            com.cubic.umo.ad.ext.types.UMOAdKitError r11 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_TEMPLATE_MISSING
            com.umo.ads.c.zzd r12 = com.umo.ads.p342c.zzd.UNDEFINED_ERROR
            r10.mo40206G(r11, r12)
            return
        L_0x003f:
            java.util.Map<java.lang.String, mc0.a> r0 = f33019h
            if (r0 != 0) goto L_0x004a
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            f33019h = r0
        L_0x004a:
            java.util.Map<java.lang.String, mc0.a> r0 = f33019h
            if (r0 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            java.lang.Object r12 = r0.put(r11, r12)
            mc0.a r12 = (mc0.C12909a) r12
        L_0x0055:
            int r12 = f33016e
            int r12 = p584jl.C17885a.m44413M0(r12)
            r0 = 2
            r5 = 4
            if (r12 == r3) goto L_0x006c
            if (r12 == r0) goto L_0x0069
            if (r12 == r5) goto L_0x0066
            com.cubic.umo.ad.ext.types.UMOAdKitRollAdEvent r12 = com.cubic.umo.p045ad.ext.types.UMOAdKitRollAdEvent.NONE
            goto L_0x006e
        L_0x0066:
            com.cubic.umo.ad.ext.types.UMOAdKitRollAdEvent r12 = com.cubic.umo.p045ad.ext.types.UMOAdKitRollAdEvent.AD_READY_TO_PLAY
            goto L_0x006e
        L_0x0069:
            com.cubic.umo.ad.ext.types.UMOAdKitRollAdEvent r12 = com.cubic.umo.p045ad.ext.types.UMOAdKitRollAdEvent.AD_AUTO_FETCHED
            goto L_0x006e
        L_0x006c:
            com.cubic.umo.ad.ext.types.UMOAdKitRollAdEvent r12 = com.cubic.umo.p045ad.ext.types.UMOAdKitRollAdEvent.AD_FETCHED
        L_0x006e:
            int r6 = f33016e
            r7 = 3
            if (r6 == r0) goto L_0x0078
            if (r6 != r7) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r0 = 0
            goto L_0x0079
        L_0x0078:
            r0 = 1
        L_0x0079:
            if (r0 == 0) goto L_0x00c0
            m33529F(r5, r4)
            yb0.a r6 = f33020i
            if (r6 == 0) goto L_0x0083
            goto L_0x00c0
        L_0x0083:
            java.lang.String r6 = f33014c
            mc0.a r6 = m33533M(r6)
            if (r6 != 0) goto L_0x008c
            goto L_0x0091
        L_0x008c:
            int r6 = r6.f31955j
            if (r6 <= 0) goto L_0x0091
            goto L_0x00ae
        L_0x0091:
            com.cubic.umo.ad.types.AKHostedConfig r6 = wb0.C13233c.f32845d
            if (r6 != 0) goto L_0x0096
            goto L_0x00a5
        L_0x0096:
            com.cubic.umo.ad.types.AKRollParams r6 = r6.getRollParams()
            if (r6 != 0) goto L_0x009d
            goto L_0x00a5
        L_0x009d:
            int r2 = r6.getPrefetchedAdExpiryMinutes()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x00a5:
            if (r2 != 0) goto L_0x00aa
            r6 = 25
            goto L_0x00ae
        L_0x00aa:
            int r6 = r2.intValue()
        L_0x00ae:
            yb0.a r2 = new yb0.a
            java.lang.String r8 = f33014c
            java.util.List r8 = p583jk.C17875h.m44280D(r8)
            java.lang.String r9 = "ROLL"
            r2.<init>(r8, r9, r6, r10)
            f33020i = r2
            r2.mo40153a()
        L_0x00c0:
            com.cubic.umo.ad.ext.types.UMOAdKitRollAdEvent r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitRollAdEvent.NONE
            if (r12 == r2) goto L_0x00c9
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            m33530H(r11, r12, r2)
        L_0x00c9:
            if (r0 == 0) goto L_0x00cd
            goto L_0x0190
        L_0x00cd:
            mc0.a r12 = m33533M(r11)
            if (r12 != 0) goto L_0x00d5
            goto L_0x0190
        L_0x00d5:
            r0 = 6
            m33532L(r0)
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = "Handling Roll Ad Response"
            java.lang.StringBuilder r2 = ce0.C21100e.m49315J0(r2)
            boolean r6 = nc0.C12954d.m32800c(r11)
            java.lang.String r8 = ""
            if (r6 == 0) goto L_0x00ee
            java.lang.String r6 = p584jl.C17885a.m44403H0(r11)
            goto L_0x00ef
        L_0x00ee:
            r6 = r8
        L_0x00ef:
            r2.append(r6)
            java.lang.String r6 = ": Is Prefetched Resp: "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.mo6666c(r2)
            com.google.android.play.core.assetpacks.j1 r0 = f33018g
            r0.getClass()
            boolean r2 = nc0.C12954d.m32800c(r11)
            if (r2 == 0) goto L_0x0111
            java.lang.String r2 = p584jl.C17885a.m44403H0(r11)
            goto L_0x0112
        L_0x0111:
            r2 = r8
        L_0x0112:
            com.umo.ads.u.zzf r6 = r12.f31947b
            com.umo.ads.u.zzf r9 = com.umo.ads.p350u.zzf.VIDEO
            if (r6 == r9) goto L_0x0131
            if (r6 == r1) goto L_0x0131
            ch.qos.logback.classic.Logger r11 = ac0.C7557a.f23040a
            java.lang.String r12 = "Unsupported Roll Ad received"
            java.lang.String r12 = mf0.C24362h.m61216k(r2, r12)
            r11.mo6667d(r12)
            com.cubic.umo.ad.ext.types.UMOAdKitError r11 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            java.lang.Object r12 = r0.f35919b
            vb0.a r12 = (vb0.C13197a) r12
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.NONE
            r12.mo39550B(r8, r11, r0)
            goto L_0x0190
        L_0x0131:
            java.lang.String r1 = r12.f31950e
            boolean r6 = nc0.C12954d.m32800c(r1)
            if (r6 != 0) goto L_0x013a
            goto L_0x0147
        L_0x013a:
            boolean r6 = android.webkit.URLUtil.isHttpUrl(r1)
            if (r6 != 0) goto L_0x0148
            boolean r1 = android.webkit.URLUtil.isHttpsUrl(r1)
            if (r1 == 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r3 = 0
        L_0x0148:
            if (r3 != 0) goto L_0x0161
            ch.qos.logback.classic.Logger r11 = ac0.C7557a.f23040a
            java.lang.String r12 = "Invalid Roll Ad Media Url"
            java.lang.String r12 = mf0.C24362h.m61216k(r2, r12)
            r11.mo6667d(r12)
            com.cubic.umo.ad.ext.types.UMOAdKitError r11 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            java.lang.Object r12 = r0.f35919b
            vb0.a r12 = (vb0.C13197a) r12
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.NONE
            r12.mo39550B(r8, r11, r0)
            goto L_0x0190
        L_0x0161:
            com.umo.ads.u.zzf r1 = r12.f31947b
            int r1 = r1.ordinal()
            if (r1 == r7) goto L_0x018d
            if (r1 == r5) goto L_0x016c
            goto L_0x0190
        L_0x016c:
            zb0.g r11 = new zb0.g
            java.lang.String r1 = r12.f31946a
            r11.<init>(r1, r0)
            int r1 = wb0.C13233c.m33349r()
            int r2 = wb0.C13233c.m33347p()
            boolean r11 = r11.mo40258a(r12, r1, r2)
            if (r11 != 0) goto L_0x0190
            com.cubic.umo.ad.ext.types.UMOAdKitError r11 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_PLAY_FAILED
            java.lang.Object r12 = r0.f35919b
            vb0.a r12 = (vb0.C13197a) r12
            com.umo.ads.c.zzd r0 = com.umo.ads.p342c.zzd.NONE
            r12.mo39550B(r8, r11, r0)
            goto L_0x0190
        L_0x018d:
            r0.mo42848c(r11, r12)
        L_0x0190:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13302g.mo40079e(java.lang.String, mc0.a):void");
    }

    /* renamed from: f */
    public final void mo39562f(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdVideoStart()"));
        m33531J(C17875h.m44281E(zzb.START, zzb.CREATIVE_VIEW), zzd.NONE);
        m33530H(str, UMOAdKitRollAdEvent.AD_PLAYING, UMOAdKitError.NONE);
    }

    /* renamed from: g */
    public final void mo39563g(String str) {
    }

    /* renamed from: h */
    public final void mo39564h(String str, zzc zzc) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: i */
    public final void mo39565i(String str, int i) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("onVideoAdCurrentPlaybackPosition");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        J0.append(str2);
        J0.append(": ");
        J0.append(i);
        logger.mo6666c(J0.toString());
    }

    /* renamed from: j */
    public final void mo39566j(String str, boolean z) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("onAdVolumeChanged()");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        J0.append(str2);
        J0.append(": isMuted: ");
        J0.append(z);
        logger.mo6666c(J0.toString());
    }

    /* renamed from: k */
    public final void mo39567k(String str) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: l */
    public final C12909a mo39568l(String str) {
        C24362h.m61211f(str, "spotId");
        return null;
    }

    /* renamed from: m */
    public final void mo39569m(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdVideoFirstQuartile()"));
        m33531J(C17875h.m44280D(zzb.FIRST_QUARTILE), zzd.NONE);
    }

    /* renamed from: n */
    public final void mo39570n(ViewGroup viewGroup, String str) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: o */
    public final void mo39571o(String str) {
    }

    /* renamed from: p */
    public final void mo39572p(String str) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: q */
    public final void mo39573q(String str, C12724b bVar) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: r */
    public final void mo39574r(String str) {
    }

    /* renamed from: s */
    public final void mo39575s(String str, Rect rect) {
        C24362h.m61211f(str, "spotId");
    }

    /* renamed from: t */
    public final void mo39576t(String str, zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzd, "vastError");
        mo40206G(UMOAdKitError.AD_PLAY_TIMED_OUT, zzd);
    }

    /* renamed from: u */
    public final void mo39577u(String str) {
        String str2;
        WeakReference<AKVPaidAdActivity> weakReference;
        AKVPaidAdActivity aKVPaidAdActivity;
        C12724b bVar;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onInternalBrowserPresented()"));
        C12909a M = m33533M(f33014c);
        if (M != null) {
            m33530H(str, UMOAdKitRollAdEvent.AD_CLICKED, UMOAdKitError.NONE);
            zzf zzf = M.f31947b;
            C24362h.m61211f(zzf, "adType");
            if (zzf == zzf.VPAID && (weakReference = AKVPaidAdActivity.f7330z) != null && (aKVPaidAdActivity = weakReference.get()) != null) {
                C12755c cVar = aKVPaidAdActivity.f7332y;
                if (cVar == null) {
                    bVar = null;
                } else {
                    bVar = cVar.f31518e;
                }
                if (bVar != null) {
                    bVar.f31429f = true;
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo39578v(String str, UMOAdKitError uMOAdKitError) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
    }

    /* renamed from: w */
    public final void mo39579w(String str, zzd zzd) {
        String str2;
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzd, "vastError");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("onAdTimedOut()");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        J0.append(str2);
        J0.append(": vastError: ");
        J0.append(zzd);
        logger.mo6666c(J0.toString());
        mo40206G(UMOAdKitError.AD_PLAY_TIMED_OUT, zzd);
    }

    /* renamed from: x */
    public final void mo39580x(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdImpression()"));
        m33531J(C17875h.m44280D(zzb.IMPRESSION), zzd.NONE);
        m33530H(str, UMOAdKitRollAdEvent.AD_PLAYING, UMOAdKitError.NONE);
    }

    /* renamed from: y */
    public final void mo39581y(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdVideoMidpoint()"));
        m33531J(C17875h.m44280D(zzb.MIDPOINT), zzd.NONE);
    }

    /* renamed from: z */
    public final void mo39582z(C12836b bVar, String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zza(int i, String str) {
        List list;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("onVideoAdPlayProgress");
        J0.append(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "");
        J0.append(": ");
        J0.append(i);
        logger.mo6666c(J0.toString());
        if (i == 0) {
            list = C17875h.m44281E(zzb.IMPRESSION, zzb.START, zzb.CREATIVE_VIEW);
        } else if (i == 25) {
            list = C17875h.m44280D(zzb.FIRST_QUARTILE);
        } else if (i == 50) {
            list = C17875h.m44280D(zzb.MIDPOINT);
        } else if (i != 75) {
            C17875h.m44280D(zzb.NONE);
            list = null;
        } else {
            list = C17875h.m44280D(zzb.THIRD_QUARTILE);
        }
        if (list != null) {
            m33531J(list, zzd.NONE);
        } else {
            C24362h.m61217l("beaconTypes");
            throw null;
        }
    }

    public final void zza(String str) {
    }

    public final void zza(List<AKBannerResponse> list) {
    }

    public final void zzb(String str) {
        AKVPaidAdActivity aKVPaidAdActivity;
        C12755c cVar;
        C12724b bVar;
        AKVPaidAdActivity aKVPaidAdActivity2;
        C24362h.m61211f(str, "spotId");
        C7557a.f23040a.mo6666c(C24362h.m61216k(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "", "onInternalBrowserDismissed()"));
        C12724b bVar2 = null;
        AKBrowserActivity.f7313G = null;
        C12909a M = m33533M(str);
        if (M != null) {
            zzf zzf = M.f31947b;
            C24362h.m61211f(zzf, "adType");
            if (zzf == zzf.VPAID) {
                WeakReference<AKVPaidAdActivity> weakReference = AKVPaidAdActivity.f7330z;
                if (!(weakReference == null || (aKVPaidAdActivity2 = weakReference.get()) == null)) {
                    C12755c cVar2 = aKVPaidAdActivity2.f7332y;
                    if (cVar2 != null) {
                        bVar2 = cVar2.f31518e;
                    }
                    if (bVar2 != null) {
                        bVar2.f31429f = false;
                    }
                }
                WeakReference<AKVPaidAdActivity> weakReference2 = AKVPaidAdActivity.f7330z;
                if (weakReference2 != null && (aKVPaidAdActivity = weakReference2.get()) != null && (cVar = aKVPaidAdActivity.f7332y) != null && (bVar = cVar.f31518e) != null) {
                    bVar.mo39524d(false, true);
                }
            }
        }
    }

    public final void zzc(String str, String str2) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzd(String str) {
        C24362h.m61211f(str, "spotId");
        mo40207I(str, (String) null);
    }

    public final boolean zze(String str, String str2) {
        C24362h.m61211f(str, "spotId");
        return false;
    }

    public final void zzg(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdVideoThirdQuartile()"));
        m33531J(C17875h.m44280D(zzb.THIRD_QUARTILE), zzd.NONE);
    }

    public final void zzh(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdResumed()"));
        m33531J(C17875h.m44280D(zzb.RESUME), zzd.NONE);
    }

    public final void zzi(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzl(String str) {
        C24362h.m61211f(str, "spotId");
        m33531J(C17875h.m44280D(zzb.COMPLETE), zzd.NONE);
        m33530H(f33014c, UMOAdKitRollAdEvent.AD_COMPLETED, UMOAdKitError.NONE);
        mo40208K(false);
    }

    public final void zzn(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdExpanded()"));
        m33531J(C17875h.m44280D(zzb.EXPAND), zzd.NONE);
    }

    public final void zzp(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzq(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdSkipped()"));
        m33531J(C17875h.m44280D(zzb.SKIP), zzd.NONE);
    }

    public final void zzr(String str) {
    }

    public final void zzt(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzu(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzw(String str) {
    }

    public final void zzy(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onAdVideoCompleted()"));
        m33531J(C17875h.m44280D(zzb.COMPLETE), zzd.NONE);
        m33530H(f33014c, UMOAdKitRollAdEvent.AD_COMPLETED, UMOAdKitError.NONE);
        mo40208K(false);
    }

    public final void zzc(String str, boolean z) {
        C24362h.m61211f(str, "spotId");
        m33530H(str, UMOAdKitRollAdEvent.AD_PLAYING, UMOAdKitError.NONE);
    }

    public final void zze(String str) {
        C24362h.m61211f(str, "spotId");
        C7557a.f23040a.mo6666c(C24362h.m61216k(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "", "onAdCollapsed()"));
        m33531J(C17875h.m44280D(zzb.COLLAPSE), zzd.NONE);
    }

    public final void zzc(String str) {
        C24362h.m61211f(str, "spotId");
        C7557a.f23040a.mo6666c(C24362h.m61216k(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "", "onAdUserAcceptInvitation()"));
        m33531J(C17875h.m44281E(zzb.ACCEPT_INVITATION, zzb.ACCEPT_INVITATION_LINEAR), zzd.NONE);
    }

    public final void zza(String str, boolean z) {
        C24362h.m61211f(str, "spotId");
        C7557a.f23040a.mo6666c(C24362h.m61216k(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "", "onAdStopped()"));
        if (C12954d.m32800c(f33014c)) {
            m33530H(f33014c, UMOAdKitRollAdEvent.AD_REMOVED, UMOAdKitError.NONE);
        }
        mo40208K(false);
    }

    public final void zzb(String str, String str2) {
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("onAdClickThru()");
        J0.append(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "");
        J0.append(": ClickThru: ");
        J0.append(str2);
        logger.mo6666c(J0.toString());
        mo40207I(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        if (r2 == null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        r1 = r1.getRollParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() {
        /*
            r19 = this;
            java.util.Map<java.lang.String, mc0.a> r0 = f33019h
            if (r0 != 0) goto L_0x0005
            goto L_0x000d
        L_0x0005:
            java.lang.String r1 = f33014c
            java.lang.Object r0 = r0.remove(r1)
            mc0.a r0 = (mc0.C12909a) r0
        L_0x000d:
            r0 = 0
            f33020i = r0
            java.lang.String r1 = f33014c
            com.cubic.umo.ad.ext.types.UMOAdKitRollAdEvent r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitRollAdEvent.AD_EXPIRED
            com.cubic.umo.ad.ext.types.UMOAdKitError r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            m33530H(r1, r2, r3)
            com.cubic.umo.ad.types.AKHostedConfig r1 = wb0.C13233c.f32845d
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            com.cubic.umo.ad.types.AKRollParams r1 = r1.getRollParams()
            if (r1 != 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            boolean r1 = r1.getAutoPrefetchOnExpiry()
            if (r1 != 0) goto L_0x002f
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            r4 = 0
            r6 = -1
            if (r1 == 0) goto L_0x0038
            r8 = r6
            goto L_0x0040
        L_0x0038:
            boolean r1 = f33015d
            if (r1 != 0) goto L_0x003f
            r8 = 1
            goto L_0x0040
        L_0x003f:
            r8 = r4
        L_0x0040:
            java.lang.String r1 = ""
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x01c5
            ch.qos.logback.classic.Logger r4 = ac0.C7557a.f23040a
            java.lang.String r5 = "PREFETCH_AD_EXPIRY_ROLL: Auto Prefetching on Ad Expiry"
            java.lang.StringBuilder r5 = ce0.C21100e.m49315J0(r5)
            java.lang.String r6 = f33014c
            boolean r7 = nc0.C12954d.m32800c(r6)
            if (r7 == 0) goto L_0x005b
            java.lang.String r6 = p584jl.C17885a.m44403H0(r6)
            goto L_0x005c
        L_0x005b:
            r6 = r1
        L_0x005c:
            r5.append(r6)
            java.lang.String r6 = "..."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.mo6672i(r5)
            r4 = 3
            m33529F(r4, r3)
            w10.a r4 = f33017f
            r4.getClass()
            boolean r5 = nc0.C12954d.m32800c(r0)
            if (r5 == 0) goto L_0x007b
            goto L_0x00a8
        L_0x007b:
            com.cubic.umo.ad.types.AKHostedConfig r5 = wb0.C13233c.f32845d
            if (r5 != 0) goto L_0x0081
            r5 = r0
            goto L_0x0085
        L_0x0081:
            com.cubic.umo.ad.types.AKRollParams r5 = r5.getRollParams()
        L_0x0085:
            if (r5 != 0) goto L_0x0088
            goto L_0x00a8
        L_0x0088:
            java.lang.String r6 = r5.getServerUrl()
            java.lang.String r7 = "<this>"
            mf0.C24362h.m61211f(r6, r7)
            java.lang.String r7 = "/"
            boolean r2 = uh0.C25081h.m62836z(r6, r7, r2)
            if (r2 == 0) goto L_0x009a
            goto L_0x009e
        L_0x009a:
            java.lang.String r6 = mf0.C24362h.m61216k(r7, r6)
        L_0x009e:
            java.lang.String r2 = r5.getRollPlaylist()
            java.lang.String r2 = mf0.C24362h.m61216k(r2, r6)
            if (r2 != 0) goto L_0x00a9
        L_0x00a8:
            r2 = r1
        L_0x00a9:
            boolean r5 = nc0.C12954d.m32800c(r2)
            if (r5 != 0) goto L_0x00b1
            r2 = r1
            goto L_0x00c0
        L_0x00b1:
            java.lang.String r5 = "?id="
            java.lang.StringBuilder r2 = p001a0.C0016g.m36t(r2, r5)
            java.lang.String r5 = f33014c
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x00c0:
            zb0.c r5 = new zb0.c
            r5.<init>()
            d7.a r6 = wb0.C13233c.f32844c
            if (r6 != 0) goto L_0x00cb
            r6 = r0
            goto L_0x00cd
        L_0x00cb:
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r6 = r6.f15463i
        L_0x00cd:
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r0, r6)
            r5.f33183a = r7
            com.cubic.umo.ad.types.AKRequestPayload r6 = new com.cubic.umo.ad.types.AKRequestPayload
            java.lang.String r7 = "NA"
            r6.<init>(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.cubic.umo.ad.types.AKImp r15 = new com.cubic.umo.ad.types.AKImp
            java.lang.String r9 = f33014c
            r10 = 0
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 1
            r16 = 0
            r17 = 70
            r18 = 0
            r8 = r15
            r3 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r8 = f33014c
            kotlin.Pair<com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams, com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams> r9 = r5.f33183a
            if (r9 != 0) goto L_0x0101
            goto L_0x0109
        L_0x0101:
            java.lang.Object r9 = r9.mo59068c()
            com.cubic.umo.ad.ext.types.UMOAdKitAdQueryParams r9 = (com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams) r9
            if (r9 != 0) goto L_0x010b
        L_0x0109:
            r9 = r0
            goto L_0x010d
        L_0x010b:
            java.lang.String r9 = r9.f7278a
        L_0x010d:
            com.cubic.umo.ad.types.AKHostedConfig r10 = wb0.C13233c.f32845d
            if (r10 != 0) goto L_0x0112
            goto L_0x0118
        L_0x0112:
            com.cubic.umo.ad.types.AKRollParams r10 = r10.getRollParams()
            if (r10 != 0) goto L_0x011a
        L_0x0118:
            r10 = r0
            goto L_0x011e
        L_0x011a:
            java.lang.String r10 = r10.getQsParams()
        L_0x011e:
            boolean r11 = nc0.C12954d.m32800c(r10)
            if (r11 == 0) goto L_0x0129
            java.lang.String r10 = java.lang.String.valueOf(r10)
            goto L_0x012a
        L_0x0129:
            r10 = r1
        L_0x012a:
            boolean r11 = nc0.C12954d.m32800c(r9)
            if (r11 == 0) goto L_0x014f
            boolean r1 = mf0.C24362h.m61206a(r10, r1)
            if (r1 != 0) goto L_0x014b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r10 = 38
            r1.append(r10)
            r1.append(r9)
            java.lang.String r10 = r1.toString()
            goto L_0x014f
        L_0x014b:
            java.lang.String r10 = java.lang.String.valueOf(r9)
        L_0x014f:
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            java.lang.String r9 = "ROLL_QS_PARAMS: "
            java.lang.String r9 = mf0.C24362h.m61216k(r10, r9)
            r1.mo6672i(r9)
            com.cubic.umo.ad.types.AKVideo r1 = zb0.C13368c.m33643e(r8, r0, r0, r10)
            r3.f7536i = r1
            com.cubic.umo.ad.types.AKImpVideoOrBannerExt r8 = r1.f7713y
            if (r8 != 0) goto L_0x0165
            goto L_0x0169
        L_0x0165:
            java.lang.String r9 = "roll"
            r8.f7547b = r9
        L_0x0169:
            r8 = 0
            r1.f7695g = r8
            com.cubic.umo.ad.ext.types.UMOAdKitAdPosition r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitAdPosition.FULL_SCREEN
            int r8 = r8.getValue()
            r1.f7710v = r8
            r7.add(r3)
            r6.f7576b = r7
            com.cubic.umo.ad.types.AKApp r1 = r5.mo40247b()
            r6.f7577c = r1
            com.cubic.umo.ad.types.AKDevice r1 = r5.mo40250f()
            r6.f7578d = r1
            com.cubic.umo.ad.types.AKGeo r1 = r1.f7452D
            if (r1 != 0) goto L_0x018b
            r1 = r0
            goto L_0x018d
        L_0x018b:
            java.lang.String r1 = r1.f7506c
        L_0x018d:
            com.cubic.umo.ad.types.AKUser r1 = r5.mo40249d(r1)
            r6.f7579e = r1
            r1 = 1
            com.cubic.umo.ad.types.AKPayloadExt r1 = r5.mo40248c(r1)
            r6.f7580f = r1
            r5.f33183a = r0
            java.lang.Object r0 = r4.f51398c
            yb0.h r0 = (yb0.C13304h) r0
            if (r0 != 0) goto L_0x01a3
            goto L_0x01b9
        L_0x01a3:
            java.lang.String r1 = f33014c
            java.lang.String r3 = "spotId"
            mf0.C24362h.m61211f(r1, r3)
            zb0.d r3 = r0.f33025d
            if (r3 != 0) goto L_0x01af
            goto L_0x01b2
        L_0x01af:
            r3.mo40254f()
        L_0x01b2:
            zb0.d r3 = new zb0.d
            r3.<init>(r1, r0)
            r0.f33025d = r3
        L_0x01b9:
            java.lang.Object r0 = r4.f51398c
            yb0.h r0 = (yb0.C13304h) r0
            if (r0 != 0) goto L_0x01c0
            goto L_0x01c4
        L_0x01c0:
            r1 = 0
            r0.mo40210b(r2, r6, r1)
        L_0x01c4:
            return
        L_0x01c5:
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01d1
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "PREFETCH_AD_EXPIRY_ROLL: Auto Prefetching on Ad Expiry DISABLED in Hosted Configuration"
            r0.mo6667d(r1)
            goto L_0x01e8
        L_0x01d1:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r2 = f33014c
            boolean r3 = nc0.C12954d.m32800c(r2)
            if (r3 == 0) goto L_0x01df
            java.lang.String r1 = p584jl.C17885a.m44403H0(r2)
        L_0x01df:
            java.lang.String r2 = "PREFETCH_AD_EXPIRY_ROLL: Auto Prefetching on Ad Expiry DISABLED"
            java.lang.String r1 = mf0.C24362h.m61216k(r1, r2)
            r0.mo6667d(r1)
        L_0x01e8:
            r0 = 1
            m33532L(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13302g.zza():void");
    }
}
