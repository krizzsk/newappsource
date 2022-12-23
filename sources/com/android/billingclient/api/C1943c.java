package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzd;
import com.google.android.gms.internal.play_billing.zzp;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p054d0.C4291k0;
import p304x.C7038d0;
import p431cy.C16525b;

/* renamed from: com.android.billingclient.api.c */
public final class C1943c extends C1941b {

    /* renamed from: a */
    public volatile int f6738a;

    /* renamed from: b */
    public final String f6739b;

    /* renamed from: c */
    public final Handler f6740c;

    /* renamed from: d */
    public volatile C16525b f6741d;

    /* renamed from: e */
    public Context f6742e;

    /* renamed from: f */
    public volatile zzd f6743f;

    /* renamed from: g */
    public volatile C1962r f6744g;

    /* renamed from: h */
    public boolean f6745h;

    /* renamed from: i */
    public int f6746i;

    /* renamed from: j */
    public boolean f6747j;

    /* renamed from: k */
    public boolean f6748k;

    /* renamed from: l */
    public boolean f6749l;

    /* renamed from: m */
    public boolean f6750m;

    /* renamed from: n */
    public boolean f6751n;

    /* renamed from: o */
    public boolean f6752o;

    /* renamed from: p */
    public boolean f6753p;

    /* renamed from: q */
    public ExecutorService f6754q;

