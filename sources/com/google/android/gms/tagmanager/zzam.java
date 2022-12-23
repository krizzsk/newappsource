package com.google.android.gms.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Random;

@ShowFirstParty
public final class zzam {
    private final Context zza;
    private final Random zzb;
    private final String zzc;

    public zzam(Context context, String str) {
        Random random = new Random();
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzb = random;
    }

    private final long zze(long j, long j2) {
        SharedPreferences zzf = zzf();
        long max = Math.max(0, zzf.getLong("FORBIDDEN_COUNT", 0));
        return (long) (this.zzb.nextFloat() * ((float) (j + ((long) ((((float) max) / ((float) ((max + Math.max(0, zzf.getLong("SUCCESSFUL_COUNT", 0))) + 1))) * ((float) (j2 - j)))))));
    }

    private final SharedPreferences zzf() {
        Context context = this.zza;
        String valueOf = String.valueOf(this.zzc);
        return context.getSharedPreferences(valueOf.length() != 0 ? "_gtmContainerRefreshPolicy_".concat(valueOf) : new String("_gtmContainerRefreshPolicy_"), 0);
    }

    public final long zza() {
        return zze(7200000, 259200000) + 43200000;
    }

    public final long zzb() {
        return zze(600000, 86400000) + 3600000;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zzc() {
        long j;
        SharedPreferences zzf = zzf();
        long j2 = zzf.getLong("FORBIDDEN_COUNT", 0);
        long j3 = zzf.getLong("SUCCESSFUL_COUNT", 0);
        SharedPreferences.Editor edit = zzf.edit();
        if (j2 == 0) {
            j = 3;
        } else {
            j = Math.min(10, j2 + 1);
        }
        long max = Math.max(0, Math.min(j3, 10 - j));
        edit.putLong("FORBIDDEN_COUNT", j);
        edit.putLong("SUCCESSFUL_COUNT", max);
        edit.apply();
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zzd() {
        SharedPreferences zzf = zzf();
        long j = zzf.getLong("SUCCESSFUL_COUNT", 0);
        long j2 = zzf.getLong("FORBIDDEN_COUNT", 0);
        long min = Math.min(10, j + 1);
        long max = Math.max(0, Math.min(j2, 10 - min));
        SharedPreferences.Editor edit = zzf.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        edit.apply();
    }
}
