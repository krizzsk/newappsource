package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.zzr;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class zzbq extends zzbs {
    /* access modifiers changed from: private */
    public final zzck zza;

    public zzbq(zzbv zzbv, zzbw zzbw) {
        super(zzbv);
        Preconditions.checkNotNull(zzbw);
        this.zza = new zzck(zzbv, zzbw);
    }

    public final long zza(zzbx zzbx) {
        zzW();
        Preconditions.checkNotNull(zzbx);
        zzr.zzh();
        long zzb = this.zza.zzb(zzbx, true);
        if (zzb == 0) {
            this.zza.zzk(zzbx);
        }
        return zzb;
    }

    public final void zzc() {
        zzW();
        Context zzo = zzo();
        if (!zzfi.zza(zzo) || !zzfn.zzh(zzo)) {
            zze((zzcz) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
        zzo.startService(intent);
    }

    public final void zzd() {
        this.zza.zzX();
    }

    public final void zze(zzcz zzcz) {
        zzW();
        zzq().zzi(new zzbo(this, zzcz));
    }

    public final void zzf(String str, Runnable runnable) {
        Preconditions.checkNotEmpty(str, "campaign param can't be empty");
        zzq().zzi(new zzbk(this, str, runnable));
    }

    public final void zzg() {
        zzW();
        zzE();
        zzq().zzi(new zzbn(this));
    }

    public final void zzh(zzex zzex) {
        Preconditions.checkNotNull(zzex);
        zzW();
        zzG("Hit delivery requested", zzex);
        zzq().zzi(new zzbm(this, zzex));
    }

    public final void zzi() {
        zzr.zzh();
        this.zza.zzl();
    }

    public final void zzj() {
        zzr.zzh();
        this.zza.zzm();
    }

    public final void zzk() {
        zzW();
        zzr.zzh();
        zzck zzck = this.zza;
        zzr.zzh();
        zzck.zzW();
        zzck.zzO("Service disconnected");
    }

    public final void zzl(int i) {
        zzW();
        zzG("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zzq().zzi(new zzbl(this, i));
    }

    public final void zzm() {
        this.zza.zzaa();
    }

    public final boolean zzn() {
        zzW();
        try {
            zzq().zzg(new zzbp(this)).get(4, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            zzS("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            zzK("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            zzS("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }
}
