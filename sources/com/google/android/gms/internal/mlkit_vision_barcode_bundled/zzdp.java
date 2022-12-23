package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Map;

final class zzdp extends zzdo {
    public final int zza(Map.Entry entry) {
        return ((zzdz) entry.getKey()).zza;
    }

    public final zzds zzb(Object obj) {
        return ((zzdy) obj).zza;
    }

    public final zzds zzc(Object obj) {
        return ((zzdy) obj).zzc();
    }

    public final Object zzd(zzdn zzdn, zzfl zzfl, int i) {
        return zzdn.zzb(zzfl, i);
    }

    public final void zze(Object obj) {
        ((zzdy) obj).zza.zzg();
    }

    public final boolean zzf(zzfl zzfl) {
        return zzfl instanceof zzdy;
    }

    public final void zzg(zzdj zzdj, Map.Entry entry) throws IOException {
        zzdz zzdz = (zzdz) entry.getKey();
        zzhf zzhf = zzhf.DOUBLE;
        switch (zzdz.zzb.ordinal()) {
            case 0:
                zzdj.zzf(zzdz.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzdj.zzo(zzdz.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzdj.zzt(zzdz.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzdj.zzK(zzdz.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzdj.zzr(zzdz.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzdj.zzm(zzdz.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzdj.zzk(zzdz.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzdj.zzb(zzdz.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzdj.zzG(zzdz.zza, (String) entry.getValue());
                return;
            case 9:
                zzdj.zzq(zzdz.zza, entry.getValue(), zzfu.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzdj.zzv(zzdz.zza, entry.getValue(), zzfu.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzdj.zzd(zzdz.zza, (zzdb) entry.getValue());
                return;
            case 12:
                zzdj.zzI(zzdz.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzdj.zzr(zzdz.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzdj.zzx(zzdz.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzdj.zzz(zzdz.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzdj.zzB(zzdz.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzdj.zzD(zzdz.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
