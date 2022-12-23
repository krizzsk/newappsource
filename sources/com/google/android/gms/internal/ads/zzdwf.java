package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import p988j$.util.concurrent.ConcurrentHashMap;

public final class zzdwf {
    public final /* synthetic */ zzdwg zza;
    private final Map zzb = new ConcurrentHashMap();

    @VisibleForTesting
    public zzdwf(zzdwg zzdwg) {
        this.zza = zzdwg;
    }

    public final zzdwf zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdwf zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdwf zzd(zzfbg zzfbg) {
        this.zzb.put("aai", zzfbg.zzx);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfW)).booleanValue()) {
            zzc("rid", zzfbg.zzap);
        }
        return this;
    }

    public final zzdwf zze(zzfbj zzfbj) {
        this.zzb.put("gqi", zzfbj.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new zzdwe(this));
    }

    public final void zzh() {
        this.zza.zzb.execute(new zzdwd(this));
    }

    public final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        this.zza.zza.zzd(this.zzb);
    }
}
