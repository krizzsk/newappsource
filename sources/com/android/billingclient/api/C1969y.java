package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p054d0.C4291k0;

/* renamed from: com.android.billingclient.api.y */
public final /* synthetic */ class C1969y implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C1943c f6814b;

    /* renamed from: c */
    public final /* synthetic */ String f6815c;

    /* renamed from: d */
    public final /* synthetic */ List f6816d;

    /* renamed from: e */
    public final /* synthetic */ C1956l f6817e;

    public /* synthetic */ C1969y(C1943c cVar, String str, ArrayList arrayList, C4291k0 k0Var) {
        this.f6814b = cVar;
        this.f6815c = str;
        this.f6816d = arrayList;
        this.f6817e = k0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        r0 = "Item is unavailable for purchase.";
        r14 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r16 = this;
            r1 = r16
            com.android.billingclient.api.c r0 = r1.f6814b
            java.lang.String r8 = r1.f6815c
            java.util.List r9 = r1.f6816d
            com.android.billingclient.api.l r10 = r1.f6817e
            r0.getClass()
            java.lang.String r11 = "BillingClient"
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            int r13 = r9.size()
            r2 = 0
        L_0x0019:
            if (r2 >= r13) goto L_0x013a
            int r7 = r2 + 20
            if (r7 <= r13) goto L_0x0021
            r3 = r13
            goto L_0x0022
        L_0x0021:
            r3 = r7
        L_0x0022:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r2 = r9.subList(r2, r3)
            r4.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r4.size()
            r5 = 0
        L_0x0035:
            if (r5 >= r3) goto L_0x0045
            java.lang.Object r6 = r4.get(r5)
            com.android.billingclient.api.v r6 = (com.android.billingclient.api.C1966v) r6
            java.lang.String r6 = r6.f6807a
            r2.add(r6)
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0045:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r3 = "ITEM_ID_LIST"
            r6.putStringArrayList(r3, r2)
            java.lang.String r2 = r0.f6739b
            java.lang.String r3 = "playBillingLibraryVersion"
            r6.putString(r3, r2)
            boolean r2 = r0.f6749l     // Catch:{ Exception -> 0x0114 }
            if (r2 == 0) goto L_0x0078
            com.google.android.gms.internal.play_billing.zzd r2 = r0.f6743f     // Catch:{ Exception -> 0x0114 }
            android.content.Context r3 = r0.f6742e     // Catch:{ Exception -> 0x0114 }
            java.lang.String r5 = r3.getPackageName()     // Catch:{ Exception -> 0x0114 }
            int r3 = r0.f6746i     // Catch:{ Exception -> 0x0114 }
            boolean r14 = r0.f6753p     // Catch:{ Exception -> 0x0114 }
            java.lang.String r15 = r0.f6739b     // Catch:{ Exception -> 0x0114 }
            r1 = 0
            android.os.Bundle r14 = com.google.android.gms.internal.play_billing.zza.zzd(r3, r14, r15, r1, r4)     // Catch:{ Exception -> 0x0114 }
            r3 = 10
            r4 = r5
            r5 = r8
            r1 = r7
            r7 = r14
            android.os.Bundle r2 = r2.zzl(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0086
        L_0x0078:
            r1 = r7
            com.google.android.gms.internal.play_billing.zzd r2 = r0.f6743f     // Catch:{ Exception -> 0x0114 }
            r3 = 3
            android.content.Context r4 = r0.f6742e     // Catch:{ Exception -> 0x0114 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ Exception -> 0x0114 }
            android.os.Bundle r2 = r2.zzk(r3, r4, r8, r6)     // Catch:{ Exception -> 0x0114 }
        L_0x0086:
            if (r2 != 0) goto L_0x008e
            java.lang.String r0 = "querySkuDetailsAsync got null sku details list"
            com.google.android.gms.internal.play_billing.zza.zzk(r11, r0)
            goto L_0x00c9
        L_0x008e:
            java.lang.String r3 = "DETAILS_LIST"
            boolean r4 = r2.containsKey(r3)
            if (r4 != 0) goto L_0x00be
            int r14 = com.google.android.gms.internal.play_billing.zza.zza(r2, r11)
            java.lang.String r0 = com.google.android.gms.internal.play_billing.zza.zzh(r2, r11)
            if (r14 == 0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 50
            r1.<init>(r2)
            java.lang.String r2 = "getSkuDetails() failed. Response code: "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.play_billing.zza.zzk(r11, r1)
            goto L_0x013d
        L_0x00b8:
            java.lang.String r1 = "getSkuDetails() returned a bundle with neither an error nor a detail list."
            com.google.android.gms.internal.play_billing.zza.zzk(r11, r1)
            goto L_0x010d
        L_0x00be:
            java.util.ArrayList r2 = r2.getStringArrayList(r3)
            if (r2 != 0) goto L_0x00cf
            java.lang.String r0 = "querySkuDetailsAsync got null response list"
            com.google.android.gms.internal.play_billing.zza.zzk(r11, r0)
        L_0x00c9:
            r0 = 4
            java.lang.String r1 = "Item is unavailable for purchase."
            r0 = r1
            r14 = 4
            goto L_0x0138
        L_0x00cf:
            r3 = 0
        L_0x00d0:
            int r4 = r2.size()
            if (r3 >= r4) goto L_0x010f
            java.lang.Object r4 = r2.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            com.android.billingclient.api.SkuDetails r5 = new com.android.billingclient.api.SkuDetails     // Catch:{ JSONException -> 0x0105 }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x0105 }
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r6 = r4.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 17
            r7.<init>(r6)
            java.lang.String r6 = "Got sku details: "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.google.android.gms.internal.play_billing.zza.zzj(r11, r4)
            r12.add(r5)
            int r3 = r3 + 1
            goto L_0x00d0
        L_0x0105:
            java.lang.String r0 = "Got a JSON exception trying to decode SkuDetails."
            com.google.android.gms.internal.play_billing.zza.zzk(r11, r0)
            java.lang.String r0 = "Error trying to decode SkuDetails."
            r12 = 0
        L_0x010d:
            r14 = 6
            goto L_0x013d
        L_0x010f:
            r2 = r1
            r1 = r16
            goto L_0x0019
        L_0x0114:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 63
            r2.<init>(r1)
            java.lang.String r1 = "querySkuDetailsAsync got a remote exception (try to reconnect)."
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.play_billing.zza.zzk(r11, r0)
            r0 = -1
            java.lang.String r1 = "Service connection is disconnected."
            r0 = r1
            r14 = -1
        L_0x0138:
            r12 = 0
            goto L_0x013d
        L_0x013a:
            java.lang.String r0 = ""
            r14 = 0
        L_0x013d:
            com.android.billingclient.api.f r1 = new com.android.billingclient.api.f
            r1.<init>()
            r1.f6770a = r14
            r1.f6771b = r0
            d0.k0 r10 = (p054d0.C4291k0) r10
            r10.mo19813h(r1, r12)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1969y.call():java.lang.Object");
    }
}
