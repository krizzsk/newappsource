package com.google.android.gms.internal.contextmanager;

import java.io.IOException;

final class zzop extends zzon<zzoo, zzoo> {
    public final /* bridge */ /* synthetic */ int zza(Object obj) {
        return ((zzoo) obj).zza();
    }

    public final /* bridge */ /* synthetic */ int zzb(Object obj) {
        return ((zzoo) obj).zzb();
    }

    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        return ((zzmf) obj).zzc;
    }

    public final /* bridge */ /* synthetic */ Object zzd(Object obj, Object obj2) {
        zzoo zzoo = (zzoo) obj2;
        if (zzoo.equals(zzoo.zzc())) {
            return obj;
        }
        return zzoo.zzd((zzoo) obj, zzoo);
    }

    public final /* bridge */ /* synthetic */ Object zze() {
        return zzoo.zze();
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, long j) {
        ((zzoo) obj).zzh(i << 3, Long.valueOf(j));
    }

    public final void zzg(Object obj) {
        ((zzmf) obj).zzc.zzf();
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzmf) obj).zzc = (zzoo) obj2;
    }

    public final /* bridge */ /* synthetic */ void zzi(Object obj, zzll zzll) throws IOException {
        ((zzoo) obj).zzi(zzll);
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj, zzll zzll) throws IOException {
        ((zzoo) obj).zzj(zzll);
    }
}
