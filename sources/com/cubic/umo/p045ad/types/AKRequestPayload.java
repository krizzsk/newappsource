package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKRequestPayload;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKRequestPayload */
public final class AKRequestPayload {

    /* renamed from: a */
    public final String f7575a;

    /* renamed from: b */
    public List<AKImp> f7576b;

    /* renamed from: c */
    public AKApp f7577c;

    /* renamed from: d */
    public AKDevice f7578d;

    /* renamed from: e */
    public AKUser f7579e;

    /* renamed from: f */
    public AKPayloadExt f7580f;

    public AKRequestPayload() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public AKRequestPayload(String str) {
        C24362h.m61211f(str, "id");
        this.f7575a = str;
        this.f7576b = EmptyList.f60173b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AKRequestPayload) && C24362h.m61206a(this.f7575a, ((AKRequestPayload) obj).f7575a);
    }

    public final int hashCode() {
        return this.f7575a.hashCode();
    }

    public final String toString() {
        return C0017h.m57N(C21100e.m49315J0("AKRequestPayload(id="), this.f7575a, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AKRequestPayload(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "NA" : str);
    }
}
