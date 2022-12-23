package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKGeo;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKGeo */
public final class AKGeo {

    /* renamed from: a */
    public final String f7504a;

    /* renamed from: b */
    public final String f7505b;

    /* renamed from: c */
    public final String f7506c;

    /* renamed from: d */
    public final String f7507d;

    /* renamed from: e */
    public final String f7508e;

    /* renamed from: f */
    public final String f7509f;

    /* renamed from: g */
    public final String f7510g;

    /* renamed from: h */
    public AKDeviceGeoExt f7511h;

    public AKGeo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public AKGeo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7504a = str;
        this.f7505b = str2;
        this.f7506c = str3;
        this.f7507d = str4;
        this.f7508e = str5;
        this.f7509f = str6;
        this.f7510g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKGeo)) {
            return false;
        }
        AKGeo aKGeo = (AKGeo) obj;
        return C24362h.m61206a(this.f7504a, aKGeo.f7504a) && C24362h.m61206a(this.f7505b, aKGeo.f7505b) && C24362h.m61206a(this.f7506c, aKGeo.f7506c) && C24362h.m61206a(this.f7507d, aKGeo.f7507d) && C24362h.m61206a(this.f7508e, aKGeo.f7508e) && C24362h.m61206a(this.f7509f, aKGeo.f7509f) && C24362h.m61206a(this.f7510g, aKGeo.f7510g);
    }

    public final int hashCode() {
        String str = this.f7504a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7505b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7506c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f7507d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f7508e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f7509f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f7510g;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKGeo(lat=");
        J0.append(this.f7504a);
        J0.append(", lon=");
        J0.append(this.f7505b);
        J0.append(", utcoffset=");
        J0.append(this.f7506c);
        J0.append(", country=");
        J0.append(this.f7507d);
        J0.append(", region=");
        J0.append(this.f7508e);
        J0.append(", city=");
        J0.append(this.f7509f);
        J0.append(", zip=");
        return C0016g.m30n(J0, this.f7510g, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AKGeo(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            java.lang.String r9 = ""
        L_0x0015:
            r2 = r9
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKGeo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
