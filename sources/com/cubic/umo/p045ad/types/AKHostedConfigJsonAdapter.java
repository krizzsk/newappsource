package com.cubic.umo.p045ad.types;

import com.appboy.models.outgoing.TwitterUser;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import com.unity3d.ads.metadata.MediationMetaData;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;
import p358af.C13437d;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKHostedConfigJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKHostedConfig;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKHostedConfigJsonAdapter */
public final class AKHostedConfigJsonAdapter extends C8011k<AKHostedConfig> {

    /* renamed from: a */
    public final JsonReader.C7986a f7521a = JsonReader.C7986a.m18216a(MediationMetaData.KEY_VERSION, TwitterUser.DESCRIPTION_KEY, "publisher_id", "banner_params", "roll_params", "log_level", "ad_ui_config", "placeholders");

    /* renamed from: b */
    public final C8011k<String> f7522b;

    /* renamed from: c */
    public final C8011k<AKBannerParams> f7523c;

    /* renamed from: d */
    public final C8011k<AKRollParams> f7524d;

    /* renamed from: e */
    public final C8011k<AKLogLevel> f7525e;

    /* renamed from: f */
    public final C8011k<AKAdUIConfig> f7526f;

    /* renamed from: g */
    public final C8011k<AKPlaceholders> f7527g;

    public AKHostedConfigJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7522b = C18201b.m44910D(oVar, String.class, MediationMetaData.KEY_VERSION);
        this.f7523c = C18201b.m44910D(oVar, AKBannerParams.class, "bannerParams");
        this.f7524d = C18201b.m44910D(oVar, AKRollParams.class, "rollParams");
        this.f7525e = C18201b.m44910D(oVar, AKLogLevel.class, "logLevel");
        this.f7526f = C18201b.m44910D(oVar, AKAdUIConfig.class, "adUIConfig");
        this.f7527g = C18201b.m44910D(oVar, AKPlaceholders.class, "placeholders");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C24362h.m61211f(jsonReader2, "reader");
        jsonReader.mo24995i();
        String str = null;
        String str2 = null;
        String str3 = null;
        AKBannerParams aKBannerParams = null;
        AKRollParams aKRollParams = null;
        AKLogLevel aKLogLevel = null;
        AKAdUIConfig aKAdUIConfig = null;
        AKPlaceholders aKPlaceholders = null;
        while (true) {
            AKPlaceholders aKPlaceholders2 = aKPlaceholders;
            if (jsonReader.mo24999v()) {
                switch (jsonReader2.mo24989O(this.f7521a)) {
                    case -1:
                        jsonReader.mo24991S();
                        jsonReader.mo24992T();
                        break;
                    case 0:
                        str = this.f7522b.mo11093a(jsonReader2);
                        if (str == null) {
                            throw C12977b.m32860m(MediationMetaData.KEY_VERSION, MediationMetaData.KEY_VERSION, jsonReader2);
                        }
                        break;
                    case 1:
                        str2 = this.f7522b.mo11093a(jsonReader2);
                        if (str2 == null) {
                            throw C12977b.m32860m(TwitterUser.DESCRIPTION_KEY, TwitterUser.DESCRIPTION_KEY, jsonReader2);
                        }
                        break;
                    case 2:
                        str3 = this.f7522b.mo11093a(jsonReader2);
                        if (str3 == null) {
                            throw C12977b.m32860m("publisherId", "publisher_id", jsonReader2);
                        }
                        break;
                    case 3:
                        aKBannerParams = this.f7523c.mo11093a(jsonReader2);
                        break;
                    case 4:
                        aKRollParams = this.f7524d.mo11093a(jsonReader2);
                        break;
                    case 5:
                        aKLogLevel = this.f7525e.mo11093a(jsonReader2);
                        if (aKLogLevel == null) {
                            throw C12977b.m32860m("logLevel", "log_level", jsonReader2);
                        }
                        break;
                    case 6:
                        aKAdUIConfig = this.f7526f.mo11093a(jsonReader2);
                        break;
                    case 7:
                        aKPlaceholders = this.f7527g.mo11093a(jsonReader2);
                        continue;
                }
                aKPlaceholders = aKPlaceholders2;
            } else {
                jsonReader.mo24997r();
                if (str == null) {
                    throw C12977b.m32854g(MediationMetaData.KEY_VERSION, MediationMetaData.KEY_VERSION, jsonReader2);
                } else if (str2 == null) {
                    throw C12977b.m32854g(TwitterUser.DESCRIPTION_KEY, TwitterUser.DESCRIPTION_KEY, jsonReader2);
                } else if (str3 == null) {
                    throw C12977b.m32854g("publisherId", "publisher_id", jsonReader2);
                } else if (aKLogLevel != null) {
                    return new AKHostedConfig(str, str2, str3, aKBannerParams, aKRollParams, aKLogLevel, aKAdUIConfig, aKPlaceholders2);
                } else {
                    throw C12977b.m32854g("logLevel", "log_level", jsonReader2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKHostedConfig aKHostedConfig = (AKHostedConfig) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKHostedConfig != null) {
            kVar.mo25074i();
            kVar.mo25077w(MediationMetaData.KEY_VERSION);
            this.f7522b.mo11094e(kVar, aKHostedConfig.getVersion());
            kVar.mo25077w(TwitterUser.DESCRIPTION_KEY);
            this.f7522b.mo11094e(kVar, aKHostedConfig.getDescription());
            kVar.mo25077w("publisher_id");
            this.f7522b.mo11094e(kVar, aKHostedConfig.getPublisherId());
            kVar.mo25077w("banner_params");
            this.f7523c.mo11094e(kVar, aKHostedConfig.getBannerParams());
            kVar.mo25077w("roll_params");
            this.f7524d.mo11094e(kVar, aKHostedConfig.getRollParams());
            kVar.mo25077w("log_level");
            this.f7525e.mo11094e(kVar, aKHostedConfig.getLogLevel());
            kVar.mo25077w("ad_ui_config");
            this.f7526f.mo11094e(kVar, aKHostedConfig.getAdUIConfig());
            kVar.mo25077w("placeholders");
            this.f7527g.mo11094e(kVar, aKHostedConfig.getPlaceholders());
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(36, "AKHostedConfig");
    }
}
