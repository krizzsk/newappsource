package yb0;

import ac0.C7557a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.Html;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C0416i1;
import androidx.camera.camera2.internal.C0510d;
import androidx.lifecycle.Lifecycle;
import bf0.C21050d;
import cc0.C7585a;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineBannerCreativeType;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineVideoPlayMode;
import com.cubic.umo.p045ad.lifecycle.AKAdViewLifecycleObserver;
import com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity;
import com.cubic.umo.p045ad.playback.p046ui.views.AKWebView;
import com.cubic.umo.p045ad.types.AKBannerParams;
import com.cubic.umo.p045ad.types.AKBannerResponse;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.play.core.appupdate.C14226d;
import com.umo.ads.p342c.zza;
import com.umo.ads.p342c.zzb;
import com.umo.ads.p342c.zzd;
import com.umo.ads.p343d.zza;
import com.umo.ads.p348o.zzc;
import com.umo.ads.p350u.zzf;
import com.umo.ads.p350u.zzi;
import com.usebutton.sdk.internal.views.LoadingDots;
import gc0.C12724b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kc0.C12836b;
import kc0.C12844i;
import kotlin.Pair;
import kotlin.collections.C23825c;
import lf0.C24236l;
import mc0.C12909a;
import mc0.C12911c;
import mc0.C12912d;
import mf0.C24362h;
import nc0.C12952c;
import nc0.C12954d;
import p001a0.C0016g;
import p001a0.C0017h;
import p019b0.C1426c;
import p043ch.qos.logback.classic.Logger;
import p130j2.C5367a;
import p172m9.C5720b;
import p217q2.C6160i;
import p304x.C7073m;
import p304x.C7112w;
import p316y.C7219n;
import p389bl.C13637c;
import p389bl.C13640f;
import p583jk.C17875h;
import p584jl.C17885a;
import p704om.C18787c;
import p988j$.util.concurrent.ConcurrentHashMap;
import vb0.C13197a;
import vb0.C13198b;
import vb0.C13199c;
import vb0.C13200d;
import vb0.C13201e;
import wb0.C13231a;
import wb0.C13232b;
import wb0.C13233c;
import yb0.C13290a;
import yb0.C13308i;
import zb0.C13366b;

/* renamed from: yb0.d */
public final class C13295d implements C13198b, C13197a, C13199c, C13200d, C13201e, C13290a.C13291a, C13308i.C13309a {

    /* renamed from: b */
    public String f32985b;

    /* renamed from: c */
    public List<String> f32986c = new ArrayList();

    /* renamed from: d */
    public final C13299e f32987d = new C13299e(this);

    /* renamed from: e */
    public final C18787c f32988e = new C18787c((C13197a) this, (C13198b) this, (C13199c) this, (C13200d) this, (C13201e) this);

    /* renamed from: f */
    public List<AKBannerResponse> f32989f;

    /* renamed from: g */
    public boolean f32990g;

    /* renamed from: h */
    public Timer f32991h;

    /* renamed from: i */
    public boolean f32992i;

    /* renamed from: j */
    public boolean f32993j;

    /* renamed from: k */
    public Map<String, C13296a> f32994k;

    /* renamed from: l */
    public C13290a f32995l;

    /* renamed from: m */
    public boolean f32996m;

    /* renamed from: n */
    public long f32997n;

    /* renamed from: o */
    public long f32998o = -1;

    /* renamed from: yb0.d$a */
    public final class C13296a {

        /* renamed from: a */
        public C12909a f32999a;

        /* renamed from: b */
        public zzc f33000b;

        /* renamed from: c */
        public C12724b f33001c;

        public C13296a(C13295d dVar) {
            C24362h.m61211f(dVar, "this$0");
        }
    }

    /* renamed from: yb0.d$b */
    public /* synthetic */ class C13297b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33002a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f33003b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f33004c;

