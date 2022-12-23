package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzcka extends zzcju implements zzayx {
    private String zzd;
    private final zzchq zze;
    private boolean zzf;
    private final zzcjz zzg = new zzcjz();
    private final zzcjf zzh = new zzcjf();
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk = new Object();
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcka(zzchr zzchr, zzchq zzchq) {
        super(zzchr);
        String str;
        int i;
        this.zze = zzchq;
        if (zzchr != null) {
            str = zzchr.zzt();
        } else {
            str = "";
        }
        this.zzl = str;
        if (zzchr != null) {
            i = zzchr.zzh();
        } else {
            i = 0;
        }
        this.zzm = i;
    }

    public static final String zzt(String str) {
        return "cache:".concat(String.valueOf(zzcfb.zze(str)));
    }

    private final void zzu() {
        boolean z;
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((((float) position) / ((float) zza)) * ((float) zza2));
        if (round > 0) {
            z = true;
        } else {
            z = false;
        }
        int zzs = zzchi.zzs();
        int zzu = zzchi.zzu();
        String str = this.zzd;
        zzf(str, zzt(str), position, zza, (long) round, (long) zza2, z, zzs, zzu);
    }

    public final void zzb() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i) {
    }

    public final /* bridge */ /* synthetic */ void zzk(Object obj, zzayk zzayk) {
        this.zzg.zzb((zzaym) obj);
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzm() {
        return this.zzn;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.google.android.gms.internal.ads.zzaym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.android.gms.internal.ads.zzaym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.gms.internal.ads.zzaym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: com.google.android.gms.internal.ads.zzaym} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.google.android.gms.internal.ads.zzcin} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: com.google.android.gms.internal.ads.zzaym} */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzq(java.lang.String r25) {
        /*
            r24 = this;
            r9 = r24
            r10 = r25
            r9.zzd = r10
            java.lang.String r11 = zzt(r25)
            java.lang.String r12 = "error"
            com.google.android.gms.internal.ads.zzaym r0 = new com.google.android.gms.internal.ads.zzaym     // Catch:{ Exception -> 0x0151 }
            java.lang.String r2 = r9.zzb     // Catch:{ Exception -> 0x0151 }
            com.google.android.gms.internal.ads.zzchq r1 = r9.zze     // Catch:{ Exception -> 0x0151 }
            int r5 = r1.zzd     // Catch:{ Exception -> 0x0151 }
            r3 = 0
            int r6 = r1.zzf     // Catch:{ Exception -> 0x0151 }
            r7 = 1
            r8 = 0
            r1 = r0
            r4 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0151 }
            com.google.android.gms.internal.ads.zzchq r1 = r9.zze     // Catch:{ Exception -> 0x0151 }
            boolean r1 = r1.zzj     // Catch:{ Exception -> 0x0151 }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.internal.ads.zzcin r13 = new com.google.android.gms.internal.ads.zzcin     // Catch:{ Exception -> 0x0151 }
            android.content.Context r2 = r9.zza     // Catch:{ Exception -> 0x0151 }
            java.lang.String r4 = r9.zzl     // Catch:{ Exception -> 0x0151 }
            int r5 = r9.zzm     // Catch:{ Exception -> 0x0151 }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r13
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0151 }
            r0 = r13
        L_0x0036:
            android.net.Uri r14 = android.net.Uri.parse(r25)     // Catch:{ Exception -> 0x0151 }
            com.google.android.gms.internal.ads.zzayk r1 = new com.google.android.gms.internal.ads.zzayk     // Catch:{ Exception -> 0x0151 }
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = -1
            r22 = 0
            r23 = 0
            r13 = r1
            r13.<init>(r14, r15, r16, r18, r20, r22, r23)     // Catch:{ Exception -> 0x0151 }
            r0.zzb(r1)     // Catch:{ Exception -> 0x0151 }
            java.lang.ref.WeakReference r1 = r9.zzc     // Catch:{ Exception -> 0x0151 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x0151 }
            com.google.android.gms.internal.ads.zzchr r1 = (com.google.android.gms.internal.ads.zzchr) r1     // Catch:{ Exception -> 0x0151 }
            if (r1 == 0) goto L_0x005b
            r1.zzv(r11, r9)     // Catch:{ Exception -> 0x0151 }
        L_0x005b:
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzt.zzA()     // Catch:{ Exception -> 0x0151 }
            long r2 = r1.currentTimeMillis()     // Catch:{ Exception -> 0x0151 }
            com.google.android.gms.internal.ads.zzbhq r4 = com.google.android.gms.internal.ads.zzbhy.zzw     // Catch:{ Exception -> 0x0151 }
            com.google.android.gms.internal.ads.zzbhw r5 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ Exception -> 0x0151 }
            java.lang.Object r4 = r5.zzb(r4)     // Catch:{ Exception -> 0x0151 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0151 }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x0151 }
            com.google.android.gms.internal.ads.zzbhq r6 = com.google.android.gms.internal.ads.zzbhy.zzv     // Catch:{ Exception -> 0x0151 }
            com.google.android.gms.internal.ads.zzbhw r7 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch:{ Exception -> 0x0151 }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ Exception -> 0x0151 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ Exception -> 0x0151 }
            long r6 = r6.longValue()     // Catch:{ Exception -> 0x0151 }
            com.google.android.gms.internal.ads.zzchq r8 = r9.zze     // Catch:{ Exception -> 0x0151 }
            int r8 = r8.zzc     // Catch:{ Exception -> 0x0151 }
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ Exception -> 0x0151 }
            r9.zzi = r8     // Catch:{ Exception -> 0x0151 }
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r13 = new byte[r8]     // Catch:{ Exception -> 0x0151 }
            r14 = r2
            r16 = r12
        L_0x0094:
            java.nio.ByteBuffer r12 = r9.zzi     // Catch:{ Exception -> 0x0140 }
            int r12 = r12.remaining()     // Catch:{ Exception -> 0x0140 }
            int r8 = java.lang.Math.min(r12, r8)     // Catch:{ Exception -> 0x0140 }
            r12 = 0
            int r8 = r0.zza(r13, r12, r8)     // Catch:{ Exception -> 0x0140 }
            r12 = -1
            r17 = r0
            r0 = 1
            if (r8 != r12) goto L_0x00b9
            r9.zzn = r0     // Catch:{ Exception -> 0x0140 }
            com.google.android.gms.internal.ads.zzcjf r1 = r9.zzh     // Catch:{ Exception -> 0x0140 }
            java.nio.ByteBuffer r2 = r9.zzi     // Catch:{ Exception -> 0x0140 }
            long r1 = r1.zza(r2)     // Catch:{ Exception -> 0x0140 }
            int r2 = (int) r1     // Catch:{ Exception -> 0x0140 }
            long r1 = (long) r2     // Catch:{ Exception -> 0x0140 }
            r9.zze(r10, r11, r1)     // Catch:{ Exception -> 0x0140 }
            goto L_0x00d3
        L_0x00b9:
            java.lang.Object r12 = r9.zzk     // Catch:{ Exception -> 0x0140 }
            monitor-enter(r12)     // Catch:{ Exception -> 0x0140 }
            boolean r0 = r9.zzf     // Catch:{ all -> 0x0145 }
            if (r0 != 0) goto L_0x00c6
            java.nio.ByteBuffer r0 = r9.zzi     // Catch:{ all -> 0x0145 }
            r10 = 0
            r0.put(r13, r10, r8)     // Catch:{ all -> 0x0145 }
        L_0x00c6:
            monitor-exit(r12)     // Catch:{ all -> 0x0145 }
            java.nio.ByteBuffer r0 = r9.zzi     // Catch:{ Exception -> 0x0140 }
            int r0 = r0.remaining()     // Catch:{ Exception -> 0x0140 }
            if (r0 > 0) goto L_0x00d4
            r24.zzu()     // Catch:{ Exception -> 0x0140 }
            r0 = 1
        L_0x00d3:
            return r0
        L_0x00d4:
            boolean r0 = r9.zzf     // Catch:{ Exception -> 0x0140 }
            if (r0 != 0) goto L_0x0116
            long r18 = r1.currentTimeMillis()     // Catch:{ Exception -> 0x0140 }
            long r20 = r18 - r14
            int r0 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00e7
            r24.zzu()     // Catch:{ Exception -> 0x0140 }
            r14 = r18
        L_0x00e7:
            long r18 = r18 - r2
            r20 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r6
            int r0 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x00f8
            r8 = 8192(0x2000, float:1.14794E-41)
            r10 = r25
            r0 = r17
            goto L_0x0094
        L_0x00f8:
            java.lang.String r1 = "downloadTimeout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a }
            r0.<init>()     // Catch:{ Exception -> 0x013a }
            java.lang.String r2 = "Timeout exceeded. Limit: "
            r0.append(r2)     // Catch:{ Exception -> 0x013a }
            r0.append(r6)     // Catch:{ Exception -> 0x013a }
            java.lang.String r2 = " sec"
            r0.append(r2)     // Catch:{ Exception -> 0x013a }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ Exception -> 0x013a }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x013a }
            r2.<init>(r0)     // Catch:{ Exception -> 0x013a }
            throw r2     // Catch:{ Exception -> 0x013a }
        L_0x0116:
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x013a }
            java.nio.ByteBuffer r2 = r9.zzi     // Catch:{ Exception -> 0x013a }
            int r2 = r2.limit()     // Catch:{ Exception -> 0x013a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a }
            r3.<init>()     // Catch:{ Exception -> 0x013a }
            java.lang.String r4 = "Precache abort at "
            r3.append(r4)     // Catch:{ Exception -> 0x013a }
            r3.append(r2)     // Catch:{ Exception -> 0x013a }
            java.lang.String r2 = " bytes"
            r3.append(r2)     // Catch:{ Exception -> 0x013a }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x013a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x013a }
            throw r0     // Catch:{ Exception -> 0x013a }
        L_0x013a:
            r0 = move-exception
            r12 = r1
            r2 = r9
            r1 = r25
            goto L_0x0155
        L_0x0140:
            r0 = move-exception
        L_0x0141:
            r1 = r25
            r2 = r9
            goto L_0x014c
        L_0x0145:
            r0 = move-exception
            r1 = r25
            r2 = r9
        L_0x0149:
            monitor-exit(r12)     // Catch:{ all -> 0x014f }
            throw r0     // Catch:{ Exception -> 0x014b }
        L_0x014b:
            r0 = move-exception
        L_0x014c:
            r12 = r16
            goto L_0x0155
        L_0x014f:
            r0 = move-exception
            goto L_0x0149
        L_0x0151:
            r0 = move-exception
            r16 = r12
            goto L_0x0141
        L_0x0155:
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = ":"
            java.lang.String r0 = p358af.C13437d.m33706k(r3, r4, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to preload url "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " Exception: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzcfi.zzj(r3)
            r2.zzc(r1, r11, r12, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcka.zzq(java.lang.String):boolean");
    }
}
