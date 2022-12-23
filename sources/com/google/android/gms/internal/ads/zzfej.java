package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;

public final class zzfej {
    private final zzfdn zza;
    private final zzfeh zzb;
    private final zzfdj zzc;
    /* access modifiers changed from: private */
    public final ArrayDeque zzd;
    /* access modifiers changed from: private */
    public zzfep zze;
    /* access modifiers changed from: private */
    public int zzf = 1;

    public zzfej(zzfdn zzfdn, zzfdj zzfdj, zzfeh zzfeh) {
        this.zza = zzfdn;
        this.zzc = zzfdj;
        this.zzb = zzfeh;
        this.zzd = new ArrayDeque();
        zzfdj.zzb(new zzfee(this));
    }

    /* access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzfl)).booleanValue()) {
            if (!zzt.zzo().zzh().zzh().zzh()) {
                this.zzd.clear();
                return;
            }
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfei zzfei = (zzfei) this.zzd.pollFirst();
                if (zzfei == null || (zzfei.zza() != null && this.zza.zze(zzfei.zza()))) {
                    zzfep zzfep = new zzfep(this.zza, this.zzb, zzfei);
                    this.zze = zzfep;
                    zzfep.zzd(new zzfef(this, zzfei));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized zzfvj zza(zzfei zzfei) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfei);
    }

    public final synchronized void zze(zzfei zzfei) {
        this.zzd.add(zzfei);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
