package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.appboy.models.outgoing.TwitterUser;
import com.unity3d.ads.metadata.MediationMetaData;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59059d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003Ja\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u0006."}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKHostedConfig;", "", "version", "", "description", "publisherId", "bannerParams", "Lcom/cubic/umo/ad/types/AKBannerParams;", "rollParams", "Lcom/cubic/umo/ad/types/AKRollParams;", "logLevel", "Lcom/cubic/umo/ad/types/AKLogLevel;", "adUIConfig", "Lcom/cubic/umo/ad/types/AKAdUIConfig;", "placeholders", "Lcom/cubic/umo/ad/types/AKPlaceholders;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/cubic/umo/ad/types/AKBannerParams;Lcom/cubic/umo/ad/types/AKRollParams;Lcom/cubic/umo/ad/types/AKLogLevel;Lcom/cubic/umo/ad/types/AKAdUIConfig;Lcom/cubic/umo/ad/types/AKPlaceholders;)V", "getAdUIConfig", "()Lcom/cubic/umo/ad/types/AKAdUIConfig;", "getBannerParams", "()Lcom/cubic/umo/ad/types/AKBannerParams;", "getDescription", "()Ljava/lang/String;", "getLogLevel", "()Lcom/cubic/umo/ad/types/AKLogLevel;", "getPlaceholders", "()Lcom/cubic/umo/ad/types/AKPlaceholders;", "getPublisherId", "getRollParams", "()Lcom/cubic/umo/ad/types/AKRollParams;", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKHostedConfig */
public final class AKHostedConfig {
    private final AKAdUIConfig adUIConfig;
    private final AKBannerParams bannerParams;
    private final String description;
    private final AKLogLevel logLevel;
    private final AKPlaceholders placeholders;
    private final String publisherId;
    private final AKRollParams rollParams;
    private final String version;

    public AKHostedConfig(@C12943g(name = "version") String str, @C12943g(name = "description") String str2, @C12943g(name = "publisher_id") String str3, @C12943g(name = "banner_params") AKBannerParams aKBannerParams, @C12943g(name = "roll_params") AKRollParams aKRollParams, @C12943g(name = "log_level") AKLogLevel aKLogLevel, @C12943g(name = "ad_ui_config") AKAdUIConfig aKAdUIConfig, @C12943g(name = "placeholders") AKPlaceholders aKPlaceholders) {
        C24362h.m61211f(str, MediationMetaData.KEY_VERSION);
        C24362h.m61211f(str2, TwitterUser.DESCRIPTION_KEY);
        C24362h.m61211f(str3, "publisherId");
        C24362h.m61211f(aKLogLevel, "logLevel");
        this.version = str;
        this.description = str2;
        this.publisherId = str3;
        this.bannerParams = aKBannerParams;
        this.rollParams = aKRollParams;
        this.logLevel = aKLogLevel;
        this.adUIConfig = aKAdUIConfig;
        this.placeholders = aKPlaceholders;
    }

