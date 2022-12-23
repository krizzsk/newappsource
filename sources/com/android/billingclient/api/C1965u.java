package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zza;
import java.util.ArrayList;

/* renamed from: com.android.billingclient.api.u */
public final class C1965u {
    /* renamed from: a */
    public static C1949f m5368a(Bundle bundle, String str) {
        C1949f fVar = C1964t.f6801i;
        if (bundle == null) {
            zza.zzk("BillingClient", String.format("%s got null owned items list", new Object[]{str}));
            return fVar;
        }
        int zza = zza.zza(bundle, "BillingClient");
        String zzh = zza.zzh(bundle, "BillingClient");
        C1949f fVar2 = new C1949f();
        fVar2.f6770a = zza;
        fVar2.f6771b = zzh;
        if (zza != 0) {
            zza.zzk("BillingClient", String.format("%s failed. Response code: %s", new Object[]{str, Integer.valueOf(zza)}));
            return fVar2;
        } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            zza.zzk("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", new Object[]{str}));
            return fVar;
        } else {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            if (stringArrayList == null) {
                zza.zzk("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", new Object[]{str}));
                return fVar;
            } else if (stringArrayList2 == null) {
                zza.zzk("BillingClient", String.format("Bundle returned from %s contains null purchases list.", new Object[]{str}));
                return fVar;
            } else if (stringArrayList3 != null) {
                return C1964t.f6802j;
            } else {
                zza.zzk("BillingClient", String.format("Bundle returned from %s contains null signatures list.", new Object[]{str}));
                return fVar;
            }
        }
    }
}
