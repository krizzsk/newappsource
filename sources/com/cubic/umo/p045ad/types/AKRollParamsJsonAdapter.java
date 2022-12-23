package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import p358af.C13437d;
import p583jk.C17884p;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKRollParamsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKRollParams;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKRollParamsJsonAdapter */
public final class AKRollParamsJsonAdapter extends C8011k<AKRollParams> {

    /* renamed from: a */
    public final JsonReader.C7986a f7589a = JsonReader.C7986a.m18216a("roll_playlist", "server_url", "qs_params", "connection_timeout_seconds", "request_timeout_seconds", "video_timeout_seconds", "slot", "pick_high_bitrate_creative", "pick_creative_by_network", "video_mimes_list_by_priority_android", "enable_ad_prefetch", "auto_prefetch_on_expiry", "prefetched_ad_expiry_minutes");

    /* renamed from: b */
    public final C8011k<String> f7590b;

    /* renamed from: c */
    public final C8011k<Integer> f7591c;

    /* renamed from: d */
    public final C8011k<Boolean> f7592d;

    /* renamed from: e */
    public final C8011k<List<String>> f7593e;

    public AKRollParamsJsonAdapter(C8017o oVar) {
        C8017o oVar2 = oVar;
        Class<String> cls = String.class;
        C24362h.m61211f(oVar2, "moshi");
        this.f7590b = C18201b.m44910D(oVar2, cls, "rollPlaylist");
        this.f7591c = C18201b.m44910D(oVar2, Integer.TYPE, "connectionTimeoutSeconds");
        this.f7592d = C18201b.m44910D(oVar2, Boolean.TYPE, "pickHighBitrateCreative");
        this.f7593e = C17884p.m44361c0(oVar2, C12949m.m32790d(List.class, cls), "videoMimesListByPriority");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0224, code lost:
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0226, code lost:
        r9 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0228, code lost:
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x022a, code lost:
        r14 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x022c, code lost:
        r7 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x022e, code lost:
        r6 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0230, code lost:
        r13 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0232, code lost:
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0234, code lost:
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0236, code lost:
        r2 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0238, code lost:
        r12 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023a, code lost:
        r11 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x023c, code lost:
        r4 = r28;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r44) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r44.mo24995i()
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
        L_0x0019:
            boolean r15 = r44.mo24999v()
            r16 = r10
            java.lang.String r10 = "enable_ad_prefetch"
            r17 = r9
            java.lang.String r9 = "enableAdPrefetch"
            r18 = r8
            java.lang.String r8 = "video_mimes_list_by_priority_android"
            r19 = r14
            java.lang.String r14 = "videoMimesListByPriority"
            r20 = r7
            java.lang.String r7 = "pick_creative_by_network"
            r21 = r6
            java.lang.String r6 = "pickCreativeByNetwork"
            r22 = r13
            java.lang.String r13 = "pick_high_bitrate_creative"
            r23 = r5
            java.lang.String r5 = "pickHighBitrateCreative"
            r24 = r3
            java.lang.String r3 = "video_timeout_seconds"
            r25 = r2
            java.lang.String r2 = "videoTimeoutSeconds"
            r26 = r12
            java.lang.String r12 = "request_timeout_seconds"
            r27 = r11
            java.lang.String r11 = "requestTimeoutSeconds"
            r28 = r4
            java.lang.String r4 = "connection_timeout_seconds"
            r29 = r4
            java.lang.String r4 = "connectionTimeoutSeconds"
            r30 = r4
            java.lang.String r4 = "qs_params"
            r31 = r4
            java.lang.String r4 = "qsParams"
            r32 = r4
            java.lang.String r4 = "server_url"
            r33 = r4
            java.lang.String r4 = "serverUrl"
            r34 = r4
            java.lang.String r4 = "roll_playlist"
            r35 = r4
            java.lang.String r4 = "rollPlaylist"
            r36 = r4
            java.lang.String r4 = "slot"
            if (r15 == 0) goto L_0x0240
            com.squareup.moshi.JsonReader$a r15 = r0.f7589a
            int r15 = r1.mo24989O(r15)
            switch(r15) {
                case -1: goto L_0x021e;
                case 0: goto L_0x01f0;
                case 1: goto L_0x01c5;
                case 2: goto L_0x019b;
                case 3: goto L_0x0174;
                case 4: goto L_0x0152;
                case 5: goto L_0x0132;
                case 6: goto L_0x0114;
                case 7: goto L_0x00f8;
                case 8: goto L_0x00de;
                case 9: goto L_0x00c6;
                case 10: goto L_0x00b0;
                case 11: goto L_0x0098;
                case 12: goto L_0x0082;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x0224
        L_0x0082:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7591c
            java.lang.Object r2 = r2.mo11093a(r1)
            r10 = r2
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 == 0) goto L_0x008f
            goto L_0x0226
        L_0x008f:
            java.lang.String r2 = "prefetchedAdExpiryMinutes"
            java.lang.String r3 = "prefetched_ad_expiry_minutes"
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r3, r1)
            throw r1
        L_0x0098:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7592d
            java.lang.Object r2 = r2.mo11093a(r1)
            r9 = r2
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L_0x00a7
            r10 = r16
            goto L_0x0228
        L_0x00a7:
            java.lang.String r2 = "autoPrefetchOnExpiry"
            java.lang.String r3 = "auto_prefetch_on_expiry"
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r3, r1)
            throw r1
        L_0x00b0:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7592d
            java.lang.Object r2 = r2.mo11093a(r1)
            r8 = r2
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L_0x00c1
            r10 = r16
            r9 = r17
            goto L_0x022a
        L_0x00c1:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r9, r10, r1)
            throw r1
        L_0x00c6:
            com.squareup.moshi.k<java.util.List<java.lang.String>> r2 = r0.f7593e
            java.lang.Object r2 = r2.mo11093a(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00d9
            r14 = r2
            r10 = r16
            r9 = r17
            r8 = r18
            goto L_0x022c
        L_0x00d9:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r14, r8, r1)
            throw r1
        L_0x00de:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7592d
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00f3
            r7 = r2
            r10 = r16
            r9 = r17
            r8 = r18
            r14 = r19
            goto L_0x022e
        L_0x00f3:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r6, r7, r1)
            throw r1
        L_0x00f8:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7592d
            java.lang.Object r2 = r2.mo11093a(r1)
            r6 = r2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x010f
            r10 = r16
            r9 = r17
            r8 = r18
            r14 = r19
            r7 = r20
            goto L_0x0230
        L_0x010f:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r5, r13, r1)
            throw r1
        L_0x0114:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7590b
            java.lang.Object r2 = r2.mo11093a(r1)
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x012d
            r10 = r16
            r9 = r17
            r8 = r18
            r14 = r19
            r7 = r20
            r6 = r21
            goto L_0x0232
        L_0x012d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r4, r4, r1)
            throw r1
        L_0x0132:
            com.squareup.moshi.k<java.lang.Integer> r4 = r0.f7591c
            java.lang.Object r4 = r4.mo11093a(r1)
            r5 = r4
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x014d
            r10 = r16
            r9 = r17
            r8 = r18
            r14 = r19
            r7 = r20
            r6 = r21
            r13 = r22
            goto L_0x0234
        L_0x014d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r3, r1)
            throw r1
        L_0x0152:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7591c
            java.lang.Object r2 = r2.mo11093a(r1)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x016f
            r10 = r16
            r9 = r17
            r8 = r18
            r14 = r19
            r7 = r20
            r6 = r21
            r13 = r22
            r5 = r23
            goto L_0x0236
        L_0x016f:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r11, r12, r1)
            throw r1
        L_0x0174:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7591c
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x0192
            r10 = r16
            r9 = r17
            r8 = r18
            r14 = r19
            r7 = r20
            r6 = r21
            r13 = r22
            r5 = r23
            r3 = r24
            goto L_0x0238
        L_0x0192:
            r15 = r29
            r2 = r30
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r15, r1)
            throw r1
        L_0x019b:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7590b
            java.lang.Object r2 = r2.mo11093a(r1)
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x01bc
            r10 = r16
            r9 = r17
            r8 = r18
            r14 = r19
            r7 = r20
            r6 = r21
            r13 = r22
            r5 = r23
            r3 = r24
            r2 = r25
            goto L_0x023a
        L_0x01bc:
            r2 = r31
            r3 = r32
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r3, r2, r1)
            throw r1
        L_0x01c5:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7590b
            java.lang.Object r2 = r2.mo11093a(r1)
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x01e7
            r10 = r16
            r9 = r17
            r8 = r18
            r14 = r19
            r7 = r20
            r6 = r21
            r13 = r22
            r5 = r23
            r3 = r24
            r2 = r25
            r12 = r26
            goto L_0x023c
        L_0x01e7:
            r2 = r33
            r3 = r34
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r3, r2, r1)
            throw r1
        L_0x01f0:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7590b
            java.lang.Object r2 = r2.mo11093a(r1)
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0215
            r10 = r16
            r9 = r17
            r8 = r18
            r14 = r19
            r7 = r20
            r6 = r21
            r13 = r22
            r5 = r23
            r3 = r24
            r2 = r25
            r12 = r26
            r11 = r27
            goto L_0x0019
        L_0x0215:
            r2 = r35
            r3 = r36
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r3, r2, r1)
            throw r1
        L_0x021e:
            r44.mo24991S()
            r44.mo24992T()
        L_0x0224:
            r10 = r16
        L_0x0226:
            r9 = r17
        L_0x0228:
            r8 = r18
        L_0x022a:
            r14 = r19
        L_0x022c:
            r7 = r20
        L_0x022e:
            r6 = r21
        L_0x0230:
            r13 = r22
        L_0x0232:
            r5 = r23
        L_0x0234:
            r3 = r24
        L_0x0236:
            r2 = r25
        L_0x0238:
            r12 = r26
        L_0x023a:
            r11 = r27
        L_0x023c:
            r4 = r28
            goto L_0x0019
        L_0x0240:
            r15 = r29
            r0 = r30
            r37 = r31
            r38 = r32
            r39 = r33
            r40 = r34
            r41 = r35
            r42 = r36
            r44.mo24997r()
            com.cubic.umo.ad.types.AKRollParams r29 = new com.cubic.umo.ad.types.AKRollParams
            if (r28 == 0) goto L_0x02f0
            if (r27 == 0) goto L_0x02e7
            if (r26 == 0) goto L_0x02de
            if (r25 == 0) goto L_0x02d9
            int r0 = r25.intValue()
            if (r24 == 0) goto L_0x02d4
            int r11 = r24.intValue()
            if (r23 == 0) goto L_0x02cf
            int r2 = r23.intValue()
            if (r22 == 0) goto L_0x02ca
            if (r21 == 0) goto L_0x02c5
            boolean r12 = r21.booleanValue()
            if (r20 == 0) goto L_0x02c0
            boolean r13 = r20.booleanValue()
            if (r19 == 0) goto L_0x02bb
            if (r18 == 0) goto L_0x02b6
            boolean r14 = r18.booleanValue()
            if (r17 == 0) goto L_0x02ad
            boolean r15 = r17.booleanValue()
            if (r16 == 0) goto L_0x02a4
            int r16 = r16.intValue()
            r3 = r29
            r4 = r28
            r5 = r27
            r6 = r26
            r7 = r0
            r8 = r11
            r9 = r2
            r10 = r22
            r11 = r12
            r12 = r13
            r13 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r29
        L_0x02a4:
            java.lang.String r0 = "prefetchedAdExpiryMinutes"
            java.lang.String r2 = "prefetched_ad_expiry_minutes"
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r0, r2, r1)
            throw r0
        L_0x02ad:
            java.lang.String r0 = "autoPrefetchOnExpiry"
            java.lang.String r2 = "auto_prefetch_on_expiry"
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r0, r2, r1)
            throw r0
        L_0x02b6:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r9, r10, r1)
            throw r0
        L_0x02bb:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r14, r8, r1)
            throw r0
        L_0x02c0:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r6, r7, r1)
            throw r0
        L_0x02c5:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r5, r13, r1)
            throw r0
        L_0x02ca:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r4, r4, r1)
            throw r0
        L_0x02cf:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r2, r3, r1)
            throw r0
        L_0x02d4:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r11, r12, r1)
            throw r0
        L_0x02d9:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r0, r15, r1)
            throw r0
        L_0x02de:
            r0 = r37
            r2 = r38
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r2, r0, r1)
            throw r0
        L_0x02e7:
            r0 = r39
            r2 = r40
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r2, r0, r1)
            throw r0
        L_0x02f0:
            r0 = r41
            r2 = r42
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKRollParamsJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKRollParams aKRollParams = (AKRollParams) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKRollParams != null) {
            kVar.mo25074i();
            kVar.mo25077w("roll_playlist");
            this.f7590b.mo11094e(kVar, aKRollParams.getRollPlaylist());
            kVar.mo25077w("server_url");
            this.f7590b.mo11094e(kVar, aKRollParams.getServerUrl());
            kVar.mo25077w("qs_params");
            this.f7590b.mo11094e(kVar, aKRollParams.getQsParams());
            kVar.mo25077w("connection_timeout_seconds");
            this.f7591c.mo11094e(kVar, Integer.valueOf(aKRollParams.getConnectionTimeoutSeconds()));
            kVar.mo25077w("request_timeout_seconds");
            this.f7591c.mo11094e(kVar, Integer.valueOf(aKRollParams.getRequestTimeoutSeconds()));
            kVar.mo25077w("video_timeout_seconds");
            this.f7591c.mo11094e(kVar, Integer.valueOf(aKRollParams.getVideoTimeoutSeconds()));
            kVar.mo25077w("slot");
            this.f7590b.mo11094e(kVar, aKRollParams.getSlot());
            kVar.mo25077w("pick_high_bitrate_creative");
            this.f7592d.mo11094e(kVar, Boolean.valueOf(aKRollParams.getPickHighBitrateCreative()));
            kVar.mo25077w("pick_creative_by_network");
            this.f7592d.mo11094e(kVar, Boolean.valueOf(aKRollParams.getPickCreativeByNetwork()));
            kVar.mo25077w("video_mimes_list_by_priority_android");
            this.f7593e.mo11094e(kVar, aKRollParams.getVideoMimesListByPriority());
            kVar.mo25077w("enable_ad_prefetch");
            this.f7592d.mo11094e(kVar, Boolean.valueOf(aKRollParams.getEnableAdPrefetch()));
            kVar.mo25077w("auto_prefetch_on_expiry");
            this.f7592d.mo11094e(kVar, Boolean.valueOf(aKRollParams.getAutoPrefetchOnExpiry()));
            kVar.mo25077w("prefetched_ad_expiry_minutes");
            this.f7591c.mo11094e(kVar, Integer.valueOf(aKRollParams.getPrefetchedAdExpiryMinutes()));
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(34, "AKRollParams");
    }
}
