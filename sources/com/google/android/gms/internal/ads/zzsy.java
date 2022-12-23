package com.google.android.gms.internal.ads;

import android.net.Uri;

final class zzsy implements zzwg, zzrq {
    public final /* synthetic */ zztd zza;
    /* access modifiers changed from: private */
    public final long zzb = zzrs.zza();
    private final Uri zzc;
    /* access modifiers changed from: private */
    public final zzfs zzd;
    private final zzsu zze;
    private final zzyv zzf;
    private final zzcz zzg;
    private final zzzs zzh = new zzzs();
    private volatile boolean zzi;
    private boolean zzj = true;
    /* access modifiers changed from: private */
    public long zzk;
    /* access modifiers changed from: private */
    public zzew zzl = zzj(0);
    /* access modifiers changed from: private */
    public long zzm = -1;
    private zzzz zzn;
    private boolean zzo;

    public zzsy(zztd zztd, Uri uri, zzer zzer, zzsu zzsu, zzyv zzyv, zzcz zzcz) {
        this.zza = zztd;
        this.zzc = uri;
        this.zzd = new zzfs(zzer);
        this.zze = zzsu;
        this.zzf = zzyv;
        this.zzg = zzcz;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzsy zzsy, long j, long j2) {
        zzsy.zzh.zza = j;
        zzsy.zzk = j2;
        zzsy.zzj = true;
        zzsy.zzo = false;
    }

    private final zzew zzj(long j) {
        zzeu zzeu = new zzeu();
        zzeu.zzd(this.zzc);
        zzeu.zzc(j);
        zzeu.zza(6);
        zzeu.zzb(zztd.zzb);
        return zzeu.zze();
    }

    public final void zza(zzdy zzdy) {
        long j;
        if (!this.zzo) {
            j = this.zzk;
        } else {
            j = Math.max(this.zza.zzO(), this.zzk);
        }
        int zza2 = zzdy.zza();
        zzzz zzzz = this.zzn;
        zzzz.getClass();
        zzzx.zzb(zzzz, zzdy, zza2);
        zzzz.zzs(j, 1, zza2, 0, (zzzy) null);
        this.zzo = true;
    }

