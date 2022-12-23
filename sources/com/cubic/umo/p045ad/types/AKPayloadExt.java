package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12944h;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKPayloadExt;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKPayloadExt */
public final class AKPayloadExt {

    /* renamed from: a */
    public final String f7556a;

    /* renamed from: b */
    public final String f7557b;

    /* renamed from: c */
    public final String f7558c;

    /* renamed from: d */
    public final boolean f7559d;

    /* renamed from: e */
    public final Integer f7560e;

    public AKPayloadExt(String str, String str2, String str3, boolean z, Integer num) {
        C13437d.m33711q(str, "publisherid", str2, "adkitversion", str3, "tsadkitversion");
        this.f7556a = str;
        this.f7557b = str2;
        this.f7558c = str3;
        this.f7559d = z;
        this.f7560e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKPayloadExt)) {
            return false;
        }
        AKPayloadExt aKPayloadExt = (AKPayloadExt) obj;
        return C24362h.m61206a(this.f7556a, aKPayloadExt.f7556a) && C24362h.m61206a(this.f7557b, aKPayloadExt.f7557b) && C24362h.m61206a(this.f7558c, aKPayloadExt.f7558c) && this.f7559d == aKPayloadExt.f7559d && C24362h.m61206a(this.f7560e, aKPayloadExt.f7560e);
    }

    public final int hashCode() {
        int i;
        int I0 = C21100e.m49313I0(C21100e.m49313I0(this.f7556a.hashCode() * 31, this.f7557b), this.f7558c);
        boolean z = this.f7559d;
        if (z) {
            z = true;
        }
        int i2 = (I0 + (z ? 1 : 0)) * 31;
        Integer num = this.f7560e;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKPayloadExt(publisherid=");
        J0.append(this.f7556a);
        J0.append(", adkitversion=");
        J0.append(this.f7557b);
        J0.append(", tsadkitversion=");
        J0.append(this.f7558c);
        J0.append(", isprefetch=");
        J0.append(this.f7559d);
        J0.append(", gdpr=");
        J0.append(this.f7560e);
        J0.append(')');
        return J0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AKPayloadExt(String str, String str2, String str3, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "1.4.10" : str3, (i & 8) != 0 ? false : z, num);
    }
}
