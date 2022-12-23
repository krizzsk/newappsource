package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ShowFirstParty
public final class zzbb extends zzj<zzbb> {
    private final List<Product> zza = new ArrayList();
    private final List<Promotion> zzb = new ArrayList();
    private final Map<String, List<Product>> zzc = new HashMap();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zza.isEmpty()) {
            hashMap.put("products", this.zza);
        }
        if (!this.zzb.isEmpty()) {
            hashMap.put("promotions", this.zzb);
        }
        if (!this.zzc.isEmpty()) {
            hashMap.put("impressions", this.zzc);
        }
        hashMap.put("productAction", (Object) null);
        return zzj.zza(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzc(zzj zzj) {
        String str;
        zzbb zzbb = (zzbb) zzj;
        zzbb.zza.addAll(this.zza);
        zzbb.zzb.addAll(this.zzb);
        for (Map.Entry next : this.zzc.entrySet()) {
            String str2 = (String) next.getKey();
            for (Product product : (List) next.getValue()) {
                if (product != null) {
                    if (str2 == null) {
                        str = "";
                    } else {
                        str = str2;
                    }
                    if (!zzbb.zzc.containsKey(str)) {
                        zzbb.zzc.put(str, new ArrayList());
                    }
                    zzbb.zzc.get(str).add(product);
                }
            }
        }
    }

    public final List<Product> zzd() {
        return Collections.unmodifiableList(this.zza);
    }

    public final List<Promotion> zze() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final Map<String, List<Product>> zzf() {
        return this.zzc;
    }
}
