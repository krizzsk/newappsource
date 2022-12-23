package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKApp;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKApp */
public final class AKApp {

    /* renamed from: a */
    public final String f7343a;

    /* renamed from: b */
    public final String f7344b;

    /* renamed from: c */
    public final String f7345c;

    /* renamed from: d */
    public final String f7346d;

    /* renamed from: e */
    public final String f7347e;

    /* renamed from: f */
    public final List<String> f7348f;

    /* renamed from: g */
    public final List<String> f7349g;

    /* renamed from: h */
    public final List<String> f7350h;

    /* renamed from: i */
    public final Integer f7351i;

    /* renamed from: j */
    public final Integer f7352j;

    /* renamed from: k */
    public final String f7353k;

    /* renamed from: l */
    public AKAppPublisher f7354l;

    /* renamed from: m */
    public AKAppContent f7355m;

    /* renamed from: n */
    public AKExt f7356n;

    public AKApp(String str, String str2, String str3, String str4, String str5, List<String> list, List<String> list2, List<String> list3, Integer num, Integer num2, String str6) {
        String str7 = str;
        C13437d.m33711q(str7, "name", str2, "bundle", str3, "ver");
        this.f7343a = str7;
        this.f7344b = str2;
        this.f7345c = str3;
        this.f7346d = str4;
        this.f7347e = str5;
        this.f7348f = list;
        this.f7349g = list2;
        this.f7350h = list3;
        this.f7351i = num;
        this.f7352j = num2;
        this.f7353k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKApp)) {
            return false;
        }
        AKApp aKApp = (AKApp) obj;
        return C24362h.m61206a(this.f7343a, aKApp.f7343a) && C24362h.m61206a(this.f7344b, aKApp.f7344b) && C24362h.m61206a(this.f7345c, aKApp.f7345c) && C24362h.m61206a(this.f7346d, aKApp.f7346d) && C24362h.m61206a(this.f7347e, aKApp.f7347e) && C24362h.m61206a(this.f7348f, aKApp.f7348f) && C24362h.m61206a(this.f7349g, aKApp.f7349g) && C24362h.m61206a(this.f7350h, aKApp.f7350h) && C24362h.m61206a(this.f7351i, aKApp.f7351i) && C24362h.m61206a(this.f7352j, aKApp.f7352j) && C24362h.m61206a(this.f7353k, aKApp.f7353k);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int I0 = C21100e.m49313I0(C21100e.m49313I0(this.f7343a.hashCode() * 31, this.f7344b), this.f7345c);
        String str = this.f7346d;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (I0 + i) * 31;
        String str2 = this.f7347e;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i11 = (i9 + i2) * 31;
        List<String> list = this.f7348f;
        if (list == null) {
            i3 = 0;
        } else {
            i3 = list.hashCode();
        }
        int i12 = (i11 + i3) * 31;
        List<String> list2 = this.f7349g;
        if (list2 == null) {
            i4 = 0;
        } else {
            i4 = list2.hashCode();
        }
        int i13 = (i12 + i4) * 31;
        List<String> list3 = this.f7350h;
        if (list3 == null) {
            i5 = 0;
        } else {
            i5 = list3.hashCode();
        }
        int i14 = (i13 + i5) * 31;
        Integer num = this.f7351i;
        if (num == null) {
            i6 = 0;
        } else {
            i6 = num.hashCode();
        }
        int i15 = (i14 + i6) * 31;
        Integer num2 = this.f7352j;
        if (num2 == null) {
            i7 = 0;
        } else {
            i7 = num2.hashCode();
        }
        int i16 = (i15 + i7) * 31;
        String str3 = this.f7353k;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return i16 + i8;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AKApp(name=");
        k.append(this.f7343a);
        k.append(", bundle=");
        k.append(this.f7344b);
        k.append(", ver=");
        k.append(this.f7345c);
        k.append(", domain=");
        k.append(this.f7346d);
        k.append(", storeurl=");
        k.append(this.f7347e);
        k.append(", cat=");
        k.append(this.f7348f);
        k.append(", sectioncat=");
        k.append(this.f7349g);
        k.append(", pagecat=");
        k.append(this.f7350h);
        k.append(", privacypolicy=");
        k.append(this.f7351i);
        k.append(", paid=");
        k.append(this.f7352j);
        k.append(", keywords=");
        return C0016g.m30n(k, this.f7353k, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AKApp(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.List r20, java.util.List r21, java.util.List r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 32
            if (r1 == 0) goto L_0x000a
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.f60173b
            r8 = r1
            goto L_0x000c
        L_0x000a:
            r8 = r20
        L_0x000c:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0014
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.f60173b
            r9 = r1
            goto L_0x0016
        L_0x0014:
            r9 = r21
        L_0x0016:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x001e
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.f60173b
            r10 = r1
            goto L_0x0020
        L_0x001e:
            r10 = r22
        L_0x0020:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = -1
            if (r1 == 0) goto L_0x002b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r11 = r1
            goto L_0x002d
        L_0x002b:
            r11 = r23
        L_0x002d:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0037
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r12 = r0
            goto L_0x0039
        L_0x0037:
            r12 = r24
        L_0x0039:
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r13 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKApp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
