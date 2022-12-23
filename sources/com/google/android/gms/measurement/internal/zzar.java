package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import p001a0.C0016g;

public final class zzar {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final zzau zzf;

    public zzar(zzfy zzfy, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzau;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzfy.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzeo.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzau = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfy.zzay().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object zzA = zzfy.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzfy.zzay().zzk().zzb("Param value can't be null", zzfy.zzj().zze(next));
                        it.remove();
                    } else {
                        zzfy.zzv().zzO(bundle2, next, zzA);
                    }
                }
            }
            zzau = new zzau(bundle2);
        }
        this.zzf = zzau;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return C0016g.m31o(C16759e.m42352h("Event{appId='", str, "', name='", str2, "', params="), this.zzf.toString(), "}");
    }

    public final zzar zza(zzfy zzfy, long j) {
        return new zzar(zzfy, this.zzc, this.zza, this.zzb, this.zzd, j, this.zzf);
    }

    private zzar(zzfy zzfy, String str, String str2, String str3, long j, long j2, zzau zzau) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzau);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzfy.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeo.zzn(str2), zzeo.zzn(str3));
        }
        this.zzf = zzau;
    }
}
