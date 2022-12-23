package com.cubic.umo.p045ad.types;

import com.appboy.models.outgoing.AttributionData;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12947k;
import p358af.C13437d;
import p583jk.C17875h;
import p626lf.C18201b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/ad/types/AKBannerResponseJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/ad/types/AKBannerResponse;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "ads_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
/* renamed from: com.cubic.umo.ad.types.AKBannerResponseJsonAdapter */
public final class AKBannerResponseJsonAdapter extends C8011k<AKBannerResponse> {

    /* renamed from: a */
    public final JsonReader.C7986a f7442a = JsonReader.C7986a.m18216a("banner_id", "trackers", "banner_type", "creative_width", "creative_height", "ad_expiry_time_minutes", "click_through", AttributionData.CREATIVE_KEY, "ad_vendor");

    /* renamed from: b */
    public final C8011k<String> f7443b;

    /* renamed from: c */
    public final C8011k<AKTrackers> f7444c;

    /* renamed from: d */
    public final C8011k<Float> f7445d;

    /* renamed from: e */
    public final C8011k<Integer> f7446e;

    /* renamed from: f */
    public final C8011k<String> f7447f;

    /* renamed from: g */
    public volatile Constructor<AKBannerResponse> f7448g;

    public AKBannerResponseJsonAdapter(C8017o oVar) {
        Class<String> cls = String.class;
        C24362h.m61211f(oVar, "moshi");
        this.f7443b = C18201b.m44910D(oVar, cls, "bannerSpotId");
        this.f7444c = C18201b.m44910D(oVar, AKTrackers.class, "trackers");
        this.f7445d = C18201b.m44910D(oVar, Float.class, "creativeWidth");
        this.f7446e = C18201b.m44910D(oVar, Integer.TYPE, "adExpiryTimeMinutes");
        this.f7447f = C18201b.m44910D(oVar, cls, "clickThrough");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f4, code lost:
        r2 = r16;
        r3 = r17;
        r15 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fa, code lost:
        r13 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fc, code lost:
        r11 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fe, code lost:
        r10 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0100, code lost:
        r8 = r22;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11093a(com.squareup.moshi.JsonReader r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "reader"
            mf0.C24362h.m61211f(r1, r4)
            r35.mo24995i()
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x001a:
            boolean r12 = r35.mo24999v()
            java.lang.String r4 = "ad"
            r16 = r2
            java.lang.String r2 = "adData"
            r17 = r3
            java.lang.String r3 = "ad_expiry_time_minutes"
            r18 = r15
            java.lang.String r15 = "adExpiryTimeMinutes"
            r19 = r13
            java.lang.String r13 = "banner_type"
            r20 = r11
            java.lang.String r11 = "bannerType"
            r21 = r10
            java.lang.String r10 = "banner_id"
            r22 = r8
            java.lang.String r8 = "bannerSpotId"
            if (r12 == 0) goto L_0x0104
            com.squareup.moshi.JsonReader$a r12 = r0.f7442a
            int r12 = r1.mo24989O(r12)
            switch(r12) {
                case -1: goto L_0x00ee;
                case 0: goto L_0x00dd;
                case 1: goto L_0x00c6;
                case 2: goto L_0x00b5;
                case 3: goto L_0x00a1;
                case 4: goto L_0x008f;
                case 5: goto L_0x007d;
                case 6: goto L_0x006c;
                case 7: goto L_0x005a;
                case 8: goto L_0x0049;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x00f4
        L_0x0049:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7447f
            java.lang.Object r2 = r2.mo11093a(r1)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            r5 = r5 & -257(0xfffffffffffffeff, float:NaN)
            r2 = r16
            r3 = r17
            goto L_0x00fa
        L_0x005a:
            com.squareup.moshi.k<java.lang.String> r3 = r0.f7443b
            java.lang.Object r3 = r3.mo11093a(r1)
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x0067
            goto L_0x00f4
        L_0x0067:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r2, r4, r1)
            throw r1
        L_0x006c:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7447f
            java.lang.Object r2 = r2.mo11093a(r1)
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            r2 = r16
            r3 = r17
            r15 = r18
            goto L_0x00fc
        L_0x007d:
            com.squareup.moshi.k<java.lang.Integer> r2 = r0.f7446e
            java.lang.Object r2 = r2.mo11093a(r1)
            r6 = r2
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x008a
            goto L_0x00f4
        L_0x008a:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r15, r3, r1)
            throw r1
        L_0x008f:
            com.squareup.moshi.k<java.lang.Float> r2 = r0.f7445d
            java.lang.Object r2 = r2.mo11093a(r1)
            r11 = r2
            java.lang.Float r11 = (java.lang.Float) r11
            r2 = r16
            r3 = r17
            r15 = r18
            r13 = r19
            goto L_0x00fe
        L_0x00a1:
            com.squareup.moshi.k<java.lang.Float> r2 = r0.f7445d
            java.lang.Object r2 = r2.mo11093a(r1)
            r10 = r2
            java.lang.Float r10 = (java.lang.Float) r10
            r2 = r16
            r3 = r17
            r15 = r18
            r13 = r19
            r11 = r20
            goto L_0x0100
        L_0x00b5:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7443b
            java.lang.Object r2 = r2.mo11093a(r1)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x00c1
            goto L_0x00f4
        L_0x00c1:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r11, r13, r1)
            throw r1
        L_0x00c6:
            com.squareup.moshi.k<com.cubic.umo.ad.types.AKTrackers> r2 = r0.f7444c
            java.lang.Object r2 = r2.mo11093a(r1)
            r8 = r2
            com.cubic.umo.ad.types.AKTrackers r8 = (com.cubic.umo.p045ad.types.AKTrackers) r8
            r2 = r16
            r3 = r17
            r15 = r18
            r13 = r19
            r11 = r20
            r10 = r21
            goto L_0x001a
        L_0x00dd:
            com.squareup.moshi.k<java.lang.String> r2 = r0.f7443b
            java.lang.Object r2 = r2.mo11093a(r1)
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x00e9
            goto L_0x00f4
        L_0x00e9:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32860m(r8, r10, r1)
            throw r1
        L_0x00ee:
            r35.mo24991S()
            r35.mo24992T()
        L_0x00f4:
            r2 = r16
            r3 = r17
            r15 = r18
        L_0x00fa:
            r13 = r19
        L_0x00fc:
            r11 = r20
        L_0x00fe:
            r10 = r21
        L_0x0100:
            r8 = r22
            goto L_0x001a
        L_0x0104:
            r35.mo24997r()
            r12 = -257(0xfffffffffffffeff, float:NaN)
            if (r5 != r12) goto L_0x013d
            com.cubic.umo.ad.types.AKBannerResponse r5 = new com.cubic.umo.ad.types.AKBannerResponse
            if (r7 == 0) goto L_0x0138
            if (r9 == 0) goto L_0x0133
            if (r6 == 0) goto L_0x012e
            int r12 = r6.intValue()
            if (r14 == 0) goto L_0x0129
            r6 = r5
            r8 = r22
            r10 = r21
            r11 = r20
            r13 = r19
            r15 = r18
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01c5
        L_0x0129:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r4, r1)
            throw r1
        L_0x012e:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r3, r1)
            throw r1
        L_0x0133:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r13, r1)
            throw r1
        L_0x0138:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r8, r10, r1)
            throw r1
        L_0x013d:
            java.lang.reflect.Constructor<com.cubic.umo.ad.types.AKBannerResponse> r12 = r0.f7448g
            r23 = 8
            r24 = 7
            r25 = 6
            r26 = 5
            r27 = 4
            r28 = 3
            r29 = 2
            r30 = 1
            r31 = 0
            r32 = r8
            r8 = 11
            if (r12 != 0) goto L_0x0188
            java.lang.Class[] r12 = new java.lang.Class[r8]
            r12[r31] = r17
            java.lang.Class<com.cubic.umo.ad.types.AKTrackers> r33 = com.cubic.umo.p045ad.types.AKTrackers.class
            r12[r30] = r33
            r12[r29] = r17
            r12[r28] = r16
            r12[r27] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r12[r26] = r16
            r12[r25] = r17
            r12[r24] = r17
            r12[r23] = r17
            r17 = 9
            r12[r17] = r16
            java.lang.Class<?> r16 = ob0.C12977b.f32133c
            r17 = 10
            r12[r17] = r16
            java.lang.Class<com.cubic.umo.ad.types.AKBannerResponse> r8 = com.cubic.umo.p045ad.types.AKBannerResponse.class
            java.lang.reflect.Constructor r12 = r8.getDeclaredConstructor(r12)
            r0.f7448g = r12
            java.lang.String r8 = "AKBannerResponse::class.…his.constructorRef = it }"
            mf0.C24362h.m61210e(r12, r8)
            r8 = 11
        L_0x0188:
            java.lang.Object[] r8 = new java.lang.Object[r8]
            if (r7 == 0) goto L_0x01d5
            r8[r31] = r7
            r8[r30] = r22
            if (r9 == 0) goto L_0x01d0
            r8[r29] = r9
            r8[r28] = r21
            r8[r27] = r20
            if (r6 == 0) goto L_0x01cb
            int r3 = r6.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8[r26] = r3
            r8[r25] = r19
            if (r14 == 0) goto L_0x01c6
            r8[r24] = r14
            r8[r23] = r18
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2 = 9
            r8[r2] = r1
            r1 = 10
            r2 = 0
            r8[r1] = r2
            java.lang.Object r1 = r12.newInstance(r8)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            mf0.C24362h.m61210e(r1, r2)
            r5 = r1
            com.cubic.umo.ad.types.AKBannerResponse r5 = (com.cubic.umo.p045ad.types.AKBannerResponse) r5
        L_0x01c5:
            return r5
        L_0x01c6:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r4, r1)
            throw r1
        L_0x01cb:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r15, r3, r1)
            throw r1
        L_0x01d0:
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r11, r13, r1)
            throw r1
        L_0x01d5:
            r2 = r32
            com.squareup.moshi.JsonDataException r1 = ob0.C12977b.m32854g(r2, r10, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.p045ad.types.AKBannerResponseJsonAdapter.mo11093a(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AKBannerResponse aKBannerResponse = (AKBannerResponse) obj;
        C24362h.m61211f(kVar, "writer");
        if (aKBannerResponse != null) {
            kVar.mo25074i();
            kVar.mo25077w("banner_id");
            this.f7443b.mo11094e(kVar, aKBannerResponse.f7432b);
            kVar.mo25077w("trackers");
            this.f7444c.mo11094e(kVar, aKBannerResponse.f7433c);
            kVar.mo25077w("banner_type");
            this.f7443b.mo11094e(kVar, aKBannerResponse.f7434d);
            kVar.mo25077w("creative_width");
            this.f7445d.mo11094e(kVar, aKBannerResponse.f7435e);
            kVar.mo25077w("creative_height");
            this.f7445d.mo11094e(kVar, aKBannerResponse.f7436f);
            kVar.mo25077w("ad_expiry_time_minutes");
            C17875h.m44296W(aKBannerResponse.f7437g, this.f7446e, kVar, "click_through");
            this.f7447f.mo11094e(kVar, aKBannerResponse.f7438h);
            kVar.mo25077w(AttributionData.CREATIVE_KEY);
            this.f7443b.mo11094e(kVar, aKBannerResponse.f7439i);
            kVar.mo25077w("ad_vendor");
            this.f7447f.mo11094e(kVar, aKBannerResponse.f7440j);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return C13437d.m33703h(38, "AKBannerResponse");
    }
}
