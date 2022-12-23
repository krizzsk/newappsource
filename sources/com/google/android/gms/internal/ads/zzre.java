package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzre implements zzsu {
    private final zzyz zza;
    private zzys zzb;
    private zzyt zzc;

    public zzre(zzyz zzyz) {
        this.zza = zzyz;
    }

    public final int zza(zzzs zzzs) throws IOException {
        zzys zzys = this.zzb;
        zzys.getClass();
        zzyt zzyt = this.zzc;
        zzyt.getClass();
        return zzys.zza(zzyt, zzzs);
    }

    public final long zzb() {
        zzyt zzyt = this.zzc;
        if (zzyt != null) {
            return zzyt.zzf();
        }
        return -1;
    }

    public final void zzc() {
        zzys zzys = this.zzb;
        if (zzys instanceof zzadp) {
            ((zzadp) zzys).zze();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r0.zzf() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        if (r0.zzf() != r11) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.internal.ads.zzp r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzyv r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzym r6 = new com.google.android.gms.internal.ads.zzym
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzys r8 = r7.zzb
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.android.gms.internal.ads.zzyz r8 = r7.zza
            com.google.android.gms.internal.ads.zzys[] r8 = r8.zzb(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.zzb = r8
            goto L_0x0074
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 >= r10) goto L_0x0070
            r1 = r8[r0]
            boolean r2 = r1.zzd(r6)     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            if (r2 == 0) goto L_0x0034
            r7.zzb = r1     // Catch:{ EOFException -> 0x0056, all -> 0x0041 }
            com.google.android.gms.internal.ads.zzcw.zzf(r14)
            r6.zzj()
            goto L_0x0070
        L_0x0034:
            com.google.android.gms.internal.ads.zzys r1 = r7.zzb
            if (r1 != 0) goto L_0x0066
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0041:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzys r9 = r7.zzb
            if (r9 != 0) goto L_0x004e
            long r9 = r6.zzf()
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x004f
        L_0x004e:
            r13 = 1
        L_0x004f:
            com.google.android.gms.internal.ads.zzcw.zzf(r13)
            r6.zzj()
            throw r8
        L_0x0056:
            com.google.android.gms.internal.ads.zzys r1 = r7.zzb
            if (r1 != 0) goto L_0x0066
            long r1 = r6.zzf()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = 0
            goto L_0x0067
        L_0x0066:
            r1 = 1
        L_0x0067:
            com.google.android.gms.internal.ads.zzcw.zzf(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0070:
            com.google.android.gms.internal.ads.zzys r10 = r7.zzb
            if (r10 == 0) goto L_0x007a
        L_0x0074:
            com.google.android.gms.internal.ads.zzys r8 = r7.zzb
            r8.zzb(r15)
            return
        L_0x007a:
            com.google.android.gms.internal.ads.zzua r10 = new com.google.android.gms.internal.ads.zzua
            java.lang.String r8 = com.google.android.gms.internal.ads.zzeg.zzJ(r8)
            java.lang.String r11 = "None of the available extractors ("
            java.lang.String r12 = ") could read the stream."
            java.lang.String r8 = p358af.C13437d.m33706k(r11, r8, r12)
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzre.zzd(com.google.android.gms.internal.ads.zzp, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzyv):void");
    }

    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    public final void zzf(long j, long j2) {
        zzys zzys = this.zzb;
        zzys.getClass();
        zzys.zzc(j, j2);
    }
}