    public final void zzh() {
        this.zzi = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x018a A[EDGE_INSN: B:101:0x018a->B:84:0x018a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078 A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082 A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098 A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4 A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4 A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0 A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00df A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0116 A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0133 A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013c A[Catch:{ NumberFormatException -> 0x004b, all -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0149 A[SYNTHETIC, Splitter:B:69:0x0149] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi() throws java.io.IOException {
        /*
            r23 = this;
            r1 = r23
        L_0x0002:
            boolean r0 = r1.zzi
            if (r0 != 0) goto L_0x01c7
            r2 = -1
            r4 = 1
            r5 = 0
            com.google.android.gms.internal.ads.zzzs r0 = r1.zzh     // Catch:{ all -> 0x01aa }
            long r14 = r0.zza     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzew r0 = r1.zzj(r14)     // Catch:{ all -> 0x01aa }
            r1.zzl = r0     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzfs r6 = r1.zzd     // Catch:{ all -> 0x01aa }
            long r6 = r6.zzb(r0)     // Catch:{ all -> 0x01aa }
            r1.zzm = r6     // Catch:{ all -> 0x01aa }
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            long r6 = r6 + r14
            r1.zzm = r6     // Catch:{ all -> 0x01aa }
        L_0x0023:
            com.google.android.gms.internal.ads.zztd r0 = r1.zza     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzfs r6 = r1.zzd     // Catch:{ all -> 0x01aa }
            java.util.Map r6 = r6.zze()     // Catch:{ all -> 0x01aa }
            java.lang.String r7 = "icy-br"
            java.lang.Object r7 = r6.get(r7)     // Catch:{ all -> 0x01aa }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x01aa }
            r8 = -1
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x01aa }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01aa }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x004b }
            int r7 = r7 * 1000
            if (r7 <= 0) goto L_0x0046
            r9 = 1
            goto L_0x0048
        L_0x0046:
            r7 = -1
            r9 = 0
        L_0x0048:
            r17 = r7
            goto L_0x0057
        L_0x004b:
            java.lang.String r9 = "Invalid bitrate header: "
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x01aa }
            r9.concat(r7)     // Catch:{ all -> 0x01aa }
        L_0x0054:
            r9 = 0
            r17 = -1
        L_0x0057:
            java.lang.String r7 = "icy-genre"
            java.lang.Object r7 = r6.get(r7)     // Catch:{ all -> 0x01aa }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x01aa }
            r10 = 0
            if (r7 == 0) goto L_0x006c
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x01aa }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01aa }
            r18 = r7
            r9 = 1
            goto L_0x006e
        L_0x006c:
            r18 = r10
        L_0x006e:
            java.lang.String r7 = "icy-name"
            java.lang.Object r7 = r6.get(r7)     // Catch:{ all -> 0x01aa }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x0082
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x01aa }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01aa }
            r19 = r7
            r9 = 1
            goto L_0x0084
        L_0x0082:
            r19 = r10
        L_0x0084:
            java.lang.String r7 = "icy-url"
            java.lang.Object r7 = r6.get(r7)     // Catch:{ all -> 0x01aa }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x0098
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x01aa }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01aa }
            r20 = r7
            r9 = 1
            goto L_0x009a
        L_0x0098:
            r20 = r10
        L_0x009a:
            java.lang.String r7 = "icy-pub"
            java.lang.Object r7 = r6.get(r7)     // Catch:{ all -> 0x01aa }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x00b4
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x01aa }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x01aa }
            java.lang.String r9 = "1"
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x01aa }
            r21 = r7
            r9 = 1
            goto L_0x00b6
        L_0x00b4:
            r21 = 0
        L_0x00b6:
            java.lang.String r7 = "icy-metaint"
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x01aa }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x01aa }
            if (r6 == 0) goto L_0x00db
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x01aa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01aa }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00d2 }
            if (r6 <= 0) goto L_0x00ce
            r9 = 1
            goto L_0x00cf
        L_0x00ce:
            r6 = -1
        L_0x00cf:
            r22 = r6
            goto L_0x00dd
        L_0x00d2:
            java.lang.String r7 = "Invalid metadata interval: "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01aa }
            r7.concat(r6)     // Catch:{ all -> 0x01aa }
        L_0x00db:
            r22 = -1
        L_0x00dd:
            if (r9 == 0) goto L_0x00e6
            com.google.android.gms.internal.ads.zzabl r10 = new com.google.android.gms.internal.ads.zzabl     // Catch:{ all -> 0x01aa }
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x01aa }
        L_0x00e6:
            r0.zzr = r10     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzfs r0 = r1.zzd     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zztd r6 = r1.zza     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzabl r7 = r6.zzr     // Catch:{ all -> 0x01aa }
            if (r7 == 0) goto L_0x0116
            com.google.android.gms.internal.ads.zzabl r7 = r6.zzr     // Catch:{ all -> 0x01aa }
            int r7 = r7.zzf     // Catch:{ all -> 0x01aa }
            if (r7 == r8) goto L_0x0116
            com.google.android.gms.internal.ads.zzrr r7 = new com.google.android.gms.internal.ads.zzrr     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzabl r6 = r6.zzr     // Catch:{ all -> 0x01aa }
            int r6 = r6.zzf     // Catch:{ all -> 0x01aa }
            r7.<init>(r0, r6, r1)     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zztd r0 = r1.zza     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzzz r0 = r0.zzu()     // Catch:{ all -> 0x01aa }
            r1.zzn = r0     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzad r6 = com.google.android.gms.internal.ads.zztd.zzc     // Catch:{ all -> 0x01aa }
            r0.zzk(r6)     // Catch:{ all -> 0x01aa }
            goto L_0x0117
        L_0x0116:
            r7 = r0
        L_0x0117:
            com.google.android.gms.internal.ads.zzsu r6 = r1.zze     // Catch:{ all -> 0x01aa }
            android.net.Uri r8 = r1.zzc     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzfs r0 = r1.zzd     // Catch:{ all -> 0x01aa }
            java.util.Map r9 = r0.zze()     // Catch:{ all -> 0x01aa }
            long r12 = r1.zzm     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzyv r0 = r1.zzf     // Catch:{ all -> 0x01aa }
            r10 = r14
            r2 = r14
            r14 = r0
            r6.zzd(r7, r8, r9, r10, r12, r14)     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zztd r0 = r1.zza     // Catch:{ all -> 0x01aa }
            com.google.android.gms.internal.ads.zzabl r0 = r0.zzr     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0138
            com.google.android.gms.internal.ads.zzsu r0 = r1.zze     // Catch:{ all -> 0x01aa }
            r0.zzc()     // Catch:{ all -> 0x01aa }
        L_0x0138:
            boolean r0 = r1.zzj     // Catch:{ all -> 0x01aa }
            if (r0 == 0) goto L_0x0145
            com.google.android.gms.internal.ads.zzsu r0 = r1.zze     // Catch:{ all -> 0x01aa }
            long r6 = r1.zzk     // Catch:{ all -> 0x01aa }
            r0.zzf(r2, r6)     // Catch:{ all -> 0x01aa }
            r1.zzj = r5     // Catch:{ all -> 0x01aa }
        L_0x0145:
            r14 = r2
            r2 = 0
        L_0x0147:
            if (r2 != 0) goto L_0x018a
            boolean r0 = r1.zzi     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x0185
            com.google.android.gms.internal.ads.zzcz r0 = r1.zzg     // Catch:{ InterruptedException -> 0x017f }
            r0.zza()     // Catch:{ InterruptedException -> 0x017f }
            com.google.android.gms.internal.ads.zzsu r0 = r1.zze     // Catch:{ all -> 0x0187 }
            com.google.android.gms.internal.ads.zzzs r3 = r1.zzh     // Catch:{ all -> 0x0187 }
            int r2 = r0.zza(r3)     // Catch:{ all -> 0x0187 }
            com.google.android.gms.internal.ads.zzsu r0 = r1.zze     // Catch:{ all -> 0x0187 }
            long r6 = r0.zzb()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.internal.ads.zztd r0 = r1.zza     // Catch:{ all -> 0x0187 }
            long r8 = r0.zzj     // Catch:{ all -> 0x0187 }
            long r8 = r8 + r14
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0147
            com.google.android.gms.internal.ads.zzcz r0 = r1.zzg     // Catch:{ all -> 0x0187 }
            r0.zzc()     // Catch:{ all -> 0x0187 }
            com.google.android.gms.internal.ads.zztd r0 = r1.zza     // Catch:{ all -> 0x0187 }
            android.os.Handler r3 = r0.zzp     // Catch:{ all -> 0x0187 }
            java.lang.Runnable r0 = r0.zzo     // Catch:{ all -> 0x0187 }
            r3.post(r0)     // Catch:{ all -> 0x0187 }
            r14 = r6
            goto L_0x0147
        L_0x017f:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0187 }
            r0.<init>()     // Catch:{ all -> 0x0187 }
            throw r0     // Catch:{ all -> 0x0187 }
        L_0x0185:
            r2 = 0
            goto L_0x018a
        L_0x0187:
            r0 = move-exception
            r5 = r2
            goto L_0x01ab
        L_0x018a:
            if (r2 != r4) goto L_0x018d
            goto L_0x01a2
        L_0x018d:
            com.google.android.gms.internal.ads.zzsu r0 = r1.zze
            long r3 = r0.zzb()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x01a1
            com.google.android.gms.internal.ads.zzzs r3 = r1.zzh
            long r4 = r0.zzb()
            r3.zza = r4
        L_0x01a1:
            r5 = r2
        L_0x01a2:
            com.google.android.gms.internal.ads.zzfs r0 = r1.zzd
            com.google.android.gms.internal.ads.zzet.zza(r0)
            if (r5 == 0) goto L_0x0002
            goto L_0x01c7
        L_0x01aa:
            r0 = move-exception
        L_0x01ab:
            if (r5 == r4) goto L_0x01c1
            com.google.android.gms.internal.ads.zzsu r2 = r1.zze
            long r3 = r2.zzb()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x01c1
            com.google.android.gms.internal.ads.zzzs r3 = r1.zzh
            long r4 = r2.zzb()
            r3.zza = r4
        L_0x01c1:
            com.google.android.gms.internal.ads.zzfs r2 = r1.zzd
            com.google.android.gms.internal.ads.zzet.zza(r2)
            throw r0
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zzi():void");
    }
}
