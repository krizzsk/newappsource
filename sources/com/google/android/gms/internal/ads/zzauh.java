package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

final class zzauh {
    private final byte[] zza = new byte[8];
    private final Stack zzb = new Stack();
    private final zzaup zzc = new zzaup();
    private int zzd;
    private int zze;
    private long zzf;
    private zzauk zzg;

    private final long zzd(zzatu zzatu, int i) throws IOException, InterruptedException {
        zzatu.zzh(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.zza[i2] & 255));
        }
        return j;
    }

    public final void zza() {
        this.zzd = 0;
        this.zzb.clear();
        this.zzc.zzd();
    }

    public final void zzb(zzauk zzauk) {
        this.zzg = zzauk;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r0 == 1) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzc(com.google.android.gms.internal.ads.zzatu r13) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r12 = this;
            com.google.android.gms.internal.ads.zzauk r0 = r12.zzg
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.zzayy.zze(r0)
        L_0x000c:
            java.util.Stack r0 = r12.zzb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003d
            long r3 = r13.zzd()
            java.util.Stack r0 = r12.zzb
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.zzaug r0 = (com.google.android.gms.internal.ads.zzaug) r0
            long r5 = r0.zzb
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            com.google.android.gms.internal.ads.zzauk r13 = r12.zzg
            java.util.Stack r0 = r12.zzb
            java.lang.Object r0 = r0.pop()
            com.google.android.gms.internal.ads.zzaug r0 = (com.google.android.gms.internal.ads.zzaug) r0
            int r0 = r0.zza
            com.google.android.gms.internal.ads.zzaun r13 = r13.zza
            r13.zzb(r0)
            return r1
        L_0x003d:
            int r0 = r12.zzd
            r3 = 2
            r4 = 4
            if (r0 != 0) goto L_0x008b
            com.google.android.gms.internal.ads.zzaup r0 = r12.zzc
            long r5 = r0.zze(r13, r1, r2, r4)
            r7 = -2
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            r13.zze()
        L_0x0052:
            byte[] r0 = r12.zza
            r13.zzg(r0, r2, r4, r2)
            byte[] r0 = r12.zza
            byte r0 = r0[r2]
            int r0 = com.google.android.gms.internal.ads.zzaup.zzb(r0)
            r5 = -1
            if (r0 == r5) goto L_0x007a
            if (r0 > r4) goto L_0x007a
            byte[] r5 = r12.zza
            long r5 = com.google.android.gms.internal.ads.zzaup.zzc(r5, r0, r2)
            int r6 = (int) r5
            com.google.android.gms.internal.ads.zzauk r5 = r12.zzg
            com.google.android.gms.internal.ads.zzaun r5 = r5.zza
            boolean r5 = com.google.android.gms.internal.ads.zzaun.zzm(r6)
            if (r5 == 0) goto L_0x007a
            r13.zzi(r0, r2)
            long r5 = (long) r6
            goto L_0x007e
        L_0x007a:
            r13.zzi(r1, r2)
            goto L_0x0052
        L_0x007e:
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = (int) r5
            r12.zze = r0
            r12.zzd = r1
            goto L_0x008d
        L_0x008b:
            if (r0 != r1) goto L_0x0099
        L_0x008d:
            com.google.android.gms.internal.ads.zzaup r0 = r12.zzc
            r5 = 8
            long r5 = r0.zze(r13, r2, r1, r5)
            r12.zzf = r5
            r12.zzd = r3
        L_0x0099:
            com.google.android.gms.internal.ads.zzauk r0 = r12.zzg
            int r5 = r12.zze
            com.google.android.gms.internal.ads.zzaun r6 = r0.zza
            int r7 = com.google.android.gms.internal.ads.zzaun.zzl(r5)
            if (r7 == 0) goto L_0x015a
            if (r7 == r1) goto L_0x0138
            r8 = 8
            if (r7 == r3) goto L_0x0119
            r3 = 3
            if (r7 == r3) goto L_0x00ec
            if (r7 == r4) goto L_0x00e3
            long r6 = r12.zzf
            r10 = 4
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x00c9
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x00bd
            goto L_0x00c9
        L_0x00bd:
            com.google.android.gms.internal.ads.zzarv r13 = new com.google.android.gms.internal.ads.zzarv
            java.lang.String r0 = "Invalid float size: "
            java.lang.String r0 = p001a0.C0016g.m29l(r0, r6)
            r13.<init>(r0)
            throw r13
        L_0x00c9:
            int r3 = (int) r6
            long r6 = r12.zzd(r13, r3)
            if (r3 != r4) goto L_0x00d7
            int r13 = (int) r6
            float r13 = java.lang.Float.intBitsToFloat(r13)
            double r3 = (double) r13
            goto L_0x00db
        L_0x00d7:
            double r3 = java.lang.Double.longBitsToDouble(r6)
        L_0x00db:
            com.google.android.gms.internal.ads.zzaun r13 = r0.zza
            r13.zzc(r5, r3)
            r12.zzd = r2
            return r1
        L_0x00e3:
            long r3 = r12.zzf
            int r0 = (int) r3
            r6.zzk(r5, r0, r13)
            r12.zzd = r2
            return r1
        L_0x00ec:
            long r3 = r12.zzf
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x010d
            int r4 = (int) r3
            if (r4 != 0) goto L_0x00fb
            java.lang.String r13 = ""
            goto L_0x0105
        L_0x00fb:
            byte[] r3 = new byte[r4]
            r13.zzh(r3, r2, r4, r2)
            java.lang.String r13 = new java.lang.String
            r13.<init>(r3)
        L_0x0105:
            com.google.android.gms.internal.ads.zzaun r0 = r0.zza
            r0.zzj(r5, r13)
            r12.zzd = r2
            return r1
        L_0x010d:
            com.google.android.gms.internal.ads.zzarv r13 = new com.google.android.gms.internal.ads.zzarv
            java.lang.String r0 = "String element size: "
            java.lang.String r0 = p001a0.C0016g.m29l(r0, r3)
            r13.<init>(r0)
            throw r13
        L_0x0119:
            long r3 = r12.zzf
            int r6 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x012c
            int r4 = (int) r3
            long r3 = r12.zzd(r13, r4)
            com.google.android.gms.internal.ads.zzaun r13 = r0.zza
            r13.zzh(r5, r3)
            r12.zzd = r2
            return r1
        L_0x012c:
            com.google.android.gms.internal.ads.zzarv r13 = new com.google.android.gms.internal.ads.zzarv
            java.lang.String r0 = "Invalid integer size: "
            java.lang.String r0 = p001a0.C0016g.m29l(r0, r3)
            r13.<init>(r0)
            throw r13
        L_0x0138:
            long r6 = r13.zzd()
            long r3 = r12.zzf
            java.util.Stack r13 = r12.zzb
            com.google.android.gms.internal.ads.zzaug r0 = new com.google.android.gms.internal.ads.zzaug
            long r3 = r3 + r6
            r8 = 0
            r0.<init>(r5, r3, r8)
            r13.add(r0)
            com.google.android.gms.internal.ads.zzauk r13 = r12.zzg
            int r4 = r12.zze
            long r8 = r12.zzf
            com.google.android.gms.internal.ads.zzaun r3 = r13.zza
            r5 = r6
            r7 = r8
            r3.zzi(r4, r5, r7)
            r12.zzd = r2
            return r1
        L_0x015a:
            long r3 = r12.zzf
            int r0 = (int) r3
            r13.zzi(r0, r2)
            r12.zzd = r2
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauh.zzc(com.google.android.gms.internal.ads.zzatu):boolean");
    }
}
