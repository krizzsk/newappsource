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

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/auth/api/model/AnonymousJWTJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/auth/api/model/AnonymousJWT;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "auth_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class AnonymousJWTJsonAdapter extends C8011k<AnonymousJWT> {

    /* renamed from: a */
    public final JsonReader.C7986a f7758a = JsonReader.C7986a.m18216a("clientHost", "clientId", "clientAddress", "session_state", "email_is_verified", "preferred_username", "cubic_id", "exp", "iat", "jti", "iss", "sub", "typ", "azp", "acr", "scope");

    /* renamed from: b */
    public final C8011k<String> f7759b;

    /* renamed from: c */
    public final C8011k<Boolean> f7760c;

    /* renamed from: d */
    public final C8011k<Integer> f7761d;

    /* renamed from: e */
    public final C8011k<String> f7762e;

    /* renamed from: f */
    public volatile Constructor<AnonymousJWT> f7763f;

    public AnonymousJWTJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f7759b = oVar2.mo25082c(cls, emptySet, "clientHost");
        this.f7760c = oVar2.mo25082c(Boolean.TYPE, emptySet, "isEmailVerified");
        this.f7761d = oVar2.mo25082c(Integer.class, emptySet, "exp");
        this.f7762e = oVar2.mo25082c(cls, emptySet, "jti");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01a1, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a2, code lost:
        r15 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a4, code lost:
        r4 = r2;
        r14 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a7, code lost:
        r13 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a9, code lost:
        r12 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01ab, code lost:
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ad, code lost:
        r10 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01af, code lost:
        r9 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b1, code lost:
        r2 = r23;
        r3 = r24;
        r8 = r32;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r55) {
        /*
            r54 = this;
            r0 = r54
            r1 = r55
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "reader"
            mf0.C24362h.m61211f(r1, r4)
            r55.mo24995i()
            r4 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x0028:
            boolean r11 = r55.mo24999v()
            java.lang.String r5 = "cubic_id"
            r23 = r2
            java.lang.String r2 = "cubicId"
            r24 = r3
            java.lang.String r3 = "preferred_username"
            r25 = r15
            java.lang.String r15 = "userName"
            r26 = r14
            java.lang.String r14 = "email_is_verified"
            r27 = r13
            java.lang.String r13 = "isEmailVerified"
            r28 = r12
            java.lang.String r12 = "session_state"
            r29 = r6
            java.lang.String r6 = "session"
            r30 = r10
            java.lang.String r10 = "clientAddress"
            r31 = r9
            java.lang.String r9 = "clientId"
            r32 = r8
            java.lang.String r8 = "clientHost"
            if (r11 == 0) goto L_0x01b9
            com.squareup.moshi.JsonReader$a r11 = r0.f7758a
            int r11 = r1.mo24989O(r11)
            switch(r11) {
                case -1: goto L_0x019b;
                case 0: goto L_0x018a;
                case 1: goto L_0x0166;
                case 2: goto L_0x0149;
                case 3: goto L_0x012d;
                case 4: goto L_0x0113;
                case 5: goto L_0x00fb;
                case 6: goto L_0x00e5;
                case 7: goto L_0x00d5;
                case 8: goto L_0x00c8;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00ac;
                case 11: goto L_0x009e;
                case 12: goto L_0x0090;
                case 13: goto L_0x0082;
                case 14: goto L_0x0074;
                case 15: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x01a1
        L_0x0064:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7762e
            java.lang.Object r2 = r2.mo11093a(r1)
            r22 = r2
            java.lang.String r22 = (java.lang.String) r22
            r2 = -32769(0xffffffffffff7fff, float:NaN)
            r4 = r4 & r2
            goto L_0x01a1
        L_0x0074:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7762e
            java.lang.Object r2 = r2.mo11093a(r1)
            r21 = r2
            java.lang.String r21 = (java.lang.String) r21
            r4 = r4 & -16385(0xffffffffffffbfff, float:NaN)
            goto L_0x01a1
        L_0x0082:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7762e
            java.lang.Object r2 = r2.mo11093a(r1)
            r20 = r2
            java.lang.String r20 = (java.lang.String) r20
            r4 = r4 & -8193(0xffffffffffffdfff, float:NaN)
            goto L_0x01a1
        L_0x0090:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7762e
            java.lang.Object r2 = r2.mo11093a(r1)
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            r4 = r4 & -4097(0xffffffffffffefff, float:NaN)
            goto L_0x01a1
        L_0x009e:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7762e
            java.lang.Object r2 = r2.mo11093a(r1)
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            r4 = r4 & -2049(0xfffffffffffff7ff, float:NaN)
            goto L_0x01a1
        L_0x00ac:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7762e
            java.lang.Object r2 = r2.mo11093a(r1)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            r4 = r4 & -1025(0xfffffffffffffbff, float:NaN)
            goto L_0x01a1
        L_0x00ba:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7762e
            java.lang.Object r2 = r2.mo11093a(r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            r2 = r4 & -513(0xfffffffffffffdff, float:NaN)
            goto L_0x01a2
        L_0x00c8:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7761d
            java.lang.Object r2 = r2.mo11093a(r1)
            r15 = r2
            java.lang.Integer r15 = (java.lang.Integer) r15
            r2 = r4 & -257(0xfffffffffffffeff, float:NaN)
            goto L_0x01a4
        L_0x00d5:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7761d
            java.lang.Object r2 = r2.mo11093a(r1)
            r14 = r2
            java.lang.Integer r14 = (java.lang.Integer) r14
            r2 = r4 & -129(0xffffffffffffff7f, float:NaN)
            r4 = r2
            r15 = r25
            goto L_0x01a7
        L_0x00e5:
            com.squareup.moshi.k<java.lang.String> r3 = r0.f7759b
            java.lang.Object r3 = r3.mo11093a(r1)
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x00f6
            r15 = r25
            r14 = r26
            goto L_0x01a9
        L_0x00f6:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r5, r1)
            throw r1
        L_0x00fb:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7759b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x010e
            r12 = r2
            r15 = r25
            r14 = r26
            r13 = r27
            goto L_0x01ab
        L_0x010e:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r15, r3, r1)
            throw r1
        L_0x0113:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7760c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0128
            r6 = r2
            r15 = r25
            r14 = r26
            r13 = r27
            r12 = r28
            goto L_0x01ad
        L_0x0128:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r13, r14, r1)
            throw r1
        L_0x012d:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7759b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0144
            r10 = r2
            r15 = r25
            r14 = r26
            r13 = r27
            r12 = r28
            r6 = r29
            goto L_0x01af
        L_0x0144:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r6, r12, r1)
            throw r1
        L_0x0149:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7759b
            java.lang.Object r2 = r2.mo11093a(r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0161
            r15 = r25
            r14 = r26
            r13 = r27
            r12 = r28
            r6 = r29
            r10 = r30
            goto L_0x01b1
        L_0x0161:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r10, r10, r1)
            throw r1
        L_0x0166:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7759b
            java.lang.Object r2 = r2.mo11093a(r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0185
            r2 = r23
            r3 = r24
            r15 = r25
            r14 = r26
            r13 = r27
            r12 = r28
            r6 = r29
            r10 = r30
            r9 = r31
            goto L_0x0028
        L_0x0185:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r9, r9, r1)
            throw r1
        L_0x018a:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7759b
            java.lang.Object r2 = r2.mo11093a(r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0196
            goto L_0x01a1
        L_0x0196:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r8, r8, r1)
            throw r1
        L_0x019b:
            r55.mo24991S()
            r55.mo24992T()
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            r15 = r25
        L_0x01a4:
            r4 = r2
            r14 = r26
        L_0x01a7:
            r13 = r27
        L_0x01a9:
            r12 = r28
        L_0x01ab:
            r6 = r29
        L_0x01ad:
            r10 = r30
        L_0x01af:
            r9 = r31
        L_0x01b1:
            r2 = r23
            r3 = r24
            r8 = r32
            goto L_0x0028
        L_0x01b9:
            r55.mo24997r()
            r11 = -65409(0xffffffffffff007f, float:NaN)
            if (r4 != r11) goto L_0x020c
            com.cubic.umo.auth.api.model.AnonymousJWT r4 = new com.cubic.umo.auth.api.model.AnonymousJWT
            if (r7 == 0) goto L_0x0207
            if (r32 == 0) goto L_0x0202
            if (r31 == 0) goto L_0x01fd
            if (r30 == 0) goto L_0x01f8
            if (r29 == 0) goto L_0x01f3
            boolean r11 = r29.booleanValue()
            if (r28 == 0) goto L_0x01ee
            if (r27 == 0) goto L_0x01e9
            r6 = r4
            r8 = r32
            r9 = r31
            r10 = r30
            r12 = r28
            r13 = r27
            r14 = r26
            r15 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x02c3
        L_0x01e9:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r5, r1)
            throw r1
        L_0x01ee:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r3, r1)
            throw r1
        L_0x01f3:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r13, r14, r1)
            throw r1
        L_0x01f8:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r6, r12, r1)
            throw r1
        L_0x01fd:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r10, r10, r1)
            throw r1
        L_0x0202:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r9, r9, r1)
            throw r1
        L_0x0207:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r8, r8, r1)
            throw r1
        L_0x020c:
            java.lang.reflect.Constructor<com.cubic.umo.auth.api.model.AnonymousJWT> r11 = r0.f7763f
            r33 = 7
            r34 = 6
            r35 = 5
            r36 = 4
            r37 = 3
            r38 = 2
            r39 = 1
            r40 = 0
            r41 = r8
            r8 = 18
            r42 = 17
            r43 = 16
            r44 = 15
            r45 = 14
            r46 = 13
            r47 = 12
            r48 = 11
            r49 = 10
            r50 = 9
            r51 = 8
            if (r11 != 0) goto L_0x0274
            java.lang.Class<com.cubic.umo.auth.api.model.AnonymousJWT> r11 = com.cubic.umo.auth.api.model.AnonymousJWT.class
            r52 = r9
            java.lang.Class[] r9 = new java.lang.Class[r8]
            r9[r40] = r24
            r9[r39] = r24
            r9[r38] = r24
            r9[r37] = r24
            java.lang.Class r53 = java.lang.Boolean.TYPE
            r9[r36] = r53
            r9[r35] = r24
            r9[r34] = r24
            r9[r33] = r23
            r9[r51] = r23
            r9[r50] = r24
            r9[r49] = r24
            r9[r48] = r24
            r9[r47] = r24
            r9[r46] = r24
            r9[r45] = r24
            r9[r44] = r24
            java.lang.Class r23 = java.lang.Integer.TYPE
            r9[r43] = r23
            java.lang.Class<?> r23 = ob0.C12977b.f32133c
            r9[r42] = r23
            java.lang.reflect.Constructor r11 = r11.getDeclaredConstructor(r9)
            r0.f7763f = r11
            java.lang.String r9 = "AnonymousJWT::class.java…his.constructorRef = it }"
            mf0.C24362h.m61210e(r11, r9)
            goto L_0x0276
        L_0x0274:
            r52 = r9
        L_0x0276:
            java.lang.Object[] r8 = new java.lang.Object[r8]
            if (r7 == 0) goto L_0x02e4
            r8[r40] = r7
            if (r32 == 0) goto L_0x02dd
            r8[r39] = r32
            if (r31 == 0) goto L_0x02d8
            r8[r38] = r31
            if (r30 == 0) goto L_0x02d3
            r8[r37] = r30
            if (r29 == 0) goto L_0x02ce
            boolean r6 = r29.booleanValue()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r8[r36] = r6
            if (r28 == 0) goto L_0x02c9
            r8[r35] = r28
            if (r27 == 0) goto L_0x02c4
            r8[r34] = r27
            r8[r33] = r26
            r8[r51] = r25
            r8[r50] = r16
            r8[r49] = r17
            r8[r48] = r18
            r8[r47] = r19
            r8[r46] = r20
            r8[r45] = r21
            r8[r44] = r22
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r8[r43] = r1
            r1 = 0
            r8[r42] = r1
            java.lang.Object r1 = r11.newInstance(r8)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            mf0.C24362h.m61210e(r1, r2)
            r4 = r1
            com.cubic.umo.auth.api.model.AnonymousJWT r4 = (com.cubic.umo.auth.api.model.AnonymousJWT) r4
        L_0x02c3:
            return r4
        L_0x02c4:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r5, r1)
            throw r1
        L_0x02c9:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r3, r1)
            throw r1
        L_0x02ce:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r13, r14, r1)
            throw r1
        L_0x02d3:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r6, r12, r1)
            throw r1
        L_0x02d8:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r10, r10, r1)
            throw r1
        L_0x02dd:
            r2 = r52
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r2, r1)
            throw r1
        L_0x02e4:
            r2 = r41
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.auth.api.model.AnonymousJWTJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AnonymousJWT anonymousJWT = (AnonymousJWT) obj;
        C24362h.m61211f(kVar, "writer");
        if (anonymousJWT != null) {
            kVar.mo25074i();
            kVar.mo25077w("clientHost");
            this.f7759b.mo11094e(kVar, anonymousJWT.f7751j);
            kVar.mo25077w("clientId");
            this.f7759b.mo11094e(kVar, anonymousJWT.f7752k);
            kVar.mo25077w("clientAddress");
            this.f7759b.mo11094e(kVar, anonymousJWT.f7753l);
            kVar.mo25077w("session_state");
            this.f7759b.mo11094e(kVar, anonymousJWT.f7754m);
            kVar.mo25077w("email_is_verified");
            C0017h.m63T(anonymousJWT.f7755n, this.f7760c, kVar, "preferred_username");
            this.f7759b.mo11094e(kVar, anonymousJWT.f7756o);
            kVar.mo25077w("cubic_id");
            this.f7759b.mo11094e(kVar, anonymousJWT.f7757p);
            kVar.mo25077w("exp");
            this.f7761d.mo11094e(kVar, anonymousJWT.f18077a);
            kVar.mo25077w("iat");
            this.f7761d.mo11094e(kVar, anonymousJWT.f18078b);
            kVar.mo25077w("jti");
            this.f7762e.mo11094e(kVar, anonymousJWT.f18079c);
            kVar.mo25077w("iss");
            this.f7762e.mo11094e(kVar, anonymousJWT.f18080d);
            kVar.mo25077w("sub");
            this.f7762e.mo11094e(kVar, anonymousJWT.f18081e);
            kVar.mo25077w("typ");
            this.f7762e.mo11094e(kVar, anonymousJWT.f18082f);
            kVar.mo25077w("azp");
            this.f7762e.mo11094e(kVar, anonymousJWT.f18083g);
            kVar.mo25077w("acr");
            this.f7762e.mo11094e(kVar, anonymousJWT.f18084h);
            kVar.mo25077w("scope");
            this.f7762e.mo11094e(kVar, anonymousJWT.f18085i);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AnonymousJWT)";
    }
}
