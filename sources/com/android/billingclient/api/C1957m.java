package com.android.billingclient.api;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zza;
import com.google.android.gms.internal.play_billing.zzp;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.m */
public final class C1957m implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ String f6776b = "subs";

    /* renamed from: c */
    public final /* synthetic */ C1953i f6777c;

    /* renamed from: d */
    public final /* synthetic */ C1943c f6778d;

    public C1957m(C1943c cVar, C1953i iVar) {
        this.f6778d = cVar;
        this.f6777c = iVar;
    }

    public final Object call() throws Exception {
        String str;
        Purchase.C1938a aVar;
        Bundle bundle;
        String str2;
        String str3;
        C1943c cVar = this.f6778d;
        String str4 = this.f6776b;
        String valueOf = String.valueOf(str4);
        if (valueOf.length() != 0) {
            str = "Querying owned items, item type: ".concat(valueOf);
        } else {
            str = new String("Querying owned items, item type: ");
        }
        zza.zzj("BillingClient", str);
        ArrayList arrayList = new ArrayList();
        Bundle zzf = zza.zzf(cVar.f6748k, cVar.f6753p, cVar.f6739b);
        String str5 = null;
        while (true) {
            try {
                if (cVar.f6748k) {
                    bundle = cVar.f6743f.zzj(9, cVar.f6742e.getPackageName(), str4, str5, zzf);
                } else {
                    bundle = cVar.f6743f.zzi(3, cVar.f6742e.getPackageName(), str4, str5);
                }
                C1949f a = C1965u.m5368a(bundle, "getPurchase()");
                if (a == C1964t.f6802j) {
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i = 0;
                    while (i < stringArrayList2.size()) {
                        String str6 = stringArrayList2.get(i);
                        String str7 = stringArrayList3.get(i);
                        String valueOf2 = String.valueOf(stringArrayList.get(i));
                        if (valueOf2.length() != 0) {
                            str3 = "Sku is owned: ".concat(valueOf2);
                        } else {
                            str3 = new String("Sku is owned: ");
                        }
                        zza.zzj("BillingClient", str3);
                        try {
                            Purchase purchase = new Purchase(str6, str7);
                            JSONObject jSONObject = purchase.f6728c;
                            if (TextUtils.isEmpty(jSONObject.optString(FirebaseMessagingService.EXTRA_TOKEN, jSONObject.optString("purchaseToken")))) {
                                zza.zzk("BillingClient", "BUG: empty/null token!");
                            }
                            arrayList.add(purchase);
                            i++;
                        } catch (JSONException e) {
                            String valueOf3 = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(valueOf3.length() + 48);
                            sb.append("Got an exception trying to decode the purchase: ");
                            sb.append(valueOf3);
                            zza.zzk("BillingClient", sb.toString());
                            aVar = new Purchase.C1938a(C1964t.f6801i, (ArrayList) null);
                        }
                    }
                    str5 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                    String valueOf4 = String.valueOf(str5);
                    if (valueOf4.length() != 0) {
                        str2 = "Continuation token: ".concat(valueOf4);
                    } else {
                        str2 = new String("Continuation token: ");
                    }
                    zza.zzj("BillingClient", str2);
                    if (TextUtils.isEmpty(str5)) {
                        aVar = new Purchase.C1938a(C1964t.f6802j, arrayList);
                        break;
                    }
                } else {
                    aVar = new Purchase.C1938a(a, (ArrayList) null);
                    break;
                }
            } catch (Exception e2) {
                String valueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(valueOf5.length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                zza.zzk("BillingClient", sb2.toString());
                aVar = new Purchase.C1938a(C1964t.f6803k, (ArrayList) null);
            }
        }
        List<Purchase> list = aVar.f6729a;
        if (list != null) {
            this.f6777c.mo9575c(aVar.f6730b, list);
        } else {
            this.f6777c.mo9575c(aVar.f6730b, zzp.zzg());
        }
        return null;
    }
}
