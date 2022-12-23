package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKDeviceGeoExt;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKDeviceGeoExt */
public final class AKDeviceGeoExt {

    /* renamed from: a */
    public final String f7480a;

    /* renamed from: b */
    public final String f7481b;

    /* renamed from: c */
    public final String f7482c;

    public AKDeviceGeoExt(String str, String str2, String str3) {
        C24362h.m61211f(str, "timezone");
        this.f7480a = str;
        this.f7481b = str2;
        this.f7482c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKDeviceGeoExt)) {
            return false;
        }
        AKDeviceGeoExt aKDeviceGeoExt = (AKDeviceGeoExt) obj;
        return C24362h.m61206a(this.f7480a, aKDeviceGeoExt.f7480a) && C24362h.m61206a(this.f7481b, aKDeviceGeoExt.f7481b) && C24362h.m61206a(this.f7482c, aKDeviceGeoExt.f7482c);
    }

    public final int hashCode() {
        return this.f7482c.hashCode() + C21100e.m49313I0(this.f7480a.hashCode() * 31, this.f7481b);
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKDeviceGeoExt(timezone=");
        J0.append(this.f7480a);
        J0.append(", region=");
        J0.append(this.f7481b);
        J0.append(", umoregion=");
        return C0017h.m57N(J0, this.f7482c, ')');
    }
}
