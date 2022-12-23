package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzahu implements zzys {
    public static final zzyz zza = zzahq.zza;
    private zzyv zzb;
    private zzzz zzc;
    private int zzd = 0;
    private long zze = -1;
    private zzahs zzf;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        if (r1 != 65534) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzyt r19, com.google.android.gms.internal.ads.zzzs r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.gms.internal.ads.zzzz r2 = r0.zzc
            com.google.android.gms.internal.ads.zzcw.zzb(r2)
            int r2 = com.google.android.gms.internal.ads.zzeg.zza
            int r2 = r0.zzd
            r3 = -1
            r4 = 4
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x013b
            r7 = 2
            r8 = -1
            if (r2 == r5) goto L_0x0106
            r10 = 3
            if (r2 == r7) goto L_0x0084
            if (r2 == r10) goto L_0x003c
            long r10 = r0.zzh
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzcw.zzf(r5)
            long r4 = r0.zzh
            long r7 = r19.zzf()
            long r4 = r4 - r7
            com.google.android.gms.internal.ads.zzahs r2 = r0.zzf
            r2.getClass()
            boolean r1 = r2.zzc(r1, r4)
            if (r1 == 0) goto L_0x003b
            return r3
        L_0x003b:
            return r6
        L_0x003c:
            android.util.Pair r2 = com.google.android.gms.internal.ads.zzahx.zza(r19)
            java.lang.Object r3 = r2.first
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            r0.zzg = r3
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r10 = r0.zze
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0062
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x0062
            r2 = r10
        L_0x0062:
            int r5 = r0.zzg
            long r10 = (long) r5
            long r10 = r10 + r2
            r0.zzh = r10
            long r1 = r19.zzd()
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0077
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0077
            r0.zzh = r1
            r10 = r1
        L_0x0077:
            com.google.android.gms.internal.ads.zzahs r1 = r0.zzf
            r1.getClass()
            int r2 = r0.zzg
            r1.zza(r2, r10)
            r0.zzd = r4
            return r6
        L_0x0084:
            com.google.android.gms.internal.ads.zzahv r15 = com.google.android.gms.internal.ads.zzahx.zzb(r19)
            int r1 = r15.zza
            r2 = 17
            if (r1 != r2) goto L_0x009a
            com.google.android.gms.internal.ads.zzahr r1 = new com.google.android.gms.internal.ads.zzahr
            com.google.android.gms.internal.ads.zzyv r2 = r0.zzb
            com.google.android.gms.internal.ads.zzzz r3 = r0.zzc
            r1.<init>(r2, r3, r15)
            r0.zzf = r1
            goto L_0x00ed
        L_0x009a:
            r2 = 6
            if (r1 != r2) goto L_0x00ae
            com.google.android.gms.internal.ads.zzaht r1 = new com.google.android.gms.internal.ads.zzaht
            com.google.android.gms.internal.ads.zzyv r13 = r0.zzb
            com.google.android.gms.internal.ads.zzzz r14 = r0.zzc
            r17 = -1
            java.lang.String r16 = "audio/g711-alaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zzf = r1
            goto L_0x00ed
        L_0x00ae:
            r2 = 7
            if (r1 != r2) goto L_0x00c2
            com.google.android.gms.internal.ads.zzaht r1 = new com.google.android.gms.internal.ads.zzaht
            com.google.android.gms.internal.ads.zzyv r13 = r0.zzb
            com.google.android.gms.internal.ads.zzzz r14 = r0.zzc
            r17 = -1
            java.lang.String r16 = "audio/g711-mlaw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zzf = r1
            goto L_0x00ed
        L_0x00c2:
            int r2 = r15.zze
            if (r1 == r5) goto L_0x00d7
            if (r1 == r10) goto L_0x00d0
            r3 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r3) goto L_0x00d7
        L_0x00cd:
            r17 = 0
            goto L_0x00dd
        L_0x00d0:
            r3 = 32
            if (r2 != r3) goto L_0x00cd
            r17 = 4
            goto L_0x00dd
        L_0x00d7:
            int r4 = com.google.android.gms.internal.ads.zzeg.zzn(r2)
            r17 = r4
        L_0x00dd:
            if (r17 == 0) goto L_0x00f0
            com.google.android.gms.internal.ads.zzaht r1 = new com.google.android.gms.internal.ads.zzaht
            com.google.android.gms.internal.ads.zzyv r13 = r0.zzb
            com.google.android.gms.internal.ads.zzzz r14 = r0.zzc
            java.lang.String r16 = "audio/raw"
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r0.zzf = r1
        L_0x00ed:
            r0.zzd = r10
            return r6
        L_0x00f0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unsupported WAV format type: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zzc(r1)
            throw r1
        L_0x0106:
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            r3 = 8
            r2.<init>((int) r3)
            com.google.android.gms.internal.ads.zzahw r4 = com.google.android.gms.internal.ads.zzahw.zza(r1, r2)
            int r5 = r4.zza
            r10 = 1685272116(0x64733634, float:1.7945858E22)
            if (r5 == r10) goto L_0x011c
            r19.zzj()
            goto L_0x0136
        L_0x011c:
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r1.zzl(r3, r6)
            r2.zzF(r6)
            byte[] r5 = r2.zzH()
            r1.zzm(r5, r6, r3, r6)
            long r8 = r2.zzp()
            long r4 = r4.zzb
            int r2 = (int) r4
            int r2 = r2 + r3
            r1.zzo(r2, r6)
        L_0x0136:
            r0.zze = r8
            r0.zzd = r7
            return r6
        L_0x013b:
            long r7 = r19.zzf()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0147
            r2 = 1
            goto L_0x0148
        L_0x0147:
            r2 = 0
        L_0x0148:
            com.google.android.gms.internal.ads.zzcw.zzf(r2)
            int r2 = r0.zzg
            if (r2 == r3) goto L_0x0157
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r1.zzo(r2, r6)
            r0.zzd = r4
            goto L_0x016e
        L_0x0157:
            boolean r2 = com.google.android.gms.internal.ads.zzahx.zzc(r19)
            if (r2 == 0) goto L_0x016f
            long r2 = r19.zze()
            long r7 = r19.zzf()
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            long r2 = r2 - r7
            int r3 = (int) r2
            r1.zzo(r3, r6)
            r0.zzd = r5
        L_0x016e:
            return r6
        L_0x016f:
            r1 = 0
            java.lang.String r2 = "Unsupported or unrecognized wav file type."
            com.google.android.gms.internal.ads.zzbp r1 = com.google.android.gms.internal.ads.zzbp.zza(r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahu.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    public final void zzb(zzyv zzyv) {
        this.zzb = zzyv;
        this.zzc = zzyv.zzv(0, 1);
        zzyv.zzB();
    }

    public final void zzc(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzahs zzahs = this.zzf;
        if (zzahs != null) {
            zzahs.zzb(j2);
        }
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        return zzahx.zzc(zzyt);
    }
}
