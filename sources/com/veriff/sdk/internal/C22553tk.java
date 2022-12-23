package com.veriff.sdk.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p001a0.C0016g;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0004\u0010\u000f¨\u0006\u001d"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/ConfigurationResponse;", "", "browser", "", "isMobileDevice", "", "geoIpCountry", "geoIpState", "geoIpCity", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrowser", "()Ljava/lang/String;", "getGeoIpCity", "getGeoIpCountry", "getGeoIpState", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lmobi/lab/veriff/data/api/request/response/ConfigurationResponse;", "equals", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.tk */
public final class C22553tk {

    /* renamed from: a */
    private final String f56910a;

    /* renamed from: b */
    private final Boolean f56911b;

    /* renamed from: c */
    private final String f56912c;

    /* renamed from: d */
    private final String f56913d;

    /* renamed from: e */
    private final String f56914e;

    public C22553tk() {
        this((String) null, (Boolean) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public C22553tk(String str, Boolean bool, String str2, String str3, String str4) {
        this.f56910a = str;
        this.f56911b = bool;
        this.f56912c = str2;
        this.f56913d = str3;
        this.f56914e = str4;
    }

    /* renamed from: a */
    public final C22553tk mo56718a(String str, Boolean bool, String str2, String str3, String str4) {
        return new C22553tk(str, bool, str2, str3, str4);
    }

    /* renamed from: a */
    public final String mo56719a() {
        return this.f56910a;
    }

    /* renamed from: b */
    public final Boolean mo56720b() {
        return this.f56911b;
    }

    /* renamed from: c */
    public final String mo56721c() {
        return this.f56912c;
    }

    /* renamed from: d */
    public final String mo56722d() {
        return this.f56913d;
    }

    /* renamed from: e */
    public final String mo56723e() {
        return this.f56914e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22553tk)) {
            return false;
        }
        C22553tk tkVar = (C22553tk) obj;
        return C24362h.m61206a(this.f56910a, tkVar.f56910a) && C24362h.m61206a(this.f56911b, tkVar.f56911b) && C24362h.m61206a(this.f56912c, tkVar.f56912c) && C24362h.m61206a(this.f56913d, tkVar.f56913d) && C24362h.m61206a(this.f56914e, tkVar.f56914e);
    }

    public int hashCode() {
        String str = this.f56910a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.f56911b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str2 = this.f56912c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f56913d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f56914e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ConfigurationResponse(browser=");
        k.append(this.f56910a);
        k.append(", isMobileDevice=");
        k.append(this.f56911b);
        k.append(", geoIpCountry=");
        k.append(this.f56912c);
        k.append(", geoIpState=");
        k.append(this.f56913d);
        k.append(", geoIpCity=");
        return C0016g.m31o(k, this.f56914e, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C22553tk(java.lang.String r5, java.lang.Boolean r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22553tk.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