    public C1943c(boolean z, Context context, C1954j jVar) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            str = "4.0.0";
        }
        this.f6738a = 0;
        this.f6740c = new Handler(Looper.getMainLooper());
        this.f6746i = 0;
        this.f6739b = str;
        Context applicationContext = context.getApplicationContext();
        this.f6742e = applicationContext;
        this.f6741d = new C16525b(applicationContext, jVar);
        this.f6753p = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0341, code lost:
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0348, code lost:
        r1 = r19;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:107:0x02f0] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.android.billingclient.api.C1949f mo9558a(android.app.Activity r28, com.android.billingclient.api.C1947e r29) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r5 = r29
            java.lang.String r0 = "proxyPackageVersion"
            java.lang.String r9 = "BUY_INTENT"
            java.lang.String r10 = "; try to reconnect"
            boolean r1 = r27.mo9565g()
            if (r1 != 0) goto L_0x0018
            com.android.billingclient.api.f r0 = com.android.billingclient.api.C1964t.f6803k
            r7.mo9568j(r0)
            return r0
        L_0x0018:
            r29.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList<com.android.billingclient.api.SkuDetails> r2 = r5.f6763f
            r1.addAll(r2)
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            r3 = r2
            com.android.billingclient.api.SkuDetails r3 = (com.android.billingclient.api.SkuDetails) r3
            java.lang.String r4 = r3.mo9553a()
            java.lang.String r2 = "subs"
            boolean r2 = r4.equals(r2)
            java.lang.String r11 = "BillingClient"
            if (r2 == 0) goto L_0x004b
            boolean r2 = r7.f6745h
            if (r2 == 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "Current client doesn't support subscriptions."
            com.google.android.gms.internal.play_billing.zza.zzk(r11, r0)
            com.android.billingclient.api.f r0 = com.android.billingclient.api.C1964t.f6805m
            r7.mo9568j(r0)
            return r0
        L_0x004b:
            boolean r2 = r5.f6764g
            r6 = 1
            if (r2 != 0) goto L_0x0063
            java.lang.String r2 = r5.f6759b
            if (r2 != 0) goto L_0x0063
            java.lang.String r2 = r5.f6761d
            if (r2 != 0) goto L_0x0063
            int r2 = r5.f6762e
            if (r2 != 0) goto L_0x0063
            boolean r2 = r5.f6758a
            if (r2 == 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r2 = 0
            goto L_0x0064
        L_0x0063:
            r2 = 1
        L_0x0064:
            if (r2 == 0) goto L_0x0076
            boolean r2 = r7.f6747j
            if (r2 == 0) goto L_0x006b
            goto L_0x0076
        L_0x006b:
            java.lang.String r0 = "Current client doesn't support extra params for buy intent."
            com.google.android.gms.internal.play_billing.zza.zzk(r11, r0)
            com.android.billingclient.api.f r0 = com.android.billingclient.api.C1964t.f6798f
            r7.mo9568j(r0)
            return r0
        L_0x0076:
            int r2 = r1.size()
            if (r2 <= r6) goto L_0x008c
            boolean r2 = r7.f6752o
            if (r2 == 0) goto L_0x0081
            goto L_0x008c
        L_0x0081:
            java.lang.String r0 = "Current client doesn't support multi-item purchases."
            com.google.android.gms.internal.play_billing.zza.zzk(r11, r0)
            com.android.billingclient.api.f r0 = com.android.billingclient.api.C1964t.f6806n
            r7.mo9568j(r0)
            return r0
        L_0x008c:
            java.lang.String r2 = ""
            r6 = 0
            r12 = r2
        L_0x0090:
            int r13 = r1.size()
            if (r6 >= r13) goto L_0x00ce
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.Object r13 = r1.get(r6)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r14 = r12.length()
            int r15 = r13.length()
            r16 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r14 = r14 + r15
            r2.<init>(r14)
            java.lang.String r2 = p001a0.C0016g.m31o(r2, r12, r13)
            int r12 = r1.size()
            int r12 = r12 + -1
            if (r6 >= r12) goto L_0x00c8
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r12 = ", "
            java.lang.String r2 = r2.concat(r12)
        L_0x00c8:
            r12 = r2
            int r6 = r6 + 1
            r2 = r16
            goto L_0x0090
        L_0x00ce:
            r16 = r2
            java.lang.String r2 = java.lang.String.valueOf(r12)
            int r2 = r2.length()
            int r6 = r4.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r2 = r2 + 41
            int r2 = r2 + r6
            r13.<init>(r2)
            java.lang.String r2 = "Constructing buy intent for "
            java.lang.String r6 = ", item type: "
            java.lang.String r2 = p379.C13715c.m34246l(r13, r2, r12, r6, r4)
            com.google.android.gms.internal.play_billing.zza.zzj(r11, r2)
            boolean r2 = r7.f6747j
            if (r2 == 0) goto L_0x02d2
            boolean r2 = r7.f6748k
            boolean r6 = r7.f6753p
            java.lang.String r13 = r7.f6739b
            android.os.Bundle r6 = com.google.android.gms.internal.play_billing.zza.zze(r5, r2, r6, r13)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r17 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r18 = r12
            int r12 = r1.size()
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r9
            r9 = 0
        L_0x012b:
            if (r9 >= r12) goto L_0x01b8
            java.lang.Object r19 = r1.get(r9)
            r25 = r12
            r12 = r19
            com.android.billingclient.api.SkuDetails r12 = (com.android.billingclient.api.SkuDetails) r12
            org.json.JSONObject r8 = r12.f6735b
            r19 = r11
            java.lang.String r11 = "skuDetailsToken"
            java.lang.String r8 = r8.optString(r11)
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0150
            org.json.JSONObject r8 = r12.f6735b
            java.lang.String r8 = r8.optString(r11)
            r2.add(r8)
        L_0x0150:
            java.lang.String r8 = r12.f6734a
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x015e }
            r11.<init>(r8)     // Catch:{ JSONException -> 0x015e }
            java.lang.String r8 = "offer_id_token"
            java.lang.String r8 = r11.optString(r8)     // Catch:{ JSONException -> 0x015e }
            goto L_0x0161
        L_0x015e:
            r8 = r16
        L_0x0161:
            org.json.JSONObject r11 = r12.f6735b
            r26 = r4
            java.lang.String r4 = "offer_id"
            java.lang.String r4 = r11.optString(r4)
            org.json.JSONObject r11 = r12.f6735b
            java.lang.String r5 = "offer_type"
            int r5 = r11.optInt(r5)
            org.json.JSONObject r11 = r12.f6735b
            java.lang.String r12 = "serializedDocid"
            java.lang.String r11 = r11.optString(r12)
            r13.add(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            r8 = r8 ^ 1
            r20 = r20 | r8
            r14.add(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r4 = r4 ^ 1
            r21 = r21 | r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r15.add(r4)
            if (r5 == 0) goto L_0x019c
            r4 = 1
            goto L_0x019d
        L_0x019c:
            r4 = 0
        L_0x019d:
            r22 = r22 | r4
            boolean r4 = android.text.TextUtils.isEmpty(r11)
            r4 = r4 ^ 1
            r23 = r23 | r4
            r10.add(r11)
            int r9 = r9 + 1
            r8 = r28
            r5 = r29
            r11 = r19
            r12 = r25
            r4 = r26
            goto L_0x012b
        L_0x01b8:
            r26 = r4
            r19 = r11
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x01c7
            java.lang.String r4 = "skuDetailsTokens"
            r6.putStringArrayList(r4, r2)
        L_0x01c7:
            if (r20 == 0) goto L_0x01d8
            boolean r2 = r7.f6750m
            if (r2 != 0) goto L_0x01d3
            com.android.billingclient.api.f r0 = com.android.billingclient.api.C1964t.f6799g
            r7.mo9568j(r0)
            return r0
        L_0x01d3:
            java.lang.String r2 = "SKU_OFFER_ID_TOKEN_LIST"
            r6.putStringArrayList(r2, r13)
        L_0x01d8:
            if (r21 == 0) goto L_0x01df
            java.lang.String r2 = "SKU_OFFER_ID_LIST"
            r6.putStringArrayList(r2, r14)
        L_0x01df:
            if (r22 == 0) goto L_0x01e6
            java.lang.String r2 = "SKU_OFFER_TYPE_LIST"
            r6.putIntegerArrayList(r2, r15)
        L_0x01e6:
            if (r23 == 0) goto L_0x01ed
            java.lang.String r2 = "SKU_SERIALIZED_DOCID_LIST"
            r6.putStringArrayList(r2, r10)
        L_0x01ed:
            org.json.JSONObject r2 = r3.f6735b
            java.lang.String r4 = "packageName"
            java.lang.String r2 = r2.optString(r4)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0208
            org.json.JSONObject r2 = r3.f6735b
            java.lang.String r2 = r2.optString(r4)
            java.lang.String r4 = "skuPackageName"
            r6.putString(r4, r2)
            r2 = 1
            goto L_0x0209
        L_0x0208:
            r2 = 0
        L_0x0209:
            r4 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L_0x0215
            java.lang.String r5 = "accountName"
            r6.putString(r5, r4)
        L_0x0215:
            int r4 = r1.size()
            r5 = 1
            if (r4 <= r5) goto L_0x0263
            java.util.ArrayList r4 = new java.util.ArrayList
            int r8 = r1.size()
            int r8 = r8 + -1
            r4.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = r1.size()
            int r9 = r9 + -1
            r8.<init>(r9)
        L_0x0232:
            int r9 = r1.size()
            if (r5 >= r9) goto L_0x0259
            java.lang.Object r9 = r1.get(r5)
            com.android.billingclient.api.SkuDetails r9 = (com.android.billingclient.api.SkuDetails) r9
            org.json.JSONObject r9 = r9.f6735b
            java.lang.String r10 = "productId"
            java.lang.String r9 = r9.optString(r10)
            r4.add(r9)
            java.lang.Object r9 = r1.get(r5)
            com.android.billingclient.api.SkuDetails r9 = (com.android.billingclient.api.SkuDetails) r9
            java.lang.String r9 = r9.mo9553a()
            r8.add(r9)
            int r5 = r5 + 1
            goto L_0x0232
        L_0x0259:
            java.lang.String r1 = "additionalSkus"
            r6.putStringArrayList(r1, r4)
            java.lang.String r1 = "additionalSkuTypes"
            r6.putStringArrayList(r1, r8)
        L_0x0263:
            android.content.Intent r1 = r28.getIntent()
            java.lang.String r4 = "PROXY_PACKAGE"
            java.lang.String r1 = r1.getStringExtra(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0296
            android.content.Intent r1 = r28.getIntent()
            java.lang.String r1 = r1.getStringExtra(r4)
            java.lang.String r4 = "proxyPackage"
            r6.putString(r4, r1)
            android.content.Context r4 = r7.f6742e     // Catch:{ NameNotFoundException -> 0x0291 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0291 }
            r5 = 0
            android.content.pm.PackageInfo r1 = r4.getPackageInfo(r1, r5)     // Catch:{ NameNotFoundException -> 0x0291 }
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x0291 }
            r6.putString(r0, r1)     // Catch:{ NameNotFoundException -> 0x0291 }
            goto L_0x0296
        L_0x0291:
            java.lang.String r1 = "package not found"
            r6.putString(r0, r1)
        L_0x0296:
            boolean r0 = r7.f6751n
            if (r0 == 0) goto L_0x02a3
            if (r2 == 0) goto L_0x02a3
            r0 = 15
            r5 = r29
            r2 = 15
            goto L_0x02b9
        L_0x02a3:
            boolean r0 = r7.f6748k
            if (r0 == 0) goto L_0x02ae
            r0 = 9
            r5 = r29
            r2 = 9
            goto L_0x02b9
        L_0x02ae:
            r5 = r29
            boolean r0 = r5.f6764g
            if (r0 == 0) goto L_0x02b7
            r0 = 7
            r2 = 7
            goto L_0x02b9
        L_0x02b7:
            r0 = 6
            r2 = 6
        L_0x02b9:
            com.android.billingclient.api.e0 r8 = new com.android.billingclient.api.e0
            r0 = r8
            r1 = r27
            r4 = r26
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 0
            android.os.Handler r5 = r7.f6740c
            r0 = r27
            r1 = r8
            java.util.concurrent.Future r0 = r0.mo9570l(r1, r2, r4, r5)
            goto L_0x02ee
        L_0x02d2:
            r26 = r4
            r24 = r9
            r17 = r10
            r19 = r11
            r18 = r12
            com.android.billingclient.api.x r1 = new com.android.billingclient.api.x
            r0 = r26
            r1.<init>(r7, r3, r0)
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 0
            android.os.Handler r5 = r7.f6740c
            r0 = r27
            java.util.concurrent.Future r0 = r0.mo9570l(r1, r2, r4, r5)
        L_0x02ee:
            r1 = 5000(0x1388, double:2.4703E-320)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ CancellationException | TimeoutException -> 0x0375, Exception -> 0x0348 }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ CancellationException | TimeoutException -> 0x0341, Exception -> 0x0348 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ CancellationException | TimeoutException -> 0x0341, Exception -> 0x0348 }
            r1 = r19
            int r2 = com.google.android.gms.internal.play_billing.zza.zza(r0, r1)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            java.lang.String r3 = com.google.android.gms.internal.play_billing.zza.zzh(r0, r1)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            if (r2 == 0) goto L_0x0327
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            r4 = 52
            r0.<init>(r4)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            java.lang.String r4 = "Unable to buy item, Error response code: "
            r0.append(r4)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            r0.append(r2)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            com.google.android.gms.internal.play_billing.zza.zzk(r1, r0)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            com.android.billingclient.api.f r0 = new com.android.billingclient.api.f     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            r0.<init>()     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            r0.f6770a = r2     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            r0.f6771b = r3     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            r7.mo9568j(r0)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            return r0
        L_0x0327:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r3 = com.android.billingclient.api.ProxyBillingActivity.class
            r4 = r28
            r2.<init>(r4, r3)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            r3 = r24
            android.os.Parcelable r0 = r0.getParcelable(r3)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            r2.putExtra(r3, r0)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            r4.startActivity(r2)     // Catch:{ CancellationException | TimeoutException -> 0x0343, Exception -> 0x034a }
            com.android.billingclient.api.f r0 = com.android.billingclient.api.C1964t.f6802j
            return r0
        L_0x0341:
            r1 = r19
        L_0x0343:
            r0 = r17
            r12 = r18
            goto L_0x037b
        L_0x0348:
            r1 = r19
        L_0x034a:
            java.lang.String r0 = java.lang.String.valueOf(r18)
            int r0 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r0 = r0 + 69
            r2.<init>(r0)
            java.lang.String r0 = "Exception while launching billing flow: ; for sku: "
            r2.append(r0)
            r12 = r18
            r2.append(r12)
            r0 = r17
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.play_billing.zza.zzk(r1, r0)
            com.android.billingclient.api.f r0 = com.android.billingclient.api.C1964t.f6803k
            r7.mo9568j(r0)
            return r0
        L_0x0375:
            r0 = r17
            r12 = r18
            r1 = r19
        L_0x037b:
            java.lang.String r2 = java.lang.String.valueOf(r12)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 68
            r3.<init>(r2)
            java.lang.String r2 = "Time out while launching billing flow: ; for sku: "
            r3.append(r2)
            r3.append(r12)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.play_billing.zza.zzk(r1, r0)
            com.android.billingclient.api.f r0 = com.android.billingclient.api.C1964t.f6804l
            r7.mo9568j(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1943c.mo9558a(android.app.Activity, com.android.billingclient.api.e):com.android.billingclient.api.f");
    }

    /* renamed from: b */
    public final void mo9559b(C7038d0 d0Var) {
        if (!mo9565g()) {
            d0Var.mo23298c(C1964t.f6803k, (List) null);
            return;
        }
        if (mo9570l(new C1958n(this, d0Var), 30000, new C1940a0(d0Var), mo9567i()) == null) {
            d0Var.mo23298c(mo9569k(), (List) null);
        }
    }

    /* renamed from: c */
    public final void mo9560c(C1953i iVar) {
        if (!mo9565g()) {
            iVar.mo9575c(C1964t.f6803k, zzp.zzg());
        } else if (TextUtils.isEmpty("subs")) {
            zza.zzk("BillingClient", "Please provide a valid SKU type.");
            iVar.mo9575c(C1964t.f6797e, zzp.zzg());
        } else {
            if (mo9570l(new C1957m(this, iVar), 30000, new C1942b0(iVar), mo9567i()) == null) {
                iVar.mo9575c(mo9569k(), zzp.zzg());
            }
        }
    }

    /* renamed from: d */
    public final void mo9561d(C1955k kVar, C4291k0 k0Var) {
        if (!mo9565g()) {
            k0Var.mo19813h(C1964t.f6803k, (ArrayList) null);
            return;
        }
        String str = kVar.f6774a;
        List<String> list = kVar.f6775b;
        if (TextUtils.isEmpty(str)) {
            zza.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            k0Var.mo19813h(C1964t.f6797e, (ArrayList) null);
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (!TextUtils.isEmpty(next)) {
                    arrayList.add(new C1966v(next));
                } else {
                    throw new IllegalArgumentException("SKU must be set.");
                }
            }
            if (mo9570l(new C1969y(this, str, arrayList, k0Var), 30000, new C1944c0(k0Var), mo9567i()) == null) {
                k0Var.mo19813h(mo9569k(), (ArrayList) null);
            }
        } else {
            zza.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            k0Var.mo19813h(C1964t.f6796d, (ArrayList) null);
        }
    }

    /* renamed from: e */
    public final void mo9563e() {
        try {
            this.f6741d.mo49315b();
            if (this.f6744g != null) {
                C1962r rVar = this.f6744g;
                synchronized (rVar.f6787b) {
                    rVar.f6789d = null;
                    rVar.f6788c = true;
                }
            }
            if (!(this.f6744g == null || this.f6743f == null)) {
                zza.zzj("BillingClient", "Unbinding from service.");
                this.f6742e.unbindService(this.f6744g);
                this.f6744g = null;
            }
            this.f6743f = null;
            ExecutorService executorService = this.f6754q;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f6754q = null;
            }
            this.f6738a = 3;
        } catch (Exception e) {
            try {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("There was an exception while ending connection: ");
                sb.append(valueOf);
                zza.zzk("BillingClient", sb.toString());
            } finally {
                this.f6738a = 3;
            }
        }
    }

    /* renamed from: f */
    public final C1949f mo9564f() {
        if (!mo9565g()) {
            return C1964t.f6803k;
        }
        if (this.f6745h) {
            return C1964t.f6802j;
        }
        return C1964t.f6799g;
    }

    /* renamed from: g */
    public final boolean mo9565g() {
        return (this.f6738a != 2 || this.f6743f == null || this.f6744g == null) ? false : true;
    }

    /* renamed from: h */
    public final void mo9566h(MoovitSubscriptionsManager.C15358a aVar) {
        ServiceInfo serviceInfo;
        if (mo9565g()) {
            zza.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            int i = C1964t.f6802j.f6770a;
            MoovitSubscriptionsManager.this.f39762d.open();
        } else if (this.f6738a == 1) {
            zza.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            int i2 = C1964t.f6795c.f6770a;
            MoovitSubscriptionsManager.this.f39762d.open();
        } else if (this.f6738a == 3) {
            zza.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            int i3 = C1964t.f6803k.f6770a;
            MoovitSubscriptionsManager.this.f39762d.open();
        } else {
            this.f6738a = 1;
            C16525b bVar = this.f6741d;
            C1967w wVar = (C1967w) bVar.f43144b;
            Context context = (Context) bVar.f43143a;
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
            if (!wVar.f6809b) {
                context.registerReceiver((C1967w) wVar.f6810c.f43144b, intentFilter);
                wVar.f6809b = true;
            }
            zza.zzj("BillingClient", "Starting in-app billing setup.");
            this.f6744g = new C1962r(this, aVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f6742e.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null)) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    zza.zzk("BillingClient", "The device doesn't have valid Play Store.");
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f6739b);
                    if (this.f6742e.bindService(intent2, this.f6744g, 1)) {
                        zza.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    zza.zzk("BillingClient", "Connection to Billing service is blocked.");
                }
            }
            this.f6738a = 0;
            zza.zzj("BillingClient", "Billing service unavailable on device.");
            int i4 = C1964t.f6794b.f6770a;
            MoovitSubscriptionsManager.this.f39762d.open();
        }
    }

    /* renamed from: i */
    public final Handler mo9567i() {
        return Looper.myLooper() == null ? this.f6740c : new Handler(Looper.myLooper());
    }

    /* renamed from: j */
    public final void mo9568j(C1949f fVar) {
        if (!Thread.interrupted()) {
            this.f6740c.post(new C1970z(this, fVar));
        }
    }

    /* renamed from: k */
    public final C1949f mo9569k() {
        if (this.f6738a == 0 || this.f6738a == 3) {
            return C1964t.f6803k;
        }
        return C1964t.f6801i;
    }

    /* renamed from: l */
    public final <T> Future<T> mo9570l(Callable<T> callable, long j, Runnable runnable, Handler handler) {
        long j2 = (long) (((double) j) * 0.95d);
        if (this.f6754q == null) {
            this.f6754q = Executors.newFixedThreadPool(zza.zza, new C1959o());
        }
        try {
            Future<T> submit = this.f6754q.submit(callable);
            handler.postDelayed(new C1946d0(submit, runnable), j2);
            return submit;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 28);
            sb.append("Async task throws exception ");
            sb.append(valueOf);
            zza.zzk("BillingClient", sb.toString());
            return null;
        }
    }
}
