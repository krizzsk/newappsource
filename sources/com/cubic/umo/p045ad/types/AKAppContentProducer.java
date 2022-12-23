package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKAppContentProducer;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKAppContentProducer */
public final class AKAppContentProducer {

    /* renamed from: a */
    public final String f7385a;

    /* renamed from: b */
    public final String f7386b;

    /* renamed from: c */
    public final List<String> f7387c;

    /* renamed from: d */
    public final String f7388d;

    public AKAppContentProducer(String str, String str2, List<String> list, String str3) {
        this.f7385a = str;
        this.f7386b = str2;
        this.f7387c = list;
        this.f7388d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKAppContentProducer)) {
            return false;
        }
        AKAppContentProducer aKAppContentProducer = (AKAppContentProducer) obj;
        return C24362h.m61206a(this.f7385a, aKAppContentProducer.f7385a) && C24362h.m61206a(this.f7386b, aKAppContentProducer.f7386b) && C24362h.m61206a(this.f7387c, aKAppContentProducer.f7387c) && C24362h.m61206a(this.f7388d, aKAppContentProducer.f7388d);
    }

    public final int hashCode() {
        String str = this.f7385a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7386b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.f7387c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f7388d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKAppContentProducer(id=");
        J0.append(this.f7385a);
        J0.append(", name=");
        J0.append(this.f7386b);
        J0.append(", cat=");
        J0.append(this.f7387c);
        J0.append(", domain=");
        return C0016g.m30n(J0, this.f7388d, ')');
    }
}
