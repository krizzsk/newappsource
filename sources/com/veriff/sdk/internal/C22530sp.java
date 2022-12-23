package com.veriff.sdk.internal;

import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/EventRequestPayload;", "", "event", "Lcom/veriff/sdk/internal/analytics/Event;", "(Lcom/veriff/sdk/internal/analytics/Event;)V", "events", "", "(Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sp */
public final class C22530sp {

    /* renamed from: a */
    private final List<C21667gf> f56837a;

    public C22530sp(List<C21667gf> list) {
        C24362h.m61211f(list, "events");
        this.f56837a = list;
    }

    /* renamed from: a */
    public final List<C21667gf> mo56663a() {
        return this.f56837a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22530sp) && C24362h.m61206a(this.f56837a, ((C22530sp) obj).f56837a);
        }
        return true;
    }

    public int hashCode() {
        List<C21667gf> list = this.f56837a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("EventRequestPayload(events=");
        k.append(this.f56837a);
        k.append(")");
        return k.toString();
    }
}
