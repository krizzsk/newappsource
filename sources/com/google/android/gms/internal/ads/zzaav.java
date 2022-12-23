package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzaav implements zzys {
    private final zzdy zza = new zzdy(6);
    private zzyv zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf = -1;
    private zzacs zzg;
    private zzyt zzh;
    private zzaay zzi;
    private zzaeo zzj;

    private final int zze(zzyt zzyt) throws IOException {
        this.zza.zzC(2);
        ((zzym) zzyt).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbk[0]);
        zzyv zzyv = this.zzb;
        zzyv.getClass();
        zzyv.zzB();
        this.zzb.zzL(new zzzu(-9223372036854775807L, 0));
        this.zzc = 6;
    }

    private final void zzg(zzbk... zzbkArr) {
        zzyv zzyv = this.zzb;
        zzyv.getClass();
        zzzz zzv = zzyv.zzv(1024, 4);
        zzab zzab = new zzab();
        zzab.zzz("image/jpeg");
        zzab.zzM(new zzbl(zzbkArr));
        zzv.zzk(zzab.zzY());
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x015e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzyt r24, com.google.android.gms.internal.ads.zzzs r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.zzc
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = -1
            r9 = 0
            if (r3 == 0) goto L_0x018d
            if (r3 == r6) goto L_0x016f
            r10 = -1
            if (r3 == r5) goto L_0x00ac
            r5 = 5
            if (r3 == r4) goto L_0x004c
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.zzaay r3 = r0.zzi
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzyt r3 = r0.zzh
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.zzh = r1
            com.google.android.gms.internal.ads.zzaay r3 = new com.google.android.gms.internal.ads.zzaay
            long r4 = r0.zzf
            r3.<init>(r1, r4)
            r0.zzi = r3
        L_0x0037:
            com.google.android.gms.internal.ads.zzaeo r1 = r0.zzj
            r1.getClass()
            com.google.android.gms.internal.ads.zzaay r3 = r0.zzi
            int r1 = r1.zza(r3, r2)
            if (r1 != r6) goto L_0x004b
            long r3 = r2.zza
            long r5 = r0.zzf
            long r3 = r3 + r5
            r2.zza = r3
        L_0x004b:
            return r1
        L_0x004c:
            long r3 = r24.zzf()
            long r7 = r0.zzf
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            byte[] r2 = r2.zzH()
            boolean r2 = r1.zzm(r2, r9, r6, r6)
            if (r2 != 0) goto L_0x0066
            r23.zzf()
            goto L_0x00a8
        L_0x0066:
            r24.zzj()
            com.google.android.gms.internal.ads.zzaeo r2 = r0.zzj
            if (r2 != 0) goto L_0x0074
            com.google.android.gms.internal.ads.zzaeo r2 = new com.google.android.gms.internal.ads.zzaeo
            r2.<init>(r9)
            r0.zzj = r2
        L_0x0074:
            com.google.android.gms.internal.ads.zzaay r2 = new com.google.android.gms.internal.ads.zzaay
            long r3 = r0.zzf
            r2.<init>(r1, r3)
            r0.zzi = r2
            com.google.android.gms.internal.ads.zzaeo r1 = r0.zzj
            boolean r1 = r1.zzd(r2)
            if (r1 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.zzaeo r1 = r0.zzj
            com.google.android.gms.internal.ads.zzaba r2 = new com.google.android.gms.internal.ads.zzaba
            long r3 = r0.zzf
            com.google.android.gms.internal.ads.zzyv r7 = r0.zzb
            r7.getClass()
            r2.<init>(r3, r7)
            r1.zzb(r2)
            com.google.android.gms.internal.ads.zzbk[] r1 = new com.google.android.gms.internal.ads.zzbk[r6]
            com.google.android.gms.internal.ads.zzacs r2 = r0.zzg
            r2.getClass()
            r1[r9] = r2
            r0.zzg(r1)
            r0.zzc = r5
            goto L_0x00a8
        L_0x00a5:
            r23.zzf()
        L_0x00a8:
            return r9
        L_0x00a9:
            r2.zza = r7
            return r6
        L_0x00ac:
            int r2 = r0.zzd
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0164
            com.google.android.gms.internal.ads.zzdy r2 = new com.google.android.gms.internal.ads.zzdy
            int r3 = r0.zze
            r2.<init>((int) r3)
            byte[] r3 = r2.zzH()
            int r4 = r0.zze
            r6 = r1
            com.google.android.gms.internal.ads.zzym r6 = (com.google.android.gms.internal.ads.zzym) r6
            r6.zzn(r3, r9, r4, r9)
            com.google.android.gms.internal.ads.zzacs r3 = r0.zzg
            if (r3 != 0) goto L_0x0162
            java.lang.String r3 = r2.zzv(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0162
            java.lang.String r2 = r2.zzv(r9)
            if (r2 == 0) goto L_0x0162
            long r3 = r24.zzd()
            int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00e7
        L_0x00e4:
            r1 = 0
            goto L_0x015a
        L_0x00e7:
            com.google.android.gms.internal.ads.zzaax r2 = com.google.android.gms.internal.ads.zzabb.zza(r2)
            if (r2 != 0) goto L_0x00ee
            goto L_0x00e4
        L_0x00ee:
            java.util.List r6 = r2.zzb
            int r6 = r6.size()
            if (r6 >= r5) goto L_0x00f7
            goto L_0x00e4
        L_0x00f7:
            java.util.List r5 = r2.zzb
            int r5 = r5.size()
            int r5 = r5 + r10
            r11 = r7
            r13 = r11
            r17 = r13
            r19 = r17
            r6 = 0
        L_0x0105:
            if (r5 < 0) goto L_0x0140
            java.util.List r10 = r2.zzb
            java.lang.Object r10 = r10.get(r5)
            com.google.android.gms.internal.ads.zzaaw r10 = (com.google.android.gms.internal.ads.zzaaw) r10
            java.lang.String r15 = r10.zza
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r6
            if (r5 != 0) goto L_0x0120
            long r9 = r10.zzd
            long r3 = r3 - r9
            r9 = 0
            goto L_0x0124
        L_0x0120:
            long r9 = r10.zzc
            long r9 = r3 - r9
        L_0x0124:
            r21 = r3
            r3 = r9
            r9 = r21
            if (r1 == 0) goto L_0x0135
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0135
            long r19 = r9 - r3
            r17 = r3
            r6 = 0
            goto L_0x0136
        L_0x0135:
            r6 = r1
        L_0x0136:
            if (r5 != 0) goto L_0x0139
            r13 = r9
        L_0x0139:
            if (r5 != 0) goto L_0x013c
            r11 = r3
        L_0x013c:
            int r5 = r5 + -1
            r9 = 0
            goto L_0x0105
        L_0x0140:
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0151
            goto L_0x00e4
        L_0x0151:
            com.google.android.gms.internal.ads.zzacs r1 = new com.google.android.gms.internal.ads.zzacs
            long r2 = r2.zza
            r10 = r1
            r15 = r2
            r10.<init>(r11, r13, r15, r17, r19)
        L_0x015a:
            r0.zzg = r1
            if (r1 == 0) goto L_0x0162
            long r1 = r1.zzd
            r0.zzf = r1
        L_0x0162:
            r3 = 0
            goto L_0x016c
        L_0x0164:
            int r2 = r0.zze
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r3 = 0
            r1.zzo(r2, r3)
        L_0x016c:
            r0.zzc = r3
            return r3
        L_0x016f:
            r3 = 0
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            r2.zzC(r5)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            byte[] r2 = r2.zzH()
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r1.zzn(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zza
            int r1 = r1.zzo()
            int r1 = r1 + -2
            r0.zze = r1
            r0.zzc = r5
            return r3
        L_0x018d:
            r3 = 0
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            r2.zzC(r5)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            byte[] r2 = r2.zzH()
            com.google.android.gms.internal.ads.zzym r1 = (com.google.android.gms.internal.ads.zzym) r1
            r1.zzn(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.zzdy r1 = r0.zza
            int r1 = r1.zzo()
            r0.zzd = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01b8
            long r1 = r0.zzf
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01b4
            r0.zzc = r4
            goto L_0x01c9
        L_0x01b4:
            r23.zzf()
            goto L_0x01c9
        L_0x01b8:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01c2
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01c9
        L_0x01c2:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01c9
            r0.zzc = r6
        L_0x01c9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaav.zza(com.google.android.gms.internal.ads.zzyt, com.google.android.gms.internal.ads.zzzs):int");
    }

    public final void zzb(zzyv zzyv) {
        this.zzb = zzyv;
    }

    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaeo zzaeo = this.zzj;
            zzaeo.getClass();
            zzaeo.zzc(j, j2);
        }
    }

    public final boolean zzd(zzyt zzyt) throws IOException {
        if (zze(zzyt) != 65496) {
            return false;
        }
        int zze2 = zze(zzyt);
        this.zzd = zze2;
        if (zze2 == 65504) {
            this.zza.zzC(2);
            zzym zzym = (zzym) zzyt;
            zzym.zzm(this.zza.zzH(), 0, 2, false);
            zzym.zzl(this.zza.zzo() - 2, false);
            zze2 = zze(zzyt);
            this.zzd = zze2;
        }
        if (zze2 == 65505) {
            zzym zzym2 = (zzym) zzyt;
            zzym2.zzl(2, false);
            this.zza.zzC(6);
            zzym2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
