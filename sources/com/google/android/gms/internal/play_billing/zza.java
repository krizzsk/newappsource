package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.C1939a;
import com.android.billingclient.api.C1947e;
import com.android.billingclient.api.C1949f;
import com.android.billingclient.api.C1951g;
import com.android.billingclient.api.C1966v;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

public final class zza {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Bundle bundle, String str) {
        String str2;
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzj(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String name = obj.getClass().getName();
            if (name.length() != 0) {
                str2 = "Unexpected type for bundle response code: ".concat(name);
            } else {
                str2 = new String("Unexpected type for bundle response code: ");
            }
            zzk(str, str2);
            return 6;
        }
    }

    public static Bundle zzb(C1939a aVar, String str) {
        return C25541a.m63872b("playBillingLibraryVersion", str);
    }

    public static Bundle zzc(C1951g gVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle zzd(int i, boolean z, String str, String str2, ArrayList<C1966v> arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i >= 14) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                C1966v vVar = arrayList.get(i2);
                arrayList2.add((Object) null);
                z2 |= !TextUtils.isEmpty((CharSequence) null);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
        }
        return bundle;
    }

    public static Bundle zze(C1947e eVar, boolean z, boolean z2, String str) {
        Bundle b = C25541a.m63872b("playBillingLibraryVersion", str);
        int i = eVar.f6762e;
        if (i != 0) {
            b.putInt("prorationMode", i);
        }
        if (!TextUtils.isEmpty(eVar.f6759b)) {
            b.putString("accountId", eVar.f6759b);
        }
        if (!TextUtils.isEmpty(eVar.f6761d)) {
            b.putString("obfuscatedProfileId", eVar.f6761d);
        }
        if (eVar.f6764g) {
            b.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            b.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{null})));
        }
        if (!TextUtils.isEmpty(eVar.f6760c)) {
            b.putString("oldSkuPurchaseToken", eVar.f6760c);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            b.putString("oldSkuPurchaseId", (String) null);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            b.putString("paymentsPurchaseParams", (String) null);
        }
        if (z && z2) {
            b.putBoolean("enablePendingPurchases", true);
        }
        return b;
    }

    public static Bundle zzf(boolean z, boolean z2, String str) {
        Bundle b = C25541a.m63872b("playBillingLibraryVersion", str);
        if (z && z2) {
            b.putBoolean("enablePendingPurchases", true);
        }
        return b;
    }

    public static C1949f zzg(Intent intent, String str) {
        if (intent == null) {
            zzk("BillingHelper", "Got null intent!");
            C1949f.C1950a a = C1949f.m5364a();
            a.f6772a = 6;
            a.f6773b = "An internal error occurred.";
            return a.mo9574a();
        }
        C1949f.C1950a a2 = C1949f.m5364a();
        a2.f6772a = zza(intent.getExtras(), str);
        a2.f6773b = zzh(intent.getExtras(), str);
        return a2.mo9574a();
    }

    public static String zzh(Bundle bundle, String str) {
        String str2;
        if (bundle == null) {
            zzk(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzj(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String name = obj.getClass().getName();
            if (name.length() != 0) {
                str2 = "Unexpected type for debug message: ".concat(name);
            } else {
                str2 = new String("Unexpected type for debug message: ");
            }
            zzk(str, str2);
            return "";
        }
    }

    public static List<Purchase> zzi(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            zzk("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            Purchase zzl = zzl(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzl == null) {
                zzk("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzl);
        } else {
            int i = 0;
            while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                Purchase zzl2 = zzl(stringArrayList.get(i), stringArrayList2.get(i));
                if (zzl2 != null) {
                    arrayList.add(zzl2);
                }
                i++;
            }
        }
        return arrayList;
    }

    public static void zzj(String str, String str2) {
    }

    public static void zzk(String str, String str2) {
    }

    private static Purchase zzl(String str, String str2) {
        if (str == null || str2 == null) {
            zzk("BillingHelper", "Received a bad purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
            sb.append("Got JSONException while parsing purchase data: ");
            sb.append(valueOf);
            zzk("BillingHelper", sb.toString());
            return null;
        }
    }
}
