package com.veriff.sdk.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/InitData;", "", "language", "", "callback", "preselectedDocument", "Lmobi/lab/veriff/data/api/request/response/Document;", "(Ljava/lang/String;Ljava/lang/String;Lmobi/lab/veriff/data/api/request/response/Document;)V", "getCallback", "()Ljava/lang/String;", "getLanguage", "getPreselectedDocument", "()Lmobi/lab/veriff/data/api/request/response/Document;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ts */
public final class C22574ts {

    /* renamed from: a */
    private final String f56953a;

    /* renamed from: b */
    private final String f56954b;

    /* renamed from: c */
    private final C22556tm f56955c;

    public C22574ts() {
        this((String) null, (String) null, (C22556tm) null, 7, (DefaultConstructorMarker) null);
    }

    public C22574ts(String str, String str2, C22556tm tmVar) {
        this.f56953a = str;
        this.f56954b = str2;
        this.f56955c = tmVar;
    }

    /* renamed from: a */
    public final C22574ts mo56819a(String str, String str2, C22556tm tmVar) {
        return new C22574ts(str, str2, tmVar);
    }

    /* renamed from: a */
    public final String mo56820a() {
        return this.f56953a;
    }

    /* renamed from: b */
    public final String mo56821b() {
        return this.f56954b;
    }

    /* renamed from: c */
    public final C22556tm mo56822c() {
        return this.f56955c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22574ts)) {
            return false;
        }
        C22574ts tsVar = (C22574ts) obj;
        return C24362h.m61206a(this.f56953a, tsVar.f56953a) && C24362h.m61206a(this.f56954b, tsVar.f56954b) && C24362h.m61206a(this.f56955c, tsVar.f56955c);
    }

    public int hashCode() {
        String str = this.f56953a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56954b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C22556tm tmVar = this.f56955c;
        if (tmVar != null) {
            i = tmVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("InitData(language=");
        k.append(this.f56953a);
        k.append(", callback=");
        k.append(this.f56954b);
        k.append(", preselectedDocument=");
        k.append(this.f56955c);
        k.append(")");
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22574ts(String str, String str2, C22556tm tmVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : tmVar);
    }
}
