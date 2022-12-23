package com.cubic.umo.p045ad.types;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKVideo;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKVideo */
public final class AKVideo {

    /* renamed from: a */
    public final List<String> f7689a;

    /* renamed from: b */
    public final int f7690b;

    /* renamed from: c */
    public final int f7691c;

    /* renamed from: d */
    public final List<Integer> f7692d;

    /* renamed from: e */
    public final int f7693e;

    /* renamed from: f */
    public final int f7694f;

    /* renamed from: g */
    public int f7695g;

    /* renamed from: h */
    public final int f7696h;

    /* renamed from: i */
    public final int f7697i;

    /* renamed from: j */
    public final int f7698j;

    /* renamed from: k */
    public final int f7699k;

    /* renamed from: l */
    public final int f7700l;

    /* renamed from: m */
    public final int f7701m;

    /* renamed from: n */
    public final List<Integer> f7702n;

    /* renamed from: o */
    public final int f7703o;

    /* renamed from: p */
    public final int f7704p;

    /* renamed from: q */
    public final int f7705q;

    /* renamed from: r */
    public final int f7706r;

    /* renamed from: s */
    public final List<Integer> f7707s;

    /* renamed from: t */
    public final int f7708t;

    /* renamed from: u */
    public final List<Integer> f7709u;

    /* renamed from: v */
    public int f7710v;

    /* renamed from: w */
    public final List<Integer> f7711w;

    /* renamed from: x */
    public final String f7712x;

    /* renamed from: y */
    public AKImpVideoOrBannerExt f7713y;

    public AKVideo() {
        this((List) null, 0, 0, (List) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, (List) null, 0, 0, 0, 0, (List) null, 0, (List) null, 0, (List) null, (String) null, 16777215, (DefaultConstructorMarker) null);
    }

