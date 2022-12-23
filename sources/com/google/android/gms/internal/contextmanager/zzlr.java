package com.google.android.gms.internal.contextmanager;

import java.io.IOException;
import java.util.Map;

final class zzlr extends zzlq<zzmc> {
    public final int zza(Map.Entry<?, ?> entry) {
        zzmc zzmc = (zzmc) entry.getKey();
        return 106879161;
    }

    public final zzlu<zzmc> zzb(Object obj) {
        return ((zzmb) obj).zza;
    }

    public final zzlu<zzmc> zzc(Object obj) {
        return ((zzmb) obj).zzc();
    }

    public final Object zzd(zzlp zzlp, zznn zznn, int i) {
        return zzlp.zzc(zznn, i);
    }

    public final void zze(Object obj) {
        ((zzmb) obj).zza.zzg();
    }

    public final boolean zzf(zznn zznn) {
        return zznn instanceof zzmb;
    }

    public final void zzg(zzll zzll, Map.Entry<?, ?> entry) throws IOException {
        zzpd zzpd = zzpd.DOUBLE;
        switch (((zzmc) entry.getKey()).zzb.ordinal()) {
            case 0:
                zzll.zzf(106879161, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzll.zzo(106879161, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzll.zzt(106879161, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzll.zzK(106879161, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzll.zzr(106879161, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzll.zzm(106879161, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzll.zzk(106879161, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzll.zzb(106879161, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzll.zzG(106879161, (String) entry.getValue());
                return;
            case 9:
                zzll.zzq(106879161, entry.getValue(), zznw.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzll.zzv(106879161, entry.getValue(), zznw.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzll.zzd(106879161, (zzld) entry.getValue());
                return;
            case 12:
                zzll.zzI(106879161, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzll.zzr(106879161, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzll.zzx(106879161, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzll.zzz(106879161, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzll.zzB(106879161, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzll.zzD(106879161, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
