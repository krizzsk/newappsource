package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

public final class zzeyx {
    public static zzeyv zza(Context context, zzfdj zzfdj, zzfeb zzfeb) {
        return zzc(context, zzfdj, zzfeb);
    }

    public static zzeyv zzb(Context context, zzfdj zzfdj, zzfeb zzfeb) {
        return zzc(context, zzfdj, zzfeb);
    }

    private static zzeyv zzc(Context context, zzfdj zzfdj, zzfeb zzfeb) {
        zzcel zzcel;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfn)).booleanValue()) {
            zzcel = zzt.zzo().zzh().zzh();
        } else {
            zzcel = zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzcel != null && zzcel.zzh()) {
            z = true;
        }
        if (((Integer) zzay.zzc().zzb(zzbhy.zzfD)).intValue() > 0) {
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzfm)).booleanValue() || z) {
                zzfea zza = zzfeb.zza(zzfdr.AppOpen, context, zzfdj, new zzexz(new zzexw()));
                zzeyl zzeyl = new zzeyl(new zzeyk());
                zzfdn zzfdn = zza.zza;
                zzfvk zzfvk = zzcfv.zza;
                return new zzeyb(zzeyl, new zzeyh(zzfdn, zzfvk), zza.zzb, zza.zza.zza().zzf, zzfvk);
            }
        }
        return new zzeyk();
    }
}
