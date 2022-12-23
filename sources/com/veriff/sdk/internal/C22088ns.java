package com.veriff.sdk.internal;

import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Map;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/legacy/ParsedSessionUrl;", "", "baseUrl", "", "token", "queryParameters", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBaseUrl", "()Ljava/lang/String;", "getQueryParameters", "()Ljava/util/Map;", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ns */
final class C22088ns {

    /* renamed from: a */
    private final String f55724a;

    /* renamed from: b */
    private final String f55725b;

    /* renamed from: c */
    private final Map<String, String> f55726c;

    public C22088ns(String str, String str2, Map<String, String> map) {
        C24362h.m61211f(str, "baseUrl");
        C24362h.m61211f(str2, FirebaseMessagingService.EXTRA_TOKEN);
        C24362h.m61211f(map, "queryParameters");
        this.f55724a = str;
        this.f55725b = str2;
        this.f55726c = map;
    }

    /* renamed from: a */
    public final String mo55985a() {
        return this.f55724a;
    }

    /* renamed from: b */
    public final String mo55986b() {
        return this.f55725b;
    }

    /* renamed from: c */
    public final Map<String, String> mo55987c() {
        return this.f55726c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22088ns)) {
            return false;
        }
        C22088ns nsVar = (C22088ns) obj;
        return C24362h.m61206a(this.f55724a, nsVar.f55724a) && C24362h.m61206a(this.f55725b, nsVar.f55725b) && C24362h.m61206a(this.f55726c, nsVar.f55726c);
    }

    public int hashCode() {
        String str = this.f55724a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f55725b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.f55726c;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ParsedSessionUrl(baseUrl=");
        k.append(this.f55724a);
        k.append(", token=");
        k.append(this.f55725b);
        k.append(", queryParameters=");
        k.append(this.f55726c);
        k.append(")");
        return k.toString();
    }
}
