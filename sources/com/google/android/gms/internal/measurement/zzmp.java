package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class zzmp extends zzmn {
    public final /* synthetic */ int zza(Object obj) {
        return ((zzmo) obj).zza();
    }

    public final /* synthetic */ int zzb(Object obj) {
        return ((zzmo) obj).zzb();
    }

    public final /* synthetic */ Object zzc(Object obj) {
        return ((zzke) obj).zzc;
    }

    public final /* bridge */ /* synthetic */ Object zzd(Object obj, Object obj2) {
        zzmo zzmo = (zzmo) obj2;
        if (zzmo.equals(zzmo.zzc())) {
            return obj;
        }
        return zzmo.zzd((zzmo) obj, zzmo);
    }

    public final /* synthetic */ Object zze() {
        return zzmo.zze();
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, long j) {
        ((zzmo) obj).zzh(i << 3, Long.valueOf(j));
    }

    public final void zzg(Object obj) {
        ((zzke) obj).zzc.zzf();
    }

    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzke) obj).zzc = (zzmo) obj2;
    }

    public final /* synthetic */ void zzi(Object obj, zznf zznf) throws IOException {
        ((zzmo) obj).zzi(zznf);
    }
}
