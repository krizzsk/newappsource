package com.veriff.sdk.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/CountriesResponse;", "", "data", "", "Lmobi/lab/veriff/data/api/request/response/CountriesResponse$CountryData;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CountryData", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tl */
public final class C22554tl {

    /* renamed from: a */
    private final List<C22555a> f56915a;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/CountriesResponse$CountryData;", "", "code", "", "name", "documents", "", "matchIp", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getCode", "()Ljava/lang/String;", "getDocuments", "()Ljava/util/List;", "getMatchIp", "()Z", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.tl$a */
    public static final class C22555a {

        /* renamed from: a */
        private final String f56916a;

        /* renamed from: b */
        private final String f56917b;

        /* renamed from: c */
        private final List<String> f56918c;

        /* renamed from: d */
        private final boolean f56919d;

        public C22555a(String str, String str2, List<String> list, boolean z) {
            C24362h.m61211f(str, "code");
            C24362h.m61211f(str2, "name");
            C24362h.m61211f(list, "documents");
            this.f56916a = str;
            this.f56917b = str2;
            this.f56918c = list;
            this.f56919d = z;
        }

        /* renamed from: a */
        public static /* synthetic */ C22555a m54938a(C22555a aVar, String str, String str2, List<String> list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f56916a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f56917b;
            }
            if ((i & 4) != 0) {
                list = aVar.f56918c;
            }
            if ((i & 8) != 0) {
                z = aVar.f56919d;
            }
            return aVar.mo56731a(str, str2, list, z);
        }

        /* renamed from: a */
        public final C22555a mo56731a(String str, String str2, List<String> list, boolean z) {
            C24362h.m61211f(str, "code");
            C24362h.m61211f(str2, "name");
            C24362h.m61211f(list, "documents");
            return new C22555a(str, str2, list, z);
        }

        /* renamed from: a */
        public final String mo56732a() {
            return this.f56916a;
        }

        /* renamed from: b */
        public final String mo56733b() {
            return this.f56917b;
        }

        /* renamed from: c */
        public final List<String> mo56734c() {
            return this.f56918c;
        }

        /* renamed from: d */
        public final boolean mo56735d() {
            return this.f56919d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C22555a)) {
                return false;
            }
            C22555a aVar = (C22555a) obj;
            return C24362h.m61206a(this.f56916a, aVar.f56916a) && C24362h.m61206a(this.f56917b, aVar.f56917b) && C24362h.m61206a(this.f56918c, aVar.f56918c) && this.f56919d == aVar.f56919d;
        }

        public int hashCode() {
            String str = this.f56916a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f56917b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<String> list = this.f56918c;
            if (list != null) {
                i = list.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f56919d;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("CountryData(code=");
            k.append(this.f56916a);
            k.append(", name=");
            k.append(this.f56917b);
            k.append(", documents=");
            k.append(this.f56918c);
            k.append(", matchIp=");
            return C25541a.m63885p(k, this.f56919d, ")");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C22555a(String str, String str2, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, (i & 8) != 0 ? false : z);
        }
    }

    public C22554tl(List<C22555a> list) {
        this.f56915a = list;
    }

    /* renamed from: a */
    public final List<C22555a> mo56727a() {
        return this.f56915a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C22554tl) && C24362h.m61206a(this.f56915a, ((C22554tl) obj).f56915a);
        }
        return true;
    }

    public int hashCode() {
        List<C22555a> list = this.f56915a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("CountriesResponse(data=");
        k.append(this.f56915a);
        k.append(")");
        return k.toString();
    }
}
