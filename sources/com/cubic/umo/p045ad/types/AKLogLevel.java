package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import ce0.C21100e;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0017h;

@Metadata(mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKLogLevel;", "", "adKitLogLevel", "", "(Ljava/lang/String;)V", "getAdKitLogLevel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKLogLevel */
public final class AKLogLevel {
    private final String adKitLogLevel;

    public AKLogLevel(@C12943g(name = "ad_kit") String str) {
        C24362h.m61211f(str, "adKitLogLevel");
        this.adKitLogLevel = str;
    }

    public static /* synthetic */ AKLogLevel copy$default(AKLogLevel aKLogLevel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aKLogLevel.adKitLogLevel;
        }
        return aKLogLevel.copy(str);
    }

    public final String component1() {
        return this.adKitLogLevel;
    }

    public final AKLogLevel copy(@C12943g(name = "ad_kit") String str) {
        C24362h.m61211f(str, "adKitLogLevel");
        return new AKLogLevel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AKLogLevel) && C24362h.m61206a(this.adKitLogLevel, ((AKLogLevel) obj).adKitLogLevel);
    }

    public final String getAdKitLogLevel() {
        return this.adKitLogLevel;
    }

    public int hashCode() {
        return this.adKitLogLevel.hashCode();
    }

    public String toString() {
        return C0017h.m57N(C21100e.m49315J0("AKLogLevel(adKitLogLevel="), this.adKitLogLevel, ')');
    }
}
