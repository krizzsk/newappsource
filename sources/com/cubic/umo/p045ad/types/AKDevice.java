package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKDevice;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKDevice */
public final class AKDevice {

    /* renamed from: A */
    public final String f7449A;

    /* renamed from: B */
    public final String f7450B;

    /* renamed from: C */
    public final String f7451C;

    /* renamed from: D */
    public AKGeo f7452D;

    /* renamed from: E */
    public AKExt f7453E;

    /* renamed from: a */
    public final String f7454a;

    /* renamed from: b */
    public final int f7455b;

    /* renamed from: c */
    public final int f7456c;

    /* renamed from: d */
    public final String f7457d;

    /* renamed from: e */
    public final String f7458e;

    /* renamed from: f */
    public final int f7459f;

    /* renamed from: g */
    public final String f7460g;

    /* renamed from: h */
    public final String f7461h;

    /* renamed from: i */
    public final String f7462i;

    /* renamed from: j */
    public final String f7463j;

    /* renamed from: k */
    public final String f7464k;

    /* renamed from: l */
    public final int f7465l;

    /* renamed from: m */
    public final int f7466m;

    /* renamed from: n */
    public final int f7467n;

    /* renamed from: o */
    public final float f7468o;

    /* renamed from: p */
    public final int f7469p;

    /* renamed from: q */
    public final int f7470q;

    /* renamed from: r */
    public final String f7471r;

    /* renamed from: s */
    public final String f7472s;

    /* renamed from: t */
    public final String f7473t;

    /* renamed from: u */
    public final String f7474u;

    /* renamed from: v */
    public final int f7475v;

    /* renamed from: w */
    public final String f7476w;

    /* renamed from: x */
    public final String f7477x;

    /* renamed from: y */
    public final String f7478y;

    /* renamed from: z */
    public final String f7479z;

    public AKDevice() {
        this((String) null, 0, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, 0, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null);
    }

