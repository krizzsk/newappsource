package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/VisualValidationResponseJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/VisualValidationResponse;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class VisualValidationResponseJsonAdapter extends C8011k<VisualValidationResponse> {

    /* renamed from: a */
    public final JsonReader.C7986a f8318a = JsonReader.C7986a.m18216a("eventId", "transactionType", "lowBalanceWarning", "doubleDenied", "languageCode", "txId", "passUsed", "transferCredits", "specialFaresUsed", "numberOfTripsLeft", "transferTimeRemaining", "passExpireMinutes", "fare", "balance");

    /* renamed from: b */
    public final C8011k<String> f8319b;

    /* renamed from: c */
    public final C8011k<String> f8320c;

    /* renamed from: d */
    public final C8011k<Boolean> f8321d;

    /* renamed from: e */
    public final C8011k<PassDTO> f8322e;

    /* renamed from: f */
    public final C8011k<Integer> f8323f;

    /* renamed from: g */
    public final C8011k<Boolean> f8324g;

    /* renamed from: h */
    public final C8011k<Money> f8325h;

    public VisualValidationResponseJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8319b = oVar2.mo25082c(cls, emptySet, "eventId");
        this.f8320c = oVar2.mo25082c(cls, emptySet, "transactionType");
        this.f8321d = oVar2.mo25082c(Boolean.TYPE, emptySet, "lowBalanceWarning");
        this.f8322e = oVar2.mo25082c(PassDTO.class, emptySet, "passUsed");
        this.f8323f = oVar2.mo25082c(Integer.class, emptySet, "transferCredits");
        this.f8324g = oVar2.mo25082c(Boolean.class, emptySet, "specialFaresUsed");
        this.f8325h = oVar2.mo25082c(Money.class, emptySet, "fare");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f3, code lost:
        r15 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f5, code lost:
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f7, code lost:
        r13 = r20;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r23.mo24995i()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r8 = r5
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L_0x001c:
            boolean r6 = r23.mo24999v()
            java.lang.String r7 = "languageCode"
            r18 = r15
            java.lang.String r15 = "doubleDenied"
            r19 = r14
            java.lang.String r14 = "lowBalanceWarning"
            r20 = r13
            java.lang.String r13 = "transactionType"
            if (r6 == 0) goto L_0x00fb
            com.squareup.moshi.JsonReader$a r6 = r0.f8318a
            int r6 = r1.mo24989O(r6)
            switch(r6) {
                case -1: goto L_0x00ed;
                case 0: goto L_0x00e4;
                case 1: goto L_0x00d4;
                case 2: goto L_0x00c4;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00a3;
                case 5: goto L_0x0099;
                case 6: goto L_0x008f;
                case 7: goto L_0x0085;
                case 8: goto L_0x007a;
                case 9: goto L_0x006c;
                case 10: goto L_0x005f;
                case 11: goto L_0x0054;
                case 12: goto L_0x0048;
                case 13: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x00f3
        L_0x003c:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r6 = r0.f8325h
            java.lang.Object r6 = r6.mo11093a(r1)
            r17 = r6
            com.cubic.umo.pass.model.Money r17 = (com.cubic.umo.pass.model.Money) r17
            goto L_0x00f3
        L_0x0048:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r6 = r0.f8325h
            java.lang.Object r6 = r6.mo11093a(r1)
            r16 = r6
            com.cubic.umo.pass.model.Money r16 = (com.cubic.umo.pass.model.Money) r16
            goto L_0x00f3
        L_0x0054:
            com.squareup.moshi.k<java.lang.Integer> r6 = r0.f8323f
            java.lang.Object r6 = r6.mo11093a(r1)
            r15 = r6
            java.lang.Integer r15 = (java.lang.Integer) r15
            goto L_0x00f5
        L_0x005f:
            com.squareup.moshi.k<java.lang.Integer> r6 = r0.f8323f
            java.lang.Object r6 = r6.mo11093a(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            r14 = r6
            r15 = r18
            goto L_0x00f7
        L_0x006c:
            com.squareup.moshi.k<java.lang.Integer> r6 = r0.f8323f
            java.lang.Object r6 = r6.mo11093a(r1)
            r13 = r6
            java.lang.Integer r13 = (java.lang.Integer) r13
            r15 = r18
            r14 = r19
            goto L_0x001c
        L_0x007a:
            com.squareup.moshi.k<java.lang.Boolean> r6 = r0.f8324g
            java.lang.Object r6 = r6.mo11093a(r1)
            r12 = r6
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            goto L_0x00f3
        L_0x0085:
            com.squareup.moshi.k<java.lang.Integer> r6 = r0.f8323f
            java.lang.Object r6 = r6.mo11093a(r1)
            r11 = r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            goto L_0x00f3
        L_0x008f:
            com.squareup.moshi.k<com.cubic.umo.pass.model.PassDTO> r6 = r0.f8322e
            java.lang.Object r6 = r6.mo11093a(r1)
            r10 = r6
            com.cubic.umo.pass.model.PassDTO r10 = (com.cubic.umo.pass.model.PassDTO) r10
            goto L_0x00f3
        L_0x0099:
            com.squareup.moshi.k<java.lang.String> r6 = r0.f8319b
            java.lang.Object r6 = r6.mo11093a(r1)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00f3
        L_0x00a3:
            com.squareup.moshi.k<java.lang.String> r6 = r0.f8320c
            java.lang.Object r6 = r6.mo11093a(r1)
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00af
            goto L_0x00f3
        L_0x00af:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r7, r7, r1)
            throw r1
        L_0x00b4:
            com.squareup.moshi.k<java.lang.Boolean> r3 = r0.f8321d
            java.lang.Object r3 = r3.mo11093a(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x00bf
            goto L_0x00f3
        L_0x00bf:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r15, r15, r1)
            throw r1
        L_0x00c4:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8321d
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00cf
            goto L_0x00f3
        L_0x00cf:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r14, r14, r1)
            throw r1
        L_0x00d4:
            com.squareup.moshi.k<java.lang.String> r5 = r0.f8320c
            java.lang.Object r5 = r5.mo11093a(r1)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00df
            goto L_0x00f3
        L_0x00df:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r13, r13, r1)
            throw r1
        L_0x00e4:
            com.squareup.moshi.k<java.lang.String> r4 = r0.f8319b
            java.lang.Object r4 = r4.mo11093a(r1)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00f3
        L_0x00ed:
            r23.mo24991S()
            r23.mo24992T()
        L_0x00f3:
            r15 = r18
        L_0x00f5:
            r14 = r19
        L_0x00f7:
            r13 = r20
            goto L_0x001c
        L_0x00fb:
            r23.mo24997r()
            com.cubic.umo.pass.model.VisualValidationResponse r21 = new com.cubic.umo.pass.model.VisualValidationResponse
            if (r5 == 0) goto L_0x012c
            if (r2 == 0) goto L_0x0127
            boolean r6 = r2.booleanValue()
            if (r3 == 0) goto L_0x0122
            boolean r2 = r3.booleanValue()
            if (r8 == 0) goto L_0x011d
            r3 = r21
            r7 = r2
            r13 = r20
            r14 = r19
            r15 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r21
        L_0x011d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r7, r7, r1)
            throw r1
        L_0x0122:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r15, r1)
            throw r1
        L_0x0127:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r14, r14, r1)
            throw r1
        L_0x012c:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r13, r13, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.model.VisualValidationResponseJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        VisualValidationResponse visualValidationResponse = (VisualValidationResponse) obj;
        C24362h.m61211f(kVar, "writer");
        if (visualValidationResponse != null) {
            kVar.mo25074i();
            kVar.mo25077w("eventId");
            this.f8319b.mo11094e(kVar, visualValidationResponse.f8304a);
            kVar.mo25077w("transactionType");
            this.f8320c.mo11094e(kVar, visualValidationResponse.f8305b);
            kVar.mo25077w("lowBalanceWarning");
            C0017h.m63T(visualValidationResponse.f8306c, this.f8321d, kVar, "doubleDenied");
            C0017h.m63T(visualValidationResponse.f8307d, this.f8321d, kVar, "languageCode");
            this.f8320c.mo11094e(kVar, visualValidationResponse.f8308e);
            kVar.mo25077w("txId");
            this.f8319b.mo11094e(kVar, visualValidationResponse.f8309f);
            kVar.mo25077w("passUsed");
            this.f8322e.mo11094e(kVar, visualValidationResponse.f8310g);
            kVar.mo25077w("transferCredits");
            this.f8323f.mo11094e(kVar, visualValidationResponse.f8311h);
            kVar.mo25077w("specialFaresUsed");
            this.f8324g.mo11094e(kVar, visualValidationResponse.f8312i);
            kVar.mo25077w("numberOfTripsLeft");
            this.f8323f.mo11094e(kVar, visualValidationResponse.f8313j);
            kVar.mo25077w("transferTimeRemaining");
            this.f8323f.mo11094e(kVar, visualValidationResponse.f8314k);
            kVar.mo25077w("passExpireMinutes");
            this.f8323f.mo11094e(kVar, visualValidationResponse.f8315l);
            kVar.mo25077w("fare");
            this.f8325h.mo11094e(kVar, visualValidationResponse.f8316m);
            kVar.mo25077w("balance");
            this.f8325h.mo11094e(kVar, visualValidationResponse.f8317n);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VisualValidationResponse)";
    }
}
