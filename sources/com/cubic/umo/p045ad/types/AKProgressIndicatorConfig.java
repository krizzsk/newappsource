package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import ce0.C21100e;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKProgressIndicatorConfig;", "", "bgColor", "", "spinnerColor", "(Ljava/lang/String;Ljava/lang/String;)V", "getBgColor", "()Ljava/lang/String;", "getSpinnerColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKProgressIndicatorConfig */
public final class AKProgressIndicatorConfig {
    private final String bgColor;
    private final String spinnerColor;

    public AKProgressIndicatorConfig(@C12943g(name = "bg_color") String str, @C12943g(name = "spinner_color") String str2) {
        this.bgColor = str;
        this.spinnerColor = str2;
    }

    public static /* synthetic */ AKProgressIndicatorConfig copy$default(AKProgressIndicatorConfig aKProgressIndicatorConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aKProgressIndicatorConfig.bgColor;
        }
        if ((i & 2) != 0) {
            str2 = aKProgressIndicatorConfig.spinnerColor;
        }
        return aKProgressIndicatorConfig.copy(str, str2);
    }

    public final String component1() {
        return this.bgColor;
    }

    public final String component2() {
        return this.spinnerColor;
    }

    public final AKProgressIndicatorConfig copy(@C12943g(name = "bg_color") String str, @C12943g(name = "spinner_color") String str2) {
        return new AKProgressIndicatorConfig(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKProgressIndicatorConfig)) {
            return false;
        }
        AKProgressIndicatorConfig aKProgressIndicatorConfig = (AKProgressIndicatorConfig) obj;
        return C24362h.m61206a(this.bgColor, aKProgressIndicatorConfig.bgColor) && C24362h.m61206a(this.spinnerColor, aKProgressIndicatorConfig.spinnerColor);
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getSpinnerColor() {
        return this.spinnerColor;
    }

    public int hashCode() {
        String str = this.bgColor;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.spinnerColor;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKProgressIndicatorConfig(bgColor=");
        J0.append(this.bgColor);
        J0.append(", spinnerColor=");
        return C0016g.m30n(J0, this.spinnerColor, ')');
    }
}
