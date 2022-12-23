package com.moovit.umo.ads;

import android.content.Context;
import android.location.Location;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1025n;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import ce0.C21100e;
import com.cubic.umo.Environment;
import com.cubic.umo.p045ad.C2218a;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdOrientation;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdPosition;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAdQueryParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitAppUserType;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineBannerCreativeType;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineVideoPlayMode;
import com.facebook.appevents.C2316a;
import com.google.android.gms.tasks.TaskExecutors;
import com.moovit.umo.UmoException;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import mf0.C24362h;
import p026b7.C1496a;
import p039c7.C1798a;
import p061d7.C4402a;
import p145k5.C5493l;
import p172m9.C5720b;
import p196o7.C6009a;
import p583jk.C17884p;
import p832tx.C19791a;
import p977zz.C20944i0;
import p977zz.C20960q0;
import p977zz.C20975x0;

public final class UmoAds {

    /* renamed from: d */
    public static volatile UmoAds f23806d;

    /* renamed from: a */
    public final Context f23807a;

    /* renamed from: b */
    public final AtomicReference<C7870e> f23808b = new AtomicReference<>((Object) null);

    /* renamed from: c */
    public final ThreadPoolExecutor f23809c = C5720b.m14033A(1, "umo");

    public static class AdViewLifeCycleObserver implements C1025n {

        /* renamed from: b */
        public final UMOAdKitBannerView f23810b;

        public AdViewLifeCycleObserver(UMOAdKitBannerView uMOAdKitBannerView) {
            this.f23810b = uMOAdKitBannerView;
        }

        /* renamed from: f */
        public final void mo740f(C1033p pVar, Lifecycle.Event event) {
            int i = C7866a.f23811a[event.ordinal()];
            if (i == 1) {
                int i2 = C7866a.f23812b[this.f23810b.getBannerState().ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    this.f23810b.mo11050e();
                }
            } else if (i == 2) {
                pVar.getLifecycle().mo4226c(this);
            }
        }
    }