        static {
            int[] iArr = new int[UMOAdKitBannerType.values().length];
            iArr[UMOAdKitBannerType.NONE.ordinal()] = 1;
            iArr[UMOAdKitBannerType.INTERSTITIAL_640x1136.ordinal()] = 2;
            iArr[UMOAdKitBannerType.INTERSTITIAL_750x1334.ordinal()] = 3;
            iArr[UMOAdKitBannerType.INTERSTITIAL_1080x1920.ordinal()] = 4;
            iArr[UMOAdKitBannerType.CUSTOM_GWxGH.ordinal()] = 5;
            iArr[UMOAdKitBannerType.MEDRECT_300x250_1x1.ordinal()] = 6;
            iArr[UMOAdKitBannerType.LEADERBOARD_300x50_6x1.ordinal()] = 7;
            iArr[UMOAdKitBannerType.LEADERBOARD_320x50_6x1.ordinal()] = 8;
            iArr[UMOAdKitBannerType.LARGE_320x100.ordinal()] = 9;
            iArr[UMOAdKitBannerType.SQUARE_250x250.ordinal()] = 10;
            iArr[UMOAdKitBannerType.SMALLSQUARE_200x200.ordinal()] = 11;
            iArr[UMOAdKitBannerType.FULLSIZE_468x60.ordinal()] = 12;
            iArr[UMOAdKitBannerType.LEADERBOARD_728x90_8x1.ordinal()] = 13;
            iArr[UMOAdKitBannerType.BILLBOARD_970x250.ordinal()] = 14;
            iArr[UMOAdKitBannerType.SUPERLEADERBOARD_970x90.ordinal()] = 15;
            iArr[UMOAdKitBannerType.PORTRAIT_300x1050.ordinal()] = 16;
            iArr[UMOAdKitBannerType.SKYSCRAPER_160x600.ordinal()] = 17;
            iArr[UMOAdKitBannerType.TWENTYxSIXTY_120x60.ordinal()] = 18;
            iArr[UMOAdKitBannerType.SMART_SWxH.ordinal()] = 19;
            iArr[UMOAdKitBannerType.ADAPTIVE_GWxAH.ordinal()] = 20;
            f33002a = iArr;
            int[] iArr2 = new int[zzb.values().length];
            iArr2[1] = 1;
            iArr2[2] = 2;
            iArr2[25] = 3;
            int[] iArr3 = new int[zzf.values().length];
            iArr3[3] = 1;
            iArr3[4] = 2;
            f33003b = iArr3;
            int[] iArr4 = new int[UMOAdKitBannerState.values().length];
            iArr4[UMOAdKitBannerState.LOADING_IN_PROGRESS.ordinal()] = 1;
            iArr4[UMOAdKitBannerState.PREFETCHED.ordinal()] = 2;
            iArr4[UMOAdKitBannerState.MANUAL_REFRESH_IN_PROGRESS.ordinal()] = 3;
            iArr4[UMOAdKitBannerState.AUTO_REFRESH_IN_PROGRESS.ordinal()] = 4;
            iArr4[UMOAdKitBannerState.PREFETCHING_IN_PROGRESS.ordinal()] = 5;
            iArr4[UMOAdKitBannerState.REMOVAL_IN_PROGRESS.ordinal()] = 6;
            iArr4[UMOAdKitBannerState.NONE.ordinal()] = 7;
            iArr4[UMOAdKitBannerState.DISPLAYED.ordinal()] = 8;
            iArr4[UMOAdKitBannerState.INITIALIZED.ordinal()] = 9;
            iArr4[UMOAdKitBannerState.AUTO_PREFETCHING_IN_PROGRESS.ordinal()] = 10;
            iArr4[UMOAdKitBannerState.DISPLAY_IN_PROGRESS.ordinal()] = 11;
            iArr4[UMOAdKitBannerState.PLACEHOLDER_DISPLAYED.ordinal()] = 12;
            iArr4[UMOAdKitBannerState.CLICKED.ordinal()] = 13;
            f33004c = iArr4;
        }
    }

    /* renamed from: yb0.d$c */
    public static final class C13298c extends TimerTask {

        /* renamed from: b */
        public final /* synthetic */ String f33005b;

        /* renamed from: c */
        public final /* synthetic */ C13295d f33006c;

        public C13298c(String str, C13295d dVar) {
            this.f33005b = str;
            this.f33006c = dVar;
        }

        public final void run() {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AUTO_REFRESH: Timer EXPIRED");
            J0.append(this.f33005b);
            J0.append('.');
            logger.mo6672i(J0.toString());
            this.f33006c.mo40195s0(true);
            C13295d dVar = this.f33006c;
            dVar.f32998o = -1;
            dVar.mo40185g0();
        }
    }

    /* renamed from: F */
    public static List m33431F(AKBannerResponse aKBannerResponse, zzb zzb, String str, boolean z) {
        LinkedHashMap linkedHashMap;
        boolean z2;
        C12911c cVar;
        ArrayList arrayList = null;
        if (!(aKBannerResponse == null || (linkedHashMap = aKBannerResponse.f7441k) == null)) {
            C12911c cVar2 = (C12911c) linkedHashMap.get(zzb);
            boolean z3 = false;
            if (cVar2 != null && !cVar2.f31964c) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z && (cVar = (C12911c) linkedHashMap.get(zzb)) != null) {
                    cVar.f31964c = true;
                }
                C12911c cVar3 = (C12911c) linkedHashMap.get(zzb);
                if (cVar3 != null) {
                    arrayList = cVar3.f31963b;
                }
                if (arrayList != null && (!arrayList.isEmpty())) {
                    z3 = true;
                }
                if (!z3) {
                    Logger logger = C7557a.f23040a;
                    StringBuilder J0 = C21100e.m49315J0("Invalid Banner Beacons List (Beacon Type: ");
                    J0.append(zzb.name());
                    J0.append(')');
                    J0.append(str);
                    logger.mo6667d(J0.toString());
                }
                return arrayList;
            }
            Logger logger2 = C7557a.f23040a;
            StringBuilder J02 = C21100e.m49315J0("Banner Beacons already Hit (Beacon Type: ");
            J02.append(zzb.name());
            J02.append(')');
            J02.append(str);
            logger2.mo6667d(J02.toString());
        }
        return null;
    }

    /* renamed from: H */
    public static void m33432H(AKBannerResponse aKBannerResponse, zzb zzb, List list) {
        boolean z = true;
        if (list == null || !(!list.isEmpty())) {
            z = false;
        }
        if (z) {
            if (aKBannerResponse.f7441k == null) {
                aKBannerResponse.f7441k = new LinkedHashMap();
            }
            C12911c cVar = new C12911c();
            C24362h.m61211f(zzb, "<set-?>");
            cVar.f31962a = zzb;
            ArrayList arrayList = new ArrayList();
            cVar.f31963b = arrayList;
            C24362h.m61208c(list);
            arrayList.addAll(list);
            LinkedHashMap linkedHashMap = aKBannerResponse.f7441k;
            if (linkedHashMap != null) {
                C12911c cVar2 = (C12911c) linkedHashMap.put(zzb, cVar);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m33433I(java.lang.String r8, com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent r9, com.cubic.umo.p045ad.ext.types.UMOAdKitError r10) {
        /*
            mc0.d r0 = wb0.C13233c.m33348q(r8)
            if (r0 != 0) goto L_0x0009
            r0 = 0
        L_0x0007:
            r2 = r0
            goto L_0x0024
        L_0x0009:
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView r1 = wb0.C13233c.m33350s(r8)
            boolean r2 = wb0.C13233c.m33345n(r0)
            if (r2 != 0) goto L_0x0021
            if (r1 != 0) goto L_0x0016
            goto L_0x0021
        L_0x0016:
            c7.a r1 = r1.getBannerAdListener()
            if (r1 != 0) goto L_0x001f
            c7.a r0 = r0.f31970f
            goto L_0x0007
        L_0x001f:
            r2 = r1
            goto L_0x0024
        L_0x0021:
            c7.a r0 = r0.f31970f
            goto L_0x0007
        L_0x0024:
            if (r2 != 0) goto L_0x0027
            return
        L_0x0027:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "Notifying UMO Ad Kit Banner Ad Event to App"
            java.lang.StringBuilder r1 = ce0.C21100e.m49315J0(r1)
            boolean r3 = nc0.C12954d.m32800c(r8)
            if (r3 == 0) goto L_0x003a
            java.lang.String r3 = p584jl.C17885a.m44403H0(r8)
            goto L_0x003c
        L_0x003a:
            java.lang.String r3 = ""
        L_0x003c:
            r1.append(r3)
            java.lang.String r3 = ": Event: "
            r1.append(r3)
            r1.append(r9)
            java.lang.String r3 = " (Error: "
            r1.append(r3)
            r1.append(r10)
            java.lang.String r3 = ")..."
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.mo6672i(r1)
            android.os.Handler r0 = wb0.C13233c.f32843b
            gb.s r7 = new gb.s
            r6 = 1
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.m33433I(java.lang.String, com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent, com.cubic.umo.ad.ext.types.UMOAdKitError):void");
    }

    /* renamed from: K */
    public static void m33434K(String str, String str2, boolean z) throws zza {
        String str3;
        if (!z) {
            Logger logger = C7557a.f23040a;
            if (C12954d.m32800c(str)) {
                str3 = C17885a.m44403H0(str);
            } else {
                str3 = "";
            }
            logger.mo6667d(C24362h.m61216k(str3, str2));
            return;
        }
        throw new zza(str2);
    }

    /* renamed from: O */
    public static void m33435O(C12912d dVar, ViewGroup viewGroup) {
        Context context = C13233c.f32842a;
        UMOAdKitBannerView s = C13233c.m33350s(dVar.f31965a);
        if (s != null) {
            viewGroup.setTag("UMOAdView");
            if (viewGroup.getParent() != null && (viewGroup.getParent() instanceof ViewGroup)) {
                ViewParent parent = viewGroup.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(viewGroup);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            s.addView(viewGroup);
        }
    }

    /* renamed from: Q */
    public static void m33436Q(C12912d dVar, boolean z) {
        UMOAdKitBannerType uMOAdKitBannerType;
        if (dVar != null) {
            Context context = C13233c.f32842a;
            UMOAdKitBannerView s = C13233c.m33350s(dVar.f31965a);
            UMOAdKitBannerState uMOAdKitBannerState = dVar.f31968d;
            C24362h.m61211f(uMOAdKitBannerState, "<set-?>");
            dVar.f31969e = uMOAdKitBannerState;
            boolean z2 = false;
            if (z) {
                m33445w0(dVar.f31965a);
                if (s != null) {
                    UMOAdKitBannerParams uMOAdKitBannerParams = dVar.f31966b;
                    if (uMOAdKitBannerParams == null) {
                        uMOAdKitBannerType = null;
                    } else {
                        uMOAdKitBannerType = uMOAdKitBannerParams.mo11122q();
                    }
                    if (uMOAdKitBannerType == null) {
                        uMOAdKitBannerType = UMOAdKitBannerType.NONE;
                    }
                    s.setPlaceholder$ads_release(uMOAdKitBannerType);
                }
            }
            if (s != null && s.mo11049d()) {
                z2 = true;
            }
            if (z2) {
                s.mo11051f();
            }
            m33439V(dVar, UMOAdKitBannerState.DISPLAY_IN_PROGRESS);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m33437R(yb0.C13295d r11, java.lang.String r12, com.umo.ads.p342c.zzb r13, int r14) {
        /*
            r0 = r14 & 4
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r14 = r14 & 8
            if (r14 == 0) goto L_0x000e
            com.umo.ads.c.zzd$a r14 = com.umo.ads.p342c.zzd.zzb
        L_0x000e:
            r11.getClass()
            mc0.d r14 = wb0.C13233c.m33348q(r12)
            if (r14 != 0) goto L_0x0018
            goto L_0x006f
        L_0x0018:
            java.util.List<com.cubic.umo.ad.types.AKBannerResponse> r11 = r11.f32989f
            java.lang.String r2 = wb0.C13233c.m33342k(r14)
            com.cubic.umo.ad.types.AKBannerResponse r11 = wb0.C13233c.m33335d(r2, r11)
            boolean r2 = nc0.C12954d.m32800c(r12)
            if (r2 == 0) goto L_0x002d
            java.lang.String r2 = p584jl.C17885a.m44403H0(r12)
            goto L_0x002f
        L_0x002d:
            java.lang.String r2 = ""
        L_0x002f:
            int r3 = r13.ordinal()
            r4 = 0
            if (r3 == r1) goto L_0x0049
            r1 = 2
            if (r3 == r1) goto L_0x0043
            r1 = 25
            if (r3 == r1) goto L_0x003e
            goto L_0x005c
        L_0x003e:
            java.util.List r11 = m33431F(r11, r13, r2, r0)
            goto L_0x0047
        L_0x0043:
            java.util.List r11 = m33431F(r11, r13, r2, r0)
        L_0x0047:
            r4 = r11
            goto L_0x005c
        L_0x0049:
            if (r11 != 0) goto L_0x004d
            r1 = r4
            goto L_0x004f
        L_0x004d:
            java.lang.String r1 = r11.f7440j
        L_0x004f:
            java.lang.String r3 = "RUBICON"
            boolean r1 = mf0.C24362h.m61206a(r1, r3)
            if (r1 != 0) goto L_0x005c
            java.util.List r11 = m33431F(r11, r13, r2, r0)
            goto L_0x0047
        L_0x005c:
            r6 = r4
            if (r6 != 0) goto L_0x0060
            goto L_0x006f
        L_0x0060:
            int r8 = wb0.C13233c.m33332a(r14)
            int r9 = wb0.C13233c.m33340i()
            com.umo.ads.c.zzd r10 = com.umo.ads.p342c.zzd.NONE
            r5 = r12
            r7 = r13
            p584jl.C17885a.m44411L0(r5, r6, r7, r8, r9, r10)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.m33437R(yb0.d, java.lang.String, com.umo.ads.c.zzb, int):void");
    }

    /* renamed from: S */
    public static /* synthetic */ void m33438S(C13295d dVar, String str, List list, int i) {
        boolean z;
        zzd zzd;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            zzd = zzd.NONE;
        } else {
            zzd = null;
        }
        dVar.mo40171L(str, list, z, zzd);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
        if (r2 != 12) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        if (r2 != 4) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r2 != 4) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        if (r2 != 9) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        if (r2 != 13) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        if (r3[r2.ordinal()] == 8) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        if (r2 != 12) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d9, code lost:
        if (r2 != 9) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        if (r2 != 12) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        if (r2 != 12) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        if (r2 != 10) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0106, code lost:
        if (r3[r2.ordinal()] == 9) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0108, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010a, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010d, code lost:
        if (r2 != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x010f, code lost:
        r14 = ac0.C7557a.f23040a;
        r14.mo6667d("$$$$$ BANNER_STATE_UPDATE_ERROR" + r0 + " $$$$$");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0128, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0129, code lost:
        r2 = ac0.C7557a.f23040a;
        r2.mo6672i("$$$$$ BANNER_STATE_UPDATE" + r0 + " $$$$$");
        r14.f31968d = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0144, code lost:
        return true;
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m33439V(mc0.C12912d r14, com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState r15) {
        /*
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r0 = r14.f31968d
            r1 = 1
            if (r0 != r15) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r14.f31965a
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
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r2 = r14.f31968d
            java.lang.String r2 = r2.name()
            r0.append(r2)
            java.lang.String r2 = " -> "
            r0.append(r2)
            java.lang.String r2 = r15.name()
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r2 = r14.f31968d
            int[] r3 = yb0.C13295d.C13297b.f33004c
            int r4 = r15.ordinal()
            r4 = r3[r4]
            r5 = 13
            r6 = 11
            r7 = 4
            r8 = 3
            r9 = 12
            r10 = 9
            r11 = 2
            r12 = 8
            r13 = 0
            switch(r4) {
                case 1: goto L_0x0100;
                case 2: goto L_0x00f2;
                case 3: goto L_0x00e7;
                case 4: goto L_0x00dc;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00aa;
                case 9: goto L_0x009f;
                case 10: goto L_0x0093;
                case 11: goto L_0x0083;
                case 12: goto L_0x006d;
                case 13: goto L_0x0061;
                default: goto L_0x005b;
            }
        L_0x005b:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x0061:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r12) goto L_0x0108
            if (r2 == r9) goto L_0x0108
            goto L_0x010a
        L_0x006d:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r10) goto L_0x0108
            if (r2 == r6) goto L_0x0108
            if (r2 == r5) goto L_0x0108
            if (r2 == r1) goto L_0x0108
            if (r2 == r11) goto L_0x0108
            if (r2 == r8) goto L_0x0108
            if (r2 == r7) goto L_0x0108
            goto L_0x010a
        L_0x0083:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r1) goto L_0x0108
            if (r2 == r11) goto L_0x0108
            if (r2 == r8) goto L_0x0108
            if (r2 == r7) goto L_0x0108
            goto L_0x010a
        L_0x0093:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r11) goto L_0x0108
            if (r2 == r10) goto L_0x0108
            goto L_0x010a
        L_0x009f:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto L_0x0108;
                case 2: goto L_0x0108;
                case 3: goto L_0x00a8;
                case 4: goto L_0x00a8;
                case 5: goto L_0x0108;
                case 6: goto L_0x0108;
                case 7: goto L_0x0108;
                case 8: goto L_0x0108;
                case 9: goto L_0x00a8;
                case 10: goto L_0x0108;
                case 11: goto L_0x0108;
                case 12: goto L_0x0108;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            goto L_0x010a
        L_0x00aa:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r8) goto L_0x0108
            if (r2 == r7) goto L_0x0108
            if (r2 == r6) goto L_0x0108
            if (r2 == r5) goto L_0x0108
            goto L_0x010a
        L_0x00b9:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 != r12) goto L_0x010a
            goto L_0x0108
        L_0x00c2:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r11) goto L_0x0108
            if (r2 == r12) goto L_0x0108
            if (r2 == r6) goto L_0x0108
            if (r2 == r9) goto L_0x0108
            goto L_0x010a
        L_0x00d1:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r11) goto L_0x0108
            if (r2 == r10) goto L_0x0108
            goto L_0x010a
        L_0x00dc:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r12) goto L_0x0108
            if (r2 == r9) goto L_0x0108
            goto L_0x010a
        L_0x00e7:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r12) goto L_0x0108
            if (r2 == r9) goto L_0x0108
            goto L_0x010a
        L_0x00f2:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 5
            if (r2 == r3) goto L_0x0108
            r3 = 10
            if (r2 == r3) goto L_0x0108
            goto L_0x010a
        L_0x0100:
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 != r10) goto L_0x010a
        L_0x0108:
            r2 = 1
            goto L_0x010b
        L_0x010a:
            r2 = 0
        L_0x010b:
            java.lang.String r3 = " $$$$$"
            if (r2 != 0) goto L_0x0129
            ch.qos.logback.classic.Logger r14 = ac0.C7557a.f23040a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "$$$$$ BANNER_STATE_UPDATE_ERROR"
            r15.append(r1)
            r15.append(r0)
            r15.append(r3)
            java.lang.String r15 = r15.toString()
            r14.mo6667d(r15)
            return r13
        L_0x0129:
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "$$$$$ BANNER_STATE_UPDATE"
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r2.mo6672i(r0)
            r14.f31968d = r15
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.m33439V(mc0.d, com.cubic.umo.ad.ext.types.UMOAdKitBannerState):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r1 != false) goto L_0x00c7;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m33440W(java.lang.String r10) {
        /*
            java.lang.String r0 = "spotId"
            mf0.C24362h.m61211f(r10, r0)
            mc0.d r0 = wb0.C13233c.m33348q(r10)
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            boolean r1 = r0.f31971g
            if (r1 == 0) goto L_0x01d1
            boolean r1 = r0.f31972h
            if (r1 == 0) goto L_0x0016
            goto L_0x01d1
        L_0x0016:
            java.lang.String r1 = r0.f31967c
            yb0.d r7 = wb0.C13233c.m33344m(r1)
            if (r7 != 0) goto L_0x001f
            return
        L_0x001f:
            yb0.i r1 = r0.f31974j
            r8 = 0
            if (r1 != 0) goto L_0x004e
            com.cubic.umo.ad.ext.interfaces.UMOAdKitBannerView r1 = wb0.C13233c.m33350s(r10)
            boolean r5 = wb0.C13233c.m33345n(r0)
            if (r5 == 0) goto L_0x0033
            android.view.ViewGroup r1 = r0.f31973i
            if (r1 != 0) goto L_0x0037
            goto L_0x0035
        L_0x0033:
            if (r1 != 0) goto L_0x0037
        L_0x0035:
            r4 = r8
            goto L_0x003c
        L_0x0037:
            android.content.Context r1 = r1.getContext()
            r4 = r1
        L_0x003c:
            android.view.ViewGroup r1 = wb0.C13233c.m33334c(r10)
            yb0.i r9 = new yb0.i
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r1)
            r2 = r9
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0.f31974j = r9
        L_0x004e:
            yb0.i r10 = r0.f31974j
            if (r10 != 0) goto L_0x0054
            goto L_0x01d1
        L_0x0054:
            java.lang.ref.WeakReference<android.view.ViewGroup> r0 = r10.f33038e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x005b
            goto L_0x006c
        L_0x005b:
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x006c
            r0 = 1
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != 0) goto L_0x008e
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.f33036c
            r1.append(r2)
            java.lang.String r2 = "_VIEWABILITY: Not attempting to check Viewability Criteria as Ad View is NOT VISIBLE"
            r1.append(r2)
            java.lang.String r10 = r10.f33047n
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.mo6667d(r10)
            goto L_0x01d1
        L_0x008e:
            boolean r0 = r10.f33037d
            r3 = 93
            java.lang.String r4 = ", "
            if (r0 != 0) goto L_0x011f
            java.lang.ref.WeakReference<android.view.ViewGroup> r0 = r10.f33038e
            if (r0 != 0) goto L_0x009b
            goto L_0x00ac
        L_0x009b:
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x00a4
            goto L_0x00ac
        L_0x00a4:
            int r0 = r0.getWidth()
            if (r0 != 0) goto L_0x00ac
            r0 = 1
            goto L_0x00ad
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 != 0) goto L_0x00c7
            java.lang.ref.WeakReference<android.view.ViewGroup> r0 = r10.f33038e
            if (r0 != 0) goto L_0x00b4
            goto L_0x00c4
        L_0x00b4:
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x00bd
            goto L_0x00c4
        L_0x00bd:
            int r0 = r0.getHeight()
            if (r0 != 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            if (r1 == 0) goto L_0x011f
        L_0x00c7:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.f33036c
            r1.append(r2)
            java.lang.String r2 = "_VIEWABILITY: Not attempting to check Viewability Criteria as Ad View Width/Height looks Invalid: ["
            r1.append(r2)
            java.lang.ref.WeakReference<android.view.ViewGroup> r2 = r10.f33038e
            if (r2 != 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x00e7
        L_0x00e5:
            r2 = r8
            goto L_0x00ef
        L_0x00e7:
            int r2 = r2.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x00ef:
            r1.append(r2)
            r1.append(r4)
            java.lang.ref.WeakReference<android.view.ViewGroup> r2 = r10.f33038e
            if (r2 != 0) goto L_0x00fa
            goto L_0x010b
        L_0x00fa:
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x0103
            goto L_0x010b
        L_0x0103:
            int r2 = r2.getHeight()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
        L_0x010b:
            r1.append(r8)
            r1.append(r3)
            java.lang.String r10 = r10.f33047n
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.mo6667d(r10)
            goto L_0x01d1
        L_0x011f:
            android.content.Context r0 = r10.f33035b
            if (r0 != 0) goto L_0x0136
            java.lang.ref.WeakReference<android.view.ViewGroup> r0 = r10.f33038e
            if (r0 != 0) goto L_0x0128
            goto L_0x0130
        L_0x0128:
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L_0x0132
        L_0x0130:
            r0 = r8
            goto L_0x0136
        L_0x0132:
            android.content.Context r0 = r0.getContext()
        L_0x0136:
            if (r0 != 0) goto L_0x013a
            goto L_0x01b2
        L_0x013a:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0195
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.f33036c
            r1.append(r2)
            java.lang.String r2 = "_VIEWABILITY: Ad View Context is not an Activity ["
            r1.append(r2)
            java.lang.ref.WeakReference<android.view.ViewGroup> r2 = r10.f33038e
            if (r2 != 0) goto L_0x0154
            goto L_0x015c
        L_0x0154:
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x015e
        L_0x015c:
            r2 = r8
            goto L_0x0166
        L_0x015e:
            int r2 = r2.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0166:
            r1.append(r2)
            r1.append(r4)
            java.lang.ref.WeakReference<android.view.ViewGroup> r2 = r10.f33038e
            if (r2 != 0) goto L_0x0171
            goto L_0x0182
        L_0x0171:
            java.lang.Object r2 = r2.get()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x017a
            goto L_0x0182
        L_0x017a:
            int r2 = r2.getHeight()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
        L_0x0182:
            r1.append(r8)
            r1.append(r3)
            java.lang.String r10 = r10.f33047n
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.mo6667d(r10)
            goto L_0x01d1
        L_0x0195:
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            r10.f33046m = r0
            if (r0 != 0) goto L_0x01a3
            goto L_0x01b2
        L_0x01a3:
            androidx.activity.g r1 = new androidx.activity.g
            r2 = 19
            r1.<init>(r10, r2)
            boolean r0 = r0.post(r1)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
        L_0x01b2:
            if (r8 != 0) goto L_0x01d1
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r10.f33036c
            r1.append(r2)
            java.lang.String r2 = "_VIEWABILITY: Invalid Ad View Context"
            r1.append(r2)
            java.lang.String r10 = r10.f33047n
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.mo6667d(r10)
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.m33440W(java.lang.String):void");
    }

    /* renamed from: X */
    public static void m33441X(String str) {
        C24362h.m61211f(str, "spotId");
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            C13308i iVar = q.f31974j;
            if (iVar != null) {
                iVar.mo40216a(false);
            }
            q.f31974j = null;
            q.f31972h = false;
            q.f31971g = false;
        }
    }

    /* renamed from: i0 */
    public static void m33442i0(C12912d dVar) {
        UMOAdKitBannerAdEvent uMOAdKitBannerAdEvent;
        UMOAdKitBannerState uMOAdKitBannerState = dVar.f31968d;
        if (uMOAdKitBannerState == UMOAdKitBannerState.DISPLAY_IN_PROGRESS) {
            int i = C13297b.f33004c[dVar.f31969e.ordinal()];
            if (i == 1 || i == 2) {
                uMOAdKitBannerAdEvent = UMOAdKitBannerAdEvent.BANNER_DISPLAYED;
            } else if (i == 3) {
                uMOAdKitBannerAdEvent = UMOAdKitBannerAdEvent.BANNER_REFRESHED;
            } else if (i != 4) {
                uMOAdKitBannerAdEvent = UMOAdKitBannerAdEvent.NONE;
            } else {
                uMOAdKitBannerAdEvent = UMOAdKitBannerAdEvent.BANNER_AUTO_REFRESHED;
            }
        } else if (uMOAdKitBannerState == UMOAdKitBannerState.DISPLAYED) {
            uMOAdKitBannerAdEvent = UMOAdKitBannerAdEvent.BANNER_DISPLAYED;
        } else {
            uMOAdKitBannerAdEvent = UMOAdKitBannerAdEvent.NONE;
        }
        if (uMOAdKitBannerAdEvent != UMOAdKitBannerAdEvent.NONE) {
            UMOAdKitBannerState uMOAdKitBannerState2 = UMOAdKitBannerState.NONE;
            C24362h.m61211f(uMOAdKitBannerState2, "<set-?>");
            dVar.f31969e = uMOAdKitBannerState2;
            m33433I(dVar.f31965a, uMOAdKitBannerAdEvent, UMOAdKitError.NONE);
        }
    }

    /* renamed from: m0 */
    public static void m33443m0(C12912d dVar) {
        if (dVar != null) {
            ViewGroup viewGroup = dVar.f31973i;
            C21050d dVar2 = null;
            if (viewGroup != null) {
                if (viewGroup instanceof C12844i) {
                    ((C12844i) viewGroup).mo39704t();
                }
                if (viewGroup instanceof AKWebView) {
                    ((AKWebView) viewGroup).destroy();
                }
                Context context = C13233c.f32842a;
                UMOAdKitBannerView s = C13233c.m33350s(dVar.f31965a);
                if (s != null) {
                    s.removeView(viewGroup);
                }
                dVar.f31973i = null;
                dVar2 = C21050d.f52856a;
            }
            if (dVar2 == null) {
                Context context2 = C13233c.f32842a;
                UMOAdKitBannerView s2 = C13233c.m33350s(dVar.f31965a);
                if (s2 != null) {
                    C12952c.m32797g(s2);
                }
            }
        }
    }

    /* renamed from: t0 */
    public static boolean m33444t0(String str, String str2) {
        ViewGroup c = C13233c.m33334c(str);
        if (c == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
        intent.setFlags(268435456);
        try {
            c.getContext().startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: w0 */
    public static void m33445w0(String str) {
        UMOAdKitBannerParams uMOAdKitBannerParams;
        UMOAdKitBannerParams uMOAdKitBannerParams2;
        Pair pair;
        C12912d q = C13233c.m33348q(str);
        if (q != null && (uMOAdKitBannerParams = q.f31966b) != null) {
            C12912d q2 = C13233c.m33348q(str);
            if (q2 == null) {
                uMOAdKitBannerParams2 = null;
            } else {
                uMOAdKitBannerParams2 = q2.f31966b;
            }
            if (uMOAdKitBannerParams2 != null) {
                switch (C13297b.f33002a[uMOAdKitBannerParams2.mo11122q().ordinal()]) {
                    case 2:
                        pair = new Pair(640, 1136);
                        break;
                    case 3:
                        pair = new Pair(Integer.valueOf(LoadingDots.PULSE_DURATION), 1334);
                        break;
                    case 4:
                        pair = new Pair(1080, 1920);
                        break;
                    case 6:
                        pair = new Pair(Integer.valueOf(Strategy.TTL_SECONDS_DEFAULT), 250);
                        break;
                    case 7:
                        pair = new Pair(Integer.valueOf(Strategy.TTL_SECONDS_DEFAULT), 50);
                        break;
                    case 8:
                        pair = new Pair(320, 50);
                        break;
                    case 9:
                        pair = new Pair(320, 100);
                        break;
                    case 10:
                        pair = new Pair(250, 250);
                        break;
                    case 11:
                        pair = new Pair(200, 200);
                        break;
                    case 12:
                        pair = new Pair(468, 60);
                        break;
                    case 13:
                        pair = new Pair(728, 90);
                        break;
                    case 14:
                        pair = new Pair(970, 250);
                        break;
                    case 15:
                        pair = new Pair(970, 90);
                        break;
                    case 16:
                        pair = new Pair(Integer.valueOf(Strategy.TTL_SECONDS_DEFAULT), 1050);
                        break;
                    case 17:
                        pair = new Pair(160, 600);
                        break;
                    case 18:
                        pair = new Pair(120, 60);
                        break;
                    case 19:
                        UMOAdKitBannerView.f7241i.getClass();
                        pair = UMOAdKitBannerView.Companion.m5822b();
                        break;
                    case 20:
                        UMOAdKitBannerView.Companion companion = UMOAdKitBannerView.f7241i;
                        int r = uMOAdKitBannerParams2.mo11123r();
                        companion.getClass();
                        Pair a = UMOAdKitBannerView.Companion.m5821a(r);
                        pair = new Pair(a.mo59068c(), a.mo59069d());
                        break;
                    default:
                        pair = m33446y0(str);
                        break;
                }
            } else {
                pair = m33446y0(str);
            }
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("INTERNAL_BANNER_SIZE: Old -> [");
            J0.append(uMOAdKitBannerParams.mo11123r());
            J0.append(", ");
            J0.append(uMOAdKitBannerParams.mo11116k());
            J0.append("], New -> [");
            J0.append(((Number) pair.mo59068c()).intValue());
            J0.append(", ");
            J0.append(((Number) pair.mo59069d()).intValue());
            J0.append(']');
            logger.mo6666c(J0.toString());
            if (uMOAdKitBannerParams.mo11122q() == UMOAdKitBannerType.ADAPTIVE_GWxAH && uMOAdKitBannerParams.mo11108e() == 0) {
                uMOAdKitBannerParams.mo11129w(uMOAdKitBannerParams.mo11123r());
            }
            uMOAdKitBannerParams.mo11103H(((Number) pair.mo59068c()).intValue());
            uMOAdKitBannerParams.mo11097B(((Number) pair.mo59069d()).intValue());
        }
    }

    /* renamed from: y0 */
    public static Pair m33446y0(String str) {
        UMOAdKitBannerParams uMOAdKitBannerParams;
        UMOAdKitBannerView s = C13233c.m33350s(str);
        if (s != null) {
            return s.getNonStandardOrVideoBannerWidthAndHeight$ads_release();
        }
        C12912d q = C13233c.m33348q(str);
        if (q == null || (uMOAdKitBannerParams = q.f31966b) == null) {
            return new Pair(-2, -2);
        }
        return new Pair(Integer.valueOf(uMOAdKitBannerParams.mo11123r()), Integer.valueOf(uMOAdKitBannerParams.mo11116k()));
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdPaused"));
        m33438S(this, str, C17875h.m44280D(zzb.PAUSE), 8);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v3, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r8v7, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* renamed from: A0 */
    public final void mo40159A0(String str) {
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        UMOAdKitBannerParams uMOAdKitBannerParams;
        boolean z;
        String str2;
        C24362h.m61211f(str, "spotId");
        boolean z2 = false;
        String str3 = "";
        String str4 = null;
        if (this.f32997n != 0 && this.f32991h != null) {
            Logger logger = C7557a.f23040a;
            ? r8 = this.f32986c;
            if (r8 == 0 || !(!r8.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str2 = C14226d.m35344K0(C5720b.m14044L(r8), C23825c.m58520q0(r8, ", ", (String) null, (String) null, (C24236l) null, 62));
            } else {
                str2 = str3;
            }
            logger.mo6672i(C24362h.m61216k(str2, "AUTO_REFRESH: Stopping Timer on Navigation"));
            Timer timer = this.f32991h;
            if (timer != null) {
                timer.cancel();
            }
            this.f32991h = null;
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f32998o;
            if (j < 0) {
                j = mo40198x0();
            }
            long j2 = currentTimeMillis - this.f32997n;
            this.f32998o = j - j2;
            Logger logger2 = C7557a.f23040a;
            StringBuilder g = C16759e.m42351g("AUTO_REFRESH: User navigated away: Auto-Refresh Interval: ", j, ", Elapsed: ");
            g.append(j2);
            g.append(", Remaining: ");
            g.append(this.f32998o);
            ? r82 = this.f32986c;
            if (r82 != 0 && (!r82.isEmpty())) {
                z2 = true;
            }
            if (z2) {
                str3 = C14226d.m35344K0(C5720b.m14044L(r82), C23825c.m58520q0(r82, ", ", (String) null, (String) null, (C24236l) null, 62));
            }
            g.append(str3);
            logger2.mo6672i(g.toString());
        } else if (this.f32998o <= 0) {
            Logger logger3 = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("AUTO_REFRESH: No Auto-Refresh Timer running when user navigated away");
            ? r6 = this.f32986c;
            if (r6 != 0 && (!r6.isEmpty())) {
                z2 = true;
            }
            if (z2) {
                str3 = C14226d.m35344K0(C5720b.m14044L(r6), C23825c.m58520q0(r6, ", ", (String) null, (String) null, (C24236l) null, 62));
            }
            J0.append(str3);
            J0.append("...");
            logger3.mo6672i(J0.toString());
        }
        C12912d q = C13233c.m33348q(str);
        if (q == null || (uMOAdKitBannerParams = q.f31966b) == null) {
            uMOAdKitInlineBannerCreativeType = null;
        } else {
            uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams.mo11114i();
        }
        if (C13233c.m33339h(uMOAdKitInlineBannerCreativeType)) {
            if (q != null) {
                str4 = q.f31965a;
            }
            mo40194r0(str4, true);
        }
    }

    /* renamed from: B */
    public final void mo39550B(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
        mo40182d0(str, uMOAdKitError, zzd);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: B0 */
    public final boolean mo40160B0() {
        Iterator it = this.f32986c.iterator();
        while (it.hasNext()) {
            C12912d q = C13233c.m33348q((String) it.next());
            if (q != null && C13233c.m33345n(q)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void mo40076C(String str, UMOAdKitError uMOAdKitError) {
        C24362h.m61211f(uMOAdKitError, "akError");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: C0 */
    public final boolean mo40161C0() {
        boolean z;
        ? r0 = this.f32986c;
        if (r0 == 0 || !(!r0.isEmpty())) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.f32986c.size() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final void mo39552D(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onVideoAdStopped"));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: D0 */
    public final void mo40162D0() {
        Iterator it = this.f32986c.iterator();
        while (it.hasNext()) {
            m33433I((String) it.next(), UMOAdKitBannerAdEvent.BANNER_LOAD_STARTED, UMOAdKitError.NONE);
        }
    }

    /* renamed from: E */
    public final void mo39553E(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdUserClose"));
        m33438S(this, str, C17875h.m44281E(zzb.CLOSE, zzb.CLOSE_LINEAR), 12);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: E0 */
    public final void mo40163E0() {
        String str;
        boolean z;
        String str2 = "";
        if (this.f32993j) {
            str = " (DEFERRED AUTO-PREFETCH)";
        } else {
            str = str2;
        }
        Logger logger = C7557a.f23040a;
        StringBuilder t = C0016g.m36t("PREFETCH_AD_EXPIRY_BANNER: Auto Prefetching on Ad Expiry", str);
        ? r3 = this.f32986c;
        if (r3 == 0 || !(!r3.isEmpty())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str2 = C14226d.m35344K0(C5720b.m14044L(r3), C23825c.m58520q0(r3, ", ", (String) null, (String) null, (C24236l) null, 62));
        }
        t.append(str2);
        t.append("...");
        logger.mo6672i(t.toString());
        mo40165G(UMOAdKitBannerState.AUTO_PREFETCHING_IN_PROGRESS, false);
        this.f32987d.mo40203c(this.f32986c, true);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: F0 */
    public final void mo40164F0() {
        ConcurrentHashMap<String, C12912d> concurrentHashMap;
        C12912d dVar;
        if (!this.f32990g) {
            mo40195s0(false);
            mo40188k0();
            Iterator it = this.f32986c.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                mo40173N(C13233c.m33348q(str));
                if (!(!C12954d.m32800c(str) || (concurrentHashMap = C13233c.f32850i) == null || (dVar = concurrentHashMap.get(str)) == null)) {
                    C13233c.m33346o(dVar);
                }
                C13233c.m33352u(str);
            }
            mo40165G(UMOAdKitBannerState.INITIALIZED, false);
            this.f32990g = true;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: G */
    public final void mo40165G(UMOAdKitBannerState uMOAdKitBannerState, boolean z) throws zza {
        UMOAdKitError uMOAdKitError;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f32986c.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C12912d q = C13233c.m33348q(str);
            if (q != null && !m33439V(q, uMOAdKitBannerState)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() != this.f32986c.size()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                UMOAdKitBannerAdEvent uMOAdKitBannerAdEvent = UMOAdKitBannerAdEvent.BANNER_ERROR;
                int i = C13297b.f33004c[uMOAdKitBannerState.ordinal()];
                if (i == 1) {
                    uMOAdKitError = UMOAdKitError.BANNER_SHOW_FAILED;
                } else if (i == 3) {
                    uMOAdKitError = UMOAdKitError.BANNER_REFRESH_FAILED;
                } else if (i == 4) {
                    uMOAdKitError = UMOAdKitError.BANNER_AUTO_REFRESH_FAILED;
                } else if (i == 5) {
                    uMOAdKitError = UMOAdKitError.BANNER_FETCH_FAILED;
                } else if (i != 6) {
                    uMOAdKitError = UMOAdKitError.NONE;
                } else {
                    uMOAdKitError = UMOAdKitError.BANNER_REMOVAL_FAILED;
                }
                m33433I(str2, uMOAdKitBannerAdEvent, uMOAdKitError);
            }
        } else if (z) {
            throw new zza(UMOAdKitError.BANNER_OPERATION_NOT_ALLOWED_NOW.getDesc());
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* renamed from: G0 */
    public final void mo40166G0() {
        boolean z;
        String str;
        boolean z2 = false;
        String str2 = "";
        if (mo40184f0()) {
            Logger logger = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("BANNER_VISIBILITY: Not performing any DEFERRED Operations as NONE of the related Banners in the screen are VISIBLE");
            ? r5 = this.f32986c;
            if (r5 != 0 && (!r5.isEmpty())) {
                z2 = true;
            }
            if (z2) {
                str2 = C14226d.m35344K0(C5720b.m14044L(r5), C23825c.m58520q0(r5, ", ", (String) null, (String) null, (C24236l) null, 62));
            }
            J0.append(str2);
            J0.append('.');
            logger.mo6666c(J0.toString());
            return;
        }
        if (!this.f32992i) {
            Logger logger2 = C7557a.f23040a;
            ? r4 = this.f32986c;
            if (r4 == 0 || !(!r4.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str = C14226d.m35344K0(C5720b.m14044L(r4), C23825c.m58520q0(r4, ", ", (String) null, (String) null, (C24236l) null, 62));
            } else {
                str = str2;
            }
            logger2.mo6666c(C24362h.m61216k(str, "BANNER_VISIBILITY: No DEFERRED Auto-Refresh exists"));
        } else {
            mo40185g0();
            this.f32992i = false;
        }
        if (!this.f32993j) {
            Logger logger3 = C7557a.f23040a;
            ? r42 = this.f32986c;
            if (r42 != 0 && (!r42.isEmpty())) {
                z2 = true;
            }
            if (z2) {
                str2 = C14226d.m35344K0(C5720b.m14044L(r42), C23825c.m58520q0(r42, ", ", (String) null, (String) null, (C24236l) null, 62));
            }
            logger3.mo6666c(C24362h.m61216k(str2, "BANNER_VISIBILITY: No DEFERRED Auto-Prefetch exists"));
            return;
        }
        mo40163E0();
        this.f32993j = false;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* renamed from: H0 */
    public final void mo40167H0() {
        String str;
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("BANNER_AD_HANDLER: Releasing AKBannerAdHandler instantiated for Interstitial usecase");
        ? r2 = this.f32986c;
        boolean z = true;
        if (r2 == 0 || !(!r2.isEmpty())) {
            z = false;
        }
        if (z) {
            str = C14226d.m35344K0(C5720b.m14044L(r2), C23825c.m58520q0(r2, ", ", (String) null, (String) null, (C24236l) null, 62));
        } else {
            str = "";
        }
        J0.append(str);
        J0.append("(Key: ");
        String str2 = this.f32985b;
        if (str2 != null) {
            J0.append(str2);
            J0.append(")...");
            logger.mo6666c(J0.toString());
            mo40164F0();
            Context context = C13233c.f32842a;
            String str3 = this.f32985b;
            if (str3 != null) {
                C13233c.m33354w(str3);
            } else {
                C24362h.m61217l("mapKey");
                throw null;
            }
        } else {
            C24362h.m61217l("mapKey");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* renamed from: I0 */
    public final void mo40168I0() {
        boolean z;
        String str;
        boolean z2 = true;
        String str2 = "";
        if (this.f32993j) {
            Logger logger = C7557a.f23040a;
            ? r4 = this.f32986c;
            if (r4 == 0 || !(!r4.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str = C14226d.m35344K0(C5720b.m14044L(r4), C23825c.m58520q0(r4, ", ", (String) null, (String) null, (C24236l) null, 62));
            } else {
                str = str2;
            }
            logger.mo6672i(C24362h.m61216k(str, "Resetting Deferred Auto-Prefetch state"));
            this.f32993j = false;
        }
        if (this.f32992i) {
            Logger logger2 = C7557a.f23040a;
            ? r42 = this.f32986c;
            if (r42 == 0 || !(!r42.isEmpty())) {
                z2 = false;
            }
            if (z2) {
                str2 = C14226d.m35344K0(C5720b.m14044L(r42), C23825c.m58520q0(r42, ", ", (String) null, (String) null, (C24236l) null, 62));
            }
            logger2.mo6672i(C24362h.m61216k(str2, "Resetting Deferred Auto-Refresh state"));
            this.f32992i = false;
        }
        Iterator it = this.f32986c.iterator();
        while (it.hasNext()) {
            UMOAdKitBannerView s = C13233c.m33350s((String) it.next());
            if (s != null) {
                s.getViewTreeObserver().removeOnScrollChangedListener(s);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [bf0.d] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* JADX WARNING: type inference failed for: r3v16, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40169J(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            if (r21 != 0) goto L_0x0023
            java.util.Map<java.lang.String, yb0.d$a> r3 = r0.f32994k
            if (r3 != 0) goto L_0x000c
            goto L_0x001e
        L_0x000c:
            java.lang.Object r3 = r3.get(r1)
            yb0.d$a r3 = (yb0.C13295d.C13296a) r3
            if (r3 != 0) goto L_0x0015
            goto L_0x001e
        L_0x0015:
            mc0.a r3 = r3.f32999a
            if (r3 != 0) goto L_0x001a
            goto L_0x001e
        L_0x001a:
            com.umo.ads.u.zzq r3 = r3.f31956k
            if (r3 != 0) goto L_0x0020
        L_0x001e:
            r3 = r2
            goto L_0x0025
        L_0x0020:
            java.lang.String r3 = r3.f30878g
            goto L_0x0025
        L_0x0023:
            r3 = r21
        L_0x0025:
            if (r3 != 0) goto L_0x003d
            java.util.Map<java.lang.String, yb0.d$a> r3 = r0.f32994k
            if (r3 != 0) goto L_0x002c
            goto L_0x0039
        L_0x002c:
            java.lang.Object r3 = r3.get(r1)
            yb0.d$a r3 = (yb0.C13295d.C13296a) r3
            if (r3 != 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            mc0.a r3 = r3.f32999a
            if (r3 != 0) goto L_0x003b
        L_0x0039:
            r3 = r2
            goto L_0x003d
        L_0x003b:
            java.lang.String r3 = r3.f31954i
        L_0x003d:
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0043
            goto L_0x0171
        L_0x0043:
            mc0.d r5 = wb0.C13233c.m33348q(r20)
            if (r5 != 0) goto L_0x004b
            goto L_0x0171
        L_0x004b:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r6 = r5.f31968d
            java.lang.String r7 = "<set-?>"
            mf0.C24362h.m61211f(r6, r7)
            r5.f31969e = r6
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r6 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.CLICKED
            m33439V(r5, r6)
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r5.f31966b
            if (r6 != 0) goto L_0x005f
            r6 = r2
            goto L_0x0063
        L_0x005f:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r6 = r6.mo11114i()
        L_0x0063:
            boolean r6 = wb0.C13233c.m33339h(r6)
            r7 = 8
            if (r6 == 0) goto L_0x0075
            com.umo.ads.c.zzb r6 = com.umo.ads.p342c.zzb.CLICK
            java.util.List r6 = p583jk.C17875h.m44280D(r6)
            m33438S(r0, r1, r6, r7)
            goto L_0x007a
        L_0x0075:
            com.umo.ads.c.zzb r6 = com.umo.ads.p342c.zzb.CLICK
            m33437R(r0, r1, r6, r7)
        L_0x007a:
            r6 = 1
            r0.mo40191o0(r1, r6)
            java.lang.String r7 = r5.f31965a
            android.view.ViewGroup r7 = wb0.C13233c.m33334c(r7)
            if (r7 != 0) goto L_0x0088
            goto L_0x016f
        L_0x0088:
            java.lang.String r8 = "&rd="
            r9 = 0
            boolean r10 = kotlin.text.C24179b.m60559G(r3, r8, r9)
            r11 = 2
            r12 = 6
            if (r10 == 0) goto L_0x00c9
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.util.List r8 = kotlin.text.C24179b.m60577Y(r3, r8, r9, r12)
            int r10 = r8.size()
            if (r10 != r11) goto L_0x00c9
            java.lang.String r13 = r5.f31965a
            java.lang.Object r3 = r8.get(r9)
            java.util.List r14 = p583jk.C17875h.m44280D(r3)
            com.umo.ads.c.zzb r15 = com.umo.ads.p342c.zzb.CLICK
            int r16 = wb0.C13233c.m33332a(r5)
            int r17 = wb0.C13233c.m33340i()
            com.umo.ads.c.zzd r18 = com.umo.ads.p342c.zzd.NONE
            p584jl.C17885a.m44411L0(r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r8.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = android.net.Uri.decode(r3)
            java.lang.String r8 = "decode(urlList[1])"
            mf0.C24362h.m61210e(r3, r8)
        L_0x00c9:
            ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
            java.lang.String r10 = "Opening Banner Ad Click Url"
            java.lang.StringBuilder r10 = ce0.C21100e.m49315J0(r10)
            java.lang.String r13 = r5.f31965a
            boolean r14 = nc0.C12954d.m32800c(r13)
            if (r14 == 0) goto L_0x00de
            java.lang.String r13 = p584jl.C17885a.m44403H0(r13)
            goto L_0x00df
        L_0x00de:
            r13 = r4
        L_0x00df:
            java.lang.String r14 = ": [ "
            java.lang.String r15 = " ]..."
            java.lang.String r10 = p379.C13715c.m34246l(r10, r13, r14, r3, r15)
            r8.mo6672i(r10)
            java.lang.String r8 = "intent://"
            boolean r8 = uh0.C25081h.m62835F(r3, r8)
            if (r8 == 0) goto L_0x0148
            java.lang.String r8 = r5.f31965a
            boolean r10 = m33444t0(r8, r3)
            if (r10 == 0) goto L_0x00fc
            r2 = 1
            goto L_0x0132
        L_0x00fc:
            java.lang.String r10 = "S.browser_fallback_url="
            int r10 = kotlin.text.C24179b.m60568P(r3, r10, r12)
            r12 = -1
            if (r10 != r12) goto L_0x0106
            goto L_0x0124
        L_0x0106:
            int r10 = r10 + 23
            r2 = 4
            java.lang.String r13 = ";"
            int r2 = kotlin.text.C24179b.m60565M(r3, r13, r10, r9, r2)
            if (r2 != r12) goto L_0x011b
            java.lang.String r2 = r3.substring(r10)
            java.lang.String r10 = "this as java.lang.String).substring(startIndex)"
            mf0.C24362h.m61210e(r2, r10)
            goto L_0x0124
        L_0x011b:
            java.lang.String r2 = r3.substring(r10, r2)
            java.lang.String r10 = "this as java.lang.String…ing(startIndex, endIndex)"
            mf0.C24362h.m61210e(r2, r10)
        L_0x0124:
            if (r2 == 0) goto L_0x0131
            java.lang.String r2 = android.net.Uri.decode(r2)
            if (r2 == 0) goto L_0x0131
            boolean r2 = m33444t0(r8, r2)
            goto L_0x0132
        L_0x0131:
            r2 = 0
        L_0x0132:
            if (r2 == 0) goto L_0x0148
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.DISPLAYED
            m33439V(r5, r2)
            java.lang.String r2 = r5.f31965a
            com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_CLICKED
            com.cubic.umo.ad.ext.types.UMOAdKitError r7 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            m33433I(r2, r3, r7)
            java.lang.String r2 = r5.f31965a
            r0.mo40172M(r2, r6, r9)
            goto L_0x016f
        L_0x0148:
            com.umo.ads.l.zzb r2 = new com.umo.ads.l.zzb
            android.content.Context r7 = r7.getContext()
            java.lang.String r8 = "adView.context"
            mf0.C24362h.m61210e(r7, r8)
            java.lang.String r8 = r5.f31965a
            com.umo.ads.u.zzk[] r10 = new com.umo.ads.p350u.zzk[r11]
            com.umo.ads.u.zzk r11 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_BROWSER_OPEN
            r10[r9] = r11
            com.umo.ads.u.zzk r9 = com.umo.ads.p350u.zzk.BROADCAST_ACTION_BROWSER_DISMISS
            r10[r6] = r9
            java.util.List r9 = p583jk.C17875h.m44281E(r10)
            r2.<init>(r7, r8, r9)
            r2.f30822g = r0
            java.lang.ref.WeakReference<com.cubic.umo.ad.playback.ui.activities.AKBrowserActivity> r2 = com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity.f7313G
            java.lang.String r2 = r5.f31965a
            com.cubic.umo.p045ad.playback.p046ui.activities.AKBrowserActivity.C2225b.m5861a(r2, r3, r6)
        L_0x016f:
            bf0.d r2 = bf0.C21050d.f52856a
        L_0x0171:
            if (r2 != 0) goto L_0x0188
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            boolean r3 = nc0.C12954d.m32800c(r20)
            if (r3 == 0) goto L_0x017f
            java.lang.String r4 = p584jl.C17885a.m44403H0(r20)
        L_0x017f:
            java.lang.String r1 = "Invalid ClickThrough Url"
            java.lang.String r1 = mf0.C24362h.m61216k(r4, r1)
            r2.mo6667d(r1)
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.mo40169J(java.lang.String, java.lang.String):void");
    }

    /* renamed from: J0 */
    public final void mo40170J0(String str) {
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        UMOAdKitBannerParams uMOAdKitBannerParams;
        C24362h.m61211f(str, "spotId");
        mo40192p0(true);
        C12912d q = C13233c.m33348q(str);
        String str2 = null;
        if (q == null || (uMOAdKitBannerParams = q.f31966b) == null) {
            uMOAdKitInlineBannerCreativeType = null;
        } else {
            uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams.mo11114i();
        }
        if (C13233c.m33339h(uMOAdKitInlineBannerCreativeType)) {
            if (q != null) {
                str2 = q.f31965a;
            }
            mo40194r0(str2, false);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* renamed from: L */
    public final void mo40171L(String str, List<? extends zzb> list, boolean z, zzd zzd) {
        C12909a aVar;
        int i;
        LinkedHashMap linkedHashMap;
        C12911c cVar;
        LinkedHashMap linkedHashMap2;
        C12911c cVar2;
        C13296a aVar2;
        List<? extends zzb> list2 = list;
        zzd zzd2 = zzd;
        ? r2 = this.f32994k;
        zzf zzf = null;
        String str2 = str;
        if (r2 == 0 || (aVar2 = (C13296a) r2.get(str)) == null) {
            aVar = null;
        } else {
            aVar = aVar2.f32999a;
        }
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            if (aVar != null) {
                zzf = aVar.f31947b;
            }
            if (zzf == null) {
                i = -1;
            } else {
                i = C13297b.f33003b[zzf.ordinal()];
            }
            if (i == 1) {
                int a = C13233c.m33332a(q);
                int i2 = C13233c.m33340i();
                C24362h.m61211f(list, "beaconTypes");
                C24362h.m61211f(zzd2, "vastError");
                if (aVar != null && (linkedHashMap = aVar.f31953h) != null) {
                    for (zzb zzb : list) {
                        if (!(zzb == zzb.NONE || (cVar = (C12911c) linkedHashMap.get(zzb)) == null)) {
                            cVar.mo39779a(aVar.f31946a, z, a, i2, zzd);
                        }
                    }
                }
            } else if (i == 2) {
                int a2 = C13233c.m33332a(q);
                int i3 = C13233c.m33340i();
                C24362h.m61211f(list, "beaconTypes");
                C24362h.m61211f(zzd2, "vastError");
                if (aVar != null && (linkedHashMap2 = aVar.f31953h) != null) {
                    for (zzb zzb2 : list) {
                        if (!(zzb2 == zzb.NONE || (cVar2 = (C12911c) linkedHashMap2.get(zzb2)) == null)) {
                            cVar2.mo39779a(aVar.f31946a, z, a2, i3, zzd);
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: yb0.d$a} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40172M(java.lang.String r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            j$.util.concurrent.ConcurrentHashMap<java.lang.String, yb0.d> r0 = wb0.C13233c.f32848g
            if (r0 != 0) goto L_0x0006
            goto L_0x00e8
        L_0x0006:
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e8
            java.lang.Object r1 = r0.next()
            yb0.d r1 = (yb0.C13295d) r1
            java.util.List<java.lang.String> r2 = r1.f32986c
            java.util.Iterator r2 = r2.iterator()
        L_0x0020:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000e
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            mc0.d r4 = wb0.C13233c.m33348q(r3)
            if (r4 != 0) goto L_0x0033
            goto L_0x0020
        L_0x0033:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r5 = r4.f31966b
            r6 = 0
            if (r5 != 0) goto L_0x003a
            r5 = r6
            goto L_0x003e
        L_0x003a:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r5 = r5.mo11114i()
        L_0x003e:
            boolean r5 = wb0.C13233c.m33339h(r5)
            if (r5 == 0) goto L_0x0020
            if (r13 == 0) goto L_0x004d
            boolean r5 = mf0.C24362h.m61206a(r3, r11)
            if (r5 == 0) goto L_0x004d
            goto L_0x0020
        L_0x004d:
            java.util.Map<java.lang.String, yb0.d$a> r5 = r1.f32994k
            if (r5 != 0) goto L_0x0052
            goto L_0x0059
        L_0x0052:
            java.lang.Object r3 = r5.get(r3)
            r6 = r3
            yb0.d$a r6 = (yb0.C13295d.C13296a) r6
        L_0x0059:
            if (r6 != 0) goto L_0x005c
            goto L_0x0020
        L_0x005c:
            java.lang.String r3 = "handleBannerVideoUserInteraction()"
            java.lang.String r5 = ""
            r7 = 0
            if (r12 == 0) goto L_0x00a5
            ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            boolean r9 = nc0.C12954d.m32800c(r11)
            if (r9 == 0) goto L_0x0074
            java.lang.String r9 = p584jl.C17885a.m44403H0(r11)
            goto L_0x0075
        L_0x0074:
            r9 = r5
        L_0x0075:
            r3.append(r9)
            java.lang.String r9 = ": Pausing VAST Ad"
            r3.append(r9)
            java.lang.String r4 = r4.f31965a
            boolean r9 = nc0.C12954d.m32800c(r4)
            if (r9 == 0) goto L_0x0089
            java.lang.String r5 = p584jl.C17885a.m44403H0(r4)
        L_0x0089:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r8.mo6666c(r3)
            com.umo.ads.o.zzc r3 = r6.f33000b
            if (r3 != 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r3.mo35813n(r7)
        L_0x009b:
            gc0.b r3 = r6.f33001c
            if (r3 != 0) goto L_0x00a0
            goto L_0x0020
        L_0x00a0:
            r3.mo39523c(r7)
            goto L_0x0020
        L_0x00a5:
            ch.qos.logback.classic.Logger r8 = ac0.C7557a.f23040a
            java.lang.StringBuilder r3 = ce0.C21100e.m49315J0(r3)
            boolean r9 = nc0.C12954d.m32800c(r11)
            if (r9 == 0) goto L_0x00b6
            java.lang.String r9 = p584jl.C17885a.m44403H0(r11)
            goto L_0x00b7
        L_0x00b6:
            r9 = r5
        L_0x00b7:
            r3.append(r9)
            java.lang.String r9 = ": Resuming VAST Ad"
            r3.append(r9)
            java.lang.String r4 = r4.f31965a
            boolean r9 = nc0.C12954d.m32800c(r4)
            if (r9 == 0) goto L_0x00cb
            java.lang.String r5 = p584jl.C17885a.m44403H0(r4)
        L_0x00cb:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r8.mo6666c(r3)
            com.umo.ads.o.zzc r3 = r6.f33000b
            if (r3 != 0) goto L_0x00da
            goto L_0x00dd
        L_0x00da:
            r3.mo35814o(r7, r7)
        L_0x00dd:
            gc0.b r3 = r6.f33001c
            if (r3 != 0) goto L_0x00e3
            goto L_0x0020
        L_0x00e3:
            r3.mo39524d(r7, r7)
            goto L_0x0020
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.mo40172M(java.lang.String, boolean, boolean):void");
    }

    /* renamed from: N */
    public final void mo40173N(C12912d dVar) {
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        if (dVar != null) {
            UMOAdKitBannerParams uMOAdKitBannerParams = dVar.f31966b;
            if (uMOAdKitBannerParams != null) {
                uMOAdKitBannerParams.mo11096A(0);
            }
            UMOAdKitBannerParams uMOAdKitBannerParams2 = dVar.f31966b;
            if (uMOAdKitBannerParams2 != null) {
                uMOAdKitBannerParams2.mo11131y(0);
            }
            Context context = C13233c.f32842a;
            UMOAdKitBannerParams uMOAdKitBannerParams3 = dVar.f31966b;
            if (uMOAdKitBannerParams3 == null) {
                uMOAdKitInlineBannerCreativeType = null;
            } else {
                uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams3.mo11114i();
            }
            if (!C13233c.m33339h(uMOAdKitInlineBannerCreativeType)) {
                m33443m0(dVar);
                mo40195s0(false);
                mo40188k0();
                return;
            }
            m33443m0(dVar);
            mo40179a0(dVar, true);
        }
    }

    /* renamed from: P */
    public final void mo40174P(C12912d dVar, UMOAdKitError uMOAdKitError) {
        boolean z;
        UMOAdKitBannerState uMOAdKitBannerState;
        UMOAdKitBannerState uMOAdKitBannerState2;
        FrameLayout placeholderLayout$ads_release;
        if (dVar != null) {
            boolean n = C13233c.m33345n(dVar);
            UMOAdKitBannerState uMOAdKitBannerState3 = dVar.f31968d;
            boolean z2 = false;
            if (uMOAdKitBannerState3 == UMOAdKitBannerState.PREFETCHING_IN_PROGRESS || uMOAdKitBannerState3 == UMOAdKitBannerState.AUTO_PREFETCHING_IN_PROGRESS) {
                z = true;
            } else {
                z = false;
            }
            if (n || z) {
                uMOAdKitBannerState = UMOAdKitBannerState.INITIALIZED;
            } else {
                uMOAdKitBannerState = UMOAdKitBannerState.PLACEHOLDER_DISPLAYED;
            }
            UMOAdKitBannerState uMOAdKitBannerState4 = UMOAdKitBannerState.AUTO_REFRESH_IN_PROGRESS;
            if (uMOAdKitBannerState3 == uMOAdKitBannerState4 || uMOAdKitBannerState3 == UMOAdKitBannerState.MANUAL_REFRESH_IN_PROGRESS) {
                uMOAdKitBannerState = dVar.f31969e;
            }
            UMOAdKitBannerView s = C13233c.m33350s(dVar.f31965a);
            if (dVar.f31968d == UMOAdKitBannerState.DISPLAY_IN_PROGRESS && ((uMOAdKitBannerState2 = dVar.f31969e) == uMOAdKitBannerState4 || uMOAdKitBannerState2 == UMOAdKitBannerState.MANUAL_REFRESH_IN_PROGRESS)) {
                if (!(s == null || (placeholderLayout$ads_release = s.getPlaceholderLayout$ads_release()) == null || placeholderLayout$ads_release.getVisibility() != 8)) {
                    z2 = true;
                }
                if (z2) {
                    uMOAdKitBannerState = UMOAdKitBannerState.DISPLAYED;
                }
            }
            if (uMOAdKitBannerState == UMOAdKitBannerState.PLACEHOLDER_DISPLAYED) {
                mo40173N(dVar);
                if (s != null) {
                    if (s.f7244d) {
                        C13233c.f32843b.post(new C0416i1(s, 14));
                    } else {
                        UMOAdKitBannerView.m5802h(s, true);
                    }
                }
            }
            m33439V(dVar, uMOAdKitBannerState);
            m33433I(dVar.f31965a, UMOAdKitBannerAdEvent.BANNER_ERROR, uMOAdKitError);
            if (n) {
                mo40167H0();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* renamed from: T */
    public final void mo40175T(boolean z) throws zza {
        boolean z2;
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        C13296a aVar;
        Boolean bool;
        C12724b bVar;
        zzc zzc;
        if (C13637c.f33647n) {
            Iterator it = this.f32986c.iterator();
            while (true) {
                z2 = true;
                UMOAdKitBannerState uMOAdKitBannerState = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                C12912d q = C13233c.m33348q(str);
                if (q != null) {
                    uMOAdKitBannerState = q.f31968d;
                }
                if (uMOAdKitBannerState == UMOAdKitBannerState.LOADING_IN_PROGRESS) {
                    m33434K(str, UMOAdKitError.PREVIOUS_AD_REQUEST_IN_PROGRESS.getDesc(), true);
                }
            }
            mo40187j0(true);
            Iterator it2 = this.f32986c.iterator();
            while (true) {
                boolean z3 = false;
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                C12912d q2 = C13233c.m33348q(str2);
                if (q2 != null) {
                    UMOAdKitBannerParams uMOAdKitBannerParams = q2.f31966b;
                    if (uMOAdKitBannerParams == null) {
                        uMOAdKitInlineBannerCreativeType = null;
                    } else {
                        uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams.mo11114i();
                    }
                    if (C13233c.m33339h(uMOAdKitInlineBannerCreativeType)) {
                        ? r5 = this.f32994k;
                        if (r5 == 0) {
                            aVar = null;
                        } else {
                            aVar = (C13296a) r5.get(str2);
                        }
                        if (aVar == null || (zzc = aVar.f33000b) == null) {
                            bool = null;
                        } else {
                            bool = Boolean.valueOf(zzc.mo35798F());
                        }
                        if (bool != null) {
                            z3 = bool.booleanValue();
                        } else if (!(aVar == null || (bVar = aVar.f33001c) == null)) {
                            z3 = bVar.f31428e;
                        }
                        if (z3) {
                            m33434K(str2, UMOAdKitError.PREVIOUS_AD_PLAY_IN_PROGRESS.getDesc(), true);
                        }
                    }
                }
            }
            C13301f fVar = C13301f.f33010a;
            Object systemService = C13233c.m33333b().getSystemService("connectivity");
            if (systemService != null) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    z2 = false;
                }
                if (z2) {
                    String desc = UMOAdKitError.NETWORK_ERROR.getDesc();
                    if (!z) {
                        C7557a.f23040a.mo6667d(desc);
                        return;
                    }
                    throw new zza(desc);
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        throw new zza(UMOAdKitError.AD_RENDERING_TEMPLATES_NOT_READY.getDesc());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: U */
    public final void mo40176U(boolean z, boolean z2) {
        String str;
        C21050d dVar;
        boolean z3;
        boolean z4;
        boolean z5;
        String str2;
        C21050d dVar2;
        String str3;
        boolean z6 = z;
        Iterator it = this.f32986c.iterator();
        int i = 0;
        while (it.hasNext()) {
            C12912d q = C13233c.m33348q((String) it.next());
            AKBannerResponse d = C13233c.m33335d(C13233c.m33342k(q), this.f32989f);
            if (z2) {
                zza.C12079a aVar = com.umo.ads.p342c.zza.zzb;
                if (d == null) {
                    str3 = null;
                } else {
                    str3 = d.f7434d;
                }
                aVar.getClass();
                if (zza.C12079a.m32035a(str3) == com.umo.ads.p342c.zza.VAST) {
                    i++;
                }
            }
            m33436Q(q, z6);
        }
        if (i != this.f32986c.size()) {
            C7557a.f23040a.mo6666c(C24362h.m61216k(Boolean.valueOf(z), "Handling Banner Ad Response, Is Prefetched Resp: "));
            C18787c cVar = this.f32988e;
            ? r4 = this.f32986c;
            List<AKBannerResponse> list = this.f32989f;
            C24362h.m61208c(list);
            cVar.getClass();
            C24362h.m61211f(r4, "inSpotIds");
            Iterator it2 = r4.iterator();
            while (it2.hasNext()) {
                String str4 = (String) it2.next();
                C12912d q2 = C13233c.m33348q(str4);
                if (q2 != null) {
                    String str5 = "";
                    if (C13233c.m33345n(q2) || C13233c.m33334c(str4) != null) {
                        UMOAdKitBannerState uMOAdKitBannerState = q2.f31968d;
                        if (!(uMOAdKitBannerState == UMOAdKitBannerState.INITIALIZED || uMOAdKitBannerState == UMOAdKitBannerState.PLACEHOLDER_DISPLAYED)) {
                            AKBannerResponse d2 = C13233c.m33335d(C13233c.m33342k(q2), list);
                            zza.C12079a aVar2 = com.umo.ads.p342c.zza.zzb;
                            if (d2 == null) {
                                str = null;
                            } else {
                                str = d2.f7434d;
                            }
                            aVar2.getClass();
                            com.umo.ads.p342c.zza a = zza.C12079a.m32035a(str);
                            if (!z2 || a != com.umo.ads.p342c.zza.VAST) {
                                if (d2 == null) {
                                    dVar = null;
                                } else {
                                    int ordinal = a.ordinal();
                                    if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                                        if (!C12954d.m32800c(d2.f7439i)) {
                                            Logger logger = C7557a.f23040a;
                                            if (C12954d.m32800c(str4)) {
                                                str2 = C17885a.m44403H0(str4);
                                            } else {
                                                str2 = str5;
                                            }
                                            logger.mo6667d(C24362h.m61216k(str2, "Invalid Banner Data received"));
                                            ((C13197a) cVar.f47816a).mo39578v(str4, UMOAdKitError.EMPTY_AD_CONTENT);
                                        } else {
                                            C13640f fVar = r8;
                                            AKBannerResponse aKBannerResponse = d2;
                                            C13640f fVar2 = new C13640f(str4, (C13197a) cVar.f47816a, (C13198b) cVar.f47817b, (C13199c) cVar.f47818c, (C13200d) cVar.f47819d, (C13201e) cVar.f47820e);
                                            int ordinal2 = zza.C12079a.m32035a(aKBannerResponse.f7434d).ordinal();
                                            if (ordinal2 == 1) {
                                                String str6 = aKBannerResponse.f7439i;
                                                String str7 = aKBannerResponse.f7438h;
                                                if (str7 == null) {
                                                    str7 = str5;
                                                }
                                                fVar.mo40525e(aKBannerResponse, str6, str7, com.umo.ads.p342c.zza.IMAGE);
                                            } else if (ordinal2 == 2) {
                                                fVar.mo40525e(aKBannerResponse, aKBannerResponse.f7439i, (String) null, com.umo.ads.p342c.zza.HTML);
                                            } else if (ordinal2 != 3) {
                                                fVar.mo40524d(UMOAdKitError.AD_TYPE_UNSUPPORTED);
                                            } else {
                                                String str8 = aKBannerResponse.f7439i;
                                                if (C12954d.m32800c(str8) && (URLUtil.isHttpUrl(str8) || URLUtil.isHttpsUrl(str8))) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (z3) {
                                                    C12912d q3 = C13233c.m33348q((String) fVar.f33655b);
                                                    if (q3 != null) {
                                                        C13366b bVar = new C13366b((String) fVar.f33655b, fVar);
                                                        int i2 = C13233c.m33340i();
                                                        int a2 = C13233c.m33332a(q3);
                                                        C24362h.m61211f(str8, "mraidUrl");
                                                        if (C12954d.m32800c(str8) && (URLUtil.isHttpUrl(str8) || URLUtil.isHttpsUrl(str8))) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        if (!z4) {
                                                            Logger logger2 = C7557a.f23040a;
                                                            StringBuilder J0 = C21100e.m49315J0("Invalid MRAID Ad Content Url");
                                                            J0.append(bVar.f33182c);
                                                            J0.append(": ");
                                                            J0.append(str8);
                                                            logger2.mo6667d(J0.toString());
                                                            z5 = false;
                                                        } else {
                                                            Logger logger3 = C7557a.f23040a;
                                                            StringBuilder J02 = C21100e.m49315J0("Fetching MRAID Ad Content");
                                                            J02.append(bVar.f33182c);
                                                            J02.append(": ");
                                                            J02.append(str8);
                                                            logger3.mo6672i(J02.toString());
                                                            new C7585a(a2, i2).mo23844a(str8, new C1426c(bVar, 11));
                                                            z5 = true;
                                                        }
                                                        if (!z5) {
                                                            fVar.mo40524d(UMOAdKitError.AD_PLAY_FAILED);
                                                        }
                                                    }
                                                } else {
                                                    fVar.mo40527h(Html.fromHtml(str8).toString());
                                                }
                                            }
                                            dVar = C21050d.f52856a;
                                        }
                                    } else if (ordinal != 4) {
                                        ((C13197a) cVar.f47816a).mo39578v(str4, UMOAdKitError.UNSUPPORTED_BANNER_TYPE);
                                    } else if (!z6) {
                                        cVar.mo51267b(str4, d2.f7439i);
                                    } else {
                                        C12909a l = ((C13197a) cVar.f47816a).mo39568l(str4);
                                        if (l == null) {
                                            dVar2 = null;
                                        } else {
                                            cVar.mo51268d(str4, l);
                                            dVar2 = C21050d.f52856a;
                                        }
                                        if (dVar2 == null) {
                                            cVar.mo51267b(str4, d2.f7439i);
                                        }
                                    }
                                    dVar = C21050d.f52856a;
                                }
                                if (dVar == null) {
                                    Logger logger4 = C7557a.f23040a;
                                    if (C12954d.m32800c(str4)) {
                                        str5 = C17885a.m44403H0(str4);
                                    }
                                    logger4.mo6667d(C24362h.m61216k(str5, "Error Rendering Banner; No banner Resp found"));
                                    ((C13197a) cVar.f47816a).mo39578v(str4, UMOAdKitError.NO_AD_AVAILABLE_FOR_SPOT);
                                }
                            }
                        }
                    } else {
                        Logger logger5 = C7557a.f23040a;
                        if (C12954d.m32800c(str4)) {
                            str5 = C17885a.m44403H0(str4);
                        }
                        logger5.mo6667d(C24362h.m61216k(str5, "Invalid Banner Ad Container View"));
                        ((C13197a) cVar.f47816a).mo39578v(str4, UMOAdKitError.INVALID_AD_VIEW);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v6, types: [mc0.a] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40177Y(mc0.C12912d r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r8.f32996m
            r1 = 0
            if (r0 != 0) goto L_0x0086
            yb0.a r0 = r8.f32995l
            if (r0 == 0) goto L_0x000f
            r8.mo40188k0()
        L_0x000f:
            java.util.List<com.cubic.umo.ad.types.AKBannerResponse> r0 = r8.f32989f
            if (r0 != 0) goto L_0x0015
            goto L_0x0074
        L_0x0015:
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r2 = r0.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r0.next()
            com.cubic.umo.ad.types.AKBannerResponse r2 = (com.cubic.umo.p045ad.types.AKBannerResponse) r2
            java.lang.String r4 = r2.f7434d
            com.umo.ads.c.zza$a r5 = com.umo.ads.p342c.zza.zzb
            java.lang.String r5 = "VAST"
            boolean r4 = mf0.C24362h.m61206a(r4, r5)
            if (r4 == 0) goto L_0x0051
            java.util.Map<java.lang.String, yb0.d$a> r4 = r8.f32994k
            if (r4 != 0) goto L_0x0037
            goto L_0x0051
        L_0x0037:
            java.util.List<java.lang.String> r5 = r8.f32986c
            java.lang.Object r5 = r5.get(r1)
            java.lang.Object r4 = r4.get(r5)
            yb0.d$a r4 = (yb0.C13295d.C13296a) r4
            if (r4 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            mc0.a r3 = r4.f32999a
        L_0x0048:
            if (r3 != 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            int r3 = r3.f31955j
            if (r3 <= 0) goto L_0x0051
            r1 = r3
            goto L_0x0074
        L_0x0051:
            int r2 = r2.f7437g
            if (r2 <= 0) goto L_0x0019
            r1 = r2
            goto L_0x0074
        L_0x0057:
            com.cubic.umo.ad.types.AKHostedConfig r0 = wb0.C13233c.f32845d
            if (r0 != 0) goto L_0x005c
            goto L_0x006b
        L_0x005c:
            com.cubic.umo.ad.types.AKBannerParams r0 = r0.getBannerParams()
            if (r0 != 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            int r0 = r0.getPrefetchedAdExpiryMinutes()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x006b:
            if (r3 != 0) goto L_0x0070
            r1 = 25
            goto L_0x0074
        L_0x0070:
            int r1 = r3.intValue()
        L_0x0074:
            if (r1 > 0) goto L_0x0077
            goto L_0x00b6
        L_0x0077:
            yb0.a r0 = new yb0.a
            java.util.List<java.lang.String> r2 = r8.f32986c
            java.lang.String r3 = "BANNER"
            r0.<init>(r2, r3, r1, r8)
            r8.f32995l = r0
            r0.mo40153a()
            goto L_0x00b6
        L_0x0086:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.util.List<java.lang.String> r2 = r8.f32986c
            r3 = 1
            if (r2 == 0) goto L_0x0095
            boolean r4 = r2.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0095
            r1 = 1
        L_0x0095:
            if (r1 == 0) goto L_0x00ab
            java.lang.StringBuilder r1 = p172m9.C5720b.m14044L(r2)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 62
            java.lang.String r3 = ", "
            java.lang.String r2 = kotlin.collections.C23825c.m58520q0(r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = com.google.android.play.core.appupdate.C14226d.m35344K0(r1, r2)
            goto L_0x00ad
        L_0x00ab:
            java.lang.String r1 = ""
        L_0x00ad:
            java.lang.String r2 = "SHOWAD_ATTEMPT_ON_PF_PROGRESS_BANNER: Not starting Prefetched Ad Expiry Timer, as showAd() has been called when Prefetch was in Progress"
            java.lang.String r1 = mf0.C24362h.m61216k(r1, r2)
            r0.mo6672i(r1)
        L_0x00b6:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r0 = r9.f31968d
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r1 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.AUTO_PREFETCHING_IN_PROGRESS
            if (r0 != r1) goto L_0x00bf
            com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_AUTO_FETCHED
            goto L_0x00c1
        L_0x00bf:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_FETCHED
        L_0x00c1:
            java.lang.String r1 = r9.f31965a
            com.cubic.umo.ad.ext.types.UMOAdKitError r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            m33433I(r1, r0, r2)
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.PREFETCHED
            m33439V(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.mo40177Y(mc0.d):void");
    }

    /* renamed from: Z */
    public final void mo40178Z(C12912d dVar, UMOAdKitError uMOAdKitError) {
        if (dVar != null) {
            UMOAdKitBannerState uMOAdKitBannerState = dVar.f31968d;
            if (uMOAdKitBannerState == UMOAdKitBannerState.AUTO_REFRESH_IN_PROGRESS || uMOAdKitBannerState == UMOAdKitBannerState.MANUAL_REFRESH_IN_PROGRESS) {
                C13233c.f32843b.post(new C7219n(15, this, dVar));
                UMOAdKitBannerView s = C13233c.m33350s(dVar.f31965a);
                if (s != null) {
                    UMOAdKitBannerView.m5802h(s, true);
                }
                m33439V(dVar, UMOAdKitBannerState.PLACEHOLDER_DISPLAYED);
                m33433I(dVar.f31965a, UMOAdKitBannerAdEvent.BANNER_ERROR, uMOAdKitError);
                return;
            }
            mo40174P(dVar, uMOAdKitError);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: yb0.d$a} */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40077a(java.lang.String r9, mc0.C12909a r10) {
        /*
            r8 = this;
            mc0.d r2 = wb0.C13233c.m33348q(r9)
            if (r2 != 0) goto L_0x0007
            return
        L_0x0007:
            com.umo.ads.u.zzf r0 = r10.f31947b
            com.umo.ads.u.zzf r1 = com.umo.ads.p350u.zzf.VPAID
            r3 = 0
            r4 = 0
            if (r0 != r1) goto L_0x003a
            boolean r0 = p389bl.C13637c.f33647n
            if (r0 != 0) goto L_0x0014
            goto L_0x0031
        L_0x0014:
            j$.util.concurrent.ConcurrentHashMap r0 = p389bl.C13637c.f33649p
            if (r0 != 0) goto L_0x001a
            r0 = r3
            goto L_0x0022
        L_0x001a:
            java.lang.String r1 = "VPAID_AD_TEMPLATE"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0022:
            boolean r0 = nc0.C12954d.m32800c(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 1
            goto L_0x0032
        L_0x002a:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "@@@@@@@@@@@@@@ Ad Rendering Template Missing (VPAID_AD_TEMPLATE) @@@@@@@@@@@@@@ "
            r0.mo6667d(r1)
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x003a
            com.cubic.umo.ad.ext.types.UMOAdKitError r10 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_TEMPLATE_MISSING
            r8.mo40078b(r9, r10)
            return
        L_0x003a:
            java.util.Map<java.lang.String, yb0.d$a> r0 = r8.f32994k
            if (r0 != 0) goto L_0x0045
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r8.f32994k = r0
        L_0x0045:
            java.util.Map<java.lang.String, yb0.d$a> r0 = r8.f32994k
            if (r0 != 0) goto L_0x004a
            goto L_0x0053
        L_0x004a:
            java.lang.String r1 = r2.f31965a
            java.lang.Object r0 = r0.get(r1)
            r3 = r0
            yb0.d$a r3 = (yb0.C13295d.C13296a) r3
        L_0x0053:
            if (r3 != 0) goto L_0x0069
            yb0.d$a r0 = new yb0.d$a
            r0.<init>(r8)
            r0.f32999a = r10
            java.util.Map<java.lang.String, yb0.d$a> r1 = r8.f32994k
            if (r1 != 0) goto L_0x0061
            goto L_0x0069
        L_0x0061:
            java.lang.String r3 = r2.f31965a
            java.lang.Object r0 = r1.put(r3, r0)
            yb0.d$a r0 = (yb0.C13295d.C13296a) r0
        L_0x0069:
            boolean r3 = r8.mo40199z0()
            if (r3 == 0) goto L_0x008f
            r8.mo40177Y(r2)
            boolean r0 = r2.f31975k
            if (r0 != 0) goto L_0x0077
            return
        L_0x0077:
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            boolean r1 = nc0.C12954d.m32800c(r9)
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = p584jl.C17885a.m44403H0(r9)
            goto L_0x0086
        L_0x0084:
            java.lang.String r1 = ""
        L_0x0086:
            java.lang.String r5 = "Attempting to display a VAST Banner Ad"
            java.lang.String r1 = mf0.C24362h.m61216k(r1, r5)
            r0.mo6666c(r1)
        L_0x008f:
            r2.f31975k = r4
            android.os.Handler r6 = wb0.C13233c.f32843b
            yb0.c r7 = new yb0.c
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.post(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.mo40077a(java.lang.String, mc0.a):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* renamed from: a0 */
    public final void mo40179a0(C12912d dVar, boolean z) {
        C13296a aVar;
        C12724b bVar;
        zzc zzc;
        if (dVar != null) {
            ? r0 = this.f32994k;
            if (r0 == 0) {
                aVar = null;
            } else {
                aVar = (C13296a) r0.get(dVar.f31965a);
            }
            if (!(aVar == null || (zzc = aVar.f33000b) == null)) {
                zzc.mo35819z(z);
            }
            if (!(aVar == null || (bVar = aVar.f33001c) == null)) {
                bVar.mo39526f(false);
            }
            Map<String, C13296a> map = this.f32994k;
            if (map != null) {
                C13296a remove = map.remove(dVar.f31965a);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: b */
    public final void mo40078b(String str, UMOAdKitError uMOAdKitError) {
        C21050d dVar;
        C24362h.m61211f(uMOAdKitError, "akError");
        C12912d q = C13233c.m33348q(str);
        boolean z0 = mo40199z0();
        this.f32996m = false;
        if (q == null) {
            dVar = null;
        } else {
            if (uMOAdKitError == UMOAdKitError.EMPTY_AD_CONTENT) {
                mo40178Z(q, uMOAdKitError);
            } else {
                mo40174P(q, uMOAdKitError);
            }
            dVar = C21050d.f52856a;
        }
        if (dVar == null) {
            Iterator it = this.f32986c.iterator();
            while (it.hasNext()) {
                C12912d q2 = C13233c.m33348q((String) it.next());
                if (uMOAdKitError == UMOAdKitError.EMPTY_AD_CONTENT) {
                    mo40178Z(q2, uMOAdKitError);
                } else {
                    mo40174P(q2, uMOAdKitError);
                }
            }
        }
        if (!z0 && !mo40160B0()) {
            mo40192p0(false);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: b0 */
    public final void mo40180b0(boolean z) throws com.umo.ads.p343d.zza {
        UMOAdKitBannerState uMOAdKitBannerState;
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        UMOAdKitBannerView s;
        boolean z2 = !z;
        mo40175T(z2);
        Iterator it = this.f32986c.iterator();
        while (true) {
            UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType2 = null;
            if (!it.hasNext()) {
                break;
            }
            C12912d q = C13233c.m33348q((String) it.next());
            if (q != null) {
                UMOAdKitBannerParams uMOAdKitBannerParams = q.f31966b;
                if (uMOAdKitBannerParams != null) {
                    uMOAdKitInlineBannerCreativeType2 = uMOAdKitBannerParams.mo11114i();
                }
                if (C13233c.m33339h(uMOAdKitInlineBannerCreativeType2)) {
                    mo40179a0(q, false);
                }
            }
        }
        mo40168I0();
        Iterator it2 = this.f32986c.iterator();
        while (it2.hasNext()) {
            m33445w0((String) it2.next());
        }
        if (z) {
            uMOAdKitBannerState = UMOAdKitBannerState.AUTO_REFRESH_IN_PROGRESS;
        } else {
            uMOAdKitBannerState = UMOAdKitBannerState.MANUAL_REFRESH_IN_PROGRESS;
        }
        Iterator it3 = this.f32986c.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            C12912d q2 = C13233c.m33348q(str);
            if (q2 != null) {
                UMOAdKitBannerState uMOAdKitBannerState2 = q2.f31968d;
                C24362h.m61211f(uMOAdKitBannerState2, "<set-?>");
                q2.f31969e = uMOAdKitBannerState2;
                m33441X(str);
                UMOAdKitBannerParams uMOAdKitBannerParams2 = q2.f31966b;
                if (uMOAdKitBannerParams2 == null) {
                    uMOAdKitInlineBannerCreativeType = null;
                } else {
                    uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams2.mo11114i();
                }
                if (C13233c.m33339h(uMOAdKitInlineBannerCreativeType) && (s = C13233c.m33350s(str)) != null) {
                    UMOAdKitBannerView.m5802h(s, true);
                }
            }
        }
        mo40165G(uMOAdKitBannerState, z2);
        mo40162D0();
        if (!z) {
            this.f32997n = -1;
            this.f32998o = -1;
            mo40195s0(false);
        }
        this.f32987d.mo40203c(this.f32986c, false);
    }

    /* renamed from: c */
    public final void mo39559c(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        String str2;
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("RICH_MEDIA_LISTENER: onAdError");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        J0.append(str2);
        J0.append(": ");
        J0.append(zzd);
        logger.mo6667d(J0.toString());
        mo40182d0(str, uMOAdKitError, zzd);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: c0 */
    public final void mo40181c0(boolean z) {
        if (!mo40160B0()) {
            Iterator it = this.f32986c.iterator();
            while (it.hasNext()) {
                C12912d q = C13233c.m33348q((String) it.next());
                if (q != null) {
                    UMOAdKitBannerView s = C13233c.m33350s(q.f31965a);
                    if (s != null) {
                        s.setPlaceholder$ads_release(s.getPlaceholderBannerType$ads_release());
                    }
                    if (z && q.f31968d == UMOAdKitBannerState.INITIALIZED) {
                        m33439V(q, UMOAdKitBannerState.PLACEHOLDER_DISPLAYED);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: d */
    public final void mo39560d(String str) {
        C24362h.m61211f(str, "spotId");
        Iterator it = this.f32986c.iterator();
        while (it.hasNext()) {
            C12912d q = C13233c.m33348q((String) it.next());
            if (q != null && C24362h.m61206a(q.f31965a, str)) {
                m33443m0(q);
            }
        }
    }

    /* renamed from: d0 */
    public final void mo40182d0(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            mo40171L(str, C17875h.m44280D(zzb.ERROR), true, zzd);
            UMOAdKitBannerState uMOAdKitBannerState = UMOAdKitBannerState.INITIALIZED;
            C12912d q2 = C13233c.m33348q(str);
            if (q2 != null) {
                m33439V(q2, uMOAdKitBannerState);
            }
            mo40174P(q, uMOAdKitError);
        }
    }

    /* renamed from: e */
    public final void mo40079e(String str, C12909a aVar) {
    }

    /* renamed from: e0 */
    public final void mo40183e0(boolean z) throws com.umo.ads.p343d.zza {
        if (mo40161C0()) {
            throw new com.umo.ads.p343d.zza(UMOAdKitError.API_NOT_ALLOWED_FOR_MULTISPOT_USECASE.getDesc());
        }
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdVideoStart"));
        m33438S(this, str, C17875h.m44281E(zzb.START, zzb.CREATIVE_VIEW), 8);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: f0 */
    public final boolean mo40184f0() {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f32986c.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (C13233c.m33348q(str2) != null) {
                UMOAdKitBannerView s = C13233c.m33350s(str2);
                if (s != null && !s.mo11048c()) {
                    z = true;
                }
                if (z) {
                    Logger logger = C7557a.f23040a;
                    if (C12954d.m32800c(str2)) {
                        str = C17885a.m44403H0(str2);
                    } else {
                        str = "";
                    }
                    logger.mo6672i(C24362h.m61216k(str, "BANNER_VISIBILITY: Banner is NOT VISIBLE"));
                    arrayList.add(str2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                UMOAdKitBannerView s2 = C13233c.m33350s((String) it2.next());
                if (s2 != null && s2.getViewTreeObserver().isAlive()) {
                    s2.getViewTreeObserver().removeOnScrollChangedListener(s2);
                    s2.getViewTreeObserver().addOnScrollChangedListener(s2);
                }
            }
        }
        if (arrayList.size() == this.f32986c.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo39563g(String str) {
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* renamed from: g0 */
    public final void mo40185g0() {
        String str;
        ArrayList v0 = mo40197v0();
        String str2 = "";
        if (!v0.isEmpty()) {
            Logger logger = C7557a.f23040a;
            if (!v0.isEmpty()) {
                str2 = C14226d.m35344K0(C13555b.m33972k(" (SpotId(s): ["), C23825c.m58520q0(v0, ", ", (String) null, (String) null, (C24236l) null, 62));
            }
            logger.mo6672i(C24362h.m61216k(str2, "AUTO_REFRESH: DISABLED"));
            return;
        }
        boolean z = false;
        if (mo40184f0()) {
            Logger logger2 = C7557a.f23040a;
            ? r4 = this.f32986c;
            if (r4 != 0 && (!r4.isEmpty())) {
                z = true;
            }
            if (z) {
                str2 = C14226d.m35344K0(C5720b.m14044L(r4), C23825c.m58520q0(r4, ", ", (String) null, (String) null, (C24236l) null, 62));
            }
            logger2.mo6672i(C24362h.m61216k(str2, "AUTO_REFRESH|BANNER_VISIBILITY: Deferring Auto-Refresh as NONE of the related Banners in the screen are VISIBLE"));
            this.f32992i = true;
            return;
        }
        if (this.f32992i) {
            str = " (DEFERRED AUTO-REFRESH)";
        } else {
            str = str2;
        }
        Logger logger3 = C7557a.f23040a;
        StringBuilder t = C0016g.m36t("AUTO_REFRESH: Auto-Refreshing Banners", str);
        ? r5 = this.f32986c;
        if (r5 != 0 && (!r5.isEmpty())) {
            z = true;
        }
        if (z) {
            str2 = C14226d.m35344K0(C5720b.m14044L(r5), C23825c.m58520q0(r5, ", ", (String) null, (String) null, (C24236l) null, 62));
        }
        t.append(str2);
        logger3.mo6672i(t.toString());
        mo40180b0(true);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* renamed from: h */
    public final void mo39564h(String str, zzc zzc) {
        C13296a aVar;
        C24362h.m61211f(str, "spotId");
        ? r0 = this.f32994k;
        if (r0 == 0) {
            aVar = null;
        } else {
            aVar = (C13296a) r0.get(str);
        }
        if (aVar != null) {
            aVar.f33000b = zzc;
        }
    }

    /* renamed from: h0 */
    public final void mo40186h0(String str, boolean z) {
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            UMOAdKitBannerState uMOAdKitBannerState = UMOAdKitBannerState.DISPLAYED;
            C12912d q2 = C13233c.m33348q(str);
            if (q2 != null) {
                m33439V(q2, uMOAdKitBannerState);
            }
            if (!z) {
                q.f31971g = true;
                q.f31972h = false;
                if (C13233c.m33345n(q)) {
                    m33440W(str);
                } else {
                    UMOAdKitBannerView s = C13233c.m33350s(str);
                    if (s != null) {
                        s.mo11047b();
                    }
                }
            }
            UMOAdKitBannerParams uMOAdKitBannerParams = q.f31966b;
            if (uMOAdKitBannerParams == null) {
                uMOAdKitInlineBannerCreativeType = null;
            } else {
                uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams.mo11114i();
            }
            if (!C13233c.m33339h(uMOAdKitInlineBannerCreativeType)) {
                mo40192p0(false);
            }
        }
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
        StringBuilder J0 = C21100e.m49315J0("RICH_MEDIA_LISTENER: onAdVolumeChanged");
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

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: j0 */
    public final boolean mo40187j0(boolean z) throws com.umo.ads.p343d.zza {
        UMOAdKitBannerState uMOAdKitBannerState;
        Iterator it = this.f32986c.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C12912d q = C13233c.m33348q(str);
            if (q == null) {
                uMOAdKitBannerState = null;
            } else {
                uMOAdKitBannerState = q.f31968d;
            }
            if (uMOAdKitBannerState == UMOAdKitBannerState.PREFETCHING_IN_PROGRESS) {
                m33434K(str, UMOAdKitError.PREVIOUS_AD_PREFETCH_REQUEST_IN_PROGRESS.getDesc(), z);
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void mo39567k(String str) {
        C24362h.m61211f(str, "spotId");
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            m33439V(q, UMOAdKitBannerState.DISPLAYED);
            m33433I(str, UMOAdKitBannerAdEvent.BANNER_COLLAPSED, UMOAdKitError.NONE);
        }
    }

    /* renamed from: k0 */
    public final void mo40188k0() {
        C13290a aVar = this.f32995l;
        if (aVar != null) {
            aVar.mo40154b(false);
        }
        this.f32995l = null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* renamed from: l */
    public final C12909a mo39568l(String str) {
        C13296a aVar;
        C24362h.m61211f(str, "spotId");
        ? r0 = this.f32994k;
        if (r0 == 0 || (aVar = (C13296a) r0.get(str)) == null) {
            return null;
        }
        return aVar.f32999a;
    }

    /* renamed from: l0 */
    public final void mo40189l0(String str, boolean z) {
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            if (!z) {
                UMOAdKitBannerView s = C13233c.m33350s(q.f31965a);
                if (s != null) {
                    C13233c.f32843b.post(new C0510d(6, s, q, this));
                }
                m33442i0(q);
            } else {
                m33433I(str, UMOAdKitBannerAdEvent.BANNER_REPLAYING, UMOAdKitError.NONE);
            }
            mo40186h0(str, z);
        }
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdVideoFirstQuartile"));
        m33438S(this, str, C17875h.m44280D(zzb.FIRST_QUARTILE), 8);
    }

    /* renamed from: n */
    public final void mo39570n(ViewGroup viewGroup, String str) {
        C24362h.m61211f(str, "spotId");
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            UMOAdKitBannerView s = C13233c.m33350s(q.f31965a);
            if (s != null) {
                C13233c.f32843b.post(new C0510d(6, s, q, this));
            }
            m33437R(this, str, zzb.IMPRESSION, 12);
            m33442i0(q);
            mo40186h0(str, false);
        }
    }

    /* renamed from: n0 */
    public final void mo40190n0(String str) {
        Lifecycle j;
        C24362h.m61211f(str, "spotId");
        C12912d q = C13233c.m33348q(str);
        if (q != null && q.f31978n == null && (j = C13233c.m33341j(str)) != null) {
            AKAdViewLifecycleObserver aKAdViewLifecycleObserver = new AKAdViewLifecycleObserver(q.f31965a);
            q.f31978n = aKAdViewLifecycleObserver;
            j.mo4224a(aKAdViewLifecycleObserver);
            C7557a.f23040a.mo6672i(C24362h.m61216k(aKAdViewLifecycleObserver.f7312c, "LIFECYCLE_EVENT: Lifecycle Observer ADDED"));
        }
    }

    /* renamed from: o */
    public final void mo39571o(String str) {
        mo40172M(str, false, true);
    }

    /* renamed from: o0 */
    public final void mo40191o0(String str, boolean z) {
        String str2;
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            StringBuilder sb = new StringBuilder();
            if (C12954d.m32800c(str)) {
                str2 = C17885a.m44403H0(str);
            } else {
                str2 = "";
            }
            sb.append(str2);
            sb.append(": IsUserEngagement: ");
            sb.append(z);
            sb.append('.');
            String sb2 = sb.toString();
            if (q.f31972h) {
                C7557a.f23040a.mo6672i(C24362h.m61216k(sb2, "BANNER_VIEWABILITY: Viewability measured already"));
                return;
            }
            C7557a.f23040a.mo6672i(C24362h.m61216k(sb2, "BANNER_VIEWABILITY: Viewability Criteria met"));
            C13308i iVar = q.f31974j;
            if (iVar != null) {
                iVar.mo40216a(z);
            }
            q.f31972h = true;
            UMOAdKitBannerParams uMOAdKitBannerParams = q.f31966b;
            if (uMOAdKitBannerParams == null) {
                uMOAdKitInlineBannerCreativeType = null;
            } else {
                uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams.mo11114i();
            }
            if (C13233c.m33339h(uMOAdKitInlineBannerCreativeType)) {
                m33438S(this, str, C17875h.m44280D(zzb.VIEWABILITY), 12);
            } else {
                m33437R(this, str, zzb.VIEWABILITY, 12);
            }
            q.f31974j = null;
        }
    }

    /* renamed from: p */
    public final void mo39572p(String str) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "onVastAdLoaded"));
        UMOAdKitBannerView s = C13233c.m33350s(str);
        if (s != null) {
            UMOAdKitBannerView.m5802h(s, false);
        }
        UMOAdKitBannerState uMOAdKitBannerState = UMOAdKitBannerState.DISPLAYED;
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            m33439V(q, uMOAdKitBannerState);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: p0 */
    public final void mo40192p0(boolean z) {
        long j;
        String str;
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        String a = C12954d.m32798a(this.f32986c);
        if (this.f32991h != null) {
            C7557a.f23040a.mo6666c(C24362h.m61216k(a, "AUTO_REFRESH: Timer already running"));
            return;
        }
        ArrayList v0 = mo40197v0();
        if (!v0.isEmpty()) {
            C7557a.f23040a.mo6672i(C24362h.m61216k(C12954d.m32798a(v0), "AUTO_REFRESH: NOT ENABLED for Banner(s)"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f32986c.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C12912d q = C13233c.m33348q(str2);
            if (q != null && C13233c.m33345n(q)) {
                arrayList.add(str2);
            }
        }
        String str3 = "";
        if (!arrayList.isEmpty()) {
            Logger logger = C7557a.f23040a;
            if (!arrayList.isEmpty()) {
                str3 = C14226d.m35344K0(C5720b.m14044L(arrayList), C23825c.m58520q0(arrayList, ", ", (String) null, (String) null, (C24236l) null, 62));
            }
            logger.mo6672i(C24362h.m61216k(str3, "AUTO_REFRESH: NOT SUPPORTED for INTERSTITIAL Banner(s)"));
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = this.f32986c.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            C12912d q2 = C13233c.m33348q(str4);
            if (q2 != null) {
                UMOAdKitBannerParams uMOAdKitBannerParams = q2.f31966b;
                if (uMOAdKitBannerParams == null) {
                    uMOAdKitInlineBannerCreativeType = null;
                } else {
                    uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams.mo11114i();
                }
                if (C13233c.m33339h(uMOAdKitInlineBannerCreativeType)) {
                    arrayList2.add(str4);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            Logger logger2 = C7557a.f23040a;
            if (!arrayList2.isEmpty()) {
                str3 = C14226d.m35344K0(C5720b.m14044L(arrayList2), C23825c.m58520q0(arrayList2, ", ", (String) null, (String) null, (C24236l) null, 62));
            }
            logger2.mo6672i(C24362h.m61216k(str3, "AUTO_REFRESH: NOT SUPPORTED for VIDEO Banner(s)"));
            return;
        }
        if (z) {
            j = this.f32998o;
        } else {
            j = mo40198x0();
        }
        if (j <= 0) {
            C7557a.f23040a.mo6667d(C24362h.m61216k(a, "AUTO_REFRESH: Invalid Auto-Refresh Interval"));
            return;
        }
        Context context = C13233c.f32842a;
        List<String> list = this.f32986c;
        C24362h.m61211f(list, "inSpotIds");
        this.f32991h = new Timer(C24362h.m61216k(C23825c.m58520q0(list, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, (String) null, (String) null, (C24236l) null, 62), "AKBannerAutoRefreshTimer"), false);
        if (z) {
            str = "Restarting";
        } else {
            str = "Starting";
        }
        Logger logger3 = C7557a.f23040a;
        StringBuilder h = C16759e.m42352h("AUTO_REFRESH: ", str, " Timer", a, ": [");
        h.append(j);
        h.append(" milliseconds]...");
        logger3.mo6672i(h.toString());
        Timer timer = this.f32991h;
        if (timer != null) {
            timer.schedule(new C13298c(a, this), j);
        }
        if (!z) {
            this.f32998o = -1;
        }
        this.f32997n = System.currentTimeMillis();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* renamed from: q */
    public final void mo39573q(String str, C12724b bVar) {
        String str2;
        C13296a aVar;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: setVPaidPlayer"));
        ? r0 = this.f32994k;
        if (r0 == 0) {
            aVar = null;
        } else {
            aVar = (C13296a) r0.get(str);
        }
        if (aVar != null) {
            aVar.f33001c = bVar;
        }
    }

    /* renamed from: q0 */
    public final void mo40193q0(String str) {
        C7557a.f23040a.mo6666c(C0017h.m56M("********** ", "showBanner", "(): Prefetched Banner Playlist exists but not for the requested Spot(s). So, previous Prefetched ad would be cleaned-up", str, " **********"));
        mo40188k0();
        mo40165G(UMOAdKitBannerState.INITIALIZED, false);
    }

    /* renamed from: r */
    public final void mo39574r(String str) {
        mo40172M(str, true, true);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.String, yb0.d$a>, java.util.LinkedHashMap] */
    /* renamed from: r0 */
    public final void mo40194r0(String str, boolean z) {
        C13296a aVar;
        String str2;
        ? r0 = this.f32994k;
        String str3 = "";
        if (r0 == 0) {
            aVar = null;
        } else {
            if (str == null) {
                str2 = str3;
            } else {
                str2 = str;
            }
            aVar = (C13296a) r0.get(str2);
        }
        if (aVar != null) {
            if (C12954d.m32800c(str)) {
                str3 = C17885a.m44403H0(str);
            }
            if (z) {
                zzc zzc = aVar.f33000b;
                if (zzc != null) {
                    C7557a.f23040a.mo6672i(C24362h.m61216k(str3, "Pausing VAST Banner Video"));
                    zzc.mo35813n(false);
                }
                C12724b bVar = aVar.f33001c;
                if (bVar != null) {
                    C7557a.f23040a.mo6672i(C24362h.m61216k(str3, "Pausing VAST VPAID Banner Video"));
                    bVar.mo39523c(false);
                    return;
                }
                return;
            }
            zzc zzc2 = aVar.f33000b;
            if (zzc2 != null) {
                C7557a.f23040a.mo6672i(C24362h.m61216k(str3, "Resuming VAST Banner Video"));
                zzc2.mo35814o(false, false);
            }
            C12724b bVar2 = aVar.f33001c;
            if (bVar2 != null) {
                C7557a.f23040a.mo6672i(C24362h.m61216k(str3, "Resuming VAST VPAID Banner Video"));
                bVar2.mo39524d(false, false);
            }
        }
    }

    /* renamed from: s */
    public final void mo39575s(String str, Rect rect) {
        String str2;
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("RICH_MEDIA_LISTENER: onResized");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        J0.append(str2);
        J0.append(": Rect: ");
        J0.append(rect);
        logger.mo6666c(J0.toString());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* renamed from: s0 */
    public final void mo40195s0(boolean z) {
        String str;
        if (this.f32991h != null) {
            if (!z) {
                Logger logger = C7557a.f23040a;
                StringBuilder J0 = C21100e.m49315J0("AUTO_REFRESH: Stopping Timer");
                ? r1 = this.f32986c;
                boolean z2 = true;
                if (r1 == 0 || !(!r1.isEmpty())) {
                    z2 = false;
                }
                if (z2) {
                    str = C14226d.m35344K0(C5720b.m14044L(r1), C23825c.m58520q0(r1, ", ", (String) null, (String) null, (C24236l) null, 62));
                } else {
                    str = "";
                }
                J0.append(str);
                J0.append("...");
                logger.mo6672i(J0.toString());
            }
            Timer timer = this.f32991h;
            if (timer != null) {
                timer.cancel();
            }
            this.f32991h = null;
        }
    }

    /* renamed from: t */
    public final void mo39576t(String str, zzd zzd) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzd, "vastError");
        mo40182d0(str, UMOAdKitError.AD_PLAY_TIMED_OUT, zzd);
    }

    /* renamed from: u */
    public final void mo39577u(String str) {
        C24362h.m61211f(str, "spotId");
        m33433I(str, UMOAdKitBannerAdEvent.BANNER_CLICKED, UMOAdKitError.NONE);
        mo40172M(str, true, false);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r13v4, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r13v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r14v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Object, java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r13v18, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* renamed from: u0 */
    public final void mo40196u0(String str, boolean z) throws com.umo.ads.p343d.zza {
        boolean z2;
        String str2;
        boolean z3;
        C21050d dVar;
        Integer num;
        String str3;
        String str4;
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType;
        UMOAdKitInlineBannerCreativeType uMOAdKitInlineBannerCreativeType2;
        UMOAdKitInlineVideoPlayMode uMOAdKitInlineVideoPlayMode;
        String str5;
        String str6;
        int i;
        Integer num2;
        boolean z4;
        boolean z5;
        String str7;
        boolean z6;
        String str8;
        String str9;
        String str10;
        ArrayList arrayList;
        boolean z7;
        boolean z8;
        UMOAdKitBannerParams uMOAdKitBannerParams;
        String d;
        boolean z9;
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            boolean z11 = false;
            mo40183e0(false);
            String str11 = "";
            if (z) {
                UMOAdKitBannerView s = C13233c.m33350s(q.f31965a);
                if (q.f31973i != null) {
                    Logger logger = C7557a.f23040a;
                    if (C12954d.m32800c(str)) {
                        str11 = C17885a.m44403H0(str);
                    }
                    logger.mo6666c(C24362h.m61216k(str11, "BANNER_RECYCLER: Displaying previous AdView in Recycled UMOAdKitBannerView"));
                    C13233c.f32843b.post(new C7112w(3, s, this, q));
                    return;
                }
                C13233c.f32843b.post(new C7073m(s, 13));
                if (q.f31968d == UMOAdKitBannerState.PLACEHOLDER_DISPLAYED) {
                    return;
                }
            } else if (q.f31973i != null) {
                C7557a.f23040a.mo6667d("Banner Show API called when previous AdView is in display.");
                throw new com.umo.ads.p343d.zza(UMOAdKitError.INVALID_BANNER_OPERATION.getDesc());
            }
            if (mo40187j0(false)) {
                Logger logger2 = C7557a.f23040a;
                ? r3 = this.f32986c;
                if (r3 != 0 && (!r3.isEmpty())) {
                    z11 = true;
                }
                if (z11) {
                    str11 = C14226d.m35344K0(C5720b.m14044L(r3), C23825c.m58520q0(r3, ", ", (String) null, (String) null, (C24236l) null, 62));
                }
                logger2.mo6672i(C24362h.m61216k(str11, "SHOWAD_ATTEMPT_ON_PF_PROGRESS_BANNER: ShowAd() attempted while Prefetching is in progress"));
                this.f32996m = true;
                return;
            }
            ? r5 = this.f32986c;
            if (r5 == 0 || !(!r5.isEmpty())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                str2 = C14226d.m35344K0(C5720b.m14044L(r5), C23825c.m58520q0(r5, ", ", (String) null, (String) null, (C24236l) null, 62));
            } else {
                str2 = str11;
            }
            Iterator it = this.f32986c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                C12912d q2 = C13233c.m33348q((String) it.next());
                if (q2 != null) {
                    List<AKBannerResponse> list = this.f32989f;
                    if (list == null || !(!list.isEmpty())) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if ((z9 || this.f32993j) && q2.f31968d == UMOAdKitBannerState.PREFETCHED) {
                        z3 = true;
                        break;
                    }
                }
            }
            if (z3) {
                Context context = C13233c.f32842a;
                ? r0 = this.f32986c;
                C24362h.m61211f(r0, "inSpotIds");
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = r0.iterator();
                while (it2.hasNext()) {
                    C12912d q3 = C13233c.m33348q((String) it2.next());
                    if (!(q3 == null || (uMOAdKitBannerParams = q3.f31966b) == null || (d = uMOAdKitBannerParams.mo11107d()) == null || !C12954d.m32800c(d))) {
                        arrayList2.add(d);
                    }
                }
                List<AKBannerResponse> list2 = this.f32989f;
                if (list2 == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (AKBannerResponse next : list2) {
                        if (C12954d.m32800c(next.f7432b)) {
                            arrayList.add(next.f7432b);
                        }
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z7 = false;
                        break;
                    }
                    String str12 = (String) it3.next();
                    if (arrayList != null && arrayList.contains(str12)) {
                        z8 = true;
                        continue;
                    } else {
                        z8 = false;
                        continue;
                    }
                    if (z8) {
                        z7 = true;
                        break;
                    }
                }
                if (z7) {
                    C7557a.f23040a.mo6672i("********** showBanner(): Prefetched Banner Playlist exists" + str2 + " **********");
                    mo40188k0();
                    mo40162D0();
                    mo40181c0(true);
                    Iterator it4 = this.f32986c.iterator();
                    while (it4.hasNext()) {
                        mo40190n0((String) it4.next());
                    }
                    mo40176U(true, false);
                    return;
                }
                mo40193q0(str2);
            } else {
                C7557a.f23040a.mo6672i("********** showBanner(): No Prefetched Banner Playlist exists" + str2 + " **********");
                if (this.f32993j) {
                    mo40193q0(str2);
                }
            }
            mo40168I0();
            Iterator it5 = this.f32986c.iterator();
            while (it5.hasNext()) {
                C12912d q4 = C13233c.m33348q((String) it5.next());
                if (q4 != null) {
                    UMOAdKitBannerParams uMOAdKitBannerParams2 = q4.f31966b;
                    if (uMOAdKitBannerParams2 == null) {
                        dVar = null;
                    } else {
                        AKBannerParams l = C13233c.m33343l();
                        String c = uMOAdKitBannerParams2.mo11106c();
                        if (C12954d.m32800c(c) && (URLUtil.isHttpUrl(c) || URLUtil.isHttpsUrl(c))) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            if (l == null) {
                                str7 = null;
                            } else {
                                str7 = l.getServerUrl();
                            }
                            if (C12954d.m32800c(str7) && (URLUtil.isHttpUrl(str7) || URLUtil.isHttpsUrl(str7))) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                Logger logger3 = C7557a.f23040a;
                                String d2 = uMOAdKitBannerParams2.mo11107d();
                                if (C12954d.m32800c(d2)) {
                                    str8 = C17885a.m44403H0(d2);
                                } else {
                                    str8 = str11;
                                }
                                logger3.mo6672i(C24362h.m61216k(str8, "BANNER_CONFIG_PARAMS: Defaulting Banner Ad Server Url & Playlist to those in Hosted Config JSON"));
                                if (l == null) {
                                    str9 = null;
                                } else {
                                    str9 = l.getServerUrl();
                                }
                                uMOAdKitBannerParams2.mo11128v(str9);
                                if (l == null) {
                                    str10 = null;
                                } else {
                                    str10 = l.getBannerPlaylist();
                                }
                                uMOAdKitBannerParams2.mo11099D(str10);
                            } else {
                                throw new com.umo.ads.p343d.zza(UMOAdKitError.INVALID_URL.getDesc());
                            }
                        }
                        m33445w0(q4.f31965a);
                        if (uMOAdKitBannerParams2.mo11114i() == UMOAdKitInlineBannerCreativeType.VIDEO) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (uMOAdKitBannerParams2.mo11118m() == zzi.INLINE) {
                            if (!z5) {
                                int i2 = C13297b.f33002a[uMOAdKitBannerParams2.mo11122q().ordinal()];
                                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                                    throw new com.umo.ads.p343d.zza(UMOAdKitError.INVALID_INLINE_BANNER_TYPE.getDesc());
                                }
                            }
                        } else if (uMOAdKitBannerParams2.mo11118m() == zzi.INTERSTITIAL) {
                            if (!z5) {
                                int i3 = C13297b.f33002a[uMOAdKitBannerParams2.mo11122q().ordinal()];
                                if (!(i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5)) {
                                    mo40167H0();
                                    throw new com.umo.ads.p343d.zza(UMOAdKitError.INVALID_INTERSTITIAL_BANNER_TYPE.getDesc());
                                }
                            } else {
                                throw new com.umo.ads.p343d.zza(UMOAdKitError.INTERSTITIAL_VIDEO_NOT_SUPPORTED_IN_BANNER_SLOT.getDesc());
                            }
                        }
                        if (uMOAdKitBannerParams2.mo11122q() == UMOAdKitBannerType.CUSTOM_GWxGH || z5) {
                            if (uMOAdKitBannerParams2.mo11123r() <= 0 && uMOAdKitBannerParams2.mo11123r() != -2) {
                                throw new com.umo.ads.p343d.zza(UMOAdKitError.INVALID_BANNER_WIDTH.getDesc());
                            } else if (uMOAdKitBannerParams2.mo11116k() <= 0 && uMOAdKitBannerParams2.mo11116k() != -2) {
                                throw new com.umo.ads.p343d.zza(UMOAdKitError.INVALID_BANNER_HEIGHT.getDesc());
                            }
                        }
                        dVar = C21050d.f52856a;
                    }
                    if (dVar != null) {
                        Pair<Integer, Integer> pair = C13232b.f32840a;
                        int intValue = pair.mo59068c().intValue();
                        int intValue2 = pair.mo59069d().intValue();
                        UMOAdKitBannerParams uMOAdKitBannerParams3 = q4.f31966b;
                        if (uMOAdKitBannerParams3 == null) {
                            num = null;
                        } else {
                            num = Integer.valueOf(uMOAdKitBannerParams3.mo11121p());
                        }
                        C24362h.m61208c(num);
                        int intValue3 = num.intValue();
                        String str13 = q4.f31965a;
                        if (C12954d.m32800c(str13)) {
                            str3 = C17885a.m44403H0(str13);
                        } else {
                            str3 = str11;
                        }
                        if (intValue3 < intValue || intValue3 > intValue2) {
                            AKBannerParams l2 = C13233c.m33343l();
                            if (l2 == null) {
                                num2 = null;
                            } else {
                                num2 = Integer.valueOf(l2.getRequestTimeoutSeconds());
                            }
                            if (num2 == null || num2.intValue() < intValue || num2.intValue() > intValue2) {
                                C7557a.f23040a.mo6672i("BANNER_CONFIG_PARAMS: Using Default Banner Timeout interval: [" + intValue + " seconds]" + str3);
                                UMOAdKitBannerParams uMOAdKitBannerParams4 = q4.f31966b;
                                if (uMOAdKitBannerParams4 != null) {
                                    uMOAdKitBannerParams4.mo11101F(intValue);
                                }
                            } else {
                                C7557a.f23040a.mo6672i("BANNER_CONFIG_PARAMS: Using Banner Timeout interval received from Config Params: [" + num2 + " seconds]" + str3);
                                UMOAdKitBannerParams uMOAdKitBannerParams5 = q4.f31966b;
                                if (uMOAdKitBannerParams5 != null) {
                                    uMOAdKitBannerParams5.mo11101F(num2.intValue());
                                }
                            }
                        } else {
                            C7557a.f23040a.mo6672i("BANNER_CONFIG_PARAMS: Using Banner Timeout interval received from Application: [" + intValue3 + " seconds]" + str3);
                        }
                        boolean C0 = mo40161C0();
                        StringBuilder sb = new StringBuilder();
                        sb.append(" [isMultiSpotOprn: ");
                        sb.append(C0);
                        sb.append(']');
                        String str14 = q4.f31965a;
                        if (C12954d.m32800c(str14)) {
                            str4 = C17885a.m44403H0(str14);
                        } else {
                            str4 = str11;
                        }
                        sb.append(str4);
                        String sb2 = sb.toString();
                        UMOAdKitBannerParams uMOAdKitBannerParams6 = q4.f31966b;
                        if (uMOAdKitBannerParams6 != null) {
                            if (uMOAdKitBannerParams6.mo11111g() == null) {
                                AKBannerParams l3 = C13233c.m33343l();
                                if (l3 == null) {
                                    i = null;
                                } else {
                                    Logger logger4 = C7557a.f23040a;
                                    StringBuilder J0 = C21100e.m49315J0("BANNER_CONFIG_PARAMS: AUTO_REFRESH: Using Banner Auto-refresh interval received from Config Params: [");
                                    J0.append(l3.getAutoRefreshIntervalSeconds());
                                    J0.append(" seconds]");
                                    J0.append(sb2);
                                    logger4.mo6672i(J0.toString());
                                    i = l3.getAutoRefreshIntervalSeconds();
                                }
                                if (i == null) {
                                    C7557a.f23040a.mo6672i(C24362h.m61216k(sb2, "BANNER_CONFIG_PARAMS: AUTO_REFRESH: Using Default Banner Auto-refresh interval: [10 seconds]"));
                                    i = 10;
                                }
                                uMOAdKitBannerParams6.mo11130x(i);
                            } else {
                                Logger logger5 = C7557a.f23040a;
                                StringBuilder J02 = C21100e.m49315J0("BANNER_CONFIG_PARAMS: AUTO_REFRESH: Using Banner Auto-refresh interval received from Application: [");
                                J02.append(uMOAdKitBannerParams6.mo11111g());
                                J02.append(" seconds]");
                                J02.append(sb2);
                                logger5.mo6672i(J02.toString());
                            }
                        }
                        UMOAdKitBannerParams uMOAdKitBannerParams7 = q4.f31966b;
                        if (uMOAdKitBannerParams7 == null) {
                            uMOAdKitInlineBannerCreativeType = null;
                        } else {
                            uMOAdKitInlineBannerCreativeType = uMOAdKitBannerParams7.mo11114i();
                        }
                        if (uMOAdKitInlineBannerCreativeType == UMOAdKitInlineBannerCreativeType.NONE) {
                            Logger logger6 = C7557a.f23040a;
                            String str15 = q4.f31965a;
                            if (C12954d.m32800c(str15)) {
                                str6 = C17885a.m44403H0(str15);
                            } else {
                                str6 = str11;
                            }
                            logger6.mo6672i(C24362h.m61216k(str6, "BANNER_CONFIG_PARAMS: Using Default Banner Creative Type: [IMAGE]"));
                            UMOAdKitBannerParams uMOAdKitBannerParams8 = q4.f31966b;
                            if (uMOAdKitBannerParams8 != null) {
                                uMOAdKitBannerParams8.mo11132z(UMOAdKitInlineBannerCreativeType.IMAGE);
                            }
                        }
                        UMOAdKitBannerParams uMOAdKitBannerParams9 = q4.f31966b;
                        if (uMOAdKitBannerParams9 == null) {
                            uMOAdKitInlineBannerCreativeType2 = null;
                        } else {
                            uMOAdKitInlineBannerCreativeType2 = uMOAdKitBannerParams9.mo11114i();
                        }
                        if (C13233c.m33339h(uMOAdKitInlineBannerCreativeType2)) {
                            UMOAdKitBannerParams uMOAdKitBannerParams10 = q4.f31966b;
                            if (uMOAdKitBannerParams10 == null) {
                                uMOAdKitInlineVideoPlayMode = null;
                            } else {
                                uMOAdKitInlineVideoPlayMode = uMOAdKitBannerParams10.mo11125t();
                            }
                            if (uMOAdKitInlineVideoPlayMode == UMOAdKitInlineVideoPlayMode.NONE) {
                                Logger logger7 = C7557a.f23040a;
                                String str16 = q4.f31965a;
                                if (C12954d.m32800c(str16)) {
                                    str5 = C17885a.m44403H0(str16);
                                } else {
                                    str5 = str11;
                                }
                                logger7.mo6672i(C24362h.m61216k(str5, "BANNER_CONFIG_PARAMS: Using Default Inline Video Play Mode: [AUTOPLAY_AUDIO_OFF]"));
                                UMOAdKitBannerParams uMOAdKitBannerParams11 = q4.f31966b;
                                if (uMOAdKitBannerParams11 != null) {
                                    uMOAdKitBannerParams11.mo11104I(C13231a.f32838b);
                                }
                            }
                        }
                    } else {
                        throw new com.umo.ads.p343d.zza(UMOAdKitError.INVALID_BANNER_PARAMS.getDesc());
                    }
                }
            }
            mo40175T(true);
            mo40165G(UMOAdKitBannerState.LOADING_IN_PROGRESS, true);
            mo40162D0();
            mo40181c0(false);
            Iterator it6 = this.f32986c.iterator();
            while (it6.hasNext()) {
                mo40190n0((String) it6.next());
            }
            this.f32987d.mo40203c(this.f32986c, false);
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: v */
    public final void mo39578v(String str, UMOAdKitError uMOAdKitError) {
        UMOAdKitBannerState uMOAdKitBannerState;
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitError, "akError");
        C12912d q = C13233c.m33348q(str);
        if (q != null && (uMOAdKitBannerState = q.f31968d) != UMOAdKitBannerState.DISPLAYED && uMOAdKitBannerState != UMOAdKitBannerState.CLICKED) {
            mo40174P(q, uMOAdKitError);
            if (!mo40160B0()) {
                Iterator it = this.f32986c.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C12912d q2 = C13233c.m33348q((String) it.next());
                    if (q2 != null && q2.f31968d == UMOAdKitBannerState.PLACEHOLDER_DISPLAYED) {
                        i++;
                    }
                }
                if (i == this.f32986c.size()) {
                    mo40192p0(false);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: v0 */
    public final ArrayList mo40197v0() {
        int i;
        Integer g;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f32986c.iterator();
        while (it.hasNext()) {
            C12912d q = C13233c.m33348q((String) it.next());
            if (q != null) {
                UMOAdKitBannerParams uMOAdKitBannerParams = q.f31966b;
                if (uMOAdKitBannerParams == null || (g = uMOAdKitBannerParams.mo11111g()) == null) {
                    i = 0;
                } else {
                    i = g.intValue();
                }
                if (i < 0) {
                    arrayList.add(q.f31965a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public final void mo39579w(String str, zzd zzd) {
        String str2;
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzd, "vastError");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("RICH_MEDIA_LISTENER: onAdTimedOut");
        if (C12954d.m32800c(str)) {
            str2 = C17885a.m44403H0(str);
        } else {
            str2 = "";
        }
        J0.append(str2);
        J0.append(": ");
        J0.append(zzd);
        logger.mo6667d(J0.toString());
        mo40182d0(str, UMOAdKitError.AD_PLAY_TIMED_OUT, zzd);
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdImpression"));
        m33438S(this, str, C17875h.m44280D(zzb.IMPRESSION), 8);
        mo40189l0(str, false);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: x0 */
    public final long mo40198x0() {
        UMOAdKitBannerParams uMOAdKitBannerParams;
        Integer g;
        if (this.f32986c.size() <= 0) {
            return -1;
        }
        Context context = C13233c.f32842a;
        C12912d q = C13233c.m33348q((String) this.f32986c.get(0));
        if (q == null || (uMOAdKitBannerParams = q.f31966b) == null || (g = uMOAdKitBannerParams.mo11111g()) == null) {
            return -1;
        }
        return ((long) g.intValue()) * 1000;
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdVideoMidpoint"));
        m33438S(this, str, C17875h.m44280D(zzb.MIDPOINT), 8);
    }

    /* renamed from: z */
    public final void mo39582z(C12836b bVar, String str) {
        C24362h.m61211f(str, "spotId");
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            C13233c.f32843b.post(new C6160i(6, this, q, bVar));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* renamed from: z0 */
    public final boolean mo40199z0() {
        Iterator it = this.f32986c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C12912d q = C13233c.m33348q((String) it.next());
            if (q != null && !z) {
                UMOAdKitBannerState uMOAdKitBannerState = q.f31968d;
                if (uMOAdKitBannerState == UMOAdKitBannerState.PREFETCHING_IN_PROGRESS || uMOAdKitBannerState == UMOAdKitBannerState.AUTO_PREFETCHING_IN_PROGRESS) {
                    z = true;
                }
            }
        }
        return z;
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
            list = C17875h.m44280D(zzb.NONE);
        } else {
            list = C17875h.m44280D(zzb.THIRD_QUARTILE);
        }
        m33438S(this, str, list, 8);
    }

    public final void zza(String str) {
    }

    public final void zzb(String str) {
        C24362h.m61211f(str, "spotId");
        AKBrowserActivity.f7313G = null;
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            m33439V(q, q.f31969e);
            mo40172M(str, false, false);
        }
    }

    public final void zzc(String str, boolean z) {
        C24362h.m61211f(str, "spotId");
        mo40189l0(str, z);
    }

    public final void zzd(String str) {
        C24362h.m61211f(str, "spotId");
        mo40169J(str, (String) null);
    }

    public final boolean zze(String str, String str2) {
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("RICH_MEDIA_LISTENER: onPlayVideo");
        J0.append(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "");
        J0.append(": Url: ");
        J0.append(str2);
        logger.mo6666c(J0.toString());
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdVideoThirdQuartile"));
        m33438S(this, str, C17875h.m44280D(zzb.THIRD_QUARTILE), 8);
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdResumed"));
        m33438S(this, str, C17875h.m44280D(zzb.RESUME), 8);
    }

    public final void zzi(String str) {
        C24362h.m61211f(str, "spotId");
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            m33439V(q, UMOAdKitBannerState.CLICKED);
            mo40191o0(str, true);
            m33433I(str, UMOAdKitBannerAdEvent.BANNER_EXPANDED, UMOAdKitError.NONE);
        }
    }

    public final void zzl(String str) {
        C24362h.m61211f(str, "spotId");
        m33438S(this, str, C17875h.m44280D(zzb.COMPLETE), 8);
        m33433I(str, UMOAdKitBannerAdEvent.BANNER_COMPLETED, UMOAdKitError.NONE);
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdExpanded"));
        m33438S(this, str, C17875h.m44280D(zzb.EXPAND), 8);
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdSkipped"));
        m33438S(this, str, C17875h.m44280D(zzb.SKIP), 12);
        m33433I(str, UMOAdKitBannerAdEvent.BANNER_STOPPED, UMOAdKitError.NONE);
    }

    public final void zzr(String str) {
    }

    public final void zzt(String str) {
        C24362h.m61211f(str, "spotId");
    }

    public final void zzu(String str) {
        com.umo.ads.p347l.zzb zzb;
        C24362h.m61211f(str, "spotId");
        UMOAdKitBannerAdEvent uMOAdKitBannerAdEvent = UMOAdKitBannerAdEvent.BANNER_DISMISSED;
        C12912d q = C13233c.m33348q(str);
        if (q != null && C13233c.m33345n(q)) {
            m33439V(q, UMOAdKitBannerState.NONE);
            m33443m0(q);
            mo40188k0();
            m33441X(q.f31965a);
            q.f31978n = null;
            m33433I(str, uMOAdKitBannerAdEvent, UMOAdKitError.NONE);
            WeakReference weakReference = C13640f.f33654h;
            if (!(weakReference == null || (zzb = (com.umo.ads.p347l.zzb) weakReference.get()) == null)) {
                C5367a.m13473a(zzb.f30828a).mo21148d(zzb);
            }
            mo40167H0();
        }
    }

    public final void zzw(String str) {
        UMOAdKitBannerView s = C13233c.m33350s(str);
        if (s != null) {
            UMOAdKitBannerView.m5802h(s, false);
        }
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
        logger.mo6666c(C24362h.m61216k(str2, "RICH_MEDIA_LISTENER: onAdVideoCompleted"));
        m33438S(this, str, C17875h.m44280D(zzb.COMPLETE), 8);
        m33433I(str, UMOAdKitBannerAdEvent.BANNER_COMPLETED, UMOAdKitError.NONE);
    }

    public final void zzc(String str, String str2) {
        C24362h.m61211f(str, "spotId");
        if (C13233c.m33348q(str) != null) {
            mo40169J(str, str2);
        }
    }

    public final void zzc(String str) {
        C24362h.m61211f(str, "spotId");
        C7557a.f23040a.mo6666c(C24362h.m61216k(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "", "RICH_MEDIA_LISTENER: onAdUserAcceptInvitation"));
        m33438S(this, str, C17875h.m44281E(zzb.ACCEPT_INVITATION, zzb.ACCEPT_INVITATION_LINEAR), 12);
    }

    public final void zzb(String str, String str2) {
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("RICH_MEDIA_LISTENER: onAdClickThru");
        J0.append(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "");
        J0.append(": ClickThroughUrl: ");
        J0.append(str2);
        logger.mo6666c(J0.toString());
        mo40169J(str, str2);
    }

    public final void zze(String str) {
        C24362h.m61211f(str, "spotId");
        C7557a.f23040a.mo6666c(C24362h.m61216k(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "", "RICH_MEDIA_LISTENER: onAdCollapsed"));
        m33438S(this, str, C17875h.m44280D(zzb.COLLAPSE), 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.List<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.List<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.util.List<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.util.List<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.util.List<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v49, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: java.util.List<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.util.List<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v52, resolved type: com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType} */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.List<java.lang.String>, java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.util.List<com.cubic.umo.p045ad.types.AKBannerResponse> r17) {
        /*
            r16 = this;
            r0 = r16
            java.util.Iterator r1 = r17.iterator()
        L_0x0006:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()
            com.cubic.umo.ad.types.AKBannerResponse r2 = (com.cubic.umo.p045ad.types.AKBannerResponse) r2
            com.umo.ads.c.zzb r4 = com.umo.ads.p342c.zzb.IMPRESSION
            com.cubic.umo.ad.types.AKTrackers r5 = r2.f7433c
            if (r5 != 0) goto L_0x001b
            r5 = r3
            goto L_0x001d
        L_0x001b:
            java.util.List<java.lang.String> r5 = r5.f7594b
        L_0x001d:
            m33432H(r2, r4, r5)
            com.umo.ads.c.zzb r4 = com.umo.ads.p342c.zzb.CREATIVE_VIEW
            com.cubic.umo.ad.types.AKTrackers r5 = r2.f7433c
            if (r5 != 0) goto L_0x0028
            r5 = r3
            goto L_0x002a
        L_0x0028:
            java.util.List<java.lang.String> r5 = r5.f7596d
        L_0x002a:
            m33432H(r2, r4, r5)
            com.umo.ads.c.zzb r4 = com.umo.ads.p342c.zzb.CLICK
            com.cubic.umo.ad.types.AKTrackers r5 = r2.f7433c
            if (r5 != 0) goto L_0x0035
            r5 = r3
            goto L_0x0037
        L_0x0035:
            java.util.List<java.lang.String> r5 = r5.f7595c
        L_0x0037:
            m33432H(r2, r4, r5)
            com.umo.ads.c.zzb r4 = com.umo.ads.p342c.zzb.VIEWABILITY
            com.cubic.umo.ad.types.AKTrackers r5 = r2.f7433c
            if (r5 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            java.util.List<java.lang.String> r3 = r5.f7597e
        L_0x0043:
            m33432H(r2, r4, r3)
            goto L_0x0006
        L_0x0047:
            r2 = r17
            r0.f32989f = r2
            r0.f32994k = r3
            boolean r1 = r16.mo40199z0()
            java.util.List<java.lang.String> r2 = r0.f32986c
            java.util.Iterator r2 = r2.iterator()
            r4 = 1
            r5 = 0
            r6 = 0
        L_0x005a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0276
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            mc0.d r8 = wb0.C13233c.m33348q(r7)
            if (r8 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r9 = r8.f31966b
            if (r9 != 0) goto L_0x0073
        L_0x0071:
            r9 = r3
            goto L_0x0077
        L_0x0073:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r9 = r9.mo11114i()
        L_0x0077:
            boolean r9 = wb0.C13233c.m33339h(r9)
            java.util.List<com.cubic.umo.ad.types.AKBannerResponse> r10 = r0.f32989f
            java.lang.String r11 = wb0.C13233c.m33342k(r8)
            com.cubic.umo.ad.types.AKBannerResponse r10 = wb0.C13233c.m33335d(r11, r10)
            com.umo.ads.c.zza$a r11 = com.umo.ads.p342c.zza.zzb
            if (r10 != 0) goto L_0x008b
            r12 = r3
            goto L_0x008d
        L_0x008b:
            java.lang.String r12 = r10.f7434d
        L_0x008d:
            r11.getClass()
            com.umo.ads.c.zza r11 = com.umo.ads.p342c.zza.C12079a.m32035a(r12)
            if (r10 != 0) goto L_0x009d
            com.cubic.umo.ad.ext.types.UMOAdKitError r7 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NO_AD_AVAILABLE_FOR_SLOT
            r0.mo40178Z(r8, r7)
            goto L_0x0273
        L_0x009d:
            java.lang.String r12 = r10.f7439i
            boolean r12 = nc0.C12954d.m32800c(r12)
            if (r12 != 0) goto L_0x00b3
            ch.qos.logback.classic.Logger r7 = ac0.C7557a.f23040a
            java.lang.String r9 = "Empty Ad Data received."
            r7.mo6667d(r9)
            com.cubic.umo.ad.ext.types.UMOAdKitError r7 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.EMPTY_AD_CONTENT
            r0.mo40178Z(r8, r7)
            goto L_0x0273
        L_0x00b3:
            com.umo.ads.c.zza r12 = com.umo.ads.p342c.zza.NONE
            if (r11 == r12) goto L_0x0267
            if (r9 != 0) goto L_0x00bd
            com.umo.ads.c.zza r12 = com.umo.ads.p342c.zza.VAST
            if (r11 == r12) goto L_0x0267
        L_0x00bd:
            if (r9 == 0) goto L_0x00c5
            com.umo.ads.c.zza r9 = com.umo.ads.p342c.zza.VAST
            if (r11 == r9) goto L_0x00c5
            goto L_0x0267
        L_0x00c5:
            java.lang.String r9 = r10.f7440j
            java.lang.String r12 = r10.f7439i
            java.lang.String r13 = "RUBICON"
            boolean r9 = mf0.C24362h.m61206a(r9, r13)
            if (r9 == 0) goto L_0x00f5
            com.umo.ads.c.zza r9 = com.umo.ads.p342c.zza.HTML
            if (r11 == r9) goto L_0x00f5
            com.umo.ads.c.zza r9 = com.umo.ads.p342c.zza.VAST
            if (r11 == r9) goto L_0x00f5
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.String r12 = "Invalid Banner Type ("
            java.lang.StringBuilder r12 = ce0.C21100e.m49315J0(r12)
            java.lang.String r14 = r11.name()
            r12.append(r14)
            java.lang.String r14 = ") received for a RUBICON Ad"
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r9.mo6667d(r12)
            goto L_0x012d
        L_0x00f5:
            com.umo.ads.c.zza r9 = com.umo.ads.p342c.zza.IMAGE
            if (r11 != r9) goto L_0x012f
            boolean r9 = nc0.C12954d.m32800c(r12)
            if (r9 != 0) goto L_0x0100
            goto L_0x010d
        L_0x0100:
            boolean r9 = android.webkit.URLUtil.isHttpUrl(r12)
            if (r9 != 0) goto L_0x010f
            boolean r9 = android.webkit.URLUtil.isHttpsUrl(r12)
            if (r9 == 0) goto L_0x010d
            goto L_0x010f
        L_0x010d:
            r9 = 0
            goto L_0x0110
        L_0x010f:
            r9 = 1
        L_0x0110:
            if (r9 != 0) goto L_0x012f
            ch.qos.logback.classic.Logger r9 = ac0.C7557a.f23040a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Invalid Ad Url received for an IMAGE Ad ("
            r14.append(r15)
            r14.append(r12)
            r12 = 41
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r9.mo6667d(r12)
        L_0x012d:
            r9 = 0
            goto L_0x0130
        L_0x012f:
            r9 = 1
        L_0x0130:
            if (r9 != 0) goto L_0x0139
            com.cubic.umo.ad.ext.types.UMOAdKitError r7 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.INVALID_AD_DATA
            r0.mo40174P(r8, r7)
            goto L_0x0273
        L_0x0139:
            com.umo.ads.c.zza r9 = com.umo.ads.p342c.zza.VAST
            if (r11 == r9) goto L_0x020c
            java.lang.String r9 = r10.f7439i
            boolean r12 = nc0.C12954d.m32800c(r9)
            if (r12 != 0) goto L_0x0146
            goto L_0x0153
        L_0x0146:
            boolean r12 = android.webkit.URLUtil.isHttpUrl(r9)
            if (r12 != 0) goto L_0x0155
            boolean r9 = android.webkit.URLUtil.isHttpsUrl(r9)
            if (r9 == 0) goto L_0x0153
            goto L_0x0155
        L_0x0153:
            r9 = 0
            goto L_0x0156
        L_0x0155:
            r9 = 1
        L_0x0156:
            java.lang.String r12 = r10.f7440j
            java.lang.String r14 = "spotId"
            mf0.C24362h.m61211f(r7, r14)
            java.lang.String r14 = "bannerType"
            mf0.C24362h.m61211f(r11, r14)
            boolean r14 = p389bl.C13637c.f33647n
            if (r14 != 0) goto L_0x0168
            goto L_0x0200
        L_0x0168:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r15 = r11.ordinal()
            if (r15 == r4) goto L_0x01ae
            r3 = 2
            if (r15 == r3) goto L_0x018d
            r9 = 3
            if (r15 == r9) goto L_0x017b
            goto L_0x0200
        L_0x017b:
            com.umo.ads.u.zzd[] r3 = new com.umo.ads.p350u.zzd[r3]
            com.umo.ads.u.zzd r9 = com.umo.ads.p350u.zzd.MRAID_AD_TEMPLATE
            r3[r5] = r9
            com.umo.ads.u.zzd r9 = com.umo.ads.p350u.zzd.MRAID_AD_PLAYVIDEO_TEMPLATE
            r3[r4] = r9
            java.util.List r3 = p583jk.C17875h.m44281E(r3)
            r14.addAll(r3)
            goto L_0x01ba
        L_0x018d:
            if (r9 == 0) goto L_0x0195
            com.umo.ads.u.zzd r3 = com.umo.ads.p350u.zzd.HTML_AD_ZIP_OR_URL_TEMPLATE
            r14.add(r3)
            goto L_0x01ba
        L_0x0195:
            boolean r3 = mf0.C24362h.m61206a(r12, r13)
            if (r3 != 0) goto L_0x01a8
            com.umo.ads.u.zzd r3 = com.umo.ads.p350u.zzd.HTML_AD_CONTENT_TEMPLATE
            r14.add(r3)
            java.util.List r3 = p389bl.C13637c.m34061P(r7)
            r14.addAll(r3)
            goto L_0x01ba
        L_0x01a8:
            com.umo.ads.u.zzd r3 = com.umo.ads.p350u.zzd.RUBICON_HTML_AD_TEMPLATE
            r14.add(r3)
            goto L_0x01ba
        L_0x01ae:
            com.umo.ads.u.zzd r3 = com.umo.ads.p350u.zzd.PLAIN_IMAGE_AD_AS_HTML_TEMPLATE
            r14.add(r3)
            java.util.List r3 = p389bl.C13637c.m34061P(r7)
            r14.addAll(r3)
        L_0x01ba:
            java.util.Iterator r3 = r14.iterator()
        L_0x01be:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0202
            java.lang.Object r9 = r3.next()
            com.umo.ads.u.zzd r9 = (com.umo.ads.p350u.zzd) r9
            j$.util.concurrent.ConcurrentHashMap r12 = p389bl.C13637c.f33649p
            if (r12 != 0) goto L_0x01d0
            r12 = 0
            goto L_0x01da
        L_0x01d0:
            java.lang.String r13 = r9.name()
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
        L_0x01da:
            boolean r12 = nc0.C12954d.m32800c(r12)
            if (r12 == 0) goto L_0x01e2
            r9 = 1
            goto L_0x01fe
        L_0x01e2:
            ch.qos.logback.classic.Logger r12 = ac0.C7557a.f23040a
            java.lang.String r13 = "@@@@@@@@@@@@@@ Ad Rendering Template Missing ("
            java.lang.StringBuilder r13 = ce0.C21100e.m49315J0(r13)
            java.lang.String r9 = r9.name()
            r13.append(r9)
            java.lang.String r9 = ") @@@@@@@@@@@@@@ "
            r13.append(r9)
            java.lang.String r9 = r13.toString()
            r12.mo6667d(r9)
            r9 = 0
        L_0x01fe:
            if (r9 != 0) goto L_0x01be
        L_0x0200:
            r3 = 0
            goto L_0x0203
        L_0x0202:
            r3 = 1
        L_0x0203:
            if (r3 != 0) goto L_0x020c
            com.cubic.umo.ad.ext.types.UMOAdKitError r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.AD_TEMPLATE_MISSING
            r0.mo40174P(r8, r3)
            goto L_0x0273
        L_0x020c:
            com.umo.ads.c.zza r3 = com.umo.ads.p342c.zza.VAST
            if (r11 == r3) goto L_0x024b
            if (r8 != 0) goto L_0x0213
            goto L_0x024b
        L_0x0213:
            android.content.Context r6 = wb0.C13233c.f32842a
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r8.f31966b
            if (r6 != 0) goto L_0x021b
            r6 = 0
            goto L_0x021f
        L_0x021b:
            com.cubic.umo.ad.ext.types.UMOAdKitInlineBannerCreativeType r6 = r6.mo11114i()
        L_0x021f:
            boolean r6 = wb0.C13233c.m33339h(r6)
            if (r6 != 0) goto L_0x024b
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r8.f31966b
            if (r6 != 0) goto L_0x022a
            goto L_0x0238
        L_0x022a:
            java.lang.Float r9 = r10.f7435e
            if (r9 != 0) goto L_0x0230
            r9 = 0
            goto L_0x0235
        L_0x0230:
            float r9 = r9.floatValue()
            int r9 = (int) r9
        L_0x0235:
            r6.mo11096A(r9)
        L_0x0238:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r8.f31966b
            if (r6 != 0) goto L_0x023d
            goto L_0x024b
        L_0x023d:
            java.lang.Float r9 = r10.f7436f
            if (r9 != 0) goto L_0x0243
            r9 = 0
            goto L_0x0248
        L_0x0243:
            float r9 = r9.floatValue()
            int r9 = (int) r9
        L_0x0248:
            r6.mo11131y(r9)
        L_0x024b:
            if (r11 != r3) goto L_0x025c
            if (r8 != 0) goto L_0x0250
            goto L_0x0254
        L_0x0250:
            boolean r3 = r0.f32996m
            r8.f31975k = r3
        L_0x0254:
            om.c r3 = r0.f32988e
            java.lang.String r6 = r10.f7439i
            r3.mo51267b(r7, r6)
            goto L_0x0263
        L_0x025c:
            if (r1 == 0) goto L_0x0263
            if (r11 == r3) goto L_0x0263
            r0.mo40177Y(r8)
        L_0x0263:
            r3 = 0
            r6 = 1
            goto L_0x005a
        L_0x0267:
            ch.qos.logback.classic.Logger r3 = ac0.C7557a.f23040a
            java.lang.String r7 = "No Banner Type received (or) Banner Type received doesn't look appropriate for the Ad."
            r3.mo6667d(r7)
            com.cubic.umo.ad.ext.types.UMOAdKitError r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.UNSUPPORTED_BANNER_TYPE
            r0.mo40174P(r8, r3)
        L_0x0273:
            r3 = 0
            goto L_0x005a
        L_0x0276:
            if (r6 != 0) goto L_0x0287
            if (r1 != 0) goto L_0x0284
            boolean r1 = r16.mo40160B0()
            if (r1 == 0) goto L_0x0281
            goto L_0x0284
        L_0x0281:
            r0.mo40192p0(r5)
        L_0x0284:
            r0.f32996m = r5
            return
        L_0x0287:
            if (r1 == 0) goto L_0x028d
            boolean r1 = r0.f32996m
            if (r1 == 0) goto L_0x02cd
        L_0x028d:
            boolean r1 = r0.f32996m
            if (r1 == 0) goto L_0x02c3
            ch.qos.logback.classic.Logger r2 = ac0.C7557a.f23040a
            java.util.List<java.lang.String> r6 = r0.f32986c
            if (r6 == 0) goto L_0x029f
            boolean r3 = r6.isEmpty()
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x029f
            goto L_0x02a0
        L_0x029f:
            r4 = 0
        L_0x02a0:
            if (r4 == 0) goto L_0x02b6
            java.lang.StringBuilder r3 = p172m9.C5720b.m14044L(r6)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            java.lang.String r7 = ", "
            java.lang.String r4 = kotlin.collections.C23825c.m58520q0(r6, r7, r8, r9, r10, r11)
            java.lang.String r3 = com.google.android.play.core.appupdate.C14226d.m35344K0(r3, r4)
            goto L_0x02b8
        L_0x02b6:
            java.lang.String r3 = ""
        L_0x02b8:
            java.lang.String r4 = "SHOWAD_ATTEMPT_ON_PF_PROGRESS_BANNER: Attempting to display a Prefetched non-VAST Banner Ad immediately as showAd() has been called when Prefetch was in Progress"
            java.lang.String r3 = mf0.C24362h.m61216k(r3, r4)
            r2.mo6666c(r3)
            r0.f32996m = r5
        L_0x02c3:
            android.os.Handler r2 = wb0.C13233c.f32843b
            yb0.b r3 = new yb0.b
            r3.<init>(r0, r1)
            r2.post(r3)
        L_0x02cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.zza(java.util.List):void");
    }

    public final void zza(String str, boolean z) {
        C24362h.m61211f(str, "spotId");
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("RICH_MEDIA_LISTENER: onAdStopped");
        J0.append(C12954d.m32800c(str) ? C17885a.m44403H0(str) : "");
        J0.append(": isForceStop: ");
        J0.append(z);
        logger.mo6666c(J0.toString());
        m33438S(this, str, C17875h.m44280D(zzb.CLOSE), 12);
        if (!z) {
            m33433I(str, UMOAdKitBannerAdEvent.BANNER_STOPPED, UMOAdKitError.NONE);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v16, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r0 = r0.getBannerParams();
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza() {
        /*
            r7 = this;
            r0 = 0
            r7.f32989f = r0
            java.util.List<java.lang.String> r0 = r7.f32986c
            java.util.Iterator r0 = r0.iterator()
        L_0x0009:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_EXPIRED
            com.cubic.umo.ad.ext.types.UMOAdKitError r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitError.NONE
            m33433I(r1, r2, r3)
            goto L_0x0009
        L_0x001d:
            boolean r0 = r7.mo40160B0()
            if (r0 == 0) goto L_0x0031
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "PREFETCH_AD_EXPIRY_BANNER: Auto-Prefetch on Expiry NOT SUPPORTED for INTERSTITIAL Banners"
            r0.mo6672i(r1)
            r7.mo40164F0()
            r7.mo40167H0()
            return
        L_0x0031:
            com.cubic.umo.ad.types.AKHostedConfig r0 = wb0.C13233c.f32845d
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0038
            goto L_0x0047
        L_0x0038:
            com.cubic.umo.ad.types.AKBannerParams r0 = r0.getBannerParams()
            if (r0 != 0) goto L_0x003f
            goto L_0x0047
        L_0x003f:
            boolean r0 = r0.getAutoPrefetchOnExpiry()
            if (r0 != 0) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            java.lang.String r3 = "0"
            java.lang.String r4 = "-1"
            if (r0 == 0) goto L_0x004f
            goto L_0x005f
        L_0x004f:
            java.util.List<java.lang.String> r0 = r7.f32986c
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 != 0) goto L_0x0061
        L_0x005f:
            r0 = r4
            goto L_0x008e
        L_0x0061:
            java.util.List<java.lang.String> r0 = r7.f32986c
            java.util.Iterator r0 = r0.iterator()
        L_0x0067:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x008d
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            mc0.d r5 = wb0.C13233c.m33348q(r5)
            if (r5 != 0) goto L_0x007a
            goto L_0x0067
        L_0x007a:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerParams r6 = r5.f31966b
            if (r6 != 0) goto L_0x007f
            goto L_0x0087
        L_0x007f:
            boolean r6 = r6.mo11110f()
            if (r6 != 0) goto L_0x0087
            r6 = 1
            goto L_0x0088
        L_0x0087:
            r6 = 0
        L_0x0088:
            if (r6 == 0) goto L_0x0067
            java.lang.String r0 = r5.f31965a
            goto L_0x008e
        L_0x008d:
            r0 = r3
        L_0x008e:
            boolean r1 = mf0.C24362h.m61206a(r0, r3)
            if (r1 == 0) goto L_0x00a8
            boolean r0 = r7.mo40184f0()
            if (r0 == 0) goto L_0x00a4
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "PREFETCH_AD_EXPIRY_BANNER|BANNER_VISIBILITY: Deferring Auto-Prefetch on Ad Expiry as NONE of the related Banners in the screen are VISIBLE."
            r0.mo6672i(r1)
            r7.f32993j = r2
            return
        L_0x00a4:
            r7.mo40163E0()
            return
        L_0x00a8:
            boolean r1 = mf0.C24362h.m61206a(r0, r4)
            if (r1 == 0) goto L_0x00b6
            ch.qos.logback.classic.Logger r0 = ac0.C7557a.f23040a
            java.lang.String r1 = "PREFETCH_AD_EXPIRY_BANNER: Auto Prefetching on Ad Expiry DISABLED in Hosted Configuration"
            r0.mo6667d(r1)
            goto L_0x00ce
        L_0x00b6:
            ch.qos.logback.classic.Logger r1 = ac0.C7557a.f23040a
            boolean r3 = nc0.C12954d.m32800c(r0)
            if (r3 == 0) goto L_0x00c3
            java.lang.String r0 = p584jl.C17885a.m44403H0(r0)
            goto L_0x00c5
        L_0x00c3:
            java.lang.String r0 = ""
        L_0x00c5:
            java.lang.String r3 = "PREFETCH_AD_EXPIRY_BANNER: Auto Prefetching on Ad Expiry DISABLED"
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r3)
            r1.mo6667d(r0)
        L_0x00ce:
            com.cubic.umo.ad.ext.types.UMOAdKitBannerState r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.INITIALIZED
            r7.mo40165G(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C13295d.zza():void");
    }
}
