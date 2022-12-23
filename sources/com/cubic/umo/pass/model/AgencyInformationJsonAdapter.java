package com.cubic.umo.pass.model;

import com.appsflyer.ServerParameters;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/AgencyInformationJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/AgencyInformation;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class AgencyInformationJsonAdapter extends C8011k<AgencyInformation> {

    /* renamed from: a */
    public final JsonReader.C7986a f7963a = JsonReader.C7986a.m18216a("name", "shortName", "serviceName", "region", "poolId", "state", "city", ServerParameters.COUNTRY, "publicId", "id", "media", "colors", "minPurchaseAmount", "minPurchaseAmountMoney", "maxPurchaseAmount", "maxPurchaseAmountMoney", "allowStoredValue", "storedValueTransactionMin", "storedValueTransactionMinMoney", "storedValueTransactionMax", "storedValueTransactionMaxMoney", "storedValueButtonValues", "storedValueButtonMoneys", "mobilePages", "mobileLogoTargetUrl", "amexAccepted", "mcAccepted", "visaAccepted", "discAccepted", "jcbAccepted", "googlePayAccepted", "storedValuePayAccepted", "minimumAutoloadAmount", "minimumAutoloadAmountMoney", "minimumTripAutoload", "minimumHoursAutoload", "centerLongitude", "centerLatitude", "lowBalanceLevel", "lowBalanceLevelMoney", "i18n", "scanRideSupported", "maxConsecutiveOfflineScanRides");

    /* renamed from: b */
    public final C8011k<String> f7964b;

    /* renamed from: c */
    public final C8011k<String> f7965c;

    /* renamed from: d */
    public final C8011k<Integer> f7966d;

    /* renamed from: e */
    public final C8011k<Map<String, String>> f7967e;

    /* renamed from: f */
    public final C8011k<Integer> f7968f;

    /* renamed from: g */
    public final C8011k<Money> f7969g;

    /* renamed from: h */
    public final C8011k<Boolean> f7970h;

    /* renamed from: i */
    public final C8011k<List<String>> f7971i;

    /* renamed from: j */
    public final C8011k<List<Money>> f7972j;

    /* renamed from: k */
    public final C8011k<MobilePages> f7973k;

    /* renamed from: l */
    public final C8011k<Boolean> f7974l;

    /* renamed from: m */
    public final C8011k<Double> f7975m;

    /* renamed from: n */
    public final C8011k<LanguageSettings> f7976n;

    public AgencyInformationJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f7964b = oVar2.mo25082c(cls, emptySet, "name");
        this.f7965c = oVar2.mo25082c(cls, emptySet, "serviceName");
        this.f7966d = oVar2.mo25082c(Integer.TYPE, emptySet, "id");
        this.f7967e = oVar2.mo25082c(C12949m.m32790d(Map.class, cls, cls), emptySet, "media");
        this.f7968f = oVar2.mo25082c(Integer.class, emptySet, "minPurchaseAmount");
        this.f7969g = oVar2.mo25082c(Money.class, emptySet, "minPurchaseAmountMoney");
        this.f7970h = oVar2.mo25082c(Boolean.TYPE, emptySet, "allowStoredValue");
        this.f7971i = oVar2.mo25082c(C12949m.m32790d(List.class, cls), emptySet, "storedValueButtonValues");
        this.f7972j = oVar2.mo25082c(C12949m.m32790d(List.class, Money.class), emptySet, "storedValueButtonMoneys");
        this.f7973k = oVar2.mo25082c(MobilePages.class, emptySet, "mobilePages");
        this.f7974l = oVar2.mo25082c(Boolean.class, emptySet, "amexAccepted");
        this.f7975m = oVar2.mo25082c(Double.class, emptySet, "longitude");
        this.f7976n = oVar2.mo25082c(LanguageSettings.class, emptySet, "languageSettings");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0359, code lost:
        r8 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0345, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0347, code lost:
        r7 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0349, code lost:
        r6 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x034b, code lost:
        r15 = r49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x034d, code lost:
        r14 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x034f, code lost:
        r3 = r51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0351, code lost:
        r12 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0353, code lost:
        r11 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0355, code lost:
        r10 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0357, code lost:
        r9 = r55;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r59) {
        /*
            r58 = this;
            r0 = r58
            r1 = r59
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r59.mo24995i()
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
            r14 = r12
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r21 = r19
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
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r44 = r43
            r45 = r44
            r46 = r45
        L_0x0055:
            boolean r13 = r59.mo24999v()
            r47 = r7
            java.lang.String r7 = "allowStoredValue"
            r48 = r6
            java.lang.String r6 = "colors"
            r20 = r2
            java.lang.String r2 = "media"
            r49 = r15
            java.lang.String r15 = "id"
            r50 = r14
            java.lang.String r14 = "publicId"
            r51 = r3
            java.lang.String r3 = "country"
            r52 = r12
            java.lang.String r12 = "city"
            r53 = r11
            java.lang.String r11 = "state"
            r54 = r10
            java.lang.String r10 = "poolId"
            r55 = r9
            java.lang.String r9 = "shortName"
            r56 = r8
            java.lang.String r8 = "name"
            if (r13 == 0) goto L_0x035d
            com.squareup.moshi.JsonReader$a r13 = r0.f7963a
            int r13 = r1.mo24989O(r13)
            switch(r13) {
                case -1: goto L_0x033f;
                case 0: goto L_0x032e;
                case 1: goto L_0x031d;
                case 2: goto L_0x030f;
                case 3: goto L_0x0303;
                case 4: goto L_0x02dd;
                case 5: goto L_0x02b9;
                case 6: goto L_0x0297;
                case 7: goto L_0x0277;
                case 8: goto L_0x0259;
                case 9: goto L_0x023d;
                case 10: goto L_0x0223;
                case 11: goto L_0x020b;
                case 12: goto L_0x01ff;
                case 13: goto L_0x01f3;
                case 14: goto L_0x01e7;
                case 15: goto L_0x01db;
                case 16: goto L_0x01ca;
                case 17: goto L_0x01be;
                case 18: goto L_0x01b2;
                case 19: goto L_0x01a6;
                case 20: goto L_0x019a;
                case 21: goto L_0x018e;
                case 22: goto L_0x0182;
                case 23: goto L_0x0176;
                case 24: goto L_0x016a;
                case 25: goto L_0x015e;
                case 26: goto L_0x0152;
                case 27: goto L_0x0146;
                case 28: goto L_0x013a;
                case 29: goto L_0x012e;
                case 30: goto L_0x0122;
                case 31: goto L_0x0116;
                case 32: goto L_0x010a;
                case 33: goto L_0x00fe;
                case 34: goto L_0x00f2;
                case 35: goto L_0x00e6;
                case 36: goto L_0x00da;
                case 37: goto L_0x00ce;
                case 38: goto L_0x00c2;
                case 39: goto L_0x00b6;
                case 40: goto L_0x00aa;
                case 41: goto L_0x009e;
                case 42: goto L_0x0092;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x0345
        L_0x0092:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7968f
            java.lang.Object r2 = r2.mo11093a(r1)
            r46 = r2
            java.lang.Integer r46 = (java.lang.Integer) r46
            goto L_0x0345
        L_0x009e:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7974l
            java.lang.Object r2 = r2.mo11093a(r1)
            r45 = r2
            java.lang.Boolean r45 = (java.lang.Boolean) r45
            goto L_0x0345
        L_0x00aa:
            com.squareup.moshi.k<com.cubic.umo.pass.model.LanguageSettings> r2 = r0.f7976n
            java.lang.Object r2 = r2.mo11093a(r1)
            r44 = r2
            com.cubic.umo.pass.model.LanguageSettings r44 = (com.cubic.umo.pass.model.LanguageSettings) r44
            goto L_0x0345
        L_0x00b6:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f7969g
            java.lang.Object r2 = r2.mo11093a(r1)
            r43 = r2
            com.cubic.umo.pass.model.Money r43 = (com.cubic.umo.pass.model.Money) r43
            goto L_0x0345
        L_0x00c2:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7968f
            java.lang.Object r2 = r2.mo11093a(r1)
            r42 = r2
            java.lang.Integer r42 = (java.lang.Integer) r42
            goto L_0x0345
        L_0x00ce:
            com.squareup.moshi.k<java.lang.Double> r2 = r0.f7975m
            java.lang.Object r2 = r2.mo11093a(r1)
            r41 = r2
            java.lang.Double r41 = (java.lang.Double) r41
            goto L_0x0345
        L_0x00da:
            com.squareup.moshi.k<java.lang.Double> r2 = r0.f7975m
            java.lang.Object r2 = r2.mo11093a(r1)
            r40 = r2
            java.lang.Double r40 = (java.lang.Double) r40
            goto L_0x0345
        L_0x00e6:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7968f
            java.lang.Object r2 = r2.mo11093a(r1)
            r39 = r2
            java.lang.Integer r39 = (java.lang.Integer) r39
            goto L_0x0345
        L_0x00f2:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7968f
            java.lang.Object r2 = r2.mo11093a(r1)
            r38 = r2
            java.lang.Integer r38 = (java.lang.Integer) r38
            goto L_0x0345
        L_0x00fe:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f7969g
            java.lang.Object r2 = r2.mo11093a(r1)
            r37 = r2
            com.cubic.umo.pass.model.Money r37 = (com.cubic.umo.pass.model.Money) r37
            goto L_0x0345
        L_0x010a:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7968f
            java.lang.Object r2 = r2.mo11093a(r1)
            r36 = r2
            java.lang.Integer r36 = (java.lang.Integer) r36
            goto L_0x0345
        L_0x0116:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7974l
            java.lang.Object r2 = r2.mo11093a(r1)
            r35 = r2
            java.lang.Boolean r35 = (java.lang.Boolean) r35
            goto L_0x0345
        L_0x0122:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7974l
            java.lang.Object r2 = r2.mo11093a(r1)
            r34 = r2
            java.lang.Boolean r34 = (java.lang.Boolean) r34
            goto L_0x0345
        L_0x012e:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7974l
            java.lang.Object r2 = r2.mo11093a(r1)
            r33 = r2
            java.lang.Boolean r33 = (java.lang.Boolean) r33
            goto L_0x0345
        L_0x013a:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7974l
            java.lang.Object r2 = r2.mo11093a(r1)
            r32 = r2
            java.lang.Boolean r32 = (java.lang.Boolean) r32
            goto L_0x0345
        L_0x0146:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7974l
            java.lang.Object r2 = r2.mo11093a(r1)
            r31 = r2
            java.lang.Boolean r31 = (java.lang.Boolean) r31
            goto L_0x0345
        L_0x0152:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7974l
            java.lang.Object r2 = r2.mo11093a(r1)
            r30 = r2
            java.lang.Boolean r30 = (java.lang.Boolean) r30
            goto L_0x0345
        L_0x015e:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7974l
            java.lang.Object r2 = r2.mo11093a(r1)
            r29 = r2
            java.lang.Boolean r29 = (java.lang.Boolean) r29
            goto L_0x0345
        L_0x016a:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7965c
            java.lang.Object r2 = r2.mo11093a(r1)
            r28 = r2
            java.lang.String r28 = (java.lang.String) r28
            goto L_0x0345
        L_0x0176:
            com.squareup.moshi.k<com.cubic.umo.pass.model.MobilePages> r2 = r0.f7973k
            java.lang.Object r2 = r2.mo11093a(r1)
            r27 = r2
            com.cubic.umo.pass.model.MobilePages r27 = (com.cubic.umo.pass.model.MobilePages) r27
            goto L_0x0345
        L_0x0182:
            com.squareup.moshi.k<java.util.List<com.cubic.umo.pass.model.Money>> r2 = r0.f7972j
            java.lang.Object r2 = r2.mo11093a(r1)
            r26 = r2
            java.util.List r26 = (java.util.List) r26
            goto L_0x0345
        L_0x018e:
            com.squareup.moshi.k<java.util.List<java.lang.String>> r2 = r0.f7971i
            java.lang.Object r2 = r2.mo11093a(r1)
            r25 = r2
            java.util.List r25 = (java.util.List) r25
            goto L_0x0345
        L_0x019a:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f7969g
            java.lang.Object r2 = r2.mo11093a(r1)
            r24 = r2
            com.cubic.umo.pass.model.Money r24 = (com.cubic.umo.pass.model.Money) r24
            goto L_0x0345
        L_0x01a6:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7968f
            java.lang.Object r2 = r2.mo11093a(r1)
            r23 = r2
            java.lang.Integer r23 = (java.lang.Integer) r23
            goto L_0x0345
        L_0x01b2:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f7969g
            java.lang.Object r2 = r2.mo11093a(r1)
            r22 = r2
            com.cubic.umo.pass.model.Money r22 = (com.cubic.umo.pass.model.Money) r22
            goto L_0x0345
        L_0x01be:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7968f
            java.lang.Object r2 = r2.mo11093a(r1)
            r21 = r2
            java.lang.Integer r21 = (java.lang.Integer) r21
            goto L_0x0345
        L_0x01ca:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7970h
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x01d6
            goto L_0x0347
        L_0x01d6:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r7, r7, r1)
            throw r1
        L_0x01db:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f7969g
            java.lang.Object r2 = r2.mo11093a(r1)
            r19 = r2
            com.cubic.umo.pass.model.Money r19 = (com.cubic.umo.pass.model.Money) r19
            goto L_0x0345
        L_0x01e7:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7968f
            java.lang.Object r2 = r2.mo11093a(r1)
            r18 = r2
            java.lang.Integer r18 = (java.lang.Integer) r18
            goto L_0x0345
        L_0x01f3:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f7969g
            java.lang.Object r2 = r2.mo11093a(r1)
            r17 = r2
            com.cubic.umo.pass.model.Money r17 = (com.cubic.umo.pass.model.Money) r17
            goto L_0x0345
        L_0x01ff:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7968f
            java.lang.Object r2 = r2.mo11093a(r1)
            r16 = r2
            java.lang.Integer r16 = (java.lang.Integer) r16
            goto L_0x0345
        L_0x020b:
            com.squareup.moshi.k<java.util.Map<java.lang.String, java.lang.String>> r2 = r0.f7967e
            java.lang.Object r2 = r2.mo11093a(r1)
            r15 = r2
            java.util.Map r15 = (java.util.Map) r15
            if (r15 == 0) goto L_0x021e
            r2 = r20
            r7 = r47
            r6 = r48
            goto L_0x034d
        L_0x021e:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r6, r6, r1)
            throw r1
        L_0x0223:
            com.squareup.moshi.k<java.util.Map<java.lang.String, java.lang.String>> r3 = r0.f7967e
            java.lang.Object r3 = r3.mo11093a(r1)
            r14 = r3
            java.util.Map r14 = (java.util.Map) r14
            if (r14 == 0) goto L_0x0238
            r2 = r20
            r7 = r47
            r6 = r48
            r15 = r49
            goto L_0x034f
        L_0x0238:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r2, r1)
            throw r1
        L_0x023d:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7966d
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0254
            r3 = r2
            r2 = r20
            r7 = r47
            r6 = r48
            r15 = r49
            r14 = r50
            goto L_0x0351
        L_0x0254:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r15, r15, r1)
            throw r1
        L_0x0259:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7964b
            java.lang.Object r2 = r2.mo11093a(r1)
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x0272
            r2 = r20
            r7 = r47
            r6 = r48
            r15 = r49
            r14 = r50
            r3 = r51
            goto L_0x0353
        L_0x0272:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r14, r14, r1)
            throw r1
        L_0x0277:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7964b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0292
            r11 = r2
            r2 = r20
            r7 = r47
            r6 = r48
            r15 = r49
            r14 = r50
            r3 = r51
            r12 = r52
            goto L_0x0355
        L_0x0292:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r3, r3, r1)
            throw r1
        L_0x0297:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7964b
            java.lang.Object r2 = r2.mo11093a(r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x02b4
            r2 = r20
            r7 = r47
            r6 = r48
            r15 = r49
            r14 = r50
            r3 = r51
            r12 = r52
            r11 = r53
            goto L_0x0357
        L_0x02b4:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r12, r12, r1)
            throw r1
        L_0x02b9:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7964b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x02d8
            r9 = r2
            r2 = r20
            r7 = r47
            r6 = r48
            r15 = r49
            r14 = r50
            r3 = r51
            r12 = r52
            r11 = r53
            r10 = r54
            goto L_0x0359
        L_0x02d8:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r11, r11, r1)
            throw r1
        L_0x02dd:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7964b
            java.lang.Object r2 = r2.mo11093a(r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x02fe
            r2 = r20
            r7 = r47
            r6 = r48
            r15 = r49
            r14 = r50
            r3 = r51
            r12 = r52
            r11 = r53
            r10 = r54
            r9 = r55
            goto L_0x0055
        L_0x02fe:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r10, r10, r1)
            throw r1
        L_0x0303:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7965c
            java.lang.Object r2 = r2.mo11093a(r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            r2 = r20
            goto L_0x0349
        L_0x030f:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7965c
            java.lang.Object r2 = r2.mo11093a(r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            r2 = r20
            r7 = r47
            goto L_0x034b
        L_0x031d:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7964b
            java.lang.Object r2 = r2.mo11093a(r1)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0329
            goto L_0x0345
        L_0x0329:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r9, r9, r1)
            throw r1
        L_0x032e:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7964b
            java.lang.Object r2 = r2.mo11093a(r1)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x033a
            goto L_0x0345
        L_0x033a:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r8, r8, r1)
            throw r1
        L_0x033f:
            r59.mo24991S()
            r59.mo24992T()
        L_0x0345:
            r2 = r20
        L_0x0347:
            r7 = r47
        L_0x0349:
            r6 = r48
        L_0x034b:
            r15 = r49
        L_0x034d:
            r14 = r50
        L_0x034f:
            r3 = r51
        L_0x0351:
            r12 = r52
        L_0x0353:
            r11 = r53
        L_0x0355:
            r10 = r54
        L_0x0357:
            r9 = r55
        L_0x0359:
            r8 = r56
            goto L_0x0055
        L_0x035d:
            r59.mo24997r()
            com.cubic.umo.pass.model.AgencyInformation r57 = new com.cubic.umo.pass.model.AgencyInformation
            if (r4 == 0) goto L_0x03ca
            if (r5 == 0) goto L_0x03c5
            if (r56 == 0) goto L_0x03c0
            if (r55 == 0) goto L_0x03bb
            if (r54 == 0) goto L_0x03b6
            if (r53 == 0) goto L_0x03b1
            if (r52 == 0) goto L_0x03ac
            if (r51 == 0) goto L_0x03a7
            int r13 = r51.intValue()
            if (r50 == 0) goto L_0x03a2
            if (r49 == 0) goto L_0x039d
            if (r20 == 0) goto L_0x0398
            boolean r20 = r20.booleanValue()
            r3 = r57
            r6 = r48
            r7 = r47
            r8 = r56
            r9 = r55
            r10 = r54
            r11 = r53
            r12 = r52
            r14 = r50
            r15 = r49
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return r57
        L_0x0398:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r7, r7, r1)
            throw r1
        L_0x039d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r6, r6, r1)
            throw r1
        L_0x03a2:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r2, r1)
            throw r1
        L_0x03a7:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r15, r1)
            throw r1
        L_0x03ac:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r14, r14, r1)
            throw r1
        L_0x03b1:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r3, r3, r1)
            throw r1
        L_0x03b6:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r12, r12, r1)
            throw r1
        L_0x03bb:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r11, r1)
            throw r1
        L_0x03c0:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r10, r10, r1)
            throw r1
        L_0x03c5:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r9, r9, r1)
            throw r1
        L_0x03ca:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r8, r8, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.model.AgencyInformationJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AgencyInformation agencyInformation = (AgencyInformation) obj;
        C24362h.m61211f(kVar, "writer");
        if (agencyInformation != null) {
            kVar.mo25074i();
            kVar.mo25077w("name");
            this.f7964b.mo11094e(kVar, agencyInformation.f7938b);
            kVar.mo25077w("shortName");
            this.f7964b.mo11094e(kVar, agencyInformation.f7939c);
            kVar.mo25077w("serviceName");
            this.f7965c.mo11094e(kVar, agencyInformation.f7940d);
            kVar.mo25077w("region");
            this.f7965c.mo11094e(kVar, agencyInformation.f7941e);
            kVar.mo25077w("poolId");
            this.f7964b.mo11094e(kVar, agencyInformation.f7942f);
            kVar.mo25077w("state");
            this.f7964b.mo11094e(kVar, agencyInformation.f7943g);
            kVar.mo25077w("city");
            this.f7964b.mo11094e(kVar, agencyInformation.f7944h);
            kVar.mo25077w(ServerParameters.COUNTRY);
            this.f7964b.mo11094e(kVar, agencyInformation.f7945i);
            kVar.mo25077w("publicId");
            this.f7964b.mo11094e(kVar, agencyInformation.f7946j);
            kVar.mo25077w("id");
            this.f7966d.mo11094e(kVar, Integer.valueOf(agencyInformation.f7947k));
            kVar.mo25077w("media");
            this.f7967e.mo11094e(kVar, agencyInformation.f7948l);
            kVar.mo25077w("colors");
            this.f7967e.mo11094e(kVar, agencyInformation.f7949m);
            kVar.mo25077w("minPurchaseAmount");
            this.f7968f.mo11094e(kVar, agencyInformation.f7950n);
            kVar.mo25077w("minPurchaseAmountMoney");
            this.f7969g.mo11094e(kVar, agencyInformation.f7951o);
            kVar.mo25077w("maxPurchaseAmount");
            this.f7968f.mo11094e(kVar, agencyInformation.f7952p);
            kVar.mo25077w("maxPurchaseAmountMoney");
            this.f7969g.mo11094e(kVar, agencyInformation.f7953q);
            kVar.mo25077w("allowStoredValue");
            C0017h.m63T(agencyInformation.f7954r, this.f7970h, kVar, "storedValueTransactionMin");
            this.f7968f.mo11094e(kVar, agencyInformation.f7955s);
            kVar.mo25077w("storedValueTransactionMinMoney");
            this.f7969g.mo11094e(kVar, agencyInformation.f7956t);
            kVar.mo25077w("storedValueTransactionMax");
            this.f7968f.mo11094e(kVar, agencyInformation.f7957u);
            kVar.mo25077w("storedValueTransactionMaxMoney");
            this.f7969g.mo11094e(kVar, agencyInformation.f7958v);
            kVar.mo25077w("storedValueButtonValues");
            this.f7971i.mo11094e(kVar, agencyInformation.f7959w);
            kVar.mo25077w("storedValueButtonMoneys");
            this.f7972j.mo11094e(kVar, agencyInformation.f7960x);
            kVar.mo25077w("mobilePages");
            this.f7973k.mo11094e(kVar, agencyInformation.f7961y);
            kVar.mo25077w("mobileLogoTargetUrl");
            this.f7965c.mo11094e(kVar, agencyInformation.f7962z);
            kVar.mo25077w("amexAccepted");
            this.f7974l.mo11094e(kVar, agencyInformation.f7920A);
            kVar.mo25077w("mcAccepted");
            this.f7974l.mo11094e(kVar, agencyInformation.f7921B);
            kVar.mo25077w("visaAccepted");
            this.f7974l.mo11094e(kVar, agencyInformation.f7922C);
            kVar.mo25077w("discAccepted");
            this.f7974l.mo11094e(kVar, agencyInformation.f7923D);
            kVar.mo25077w("jcbAccepted");
            this.f7974l.mo11094e(kVar, agencyInformation.f7924E);
            kVar.mo25077w("googlePayAccepted");
            this.f7974l.mo11094e(kVar, agencyInformation.f7925F);
            kVar.mo25077w("storedValuePayAccepted");
            this.f7974l.mo11094e(kVar, agencyInformation.f7926G);
            kVar.mo25077w("minimumAutoloadAmount");
            this.f7968f.mo11094e(kVar, agencyInformation.f7927H);
            kVar.mo25077w("minimumAutoloadAmountMoney");
            this.f7969g.mo11094e(kVar, agencyInformation.f7928I);
            kVar.mo25077w("minimumTripAutoload");
            this.f7968f.mo11094e(kVar, agencyInformation.f7929J);
            kVar.mo25077w("minimumHoursAutoload");
            this.f7968f.mo11094e(kVar, agencyInformation.f7930K);
            kVar.mo25077w("centerLongitude");
            this.f7975m.mo11094e(kVar, agencyInformation.f7931L);
            kVar.mo25077w("centerLatitude");
            this.f7975m.mo11094e(kVar, agencyInformation.f7932M);
            kVar.mo25077w("lowBalanceLevel");
            this.f7968f.mo11094e(kVar, agencyInformation.f7933N);
            kVar.mo25077w("lowBalanceLevelMoney");
            this.f7969g.mo11094e(kVar, agencyInformation.f7934O);
            kVar.mo25077w("i18n");
            this.f7976n.mo11094e(kVar, agencyInformation.f7935P);
            kVar.mo25077w("scanRideSupported");
            this.f7974l.mo11094e(kVar, agencyInformation.f7936Q);
            kVar.mo25077w("maxConsecutiveOfflineScanRides");
            this.f7968f.mo11094e(kVar, agencyInformation.f7937R);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AgencyInformation)";
    }
}
