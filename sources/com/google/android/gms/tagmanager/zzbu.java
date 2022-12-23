package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzak;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class zzbu {
    private final Set<String> zzs;
    private final String zzt;

    public zzbu(String str, String... strArr) {
        this.zzt = str;
        this.zzs = new HashSet(r4);
        for (String add : strArr) {
            this.zzs.add(add);
        }
    }

    public abstract zzak zza(Map<String, zzak> map);

    public abstract boolean zzb();

    public final String zze() {
        return this.zzt;
    }

    public final Set<String> zzf() {
        return this.zzs;
    }

    public final boolean zzg(Set<String> set) {
        return set.containsAll(this.zzs);
    }
}
