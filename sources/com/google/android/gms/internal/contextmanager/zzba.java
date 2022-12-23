package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.common.internal.Preconditions;

public final class zzba {
    private final zzdg zza;

    public zzba(zzdg zzdg) {
        this.zza = (zzdg) Preconditions.checkNotNull(zzdg);
    }

    public static zzba zza(int i) {
        return new zzba(zze(zzdf.HEADPHONE_DURING, 0, i));
    }

    public static zzba zzb() {
        return new zzba(zze(zzdf.HEADPHONE_PLUGGING, 3000, 0));
    }

    public static zzba zzc() {
        return new zzba(zze(zzdf.HEADPHONE_UNPLUGGING, 3000, 0));
    }

    private static zzdg zze(zzdf zzdf, long j, int i) {
        zzdc zza2 = zzdg.zza();
        zza2.zzh(zzdf);
        zza2.zzc(j);
        switch (zzdf.zza()) {
            case 1:
            case 2:
            case 3:
                zzjg zzb = zzjg.zzb(i);
                if (zzb == null) {
                    zzb = zzjg.UNKNOWN_HEADPHONE_STATE;
                }
                zza2.zzd(zzb);
                break;
            case 4:
            case 5:
            case 6:
                zzja zzb2 = zzja.zzb(i);
                if (zzb2 == null) {
                    zzb2 = zzja.UNKNOWN_BLUETOOTH_A2DP_STATE;
                }
                zza2.zza(zzb2);
                break;
            case 7:
            case 8:
            case 9:
                zzjd zzb3 = zzjd.zzb(i);
                if (zzb3 == null) {
                    zzb3 = zzjd.UNKNOWN_BLUETOOTH_SCO_STATE;
                }
                zza2.zzb(zzb3);
                break;
            case 10:
            case 11:
            case 12:
                zzjj zzb4 = zzjj.zzb(i);
                if (zzb4 == null) {
                    zzb4 = zzjj.UNKNOWN_MICROPHONE_STATE;
                }
                zza2.zze(zzb4);
                break;
            case 13:
            case 14:
            case 15:
                zzjm zzb5 = zzjm.zzb(i);
                if (zzb5 == null) {
                    zzb5 = zzjm.UNKNOWN_MUSIC_STATE;
                }
                zza2.zzf(zzb5);
                break;
            case 16:
            case 17:
            case 18:
                zzjp zzb6 = zzjp.zzb(i);
                if (zzb6 == null) {
                    zzb6 = zzjp.UNKNOWN_SPEAKERPHONE_STATE;
                }
                zza2.zzg(zzb6);
                break;
            default:
                zzj.zzb("AudioStateFenceStub", "Unknown trigger type=%s", zzdf);
                break;
        }
        return (zzdg) zza2.zzs();
    }

    public final zzdg zzd() {
        return this.zza;
    }
}
