package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/MobilePagesJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/MobilePages;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class MobilePagesJsonAdapter extends C8011k<MobilePages> {

    /* renamed from: a */
    public final JsonReader.C7986a f8137a = JsonReader.C7986a.m18216a("txHistory", "autoload", "contactInfo", "paymentAccount", "alerts", "faq", "terms", "privacy");

    /* renamed from: b */
    public final C8011k<Boolean> f8138b;

    public MobilePagesJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f8138b = oVar.mo25082c(Boolean.TYPE, EmptySet.f60175b, "showTransactionHistoryMenu");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012e, code lost:
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0130, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0132, code lost:
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0134, code lost:
        r5 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0136, code lost:
        r6 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0138, code lost:
        r7 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013a, code lost:
        r8 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        r9 = r23;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r38) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r38.mo24995i()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0014:
            boolean r10 = r38.mo24999v()
            java.lang.String r11 = "privacy"
            java.lang.String r12 = "showPrivacyMenu"
            java.lang.String r13 = "terms"
            java.lang.String r14 = "showTOSMenu"
            java.lang.String r15 = "faq"
            r16 = r2
            java.lang.String r2 = "showFAQMenu"
            r17 = r3
            java.lang.String r3 = "alerts"
            r18 = r4
            java.lang.String r4 = "showAlertsMenu"
            r19 = r5
            java.lang.String r5 = "paymentAccount"
            r20 = r6
            java.lang.String r6 = "showPaymentAccountMenu"
            r21 = r7
            java.lang.String r7 = "contactInfo"
            r22 = r8
            java.lang.String r8 = "showContactInfoMenu"
            r23 = r9
            java.lang.String r9 = "autoload"
            r24 = r9
            java.lang.String r9 = "showAutoLoadMenu"
            r25 = r9
            java.lang.String r9 = "txHistory"
            r26 = r9
            java.lang.String r9 = "showTransactionHistoryMenu"
            if (r10 == 0) goto L_0x0140
            com.squareup.moshi.JsonReader$a r10 = r0.f8137a
            int r10 = r1.mo24989O(r10)
            switch(r10) {
                case -1: goto L_0x0128;
                case 0: goto L_0x0106;
                case 1: goto L_0x00e5;
                case 2: goto L_0x00ca;
                case 3: goto L_0x00b0;
                case 4: goto L_0x0098;
                case 5: goto L_0x0082;
                case 6: goto L_0x006e;
                case 7: goto L_0x005d;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x012e
        L_0x005d:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8138b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0069
            goto L_0x0130
        L_0x0069:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r12, r11, r1)
            throw r1
        L_0x006e:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8138b
            java.lang.Object r2 = r2.mo11093a(r1)
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x007d
            r2 = r16
            goto L_0x0132
        L_0x007d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r14, r13, r1)
            throw r1
        L_0x0082:
            com.squareup.moshi.k<java.lang.Boolean> r3 = r0.f8138b
            java.lang.Object r3 = r3.mo11093a(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0093
            r4 = r3
            r2 = r16
            r3 = r17
            goto L_0x0134
        L_0x0093:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r15, r1)
            throw r1
        L_0x0098:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8138b
            java.lang.Object r2 = r2.mo11093a(r1)
            r5 = r2
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x00ab
            r2 = r16
            r3 = r17
            r4 = r18
            goto L_0x0136
        L_0x00ab:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r4, r3, r1)
            throw r1
        L_0x00b0:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8138b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00c5
            r6 = r2
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            goto L_0x0138
        L_0x00c5:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r6, r5, r1)
            throw r1
        L_0x00ca:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8138b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00e0
            r7 = r2
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            goto L_0x013a
        L_0x00e0:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r8, r7, r1)
            throw r1
        L_0x00e5:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8138b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00fd
            r8 = r2
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            goto L_0x013c
        L_0x00fd:
            r10 = r24
            r2 = r25
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r10, r1)
            throw r1
        L_0x0106:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8138b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0121
            r9 = r2
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            goto L_0x0014
        L_0x0121:
            r2 = r26
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r9, r2, r1)
            throw r1
        L_0x0128:
            r38.mo24991S()
            r38.mo24992T()
        L_0x012e:
            r2 = r16
        L_0x0130:
            r3 = r17
        L_0x0132:
            r4 = r18
        L_0x0134:
            r5 = r19
        L_0x0136:
            r6 = r20
        L_0x0138:
            r7 = r21
        L_0x013a:
            r8 = r22
        L_0x013c:
            r9 = r23
            goto L_0x0014
        L_0x0140:
            r10 = r24
            r0 = r25
            r27 = r26
            r38.mo24997r()
            com.cubic.umo.pass.model.MobilePages r24 = new com.cubic.umo.pass.model.MobilePages
            if (r23 == 0) goto L_0x01a4
            boolean r29 = r23.booleanValue()
            if (r22 == 0) goto L_0x019f
            boolean r30 = r22.booleanValue()
            if (r21 == 0) goto L_0x019a
            boolean r31 = r21.booleanValue()
            if (r20 == 0) goto L_0x0195
            boolean r32 = r20.booleanValue()
            if (r19 == 0) goto L_0x0190
            boolean r33 = r19.booleanValue()
            if (r18 == 0) goto L_0x018b
            boolean r34 = r18.booleanValue()
            if (r17 == 0) goto L_0x0186
            boolean r35 = r17.booleanValue()
            if (r16 == 0) goto L_0x0181
            boolean r36 = r16.booleanValue()
            r28 = r24
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36)
            return r24
        L_0x0181:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r12, r11, r1)
            throw r0
        L_0x0186:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r14, r13, r1)
            throw r0
        L_0x018b:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r2, r15, r1)
            throw r0
        L_0x0190:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r4, r3, r1)
            throw r0
        L_0x0195:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r6, r5, r1)
            throw r0
        L_0x019a:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r8, r7, r1)
            throw r0
        L_0x019f:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r0, r10, r1)
            throw r0
        L_0x01a4:
            r0 = r27
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r9, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.model.MobilePagesJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        MobilePages mobilePages = (MobilePages) obj;
        C24362h.m61211f(kVar, "writer");
        if (mobilePages != null) {
            kVar.mo25074i();
            kVar.mo25077w("txHistory");
            C0017h.m63T(mobilePages.f8129b, this.f8138b, kVar, "autoload");
            C0017h.m63T(mobilePages.f8130c, this.f8138b, kVar, "contactInfo");
            C0017h.m63T(mobilePages.f8131d, this.f8138b, kVar, "paymentAccount");
            C0017h.m63T(mobilePages.f8132e, this.f8138b, kVar, "alerts");
            C0017h.m63T(mobilePages.f8133f, this.f8138b, kVar, "faq");
            C0017h.m63T(mobilePages.f8134g, this.f8138b, kVar, "terms");
            C0017h.m63T(mobilePages.f8135h, this.f8138b, kVar, "privacy");
            this.f8138b.mo11094e(kVar, Boolean.valueOf(mobilePages.f8136i));
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(MobilePages)";
    }
}
