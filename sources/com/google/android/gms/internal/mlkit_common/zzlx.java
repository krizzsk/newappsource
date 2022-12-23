package com.google.android.gms.internal.mlkit_common;

import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.sdkinternal.ModelType;
import p603kg.C18039b;
import p627lg.C18212k;

public final class zzlx {
    private static final GmsLogger zza = new GmsLogger("RemoteModelUtils", "");

    public static zzil zza(C18039b bVar, C18212k kVar, zzln zzln) {
        zzin zzin;
        long j;
        ModelType zzb = zzln.zzb();
        bVar.getClass();
        zzir zzir = new zzir();
        zzim zzim = new zzim();
        zzim.zzc((String) C18039b.f46151a.get((Object) null));
        zzim.zzd(zzio.CLOUD);
        zzim.zza(zzac.zzb((String) null));
        int ordinal = zzb.ordinal();
        if (ordinal == 2) {
            zzin = zzin.BASE_TRANSLATE;
        } else if (ordinal == 4) {
            zzin = zzin.CUSTOM;
        } else if (ordinal != 5) {
            zzin = zzin.TYPE_UNKNOWN;
        } else {
            zzin = zzin.BASE_DIGITAL_INK;
        }
        zzim.zzb(zzin);
        zzir.zzb(zzim.zzg());
        zziu zzc = zzir.zzc();
        zzii zzii = new zzii();
        zzii.zzd(zzln.zzc());
        zzii.zzc(zzln.zzd());
        zzii.zzb(Long.valueOf((long) zzln.zza()));
        zzii.zzf(zzc);
        if (zzln.zzg()) {
            long b = kVar.mo50631b(bVar);
            if (b == 0) {
                zza.mo65697w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                synchronized (kVar) {
                    j = kVar.f46473a.getSharedPreferences("com.google.mlkit.internal", 0).getLong(String.format("model_first_use_time_%s", new Object[]{C18039b.m44709a()}), 0);
                }
                if (j == 0) {
                    j = SystemClock.elapsedRealtime();
                    synchronized (kVar) {
                        kVar.f46473a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putLong(String.format("model_first_use_time_%s", new Object[]{C18039b.m44709a()}), j).apply();
                    }
                }
                zzii.zzg(Long.valueOf(j - b));
            }
        }
        if (zzln.zzf()) {
            long b2 = kVar.mo50631b(bVar);
            if (b2 == 0) {
                zza.mo65697w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zzii.zze(Long.valueOf(SystemClock.elapsedRealtime() - b2));
            }
        }
        return zzii.zzi();
    }
}
