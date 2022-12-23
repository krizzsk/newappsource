package com.cubic.umo.pass.model;

import com.appboy.models.InAppMessageBase;
import com.appboy.models.outgoing.TwitterUser;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/PassProductJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/PassProduct;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class PassProductJsonAdapter extends C8011k<PassProduct> {

    /* renamed from: a */
    public final JsonReader.C7986a f8201a = JsonReader.C7986a.m18216a("id", "stableId", "name", "shortDescription", TwitterUser.DESCRIPTION_KEY, "passType", "cost", "costMoney", "numberOfTrips", "renewable", "start", InAppMessageBase.DURATION, "specialDiscount", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "durationUnits", "agencyName", "owned", "maxQuantity");

    /* renamed from: b */
    public final C8011k<Integer> f8202b;

    /* renamed from: c */
    public final C8011k<String> f8203c;

    /* renamed from: d */
    public final C8011k<String> f8204d;

    /* renamed from: e */
    public final C8011k<PassType> f8205e;

    /* renamed from: f */
    public final C8011k<Money> f8206f;

    /* renamed from: g */
    public final C8011k<Integer> f8207g;

    /* renamed from: h */
    public final C8011k<Boolean> f8208h;

    /* renamed from: i */
    public final C8011k<TimeUnit> f8209i;

    public PassProductJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        Class cls2 = Integer.TYPE;
        EmptySet emptySet = EmptySet.f60175b;
        this.f8202b = oVar2.mo25082c(cls2, emptySet, "id");
        this.f8203c = oVar2.mo25082c(cls, emptySet, "stableId");
        this.f8204d = oVar2.mo25082c(cls, emptySet, "name");
        this.f8205e = oVar2.mo25082c(PassType.class, emptySet, "passType");
        this.f8206f = oVar2.mo25082c(Money.class, emptySet, "costMoney");
        this.f8207g = oVar2.mo25082c(Integer.class, emptySet, "numberOfTrips");
        this.f8208h = oVar2.mo25082c(Boolean.TYPE, emptySet, "renewable");
        this.f8209i = oVar2.mo25082c(TimeUnit.class, emptySet, "durationUnits");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01fd, code lost:
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ff, code lost:
        r15 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0201, code lost:
        r14 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0203, code lost:
        r13 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0205, code lost:
        r7 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0207, code lost:
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0209, code lost:
        r3 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x020b, code lost:
        r4 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020d, code lost:
        r12 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020f, code lost:
        r5 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0211, code lost:
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0213, code lost:
        r10 = r31;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r34.mo24995i()
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
            r18 = r15
            r19 = r18
            r20 = r19
            r21 = r20
        L_0x0022:
            boolean r16 = r34.mo24999v()
            r17 = r15
            java.lang.String r15 = "agencyName"
            r22 = r14
            java.lang.String r14 = "active"
            r23 = r13
            java.lang.String r13 = "specialDiscount"
            r24 = r7
            java.lang.String r7 = "renewable"
            r25 = r2
            java.lang.String r2 = "costMoney"
            r26 = r3
            java.lang.String r3 = "cost"
            r27 = r4
            java.lang.String r4 = "passType"
            r28 = r12
            java.lang.String r12 = "description"
            r29 = r5
            java.lang.String r5 = "shortDescription"
            r30 = r11
            java.lang.String r11 = "name"
            r31 = r10
            java.lang.String r10 = "id"
            if (r16 == 0) goto L_0x0217
            r16 = r9
            com.squareup.moshi.JsonReader$a r9 = r0.f8201a
            int r9 = r1.mo24989O(r9)
            switch(r9) {
                case -1: goto L_0x01f7;
                case 0: goto L_0x01e6;
                case 1: goto L_0x01d4;
                case 2: goto L_0x01c3;
                case 3: goto L_0x01b2;
                case 4: goto L_0x018a;
                case 5: goto L_0x0164;
                case 6: goto L_0x0140;
                case 7: goto L_0x011e;
                case 8: goto L_0x010d;
                case 9: goto L_0x00ed;
                case 10: goto L_0x00de;
                case 11: goto L_0x00d1;
                case 12: goto L_0x00b3;
                case 13: goto L_0x0098;
                case 14: goto L_0x008c;
                case 15: goto L_0x0079;
                case 16: goto L_0x006d;
                case 17: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x01fd
        L_0x0061:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8207g
            java.lang.Object r2 = r2.mo11093a(r1)
            r21 = r2
            java.lang.Integer r21 = (java.lang.Integer) r21
            goto L_0x01fd
        L_0x006d:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8207g
            java.lang.Object r2 = r2.mo11093a(r1)
            r20 = r2
            java.lang.Integer r20 = (java.lang.Integer) r20
            goto L_0x01fd
        L_0x0079:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8204d
            java.lang.Object r2 = r2.mo11093a(r1)
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            if (r19 == 0) goto L_0x0087
            goto L_0x01fd
        L_0x0087:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r15, r15, r1)
            throw r1
        L_0x008c:
            com.squareup.moshi.k<com.cubic.umo.pass.model.TimeUnit> r2 = r0.f8209i
            java.lang.Object r2 = r2.mo11093a(r1)
            r18 = r2
            com.cubic.umo.pass.model.TimeUnit r18 = (com.cubic.umo.pass.model.TimeUnit) r18
            goto L_0x01fd
        L_0x0098:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8208h
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00ae
            r9 = r16
            r15 = r17
            r14 = r22
            r13 = r23
            r7 = r24
            goto L_0x0209
        L_0x00ae:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r14, r14, r1)
            throw r1
        L_0x00b3:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8208h
            java.lang.Object r2 = r2.mo11093a(r1)
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x00cc
            r9 = r16
            r15 = r17
            r14 = r22
            r13 = r23
            r7 = r24
            r2 = r25
            goto L_0x020b
        L_0x00cc:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r13, r13, r1)
            throw r1
        L_0x00d1:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8207g
            java.lang.Object r2 = r2.mo11093a(r1)
            r15 = r2
            java.lang.Integer r15 = (java.lang.Integer) r15
            r9 = r16
            goto L_0x0201
        L_0x00de:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8203c
            java.lang.Object r2 = r2.mo11093a(r1)
            r14 = r2
            java.lang.String r14 = (java.lang.String) r14
            r9 = r16
            r15 = r17
            goto L_0x0203
        L_0x00ed:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f8208h
            java.lang.Object r2 = r2.mo11093a(r1)
            r4 = r2
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x0108
            r9 = r16
            r15 = r17
            r14 = r22
            r13 = r23
            r7 = r24
            r2 = r25
            r3 = r26
            goto L_0x020d
        L_0x0108:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r7, r7, r1)
            throw r1
        L_0x010d:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8207g
            java.lang.Object r2 = r2.mo11093a(r1)
            r13 = r2
            java.lang.Integer r13 = (java.lang.Integer) r13
            r9 = r16
            r15 = r17
            r14 = r22
            goto L_0x0205
        L_0x011e:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r3 = r0.f8206f
            java.lang.Object r3 = r3.mo11093a(r1)
            com.cubic.umo.pass.model.Money r3 = (com.cubic.umo.pass.model.Money) r3
            if (r3 == 0) goto L_0x013b
            r12 = r3
            r9 = r16
            r15 = r17
            r14 = r22
            r13 = r23
            r7 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            goto L_0x020f
        L_0x013b:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r2, r1)
            throw r1
        L_0x0140:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8202b
            java.lang.Object r2 = r2.mo11093a(r1)
            r5 = r2
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x015f
            r9 = r16
            r15 = r17
            r14 = r22
            r13 = r23
            r7 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r12 = r28
            goto L_0x0211
        L_0x015f:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r3, r3, r1)
            throw r1
        L_0x0164:
            com.squareup.moshi.k<com.cubic.umo.pass.model.PassType> r2 = r0.f8205e
            java.lang.Object r2 = r2.mo11093a(r1)
            com.cubic.umo.pass.model.PassType r2 = (com.cubic.umo.pass.model.PassType) r2
            if (r2 == 0) goto L_0x0185
            r11 = r2
            r9 = r16
            r15 = r17
            r14 = r22
            r13 = r23
            r7 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r12 = r28
            r5 = r29
            goto L_0x0213
        L_0x0185:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r4, r4, r1)
            throw r1
        L_0x018a:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8204d
            java.lang.Object r2 = r2.mo11093a(r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x01ad
            r9 = r16
            r15 = r17
            r14 = r22
            r13 = r23
            r7 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r12 = r28
            r5 = r29
            r11 = r30
            goto L_0x0022
        L_0x01ad:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r12, r12, r1)
            throw r1
        L_0x01b2:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8204d
            java.lang.Object r2 = r2.mo11093a(r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x01be
            goto L_0x01ff
        L_0x01be:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r5, r5, r1)
            throw r1
        L_0x01c3:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8204d
            java.lang.Object r2 = r2.mo11093a(r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x01cf
            goto L_0x01fd
        L_0x01cf:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r11, r11, r1)
            throw r1
        L_0x01d4:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f8203c
            java.lang.Object r2 = r2.mo11093a(r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r9 = r16
            r15 = r17
            r14 = r22
            r13 = r23
            goto L_0x0207
        L_0x01e6:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f8202b
            java.lang.Object r2 = r2.mo11093a(r1)
            r6 = r2
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x01f2
            goto L_0x01fd
        L_0x01f2:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r10, r10, r1)
            throw r1
        L_0x01f7:
            r34.mo24991S()
            r34.mo24992T()
        L_0x01fd:
            r9 = r16
        L_0x01ff:
            r15 = r17
        L_0x0201:
            r14 = r22
        L_0x0203:
            r13 = r23
        L_0x0205:
            r7 = r24
        L_0x0207:
            r2 = r25
        L_0x0209:
            r3 = r26
        L_0x020b:
            r4 = r27
        L_0x020d:
            r12 = r28
        L_0x020f:
            r5 = r29
        L_0x0211:
            r11 = r30
        L_0x0213:
            r10 = r31
            goto L_0x0022
        L_0x0217:
            r16 = r9
            r34.mo24997r()
            com.cubic.umo.pass.model.PassProduct r32 = new com.cubic.umo.pass.model.PassProduct
            if (r6 == 0) goto L_0x0297
            int r6 = r6.intValue()
            if (r8 == 0) goto L_0x0292
            if (r16 == 0) goto L_0x028d
            if (r31 == 0) goto L_0x0288
            if (r30 == 0) goto L_0x0283
            if (r29 == 0) goto L_0x027e
            int r10 = r29.intValue()
            if (r28 == 0) goto L_0x0279
            if (r27 == 0) goto L_0x0274
            boolean r2 = r27.booleanValue()
            if (r26 == 0) goto L_0x026f
            boolean r26 = r26.booleanValue()
            if (r25 == 0) goto L_0x026a
            boolean r25 = r25.booleanValue()
            if (r19 == 0) goto L_0x0265
            r3 = r32
            r4 = r6
            r5 = r24
            r6 = r8
            r7 = r16
            r8 = r31
            r9 = r30
            r11 = r28
            r12 = r23
            r13 = r2
            r14 = r22
            r15 = r17
            r16 = r26
            r17 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r32
        L_0x0265:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r15, r1)
            throw r1
        L_0x026a:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r14, r14, r1)
            throw r1
        L_0x026f:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r13, r13, r1)
            throw r1
        L_0x0274:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r7, r7, r1)
            throw r1
        L_0x0279:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r2, r1)
            throw r1
        L_0x027e:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r3, r3, r1)
            throw r1
        L_0x0283:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r4, r4, r1)
            throw r1
        L_0x0288:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r12, r12, r1)
            throw r1
        L_0x028d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r5, r5, r1)
            throw r1
        L_0x0292:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r11, r1)
            throw r1
        L_0x0297:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r10, r10, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.model.PassProductJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        PassProduct passProduct = (PassProduct) obj;
        C24362h.m61211f(kVar, "writer");
        if (passProduct != null) {
            kVar.mo25074i();
            kVar.mo25077w("id");
            this.f8202b.mo11094e(kVar, Integer.valueOf(passProduct.f8183b));
            kVar.mo25077w("stableId");
            this.f8203c.mo11094e(kVar, passProduct.f8184c);
            kVar.mo25077w("name");
            this.f8204d.mo11094e(kVar, passProduct.f8185d);
            kVar.mo25077w("shortDescription");
            this.f8204d.mo11094e(kVar, passProduct.f8186e);
            kVar.mo25077w(TwitterUser.DESCRIPTION_KEY);
            this.f8204d.mo11094e(kVar, passProduct.f8187f);
            kVar.mo25077w("passType");
            this.f8205e.mo11094e(kVar, passProduct.f8188g);
            kVar.mo25077w("cost");
            this.f8202b.mo11094e(kVar, Integer.valueOf(passProduct.f8189h));
            kVar.mo25077w("costMoney");
            this.f8206f.mo11094e(kVar, passProduct.f8190i);
            kVar.mo25077w("numberOfTrips");
            this.f8207g.mo11094e(kVar, passProduct.f8191j);
            kVar.mo25077w("renewable");
            C0017h.m63T(passProduct.f8192k, this.f8208h, kVar, "start");
            this.f8203c.mo11094e(kVar, passProduct.f8193l);
            kVar.mo25077w(InAppMessageBase.DURATION);
            this.f8207g.mo11094e(kVar, passProduct.f8194m);
            kVar.mo25077w("specialDiscount");
            C0017h.m63T(passProduct.f8195n, this.f8208h, kVar, AppMeasurementSdk.ConditionalUserProperty.ACTIVE);
            C0017h.m63T(passProduct.f8196o, this.f8208h, kVar, "durationUnits");
            this.f8209i.mo11094e(kVar, passProduct.f8197p);
            kVar.mo25077w("agencyName");
            this.f8204d.mo11094e(kVar, passProduct.f8198q);
            kVar.mo25077w("owned");
            this.f8207g.mo11094e(kVar, passProduct.f8199r);
            kVar.mo25077w("maxQuantity");
            this.f8207g.mo11094e(kVar, passProduct.f8200s);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(PassProduct)";
    }
}
