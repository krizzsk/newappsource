package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.network.C2913l;
import com.fyber.inneractive.sdk.network.C2915m;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.response.k */
public class C3654k implements C3653j {

    /* renamed from: a */
    public final C2915m f12778a;

    public C3654k(C2915m mVar) {
        this.f12778a = mVar;
    }

    /* renamed from: a */
    public final String mo15300a(Map<String, String> map, C2913l lVar) {
        String lowerCase = lVar.f9960a.toLowerCase();
        String str = map.get(lowerCase);
        IAlog.m9905d("%s%s extracted from response header: %s", IAlog.m9899a((Object) this), lowerCase, str);
        IAlog.m9900a(1, (Exception) null, "%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }

    /* renamed from: a */
    public String mo13157a() {
        return this.f12778a.mo13685d().toString();
    }

    /* renamed from: a */
    public void mo13158a(C3645b bVar) {
        long j;
        C3645b bVar2 = bVar;
        bVar2.f12732a.f12742A = false;
        IAConfigManager.f9202J.f9236x.f9282e = false;
        ImpressionData impressionData = new ImpressionData();
        Map<String, String> o = this.f12778a.mo13686o();
        String a = mo15300a(o, C2913l.RETURNED_AD_TYPE);
        mo15300a(o, C2913l.ERROR_CODE);
        String a2 = mo15300a(o, C2913l.SESSION_ID);
        String a3 = mo15300a(o, C2913l.CONTENT_ID);
        mo15300a(o, C2913l.PUBLISHER_ID);
        String a4 = mo15300a(o, C2913l.WIDTH);
        String a5 = mo15300a(o, C2913l.HEIGHT);
        String a6 = mo15300a(o, C2913l.SDK_IMPRESSION_URL);
        String a7 = mo15300a(o, C2913l.SDK_CLICK_URL);
        String a8 = mo15300a(o, C2913l.AD_TIMEOUT);
        String a9 = mo15300a(o, C2913l.AD_COMPLETION_URL);
        bVar2.f12733b = mo15300a(o, C2913l.AD_UNIT_ID);
        mo15300a(o, C2913l.AD_UNIT_TYPE);
        String a11 = mo15300a(o, C2913l.AD_UNIT_DISPLAY_TYPE);
        String a12 = mo15300a(o, C2913l.AD_NETWORK);
        String a13 = mo15300a(o, C2913l.AD_NETWORK_ID);
        String str = a11;
        String a14 = mo15300a(o, C2913l.CREATIVE_ID);
        String a15 = mo15300a(o, C2913l.AD_DOMAIN);
        String a16 = mo15300a(o, C2913l.APP_BUNDLE);
        String str2 = a9;
        String a17 = mo15300a(o, C2913l.CAMPAIGN_ID);
        String a18 = mo15300a(o, C2913l.CPM_VALUE);
        String str3 = a7;
        String a19 = mo15300a(o, C2913l.CPM_CURRENCY);
        impressionData.setCpmValue(a18);
        impressionData.setCurrency(a19);
        String a21 = mo15300a(o, C2913l.BANNER_MRC_PERCENT);
        String a22 = mo15300a(o, C2913l.BANNER_MRC_DURATION);
        String a23 = mo15300a(o, C2913l.BANNER_MRC_IMPRESSION_URL);
        String a24 = mo15300a(o, C2913l.INTERSTITIAL_SKIP_MODE);
        if (bVar.mo13325b()) {
            bVar2.f12732a.f12758p = o;
        }
        C3648e eVar = bVar2.f12732a;
        eVar.getClass();
        try {
            j = Long.parseLong(a8);
        } catch (NumberFormatException unused) {
            j = 20;
        }
        String str4 = a24;
        long j2 = j;
        eVar.f12744b = j2;
        String str5 = a6;
        String str6 = a21;
        String str7 = str4;
        eVar.f12743a = TimeUnit.MINUTES.toMillis(j2) + eVar.f12745c;
        impressionData.setImpressionId(a2);
        impressionData.setDemandSource(a12);
        C3648e eVar2 = bVar2.f12732a;
        eVar2.f12746d = a3;
        eVar2.f12767y = a16;
        if (!TextUtils.isEmpty(a13)) {
            impressionData.setDemandId(Long.valueOf(a13));
        }
        if (!TextUtils.isEmpty(a)) {
            bVar2.f12732a.f12749g = Integer.valueOf(a).intValue();
        }
        if (!TextUtils.isEmpty(a4)) {
            bVar2.f12732a.f12747e = Integer.valueOf(a4).intValue();
        }
        if (!TextUtils.isEmpty(a5)) {
            bVar2.f12732a.f12748f = Integer.valueOf(a5).intValue();
        }
        C3648e eVar3 = bVar2.f12732a;
        eVar3.f12753k = str5;
        eVar3.f12754l = str3;
        eVar3.f12757o = str2;
        eVar3.f12755m = bVar2.f12733b;
        try {
            eVar3.f12756n = UnitDisplayType.fromValue(str);
        } catch (IllegalArgumentException unused2) {
            bVar2.f12732a.f12756n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(a14)) {
            impressionData.setCreativeId(a14);
        }
        if (!TextUtils.isEmpty(a15)) {
            impressionData.setAdvertiserDomain(a15);
        }
        if (!TextUtils.isEmpty(a17)) {
            impressionData.setCampaignId(a17);
        }
        impressionData.setCountry(C3705k.m9945g());
        C3648e eVar4 = bVar2.f12732a;
        eVar4.f12760r = impressionData;
        eVar4.f12762t = C3727s.m9986a(str6, 0);
        C3648e eVar5 = bVar2.f12732a;
        float f = -1.0f;
        if (!TextUtils.isEmpty(a22)) {
            try {
                f = Float.parseFloat(a22);
            } catch (NumberFormatException unused3) {
            }
        }
        eVar5.f12763u = f;
        C3648e eVar6 = bVar2.f12732a;
        eVar6.f12764v = a23;
        eVar6.f12765w = C3727s.m9986a(str7, -1);
    }
}
