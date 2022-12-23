package com.cubic.umo.api;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo59060d2 = {"Lcom/cubic/umo/api/ErrorResource;", "", "", "status", "", "message", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/cubic/umo/api/ErrorResource;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "core_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class ErrorResource {

    /* renamed from: a */
    public final Integer f7723a;

    /* renamed from: b */
    public final String f7724b;

    public ErrorResource(@C12943g(name = "statusCode") Integer num, @C12943g(name = "message") String str) {
        this.f7723a = num;
        this.f7724b = str;
    }

    public final ErrorResource copy(@C12943g(name = "statusCode") Integer num, @C12943g(name = "message") String str) {
        return new ErrorResource(num, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResource)) {
            return false;
        }
        ErrorResource errorResource = (ErrorResource) obj;
        return C24362h.m61206a(this.f7723a, errorResource.f7723a) && C24362h.m61206a(this.f7724b, errorResource.f7724b);
    }

    public final int hashCode() {
        Integer num = this.f7723a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f7724b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ErrorResource(status=");
        k.append(this.f7723a);
        k.append(", message=");
        return C0016g.m30n(k, this.f7724b, ')');
    }
}
