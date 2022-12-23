package com.cubic.umo.auth.api.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;
import p147k7.C5520a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, mo59060d2 = {"Lcom/cubic/umo/auth/api/model/AnonymousJWT;", "Lk7/a;", "", "clientHost", "clientId", "clientAddress", "session", "", "isEmailVerified", "userName", "cubicId", "", "exp", "iat", "jti", "iss", "sub", "typ", "azp", "acr", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class AnonymousJWT extends C5520a {

    /* renamed from: j */
    public final String f7751j;

    /* renamed from: k */
    public final String f7752k;

    /* renamed from: l */
    public final String f7753l;

    /* renamed from: m */
    public final String f7754m;

    /* renamed from: n */
    public final boolean f7755n;

    /* renamed from: o */
    public final String f7756o;

    /* renamed from: p */
    public final String f7757p;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousJWT(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, java.lang.String r26, java.lang.String r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r28
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r29
        L_0x0013:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0019
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r30
        L_0x001b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0021
            r14 = r2
            goto L_0x0023
        L_0x0021:
            r14 = r31
        L_0x0023:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0029
            r15 = r2
            goto L_0x002b
        L_0x0029:
            r15 = r32
        L_0x002b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0032
            r16 = r2
            goto L_0x0034
        L_0x0032:
            r16 = r33
        L_0x0034:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x003b
            r17 = r2
            goto L_0x003d
        L_0x003b:
            r17 = r34
        L_0x003d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0044
            r18 = r2
            goto L_0x0046
        L_0x0044:
            r18 = r35
        L_0x0046:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x004f
            r19 = r2
            goto L_0x0051
        L_0x004f:
            r19 = r36
        L_0x0051:
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.auth.api.model.AnonymousJWT.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousJWT(String str, String str2, String str3, @C12943g(name = "session_state") String str4, @C12943g(name = "email_is_verified") boolean z, @C12943g(name = "preferred_username") String str5, @C12943g(name = "cubic_id") String str6, Integer num, Integer num2, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        super(num, num2, str7, str8, str9, str10, str11, str12, str13);
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        C24362h.m61211f(str14, "clientHost");
        C24362h.m61211f(str15, "clientId");
        C24362h.m61211f(str16, "clientAddress");
        C24362h.m61211f(str17, "session");
        C24362h.m61211f(str18, "userName");
        C24362h.m61211f(str6, "cubicId");
        this.f7751j = str14;
        this.f7752k = str15;
        this.f7753l = str16;
        this.f7754m = str17;
        this.f7755n = z;
        this.f7756o = str18;
        this.f7757p = str6;
    }
}
