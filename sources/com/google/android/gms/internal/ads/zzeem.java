package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

final class zzeem implements zzfuw {
    public final /* synthetic */ zzffh zza;

    public zzeem(zzeen zzeen, zzffh zzffh) {
        this.zza = zzffh;
    }

    public final void zza(Throwable th) {
        zzcfi.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            zzcfi.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
