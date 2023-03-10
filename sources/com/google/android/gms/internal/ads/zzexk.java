package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzexk extends zzbr implements zzo, zzbbz {
    public zzcvn zza;
    private final zzcnf zzb;
    private final Context zzc;
    private AtomicBoolean zzd = new AtomicBoolean();
    private final String zze;
    private final zzexe zzf;
    /* access modifiers changed from: private */
    public final zzexc zzg;
    private final zzcfo zzh;
    private long zzi = -1;
    private zzcuo zzj;

    public zzexk(zzcnf zzcnf, Context context, String str, zzexe zzexe, zzexc zzexc, zzcfo zzcfo) {
        this.zzb = zzcnf;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzexe;
        this.zzg = zzexc;
        this.zzh = zzcfo;
        zzexc.zzo(this);
    }

    private final synchronized void zzp(int i) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcuo zzcuo = this.zzj;
            if (zzcuo != null) {
                zzt.zzb().zze(zzcuo);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzi != -1) {
                    j = zzt.zzA().elapsedRealtime() - this.zzi;
                }
                this.zza.zze(j, i);
            }
            zzx();
        }
    }

    public final synchronized void zzA() {
    }

    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zzC(zzbc zzbc) {
    }

    public final void zzD(zzbf zzbf) {
    }

    public final void zzE(zzbw zzbw) {
    }

    public final synchronized void zzF(zzq zzq) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    public final void zzG(zzbz zzbz) {
    }

    public final void zzH(zzbci zzbci) {
        this.zzg.zzr(zzbci);
    }

    public final void zzI(zzw zzw) {
        this.zzf.zzl(zzw);
    }

    public final void zzJ(zzcg zzcg) {
    }

    public final void zzK(zzdo zzdo) {
    }

    public final void zzL(boolean z) {
    }

    public final void zzM(zzbyd zzbyd) {
    }

    public final synchronized void zzN(boolean z) {
    }

    public final synchronized void zzO(zzbit zzbit) {
    }

    public final void zzP(zzde zzde) {
    }

    public final void zzQ(zzbyg zzbyg, String str) {
    }

    public final void zzR(String str) {
    }

    public final void zzS(zzcaq zzcaq) {
    }

    public final void zzT(String str) {
    }

    public final synchronized void zzU(zzfg zzfg) {
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final synchronized void zzX() {
    }

    public final synchronized boolean zzY() {
        return this.zzf.zza();
    }

    public final boolean zzZ() {
        return false;
    }

    public final void zza() {
        zzp(3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC, Splitter:B:25:0x006c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.internal.ads.zzbjm.zzd     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.zze()     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zziq     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r2.zzb(r0)     // Catch:{ all -> 0x0087 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzcfo r2 = r5.zzh     // Catch:{ all -> 0x0087 }
            int r2 = r2.zzc     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbhq r3 = com.google.android.gms.internal.ads.zzbhy.zzir     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzbhw r4 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ all -> 0x0087 }
            java.lang.Object r3 = r4.zzb(r3)     // Catch:{ all -> 0x0087 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0087 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0087 }
            if (r2 < r3) goto L_0x003d
            if (r0 != 0) goto L_0x0042
        L_0x003d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch:{ all -> 0x0087 }
        L_0x0042:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch:{ all -> 0x0087 }
            android.content.Context r0 = r5.zzc     // Catch:{ all -> 0x0087 }
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0064
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0052
            goto L_0x0064
        L_0x0052:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcfi.zzg(r6)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzexc r6 = r5.zzg     // Catch:{ all -> 0x0087 }
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfcx.zzd(r0, r2, r2)     // Catch:{ all -> 0x0087 }
            r6.zza(r0)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r1
        L_0x0064:
            boolean r0 = r5.zzY()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006c
            monitor-exit(r5)
            return r1
        L_0x006c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ all -> 0x0087 }
            r0.<init>()     // Catch:{ all -> 0x0087 }
            r5.zzd = r0     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzexi r0 = new com.google.android.gms.internal.ads.zzexi     // Catch:{ all -> 0x0087 }
            r0.<init>(r5)     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzexe r1 = r5.zzf     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r5.zze     // Catch:{ all -> 0x0087 }
            com.google.android.gms.internal.ads.zzexj r3 = new com.google.android.gms.internal.ads.zzexj     // Catch:{ all -> 0x0087 }
            r3.<init>(r5)     // Catch:{ all -> 0x0087 }
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)
            return r6
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexk.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    public final synchronized void zzab(zzcd zzcd) {
    }

    public final synchronized void zzb() {
        if (this.zza != null) {
            this.zzi = zzt.zzA().elapsedRealtime();
            int zza2 = this.zza.zza();
            if (zza2 > 0) {
                zzcuo zzcuo = new zzcuo(this.zzb.zzB(), zzt.zzA());
                this.zzj = zzcuo;
                zzcuo.zzd(zza2, new zzexh(this));
            }
        }
    }

    public final void zzbC() {
    }

    public final void zzbK() {
    }

    public final void zzbr() {
    }

    public final Bundle zzd() {
        return new Bundle();
    }

    public final synchronized void zze() {
        zzcvn zzcvn = this.zza;
        if (zzcvn != null) {
            zzcvn.zze(zzt.zzA().elapsedRealtime() - this.zzi, 1);
        }
    }

    public final void zzf(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            zzp(2);
        } else if (i2 == 1) {
            zzp(4);
        } else if (i2 == 2) {
            zzp(3);
        } else if (i2 == 3) {
            zzp(6);
        }
    }

    public final synchronized zzq zzg() {
        return null;
    }

    public final zzbf zzi() {
        return null;
    }

    public final zzbz zzj() {
        return null;
    }

    public final synchronized zzdh zzk() {
        return null;
    }

    public final synchronized zzdk zzl() {
        return null;
    }

    public final /* synthetic */ void zzm() {
        zzp(5);
    }

    public final IObjectWrapper zzn() {
        return null;
    }

    @VisibleForTesting
    public final void zzo() {
        this.zzb.zzA().execute(new zzexg(this));
    }

    public final synchronized String zzr() {
        return this.zze;
    }

    public final synchronized String zzs() {
        return null;
    }

    public final synchronized String zzt() {
        return null;
    }

    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcvn zzcvn = this.zza;
        if (zzcvn != null) {
            zzcvn.zzV();
        }
    }

    public final void zzy(zzl zzl, zzbi zzbi) {
    }

    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
