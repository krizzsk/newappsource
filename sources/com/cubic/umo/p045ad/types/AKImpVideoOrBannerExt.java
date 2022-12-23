package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKImpVideoOrBannerExt;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKImpVideoOrBannerExt */
public final class AKImpVideoOrBannerExt {

    /* renamed from: a */
    public final String f7546a;

    /* renamed from: b */
    public String f7547b;

    /* renamed from: c */
    public final Boolean f7548c;

    public AKImpVideoOrBannerExt(String str, String str2, Boolean bool) {
        C24362h.m61211f(str, "qsparams");
        this.f7546a = str;
        this.f7547b = str2;
        this.f7548c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKImpVideoOrBannerExt)) {
            return false;
        }
        AKImpVideoOrBannerExt aKImpVideoOrBannerExt = (AKImpVideoOrBannerExt) obj;
        return C24362h.m61206a(this.f7546a, aKImpVideoOrBannerExt.f7546a) && C24362h.m61206a(this.f7547b, aKImpVideoOrBannerExt.f7547b) && C24362h.m61206a(this.f7548c, aKImpVideoOrBannerExt.f7548c);
    }

    public final int hashCode() {
        int hashCode = this.f7546a.hashCode() * 31;
        String str = this.f7547b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f7548c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKImpVideoOrBannerExt(qsparams=");
        J0.append(this.f7546a);
        J0.append(", slot=");
        J0.append(this.f7547b);
        J0.append(", isstandardtype=");
        J0.append(this.f7548c);
        J0.append(')');
        return J0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AKImpVideoOrBannerExt(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}
