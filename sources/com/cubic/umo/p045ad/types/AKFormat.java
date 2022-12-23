package com.cubic.umo.p045ad.types;

import ce0.C21100e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKFormat;", "", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
/* renamed from: com.cubic.umo.ad.types.AKFormat */
public final class AKFormat {

    /* renamed from: a */
    public final int f7494a;

    /* renamed from: b */
    public final int f7495b;

    /* renamed from: c */
    public final int f7496c;

    /* renamed from: d */
    public final int f7497d;

    /* renamed from: e */
    public final int f7498e;

    /* renamed from: f */
    public AKExt f7499f;

    public AKFormat() {
        this(0, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    public AKFormat(int i, int i2, int i3, int i4, int i5) {
        this.f7494a = i;
        this.f7495b = i2;
        this.f7496c = i3;
        this.f7497d = i4;
        this.f7498e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AKFormat)) {
            return false;
        }
        AKFormat aKFormat = (AKFormat) obj;
        return this.f7494a == aKFormat.f7494a && this.f7495b == aKFormat.f7495b && this.f7496c == aKFormat.f7496c && this.f7497d == aKFormat.f7497d && this.f7498e == aKFormat.f7498e;
    }

    public final int hashCode() {
        int i = this.f7495b;
        int i2 = this.f7496c;
        int i3 = this.f7497d;
        return this.f7498e + ((i3 + ((i2 + ((i + (this.f7494a * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder J0 = C21100e.m49315J0("AKFormat(w=");
        J0.append(this.f7494a);
        J0.append(", h=");
        J0.append(this.f7495b);
        J0.append(", wratio=");
        J0.append(this.f7496c);
        J0.append(", hratio=");
        J0.append(this.f7497d);
        J0.append(", wmin=");
        return C16530d.m42014g(J0, this.f7498e, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AKFormat(int r5, int r6, int r7, int r8, int r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = -1
            if (r11 == 0) goto L_0x0007
            r11 = -1
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = -1
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = -1
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = -1
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = -1
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
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKFormat.<init>(int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
