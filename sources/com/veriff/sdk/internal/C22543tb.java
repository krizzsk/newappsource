package com.veriff.sdk.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/PoaData;", "Lmobi/lab/veriff/data/api/request/payload/UploadData;", "metadata", "Lmobi/lab/veriff/data/api/request/payload/PoaMetadata;", "(Lmobi/lab/veriff/data/api/request/payload/PoaMetadata;)V", "kind", "", "getKind", "()Ljava/lang/String;", "getMetadata", "()Lmobi/lab/veriff/data/api/request/payload/PoaMetadata;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tb */
public final class C22543tb extends C22547te {

    /* renamed from: a */
    private final String f56889a = "images";

    /* renamed from: b */
    private final C22544tc f56890b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22543tb(C22544tc tcVar) {
        super((DefaultConstructorMarker) null);
        C24362h.m61211f(tcVar, "metadata");
        this.f56890b = tcVar;
    }

    /* renamed from: a */
    public String mo56687a() {
        return this.f56889a;
    }

    /* renamed from: b */
    public C22544tc mo56689c() {
        return this.f56890b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22543tb) && C24362h.m61206a(mo56689c(), ((C22543tb) obj).mo56689c());
        }
        return true;
    }

    public int hashCode() {
        C22544tc b = mo56689c();
        if (b != null) {
            return b.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("PoaData(metadata=");
        k.append(mo56689c());
        k.append(")");
        return k.toString();
    }
}
