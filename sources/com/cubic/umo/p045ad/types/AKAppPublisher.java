package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKAppPublisher;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKAppPublisher */
public final class AKAppPublisher {

    /* renamed from: a */
    public final String f7401a;

    /* renamed from: b */
    public final List<String> f7402b;

    public AKAppPublisher(String str, List<String> list) {
        this.f7401a = str;
        this.f7402b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKAppPublisher)) {
            return false;
        }
        AKAppPublisher aKAppPublisher = (AKAppPublisher) obj;
        return C24362h.m61206a(this.f7401a, aKAppPublisher.f7401a) && C24362h.m61206a(this.f7402b, aKAppPublisher.f7402b);
    }

    public final int hashCode() {
        String str = this.f7401a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.f7402b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKAppPublisher(name=");
        J0.append(this.f7401a);
        J0.append(", cat=");
        return C13555b.m33970i(J0, this.f7402b, ')');
    }
}
