package com.fyber.inneractive.sdk.p048dv.handler;

import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.p048dv.C2721g;
import com.fyber.inneractive.sdk.p048dv.enums.C2719a;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.handler.c */
public class C2725c extends C2722a<QueryInfo> {

    /* renamed from: a */
    public final HashMap<AdFormat, QueryInfo> f9450a = new HashMap<>();

    /* renamed from: b */
    public boolean f9451b = false;

    /* renamed from: c */
    public final Object f9452c = new Object();

    /* renamed from: d */
    public int f9453d = 0;

    /* renamed from: com.fyber.inneractive.sdk.dv.handler.c$a */
    public static /* synthetic */ class C2726a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9454a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9454a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9454a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9454a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p048dv.handler.C2725c.C2726a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo13330a() {
        for (AdFormat adFormat : AdFormat.values()) {
            if (adFormat != AdFormat.NATIVE) {
                C3714n.m9976a(new C2723b(this, adFormat));
            }
        }
    }

    /* renamed from: a */
    public C2721g mo13329a(UnitDisplayType unitDisplayType) {
        AdFormat adFormat;
        C2721g gVar;
        int i = C2726a.f9454a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            adFormat = AdFormat.BANNER;
        } else if (i != 3) {
            adFormat = AdFormat.INTERSTITIAL;
        } else {
            adFormat = AdFormat.REWARDED;
        }
        QueryInfo queryInfo = this.f9450a.get(adFormat);
        if (queryInfo != null) {
            synchronized (this.f9452c) {
                this.f9450a.remove(adFormat);
            }
            gVar = new C2721g(queryInfo);
        } else {
            gVar = null;
        }
        IAlog.m9902a("DVHanlder - get query: %s", gVar);
        C3714n.m9976a(new C2723b(this, adFormat));
        return gVar;
    }

    /* renamed from: a */
    public static void m6814a(String str, C2719a aVar, InneractiveAdRequest inneractiveAdRequest, C3648e eVar, String str2) {
        String str3;
        IAlog.m9902a(String.format("Firing Event 1001 -Phase - %s  Fetch error DV - msg  %s", new Object[]{aVar.name(), str2}), new Object[0]);
        C2922o oVar = C2922o.DV_ERROR_PHASE;
        C2926q.C2927a aVar2 = new C2926q.C2927a(eVar);
        aVar2.f10041b = oVar;
        aVar2.f10040a = inneractiveAdRequest;
        aVar2.f10043d = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("spot_id", str);
        } catch (Exception unused) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", "spot_id", str);
        }
        String lowerCase = aVar.name().toLowerCase();
        try {
            jSONObject.put("phase", lowerCase);
        } catch (Exception unused2) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", "phase", lowerCase);
        }
        try {
            str3 = MobileAds.getVersionString();
        } catch (Exception unused3) {
            str3 = "na";
        }
        try {
            jSONObject.put(MediationMetaData.KEY_VERSION, str3);
        } catch (Exception unused4) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", MediationMetaData.KEY_VERSION, str3);
        }
        try {
            jSONObject.put(InAppMessageBase.MESSAGE, str2);
        } catch (Exception unused5) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", InAppMessageBase.MESSAGE, str2);
        }
        aVar2.f10045f.put(jSONObject);
        aVar2.mo13717a((String) null);
    }
}
