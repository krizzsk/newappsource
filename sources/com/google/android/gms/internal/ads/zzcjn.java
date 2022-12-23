package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzcjn implements Iterable {
    private final List zza = new ArrayList();

    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzcjm zza(zzchr zzchr) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjm zzcjm = (zzcjm) it.next();
            if (zzcjm.zza == zzchr) {
                return zzcjm;
            }
        }
        return null;
    }

    public final void zzb(zzcjm zzcjm) {
        this.zza.add(zzcjm);
    }

    public final void zzc(zzcjm zzcjm) {
        this.zza.remove(zzcjm);
    }

    public final boolean zzd(zzchr zzchr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcjm zzcjm = (zzcjm) it.next();
            if (zzcjm.zza == zzchr) {
                arrayList.add(zzcjm);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcjm) it2.next()).zzb.zzb();
        }
        return true;
    }
}
