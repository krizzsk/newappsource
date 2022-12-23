package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKBanner;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKBanner */
public final class AKBanner {

    /* renamed from: a */
    public final List<AKFormat> f7406a;

    /* renamed from: b */
    public final int f7407b;

    /* renamed from: c */
    public final int f7408c;

    /* renamed from: d */
    public final List<Integer> f7409d;

    /* renamed from: e */
    public final List<Integer> f7410e;

    /* renamed from: f */
    public final int f7411f;

    /* renamed from: g */
    public final List<String> f7412g;

    /* renamed from: h */
    public final int f7413h;

    /* renamed from: i */
    public final List<Integer> f7414i;

    /* renamed from: j */
    public final List<Integer> f7415j;

    /* renamed from: k */
    public final String f7416k;

    /* renamed from: l */
    public final int f7417l;

    /* renamed from: m */
    public AKImpVideoOrBannerExt f7418m;

    public AKBanner() {
        this((List) null, 0, 0, (List) null, (List) null, 0, (List) null, 0, (List) null, (List) null, (String) null, 0, 4095, (DefaultConstructorMarker) null);
    }

    public AKBanner(List<AKFormat> list, int i, int i2, List<Integer> list2, List<Integer> list3, int i3, List<String> list4, int i4, List<Integer> list5, List<Integer> list6, String str, int i5) {
        C24362h.m61211f(str, "id");
        this.f7406a = list;
        this.f7407b = i;
        this.f7408c = i2;
        this.f7409d = list2;
        this.f7410e = list3;
        this.f7411f = i3;
        this.f7412g = list4;
        this.f7413h = i4;
        this.f7414i = list5;
        this.f7415j = list6;
        this.f7416k = str;
        this.f7417l = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKBanner)) {
            return false;
        }
        AKBanner aKBanner = (AKBanner) obj;
        return C24362h.m61206a(this.f7406a, aKBanner.f7406a) && this.f7407b == aKBanner.f7407b && this.f7408c == aKBanner.f7408c && C24362h.m61206a(this.f7409d, aKBanner.f7409d) && C24362h.m61206a(this.f7410e, aKBanner.f7410e) && this.f7411f == aKBanner.f7411f && C24362h.m61206a(this.f7412g, aKBanner.f7412g) && this.f7413h == aKBanner.f7413h && C24362h.m61206a(this.f7414i, aKBanner.f7414i) && C24362h.m61206a(this.f7415j, aKBanner.f7415j) && C24362h.m61206a(this.f7416k, aKBanner.f7416k) && this.f7417l == aKBanner.f7417l;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        List<AKFormat> list = this.f7406a;
        int i6 = 0;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i7 = this.f7407b;
        int i8 = (this.f7408c + ((i7 + (i * 31)) * 31)) * 31;
        List<Integer> list2 = this.f7409d;
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.hashCode();
        }
        int i9 = (i8 + i2) * 31;
        List<Integer> list3 = this.f7410e;
        if (list3 == null) {
            i3 = 0;
        } else {
            i3 = list3.hashCode();
        }
        int i11 = (this.f7411f + ((i9 + i3) * 31)) * 31;
        List<String> list4 = this.f7412g;
        if (list4 == null) {
            i4 = 0;
        } else {
            i4 = list4.hashCode();
        }
        int i12 = (this.f7413h + ((i11 + i4) * 31)) * 31;
        List<Integer> list5 = this.f7414i;
        if (list5 == null) {
            i5 = 0;
        } else {
            i5 = list5.hashCode();
        }
        int i13 = (i12 + i5) * 31;
        List<Integer> list6 = this.f7415j;
        if (list6 != null) {
            i6 = list6.hashCode();
        }
        return this.f7417l + C21100e.m49313I0((i13 + i6) * 31, this.f7416k);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AKBanner(format=");
        k.append(this.f7406a);
        k.append(", w=");
        k.append(this.f7407b);
        k.append(", h=");
        k.append(this.f7408c);
        k.append(", btype=");
        k.append(this.f7409d);
        k.append(", battr=");
        k.append(this.f7410e);
        k.append(", pos=");
        k.append(this.f7411f);
        k.append(", mimes=");
        k.append(this.f7412g);
        k.append(", topframe=");
        k.append(this.f7413h);
        k.append(", expdir=");
        k.append(this.f7414i);
        k.append(", api=");
        k.append(this.f7415j);
        k.append(", id=");
        k.append(this.f7416k);
        k.append(", vcm=");
        return C16530d.m42014g(k, this.f7417l, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AKBanner(java.util.List r14, int r15, int r16, java.util.List r17, java.util.List r18, int r19, java.util.List r20, int r21, java.util.List r22, java.util.List r23, java.lang.String r24, int r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.f60173b
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r2 = r0 & 2
            r3 = -1
            if (r2 == 0) goto L_0x0011
            r2 = -1
            goto L_0x0012
        L_0x0011:
            r2 = r15
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = -1
            goto L_0x001a
        L_0x0018:
            r4 = r16
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.f60173b
            goto L_0x0023
        L_0x0021:
            r5 = r17
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.f60173b
            goto L_0x002c
        L_0x002a:
            r6 = r18
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0037
            com.cubic.umo.ad.ext.types.UMOAdKitAdPosition r7 = com.cubic.umo.p045ad.ext.types.UMOAdKitAdPosition.UNKNOWN
            int r7 = r7.getValue()
            goto L_0x0039
        L_0x0037:
            r7 = r19
        L_0x0039:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0040
            kotlin.collections.EmptyList r8 = kotlin.collections.EmptyList.f60173b
            goto L_0x0042
        L_0x0040:
            r8 = r20
        L_0x0042:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0048
            r9 = -1
            goto L_0x004a
        L_0x0048:
            r9 = r21
        L_0x004a:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0051
            kotlin.collections.EmptyList r10 = kotlin.collections.EmptyList.f60173b
            goto L_0x0053
        L_0x0051:
            r10 = r22
        L_0x0053:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005a
            kotlin.collections.EmptyList r11 = kotlin.collections.EmptyList.f60173b
            goto L_0x005c
        L_0x005a:
            r11 = r23
        L_0x005c:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0063
            java.lang.String r12 = ""
            goto L_0x0065
        L_0x0063:
            r12 = r24
        L_0x0065:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r3 = r25
        L_0x006c:
            r14 = r13
            r15 = r1
            r16 = r2
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKBanner.<init>(java.util.List, int, int, java.util.List, java.util.List, int, java.util.List, int, java.util.List, java.util.List, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
