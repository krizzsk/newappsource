package com.google.android.gms.analytics.ecommerce;

import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
public class Product {
    public Map<String, String> zza = new HashMap();

    public Product setBrand(String str) {
        zzb("br", str);
        return this;
    }

    public Product setCategory(String str) {
        zzb("ca", str);
        return this;
    }

    public Product setCouponCode(String str) {
        zzb("cc", str);
        return this;
    }

    public Product setCustomDimension(int i, String str) {
        zzb(zzd.zzc(i), str);
        return this;
    }

    public Product setCustomMetric(int i, int i2) {
        zzb(zzd.zzf(i), Integer.toString(i2));
        return this;
    }

    public Product setId(String str) {
        zzb("id", str);
        return this;
    }

    public Product setName(String str) {
        zzb("nm", str);
        return this;
    }

    public Product setPosition(int i) {
        zzb("ps", Integer.toString(i));
        return this;
    }

    public Product setPrice(double d) {
        zzb("pr", Double.toString(d));
        return this;
    }

    public Product setQuantity(int i) {
        zzb("qt", Integer.toString(i));
        return this;
    }

    public Product setVariant(String str) {
        zzb("va", str);
        return this;
    }

    public String toString() {
        return zzj.zzb(this.zza);
    }

    public final Map<String, String> zza(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.zza.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) next.getKey());
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
            }
            hashMap.put(str2, (String) next.getValue());
        }
        return hashMap;
    }

    public final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }
}