    /* renamed from: com.moovit.umo.ads.UmoAds$a */
    public static /* synthetic */ class C7866a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23811a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f23812b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f23813c;

        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(51:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00fa */
        static {
            /*
                com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent[] r0 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23813c = r0
                r1 = 1
                com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r2 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_CLICKED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f23813c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_PLACEHOLDER_CLICKED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f23813c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r4 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_REFRESHED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f23813c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r5 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_AUTO_REFRESHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f23813c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r6 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_DISPLAYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f23813c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r7 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_FETCHED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f23813c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerAdEvent r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerAdEvent.BANNER_ERROR     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState[] r7 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                f23812b = r7
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r7 = f23812b     // Catch:{ NoSuchFieldError -> 0x006f }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.DISPLAYED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r7[r8] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r7 = f23812b     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r8 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.PREFETCHED     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r7[r8] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r7 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.CLICKED     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x008d }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.PLACEHOLDER_DISPLAYED     // Catch:{ NoSuchFieldError -> 0x008d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.LOADING_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r2[r3] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x00a1 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.DISPLAY_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r2[r3] = r6     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x00ad }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.PREFETCHING_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r4 = 8
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x00b9 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.AUTO_PREFETCHING_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r4 = 9
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x00c5 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.MANUAL_REFRESH_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r4 = 10
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x00d1 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.AUTO_REFRESH_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r4 = 11
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x00dd }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.REMOVAL_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r4 = 12
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r2 = f23812b     // Catch:{ NoSuchFieldError -> 0x00e9 }
                com.cubic.umo.ad.ext.types.UMOAdKitBannerState r3 = com.cubic.umo.p045ad.ext.types.UMOAdKitBannerState.NONE     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r4 = 13
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                androidx.lifecycle.Lifecycle$Event[] r2 = androidx.lifecycle.Lifecycle.Event.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f23811a = r2
                androidx.lifecycle.Lifecycle$Event r3 = androidx.lifecycle.Lifecycle.Event.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x00fa }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fa }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x00fa }
            L_0x00fa:
                int[] r1 = f23811a     // Catch:{ NoSuchFieldError -> 0x0104 }
                androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0104 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0104 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0104 }
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.umo.ads.UmoAds.C7866a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.umo.ads.UmoAds$b */
    public static class C7867b implements C1798a {

        /* renamed from: a */
        public final UMOAdKitBannerType f23814a;

        /* renamed from: b */
        public final String f23815b;

        /* renamed from: c */
        public final String f23816c;

        /* renamed from: d */
        public final C7868c f23817d;

        public C7867b(UMOAdKitBannerType uMOAdKitBannerType, String str, String str2, C19791a aVar) {
            this.f23814a = uMOAdKitBannerType;
            C21100e.m49373x(str, "slotId");
            this.f23815b = str;
            this.f23816c = str2;
            this.f23817d = aVar;
        }

        /* renamed from: a */
        public final void mo24509a(UMOAdKitBannerAdEvent uMOAdKitBannerAdEvent, UMOAdKitError uMOAdKitError) {
            switch (C7866a.f23813c[uMOAdKitBannerAdEvent.ordinal()]) {
                case 1:
                case 2:
                    this.f23817d.mo24510W(this.f23815b, this.f23814a.name(), this.f23816c);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    this.f23817d.mo24512z(this.f23815b, this.f23814a.name());
                    return;
                case 7:
                    this.f23817d.mo24511b1(new RuntimeException(uMOAdKitError.getDesc()));
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.moovit.umo.ads.UmoAds$c */
    public interface C7868c {
        /* renamed from: W */
        void mo24510W(String str, String str2, String str3);

        /* renamed from: b1 */
        void mo24511b1(RuntimeException runtimeException);

        /* renamed from: z */
        void mo24512z(String str, String str2);
    }

    /* renamed from: com.moovit.umo.ads.UmoAds$d */
    public static class C7869d implements Callable<Void>, C1496a {

        /* renamed from: b */
        public final Context f23818b;

        /* renamed from: c */
        public final C7871f f23819c;

        /* renamed from: d */
        public final AtomicReference<C7870e> f23820d;

        /* renamed from: e */
        public final C20960q0<C20944i0<C7870e, UmoException>> f23821e = new C20960q0<>();

        public C7869d(Context context, C7871f fVar, AtomicReference atomicReference) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f23818b = context;
            this.f23819c = fVar;
            C21100e.m49373x(atomicReference, "umoInstanceReference");
            this.f23820d = atomicReference;
        }

        public final Object call() throws Exception {
            HashMap hashMap;
            C7870e eVar = this.f23820d.get();
            if (eVar == null || !C20975x0.m49118e(this.f23819c, eVar.f23822a)) {
                if (eVar != null) {
                    eVar.f23824c = false;
                    TaskExecutors.MAIN_THREAD.execute(new C2316a(3));
                    this.f23820d.set((Object) null);
                }
                Environment O = C21100e.m49320O(this.f23819c.f23828d);
                C7871f fVar = this.f23819c;
                C6009a aVar = new C6009a(fVar.f23826b, fVar.f23827c);
                C7871f fVar2 = this.f23819c;
                String str = fVar2.f23825a;
                Location location = fVar2.f23830f;
                int i = fVar2.f23829e;
                C24362h.m61211f(str, "publisherId");
                C4402a aVar2 = new C4402a(str, "", (String) null, (String) null, (String) null, UMOAdKitAppUserType.ANONYMOUS_USER, (String) null, (Map<String, String>) null, (UMOAdKitAdQueryParams) null);
                aVar2.f15458d = String.valueOf(i);
                if (aVar2.f15462h == null) {
                    hashMap = new HashMap(1);
                } else {
                    hashMap = new HashMap(aVar2.f15462h);
                }
                hashMap.put(UMOAdKitBannerType.LEADERBOARD_320x50_6x1.name(), "img_umo_ad_banner_placeholder");
                aVar2.f15462h = hashMap;
                if (location != null) {
                    UMOAdKitAdQueryParams uMOAdKitAdQueryParams = new UMOAdKitAdQueryParams();
                    uMOAdKitAdQueryParams.f7263L = String.valueOf(location.getLatitude());
                    uMOAdKitAdQueryParams.f7264M = String.valueOf(location.getLongitude());
                    aVar2.f15463i = uMOAdKitAdQueryParams;
                }
                TaskExecutors.MAIN_THREAD.execute(new C5493l(this, O, aVar, aVar2, 1));
                C20960q0<C20944i0<C7870e, UmoException>> q0Var = this.f23821e;
                q0Var.f52709b.block();
                C20944i0 i0Var = (C20944i0) q0Var.f52710c;
                S s = i0Var.f52693b;
                if (s == null) {
                    this.f23820d.set((C7870e) i0Var.f52692a);
                } else {
                    throw ((UmoException) s);
                }
            }
            return null;
        }
    }

    /* renamed from: com.moovit.umo.ads.UmoAds$e */
    public static class C7870e {

        /* renamed from: a */
        public final C7871f f23822a;

        /* renamed from: b */
        public final C2218a f23823b;

        /* renamed from: c */
        public volatile boolean f23824c = true;

        public C7870e(C7871f fVar, C2218a aVar) {
            C21100e.m49373x(fVar, "params");
            this.f23822a = fVar;
            this.f23823b = aVar;
        }
    }

    /* renamed from: com.moovit.umo.ads.UmoAds$f */
    public static class C7871f {

        /* renamed from: a */
        public final String f23825a;

        /* renamed from: b */
        public final String f23826b;

        /* renamed from: c */
        public final String f23827c;

        /* renamed from: d */
        public final String f23828d;

        /* renamed from: e */
        public final int f23829e;

        /* renamed from: f */
        public final Location f23830f;

        public C7871f(String str, String str2, String str3, String str4, int i, Location location) {
            C21100e.m49373x(str, "publisherId");
            this.f23825a = str;
            C21100e.m49373x(str2, "clientId");
            this.f23826b = str2;
            C21100e.m49373x(str3, "clientSecret");
            this.f23827c = str3;
            C21100e.m49373x(str4, "environment");
            this.f23828d = str4;
            this.f23829e = i;
            this.f23830f = location;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7871f)) {
                return false;
            }
            C7871f fVar = (C7871f) obj;
            if (!this.f23825a.equals(fVar.f23825a) || !this.f23826b.equals(fVar.f23826b) || !this.f23827c.equals(fVar.f23827c) || !this.f23828d.equals(fVar.f23828d) || this.f23829e != fVar.f23829e) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return C17884p.m44333D(C17884p.m44335F(this.f23825a), C17884p.m44335F(this.f23826b), C17884p.m44335F(this.f23827c), C17884p.m44335F(this.f23828d), this.f23829e);
        }
    }

    public UmoAds(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f23807a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final UMOAdKitBannerView mo24508a(C19791a aVar, String str, C19791a aVar2) {
        C2218a aVar3;
        String str2 = str;
        C21100e.m49369v(1);
        FragmentActivity activity = aVar.getActivity();
        C7870e eVar = this.f23808b.get();
        if (eVar == null || !eVar.f23824c) {
            aVar3 = null;
        } else {
            aVar3 = eVar.f23823b;
        }
        if (activity == null || aVar3 == null) {
            return null;
        }
        UMOAdKitBannerView uMOAdKitBannerView = new UMOAdKitBannerView(activity);
        UMOAdKitBannerType uMOAdKitBannerType = UMOAdKitBannerType.LEADERBOARD_320x50_6x1;
        C24362h.m61211f(str2, "akSpotId");
        UMOAdKitBannerParams uMOAdKitBannerParams = r0;
        UMOAdKitBannerParams uMOAdKitBannerParams2 = new UMOAdKitBannerParams(str, UMOAdKitBannerType.NONE, (String) null, 5, true, true, UMOAdKitInlineBannerCreativeType.IMAGE, (String) null, UMOAdKitAdPosition.UNKNOWN, false, -2, -2, 0, 0, (Integer) null, UMOAdKitInlineVideoPlayMode.NONE, UMOAdKitAdOrientation.UNSPECIFIED);
        UMOAdKitBannerParams uMOAdKitBannerParams3 = uMOAdKitBannerParams;
        UMOAdKitBannerType uMOAdKitBannerType2 = uMOAdKitBannerType;
        uMOAdKitBannerParams3.mo11102G(uMOAdKitBannerType2);
        uMOAdKitBannerParams3.mo11130x(30);
        uMOAdKitBannerParams3.mo11100E(UMOAdKitAdPosition.ABOVE_FOLD);
        UMOAdKitBannerView uMOAdKitBannerView2 = uMOAdKitBannerView;
        uMOAdKitBannerView2.setBannerParams(uMOAdKitBannerParams3);
        String str3 = str;
        uMOAdKitBannerView2.setBannerAdListener(new C7867b(uMOAdKitBannerType2, str3, uMOAdKitBannerParams3.mo11106c(), aVar2));
        uMOAdKitBannerView2.mo11052g(str3);
        aVar.getLifecycle().mo4224a(new AdViewLifeCycleObserver(uMOAdKitBannerView2));
        return uMOAdKitBannerView2;
    }
}
