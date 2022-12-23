package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

final class zzedm implements zzfuw {
    public final /* synthetic */ zzffh zza;

    public zzedm(zzedn zzedn, zzffh zzffh) {
        this.zza = zzffh;
    }

    public final void zza(Throwable th) {
        zzcfi.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            zzcfi.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
