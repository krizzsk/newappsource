package com.cubic.umo.p045ad.types;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import p358af.C13437d;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKBannerParamsJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKBannerParams;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKBannerParamsJsonAdapter */
public final class AKBannerParamsJsonAdapter extends C8011k<AKBannerParams> {

    /* renamed from: a */
    public final JsonReader.C7986a f7427a = JsonReader.C7986a.m18216a("banner_playlist", "server_url", "qs_params", "connection_timeout_seconds", "request_timeout_seconds", "auto_refresh_interval_seconds", "enable_ad_prefetch", "auto_prefetch_on_expiry", "prefetched_ad_expiry_minutes");

    /* renamed from: b */
    public final C8011k<String> f7428b;

    /* renamed from: c */
    public final C8011k<Integer> f7429c;

    /* renamed from: d */
    public final C8011k<Integer> f7430d;

    /* renamed from: e */
    public final C8011k<Boolean> f7431e;

    public AKBannerParamsJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        this.f7428b = C18201b.m44910D(oVar, String.class, "bannerPlaylist");
        this.f7429c = C18201b.m44910D(oVar, Integer.TYPE, "connectionTimeoutSeconds");
        this.f7430d = C18201b.m44910D(oVar, Integer.class, "autoRefreshIntervalSeconds");
        this.f7431e = C18201b.m44910D(oVar, Boolean.TYPE, "enableAdPrefetch");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014c, code lost:
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014e, code lost:
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0150, code lost:
        r6 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0152, code lost:
        r5 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0154, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0156, code lost:
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0158, code lost:
        r9 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015a, code lost:
        r8 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015c, code lost:
        r4 = r24;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r30) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            java.lang.String r2 = "reader"
            mf0.C24362h.m61211f(r1, r2)
            r30.mo24995i()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0015:
            boolean r11 = r30.mo24999v()
            java.lang.String r12 = "prefetched_ad_expiry_minutes"
            java.lang.String r13 = "prefetchedAdExpiryMinutes"
            java.lang.String r14 = "auto_prefetch_on_expiry"
            java.lang.String r15 = "autoPrefetchOnExpiry"
            r16 = r10
            java.lang.String r10 = "enable_ad_prefetch"
            r17 = r7
            java.lang.String r7 = "enableAdPrefetch"
            r18 = r6
            java.lang.String r6 = "request_timeout_seconds"
            r19 = r5
            java.lang.String r5 = "requestTimeoutSeconds"
            r20 = r3
            java.lang.String r3 = "connection_timeout_seconds"
            r21 = r2
            java.lang.String r2 = "connectionTimeoutSeconds"
            r22 = r9
            java.lang.String r9 = "qs_params"
            r23 = r8
            java.lang.String r8 = "qsParams"
            r24 = r4
            java.lang.String r4 = "server_url"
            r25 = r4
            java.lang.String r4 = "serverUrl"
            r26 = r4
            java.lang.String r4 = "banner_playlist"
            r27 = r4
            java.lang.String r4 = "bannerPlaylist"
            if (r11 == 0) goto L_0x0160
            com.squareup.moshi.JsonReader$a r11 = r0.f7427a
            int r11 = r1.mo24989O(r11)
            switch(r11) {
                case -1: goto L_0x0146;
                case 0: goto L_0x0122;
                case 1: goto L_0x00ff;
                case 2: goto L_0x00e1;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00ab;
                case 5: goto L_0x00a0;
                case 6: goto L_0x0088;
                case 7: goto L_0x0072;
                case 8: goto L_0x005e;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x014c
        L_0x005e:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7429c
            java.lang.Object r2 = r2.mo11093a(r1)
            r7 = r2
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x006d
            r10 = r16
            goto L_0x0150
        L_0x006d:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r13, r12, r1)
            throw r1
        L_0x0072:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7431e
            java.lang.Object r2 = r2.mo11093a(r1)
            r6 = r2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0083
            r10 = r16
            r7 = r17
            goto L_0x0152
        L_0x0083:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r15, r14, r1)
            throw r1
        L_0x0088:
            com.squareup.moshi.k<java.lang.Boolean> r2 = r0.f7431e
            java.lang.Object r2 = r2.mo11093a(r1)
            r5 = r2
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x009b
            r10 = r16
            r7 = r17
            r6 = r18
            goto L_0x0154
        L_0x009b:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r7, r10, r1)
            throw r1
        L_0x00a0:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7430d
            java.lang.Object r2 = r2.mo11093a(r1)
            r10 = r2
            java.lang.Integer r10 = (java.lang.Integer) r10
            goto L_0x014e
        L_0x00ab:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7429c
            java.lang.Object r2 = r2.mo11093a(r1)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x00c0
            r10 = r16
            r7 = r17
            r6 = r18
            r5 = r19
            goto L_0x0156
        L_0x00c0:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r5, r6, r1)
            throw r1
        L_0x00c5:
            com.squareup.moshi.k<java.lang.Integer> r4 = r0.f7429c
            java.lang.Object r4 = r4.mo11093a(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L_0x00dc
            r2 = r4
            r10 = r16
            r7 = r17
            r6 = r18
            r5 = r19
            r3 = r20
            goto L_0x0158
        L_0x00dc:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r3, r1)
            throw r1
        L_0x00e1:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7428b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00fa
            r9 = r2
            r10 = r16
            r7 = r17
            r6 = r18
            r5 = r19
            r3 = r20
            r2 = r21
            goto L_0x015a
        L_0x00fa:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r8, r9, r1)
            throw r1
        L_0x00ff:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7428b
            java.lang.Object r2 = r2.mo11093a(r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0119
            r10 = r16
            r7 = r17
            r6 = r18
            r5 = r19
            r3 = r20
            r2 = r21
            r9 = r22
            goto L_0x015c
        L_0x0119:
            r11 = r25
            r2 = r26
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r11, r1)
            throw r1
        L_0x0122:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7428b
            java.lang.Object r2 = r2.mo11093a(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x013f
            r4 = r2
            r10 = r16
            r7 = r17
            r6 = r18
            r5 = r19
            r3 = r20
            r2 = r21
            r9 = r22
            r8 = r23
            goto L_0x0015
        L_0x013f:
            r2 = r27
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r4, r2, r1)
            throw r1
        L_0x0146:
            r30.mo24991S()
            r30.mo24992T()
        L_0x014c:
            r10 = r16
        L_0x014e:
            r7 = r17
        L_0x0150:
            r6 = r18
        L_0x0152:
            r5 = r19
        L_0x0154:
            r3 = r20
        L_0x0156:
            r2 = r21
        L_0x0158:
            r9 = r22
        L_0x015a:
            r8 = r23
        L_0x015c:
            r4 = r24
            goto L_0x0015
        L_0x0160:
            r11 = r25
            r0 = r26
            r28 = r27
            r30.mo24997r()
            com.cubic.umo.ad.types.AKBannerParams r25 = new com.cubic.umo.ad.types.AKBannerParams
            if (r24 == 0) goto L_0x01c1
            if (r23 == 0) goto L_0x01bc
            if (r22 == 0) goto L_0x01b7
            if (r21 == 0) goto L_0x01b2
            int r0 = r21.intValue()
            if (r20 == 0) goto L_0x01ad
            int r8 = r20.intValue()
            if (r19 == 0) goto L_0x01a8
            boolean r10 = r19.booleanValue()
            if (r18 == 0) goto L_0x01a3
            boolean r11 = r18.booleanValue()
            if (r17 == 0) goto L_0x019e
            int r12 = r17.intValue()
            r3 = r25
            r4 = r24
            r5 = r23
            r6 = r22
            r7 = r0
            r9 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r25
        L_0x019e:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r13, r12, r1)
            throw r0
        L_0x01a3:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r15, r14, r1)
            throw r0
        L_0x01a8:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r7, r10, r1)
            throw r0
        L_0x01ad:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r5, r6, r1)
            throw r0
        L_0x01b2:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r2, r3, r1)
            throw r0
        L_0x01b7:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r8, r9, r1)
            throw r0
        L_0x01bc:
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r0, r11, r1)
            throw r0
        L_0x01c1:
            r0 = r28
            com.squareup.moshi.JsonDataException r0 = ob0.C12977b.m32854g(r4, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKBannerParamsJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKBannerParams aKBannerParams = (AKBannerParams) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKBannerParams != null) {
            kVar.mo25074i();
            kVar.mo25077w("banner_playlist");
            this.f7428b.mo11094e(kVar, aKBannerParams.getBannerPlaylist());
            kVar.mo25077w("server_url");
            this.f7428b.mo11094e(kVar, aKBannerParams.getServerUrl());
            kVar.mo25077w("qs_params");
            this.f7428b.mo11094e(kVar, aKBannerParams.getQsParams());
            kVar.mo25077w("connection_timeout_seconds");
            this.f7429c.mo11094e(kVar, Integer.valueOf(aKBannerParams.getConnectionTimeoutSeconds()));
            kVar.mo25077w("request_timeout_seconds");
            this.f7429c.mo11094e(kVar, Integer.valueOf(aKBannerParams.getRequestTimeoutSeconds()));
            kVar.mo25077w("auto_refresh_interval_seconds");
            this.f7430d.mo11094e(kVar, aKBannerParams.getAutoRefreshIntervalSeconds());
            kVar.mo25077w("enable_ad_prefetch");
            this.f7431e.mo11094e(kVar, Boolean.valueOf(aKBannerParams.getEnableAdPrefetch()));
            kVar.mo25077w("auto_prefetch_on_expiry");
            this.f7431e.mo11094e(kVar, Boolean.valueOf(aKBannerParams.getAutoPrefetchOnExpiry()));
            kVar.mo25077w("prefetched_ad_expiry_minutes");
            this.f7429c.mo11094e(kVar, Integer.valueOf(aKBannerParams.getPrefetchedAdExpiryMinutes()));
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(36, "AKBannerParams");
    }
}
