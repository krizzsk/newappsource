package com.fyber.inneractive.sdk.p048dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C2763c;
import com.fyber.inneractive.sdk.p048dv.banner.C2710a;
import com.fyber.inneractive.sdk.p048dv.interstitial.C2729b;
import com.fyber.inneractive.sdk.p048dv.interstitial.C2732c;
import com.fyber.inneractive.sdk.p048dv.rewarded.C2736a;
import com.fyber.inneractive.sdk.p048dv.rewarded.C2740b;
import com.fyber.inneractive.sdk.util.C3707l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.dv.b */
public class C2708b extends C2763c<C2720f, C2707a> implements C2717d {

    /* renamed from: h */
    public boolean f9434h = (!C3707l.m9960a("com.google.android.gms.ads.InterstitialAd"));

    /* renamed from: com.fyber.inneractive.sdk.dv.b$a */
    public static /* synthetic */ class C2709a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9435a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9435a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9435a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9435a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9435a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p048dv.C2708b.C2709a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public String mo13296b() {
        return null;
    }

    /* renamed from: e */
    public void mo13297e() {
        Content content;
        float f;
        Response response = this.f9548b;
        if (response == null || ((C2720f) response).f12761s == null) {
            mo13298f();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f9547a;
        if (inneractiveAdRequest != null) {
            boolean muteVideo = inneractiveAdRequest.getMuteVideo();
            try {
                MobileAds.setAppMuted(muteVideo);
                if (muteVideo) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    f = 1.0f;
                }
                MobileAds.setAppVolume(f);
            } catch (Throwable unused) {
            }
        }
        C2720f fVar = (C2720f) this.f9548b;
        UnitDisplayType unitDisplayType = fVar.f12756n;
        QueryInfo queryInfo = fVar.f12761s.f9446a;
        int i = C2709a.f9435a[unitDisplayType.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                content = new C2710a(mo13519c(), this.f9552f, (C2720f) this.f9548b);
            } else if (i != 4) {
                content = null;
            } else if (this.f9434h) {
                content = new C2736a(mo13519c(), this.f9552f, (C2720f) this.f9548b);
            } else {
                content = new C2740b(mo13519c(), this.f9552f, (C2720f) this.f9548b);
            }
        } else if (this.f9434h) {
            content = new C2729b(mo13519c(), this.f9552f, (C2720f) this.f9548b);
        } else {
            content = new C2732c(mo13519c(), this.f9552f, (C2720f) this.f9548b);
        }
        this.f9549c = content;
        if (queryInfo == null || content == null) {
            mo13298f();
            return;
        }
        ((C2707a) this.f9549c).mo13292a(new AdRequest.Builder().setAdInfo(new AdInfo(queryInfo, ((C2720f) this.f9548b).f9445B)).build(), this);
    }

    /* renamed from: f */
    public void mo13298f() {
        mo13518a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
    }
}
