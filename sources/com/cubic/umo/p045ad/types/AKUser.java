package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKUser;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKUser */
public final class AKUser {

    /* renamed from: a */
    public final Integer f7604a;

    /* renamed from: b */
    public final String f7605b;

    /* renamed from: c */
    public final String f7606c;

    /* renamed from: d */
    public final String f7607d;

    /* renamed from: e */
    public AKGeo f7608e;

    /* renamed from: f */
    public AKUserExt f7609f;

    public AKUser(String str, String str2, Integer num, String str3) {
        this.f7604a = num;
        this.f7605b = str;
        this.f7606c = str2;
        this.f7607d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKUser)) {
            return false;
        }
        AKUser aKUser = (AKUser) obj;
        return C24362h.m61206a(this.f7604a, aKUser.f7604a) && C24362h.m61206a(this.f7605b, aKUser.f7605b) && C24362h.m61206a(this.f7606c, aKUser.f7606c) && C24362h.m61206a(this.f7607d, aKUser.f7607d);
    }

    public final int hashCode() {
        Integer num = this.f7604a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f7605b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7606c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7607d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKUser(yob=");
        J0.append(this.f7604a);
        J0.append(", gender=");
        J0.append(this.f7605b);
        J0.append(", keywords=");
        J0.append(this.f7606c);
        J0.append(", customdata=");
        return C0016g.m30n(J0, this.f7607d, ')');
    }
}
