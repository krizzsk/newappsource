package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import mf0.C24361g;

final class zzhm implements zzhj {
    private static zzhm zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhm() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzhm(Context context) {
        this.zzb = context;
        zzhl zzhl = new zzhl(this, (Handler) null);
        this.zzc = zzhl;
        context.getContentResolver().registerContentObserver(zzgz.zza, true, zzhl);
    }

    public static zzhm zza(Context context) {
        zzhm zzhm;
        zzhm zzhm2;
        synchronized (zzhm.class) {
            if (zza == null) {
                if (C24361g.m61191v(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    zzhm2 = new zzhm(context);
                } else {
                    zzhm2 = new zzhm();
                }
                zza = zzhm2;
            }
            zzhm = zza;
        }
        return zzhm;
    }

    public static synchronized void zze() {
        Context context;
        synchronized (zzhm.class) {
            zzhm zzhm = zza;
            if (!(zzhm == null || (context = zzhm.zzb) == null || zzhm.zzc == null)) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* renamed from: zzc */
    public final String zzb(String str) {
        Context context = this.zzb;
        if (context != null && !zzha.zza(context)) {
            try {
                return (String) zzhh.zza(new zzhk(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    public final /* synthetic */ String zzd(String str) {
        return zzgz.zza(this.zzb.getContentResolver(), str, (String) null);
    }
}
