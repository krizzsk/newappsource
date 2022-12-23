package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class zzcju implements Releasable {
    public final Context zza;
    public final String zzb;
    public final WeakReference zzc;

    public zzcju(zzchr zzchr) {
        Context context = zzchr.getContext();
        this.zza = context;
        this.zzb = zzt.zzp().zzc(context, zzchr.zzp().zza);
        this.zzc = new WeakReference(zzchr);
    }

    public static /* bridge */ /* synthetic */ void zza(zzcju zzcju, String str, Map map) {
        zzchr zzchr = (zzchr) zzcju.zzc.get();
        if (zzchr != null) {
            zzchr.zzd("onPrecacheEvent", map);
        }
    }

    public void release() {
    }

    public abstract void zzb();

    @VisibleForTesting
    public final void zzc(String str, String str2, String str3, String str4) {
        zzcfb.zza.post(new zzcjt(this, str, str2, str3, str4));
    }

    public final void zzd(String str, String str2, int i) {
        zzcfb.zza.post(new zzcjr(this, str, str2, i));
    }

    @VisibleForTesting
    public final void zze(String str, String str2, long j) {
        zzcfb.zza.post(new zzcjs(this, str, str2, j));
    }

    @VisibleForTesting
    public final void zzf(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzcfb.zza.post(new zzcjq(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    @VisibleForTesting
    public final void zzg(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = zzcfb.zza;
        zzcjp zzcjp = r0;
        zzcjp zzcjp2 = new zzcjp(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(zzcjp);
    }

    public void zzh(int i) {
    }

    public void zzn(int i) {
    }

    public void zzo(int i) {
    }

    public void zzp(int i) {
    }

    public abstract boolean zzq(String str);

    public boolean zzr(String str, String[] strArr) {
        return zzq(str);
    }

    public boolean zzs(String str, String[] strArr, zzcjm zzcjm) {
        return zzq(str);
    }
}
