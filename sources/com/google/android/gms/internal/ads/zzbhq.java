package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONObject;

public abstract class zzbhq {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    public /* synthetic */ zzbhq(int i, String str, Object obj, zzbhp zzbhp) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        zzay.zza().zzd(this);
    }

    public static zzbhq zzf(int i, String str, float f) {
        return new zzbhn(1, str, Float.valueOf(f));
    }

    public static zzbhq zzg(int i, String str, int i2) {
        return new zzbhl(1, str, Integer.valueOf(i2));
    }

    public static zzbhq zzh(int i, String str, long j) {
        return new zzbhm(1, str, Long.valueOf(j));
    }

    public static zzbhq zzi(int i, String str, Boolean bool) {
        return new zzbhk(i, str, bool);
    }

    public static zzbhq zzj(int i, String str, String str2) {
        return new zzbho(1, str, str2);
    }

    public static zzbhq zzk(int i, String str) {
        zzbhq zzj = zzj(1, "gads:sdk_core_constants:experiment_id", (String) null);
        zzay.zza().zzc(zzj);
        return zzj;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return zzay.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
