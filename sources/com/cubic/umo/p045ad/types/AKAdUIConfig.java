package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import ce0.C21100e;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKAdUIConfig;", "", "progressIndicatorConfig", "Lcom/cubic/umo/ad/types/AKProgressIndicatorConfig;", "umoVideoAdUIConfig", "Lcom/cubic/umo/ad/types/AKUmoVideoAdUIConfig;", "(Lcom/cubic/umo/ad/types/AKProgressIndicatorConfig;Lcom/cubic/umo/ad/types/AKUmoVideoAdUIConfig;)V", "getProgressIndicatorConfig", "()Lcom/cubic/umo/ad/types/AKProgressIndicatorConfig;", "getUmoVideoAdUIConfig", "()Lcom/cubic/umo/ad/types/AKUmoVideoAdUIConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKAdUIConfig */
public final class AKAdUIConfig {
    private final AKProgressIndicatorConfig progressIndicatorConfig;
    private final AKUmoVideoAdUIConfig umoVideoAdUIConfig;

    public AKAdUIConfig(@C12943g(name = "progress_indicator") AKProgressIndicatorConfig aKProgressIndicatorConfig, @C12943g(name = "umo_video_ad") AKUmoVideoAdUIConfig aKUmoVideoAdUIConfig) {
        this.progressIndicatorConfig = aKProgressIndicatorConfig;
        this.umoVideoAdUIConfig = aKUmoVideoAdUIConfig;
    }

    public static /* synthetic */ AKAdUIConfig copy$default(AKAdUIConfig aKAdUIConfig, AKProgressIndicatorConfig aKProgressIndicatorConfig, AKUmoVideoAdUIConfig aKUmoVideoAdUIConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            aKProgressIndicatorConfig = aKAdUIConfig.progressIndicatorConfig;
        }
        if ((i & 2) != 0) {
            aKUmoVideoAdUIConfig = aKAdUIConfig.umoVideoAdUIConfig;
        }
        return aKAdUIConfig.copy(aKProgressIndicatorConfig, aKUmoVideoAdUIConfig);
    }

    public final AKProgressIndicatorConfig component1() {
        return this.progressIndicatorConfig;
    }

    public final AKUmoVideoAdUIConfig component2() {
        return this.umoVideoAdUIConfig;
    }

    public final AKAdUIConfig copy(@C12943g(name = "progress_indicator") AKProgressIndicatorConfig aKProgressIndicatorConfig, @C12943g(name = "umo_video_ad") AKUmoVideoAdUIConfig aKUmoVideoAdUIConfig) {
        return new AKAdUIConfig(aKProgressIndicatorConfig, aKUmoVideoAdUIConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKAdUIConfig)) {
            return false;
        }
        AKAdUIConfig aKAdUIConfig = (AKAdUIConfig) obj;
        return C24362h.m61206a(this.progressIndicatorConfig, aKAdUIConfig.progressIndicatorConfig) && C24362h.m61206a(this.umoVideoAdUIConfig, aKAdUIConfig.umoVideoAdUIConfig);
    }

    public final AKProgressIndicatorConfig getProgressIndicatorConfig() {
        return this.progressIndicatorConfig;
    }

    public final AKUmoVideoAdUIConfig getUmoVideoAdUIConfig() {
        return this.umoVideoAdUIConfig;
    }

    public int hashCode() {
        AKProgressIndicatorConfig aKProgressIndicatorConfig = this.progressIndicatorConfig;
        int i = 0;
        int hashCode = (aKProgressIndicatorConfig == null ? 0 : aKProgressIndicatorConfig.hashCode()) * 31;
        AKUmoVideoAdUIConfig aKUmoVideoAdUIConfig = this.umoVideoAdUIConfig;
        if (aKUmoVideoAdUIConfig != null) {
            i = aKUmoVideoAdUIConfig.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKAdUIConfig(progressIndicatorConfig=");
        J0.append(this.progressIndicatorConfig);
        J0.append(", umoVideoAdUIConfig=");
        J0.append(this.umoVideoAdUIConfig);
        J0.append(')');
        return J0.toString();
    }
}
