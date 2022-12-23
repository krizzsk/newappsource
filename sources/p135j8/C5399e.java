package p135j8;

import android.os.Bundle;
import com.facebook.appevents.C2351p;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import java.math.BigDecimal;
import java.util.Currency;
import p009a8.C0098d0;
import p009a8.C0115o;

/* renamed from: j8.e */
public final class C5399e {

    /* renamed from: a */
    public static final C5399e f17732a = new C5399e();

    /* renamed from: b */
    public static final C2351p f17733b = new C2351p(C0115o.m210a());

    /* renamed from: j8.e$a */
    public static final class C5400a {

        /* renamed from: a */
        public BigDecimal f17734a;

        /* renamed from: b */
        public Currency f17735b;

        /* renamed from: c */
        public Bundle f17736c;

        public C5400a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f17734a = bigDecimal;
            this.f17735b = currency;
            this.f17736c = bundle;
        }
    }

    /* renamed from: a */
    public static final boolean m13503a() {
        C2429s b = FetchedAppSettingsManager.m6261b(C0115o.m211b());
        if (b == null || !C0098d0.m169b() || !b.f8714g) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014b, code lost:
        if (r11 != false) goto L_0x0155;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ad  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13504b(java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            java.lang.String r0 = "freeTrialPeriod"
            java.lang.String r1 = "skuDetails"
            mf0.C24362h.m61211f(r12, r1)
            boolean r1 = m13503a()
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            j8.e r1 = f17732a
            r1.getClass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "introductoryPriceCycles"
            r3 = 1
            r4 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0112 }
            r5.<init>(r11)     // Catch:{ JSONException -> 0x0112 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0112 }
            r11.<init>(r12)     // Catch:{ JSONException -> 0x0112 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ JSONException -> 0x0112 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r7 = "fb_iap_product_id"
            java.lang.String r8 = "productId"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r7, r8)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r7 = "fb_iap_purchase_time"
            java.lang.String r8 = "purchaseTime"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r7, r8)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r7 = "fb_iap_purchase_token"
            java.lang.String r8 = "purchaseToken"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r7, r8)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r7 = "fb_iap_package_name"
            java.lang.String r8 = "packageName"
            java.lang.String r8 = r5.optString(r8)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r7, r8)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r7 = "fb_iap_product_title"
            java.lang.String r8 = "title"
            java.lang.String r8 = r11.optString(r8)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r7, r8)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r7 = "fb_iap_product_description"
            java.lang.String r8 = "description"
            java.lang.String r8 = r11.optString(r8)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r7, r8)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r7 = "type"
            java.lang.String r7 = r11.optString(r7)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r8 = "fb_iap_product_type"
            r6.putCharSequence(r8, r7)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r8 = "subs"
            boolean r7 = mf0.C24362h.m61206a(r7, r8)     // Catch:{ JSONException -> 0x0112 }
            if (r7 == 0) goto L_0x00c7
            java.lang.String r7 = "fb_iap_subs_auto_renewing"
            java.lang.String r8 = "autoRenewing"
            boolean r5 = r5.optBoolean(r8, r4)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r7, r5)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r5 = "fb_iap_subs_period"
            java.lang.String r7 = "subscriptionPeriod"
            java.lang.String r7 = r11.optString(r7)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r5, r7)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r5 = "fb_free_trial_period"
            java.lang.String r7 = r11.optString(r0)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r5, r7)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r5 = r11.optString(r2)     // Catch:{ JSONException -> 0x0112 }
            mf0.C24362h.m61210e(r5, r2)     // Catch:{ JSONException -> 0x0112 }
            int r2 = r5.length()     // Catch:{ JSONException -> 0x0112 }
            if (r2 != 0) goto L_0x00b4
            r2 = 1
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            if (r2 != 0) goto L_0x00c7
            java.lang.String r2 = "fb_intro_price_amount_micros"
            java.lang.String r7 = "introductoryPriceAmountMicros"
            java.lang.String r7 = r11.optString(r7)     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r2, r7)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r2 = "fb_intro_price_cycles"
            r6.putCharSequence(r2, r5)     // Catch:{ JSONException -> 0x0112 }
        L_0x00c7:
            java.util.Set r1 = r1.entrySet()     // Catch:{ JSONException -> 0x0112 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ JSONException -> 0x0112 }
        L_0x00cf:
            boolean r2 = r1.hasNext()     // Catch:{ JSONException -> 0x0112 }
            if (r2 == 0) goto L_0x00eb
            java.lang.Object r2 = r1.next()     // Catch:{ JSONException -> 0x0112 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ JSONException -> 0x0112 }
            java.lang.Object r5 = r2.getKey()     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ JSONException -> 0x0112 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x0112 }
            r6.putCharSequence(r5, r2)     // Catch:{ JSONException -> 0x0112 }
            goto L_0x00cf
        L_0x00eb:
            j8.e$a r1 = new j8.e$a     // Catch:{ JSONException -> 0x0112 }
            java.math.BigDecimal r2 = new java.math.BigDecimal     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r5 = "price_amount_micros"
            long r7 = r11.getLong(r5)     // Catch:{ JSONException -> 0x0112 }
            double r7 = (double) r7     // Catch:{ JSONException -> 0x0112 }
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r7 = r7 / r9
            r2.<init>(r7)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r5 = "price_currency_code"
            java.lang.String r11 = r11.getString(r5)     // Catch:{ JSONException -> 0x0112 }
            java.util.Currency r11 = java.util.Currency.getInstance(r11)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r5 = "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))"
            mf0.C24362h.m61210e(r11, r5)     // Catch:{ JSONException -> 0x0112 }
            r1.<init>(r2, r11, r6)     // Catch:{ JSONException -> 0x0112 }
            goto L_0x0113
        L_0x0112:
            r1 = 0
        L_0x0113:
            if (r1 != 0) goto L_0x0116
            return
        L_0x0116:
            if (r13 == 0) goto L_0x0128
            com.facebook.internal.r r11 = com.facebook.internal.C2427r.f8702a
            java.lang.String r11 = p009a8.C0115o.m211b()
            java.lang.String r13 = "app_events_if_auto_log_subs"
            boolean r11 = com.facebook.internal.C2427r.m6380b(r13, r11, r4)
            if (r11 == 0) goto L_0x0128
            r11 = 1
            goto L_0x0129
        L_0x0128:
            r11 = 0
        L_0x0129:
            if (r11 == 0) goto L_0x01ad
            h8.f r11 = p110h8.C5147f.f17185a
            r11.getClass()
            boolean r13 = p262t8.C6606a.m15601b(r11)
            if (r13 == 0) goto L_0x0137
            goto L_0x0156
        L_0x0137:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0153, all -> 0x014e }
            r13.<init>(r12)     // Catch:{ JSONException -> 0x0153, all -> 0x014e }
            java.lang.String r12 = r13.optString(r0)     // Catch:{ JSONException -> 0x0153, all -> 0x014e }
            if (r12 == 0) goto L_0x0154
            int r11 = r12.length()     // Catch:{ JSONException -> 0x0153, all -> 0x014e }
            if (r11 <= 0) goto L_0x014a
            r11 = 1
            goto L_0x014b
        L_0x014a:
            r11 = 0
        L_0x014b:
            if (r11 == 0) goto L_0x0154
            goto L_0x0155
        L_0x014e:
            r12 = move-exception
            p262t8.C6606a.m15600a(r11, r12)
            goto L_0x0156
        L_0x0153:
        L_0x0154:
            r3 = 0
        L_0x0155:
            r4 = r3
        L_0x0156:
            if (r4 == 0) goto L_0x015b
            java.lang.String r11 = "StartTrial"
            goto L_0x015d
        L_0x015b:
            java.lang.String r11 = "Subscribe"
        L_0x015d:
            r3 = r11
            com.facebook.appevents.p r11 = f17733b
            java.math.BigDecimal r12 = r1.f17734a
            java.util.Currency r13 = r1.f17735b
            android.os.Bundle r0 = r1.f17736c
            r11.getClass()
            a8.o r1 = p009a8.C0115o.f331a
            boolean r1 = p009a8.C0098d0.m169b()
            if (r1 == 0) goto L_0x01d4
            com.facebook.appevents.j r11 = r11.f8567a
            r11.getClass()
            boolean r1 = p262t8.C6606a.m15601b(r11)
            if (r1 == 0) goto L_0x017d
            goto L_0x01d4
        L_0x017d:
            if (r12 == 0) goto L_0x01a5
            if (r13 != 0) goto L_0x0182
            goto L_0x01a5
        L_0x0182:
            if (r0 != 0) goto L_0x0189
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x01a8 }
            r0.<init>()     // Catch:{ all -> 0x01a8 }
        L_0x0189:
            r5 = r0
            java.lang.String r0 = "fb_currency"
            java.lang.String r13 = r13.getCurrencyCode()     // Catch:{ all -> 0x01a8 }
            r5.putString(r0, r13)     // Catch:{ all -> 0x01a8 }
            double r12 = r12.doubleValue()     // Catch:{ all -> 0x01a8 }
            java.lang.Double r4 = java.lang.Double.valueOf(r12)     // Catch:{ all -> 0x01a8 }
            r6 = 1
            java.util.UUID r7 = p135j8.C5396c.m13498a()     // Catch:{ all -> 0x01a8 }
            r2 = r11
            r2.mo12485e(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01a8 }
            goto L_0x01d4
        L_0x01a5:
            com.facebook.internal.f0 r11 = com.facebook.internal.C2397f0.f8630a     // Catch:{ all -> 0x01a8 }
            goto L_0x01d4
        L_0x01a8:
            r12 = move-exception
            p262t8.C6606a.m15600a(r11, r12)
            goto L_0x01d4
        L_0x01ad:
            com.facebook.appevents.p r11 = f17733b
            java.math.BigDecimal r12 = r1.f17734a
            java.util.Currency r13 = r1.f17735b
            android.os.Bundle r0 = r1.f17736c
            r11.getClass()
            a8.o r1 = p009a8.C0115o.f331a
            boolean r1 = p009a8.C0098d0.m169b()
            if (r1 == 0) goto L_0x01d4
            com.facebook.appevents.j r11 = r11.f8567a
            r11.getClass()
            boolean r1 = p262t8.C6606a.m15601b(r11)
            if (r1 == 0) goto L_0x01cc
            goto L_0x01d4
        L_0x01cc:
            r11.mo12487g(r12, r13, r0, r3)     // Catch:{ all -> 0x01d0 }
            goto L_0x01d4
        L_0x01d0:
            r12 = move-exception
            p262t8.C6606a.m15600a(r11, r12)
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j8.C5399e.m13504b(java.lang.String, java.lang.String, boolean):void");
    }
}
