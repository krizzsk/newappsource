package com.veriff.sdk.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00063"}, mo59060d2 = {"Lmobi/lab/veriff/data/api/request/response/StartSessionResponse;", "", "id", "", "status", "Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "initData", "Lmobi/lab/veriff/data/api/request/response/InitData;", "vendorIntegration", "Lmobi/lab/veriff/data/api/request/response/VendorIntegration;", "activeVerificationSession", "Lmobi/lab/veriff/data/api/request/response/VerificationSession;", "previousVerificationSessions", "", "activeProofOfAddressSession", "previousProofOfAddressSessions", "copyStrings", "Lmobi/lab/veriff/data/api/request/response/Strings;", "(Ljava/lang/String;Lmobi/lab/veriff/data/api/request/response/VerificationStatus;Lmobi/lab/veriff/data/api/request/response/InitData;Lmobi/lab/veriff/data/api/request/response/VendorIntegration;Lmobi/lab/veriff/data/api/request/response/VerificationSession;Ljava/util/List;Lmobi/lab/veriff/data/api/request/response/VerificationSession;Ljava/util/List;Lmobi/lab/veriff/data/api/request/response/Strings;)V", "getActiveProofOfAddressSession", "()Lmobi/lab/veriff/data/api/request/response/VerificationSession;", "getActiveVerificationSession", "getCopyStrings", "()Lmobi/lab/veriff/data/api/request/response/Strings;", "getId", "()Ljava/lang/String;", "getInitData", "()Lmobi/lab/veriff/data/api/request/response/InitData;", "getPreviousProofOfAddressSessions", "()Ljava/util/List;", "getPreviousVerificationSessions", "getStatus", "()Lmobi/lab/veriff/data/api/request/response/VerificationStatus;", "getVendorIntegration", "()Lmobi/lab/veriff/data/api/request/response/VendorIntegration;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.uz */
public final class C22609uz {

    /* renamed from: a */
    private final String f57020a;

    /* renamed from: b */
    private final C22621vh f57021b;

    /* renamed from: c */
    private final C22574ts f57022c;

    /* renamed from: d */
    private final C22616ve f57023d;

    /* renamed from: e */
    private final C22619vg f57024e;

    /* renamed from: f */
    private final List<C22619vg> f57025f;

    /* renamed from: g */
    private final C22619vg f57026g;

    /* renamed from: h */
    private final List<C22619vg> f57027h;

    /* renamed from: i */
    private final C22613vc f57028i;

    public C22609uz() {
        this((String) null, (C22621vh) null, (C22574ts) null, (C22616ve) null, (C22619vg) null, (List) null, (C22619vg) null, (List) null, (C22613vc) null, 511, (DefaultConstructorMarker) null);
    }

    public C22609uz(String str, C22621vh vhVar, C22574ts tsVar, C22616ve veVar, C22619vg vgVar, List<C22619vg> list, C22619vg vgVar2, List<C22619vg> list2, C22613vc vcVar) {
        this.f57020a = str;
        this.f57021b = vhVar;
        this.f57022c = tsVar;
        this.f57023d = veVar;
        this.f57024e = vgVar;
        this.f57025f = list;
        this.f57026g = vgVar2;
        this.f57027h = list2;
        this.f57028i = vcVar;
    }

    /* renamed from: a */
    public final C22609uz mo56902a(String str, C22621vh vhVar, C22574ts tsVar, C22616ve veVar, C22619vg vgVar, List<C22619vg> list, C22619vg vgVar2, List<C22619vg> list2, C22613vc vcVar) {
        return new C22609uz(str, vhVar, tsVar, veVar, vgVar, list, vgVar2, list2, vcVar);
    }

    /* renamed from: a */
    public final String mo56903a() {
        return this.f57020a;
    }

    /* renamed from: b */
    public final C22621vh mo56904b() {
        return this.f57021b;
    }

