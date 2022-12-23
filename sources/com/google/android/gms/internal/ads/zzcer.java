package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzcer {
    /* access modifiers changed from: private */
    public final Object zza = new Object();
    private final zzj zzb;
    private final zzcev zzc;
    private boolean zzd;
    /* access modifiers changed from: private */
    public Context zze;
    /* access modifiers changed from: private */
    public zzcfo zzf;
    /* access modifiers changed from: private */
    public zzbid zzg;
    private Boolean zzh;
    private final AtomicInteger zzi;
    private final zzceq zzj;
    private final Object zzk;
    private zzfvj zzl;
    /* access modifiers changed from: private */
    public final AtomicBoolean zzm;

    public zzcer() {
        zzj zzj2 = new zzj();
        this.zzb = zzj2;
        this.zzc = new zzcev(zzaw.zzd(), zzj2);
        this.zzd = false;
        this.zzg = null;
        this.zzh = null;
        this.zzi = new AtomicInteger(0);
        this.zzj = new zzceq((zzcep) null);
        this.zzk = new Object();
        this.zzm = new AtomicBoolean();
    }

    public final int zza() {
        return this.zzi.get();
    }

    public final Context zzc() {
        return this.zze;
    }

    public final Resources zzd() {
        if (this.zzf.zzd) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzih)).booleanValue()) {
                return zzcfm.zza(this.zze).getResources();
            }
            zzcfm.zza(this.zze).getResources();
            return null;
        } catch (zzcfl e) {
            zzcfi.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final zzbid zzf() {
        zzbid zzbid;
        synchronized (this.zza) {
            zzbid = this.zzg;
        }
        return zzbid;
    }

    public final zzcev zzg() {
        return this.zzc;
    }

    public final zzg zzh() {
        zzj zzj2;
        synchronized (this.zza) {
            zzj2 = this.zzb;
        }
        return zzj2;
    }

    public final zzfvj zzj() {
        if (this.zze != null) {
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzci)).booleanValue()) {
                synchronized (this.zzk) {
                    zzfvj zzfvj = this.zzl;
                    if (zzfvj != null) {
                        return zzfvj;
                    }
                    zzfvj zzb2 = zzcfv.zza.zzb(new zzcem(this));
                    this.zzl = zzb2;
                    return zzb2;
                }
            }
        }
        return zzfva.zzi(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzh;
        }
        return bool;
    }

    public final /* synthetic */ ArrayList zzm() throws Exception {
        Context zza2 = zzcai.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza2).getPackageInfo(zza2.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzo() {
        this.zzj.zza();
    }

    public final void zzp() {
        this.zzi.decrementAndGet();
    }

    public final void zzq() {
        this.zzi.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzr(Context context, zzcfo zzcfo) {
        zzbid zzbid;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = zzcfo;
                zzt.zzb().zzc(this.zzc);
                this.zzb.zzr(this.zze);
                zzbyx.zzb(this.zze, this.zzf);
                zzt.zze();
                if (!((Boolean) zzbji.zzc.zze()).booleanValue()) {
                    zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbid = null;
                } else {
                    zzbid = new zzbid();
                }
                this.zzg = zzbid;
                if (zzbid != null) {
                    zzcfy.zza(new zzcen(this).zzb(), "AppState.registerCsiReporter");
                }
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) zzay.zzc().zzb(zzbhy.zzgY)).booleanValue()) {
                        ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzceo(this));
                    }
                }
                this.zzd = true;
                zzj();
            }
        }
        zzt.zzp().zzc(context, zzcfo.zza);
    }

    public final void zzs(Throwable th, String str) {
        zzbyx.zzb(this.zze, this.zzf).zze(th, str, ((Double) zzbjw.zzg.zze()).floatValue());
    }

    public final void zzt(Throwable th, String str) {
        zzbyx.zzb(this.zze, this.zzf).zzd(th, str);
    }

    public final void zzu(Boolean bool) {
        synchronized (this.zza) {
            this.zzh = bool;
        }
    }

    public final boolean zzv(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzgY)).booleanValue()) {
                return this.zzm.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }
}
