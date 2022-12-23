package com.cubic.umo.pass.model;

import com.appboy.models.InAppMessageBase;
import com.appboy.models.outgoing.TwitterUser;
import com.cubic.umo.pass.model.PassDTO;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/PassDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/PassDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class PassDTOJsonAdapter extends C8011k<PassDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f8170a = JsonReader.C7986a.m18216a("durationUnits", "name", TwitterUser.DESCRIPTION_KEY, "shortDescription", "agency", "passTypeDescription", "passPurchaseTx", "startExpDescription", "tripsLeft", "start", InAppMessageBase.DURATION, "expiration", "autoRenew", "renewable", "created", InAppPurchaseMetaData.KEY_PRICE, "cost", "passTypeName", "maxQuantity", "passId", "originalTrips", "stablePassProductId", "passProductId", "lowTrips", "passExpiring");

    /* renamed from: b */
    public final C8011k<TimeUnit> f8171b;

    /* renamed from: c */
    public final C8011k<String> f8172c;

    /* renamed from: d */
    public final C8011k<TxDTO> f8173d;

    /* renamed from: e */
    public final C8011k<String> f8174e;

    /* renamed from: f */
    public final C8011k<Integer> f8175f;

    /* renamed from: g */
    public final C8011k<Long> f8176g;

    /* renamed from: h */
    public final C8011k<Boolean> f8177h;

    /* renamed from: i */
    public final C8011k<Boolean> f8178i;

    /* renamed from: j */
    public final C8011k<Long> f8179j;

    /* renamed from: k */
    public final C8011k<Integer> f8180k;

    /* renamed from: l */
    public final C8011k<Money> f8181l;

    /* renamed from: m */
    public final C8011k<PassDTO.PassType> f8182m;

    public PassDTOJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8171b = oVar2.mo25082c(TimeUnit.class, emptySet, "durationUnits");
        this.f8172c = oVar2.mo25082c(cls, emptySet, "name");
        this.f8173d = oVar2.mo25082c(TxDTO.class, emptySet, "passPurchaseTx");
        this.f8174e = oVar2.mo25082c(cls, emptySet, "startExpDescription");
        this.f8175f = oVar2.mo25082c(Integer.class, emptySet, "tripsLeft");
        this.f8176g = oVar2.mo25082c(Long.class, emptySet, "start");
        this.f8177h = oVar2.mo25082c(Boolean.TYPE, emptySet, "autoRenew");
        this.f8178i = oVar2.mo25082c(Boolean.class, emptySet, "renewable");
        this.f8179j = oVar2.mo25082c(Long.TYPE, emptySet, "created");
        this.f8180k = oVar2.mo25082c(Integer.TYPE, emptySet, InAppPurchaseMetaData.KEY_PRICE);
        this.f8181l = oVar2.mo25082c(Money.class, emptySet, "cost");
        this.f8182m = oVar2.mo25082c(PassDTO.PassType.class, emptySet, "passType");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x02b0, code lost:
        r13 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02b2, code lost:
        r15 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02b4, code lost:
        r14 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02b6, code lost:
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02b8, code lost:
        r2 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02ba, code lost:
        r3 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02bc, code lost:
        r4 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02be, code lost:
        r5 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02c0, code lost:
        r12 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02c2, code lost:
        r11 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02c4, code lost:
        r10 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c6, code lost:
        r9 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02c8, code lost:
        r8 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ca, code lost:
        r7 = r41;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r46) {
        /*
            r45 = this;
            r0 = r45
            r1 = r46
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r46.mo24995i()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r21 = r18
            r22 = r21
            r23 = r22
            r26 = r23
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
        L_0x0030:
            boolean r19 = r46.mo24999v()
            r20 = r13
            java.lang.String r13 = "passTypeName"
            r24 = r15
            java.lang.String r15 = "passType"
            r25 = r14
            java.lang.String r14 = "passProductId"
            r31 = r6
            java.lang.String r6 = "passId"
            r32 = r2
            java.lang.String r2 = "cost"
            r33 = r3
            java.lang.String r3 = "price"
            r34 = r4
            java.lang.String r4 = "created"
            r35 = r5
            java.lang.String r5 = "autoRenew"
            r36 = r12
            java.lang.String r12 = "passPurchaseTx"
            r37 = r11
            java.lang.String r11 = "passTypeDescription"
            r38 = r10
            java.lang.String r10 = "agency"
            r39 = r9
            java.lang.String r9 = "shortDescription"
            r40 = r8
            java.lang.String r8 = "description"
            r41 = r7
            java.lang.String r7 = "name"
            if (r19 == 0) goto L_0x02ce
            r19 = r7
            com.squareup.moshi.JsonReader$a r7 = r0.f8170a
            int r7 = r1.mo24989O(r7)
            switch(r7) {
                case -1: goto L_0x02aa;
                case 0: goto L_0x029a;
                case 1: goto L_0x026c;
                case 2: goto L_0x0242;
                case 3: goto L_0x021a;
                case 4: goto L_0x01f4;
                case 5: goto L_0x01d0;
                case 6: goto L_0x01ae;
                case 7: goto L_0x019f;
                case 8: goto L_0x0192;
                case 9: goto L_0x0187;
                case 10: goto L_0x017b;
                case 11: goto L_0x016f;
                case 12: goto L_0x014f;
                case 13: goto L_0x0143;
                case 14: goto L_0x0125;
                case 15: goto L_0x0109;
                case 16: goto L_0x00f6;
                case 17: goto L_0x00e3;
                case 18: goto L_0x00d7;
                case 19: goto L_0x00be;
                case 20: goto L_0x00b2;
                case 21: goto L_0x00a6;
                case 22: goto L_0x0093;
                case 23: goto L_0x0087;
                case 24: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x02b0
        L_0x007b:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8178i
            java.lang.Object r2 = r2.mo11093a(r1)
            r30 = r2
            java.lang.Boolean r30 = (java.lang.Boolean) r30
            goto L_0x02b0
        L_0x0087:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8178i
            java.lang.Object r2 = r2.mo11093a(r1)
            r29 = r2
            java.lang.Boolean r29 = (java.lang.Boolean) r29
            goto L_0x02b0
        L_0x0093:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8172c
            java.lang.Object r2 = r2.mo11093a(r1)
            r28 = r2
            java.lang.String r28 = (java.lang.String) r28
            if (r28 == 0) goto L_0x00a1
            goto L_0x02b0
        L_0x00a1:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r14, r14, r1)
            throw r1
        L_0x00a6:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8174e
            java.lang.Object r2 = r2.mo11093a(r1)
            r27 = r2
            java.lang.String r27 = (java.lang.String) r27
            goto L_0x02b0
        L_0x00b2:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8175f
            java.lang.Object r2 = r2.mo11093a(r1)
            r26 = r2
            java.lang.Integer r26 = (java.lang.Integer) r26
            goto L_0x02b0
        L_0x00be:
            com.squareup.moshi.k<java.lang.Long> r2 = r0.f8179j
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x00d2
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            goto L_0x02ba
        L_0x00d2:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r6, r6, r1)
            throw r1
        L_0x00d7:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8175f
            java.lang.Object r2 = r2.mo11093a(r1)
            r23 = r2
            java.lang.Integer r23 = (java.lang.Integer) r23
            goto L_0x02b0
        L_0x00e3:
            com.squareup.moshi.k<com.cubic.umo.pass.model.PassDTO$PassType> r2 = r0.f8182m
            java.lang.Object r2 = r2.mo11093a(r1)
            r22 = r2
            com.cubic.umo.pass.model.PassDTO$PassType r22 = (com.cubic.umo.pass.model.PassDTO.PassType) r22
            if (r22 == 0) goto L_0x00f1
            goto L_0x02b0
        L_0x00f1:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r15, r13, r1)
            throw r1
        L_0x00f6:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r3 = r0.f8181l
            java.lang.Object r3 = r3.mo11093a(r1)
            r21 = r3
            com.cubic.umo.pass.model.Money r21 = (com.cubic.umo.pass.model.Money) r21
            if (r21 == 0) goto L_0x0104
            goto L_0x02b0
        L_0x0104:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r2, r1)
            throw r1
        L_0x0109:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8180k
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0120
            r3 = r2
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            r2 = r32
            goto L_0x02bc
        L_0x0120:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r3, r3, r1)
            throw r1
        L_0x0125:
            com.squareup.moshi.k<java.lang.Long> r2 = r0.f8179j
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x013e
            r4 = r2
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            r2 = r32
            r3 = r33
            goto L_0x02be
        L_0x013e:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r4, r4, r1)
            throw r1
        L_0x0143:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8178i
            java.lang.Object r2 = r2.mo11093a(r1)
            r18 = r2
            java.lang.Boolean r18 = (java.lang.Boolean) r18
            goto L_0x02b0
        L_0x014f:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8177h
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x016a
            r5 = r2
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            goto L_0x02c0
        L_0x016a:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r5, r5, r1)
            throw r1
        L_0x016f:
            com.squareup.moshi.k<java.lang.Long> r2 = r0.f8176g
            java.lang.Object r2 = r2.mo11093a(r1)
            r17 = r2
            java.lang.Long r17 = (java.lang.Long) r17
            goto L_0x02b0
        L_0x017b:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8175f
            java.lang.Object r2 = r2.mo11093a(r1)
            r16 = r2
            java.lang.Integer r16 = (java.lang.Integer) r16
            goto L_0x02b0
        L_0x0187:
            com.squareup.moshi.k<java.lang.Long> r2 = r0.f8176g
            java.lang.Object r2 = r2.mo11093a(r1)
            r13 = r2
            java.lang.Long r13 = (java.lang.Long) r13
            goto L_0x02b2
        L_0x0192:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8175f
            java.lang.Object r2 = r2.mo11093a(r1)
            r15 = r2
            java.lang.Integer r15 = (java.lang.Integer) r15
            r13 = r20
            goto L_0x02b4
        L_0x019f:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8174e
            java.lang.Object r2 = r2.mo11093a(r1)
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            r13 = r20
            r15 = r24
            goto L_0x02b6
        L_0x01ae:
            com.squareup.moshi.k<com.cubic.umo.pass.model.TxDTO> r2 = r0.f8173d
            java.lang.Object r2 = r2.mo11093a(r1)
            com.cubic.umo.pass.model.TxDTO r2 = (com.cubic.umo.pass.model.TxDTO) r2
            if (r2 == 0) goto L_0x01cb
            r12 = r2
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            goto L_0x02c2
        L_0x01cb:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r12, r12, r1)
            throw r1
        L_0x01d0:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8172c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x01ef
            r11 = r2
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r12 = r36
            goto L_0x02c4
        L_0x01ef:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r11, r11, r1)
            throw r1
        L_0x01f4:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8172c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0215
            r10 = r2
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r12 = r36
            r11 = r37
            goto L_0x02c6
        L_0x0215:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r10, r10, r1)
            throw r1
        L_0x021a:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8172c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x023d
            r9 = r2
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r12 = r36
            r11 = r37
            r10 = r38
            goto L_0x02c8
        L_0x023d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r9, r9, r1)
            throw r1
        L_0x0242:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8172c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0267
            r8 = r2
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r12 = r36
            r11 = r37
            r10 = r38
            r9 = r39
            goto L_0x02ca
        L_0x0267:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r8, r8, r1)
            throw r1
        L_0x026c:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8172c
            java.lang.Object r2 = r2.mo11093a(r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0293
            r13 = r20
            r15 = r24
            r14 = r25
            r6 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r5 = r35
            r12 = r36
            r11 = r37
            r10 = r38
            r9 = r39
            r8 = r40
            goto L_0x0030
        L_0x0293:
            r7 = r19
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r7, r7, r1)
            throw r1
        L_0x029a:
            com.squareup.moshi.k<com.cubic.umo.pass.model.TimeUnit> r2 = r0.f8171b
            java.lang.Object r2 = r2.mo11093a(r1)
            r6 = r2
            com.cubic.umo.pass.model.TimeUnit r6 = (com.cubic.umo.pass.model.TimeUnit) r6
            r13 = r20
            r15 = r24
            r14 = r25
            goto L_0x02b8
        L_0x02aa:
            r46.mo24991S()
            r46.mo24992T()
        L_0x02b0:
            r13 = r20
        L_0x02b2:
            r15 = r24
        L_0x02b4:
            r14 = r25
        L_0x02b6:
            r6 = r31
        L_0x02b8:
            r2 = r32
        L_0x02ba:
            r3 = r33
        L_0x02bc:
            r4 = r34
        L_0x02be:
            r5 = r35
        L_0x02c0:
            r12 = r36
        L_0x02c2:
            r11 = r37
        L_0x02c4:
            r10 = r38
        L_0x02c6:
            r9 = r39
        L_0x02c8:
            r8 = r40
        L_0x02ca:
            r7 = r41
            goto L_0x0030
        L_0x02ce:
            r46.mo24997r()
            com.cubic.umo.pass.model.PassDTO r42 = new com.cubic.umo.pass.model.PassDTO
            if (r41 == 0) goto L_0x0361
            if (r40 == 0) goto L_0x035c
            if (r39 == 0) goto L_0x0357
            if (r38 == 0) goto L_0x0352
            if (r37 == 0) goto L_0x034d
            if (r36 == 0) goto L_0x0348
            if (r35 == 0) goto L_0x0343
            boolean r19 = r35.booleanValue()
            if (r34 == 0) goto L_0x033e
            long r34 = r34.longValue()
            if (r33 == 0) goto L_0x0339
            int r33 = r33.intValue()
            if (r21 == 0) goto L_0x0334
            if (r22 == 0) goto L_0x032f
            if (r32 == 0) goto L_0x032a
            long r43 = r32.longValue()
            if (r28 == 0) goto L_0x0325
            r3 = r42
            r4 = r31
            r5 = r41
            r6 = r40
            r7 = r39
            r8 = r38
            r9 = r37
            r10 = r36
            r11 = r25
            r12 = r24
            r13 = r20
            r14 = r16
            r15 = r17
            r16 = r19
            r17 = r18
            r18 = r34
            r20 = r33
            r24 = r43
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30)
            return r42
        L_0x0325:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r14, r14, r1)
            throw r1
        L_0x032a:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r6, r6, r1)
            throw r1
        L_0x032f:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r13, r1)
            throw r1
        L_0x0334:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r2, r1)
            throw r1
        L_0x0339:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r3, r3, r1)
            throw r1
        L_0x033e:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r4, r4, r1)
            throw r1
        L_0x0343:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r5, r5, r1)
            throw r1
        L_0x0348:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r12, r12, r1)
            throw r1
        L_0x034d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r11, r1)
            throw r1
        L_0x0352:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r10, r10, r1)
            throw r1
        L_0x0357:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r9, r9, r1)
            throw r1
        L_0x035c:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r8, r8, r1)
            throw r1
        L_0x0361:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r7, r7, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.model.PassDTOJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        PassDTO passDTO = (PassDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (passDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("durationUnits");
            this.f8171b.mo11094e(kVar, passDTO.f8145b);
            kVar.mo25077w("name");
            this.f8172c.mo11094e(kVar, passDTO.f8146c);
            kVar.mo25077w(TwitterUser.DESCRIPTION_KEY);
            this.f8172c.mo11094e(kVar, passDTO.f8147d);
            kVar.mo25077w("shortDescription");
            this.f8172c.mo11094e(kVar, passDTO.f8148e);
            kVar.mo25077w("agency");
            this.f8172c.mo11094e(kVar, passDTO.f8149f);
            kVar.mo25077w("passTypeDescription");
            this.f8172c.mo11094e(kVar, passDTO.f8150g);
            kVar.mo25077w("passPurchaseTx");
            this.f8173d.mo11094e(kVar, passDTO.f8151h);
            kVar.mo25077w("startExpDescription");
            this.f8174e.mo11094e(kVar, passDTO.f8152i);
            kVar.mo25077w("tripsLeft");
            this.f8175f.mo11094e(kVar, passDTO.f8153j);
            kVar.mo25077w("start");
            this.f8176g.mo11094e(kVar, passDTO.f8154k);
            kVar.mo25077w(InAppMessageBase.DURATION);
            this.f8175f.mo11094e(kVar, passDTO.f8155l);
            kVar.mo25077w("expiration");
            this.f8176g.mo11094e(kVar, passDTO.f8156m);
            kVar.mo25077w("autoRenew");
            C0017h.m63T(passDTO.f8157n, this.f8177h, kVar, "renewable");
            this.f8178i.mo11094e(kVar, passDTO.f8158o);
            kVar.mo25077w("created");
            this.f8179j.mo11094e(kVar, Long.valueOf(passDTO.f8159p));
            kVar.mo25077w(InAppPurchaseMetaData.KEY_PRICE);
            this.f8180k.mo11094e(kVar, Integer.valueOf(passDTO.f8160q));
            kVar.mo25077w("cost");
            this.f8181l.mo11094e(kVar, passDTO.f8161r);
            kVar.mo25077w("passTypeName");
            this.f8182m.mo11094e(kVar, passDTO.f8162s);
            kVar.mo25077w("maxQuantity");
            this.f8175f.mo11094e(kVar, passDTO.f8163t);
            kVar.mo25077w("passId");
            this.f8179j.mo11094e(kVar, Long.valueOf(passDTO.f8164u));
            kVar.mo25077w("originalTrips");
            this.f8175f.mo11094e(kVar, passDTO.f8165v);
            kVar.mo25077w("stablePassProductId");
            this.f8174e.mo11094e(kVar, passDTO.f8166w);
            kVar.mo25077w("passProductId");
            this.f8172c.mo11094e(kVar, passDTO.f8167x);
            kVar.mo25077w("lowTrips");
            this.f8178i.mo11094e(kVar, passDTO.f8168y);
            kVar.mo25077w("passExpiring");
            this.f8178i.mo11094e(kVar, passDTO.f8169z);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PassDTO)";
    }
}