    public AKDevice(String str, int i, int i2, String str2, String str3, int i3, String str4, String str5, String str6, String str7, String str8, int i4, int i5, int i6, float f, int i7, int i8, String str9, String str10, String str11, String str12, int i9, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        String str20 = str;
        String str21 = str2;
        String str22 = str3;
        String str23 = str4;
        String str24 = str5;
        String str25 = str6;
        String str26 = str7;
        String str27 = str8;
        String str28 = str9;
        String str29 = str10;
        String str30 = str11;
        String str31 = str12;
        String str32 = str13;
        C24362h.m61211f(str20, "ua");
        C24362h.m61211f(str21, "ip");
        C24362h.m61211f(str22, "ipv6");
        C24362h.m61211f(str23, "make");
        C24362h.m61211f(str24, ServerParameters.MODEL);
        C24362h.m61211f(str25, "os");
        C24362h.m61211f(str26, "osv");
        C24362h.m61211f(str27, "hwv");
        C24362h.m61211f(str28, "flashver");
        C24362h.m61211f(str29, "language");
        C24362h.m61211f(str30, ServerParameters.CARRIER);
        C24362h.m61211f(str31, "mccmnc");
        C24362h.m61211f(str32, GetBrowserSessionContextCommand.KEY_IFA);
        this.f7454a = str20;
        this.f7455b = i;
        this.f7456c = i2;
        this.f7457d = str21;
        this.f7458e = str22;
        this.f7459f = i3;
        this.f7460g = str23;
        this.f7461h = str24;
        this.f7462i = str25;
        this.f7463j = str26;
        this.f7464k = str27;
        this.f7465l = i4;
        this.f7466m = i5;
        this.f7467n = i6;
        this.f7468o = f;
        this.f7469p = i7;
        this.f7470q = i8;
        this.f7471r = str28;
        this.f7472s = str29;
        this.f7473t = str30;
        this.f7474u = str31;
        this.f7475v = i9;
        this.f7476w = str32;
        this.f7477x = str14;
        this.f7478y = str15;
        this.f7479z = str16;
        this.f7449A = str17;
        this.f7450B = str18;
        this.f7451C = str19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKDevice)) {
            return false;
        }
        AKDevice aKDevice = (AKDevice) obj;
        return C24362h.m61206a(this.f7454a, aKDevice.f7454a) && this.f7455b == aKDevice.f7455b && this.f7456c == aKDevice.f7456c && C24362h.m61206a(this.f7457d, aKDevice.f7457d) && C24362h.m61206a(this.f7458e, aKDevice.f7458e) && this.f7459f == aKDevice.f7459f && C24362h.m61206a(this.f7460g, aKDevice.f7460g) && C24362h.m61206a(this.f7461h, aKDevice.f7461h) && C24362h.m61206a(this.f7462i, aKDevice.f7462i) && C24362h.m61206a(this.f7463j, aKDevice.f7463j) && C24362h.m61206a(this.f7464k, aKDevice.f7464k) && this.f7465l == aKDevice.f7465l && this.f7466m == aKDevice.f7466m && this.f7467n == aKDevice.f7467n && C24362h.m61206a(Float.valueOf(this.f7468o), Float.valueOf(aKDevice.f7468o)) && this.f7469p == aKDevice.f7469p && this.f7470q == aKDevice.f7470q && C24362h.m61206a(this.f7471r, aKDevice.f7471r) && C24362h.m61206a(this.f7472s, aKDevice.f7472s) && C24362h.m61206a(this.f7473t, aKDevice.f7473t) && C24362h.m61206a(this.f7474u, aKDevice.f7474u) && this.f7475v == aKDevice.f7475v && C24362h.m61206a(this.f7476w, aKDevice.f7476w) && C24362h.m61206a(this.f7477x, aKDevice.f7477x) && C24362h.m61206a(this.f7478y, aKDevice.f7478y) && C24362h.m61206a(this.f7479z, aKDevice.f7479z) && C24362h.m61206a(this.f7449A, aKDevice.f7449A) && C24362h.m61206a(this.f7450B, aKDevice.f7450B) && C24362h.m61206a(this.f7451C, aKDevice.f7451C);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f7455b;
        int I0 = C21100e.m49313I0(C21100e.m49313I0(C21100e.m49313I0(C21100e.m49313I0(C21100e.m49313I0((this.f7459f + C21100e.m49313I0(C21100e.m49313I0((this.f7456c + ((i6 + (this.f7454a.hashCode() * 31)) * 31)) * 31, this.f7457d), this.f7458e)) * 31, this.f7460g), this.f7461h), this.f7462i), this.f7463j), this.f7464k);
        int i7 = this.f7466m;
        int i8 = this.f7467n;
        int floatToIntBits = Float.floatToIntBits(this.f7468o);
        int i9 = this.f7469p;
        int I02 = C21100e.m49313I0((this.f7475v + C21100e.m49313I0(C21100e.m49313I0(C21100e.m49313I0(C21100e.m49313I0((this.f7470q + ((i9 + ((floatToIntBits + ((i8 + ((i7 + ((this.f7465l + I0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.f7471r), this.f7472s), this.f7473t), this.f7474u)) * 31, this.f7476w);
        String str = this.f7477x;
        int i11 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i12 = (I02 + i) * 31;
        String str2 = this.f7478y;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i13 = (i12 + i2) * 31;
        String str3 = this.f7479z;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i14 = (i13 + i3) * 31;
        String str4 = this.f7449A;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i15 = (i14 + i4) * 31;
        String str5 = this.f7450B;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.hashCode();
        }
        int i16 = (i15 + i5) * 31;
        String str6 = this.f7451C;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        return i16 + i11;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AKDevice(ua=");
        k.append(this.f7454a);
        k.append(", dnt=");
        k.append(this.f7455b);
        k.append(", lmt=");
        k.append(this.f7456c);
        k.append(", ip=");
        k.append(this.f7457d);
        k.append(", ipv6=");
        k.append(this.f7458e);
        k.append(", devicetype=");
        k.append(this.f7459f);
        k.append(", make=");
        k.append(this.f7460g);
        k.append(", model=");
        k.append(this.f7461h);
        k.append(", os=");
        k.append(this.f7462i);
        k.append(", osv=");
        k.append(this.f7463j);
        k.append(", hwv=");
        k.append(this.f7464k);
        k.append(", h=");
        k.append(this.f7465l);
        k.append(", w=");
        k.append(this.f7466m);
        k.append(", ppi=");
        k.append(this.f7467n);
        k.append(", pxratio=");
        k.append(this.f7468o);
        k.append(", js=");
        k.append(this.f7469p);
        k.append(", geofetch=");
        k.append(this.f7470q);
        k.append(", flashver=");
        k.append(this.f7471r);
        k.append(", language=");
        k.append(this.f7472s);
        k.append(", carrier=");
        k.append(this.f7473t);
        k.append(", mccmnc=");
        k.append(this.f7474u);
        k.append(", connectiontype=");
        k.append(this.f7475v);
        k.append(", ifa=");
        k.append(this.f7476w);
        k.append(", didsha1=");
        k.append(this.f7477x);
        k.append(", didmd5=");
        k.append(this.f7478y);
        k.append(", dpidsha1=");
        k.append(this.f7479z);
        k.append(", dpidmd5=");
        k.append(this.f7449A);
        k.append(", macsha1=");
        k.append(this.f7450B);
        k.append(", macmd5=");
        return C0016g.m30n(k, this.f7451C, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AKDevice(java.lang.String r32, int r33, int r34, java.lang.String r35, java.lang.String r36, int r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43, int r44, int r45, float r46, int r47, int r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, int r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, int r61, kotlin.jvm.internal.DefaultConstructorMarker r62) {
        /*
            r31 = this;
            r0 = r61
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r32
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = -1
            goto L_0x0014
        L_0x0012:
            r3 = r33
        L_0x0014:
            r5 = r0 & 4
            if (r5 == 0) goto L_0x001a
            r5 = -1
            goto L_0x001c
        L_0x001a:
            r5 = r34
        L_0x001c:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            r6 = r2
            goto L_0x0024
        L_0x0022:
            r6 = r35
        L_0x0024:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002a
            r7 = r2
            goto L_0x002c
        L_0x002a:
            r7 = r36
        L_0x002c:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0032
            r8 = -1
            goto L_0x0034
        L_0x0032:
            r8 = r37
        L_0x0034:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003a
            r9 = r2
            goto L_0x003c
        L_0x003a:
            r9 = r38
        L_0x003c:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0042
            r10 = r2
            goto L_0x0044
        L_0x0042:
            r10 = r39
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r2
            goto L_0x004c
        L_0x004a:
            r11 = r40
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = r2
            goto L_0x0054
        L_0x0052:
            r12 = r41
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005a
            r13 = r2
            goto L_0x005c
        L_0x005a:
            r13 = r42
        L_0x005c:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0062
            r14 = -1
            goto L_0x0064
        L_0x0062:
            r14 = r43
        L_0x0064:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            r15 = -1
            goto L_0x006c
        L_0x006a:
            r15 = r44
        L_0x006c:
            r4 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0072
            r4 = -1
            goto L_0x0074
        L_0x0072:
            r4 = r45
        L_0x0074:
            r62 = r2
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x007c
            r2 = 0
            goto L_0x007e
        L_0x007c:
            r2 = r46
        L_0x007e:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0088
            r16 = -1
            goto L_0x008a
        L_0x0088:
            r16 = r47
        L_0x008a:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0093
            r17 = -1
            goto L_0x0095
        L_0x0093:
            r17 = r48
        L_0x0095:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009e
            r18 = r62
            goto L_0x00a0
        L_0x009e:
            r18 = r49
        L_0x00a0:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a9
            r19 = r62
            goto L_0x00ab
        L_0x00a9:
            r19 = r50
        L_0x00ab:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00b4
            r20 = r62
            goto L_0x00b6
        L_0x00b4:
            r20 = r51
        L_0x00b6:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00bf
            r21 = r62
            goto L_0x00c1
        L_0x00bf:
            r21 = r52
        L_0x00c1:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00ca
            r22 = -1
            goto L_0x00cc
        L_0x00ca:
            r22 = r53
        L_0x00cc:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00d5
            r23 = r62
            goto L_0x00d7
        L_0x00d5:
            r23 = r54
        L_0x00d7:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r0 & r24
            r25 = 0
            if (r24 == 0) goto L_0x00e2
            r24 = r25
            goto L_0x00e4
        L_0x00e2:
            r24 = r55
        L_0x00e4:
            r26 = 16777216(0x1000000, float:2.3509887E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x00ed
            r26 = r25
            goto L_0x00ef
        L_0x00ed:
            r26 = r56
        L_0x00ef:
            r27 = 33554432(0x2000000, float:9.403955E-38)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x00f8
            r27 = r25
            goto L_0x00fa
        L_0x00f8:
            r27 = r57
        L_0x00fa:
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            r28 = r0 & r28
            if (r28 == 0) goto L_0x0103
            r28 = r25
            goto L_0x0105
        L_0x0103:
            r28 = r58
        L_0x0105:
            r29 = 134217728(0x8000000, float:3.85186E-34)
            r29 = r0 & r29
            if (r29 == 0) goto L_0x010e
            r29 = r25
            goto L_0x0110
        L_0x010e:
            r29 = r59
        L_0x0110:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r30
            if (r0 == 0) goto L_0x0117
            goto L_0x0119
        L_0x0117:
            r25 = r60
        L_0x0119:
            r32 = r31
            r33 = r1
            r34 = r3
            r35 = r5
            r36 = r6
            r37 = r7
            r38 = r8
            r39 = r9
            r40 = r10
            r41 = r11
            r42 = r12
            r43 = r13
            r44 = r14
            r45 = r15
            r46 = r4
            r47 = r2
            r48 = r16
            r49 = r17
            r50 = r18
            r51 = r19
            r52 = r20
            r53 = r21
            r54 = r22
            r55 = r23
            r56 = r24
            r57 = r26
            r58 = r27
            r59 = r28
            r60 = r29
            r61 = r25
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKDevice.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, float, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
