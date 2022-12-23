package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/AccountDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/AccountDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class AccountDTOJsonAdapter extends C8011k<AccountDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f7895a = JsonReader.C7986a.m18216a("agencyShortName", "agencyName", "agencyPublicId", "balance", "balanceMoney", "mediaId", "cardNumber", "mediaStatus", "accountStatus", "fareCode", "expires", LinksConfiguration.KEY_KEY, "passes", "txHistory", "transferMinutesRemaining", "transferTimeEnd", "textAlert", "homeAgencyId", "autoloadEnabled", "autoloadAmount", "autoloadAmountMoney", "accountType", "created", "fareType", "fareCodeString", "mediaStatusString", "accountStatusString", "lowBalance", "fareCapTimeRemaining", "fareCapTimeEnd", "cappingState", "cappingInformation");

    /* renamed from: b */
    public final C8011k<String> f7896b;

    /* renamed from: c */
    public final C8011k<Integer> f7897c;

    /* renamed from: d */
    public final C8011k<Money> f7898d;

    /* renamed from: e */
    public final C8011k<Long> f7899e;

    /* renamed from: f */
    public final C8011k<Long> f7900f;

    /* renamed from: g */
    public final C8011k<String> f7901g;

    /* renamed from: h */
    public final C8011k<List<PassDTO>> f7902h;

    /* renamed from: i */
    public final C8011k<List<TxDTO>> f7903i;

    /* renamed from: j */
    public final C8011k<Boolean> f7904j;

    /* renamed from: k */
    public final C8011k<Integer> f7905k;

    /* renamed from: l */
    public final C8011k<CappingState> f7906l;

    /* renamed from: m */
    public final C8011k<CappingInfo> f7907m;

    public AccountDTOJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f7896b = oVar2.mo25082c(cls, emptySet, "agencyShortName");
        this.f7897c = oVar2.mo25082c(Integer.TYPE, emptySet, "balance");
        this.f7898d = oVar2.mo25082c(Money.class, emptySet, "balanceMoney");
        this.f7899e = oVar2.mo25082c(Long.class, emptySet, "mediaId");
        this.f7900f = oVar2.mo25082c(Long.TYPE, emptySet, "expires");
        this.f7901g = oVar2.mo25082c(cls, emptySet, LinksConfiguration.KEY_KEY);
        this.f7902h = oVar2.mo25082c(C12949m.m32790d(List.class, PassDTO.class), emptySet, "passes");
        this.f7903i = oVar2.mo25082c(C12949m.m32790d(List.class, TxDTO.class), emptySet, "txHistory");
        this.f7904j = oVar2.mo25082c(Boolean.class, emptySet, "autoloadEnabled");
        this.f7905k = oVar2.mo25082c(Integer.class, emptySet, "autoloadAmount");
        this.f7906l = oVar2.mo25082c(CappingState.class, emptySet, "cappingState");
        this.f7907m = oVar2.mo25082c(CappingInfo.class, emptySet, "cappingInformation");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x030d, code lost:
        r7 = r47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02f5, code lost:
        r9 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02f7, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02f9, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02fb, code lost:
        r11 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02fd, code lost:
        r4 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02ff, code lost:
        r5 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0301, code lost:
        r14 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0303, code lost:
        r13 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0305, code lost:
        r12 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0307, code lost:
        r6 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0309, code lost:
        r10 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x030b, code lost:
        r8 = r46;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r50) {
        /*
            r49 = this;
            r0 = r49
            r1 = r50
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r50.mo24995i()
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
            r16 = r14
            r17 = r16
            r18 = r17
            r22 = r18
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
        L_0x003f:
            boolean r15 = r50.mo24999v()
            r19 = r9
            java.lang.String r9 = "transferTimeEnd"
            r38 = r11
            java.lang.String r11 = "transferMinutesRemaining"
            r20 = r2
            java.lang.String r2 = "txHistory"
            r21 = r3
            java.lang.String r3 = "passes"
            r39 = r4
            java.lang.String r4 = "expires"
            r40 = r5
            java.lang.String r5 = "fareCode"
            r41 = r14
            java.lang.String r14 = "accountStatus"
            r42 = r13
            java.lang.String r13 = "mediaStatus"
            r43 = r12
            java.lang.String r12 = "cardNumber"
            r44 = r6
            java.lang.String r6 = "balance"
            r45 = r10
            java.lang.String r10 = "agencyPublicId"
            r46 = r8
            java.lang.String r8 = "agencyName"
            r47 = r7
            java.lang.String r7 = "agencyShortName"
            if (r15 == 0) goto L_0x0311
            com.squareup.moshi.JsonReader$a r15 = r0.f7895a
            int r15 = r1.mo24989O(r15)
            switch(r15) {
                case -1: goto L_0x02ef;
                case 0: goto L_0x02c5;
                case 1: goto L_0x029e;
                case 2: goto L_0x0278;
                case 3: goto L_0x0254;
                case 4: goto L_0x0243;
                case 5: goto L_0x0238;
                case 6: goto L_0x0216;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01d8;
                case 9: goto L_0x01bc;
                case 10: goto L_0x01a2;
                case 11: goto L_0x0196;
                case 12: goto L_0x0183;
                case 13: goto L_0x0170;
                case 14: goto L_0x015a;
                case 15: goto L_0x0147;
                case 16: goto L_0x013b;
                case 17: goto L_0x012f;
                case 18: goto L_0x0123;
                case 19: goto L_0x0117;
                case 20: goto L_0x010b;
                case 21: goto L_0x00ff;
                case 22: goto L_0x00f3;
                case 23: goto L_0x00e7;
                case 24: goto L_0x00db;
                case 25: goto L_0x00cf;
                case 26: goto L_0x00c3;
                case 27: goto L_0x00b7;
                case 28: goto L_0x00ab;
                case 29: goto L_0x009f;
                case 30: goto L_0x0093;
                case 31: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x02f5
        L_0x0087:
            com.squareup.moshi.k<com.cubic.umo.pass.model.CappingInfo> r2 = r0.f7907m
            java.lang.Object r2 = r2.mo11093a(r1)
            r37 = r2
            com.cubic.umo.pass.model.CappingInfo r37 = (com.cubic.umo.pass.model.CappingInfo) r37
            goto L_0x02f5
        L_0x0093:
            com.squareup.moshi.k<com.cubic.umo.pass.model.CappingState> r2 = r0.f7906l
            java.lang.Object r2 = r2.mo11093a(r1)
            r36 = r2
            com.cubic.umo.pass.model.CappingState r36 = (com.cubic.umo.pass.model.CappingState) r36
            goto L_0x02f5
        L_0x009f:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r35 = r2
            java.lang.String r35 = (java.lang.String) r35
            goto L_0x02f5
        L_0x00ab:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7905k
            java.lang.Object r2 = r2.mo11093a(r1)
            r34 = r2
            java.lang.Integer r34 = (java.lang.Integer) r34
            goto L_0x02f5
        L_0x00b7:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7904j
            java.lang.Object r2 = r2.mo11093a(r1)
            r33 = r2
            java.lang.Boolean r33 = (java.lang.Boolean) r33
            goto L_0x02f5
        L_0x00c3:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r32 = r2
            java.lang.String r32 = (java.lang.String) r32
            goto L_0x02f5
        L_0x00cf:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r31 = r2
            java.lang.String r31 = (java.lang.String) r31
            goto L_0x02f5
        L_0x00db:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r30 = r2
            java.lang.String r30 = (java.lang.String) r30
            goto L_0x02f5
        L_0x00e7:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r29 = r2
            java.lang.String r29 = (java.lang.String) r29
            goto L_0x02f5
        L_0x00f3:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r28 = r2
            java.lang.String r28 = (java.lang.String) r28
            goto L_0x02f5
        L_0x00ff:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r27 = r2
            java.lang.String r27 = (java.lang.String) r27
            goto L_0x02f5
        L_0x010b:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f7898d
            java.lang.Object r2 = r2.mo11093a(r1)
            r26 = r2
            com.cubic.umo.pass.model.Money r26 = (com.cubic.umo.pass.model.Money) r26
            goto L_0x02f5
        L_0x0117:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7905k
            java.lang.Object r2 = r2.mo11093a(r1)
            r25 = r2
            java.lang.Integer r25 = (java.lang.Integer) r25
            goto L_0x02f5
        L_0x0123:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7904j
            java.lang.Object r2 = r2.mo11093a(r1)
            r24 = r2
            java.lang.Boolean r24 = (java.lang.Boolean) r24
            goto L_0x02f5
        L_0x012f:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r23 = r2
            java.lang.String r23 = (java.lang.String) r23
            goto L_0x02f5
        L_0x013b:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r22 = r2
            java.lang.String r22 = (java.lang.String) r22
            goto L_0x02f5
        L_0x0147:
            com.squareup.moshi.k<java.lang.Long> r2 = r0.f7900f
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0155
            r9 = r19
            goto L_0x02f9
        L_0x0155:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r9, r9, r1)
            throw r1
        L_0x015a:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7897c
            java.lang.Object r2 = r2.mo11093a(r1)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x016b
            r9 = r19
            r2 = r20
            goto L_0x02fb
        L_0x016b:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r11, r11, r1)
            throw r1
        L_0x0170:
            com.squareup.moshi.k<java.util.List<com.cubic.umo.pass.model.TxDTO>> r3 = r0.f7903i
            java.lang.Object r3 = r3.mo11093a(r1)
            r18 = r3
            java.util.List r18 = (java.util.List) r18
            if (r18 == 0) goto L_0x017e
            goto L_0x02f5
        L_0x017e:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r2, r1)
            throw r1
        L_0x0183:
            com.squareup.moshi.k<java.util.List<com.cubic.umo.pass.model.PassDTO>> r2 = r0.f7902h
            java.lang.Object r2 = r2.mo11093a(r1)
            r17 = r2
            java.util.List r17 = (java.util.List) r17
            if (r17 == 0) goto L_0x0191
            goto L_0x02f5
        L_0x0191:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r3, r3, r1)
            throw r1
        L_0x0196:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7901g
            java.lang.Object r2 = r2.mo11093a(r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            goto L_0x02f5
        L_0x01a2:
            com.squareup.moshi.k<java.lang.Long> r2 = r0.f7900f
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x01b7
            r4 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            r11 = r38
            goto L_0x02ff
        L_0x01b7:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r4, r4, r1)
            throw r1
        L_0x01bc:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7897c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x01d3
            r5 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            r11 = r38
            r4 = r39
            goto L_0x0301
        L_0x01d3:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r5, r5, r1)
            throw r1
        L_0x01d8:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7896b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x01f1
            r14 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            r11 = r38
            r4 = r39
            r5 = r40
            goto L_0x0303
        L_0x01f1:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r14, r14, r1)
            throw r1
        L_0x01f6:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7896b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0211
            r13 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            r11 = r38
            r4 = r39
            r5 = r40
            r14 = r41
            goto L_0x0305
        L_0x0211:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r13, r13, r1)
            throw r1
        L_0x0216:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7896b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0233
            r12 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            r11 = r38
            r4 = r39
            r5 = r40
            r14 = r41
            r13 = r42
            goto L_0x0307
        L_0x0233:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r12, r12, r1)
            throw r1
        L_0x0238:
            com.squareup.moshi.k<java.lang.Long> r2 = r0.f7899e
            java.lang.Object r2 = r2.mo11093a(r1)
            r9 = r2
            java.lang.Long r9 = (java.lang.Long) r9
            goto L_0x02f7
        L_0x0243:
            com.squareup.moshi.k<com.cubic.umo.pass.model.Money> r2 = r0.f7898d
            java.lang.Object r2 = r2.mo11093a(r1)
            com.cubic.umo.pass.model.Money r2 = (com.cubic.umo.pass.model.Money) r2
            r11 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            goto L_0x02fd
        L_0x0254:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7897c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0273
            r6 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            r11 = r38
            r4 = r39
            r5 = r40
            r14 = r41
            r13 = r42
            r12 = r43
            goto L_0x0309
        L_0x0273:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r6, r6, r1)
            throw r1
        L_0x0278:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7896b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0299
            r10 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            r11 = r38
            r4 = r39
            r5 = r40
            r14 = r41
            r13 = r42
            r12 = r43
            r6 = r44
            goto L_0x030b
        L_0x0299:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r10, r10, r1)
            throw r1
        L_0x029e:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7896b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x02c0
            r8 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            r11 = r38
            r4 = r39
            r5 = r40
            r14 = r41
            r13 = r42
            r12 = r43
            r6 = r44
            r10 = r45
            goto L_0x030d
        L_0x02c0:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r8, r8, r1)
            throw r1
        L_0x02c5:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7896b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x02ea
            r7 = r2
            r9 = r19
            r2 = r20
            r3 = r21
            r11 = r38
            r4 = r39
            r5 = r40
            r14 = r41
            r13 = r42
            r12 = r43
            r6 = r44
            r10 = r45
            r8 = r46
            goto L_0x003f
        L_0x02ea:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r7, r7, r1)
            throw r1
        L_0x02ef:
            r50.mo24991S()
            r50.mo24992T()
        L_0x02f5:
            r9 = r19
        L_0x02f7:
            r2 = r20
        L_0x02f9:
            r3 = r21
        L_0x02fb:
            r11 = r38
        L_0x02fd:
            r4 = r39
        L_0x02ff:
            r5 = r40
        L_0x0301:
            r14 = r41
        L_0x0303:
            r13 = r42
        L_0x0305:
            r12 = r43
        L_0x0307:
            r6 = r44
        L_0x0309:
            r10 = r45
        L_0x030b:
            r8 = r46
        L_0x030d:
            r7 = r47
            goto L_0x003f
        L_0x0311:
            r50.mo24997r()
            com.cubic.umo.pass.model.AccountDTO r48 = new com.cubic.umo.pass.model.AccountDTO
            if (r47 == 0) goto L_0x0398
            if (r46 == 0) goto L_0x0393
            if (r45 == 0) goto L_0x038e
            if (r44 == 0) goto L_0x0389
            int r7 = r44.intValue()
            if (r43 == 0) goto L_0x0384
            if (r42 == 0) goto L_0x037f
            if (r41 == 0) goto L_0x037a
            if (r40 == 0) goto L_0x0375
            int r13 = r40.intValue()
            if (r39 == 0) goto L_0x0370
            long r14 = r39.longValue()
            if (r17 == 0) goto L_0x036b
            if (r18 == 0) goto L_0x0366
            if (r21 == 0) goto L_0x0361
            int r2 = r21.intValue()
            if (r20 == 0) goto L_0x035c
            long r20 = r20.longValue()
            r3 = r48
            r4 = r47
            r5 = r46
            r6 = r45
            r8 = r38
            r9 = r19
            r10 = r43
            r11 = r42
            r12 = r41
            r19 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r48
        L_0x035c:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r9, r9, r1)
            throw r1
        L_0x0361:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r11, r1)
            throw r1
        L_0x0366:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r2, r1)
            throw r1
        L_0x036b:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r3, r3, r1)
            throw r1
        L_0x0370:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r4, r4, r1)
            throw r1
        L_0x0375:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r5, r5, r1)
            throw r1
        L_0x037a:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r14, r14, r1)
            throw r1
        L_0x037f:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r13, r13, r1)
            throw r1
        L_0x0384:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r12, r12, r1)
            throw r1
        L_0x0389:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r6, r6, r1)
            throw r1
        L_0x038e:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r10, r10, r1)
            throw r1
        L_0x0393:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r8, r8, r1)
            throw r1
        L_0x0398:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r7, r7, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.model.AccountDTOJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AccountDTO accountDTO = (AccountDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (accountDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("agencyShortName");
            this.f7896b.mo11094e(kVar, accountDTO.f7869a);
            kVar.mo25077w("agencyName");
            this.f7896b.mo11094e(kVar, accountDTO.f7870b);
            kVar.mo25077w("agencyPublicId");
            this.f7896b.mo11094e(kVar, accountDTO.f7871c);
            kVar.mo25077w("balance");
            this.f7897c.mo11094e(kVar, Integer.valueOf(accountDTO.f7872d));
            kVar.mo25077w("balanceMoney");
            this.f7898d.mo11094e(kVar, accountDTO.f7873e);
            kVar.mo25077w("mediaId");
            this.f7899e.mo11094e(kVar, accountDTO.f7874f);
            kVar.mo25077w("cardNumber");
            this.f7896b.mo11094e(kVar, accountDTO.f7875g);
            kVar.mo25077w("mediaStatus");
            this.f7896b.mo11094e(kVar, accountDTO.f7876h);
            kVar.mo25077w("accountStatus");
            this.f7896b.mo11094e(kVar, accountDTO.f7877i);
            kVar.mo25077w("fareCode");
            this.f7897c.mo11094e(kVar, Integer.valueOf(accountDTO.f7878j));
            kVar.mo25077w("expires");
            this.f7900f.mo11094e(kVar, Long.valueOf(accountDTO.f7879k));
            kVar.mo25077w(LinksConfiguration.KEY_KEY);
            this.f7901g.mo11094e(kVar, accountDTO.f7880l);
            kVar.mo25077w("passes");
            this.f7902h.mo11094e(kVar, accountDTO.f7881m);
            kVar.mo25077w("txHistory");
            this.f7903i.mo11094e(kVar, accountDTO.f7882n);
            kVar.mo25077w("transferMinutesRemaining");
            this.f7897c.mo11094e(kVar, Integer.valueOf(accountDTO.f7883o));
            kVar.mo25077w("transferTimeEnd");
            this.f7900f.mo11094e(kVar, Long.valueOf(accountDTO.f7884p));
            kVar.mo25077w("textAlert");
            this.f7901g.mo11094e(kVar, accountDTO.f7885q);
            kVar.mo25077w("homeAgencyId");
            this.f7901g.mo11094e(kVar, accountDTO.f7886r);
            kVar.mo25077w("autoloadEnabled");
            this.f7904j.mo11094e(kVar, accountDTO.f7887s);
            kVar.mo25077w("autoloadAmount");
            this.f7905k.mo11094e(kVar, accountDTO.f7888t);
            kVar.mo25077w("autoloadAmountMoney");
            this.f7898d.mo11094e(kVar, accountDTO.f7889u);
            kVar.mo25077w("accountType");
            this.f7901g.mo11094e(kVar, accountDTO.f7890v);
            kVar.mo25077w("created");
            this.f7901g.mo11094e(kVar, accountDTO.f7891w);
            kVar.mo25077w("fareType");
            this.f7901g.mo11094e(kVar, accountDTO.f7892x);
            kVar.mo25077w("fareCodeString");
            this.f7901g.mo11094e(kVar, accountDTO.f7893y);
            kVar.mo25077w("mediaStatusString");
            this.f7901g.mo11094e(kVar, accountDTO.f7894z);
            kVar.mo25077w("accountStatusString");
            this.f7901g.mo11094e(kVar, accountDTO.f7863A);
            kVar.mo25077w("lowBalance");
            this.f7904j.mo11094e(kVar, accountDTO.f7864B);
            kVar.mo25077w("fareCapTimeRemaining");
            this.f7905k.mo11094e(kVar, accountDTO.f7865C);
            kVar.mo25077w("fareCapTimeEnd");
            this.f7901g.mo11094e(kVar, accountDTO.f7866D);
            kVar.mo25077w("cappingState");
            this.f7906l.mo11094e(kVar, accountDTO.f7867E);
            kVar.mo25077w("cappingInformation");
            this.f7907m.mo11094e(kVar, accountDTO.f7868F);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AccountDTO)";
    }
}
