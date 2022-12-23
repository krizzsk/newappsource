package com.veriff.sdk.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006,"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/DeviceInfo;", "", "veriff_sdk_version", "", "platform", "android_version", "android_sdk_level", "manufacturer", "model", "market_name", "video_codecs", "", "Lcom/veriff/sdk/internal/analytics/CodecInfo;", "audio_codecs", "Lcom/veriff/sdk/internal/analytics/AudioCodecInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getAndroid_sdk_level", "()Ljava/lang/String;", "getAndroid_version", "getAudio_codecs", "()Ljava/util/List;", "getManufacturer", "getMarket_name", "getModel", "getPlatform", "getVeriff_sdk_version", "getVideo_codecs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.gd */
public final class C21664gd {

    /* renamed from: b */
    private final String f54721b;

    /* renamed from: c */
    private final String f54722c;

    /* renamed from: d */
    private final String f54723d;

    /* renamed from: e */
    private final String f54724e;

    /* renamed from: f */
    private final String f54725f;

    /* renamed from: g */
    private final String f54726g;

    /* renamed from: h */
    private final String f54727h;

    /* renamed from: i */
    private final List<C21662gb> f54728i;

    /* renamed from: j */
    private final List<C21656fy> f54729j;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/internal/analytics/DeviceInfo$Companion;", "", "()V", "withoutCodecs", "Lcom/veriff/sdk/internal/analytics/DeviceInfo;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.gd$a */
    public static final class C21665a {
        private C21665a() {
        }

        public /* synthetic */ C21665a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C21665a((DefaultConstructorMarker) null);
    }

    public C21664gd() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 511, (DefaultConstructorMarker) null);
    }

    public C21664gd(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<C21662gb> list, List<C21656fy> list2) {
        this.f54721b = str;
        this.f54722c = str2;
        this.f54723d = str3;
        this.f54724e = str4;
        this.f54725f = str5;
        this.f54726g = str6;
        this.f54727h = str7;
        this.f54728i = list;
        this.f54729j = list2;
    }

    /* renamed from: a */
    public final C21664gd mo54955a(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<C21662gb> list, List<C21656fy> list2) {
        return new C21664gd(str, str2, str3, str4, str5, str6, str7, list, list2);
    }

    /* renamed from: a */
    public final String mo54956a() {
        return this.f54721b;
    }

    /* renamed from: b */
    public final String mo54957b() {
        return this.f54722c;
    }

    /* renamed from: c */
    public final String mo54958c() {
        return this.f54723d;
    }

    /* renamed from: d */
    public final String mo54959d() {
        return this.f54724e;
    }

    /* renamed from: e */
    public final String mo54960e() {
        return this.f54725f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21664gd)) {
            return false;
        }
        C21664gd gdVar = (C21664gd) obj;
        return C24362h.m61206a(this.f54721b, gdVar.f54721b) && C24362h.m61206a(this.f54722c, gdVar.f54722c) && C24362h.m61206a(this.f54723d, gdVar.f54723d) && C24362h.m61206a(this.f54724e, gdVar.f54724e) && C24362h.m61206a(this.f54725f, gdVar.f54725f) && C24362h.m61206a(this.f54726g, gdVar.f54726g) && C24362h.m61206a(this.f54727h, gdVar.f54727h) && C24362h.m61206a(this.f54728i, gdVar.f54728i) && C24362h.m61206a(this.f54729j, gdVar.f54729j);
    }

    /* renamed from: f */
    public final String mo54962f() {
        return this.f54726g;
    }

    /* renamed from: g */
    public final String mo54963g() {
        return this.f54727h;
    }

    /* renamed from: h */
    public final List<C21662gb> mo54964h() {
        return this.f54728i;
    }

    public int hashCode() {
        String str = this.f54721b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f54722c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f54723d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f54724e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f54725f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f54726g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f54727h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<C21662gb> list = this.f54728i;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        List<C21656fy> list2 = this.f54729j;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode8 + i;
    }

    /* renamed from: i */
    public final List<C21656fy> mo54966i() {
        return this.f54729j;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("DeviceInfo(veriff_sdk_version=");
        k.append(this.f54721b);
        k.append(", platform=");
        k.append(this.f54722c);
        k.append(", android_version=");
        k.append(this.f54723d);
        k.append(", android_sdk_level=");
        k.append(this.f54724e);
        k.append(", manufacturer=");
        k.append(this.f54725f);
        k.append(", model=");
        k.append(this.f54726g);
        k.append(", market_name=");
        k.append(this.f54727h);
        k.append(", video_codecs=");
        k.append(this.f54728i);
        k.append(", audio_codecs=");
        k.append(this.f54729j);
        k.append(")");
        return k.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C21664gd(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.util.List r17, java.util.List r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = "3.17.0"
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = "android"
            goto L_0x0012
        L_0x0011:
            r2 = r11
        L_0x0012:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = android.os.Build.VERSION.CODENAME
            goto L_0x001a
        L_0x0019:
            r3 = r12
        L_0x001a:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0025
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L_0x0026
        L_0x0025:
            r4 = r13
        L_0x0026:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x002d
            java.lang.String r5 = android.os.Build.MANUFACTURER
            goto L_0x002e
        L_0x002d:
            r5 = r14
        L_0x002e:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0035
            java.lang.String r6 = android.os.Build.MODEL
            goto L_0x0036
        L_0x0035:
            r6 = r15
        L_0x0036:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x003d
            java.lang.String r7 = android.os.Build.BRAND
            goto L_0x003f
        L_0x003d:
            r7 = r16
        L_0x003f:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0048
            java.util.List r8 = com.veriff.sdk.internal.C21666ge.f54731b
            goto L_0x004a
        L_0x0048:
            r8 = r17
        L_0x004a:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0053
            java.util.List r0 = com.veriff.sdk.internal.C21666ge.f54732c
            goto L_0x0055
        L_0x0053:
            r0 = r18
        L_0x0055:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21664gd.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
