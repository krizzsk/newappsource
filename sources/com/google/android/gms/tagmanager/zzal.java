package com.google.android.gms.tagmanager;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzaa;
import com.google.android.gms.internal.gtm.zzai;
import com.google.android.gms.internal.gtm.zzrk;
import com.google.android.gms.internal.gtm.zzrl;
import com.google.android.gms.internal.gtm.zzrm;
import com.google.android.gms.internal.gtm.zzrs;

@ShowFirstParty
public final class zzal extends BasePendingResult<ContainerHolder> {
    /* access modifiers changed from: private */
    public final Clock zza;
    private final zzai zzb;
    private final Looper zzc;
    /* access modifiers changed from: private */
    public final zzec zzd;
    private final int zze;
    private final Context zzf;
    private final TagManager zzg;
    private final String zzh;
    /* access modifiers changed from: private */
    public final zzam zzi;
    private zzak zzj;
    private final zzrm zzk;
    /* access modifiers changed from: private */
    public volatile zzaa zzl;
    /* access modifiers changed from: private */
    public volatile boolean zzm;
    /* access modifiers changed from: private */
    public zzai zzn;
    /* access modifiers changed from: private */
    public long zzo;
    private String zzp;
    private zzaj zzq;
    private zzac zzr;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzal(android.content.Context r22, com.google.android.gms.tagmanager.TagManager r23, android.os.Looper r24, java.lang.String r25, int r26, com.google.android.gms.tagmanager.zzap r27) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            r9 = r25
            com.google.android.gms.tagmanager.zzem r10 = new com.google.android.gms.tagmanager.zzem
            r10.<init>(r8, r9)
            com.google.android.gms.tagmanager.zzej r11 = new com.google.android.gms.tagmanager.zzej
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r11
            r2 = r22
            r3 = r25
            r4 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.android.gms.internal.gtm.zzrm r1 = new com.google.android.gms.internal.gtm.zzrm
            r1.<init>(r8)
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.common.util.DefaultClock.getInstance()
            com.google.android.gms.tagmanager.zzdf r3 = new com.google.android.gms.tagmanager.zzdf
            com.google.android.gms.common.util.Clock r20 = com.google.android.gms.common.util.DefaultClock.getInstance()
            r13 = 1
            r14 = 5
            r15 = 900000(0xdbba0, double:4.44659E-318)
            r17 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r19 = "refreshing"
            r12 = r3
            r12.<init>(r13, r14, r15, r17, r19, r20)
            com.google.android.gms.tagmanager.zzam r4 = new com.google.android.gms.tagmanager.zzam
            r4.<init>(r8, r9)
            if (r24 != 0) goto L_0x0042
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            goto L_0x0044
        L_0x0042:
            r5 = r24
        L_0x0044:
            r0.<init>((android.os.Looper) r5)
            r0.zzf = r8
            r5 = r23
            r0.zzg = r5
            if (r24 != 0) goto L_0x0054
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            goto L_0x0056
        L_0x0054:
            r5 = r24
        L_0x0056:
            r0.zzc = r5
            r0.zzh = r9
            r5 = r26
            r0.zze = r5
            r0.zzj = r10
            r0.zzq = r11
            r0.zzk = r1
            com.google.android.gms.tagmanager.zzai r1 = new com.google.android.gms.tagmanager.zzai
            r5 = 0
            r1.<init>(r0, r5)
            r0.zzb = r1
            com.google.android.gms.internal.gtm.zzah r1 = com.google.android.gms.internal.gtm.zzai.zzd()
            com.google.android.gms.internal.gtm.zzuz r1 = r1.zzC()
            com.google.android.gms.internal.gtm.zzai r1 = (com.google.android.gms.internal.gtm.zzai) r1
            r0.zzn = r1
            r0.zza = r2
            r0.zzd = r3
            r0.zzi = r4
            boolean r1 = r21.zzv()
            if (r1 == 0) goto L_0x008f
            com.google.android.gms.tagmanager.zzea r1 = com.google.android.gms.tagmanager.zzea.zza()
            java.lang.String r1 = r1.zzb()
            r0.zzo(r1)
        L_0x008f:
            r27.zza()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzal.<init>(android.content.Context, com.google.android.gms.tagmanager.TagManager, android.os.Looper, java.lang.String, int, com.google.android.gms.tagmanager.zzap):void");
    }

    /* access modifiers changed from: private */
    public final synchronized void zzr(long j) {
        zzaj zzaj = this.zzq;
        if (zzaj == null) {
            zzdh.zzc("Refresh requested, but no network load scheduler.");
        } else {
            zzaj.zza(j, this.zzn.zzh());
        }
    }

    private final void zzs(boolean z) {
        this.zzj.zzd(new zzae(this, (zzad) null));
        this.zzq.zzc(new zzag(this, (zzaf) null));
        zzrs zza2 = this.zzj.zza(this.zze);
        if (zza2 != null) {
            TagManager tagManager = this.zzg;
            this.zzl = new zzaa(tagManager, this.zzc, new Container(this.zzf, tagManager.getDataLayer(), this.zzh, 0, zza2), this.zzb);
        }
        this.zzr = new zzac(this, z);
        if (zzv()) {
            this.zzq.zza(0, "");
        } else {
            this.zzj.zzb();
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zzt(zzai zzai) {
        if (this.zzj != null) {
            zzrk zze2 = zzrl.zze();
            zze2.zzc(0);
            zze2.zza(zzaa.zzl());
            zze2.zzc(this.zzo);
            zze2.zza((zzaa) zzaa.zzj().zzC());
            zze2.zzb(zzai);
            this.zzj.zzc((zzrl) zze2.zzC());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzu(com.google.android.gms.internal.gtm.zzai r10, long r11, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r13 = r9.isReady()     // Catch:{ all -> 0x006f }
            if (r13 == 0) goto L_0x000e
            com.google.android.gms.tagmanager.zzaa r13 = r9.zzl     // Catch:{ all -> 0x006f }
            if (r13 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            monitor-exit(r9)
            return
        L_0x000e:
            r9.zzn = r10     // Catch:{ all -> 0x006f }
            r9.zzo = r11     // Catch:{ all -> 0x006f }
            com.google.android.gms.tagmanager.zzam r13 = r9.zzi     // Catch:{ all -> 0x006f }
            long r0 = r13.zza()     // Catch:{ all -> 0x006f }
            r2 = 0
            long r4 = r9.zzo     // Catch:{ all -> 0x006f }
            long r4 = r4 + r0
            com.google.android.gms.common.util.Clock r13 = r9.zza     // Catch:{ all -> 0x006f }
            long r6 = r13.currentTimeMillis()     // Catch:{ all -> 0x006f }
            long r4 = r4 - r6
            long r0 = java.lang.Math.min(r0, r4)     // Catch:{ all -> 0x006f }
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x006f }
            r9.zzr(r0)     // Catch:{ all -> 0x006f }
            com.google.android.gms.tagmanager.Container r13 = new com.google.android.gms.tagmanager.Container     // Catch:{ all -> 0x006f }
            android.content.Context r3 = r9.zzf     // Catch:{ all -> 0x006f }
            com.google.android.gms.tagmanager.TagManager r0 = r9.zzg     // Catch:{ all -> 0x006f }
            com.google.android.gms.tagmanager.DataLayer r4 = r0.getDataLayer()     // Catch:{ all -> 0x006f }
            java.lang.String r5 = r9.zzh     // Catch:{ all -> 0x006f }
            r2 = r13
            r6 = r11
            r8 = r10
            r2.<init>((android.content.Context) r3, (com.google.android.gms.tagmanager.DataLayer) r4, (java.lang.String) r5, (long) r6, (com.google.android.gms.internal.gtm.zzai) r8)     // Catch:{ all -> 0x006f }
            com.google.android.gms.tagmanager.zzaa r10 = r9.zzl     // Catch:{ all -> 0x006f }
            if (r10 != 0) goto L_0x0053
            com.google.android.gms.tagmanager.zzaa r10 = new com.google.android.gms.tagmanager.zzaa     // Catch:{ all -> 0x006f }
            com.google.android.gms.tagmanager.TagManager r11 = r9.zzg     // Catch:{ all -> 0x006f }
            android.os.Looper r12 = r9.zzc     // Catch:{ all -> 0x006f }
            com.google.android.gms.tagmanager.zzai r0 = r9.zzb     // Catch:{ all -> 0x006f }
            r10.<init>(r11, r12, r13, r0)     // Catch:{ all -> 0x006f }
            r9.zzl = r10     // Catch:{ all -> 0x006f }
            goto L_0x0058
        L_0x0053:
            com.google.android.gms.tagmanager.zzaa r10 = r9.zzl     // Catch:{ all -> 0x006f }
            r10.zzc(r13)     // Catch:{ all -> 0x006f }
        L_0x0058:
            boolean r10 = r9.isReady()     // Catch:{ all -> 0x006f }
            if (r10 != 0) goto L_0x006d
            com.google.android.gms.tagmanager.zzac r10 = r9.zzr     // Catch:{ all -> 0x006f }
            boolean r10 = r10.zza(r13)     // Catch:{ all -> 0x006f }
            if (r10 == 0) goto L_0x006d
            com.google.android.gms.tagmanager.zzaa r10 = r9.zzl     // Catch:{ all -> 0x006f }
            r9.setResult(r10)     // Catch:{ all -> 0x006f }
            monitor-exit(r9)
            return
        L_0x006d:
            monitor-exit(r9)
            return
        L_0x006f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzal.zzu(com.google.android.gms.internal.gtm.zzai, long, boolean):void");
    }

    /* access modifiers changed from: private */
    public final boolean zzv() {
        zzea zza2 = zzea.zza();
        if ((zza2.zze() == 2 || zza2.zze() == 3) && this.zzh.equals(zza2.zzc())) {
            return true;
        }
        return false;
    }

    /* renamed from: zzd */
    public final ContainerHolder createFailedResult(Status status) {
        if (this.zzl != null) {
            return this.zzl;
        }
        if (status == Status.RESULT_TIMEOUT) {
            zzdh.zza("timer expired: setting result to failure");
        }
        return new zzaa(status);
    }

    public final synchronized String zzh() {
        return this.zzp;
    }

    public final void zzl() {
        zzrs zza2 = this.zzj.zza(this.zze);
        if (zza2 != null) {
            setResult(new zzaa(this.zzg, this.zzc, new Container(this.zzf, this.zzg.getDataLayer(), this.zzh, 0, zza2), new zzab(this)));
        } else {
            zzdh.zza("Default was requested, but no default container was found");
            setResult(createFailedResult(new Status(10, "Default was requested, but no default container was found", (PendingIntent) null)));
        }
        this.zzq = null;
        this.zzj = null;
    }

    public final void zzm() {
        zzs(true);
    }

    public final void zzn() {
        zzs(false);
    }

    @VisibleForTesting
    public final synchronized void zzo(String str) {
        this.zzp = str;
        zzaj zzaj = this.zzq;
        if (zzaj != null) {
            zzaj.zzb(str);
        }
    }
}
