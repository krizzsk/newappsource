package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0007HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/DocumentRequestPayload;", "", "type", "", "code", "(Ljava/lang/String;Ljava/lang/String;)V", "document", "Lmobi/lab/veriff/data/api/request/payload/DocumentRequestPayload$Document;", "(Lmobi/lab/veriff/data/api/request/payload/DocumentRequestPayload$Document;)V", "getDocument", "()Lmobi/lab/veriff/data/api/request/payload/DocumentRequestPayload$Document;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Document", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.so */
public final class C22528so {

    /* renamed from: a */
    private final C22529a f56834a;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/payload/DocumentRequestPayload$Document;", "", "type", "", "code", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.so$a */
    public static final class C22529a {

        /* renamed from: a */
        private final String f56835a;

        /* renamed from: b */
        private final String f56836b;

        public C22529a(String str, String str2) {
            C24362h.m61211f(str, "type");
            C24362h.m61211f(str2, "code");
            this.f56835a = str;
            this.f56836b = str2;
        }

        /* renamed from: a */
        public final String mo56658a() {
            return this.f56835a;
        }

        /* renamed from: b */
        public final String mo56659b() {
            return this.f56836b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22529a)) {
                return false;
            }
            C22529a aVar = (C22529a) obj;
            return C24362h.m61206a(this.f56835a, aVar.f56835a) && C24362h.m61206a(this.f56836b, aVar.f56836b);
        }

        public int hashCode() {
            String str = this.f56835a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f56836b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("Document(type=");
            k.append(this.f56835a);
            k.append(", code=");
            return C0016g.m31o(k, this.f56836b, ")");
        }
    }

    public C22528so(C22529a aVar) {
        C24362h.m61211f(aVar, "document");
        this.f56834a = aVar;
    }

    /* renamed from: a */
    public final C22529a mo56654a() {
        return this.f56834a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22528so) && C24362h.m61206a(this.f56834a, ((C22528so) obj).f56834a);
        }
        return true;
    }

    public int hashCode() {
        C22529a aVar = this.f56834a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("DocumentRequestPayload(document=");
        k.append(this.f56834a);
        k.append(")");
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C22528so(String str, String str2) {
        this(new C22529a(str, str2));
        C24362h.m61211f(str, "type");
        C24362h.m61211f(str2, "code");
    }
}
