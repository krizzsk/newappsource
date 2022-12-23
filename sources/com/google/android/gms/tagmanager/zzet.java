package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzro;
import com.google.android.gms.internal.gtm.zzrw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class zzet {
    private final Set<zzrw> zza = new HashSet();
    private final Map<zzrw, List<zzro>> zzb = new HashMap();
    private final Map<zzrw, List<zzro>> zzc = new HashMap();
    private final Map<zzrw, List<String>> zzd = new HashMap();
    private final Map<zzrw, List<String>> zze = new HashMap();
    private zzro zzf;

    public final zzro zza() {
        return this.zzf;
    }

    public final Map<zzrw, List<String>> zzb() {
        return this.zzd;
    }

    public final Map<zzrw, List<zzro>> zzc() {
        return this.zzb;
    }

    public final Map<zzrw, List<String>> zzd() {
        return this.zze;
    }

    public final Map<zzrw, List<zzro>> zze() {
        return this.zzc;
    }

    public final Set<zzrw> zzf() {
        return this.zza;
    }

    public final void zzg(zzrw zzrw, zzro zzro) {
        List list = this.zzb.get(zzrw);
        if (list == null) {
            list = new ArrayList();
            this.zzb.put(zzrw, list);
        }
        list.add(zzro);
    }

    public final void zzh(zzrw zzrw, String str) {
        List list = this.zzd.get(zzrw);
        if (list == null) {
            list = new ArrayList();
            this.zzd.put(zzrw, list);
        }
        list.add("Unknown");
    }

    public final void zzi(zzrw zzrw, zzro zzro) {
        List list = this.zzc.get(zzrw);
        if (list == null) {
            list = new ArrayList();
            this.zzc.put(zzrw, list);
        }
        list.add(zzro);
    }

    public final void zzj(zzrw zzrw, String str) {
        List list = this.zze.get(zzrw);
        if (list == null) {
            list = new ArrayList();
            this.zze.put(zzrw, list);
        }
        list.add("Unknown");
    }

    public final void zzk(zzrw zzrw) {
        this.zza.add(zzrw);
    }

    public final void zzl(zzro zzro) {
        this.zzf = zzro;
    }
}
