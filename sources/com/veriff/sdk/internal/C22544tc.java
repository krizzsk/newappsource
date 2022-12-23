package com.veriff.sdk.internal;

import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/PoaMetadata;", "Lmobi/lab/veriff/data/api/request/payload/UploadMetadata;", "context", "", "(Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tc */
public final class C22544tc implements C22548tf {

    /* renamed from: a */
    private final String f56891a;

    public C22544tc(String str) {
        C24362h.m61211f(str, AppActionRequest.KEY_CONTEXT);
        this.f56891a = str;
    }

    /* renamed from: a */
    public final String mo56693a() {
        return this.f56891a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22544tc) && C24362h.m61206a(this.f56891a, ((C22544tc) obj).f56891a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f56891a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0016g.m31o(C13555b.m33972k("PoaMetadata(context="), this.f56891a, ")");
    }
}
