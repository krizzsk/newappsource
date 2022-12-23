package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12944h;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKImp;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKImp */
public final class AKImp {

    /* renamed from: a */
    public final String f7528a;

    /* renamed from: b */
    public final String f7529b;

    /* renamed from: c */
    public final String f7530c;

    /* renamed from: d */
    public final int f7531d;

    /* renamed from: e */
    public final int f7532e;

    /* renamed from: f */
    public final int f7533f;

    /* renamed from: g */
    public final List<String> f7534g;

    /* renamed from: h */
    public AKBanner f7535h;

    /* renamed from: i */
    public AKVideo f7536i;

    /* renamed from: j */
    public AKExt f7537j;

    public AKImp() {
        this((String) null, (String) null, (String) null, 0, 0, 0, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public AKImp(String str, String str2, String str3, int i, int i2, int i3, List<String> list) {
        C13437d.m33711q(str, "id", str2, "displaymanager", str3, "displaymanagerver");
        this.f7528a = str;
        this.f7529b = str2;
        this.f7530c = str3;
        this.f7531d = i;
        this.f7532e = i2;
        this.f7533f = i3;
        this.f7534g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKImp)) {
            return false;
        }
        AKImp aKImp = (AKImp) obj;
        return C24362h.m61206a(this.f7528a, aKImp.f7528a) && C24362h.m61206a(this.f7529b, aKImp.f7529b) && C24362h.m61206a(this.f7530c, aKImp.f7530c) && this.f7531d == aKImp.f7531d && this.f7532e == aKImp.f7532e && this.f7533f == aKImp.f7533f && C24362h.m61206a(this.f7534g, aKImp.f7534g);
    }

    public final int hashCode() {
        int i;
        int I0 = C21100e.m49313I0(C21100e.m49313I0(this.f7528a.hashCode() * 31, this.f7529b), this.f7530c);
        int i2 = this.f7532e;
        int i3 = (this.f7533f + ((i2 + ((this.f7531d + I0) * 31)) * 31)) * 31;
        List<String> list = this.f7534g;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKImp(id=");
        J0.append(this.f7528a);
        J0.append(", displaymanager=");
        J0.append(this.f7529b);
        J0.append(", displaymanagerver=");
        J0.append(this.f7530c);
        J0.append(", instl=");
        J0.append(this.f7531d);
        J0.append(", clickbrowser=");
        J0.append(this.f7532e);
        J0.append(", secure=");
        J0.append(this.f7533f);
        J0.append(", iframebuster=");
        return C13555b.m33970i(J0, this.f7534g, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AKImp(java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, int r10, int r11, java.util.List r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x0008
            r14 = r0
            goto L_0x0009
        L_0x0008:
            r14 = r6
        L_0x0009:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r7
        L_0x0010:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = r8
        L_0x0016:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x001d
            r9 = 0
            r2 = 0
            goto L_0x001e
        L_0x001d:
            r2 = r9
        L_0x001e:
            r6 = r13 & 16
            r7 = -1
            if (r6 == 0) goto L_0x0025
            r3 = -1
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x002c
            r4 = -1
            goto L_0x002d
        L_0x002c:
            r4 = r11
        L_0x002d:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0033
            kotlin.collections.EmptyList r12 = kotlin.collections.EmptyList.f60173b
        L_0x0033:
            r13 = r12
            r6 = r5
            r7 = r14
            r8 = r1
            r9 = r0
            r10 = r2
            r11 = r3
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKImp.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
