package com.cubic.umo.auth.api.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/auth/api/model/UserJWTJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/auth/api/model/UserJWT;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class UserJWTJsonAdapter extends C8011k<UserJWT> {

    /* renamed from: a */
    public final JsonReader.C7986a f7783a = JsonReader.C7986a.m18216a("pass_id", "card_number", "account_key", "mobile_is_verified", "media_id", "user_token", "mobile_number", "session_state", "email_is_verified", "preferred_username", "cubic_id", "exp", "iat", "jti", "iss", "sub", "typ", "azp", "acr", "scope");

    /* renamed from: b */
    public final C8011k<Integer> f7784b;

    /* renamed from: c */
    public final C8011k<String> f7785c;

    /* renamed from: d */
    public final C8011k<Boolean> f7786d;

    /* renamed from: e */
    public final C8011k<String> f7787e;

    /* renamed from: f */
    public volatile Constructor<UserJWT> f7788f;

    public UserJWTJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f7784b = oVar2.mo25082c(Integer.class, emptySet, "passId");
        this.f7785c = oVar2.mo25082c(cls, emptySet, "cardNumber");
        this.f7786d = oVar2.mo25082c(Boolean.TYPE, emptySet, "isMobileVerified");
        this.f7787e = oVar2.mo25082c(cls, emptySet, "session");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00ad, code lost:
        r4 = r4 & r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c3, code lost:
        r3 = r4;
        r13 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c6, code lost:
        r12 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c8, code lost:
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ca, code lost:
        r9 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01cc, code lost:
        r8 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ce, code lost:
        r4 = r3;
        r7 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01d1, code lost:
        r3 = r27;
        r2 = r28;
        r6 = r35;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r62) {
        /*
            r61 = this;
            r0 = r61
            r1 = r62
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "reader"
            mf0.C24362h.m61211f(r1, r4)
            r62.mo24995i()
            r4 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x0030:
            boolean r15 = r62.mo24999v()
            java.lang.String r5 = "cubic_id"
            r27 = r3
            java.lang.String r3 = "cubicId"
            r28 = r2
            java.lang.String r2 = "preferred_username"
            r29 = r13
            java.lang.String r13 = "userName"
            r30 = r12
            java.lang.String r12 = "email_is_verified"
            r31 = r11
            java.lang.String r11 = "isEmailVerified"
            r32 = r9
            java.lang.String r9 = "session_state"
            r33 = r8
            java.lang.String r8 = "session"
            r34 = r7
            java.lang.String r7 = "mobile_is_verified"
            r35 = r6
            java.lang.String r6 = "isMobileVerified"
            if (r15 == 0) goto L_0x01d9
            com.squareup.moshi.JsonReader$a r15 = r0.f7783a
            int r15 = r1.mo24989O(r15)
            switch(r15) {
                case -1: goto L_0x01bd;
                case 0: goto L_0x01a6;
                case 1: goto L_0x0192;
                case 2: goto L_0x0180;
                case 3: goto L_0x016f;
                case 4: goto L_0x015e;
                case 5: goto L_0x014f;
                case 6: goto L_0x0142;
                case 7: goto L_0x0130;
                case 8: goto L_0x010e;
                case 9: goto L_0x00fb;
                case 10: goto L_0x00e8;
                case 11: goto L_0x00da;
                case 12: goto L_0x00cc;
                case 13: goto L_0x00be;
                case 14: goto L_0x00b0;
                case 15: goto L_0x00a0;
                case 16: goto L_0x0092;
                case 17: goto L_0x0084;
                case 18: goto L_0x0076;
                case 19: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x01c3
        L_0x0068:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            r26 = r2
            java.lang.String r26 = (java.lang.String) r26
            r2 = -524289(0xfffffffffff7ffff, float:NaN)
            goto L_0x00ad
        L_0x0076:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            r25 = r2
            java.lang.String r25 = (java.lang.String) r25
            r2 = -262145(0xfffffffffffbffff, float:NaN)
            goto L_0x00ad
        L_0x0084:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            r24 = r2
            java.lang.String r24 = (java.lang.String) r24
            r2 = -131073(0xfffffffffffdffff, float:NaN)
            goto L_0x00ad
        L_0x0092:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            r23 = r2
            java.lang.String r23 = (java.lang.String) r23
            r2 = -65537(0xfffffffffffeffff, float:NaN)
            goto L_0x00ad
        L_0x00a0:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            r22 = r2
            java.lang.String r22 = (java.lang.String) r22
            r2 = -32769(0xffffffffffff7fff, float:NaN)
        L_0x00ad:
            r4 = r4 & r2
            goto L_0x01c3
        L_0x00b0:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            r21 = r2
            java.lang.String r21 = (java.lang.String) r21
            r4 = r4 & -16385(0xffffffffffffbfff, float:NaN)
            goto L_0x01c3
        L_0x00be:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            r20 = r2
            java.lang.String r20 = (java.lang.String) r20
            r4 = r4 & -8193(0xffffffffffffdfff, float:NaN)
            goto L_0x01c3
        L_0x00cc:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7784b
            java.lang.Object r2 = r2.mo11093a(r1)
            r19 = r2
            java.lang.Integer r19 = (java.lang.Integer) r19
            r4 = r4 & -4097(0xffffffffffffefff, float:NaN)
            goto L_0x01c3
        L_0x00da:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7784b
            java.lang.Object r2 = r2.mo11093a(r1)
            r18 = r2
            java.lang.Integer r18 = (java.lang.Integer) r18
            r4 = r4 & -2049(0xfffffffffffff7ff, float:NaN)
            goto L_0x01c3
        L_0x00e8:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7787e
            java.lang.Object r2 = r2.mo11093a(r1)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            if (r17 == 0) goto L_0x00f6
            goto L_0x01c3
        L_0x00f6:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r3, r5, r1)
            throw r1
        L_0x00fb:
            com.squareup.moshi.k<java.lang.String> r3 = r0.f7787e
            java.lang.Object r3 = r3.mo11093a(r1)
            r16 = r3
            java.lang.String r16 = (java.lang.String) r16
            if (r16 == 0) goto L_0x0109
            goto L_0x01c3
        L_0x0109:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r13, r2, r1)
            throw r1
        L_0x010e:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7786d
            java.lang.Object r2 = r2.mo11093a(r1)
            r6 = r2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x012b
            r3 = r27
            r2 = r28
            r13 = r29
            r12 = r30
            r11 = r31
            r9 = r32
            r8 = r33
            r7 = r34
            goto L_0x0030
        L_0x012b:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r11, r12, r1)
            throw r1
        L_0x0130:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7787e
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x013d
            r14 = r2
            goto L_0x01c3
        L_0x013d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r8, r9, r1)
            throw r1
        L_0x0142:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3 = r4 & -65
            r13 = r2
            goto L_0x01c6
        L_0x014f:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3 = r4 & -33
            r12 = r2
            r13 = r29
            goto L_0x01c8
        L_0x015e:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3 = r4 & -17
            r11 = r2
            r13 = r29
            r12 = r30
            goto L_0x01ca
        L_0x016f:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7786d
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x017b
            r10 = r2
            goto L_0x01c3
        L_0x017b:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r6, r7, r1)
            throw r1
        L_0x0180:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3 = r4 & -5
            r9 = r2
            r13 = r29
            r12 = r30
            r11 = r31
            goto L_0x01cc
        L_0x0192:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7785c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3 = r4 & -3
            r8 = r2
            r13 = r29
            r12 = r30
            r11 = r31
            r9 = r32
            goto L_0x01ce
        L_0x01a6:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7784b
            java.lang.Object r2 = r2.mo11093a(r1)
            r7 = r2
            java.lang.Integer r7 = (java.lang.Integer) r7
            r2 = r4 & -2
            r4 = r2
            r13 = r29
            r12 = r30
            r11 = r31
            r9 = r32
            r8 = r33
            goto L_0x01d1
        L_0x01bd:
            r62.mo24991S()
            r62.mo24992T()
        L_0x01c3:
            r3 = r4
            r13 = r29
        L_0x01c6:
            r12 = r30
        L_0x01c8:
            r11 = r31
        L_0x01ca:
            r9 = r32
        L_0x01cc:
            r8 = r33
        L_0x01ce:
            r4 = r3
            r7 = r34
        L_0x01d1:
            r3 = r27
            r2 = r28
            r6 = r35
            goto L_0x0030
        L_0x01d9:
            r62.mo24997r()
            r15 = -1046648(0xfffffffffff00788, float:NaN)
            if (r4 != r15) goto L_0x0220
            com.cubic.umo.auth.api.model.UserJWT r4 = new com.cubic.umo.auth.api.model.UserJWT
            if (r10 == 0) goto L_0x021b
            boolean r10 = r10.booleanValue()
            if (r14 == 0) goto L_0x0216
            if (r35 == 0) goto L_0x0211
            boolean r15 = r35.booleanValue()
            if (r16 == 0) goto L_0x020c
            if (r17 == 0) goto L_0x0207
            r6 = r4
            r7 = r34
            r8 = r33
            r9 = r32
            r11 = r31
            r12 = r30
            r13 = r29
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x02f5
        L_0x0207:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r3, r5, r1)
            throw r1
        L_0x020c:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r13, r2, r1)
            throw r1
        L_0x0211:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r12, r1)
            throw r1
        L_0x0216:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r8, r9, r1)
            throw r1
        L_0x021b:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r6, r7, r1)
            throw r1
        L_0x0220:
            java.lang.reflect.Constructor<com.cubic.umo.auth.api.model.UserJWT> r15 = r0.f7788f
            r36 = 7
            r37 = 6
            r38 = 5
            r39 = 4
            r40 = 3
            r41 = 2
            r42 = 1
            r43 = 0
            r44 = r6
            r6 = 22
            r45 = 21
            r46 = 20
            r47 = 19
            r48 = 18
            r49 = 17
            r50 = 16
            r51 = 15
            r52 = 14
            r53 = 13
            r54 = 12
            r55 = 11
            r56 = 10
            r57 = 9
            r58 = 8
            if (r15 != 0) goto L_0x029a
            java.lang.Class<com.cubic.umo.auth.api.model.UserJWT> r15 = com.cubic.umo.auth.api.model.UserJWT.class
            r59 = r7
            java.lang.Class[] r7 = new java.lang.Class[r6]
            r7[r43] = r28
            r7[r42] = r27
            r7[r41] = r27
            java.lang.Class r60 = java.lang.Boolean.TYPE
            r7[r40] = r60
            r7[r39] = r27
            r7[r38] = r27
            r7[r37] = r27
            r7[r36] = r27
            r7[r58] = r60
            r7[r57] = r27
            r7[r56] = r27
            r7[r55] = r28
            r7[r54] = r28
            r7[r53] = r27
            r7[r52] = r27
            r7[r51] = r27
            r7[r50] = r27
            r7[r49] = r27
            r7[r48] = r27
            r7[r47] = r27
            java.lang.Class r27 = java.lang.Integer.TYPE
            r7[r46] = r27
            java.lang.Class<?> r27 = ob0.C12977b.f32133c
            r7[r45] = r27
            java.lang.reflect.Constructor r15 = r15.getDeclaredConstructor(r7)
            r0.f7788f = r15
            bf0.d r7 = bf0.C21050d.f52856a
            java.lang.String r7 = "UserJWT::class.java.getD…his.constructorRef = it }"
            mf0.C24362h.m61210e(r15, r7)
            goto L_0x029c
        L_0x029a:
            r59 = r7
        L_0x029c:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r43] = r34
            r6[r42] = r33
            r6[r41] = r32
            if (r10 == 0) goto L_0x030a
            boolean r7 = r10.booleanValue()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r40] = r7
            r6[r39] = r31
            r6[r38] = r30
            r6[r37] = r29
            if (r14 == 0) goto L_0x0305
            r6[r36] = r14
            if (r35 == 0) goto L_0x0300
            boolean r7 = r35.booleanValue()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6[r58] = r7
            if (r16 == 0) goto L_0x02fb
            r6[r57] = r16
            if (r17 == 0) goto L_0x02f6
            r6[r56] = r17
            r6[r55] = r18
            r6[r54] = r19
            r6[r53] = r20
            r6[r52] = r21
            r6[r51] = r22
            r6[r50] = r23
            r6[r49] = r24
            r6[r48] = r25
            r6[r47] = r26
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r6[r46] = r1
            r1 = 0
            r6[r45] = r1
            java.lang.Object r1 = r15.newInstance(r6)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            mf0.C24362h.m61210e(r1, r2)
            r4 = r1
            com.cubic.umo.auth.api.model.UserJWT r4 = (com.cubic.umo.auth.api.model.UserJWT) r4
        L_0x02f5:
            return r4
        L_0x02f6:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r3, r5, r1)
            throw r1
        L_0x02fb:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r13, r2, r1)
            throw r1
        L_0x0300:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r12, r1)
            throw r1
        L_0x0305:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r8, r9, r1)
            throw r1
        L_0x030a:
            r3 = r44
            r2 = r59
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.auth.api.model.UserJWTJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        UserJWT userJWT = (UserJWT) obj;
        C24362h.m61211f(kVar, "writer");
        if (userJWT != null) {
            kVar.mo25074i();
            kVar.mo25077w("pass_id");
            this.f7784b.mo11094e(kVar, userJWT.f7772j);
            kVar.mo25077w("card_number");
            this.f7785c.mo11094e(kVar, userJWT.f7773k);
            kVar.mo25077w("account_key");
            this.f7785c.mo11094e(kVar, userJWT.f7774l);
            kVar.mo25077w("mobile_is_verified");
            C0017h.m63T(userJWT.f7775m, this.f7786d, kVar, "media_id");
            this.f7785c.mo11094e(kVar, userJWT.f7776n);
            kVar.mo25077w("user_token");
            this.f7785c.mo11094e(kVar, userJWT.f7777o);
            kVar.mo25077w("mobile_number");
            this.f7785c.mo11094e(kVar, userJWT.f7778p);
            kVar.mo25077w("session_state");
            this.f7787e.mo11094e(kVar, userJWT.f7779q);
            kVar.mo25077w("email_is_verified");
            C0017h.m63T(userJWT.f7780r, this.f7786d, kVar, "preferred_username");
            this.f7787e.mo11094e(kVar, userJWT.f7781s);
            kVar.mo25077w("cubic_id");
            this.f7787e.mo11094e(kVar, userJWT.f7782t);
            kVar.mo25077w("exp");
            this.f7784b.mo11094e(kVar, userJWT.f18077a);
            kVar.mo25077w("iat");
            this.f7784b.mo11094e(kVar, userJWT.f18078b);
            kVar.mo25077w("jti");
            this.f7785c.mo11094e(kVar, userJWT.f18079c);
            kVar.mo25077w("iss");
            this.f7785c.mo11094e(kVar, userJWT.f18080d);
            kVar.mo25077w("sub");
            this.f7785c.mo11094e(kVar, userJWT.f18081e);
            kVar.mo25077w("typ");
            this.f7785c.mo11094e(kVar, userJWT.f18082f);
            kVar.mo25077w("azp");
            this.f7785c.mo11094e(kVar, userJWT.f18083g);
            kVar.mo25077w("acr");
            this.f7785c.mo11094e(kVar, userJWT.f18084h);
            kVar.mo25077w("scope");
            this.f7785c.mo11094e(kVar, userJWT.f18085i);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UserJWT)";
    }
}
