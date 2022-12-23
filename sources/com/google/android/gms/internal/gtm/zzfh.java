package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.amazonaws.regions.ServiceAbbreviations;
import com.google.android.gms.analytics.zzr;

public final class zzfh extends zzbs {
    /* access modifiers changed from: private */
    public SharedPreferences zza;
    private long zzb;
    private long zzc = -1;
    private final zzfg zzd;

    public zzfh(zzbv zzbv) {
        super(zzbv);
        zzw();
        this.zzd = new zzfg(this, ServiceAbbreviations.CloudWatch, zzeu.zzP.zzb().longValue(), (zzff) null);
    }

    public final long zza() {
        zzr.zzh();
        zzW();
        long j = this.zzb;
        if (j != 0) {
            return j;
        }
        long j2 = this.zza.getLong("first_run", 0);
        if (j2 != 0) {
            this.zzb = j2;
            return j2;
        }
        long currentTimeMillis = zzC().currentTimeMillis();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("first_run", currentTimeMillis);
        if (!edit.commit()) {
            zzR("Failed to commit first run time");
        }
        this.zzb = currentTimeMillis;
        return currentTimeMillis;
    }

    public final long zzb() {
        zzr.zzh();
        zzW();
        long j = this.zzc;
        if (j != -1) {
            return j;
        }
        long j2 = this.zza.getLong("last_dispatch", 0);
        this.zzc = j2;
        return j2;
    }

    public final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfg zze() {
        return this.zzd;
    }

    public final zzfo zzf() {
        return new zzfo(zzC(), zza());
    }

    public final String zzg() {
        zzr.zzh();
        zzW();
        String string = this.zza.getString("installation_campaign", (String) null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final void zzh(String str) {
        zzr.zzh();
        zzW();
        SharedPreferences.Editor edit = this.zza.edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("installation_campaign");
        } else {
            edit.putString("installation_campaign", str);
        }
        if (!edit.commit()) {
            zzR("Failed to commit campaign data");
        }
    }

    public final void zzi() {
        zzr.zzh();
        zzW();
        long currentTimeMillis = zzC().currentTimeMillis();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.zzc = currentTimeMillis;
    }
}
