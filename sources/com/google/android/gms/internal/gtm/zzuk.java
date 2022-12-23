package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzun;
import java.io.IOException;
import java.util.Map;

abstract class zzuk<T extends zzun<T>> {
    public abstract int zza(Map.Entry<?, ?> entry);

    public abstract zzuo<T> zzb(Object obj);

    public abstract zzuo<T> zzc(Object obj);

    public abstract Object zzd(zzuj zzuj, zzwk zzwk, int i);

    public abstract <UT, UB> UB zze(zzww zzww, Object obj, zzuj zzuj, zzuo<T> zzuo, UB ub, zzxo<UT, UB> zzxo) throws IOException;

    public abstract void zzf(Object obj);

    public abstract void zzg(zzww zzww, Object obj, zzuj zzuj, zzuo<T> zzuo) throws IOException;

    public abstract void zzh(zztd zztd, Object obj, zzuj zzuj, zzuo<T> zzuo) throws IOException;

    public abstract boolean zzi(zzwk zzwk);

    public abstract void zzj(zztp zztp, Map.Entry<?, ?> entry) throws IOException;
}
