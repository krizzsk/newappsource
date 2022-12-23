package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/FundingSourceDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/FundingSourceDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class FundingSourceDTOJsonAdapter extends C8011k<FundingSourceDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f8111a = JsonReader.C7986a.m18216a("id", "cardholderName", "type", "expiration", "name", "truncatedSourceId", "enabled", "poolId");

    /* renamed from: b */
    public final C8011k<Integer> f8112b;

    /* renamed from: c */
    public final C8011k<String> f8113c;

    /* renamed from: d */
    public final C8011k<Boolean> f8114d;

    public FundingSourceDTOJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f60175b;
        this.f8112b = oVar.mo25082c(cls, emptySet, "id");
        this.f8113c = oVar.mo25082c(String.class, emptySet, "cardholderName");
        this.f8114d = oVar.mo25082c(Boolean.TYPE, emptySet, "enabled");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        r11 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        r9 = r18;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r21.mo24995i()
            r2 = 0
            r3 = r2
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
        L_0x0014:
            boolean r4 = r21.mo24999v()
            java.lang.String r10 = "poolId"
            java.lang.String r12 = "enabled"
            java.lang.String r13 = "truncatedSourceId"
            java.lang.String r14 = "name"
            java.lang.String r15 = "expiration"
            r16 = r11
            java.lang.String r11 = "type"
            r17 = r2
            java.lang.String r2 = "cardholderName"
            r18 = r9
            java.lang.String r9 = "id"
            if (r4 == 0) goto L_0x00da
            com.squareup.moshi.JsonReader$a r4 = r0.f8111a
            int r4 = r1.mo24989O(r4)
            switch(r4) {
                case -1: goto L_0x00cc;
                case 0: goto L_0x00bb;
                case 1: goto L_0x00aa;
                case 2: goto L_0x0099;
                case 3: goto L_0x0088;
                case 4: goto L_0x0077;
                case 5: goto L_0x0062;
                case 6: goto L_0x004f;
                case 7: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x00d2
        L_0x003d:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8113c
            java.lang.Object r2 = r2.mo11093a(r1)
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x004a
            goto L_0x00d4
        L_0x004a:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r10, r10, r1)
            throw r1
        L_0x004f:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8114d
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x005d
            r11 = r16
            goto L_0x00d6
        L_0x005d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r12, r12, r1)
            throw r1
        L_0x0062:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8113c
            java.lang.Object r2 = r2.mo11093a(r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0072
            r11 = r16
            r2 = r17
            goto L_0x0014
        L_0x0072:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r13, r13, r1)
            throw r1
        L_0x0077:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8113c
            java.lang.Object r2 = r2.mo11093a(r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0083
            goto L_0x00d2
        L_0x0083:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r14, r14, r1)
            throw r1
        L_0x0088:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8113c
            java.lang.Object r2 = r2.mo11093a(r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0094
            goto L_0x00d2
        L_0x0094:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r15, r15, r1)
            throw r1
        L_0x0099:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8113c
            java.lang.Object r2 = r2.mo11093a(r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00a5
            goto L_0x00d2
        L_0x00a5:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r11, r11, r1)
            throw r1
        L_0x00aa:
            com.squareup.moshi.k<java.lang.String> r4 = r0.f8113c
            java.lang.Object r4 = r4.mo11093a(r1)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00b6
            goto L_0x00d2
        L_0x00b6:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r2, r1)
            throw r1
        L_0x00bb:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8112b
            java.lang.Object r2 = r2.mo11093a(r1)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x00c7
            goto L_0x00d2
        L_0x00c7:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r9, r9, r1)
            throw r1
        L_0x00cc:
            r21.mo24991S()
            r21.mo24992T()
        L_0x00d2:
            r11 = r16
        L_0x00d4:
            r2 = r17
        L_0x00d6:
            r9 = r18
            goto L_0x0014
        L_0x00da:
            r21.mo24997r()
            com.cubic.umo.pass.model.FundingSourceDTO r19 = new com.cubic.umo.pass.model.FundingSourceDTO
            if (r3 == 0) goto L_0x0125
            int r4 = r3.intValue()
            if (r5 == 0) goto L_0x0120
            if (r6 == 0) goto L_0x011b
            if (r7 == 0) goto L_0x0116
            if (r8 == 0) goto L_0x0111
            if (r18 == 0) goto L_0x010c
            if (r17 == 0) goto L_0x0107
            boolean r2 = r17.booleanValue()
            if (r16 == 0) goto L_0x0102
            r3 = r19
            r9 = r18
            r10 = r2
            r11 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r19
        L_0x0102:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r10, r10, r1)
            throw r1
        L_0x0107:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r12, r12, r1)
            throw r1
        L_0x010c:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r13, r13, r1)
            throw r1
        L_0x0111:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r14, r14, r1)
            throw r1
        L_0x0116:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r15, r1)
            throw r1
        L_0x011b:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r11, r1)
            throw r1
        L_0x0120:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r2, r1)
            throw r1
        L_0x0125:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r9, r9, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.model.FundingSourceDTOJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        FundingSourceDTO fundingSourceDTO = (FundingSourceDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (fundingSourceDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("id");
            this.f8112b.mo11094e(kVar, Integer.valueOf(fundingSourceDTO.f8103a));
            kVar.mo25077w("cardholderName");
            this.f8113c.mo11094e(kVar, fundingSourceDTO.f8104b);
            kVar.mo25077w("type");
            this.f8113c.mo11094e(kVar, fundingSourceDTO.f8105c);
            kVar.mo25077w("expiration");
            this.f8113c.mo11094e(kVar, fundingSourceDTO.f8106d);
            kVar.mo25077w("name");
            this.f8113c.mo11094e(kVar, fundingSourceDTO.f8107e);
            kVar.mo25077w("truncatedSourceId");
            this.f8113c.mo11094e(kVar, fundingSourceDTO.f8108f);
            kVar.mo25077w("enabled");
            C0017h.m63T(fundingSourceDTO.f8109g, this.f8114d, kVar, "poolId");
            this.f8113c.mo11094e(kVar, fundingSourceDTO.f8110h);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(FundingSourceDTO)";
    }
}