    public AKVideo(List<String> list, int i, int i2, List<Integer> list2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i11, int i12, List<Integer> list3, int i13, int i14, int i15, int i16, List<Integer> list4, int i17, List<Integer> list5, int i18, List<Integer> list6, String str) {
        String str2 = str;
        C24362h.m61211f(str2, "id");
        this.f7689a = list;
        this.f7690b = i;
        this.f7691c = i2;
        this.f7692d = list2;
        this.f7693e = i3;
        this.f7694f = i4;
        this.f7695g = i5;
        this.f7696h = i6;
        this.f7697i = i7;
        this.f7698j = i8;
        this.f7699k = i9;
        this.f7700l = i11;
        this.f7701m = i12;
        this.f7702n = list3;
        this.f7703o = i13;
        this.f7704p = i14;
        this.f7705q = i15;
        this.f7706r = i16;
        this.f7707s = list4;
        this.f7708t = i17;
        this.f7709u = list5;
        this.f7710v = i18;
        this.f7711w = list6;
        this.f7712x = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKVideo)) {
            return false;
        }
        AKVideo aKVideo = (AKVideo) obj;
        return C24362h.m61206a(this.f7689a, aKVideo.f7689a) && this.f7690b == aKVideo.f7690b && this.f7691c == aKVideo.f7691c && C24362h.m61206a(this.f7692d, aKVideo.f7692d) && this.f7693e == aKVideo.f7693e && this.f7694f == aKVideo.f7694f && this.f7695g == aKVideo.f7695g && this.f7696h == aKVideo.f7696h && this.f7697i == aKVideo.f7697i && this.f7698j == aKVideo.f7698j && this.f7699k == aKVideo.f7699k && this.f7700l == aKVideo.f7700l && this.f7701m == aKVideo.f7701m && C24362h.m61206a(this.f7702n, aKVideo.f7702n) && this.f7703o == aKVideo.f7703o && this.f7704p == aKVideo.f7704p && this.f7705q == aKVideo.f7705q && this.f7706r == aKVideo.f7706r && C24362h.m61206a(this.f7707s, aKVideo.f7707s) && this.f7708t == aKVideo.f7708t && C24362h.m61206a(this.f7709u, aKVideo.f7709u) && this.f7710v == aKVideo.f7710v && C24362h.m61206a(this.f7711w, aKVideo.f7711w) && C24362h.m61206a(this.f7712x, aKVideo.f7712x);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        List<String> list = this.f7689a;
        int i6 = 0;
        if (list == null) {
            i = 0;
        } else {
            i = list.hashCode();
        }
        int i7 = this.f7690b;
        int i8 = (this.f7691c + ((i7 + (i * 31)) * 31)) * 31;
        List<Integer> list2 = this.f7692d;
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.hashCode();
        }
        int i9 = this.f7693e;
        int i11 = this.f7694f;
        int i12 = this.f7695g;
        int i13 = this.f7696h;
        int i14 = this.f7697i;
        int i15 = this.f7698j;
        int i16 = this.f7699k;
        int i17 = this.f7700l;
        int i18 = (this.f7701m + ((i17 + ((i16 + ((i15 + ((i14 + ((i13 + ((i12 + ((i11 + ((i9 + ((i8 + i2) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        List<Integer> list3 = this.f7702n;
        if (list3 == null) {
            i3 = 0;
        } else {
            i3 = list3.hashCode();
        }
        int i19 = this.f7703o;
        int i21 = this.f7704p;
        int i22 = this.f7705q;
        int i23 = (this.f7706r + ((i22 + ((i21 + ((i19 + ((i18 + i3) * 31)) * 31)) * 31)) * 31)) * 31;
        List<Integer> list4 = this.f7707s;
        if (list4 == null) {
            i4 = 0;
        } else {
            i4 = list4.hashCode();
        }
        int i24 = (this.f7708t + ((i23 + i4) * 31)) * 31;
        List<Integer> list5 = this.f7709u;
        if (list5 == null) {
            i5 = 0;
        } else {
            i5 = list5.hashCode();
        }
        int i25 = (this.f7710v + ((i24 + i5) * 31)) * 31;
        List<Integer> list6 = this.f7711w;
        if (list6 != null) {
            i6 = list6.hashCode();
        }
        return this.f7712x.hashCode() + ((i25 + i6) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AKVideo(mimes=");
        k.append(this.f7689a);
        k.append(", minduration=");
        k.append(this.f7690b);
        k.append(", maxduration=");
        k.append(this.f7691c);
        k.append(", protocols=");
        k.append(this.f7692d);
        k.append(", w=");
        k.append(this.f7693e);
        k.append(", h=");
        k.append(this.f7694f);
        k.append(", startdelay=");
        k.append(this.f7695g);
        k.append(", placement=");
        k.append(this.f7696h);
        k.append(", linearity=");
        k.append(this.f7697i);
        k.append(", skip=");
        k.append(this.f7698j);
        k.append(", skipmin=");
        k.append(this.f7699k);
        k.append(", skipafter=");
        k.append(this.f7700l);
        k.append(", sequence=");
        k.append(this.f7701m);
        k.append(", battr=");
        k.append(this.f7702n);
        k.append(", maxextended=");
        k.append(this.f7703o);
        k.append(", minbitrate=");
        k.append(this.f7704p);
        k.append(", maxbitrate=");
        k.append(this.f7705q);
        k.append(", boxingallowed=");
        k.append(this.f7706r);
        k.append(", playbackmethod=");
        k.append(this.f7707s);
        k.append(", playbackend=");
        k.append(this.f7708t);
        k.append(", delivery=");
        k.append(this.f7709u);
        k.append(", pos=");
        k.append(this.f7710v);
        k.append(", api=");
        k.append(this.f7711w);
        k.append(", id=");
        return C0017h.m57N(k, this.f7712x, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AKVideo(java.util.List r26, int r27, int r28, java.util.List r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, java.util.List r39, int r40, int r41, int r42, int r43, java.util.List r44, int r45, java.util.List r46, int r47, java.util.List r48, java.lang.String r49, int r50, kotlin.jvm.internal.DefaultConstructorMarker r51) {
        /*
            r25 = this;
            r0 = r50
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.f60173b
            goto L_0x000b
        L_0x0009:
            r1 = r26
        L_0x000b:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0011
            r2 = -1
            goto L_0x0013
        L_0x0011:
            r2 = r27
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = -1
            goto L_0x001b
        L_0x0019:
            r4 = r28
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.f60173b
            goto L_0x0024
        L_0x0022:
            r5 = r29
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = -1
            goto L_0x002c
        L_0x002a:
            r6 = r30
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = -1
            goto L_0x0034
        L_0x0032:
            r7 = r31
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = -1
            goto L_0x003c
        L_0x003a:
            r8 = r32
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = -1
            goto L_0x0044
        L_0x0042:
            r9 = r33
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004a
            r10 = -1
            goto L_0x004c
        L_0x004a:
            r10 = r34
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = -1
            goto L_0x0054
        L_0x0052:
            r11 = r35
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            r13 = 0
            if (r12 == 0) goto L_0x005b
            r12 = 0
            goto L_0x005d
        L_0x005b:
            r12 = r36
        L_0x005d:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r13 = r37
        L_0x0064:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006a
            r14 = -1
            goto L_0x006c
        L_0x006a:
            r14 = r38
        L_0x006c:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0073
            kotlin.collections.EmptyList r15 = kotlin.collections.EmptyList.f60173b
            goto L_0x0075
        L_0x0073:
            r15 = r39
        L_0x0075:
            r3 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L_0x007b
            r3 = -1
            goto L_0x007d
        L_0x007b:
            r3 = r40
        L_0x007d:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0087
            r16 = -1
            goto L_0x0089
        L_0x0087:
            r16 = r41
        L_0x0089:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0092
            r17 = -1
            goto L_0x0094
        L_0x0092:
            r17 = r42
        L_0x0094:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009d
            r18 = 1
            goto L_0x009f
        L_0x009d:
            r18 = r43
        L_0x009f:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a8
            kotlin.collections.EmptyList r19 = kotlin.collections.EmptyList.f60173b
            goto L_0x00aa
        L_0x00a8:
            r19 = r44
        L_0x00aa:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b3
            r20 = -1
            goto L_0x00b5
        L_0x00b3:
            r20 = r45
        L_0x00b5:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00be
            kotlin.collections.EmptyList r21 = kotlin.collections.EmptyList.f60173b
            goto L_0x00c0
        L_0x00be:
            r21 = r46
        L_0x00c0:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00cd
            com.cubic.umo.ad.ext.types.UMOAdKitAdPosition r22 = com.cubic.umo.p045ad.ext.types.UMOAdKitAdPosition.UNKNOWN
            int r22 = r22.getValue()
            goto L_0x00cf
        L_0x00cd:
            r22 = r47
        L_0x00cf:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d8
            kotlin.collections.EmptyList r23 = kotlin.collections.EmptyList.f60173b
            goto L_0x00da
        L_0x00d8:
            r23 = r48
        L_0x00da:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r24
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = ""
            goto L_0x00e5
        L_0x00e3:
            r0 = r49
        L_0x00e5:
            r26 = r25
            r27 = r1
            r28 = r2
            r29 = r4
            r30 = r5
            r31 = r6
            r32 = r7
            r33 = r8
            r34 = r9
            r35 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r39 = r14
            r40 = r15
            r41 = r3
            r42 = r16
            r43 = r17
            r44 = r18
            r45 = r19
            r46 = r20
            r47 = r21
            r48 = r22
            r49 = r23
            r50 = r0
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKVideo.<init>(java.util.List, int, int, java.util.List, int, int, int, int, int, int, int, int, int, java.util.List, int, int, int, int, java.util.List, int, java.util.List, int, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
