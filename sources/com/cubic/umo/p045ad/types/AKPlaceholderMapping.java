package com.cubic.umo.p045ad.types;

import androidx.annotation.Keep;
import ce0.C21100e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKPlaceholderMapping;", "", "bannerType", "", "placeholder", "(Ljava/lang/String;Ljava/lang/String;)V", "getBannerType", "()Ljava/lang/String;", "getPlaceholder", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
@C12944h(generateAdapter = true)
@Keep
/* renamed from: com.cubic.umo.ad.types.AKPlaceholderMapping */
public final class AKPlaceholderMapping {
    private final String bannerType;
    private final String placeholder;

    public AKPlaceholderMapping() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public AKPlaceholderMapping(@C12943g(name = "banner_type") String str, @C12943g(name = "placeholder") String str2) {
        this.bannerType = str;
        this.placeholder = str2;
    }

    public static /* synthetic */ AKPlaceholderMapping copy$default(AKPlaceholderMapping aKPlaceholderMapping, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aKPlaceholderMapping.bannerType;
        }
        if ((i & 2) != 0) {
            str2 = aKPlaceholderMapping.placeholder;
        }
        return aKPlaceholderMapping.copy(str, str2);
    }

    public final String component1() {
        return this.bannerType;
    }

    public final String component2() {
        return this.placeholder;
    }

    public final AKPlaceholderMapping copy(@C12943g(name = "banner_type") String str, @C12943g(name = "placeholder") String str2) {
        return new AKPlaceholderMapping(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKPlaceholderMapping)) {
            return false;
        }
        AKPlaceholderMapping aKPlaceholderMapping = (AKPlaceholderMapping) obj;
        return C24362h.m61206a(this.bannerType, aKPlaceholderMapping.bannerType) && C24362h.m61206a(this.placeholder, aKPlaceholderMapping.placeholder);
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        String str = this.bannerType;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.placeholder;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKPlaceholderMapping(bannerType=");
        J0.append(this.bannerType);
        J0.append(", placeholder=");
        return C0016g.m30n(J0, this.placeholder, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AKPlaceholderMapping(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