    public static /* synthetic */ AKHostedConfig copy$default(AKHostedConfig aKHostedConfig, String str, String str2, String str3, AKBannerParams aKBannerParams, AKRollParams aKRollParams, AKLogLevel aKLogLevel, AKAdUIConfig aKAdUIConfig, AKPlaceholders aKPlaceholders, int i, Object obj) {
        AKHostedConfig aKHostedConfig2 = aKHostedConfig;
        int i2 = i;
        return aKHostedConfig.copy((i2 & 1) != 0 ? aKHostedConfig2.version : str, (i2 & 2) != 0 ? aKHostedConfig2.description : str2, (i2 & 4) != 0 ? aKHostedConfig2.publisherId : str3, (i2 & 8) != 0 ? aKHostedConfig2.bannerParams : aKBannerParams, (i2 & 16) != 0 ? aKHostedConfig2.rollParams : aKRollParams, (i2 & 32) != 0 ? aKHostedConfig2.logLevel : aKLogLevel, (i2 & 64) != 0 ? aKHostedConfig2.adUIConfig : aKAdUIConfig, (i2 & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? aKHostedConfig2.placeholders : aKPlaceholders);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.publisherId;
    }

    public final AKBannerParams component4() {
        return this.bannerParams;
    }

    public final AKRollParams component5() {
        return this.rollParams;
    }

    public final AKLogLevel component6() {
        return this.logLevel;
    }

    public final AKAdUIConfig component7() {
        return this.adUIConfig;
    }

    public final AKPlaceholders component8() {
        return this.placeholders;
    }

    public final AKHostedConfig copy(@C12943g(name = "version") String str, @C12943g(name = "description") String str2, @C12943g(name = "publisher_id") String str3, @C12943g(name = "banner_params") AKBannerParams aKBannerParams, @C12943g(name = "roll_params") AKRollParams aKRollParams, @C12943g(name = "log_level") AKLogLevel aKLogLevel, @C12943g(name = "ad_ui_config") AKAdUIConfig aKAdUIConfig, @C12943g(name = "placeholders") AKPlaceholders aKPlaceholders) {
        C24362h.m61211f(str, MediationMetaData.KEY_VERSION);
        C24362h.m61211f(str2, TwitterUser.DESCRIPTION_KEY);
        C24362h.m61211f(str3, "publisherId");
        AKLogLevel aKLogLevel2 = aKLogLevel;
        C24362h.m61211f(aKLogLevel2, "logLevel");
        return new AKHostedConfig(str, str2, str3, aKBannerParams, aKRollParams, aKLogLevel2, aKAdUIConfig, aKPlaceholders);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKHostedConfig)) {
            return false;
        }
        AKHostedConfig aKHostedConfig = (AKHostedConfig) obj;
        return C24362h.m61206a(this.version, aKHostedConfig.version) && C24362h.m61206a(this.description, aKHostedConfig.description) && C24362h.m61206a(this.publisherId, aKHostedConfig.publisherId) && C24362h.m61206a(this.bannerParams, aKHostedConfig.bannerParams) && C24362h.m61206a(this.rollParams, aKHostedConfig.rollParams) && C24362h.m61206a(this.logLevel, aKHostedConfig.logLevel) && C24362h.m61206a(this.adUIConfig, aKHostedConfig.adUIConfig) && C24362h.m61206a(this.placeholders, aKHostedConfig.placeholders);
    }

    public final AKAdUIConfig getAdUIConfig() {
        return this.adUIConfig;
    }

    public final AKBannerParams getBannerParams() {
        return this.bannerParams;
    }

    public final String getDescription() {
        return this.description;
    }

    public final AKLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final AKPlaceholders getPlaceholders() {
        return this.placeholders;
    }

    public final String getPublisherId() {
        return this.publisherId;
    }

    public final AKRollParams getRollParams() {
        return this.rollParams;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int I0 = C21100e.m49313I0(C21100e.m49313I0(this.version.hashCode() * 31, this.description), this.publisherId);
        AKBannerParams aKBannerParams = this.bannerParams;
        int i4 = 0;
        if (aKBannerParams == null) {
            i = 0;
        } else {
            i = aKBannerParams.hashCode();
        }
        int i5 = (I0 + i) * 31;
        AKRollParams aKRollParams = this.rollParams;
        if (aKRollParams == null) {
            i2 = 0;
        } else {
            i2 = aKRollParams.hashCode();
        }
        int hashCode = (this.logLevel.hashCode() + ((i5 + i2) * 31)) * 31;
        AKAdUIConfig aKAdUIConfig = this.adUIConfig;
        if (aKAdUIConfig == null) {
            i3 = 0;
        } else {
            i3 = aKAdUIConfig.hashCode();
        }
        int i6 = (hashCode + i3) * 31;
        AKPlaceholders aKPlaceholders = this.placeholders;
        if (aKPlaceholders != null) {
            i4 = aKPlaceholders.hashCode();
        }
        return i6 + i4;
    }

    public String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKHostedConfig(version=");
        J0.append(this.version);
        J0.append(", description=");
        J0.append(this.description);
        J0.append(", publisherId=");
        J0.append(this.publisherId);
        J0.append(", bannerParams=");
        J0.append(this.bannerParams);
        J0.append(", rollParams=");
        J0.append(this.rollParams);
        J0.append(", logLevel=");
        J0.append(this.logLevel);
        J0.append(", adUIConfig=");
        J0.append(this.adUIConfig);
        J0.append(", placeholders=");
        J0.append(this.placeholders);
        J0.append(')');
        return J0.toString();
    }
}
