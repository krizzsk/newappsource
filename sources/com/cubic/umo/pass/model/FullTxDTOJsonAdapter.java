package com.cubic.umo.pass.model;

import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/FullTxDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/FullTxDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class FullTxDTOJsonAdapter extends C8011k<FullTxDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f8083a = JsonReader.C7986a.m18216a("txId", "when", TwitterUser.DESCRIPTION_KEY, "type", FacebookUser.LOCATION_OUTER_OBJECT_KEY, "balance", "fare", "adjustment", "readerName", "gps", "routeName", "routeType", "stopName", "passUsed", "fareType", "transferCount", "passbackCount", "transferCredits", "accountStatus", "mediaStatus", "agency", "agencyPublicId", "vehicle", "comment", "fundingSourceType", "truncatedSourceId", "authorization", "salesChannel", "tvmId", "retailer", "referenceTxId");

    /* renamed from: b */
    public final C8011k<String> f8084b;

    /* renamed from: c */
    public final C8011k<TransactionType> f8085c;

    /* renamed from: d */
    public final C8011k<Money> f8086d;

    /* renamed from: e */
    public final C8011k<String> f8087e;

    /* renamed from: f */
    public final C8011k<PassDTO> f8088f;

    /* renamed from: g */
    public final C8011k<Integer> f8089g;

    /* renamed from: h */
    public final C8011k<AccountStatus> f8090h;

    /* renamed from: i */
    public final C8011k<MediaStatus> f8091i;

    public FullTxDTOJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8084b = oVar2.mo25082c(cls, emptySet, "txId");
        this.f8085c = oVar2.mo25082c(TransactionType.class, emptySet, "type");
        this.f8086d = oVar2.mo25082c(Money.class, emptySet, "balance");
        this.f8087e = oVar2.mo25082c(cls, emptySet, "readerName");
        this.f8088f = oVar2.mo25082c(PassDTO.class, emptySet, "passUsed");
        this.f8089g = oVar2.mo25082c(Integer.class, emptySet, "transferCount");
        this.f8090h = oVar2.mo25082c(AccountStatus.class, emptySet, "accountStatus");
        this.f8091i = oVar2.mo25082c(MediaStatus.class, emptySet, "mediaStatus");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0217, code lost:
        r15 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0219, code lost:
        r14 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x021b, code lost:
        r13 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x021d, code lost:
        r12 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x021f, code lost:
        r11 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0221, code lost:
        r10 = r40;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r42) {
        /*
            r41 = this;
            r0 = r41
            r1 = r42
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r42.mo24995i()
            r2 = 0
            r4 = r2
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
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
        L_0x003f:
            boolean r2 = r42.mo24999v()
            java.lang.String r3 = "location"
            r35 = r15
            java.lang.String r15 = "_location"
            r36 = r14
            java.lang.String r14 = "when"
            r37 = r13
            java.lang.String r13 = "when_"
            r38 = r12
            java.lang.String r12 = "type"
            r39 = r11
            java.lang.String r11 = "description"
            r40 = r10
            java.lang.String r10 = "txId"
            if (r2 == 0) goto L_0x0225
            com.squareup.moshi.JsonReader$a r2 = r0.f8083a
            int r2 = r1.mo24989O(r2)
            switch(r2) {
                case -1: goto L_0x0211;
                case 0: goto L_0x0200;
                case 1: goto L_0x01ef;
                case 2: goto L_0x01de;
                case 3: goto L_0x01cd;
                case 4: goto L_0x01bc;
                case 5: goto L_0x01b2;
                case 6: goto L_0x019d;
                case 7: goto L_0x018a;
                case 8: goto L_0x0179;
                case 9: goto L_0x016a;
                case 10: goto L_0x015d;
                case 11: goto L_0x0152;
                case 12: goto L_0x0146;
                case 13: goto L_0x013a;
                case 14: goto L_0x012e;
                case 15: goto L_0x0122;
                case 16: goto L_0x0116;
                case 17: goto L_0x010a;
                case 18: goto L_0x00fe;
                case 19: goto L_0x00f2;
                case 20: goto L_0x00e6;
                case 21: goto L_0x00da;
                case 22: goto L_0x00ce;
                case 23: goto L_0x00c2;
                case 24: goto L_0x00b6;
                case 25: goto L_0x00aa;
                case 26: goto L_0x009e;
                case 27: goto L_0x0092;
                case 28: goto L_0x0086;
                case 29: goto L_0x007a;
                case 30: goto L_0x006e;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0217
        L_0x006e:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r34 = r2
            java.lang.String r34 = (java.lang.String) r34
            goto L_0x0217
        L_0x007a:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r33 = r2
            java.lang.String r33 = (java.lang.String) r33
            goto L_0x0217
        L_0x0086:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r32 = r2
            java.lang.String r32 = (java.lang.String) r32
            goto L_0x0217
        L_0x0092:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r31 = r2
            java.lang.String r31 = (java.lang.String) r31
            goto L_0x0217
        L_0x009e:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r30 = r2
            java.lang.String r30 = (java.lang.String) r30
            goto L_0x0217
        L_0x00aa:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r29 = r2
            java.lang.String r29 = (java.lang.String) r29
            goto L_0x0217
        L_0x00b6:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r28 = r2
            java.lang.String r28 = (java.lang.String) r28
            goto L_0x0217
        L_0x00c2:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r27 = r2
            java.lang.String r27 = (java.lang.String) r27
            goto L_0x0217
        L_0x00ce:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r26 = r2
            java.lang.String r26 = (java.lang.String) r26
            goto L_0x0217
        L_0x00da:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r25 = r2
            java.lang.String r25 = (java.lang.String) r25
            goto L_0x0217
        L_0x00e6:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r24 = r2
            java.lang.String r24 = (java.lang.String) r24
            goto L_0x0217
        L_0x00f2:
            com.squareup.moshi.k<com.cubic.umo.pass.model.MediaStatus> r2 = r0.f8091i
            java.lang.Object r2 = r2.mo11093a(r1)
            r23 = r2
            com.cubic.umo.pass.model.MediaStatus r23 = (com.cubic.umo.pass.model.MediaStatus) r23
            goto L_0x0217
        L_0x00fe:
            com.squareup.moshi.k<com.cubic.umo.pass.model.AccountStatus> r2 = r0.f8090h
            java.lang.Object r2 = r2.mo11093a(r1)
            r22 = r2
            com.cubic.umo.pass.model.AccountStatus r22 = (com.cubic.umo.pass.model.AccountStatus) r22
            goto L_0x0217
        L_0x010a:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8089g
            java.lang.Object r2 = r2.mo11093a(r1)
            r21 = r2
            java.lang.Integer r21 = (java.lang.Integer) r21
            goto L_0x0217
        L_0x0116:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8089g
            java.lang.Object r2 = r2.mo11093a(r1)
            r20 = r2
            java.lang.Integer r20 = (java.lang.Integer) r20
            goto L_0x0217
        L_0x0122:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8089g
            java.lang.Object r2 = r2.mo11093a(r1)
            r19 = r2
            java.lang.Integer r19 = (java.lang.Integer) r19
            goto L_0x0217
        L_0x012e:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            goto L_0x0217
        L_0x013a:
            com.squareup.moshi.k<com.cubic.umo.pass.model.PassDTO> r2 = r0.f8088f
            java.lang.Object r2 = r2.mo11093a(r1)
            r17 = r2
            com.cubic.umo.pass.model.PassDTO r17 = (com.cubic.umo.pass.model.PassDTO) r17
            goto L_0x0217
        L_0x0146:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            goto L_0x0217
        L_0x0152:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            goto L_0x0219
        L_0x015d:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            r15 = r35
            goto L_0x021b
        L_0x016a:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            r13 = r2
            r15 = r35
            r14 = r36
            goto L_0x021d
        L_0x0179:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8087e
            java.lang.Object r2 = r2.mo11093a(r1)
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            r15 = r35
            r14 = r36
            r13 = r37
            goto L_0x021f
        L_0x018a:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f8086d
            java.lang.Object r2 = r2.mo11093a(r1)
            com.cubic.umo.pass.model.Money r2 = (com.cubic.umo.pass.model.Money) r2
            r11 = r2
            r15 = r35
            r14 = r36
            r13 = r37
            r12 = r38
            goto L_0x0221
        L_0x019d:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f8086d
            java.lang.Object r2 = r2.mo11093a(r1)
            r10 = r2
            com.cubic.umo.pass.model.Money r10 = (com.cubic.umo.pass.model.Money) r10
            r15 = r35
            r14 = r36
            r13 = r37
            r12 = r38
            r11 = r39
            goto L_0x003f
        L_0x01b2:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f8086d
            java.lang.Object r2 = r2.mo11093a(r1)
            r9 = r2
            com.cubic.umo.pass.model.Money r9 = (com.cubic.umo.pass.model.Money) r9
            goto L_0x0217
        L_0x01bc:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8084b
            java.lang.Object r2 = r2.mo11093a(r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x01c8
            goto L_0x0217
        L_0x01c8:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r15, r3, r1)
            throw r1
        L_0x01cd:
            com.squareup.moshi.k<com.cubic.umo.pass.model.TransactionType> r2 = r0.f8085c
            java.lang.Object r2 = r2.mo11093a(r1)
            r7 = r2
            com.cubic.umo.pass.model.TransactionType r7 = (com.cubic.umo.pass.model.TransactionType) r7
            if (r7 == 0) goto L_0x01d9
            goto L_0x0217
        L_0x01d9:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r12, r12, r1)
            throw r1
        L_0x01de:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8084b
            java.lang.Object r2 = r2.mo11093a(r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x01ea
            goto L_0x0217
        L_0x01ea:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r11, r11, r1)
            throw r1
        L_0x01ef:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8084b
            java.lang.Object r2 = r2.mo11093a(r1)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x01fb
            goto L_0x0217
        L_0x01fb:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r13, r14, r1)
            throw r1
        L_0x0200:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8084b
            java.lang.Object r2 = r2.mo11093a(r1)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x020c
            goto L_0x0217
        L_0x020c:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r10, r10, r1)
            throw r1
        L_0x0211:
            r42.mo24991S()
            r42.mo24992T()
        L_0x0217:
            r15 = r35
        L_0x0219:
            r14 = r36
        L_0x021b:
            r13 = r37
        L_0x021d:
            r12 = r38
        L_0x021f:
            r11 = r39
        L_0x0221:
            r10 = r40
            goto L_0x003f
        L_0x0225:
            r42.mo24997r()
            com.cubic.umo.pass.model.FullTxDTO r2 = new com.cubic.umo.pass.model.FullTxDTO
            if (r4 == 0) goto L_0x0259
            if (r5 == 0) goto L_0x0254
            if (r6 == 0) goto L_0x024f
            if (r7 == 0) goto L_0x024a
            if (r8 == 0) goto L_0x0245
            r3 = r2
            r10 = r40
            r11 = r39
            r12 = r38
            r13 = r37
            r14 = r36
            r15 = r35
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r2
        L_0x0245:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r3, r1)
            throw r1
        L_0x024a:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r12, r12, r1)
            throw r1
        L_0x024f:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r11, r1)
            throw r1
        L_0x0254:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r13, r14, r1)
            throw r1
        L_0x0259:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r10, r10, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.model.FullTxDTOJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        FullTxDTO fullTxDTO = (FullTxDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (fullTxDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("txId");
            this.f8084b.mo11094e(kVar, fullTxDTO.f8057a);
            kVar.mo25077w("when");
            this.f8084b.mo11094e(kVar, fullTxDTO.f8058b);
            kVar.mo25077w(TwitterUser.DESCRIPTION_KEY);
            this.f8084b.mo11094e(kVar, fullTxDTO.f8059c);
            kVar.mo25077w("type");
            this.f8085c.mo11094e(kVar, fullTxDTO.f8060d);
            kVar.mo25077w(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            this.f8084b.mo11094e(kVar, fullTxDTO.f8061e);
            kVar.mo25077w("balance");
            this.f8086d.mo11094e(kVar, fullTxDTO.f8062f);
            kVar.mo25077w("fare");
            this.f8086d.mo11094e(kVar, fullTxDTO.f8063g);
            kVar.mo25077w("adjustment");
            this.f8086d.mo11094e(kVar, fullTxDTO.f8064h);
            kVar.mo25077w("readerName");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8065i);
            kVar.mo25077w("gps");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8066j);
            kVar.mo25077w("routeName");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8067k);
            kVar.mo25077w("routeType");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8068l);
            kVar.mo25077w("stopName");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8069m);
            kVar.mo25077w("passUsed");
            this.f8088f.mo11094e(kVar, fullTxDTO.f8070n);
            kVar.mo25077w("fareType");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8071o);
            kVar.mo25077w("transferCount");
            this.f8089g.mo11094e(kVar, fullTxDTO.f8072p);
            kVar.mo25077w("passbackCount");
            this.f8089g.mo11094e(kVar, fullTxDTO.f8073q);
            kVar.mo25077w("transferCredits");
            this.f8089g.mo11094e(kVar, fullTxDTO.f8074r);
            kVar.mo25077w("accountStatus");
            this.f8090h.mo11094e(kVar, fullTxDTO.f8075s);
            kVar.mo25077w("mediaStatus");
            this.f8091i.mo11094e(kVar, fullTxDTO.f8076t);
            kVar.mo25077w("agency");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8077u);
            kVar.mo25077w("agencyPublicId");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8078v);
            kVar.mo25077w("vehicle");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8079w);
            kVar.mo25077w("comment");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8080x);
            kVar.mo25077w("fundingSourceType");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8081y);
            kVar.mo25077w("truncatedSourceId");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8082z);
            kVar.mo25077w("authorization");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8052A);
            kVar.mo25077w("salesChannel");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8053B);
            kVar.mo25077w("tvmId");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8054C);
            kVar.mo25077w("retailer");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8055D);
            kVar.mo25077w("referenceTxId");
            this.f8087e.mo11094e(kVar, fullTxDTO.f8056E);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(FullTxDTO)";
    }
}
