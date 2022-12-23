package com.cubic.umo.auth.api.model;

import kotlin.Metadata;
import nb0.C12943g;
import nb0.C12944h;
import p147k7.C5520a;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001Bí\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u0004\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, mo59060d2 = {"Lcom/cubic/umo/auth/api/model/UserJWT;", "Lk7/a;", "", "passId", "", "cardNumber", "accountKey", "", "isMobileVerified", "mediaId", "userToken", "mobileNumber", "session", "isEmailVerified", "userName", "cubicId", "exp", "iat", "jti", "iss", "sub", "typ", "azp", "acr", "scope", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class UserJWT extends C5520a {

    /* renamed from: j */
    public final Integer f7772j;

    /* renamed from: k */
    public final String f7773k;

    /* renamed from: l */
    public final String f7774l;

    /* renamed from: m */
    public final boolean f7775m;

    /* renamed from: n */
    public final String f7776n;

    /* renamed from: o */
    public final String f7777o;

    /* renamed from: p */
    public final String f7778p;

    /* renamed from: q */
    public final String f7779q;

    /* renamed from: r */
    public final boolean f7780r;

    /* renamed from: s */
    public final String f7781s;

    /* renamed from: t */
    public final String f7782t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserJWT(@C12943g(name = "pass_id") Integer num, @C12943g(name = "card_number") String str, @C12943g(name = "account_key") String str2, @C12943g(name = "mobile_is_verified") boolean z, @C12943g(name = "media_id") String str3, @C12943g(name = "user_token") String str4, @C12943g(name = "mobile_number") String str5, @C12943g(name = "session_state") String str6, @C12943g(name = "email_is_verified") boolean z2, @C12943g(name = "preferred_username") String str7, @C12943g(name = "cubic_id") String str8, Integer num2, Integer num3, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        super(num2, num3, str9, str10, str11, str12, str13, str14, str15);
        C13437d.m33711q(str6, "session", str7, "userName", str8, "cubicId");
        this.f7772j = num;
        this.f7773k = str;
        this.f7774l = str2;
        this.f7775m = z;
        this.f7776n = str3;
        this.f7777o = str4;
        this.f7778p = str5;
        this.f7779q = str6;
        this.f7780r = z2;
        this.f7781s = str7;
        this.f7782t = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserJWT(java.lang.Integer r25, java.lang.String r26, java.lang.String r27, boolean r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, java.lang.String r34, java.lang.String r35, java.lang.Integer r36, java.lang.Integer r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, int r45, kotlin.jvm.internal.DefaultConstructorMarker r46) {
        /*
            r24 = this;
            r0 = r45
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r25
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r26
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r27
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r8 = r2
            goto L_0x0023
        L_0x0021:
            r8 = r29
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r30
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r31
        L_0x0033:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0039
            r15 = r2
            goto L_0x003b
        L_0x0039:
            r15 = r36
        L_0x003b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0042
            r16 = r2
            goto L_0x0044
        L_0x0042:
            r16 = r37
        L_0x0044:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x004b
            r17 = r2
            goto L_0x004d
        L_0x004b:
            r17 = r38
        L_0x004d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0054
            r18 = r2
            goto L_0x0056
        L_0x0054:
            r18 = r39
        L_0x0056:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005f
            r19 = r2
            goto L_0x0061
        L_0x005f:
            r19 = r40
        L_0x0061:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0069
            r20 = r2
            goto L_0x006b
        L_0x0069:
            r20 = r41
        L_0x006b:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0073
            r21 = r2
            goto L_0x0075
        L_0x0073:
            r21 = r42
        L_0x0075:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007d
            r22 = r2
            goto L_0x007f
        L_0x007d:
            r22 = r43
        L_0x007f:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0087
            r23 = r2
            goto L_0x0089
        L_0x0087:
            r23 = r44
        L_0x0089:
            r3 = r24
            r7 = r28
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.auth.api.model.UserJWT.<init>(java.lang.Integer, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
