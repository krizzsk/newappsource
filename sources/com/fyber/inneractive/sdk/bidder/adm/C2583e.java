package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.network.C2912k0;
import com.fyber.inneractive.sdk.network.C2916m0;
import com.fyber.inneractive.sdk.response.C3645b;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.response.C3653j;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3714n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.e */
public class C2583e implements C3653j {

    /* renamed from: a */
    public AdmParametersOuterClass$AdmParameters f9110a;

    /* renamed from: b */
    public final String f9111b;

    /* renamed from: c */
    public String f9112c;

    /* renamed from: d */
    public String f9113d;

    /* renamed from: com.fyber.inneractive.sdk.bidder.adm.e$a */
    public interface C2584a {
    }

    public C2583e(String str) {
        this.f9111b = str;
    }

    /* renamed from: a */
    public static void m6586a(C2583e eVar, C2584a aVar) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = eVar.f9110a;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : eVar.f9110a.getMarkupUrl();
        if (!TextUtils.isEmpty(markupUrl)) {
            C2912k0 k0Var = new C2912k0(new C2580b(eVar, aVar), markupUrl, eVar);
            k0Var.f9903d = new C2581c(eVar);
            IAConfigManager.f9202J.f9232t.f10064a.offer(k0Var);
            k0Var.mo13666a(C2916m0.QUEUED);
            return;
        }
        C3714n.f12902b.post(new C2582d(eVar, aVar));
    }

    /* renamed from: a */
    public void mo13158a(C3645b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        int i;
        int i2;
        int i3;
        String str6;
        C3645b bVar2 = bVar;
        bVar2.f12732a.f12742A = true;
        IAConfigManager.f9202J.f9236x.f9282e = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f9110a;
        if (admParametersOuterClass$AdmParameters != null) {
            int a = admParametersOuterClass$AdmParameters.getAdType().mo13014a();
            if (this.f9110a.hasErrorMessage()) {
                this.f9110a.getErrorMessage();
            }
            String sessionId = this.f9110a.hasSessionId() ? this.f9110a.getSessionId() : null;
            Long valueOf = this.f9110a.hasContentId() ? Long.valueOf(this.f9110a.getContentId()) : null;
            if (this.f9110a.hasPublisherId()) {
                this.f9110a.getPublisherId();
            }
            Integer valueOf2 = this.f9110a.hasAdWidth() ? Integer.valueOf(this.f9110a.getAdWidth()) : null;
            Integer valueOf3 = this.f9110a.hasAdHeight() ? Integer.valueOf(this.f9110a.getAdHeight()) : null;
            String sdkImpressionUrl = this.f9110a.hasSdkImpressionUrl() ? this.f9110a.getSdkImpressionUrl() : null;
            String sdkClickUrl = this.f9110a.hasSdkClickUrl() ? this.f9110a.getSdkClickUrl() : null;
            Integer valueOf4 = this.f9110a.hasAdExpirationInterval() ? Integer.valueOf(this.f9110a.getAdExpirationInterval()) : null;
            String adCompletionUrl = this.f9110a.hasAdCompletionUrl() ? this.f9110a.getAdCompletionUrl() : null;
            bVar2.f12733b = this.f9110a.hasAdUnitId() ? this.f9110a.getAdUnitId() : null;
            this.f9110a.getAdUnitType().name().toLowerCase();
            String lowerCase = this.f9110a.hasAdUnitId() ? this.f9110a.getAdUnitDisplayType().name().toLowerCase() : null;
            String adNetworkName = this.f9110a.hasAdNetworkName() ? this.f9110a.getAdNetworkName() : null;
            Long valueOf5 = this.f9110a.hasAdNetworkId() ? Long.valueOf(this.f9110a.getAdNetworkId()) : null;
            String creativeId = this.f9110a.hasCreativeId() ? this.f9110a.getCreativeId() : null;
            String adDomain = this.f9110a.hasAdDomain() ? this.f9110a.getAdDomain() : null;
            if (this.f9110a.hasAppBundleId()) {
                str2 = this.f9110a.getAppBundleId();
                str = lowerCase;
            } else {
                str = lowerCase;
                str2 = null;
            }
            String campaignId = this.f9110a.hasCampaignId() ? this.f9110a.getCampaignId() : null;
            impressionData.setCpmValue(this.f9110a.hasPricingValue() ? Double.toString(this.f9110a.getPricingValue()) : null);
            impressionData.setCurrency("USD");
            if (this.f9110a.hasMrcData()) {
                if (this.f9110a.getMrcData().hasPixelPercent()) {
                    i2 = this.f9110a.getMrcData().getPixelPercent();
                    str5 = adCompletionUrl;
                } else {
                    str5 = adCompletionUrl;
                    i2 = 0;
                }
                if (this.f9110a.getMrcData().hasPixelDuration()) {
                    i3 = this.f9110a.getMrcData().getPixelDuration();
                    str4 = sdkClickUrl;
                } else {
                    str4 = sdkClickUrl;
                    i3 = -1;
                }
                if (this.f9110a.getMrcData().hasPixelImpressionUrl()) {
                    str6 = this.f9110a.getMrcData().getPixelImpressionUrl();
                    str3 = sdkImpressionUrl;
                } else {
                    str3 = sdkImpressionUrl;
                    str6 = null;
                }
                C3648e eVar = bVar2.f12732a;
                eVar.f12762t = i2;
                eVar.f12763u = (float) i3;
                eVar.f12764v = str6;
            } else {
                str3 = sdkImpressionUrl;
                str4 = sdkClickUrl;
                str5 = adCompletionUrl;
            }
            Boolean valueOf6 = this.f9110a.hasSkipMode() ? Boolean.valueOf(this.f9110a.getSkipMode()) : null;
            if (bVar.mo13325b()) {
                bVar2.f12732a.f12759q = this.f9110a.toString();
            }
            C3648e eVar2 = bVar2.f12732a;
            String num = valueOf4.toString();
            eVar2.getClass();
            try {
                j = Long.parseLong(num);
            } catch (NumberFormatException unused) {
                j = 20;
            }
            eVar2.f12744b = j;
            Integer num2 = valueOf3;
            eVar2.f12743a = TimeUnit.MINUTES.toMillis(j) + eVar2.f12745c;
            impressionData.setImpressionId(sessionId);
            impressionData.setDemandSource(adNetworkName);
            bVar2.f12732a.f12746d = valueOf != null ? valueOf.toString() : "";
            bVar2.f12732a.getClass();
            bVar2.f12732a.getClass();
            C3648e eVar3 = bVar2.f12732a;
            eVar3.f12767y = str2;
            eVar3.f12768z = this.f9113d;
            if (valueOf5 != null) {
                impressionData.setDemandId(valueOf5);
            }
            C3648e eVar4 = bVar2.f12732a;
            eVar4.f12749g = a;
            if (valueOf2 != null) {
                eVar4.f12747e = valueOf2.intValue();
            }
            if (num2 != null) {
                bVar2.f12732a.f12748f = num2.intValue();
            }
            C3648e eVar5 = bVar2.f12732a;
            eVar5.f12753k = str3;
            eVar5.f12754l = str4;
            eVar5.f12757o = str5;
            eVar5.f12755m = bVar2.f12733b;
            try {
                eVar5.f12756n = UnitDisplayType.fromValue(str);
            } catch (IllegalArgumentException unused2) {
                bVar2.f12732a.f12756n = UnitDisplayType.INTERSTITIAL;
            }
            if (!TextUtils.isEmpty(creativeId)) {
                impressionData.setCreativeId(creativeId);
            }
            if (!TextUtils.isEmpty(adDomain)) {
                impressionData.setAdvertiserDomain(adDomain);
            }
            if (!TextUtils.isEmpty(campaignId)) {
                impressionData.setCampaignId(campaignId);
            }
            impressionData.setCountry(C3705k.m9945g());
            bVar2.f12732a.f12760r = impressionData;
            if (valueOf6 == null) {
                i = -1;
            } else {
                i = valueOf6.booleanValue() ? 1 : 0;
            }
            bVar2.f12732a.f12765w = i;
        }
    }

    /* renamed from: a */
    public String mo13157a() {
        return this.f9112c;
    }
}
