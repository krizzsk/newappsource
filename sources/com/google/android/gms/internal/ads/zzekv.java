package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p988j$.util.concurrent.ConcurrentHashMap;

public final class zzekv {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdub zzb;

    public zzekv(zzdub zzdub) {
        this.zzb = zzdub;
    }

    public final zzbvs zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbvs) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            zzcfi.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