    /* renamed from: c */
    public final C22574ts mo56905c() {
        return this.f57022c;
    }

    /* renamed from: d */
    public final C22616ve mo56906d() {
        return this.f57023d;
    }

    /* renamed from: e */
    public final C22619vg mo56907e() {
        return this.f57024e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22609uz)) {
            return false;
        }
        C22609uz uzVar = (C22609uz) obj;
        return C24362h.m61206a(this.f57020a, uzVar.f57020a) && C24362h.m61206a(this.f57021b, uzVar.f57021b) && C24362h.m61206a(this.f57022c, uzVar.f57022c) && C24362h.m61206a(this.f57023d, uzVar.f57023d) && C24362h.m61206a(this.f57024e, uzVar.f57024e) && C24362h.m61206a(this.f57025f, uzVar.f57025f) && C24362h.m61206a(this.f57026g, uzVar.f57026g) && C24362h.m61206a(this.f57027h, uzVar.f57027h) && C24362h.m61206a(this.f57028i, uzVar.f57028i);
    }

    /* renamed from: f */
    public final List<C22619vg> mo56909f() {
        return this.f57025f;
    }

    /* renamed from: g */
    public final C22619vg mo56910g() {
        return this.f57026g;
    }

    /* renamed from: h */
    public final List<C22619vg> mo56911h() {
        return this.f57027h;
    }

    public int hashCode() {
        String str = this.f57020a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C22621vh vhVar = this.f57021b;
        int hashCode2 = (hashCode + (vhVar != null ? vhVar.hashCode() : 0)) * 31;
        C22574ts tsVar = this.f57022c;
        int hashCode3 = (hashCode2 + (tsVar != null ? tsVar.hashCode() : 0)) * 31;
        C22616ve veVar = this.f57023d;
        int hashCode4 = (hashCode3 + (veVar != null ? veVar.hashCode() : 0)) * 31;
        C22619vg vgVar = this.f57024e;
        int hashCode5 = (hashCode4 + (vgVar != null ? vgVar.hashCode() : 0)) * 31;
        List<C22619vg> list = this.f57025f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        C22619vg vgVar2 = this.f57026g;
        int hashCode7 = (hashCode6 + (vgVar2 != null ? vgVar2.hashCode() : 0)) * 31;
        List<C22619vg> list2 = this.f57027h;
        int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
        C22613vc vcVar = this.f57028i;
        if (vcVar != null) {
            i = vcVar.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public final C22613vc mo56913i() {
        return this.f57028i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("StartSessionResponse(id=");
        k.append(this.f57020a);
        k.append(", status=");
        k.append(this.f57021b);
        k.append(", initData=");
        k.append(this.f57022c);
        k.append(", vendorIntegration=");
        k.append(this.f57023d);
        k.append(", activeVerificationSession=");
        k.append(this.f57024e);
        k.append(", previousVerificationSessions=");
        k.append(this.f57025f);
        k.append(", activeProofOfAddressSession=");
        k.append(this.f57026g);
        k.append(", previousProofOfAddressSessions=");
        k.append(this.f57027h);
        k.append(", copyStrings=");
        k.append(this.f57028i);
        k.append(")");
        return k.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C22609uz(java.lang.String r11, com.veriff.sdk.internal.C22621vh r12, com.veriff.sdk.internal.C22574ts r13, com.veriff.sdk.internal.C22616ve r14, com.veriff.sdk.internal.C22619vg r15, java.util.List r16, com.veriff.sdk.internal.C22619vg r17, java.util.List r18, com.veriff.sdk.internal.C22613vc r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22609uz.<init>(java.lang.String, com.veriff.sdk.internal.vh, com.veriff.sdk.internal.ts, com.veriff.sdk.internal.ve, com.veriff.sdk.internal.vg, java.util.List, com.veriff.sdk.internal.vg, java.util.List, com.veriff.sdk.internal.vc, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
