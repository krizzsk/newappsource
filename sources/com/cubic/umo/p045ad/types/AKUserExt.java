package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKUserExt;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKUserExt */
public final class AKUserExt {

    /* renamed from: a */
    public final String f7610a;

    /* renamed from: b */
    public final Integer f7611b;

    public AKUserExt(String str, Integer num) {
        this.f7610a = str;
        this.f7611b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKUserExt)) {
            return false;
        }
        AKUserExt aKUserExt = (AKUserExt) obj;
        return C24362h.m61206a(this.f7610a, aKUserExt.f7610a) && C24362h.m61206a(this.f7611b, aKUserExt.f7611b);
    }

    public final int hashCode() {
        String str = this.f7610a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f7611b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKUserExt(userid=");
        J0.append(this.f7610a);
        J0.append(", isanonymous=");
        J0.append(this.f7611b);
        J0.append(')');
        return J0.toString();
    }
}
