package com.android.billingclient.api;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zza;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p304x.C7038d0;

/* renamed from: com.android.billingclient.api.n */
public final class C1958n implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ String f6779b = "subs";

    /* renamed from: c */
    public final /* synthetic */ C1952h f6780c;

    /* renamed from: d */
    public final /* synthetic */ C1943c f6781d;

    public C1958n(C1943c cVar, C7038d0 d0Var) {
        this.f6781d = cVar;
        this.f6780c = d0Var;
    }

    public final Object call() throws Exception {
        String str;
        C1963s sVar;
        String str2;
        String str3;
        C1943c cVar = this.f6781d;
        String str4 = this.f6779b;
        String valueOf = String.valueOf(str4);
        if (valueOf.length() != 0) {
            str = "Querying purchase history, item type: ".concat(valueOf);
        } else {
            str = new String("Querying purchase history, item type: ");
        }
        zza.zzj("BillingClient", str);
        ArrayList arrayList = new ArrayList();
        Bundle zzf = zza.zzf(cVar.f6748k, cVar.f6753p, cVar.f6739b);
        String str5 = null;
        while (true) {
            if (!cVar.f6747j) {
                zza.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
                sVar = new C1963s(C1964t.f6800h, (ArrayList) null);
                break;
            }
            try {
                Bundle zzh = cVar.f6743f.zzh(6, cVar.f6742e.getPackageName(), str4, str5, zzf);
                C1949f a = C1965u.m5368a(zzh, "getPurchaseHistory()");
                if (a == C1964t.f6802j) {
                    ArrayList<String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList<String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    int i = 0;
                    while (i < stringArrayList2.size()) {
                        String str6 = stringArrayList2.get(i);
                        String str7 = stringArrayList3.get(i);
                        String valueOf2 = String.valueOf(stringArrayList.get(i));
                        if (valueOf2.length() != 0) {
                            str3 = "Purchase record found for sku : ".concat(valueOf2);
                        } else {
                            str3 = new String("Purchase record found for sku : ");
                        }
                        zza.zzj("BillingClient", str3);
                        try {
                            PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str6, str7);
                            JSONObject jSONObject = purchaseHistoryRecord.f6733c;
                            if (TextUtils.isEmpty(jSONObject.optString(FirebaseMessagingService.EXTRA_TOKEN, jSONObject.optString("purchaseToken")))) {
                                zza.zzk("BillingClient", "BUG: empty/null token!");
                            }
                            arrayList.add(purchaseHistoryRecord);
                            i++;
                        } catch (JSONException e) {
                            String valueOf3 = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(valueOf3.length() + 48);
                            sb.append("Got an exception trying to decode the purchase: ");
                            sb.append(valueOf3);
                            zza.zzk("BillingClient", sb.toString());
                            sVar = new C1963s(C1964t.f6801i, (ArrayList) null);
                        }
                    }
                    str5 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                    String valueOf4 = String.valueOf(str5);
                    if (valueOf4.length() != 0) {
                        str2 = "Continuation token: ".concat(valueOf4);
                    } else {
                        str2 = new String("Continuation token: ");
                    }
                    zza.zzj("BillingClient", str2);
                    if (TextUtils.isEmpty(str5)) {
                        sVar = new C1963s(C1964t.f6802j, arrayList);
                        break;
                    }
                } else {
                    sVar = new C1963s(a, (ArrayList) null);
                    break;
                }
            } catch (RemoteException e2) {
                String valueOf5 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(valueOf5.length() + 64);
                sb2.append("Got exception trying to get purchase history: ");
                sb2.append(valueOf5);
                sb2.append("; try to reconnect");
                zza.zzk("BillingClient", sb2.toString());
                sVar = new C1963s(C1964t.f6803k, (ArrayList) null);
            }
        }
        ((C7038d0) this.f6780c).mo23298c((C1949f) sVar.f6792b, (List) sVar.f6791a);
        return null;
    }
}
