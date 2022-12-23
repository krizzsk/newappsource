package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzdty {
    private final Map zza = new HashMap();

    public final synchronized zzdtx zza(String str) {
        return (zzdtx) this.zza.get(str);
    }

    public final zzdtx zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdtx zza2 = zza((String) it.next());
            if (zza2 != null) {
                return zza2;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbwf zzbwf;
        zzdtx zza2 = zza(str);
        if (zza2 == null || (zzbwf = zza2.zzb) == null) {
            return "";
        }
        return zzbwf.toString();
    }

    public final synchronized void zzd(String str, zzfct zzfct) {
        if (!this.zza.containsKey(str)) {
            try {
                this.zza.put(str, new zzdtx(str, zzfct.zze(), zzfct.zzf()));
            } catch (zzfcd unused) {
            }
        }
    }

    public final synchronized void zze(String str, zzbvs zzbvs) {
        if (!this.zza.containsKey(str)) {
            try {
                this.zza.put(str, new zzdtx(str, zzbvs.zzf(), zzbvs.zzg()));
            } catch (Throwable unused) {
            }
        }
    }
}
