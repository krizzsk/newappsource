package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

public final class zzagf implements zzaga {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzahp zzb;
    private final zzdy zzc;
    private final boolean[] zzd;
    private final zzagd zze;
    private final zzagp zzf;
    private zzage zzg;
    private long zzh;
    private String zzi;
    private zzzz zzj;
    private boolean zzk;
    private long zzl;

    public zzagf() {
        this((zzahp) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0120 A[LOOP:1: B:39:0x011e->B:40:0x0120, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.ads.zzdy r18) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.gms.internal.ads.zzage r1 = r0.zzg
            com.google.android.gms.internal.ads.zzcw.zzb(r1)
            com.google.android.gms.internal.ads.zzzz r1 = r0.zzj
            com.google.android.gms.internal.ads.zzcw.zzb(r1)
            int r1 = r18.zzc()
            int r2 = r18.zzd()
            byte[] r3 = r18.zzH()
            long r4 = r0.zzh
            int r6 = r18.zza()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.zzh = r4
            com.google.android.gms.internal.ads.zzzz r4 = r0.zzj
            int r5 = r18.zza()
            r6 = r18
            com.google.android.gms.internal.ads.zzzx.zzb(r4, r6, r5)
        L_0x002d:
            boolean[] r4 = r0.zzd
            int r4 = com.google.android.gms.internal.ads.zzzp.zza(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0049
            boolean r4 = r0.zzk
            if (r4 != 0) goto L_0x003e
            com.google.android.gms.internal.ads.zzagd r4 = r0.zze
            r4.zza(r3, r1, r2)
        L_0x003e:
            com.google.android.gms.internal.ads.zzage r4 = r0.zzg
            r4.zza(r3, r1, r2)
            com.google.android.gms.internal.ads.zzagp r4 = r0.zzf
            r4.zza(r3, r1, r2)
            return
        L_0x0049:
            int r5 = r4 + 3
            byte[] r7 = r18.zzH()
            byte r7 = r7[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.zzk
            if (r9 != 0) goto L_0x0165
            if (r8 <= 0) goto L_0x0060
            com.google.android.gms.internal.ads.zzagd r9 = r0.zze
            r9.zza(r3, r1, r4)
        L_0x0060:
            if (r8 >= 0) goto L_0x0064
            int r9 = -r8
            goto L_0x0065
        L_0x0064:
            r9 = 0
        L_0x0065:
            com.google.android.gms.internal.ads.zzagd r12 = r0.zze
            boolean r9 = r12.zzc(r7, r9)
            if (r9 == 0) goto L_0x0165
            com.google.android.gms.internal.ads.zzzz r9 = r0.zzj
            com.google.android.gms.internal.ads.zzagd r12 = r0.zze
            int r13 = r12.zzb
            java.lang.String r14 = r0.zzi
            r14.getClass()
            byte[] r15 = r12.zzc
            int r12 = r12.zza
            byte[] r12 = java.util.Arrays.copyOf(r15, r12)
            com.google.android.gms.internal.ads.zzdx r15 = new com.google.android.gms.internal.ads.zzdx
            int r10 = r12.length
            r15.<init>(r12, r10)
            r15.zzk(r13)
            r10 = 4
            r15.zzk(r10)
            r15.zzi()
            r13 = 8
            r15.zzj(r13)
            boolean r16 = r15.zzl()
            r11 = 3
            if (r16 == 0) goto L_0x00a2
            r15.zzj(r10)
            r15.zzj(r11)
        L_0x00a2:
            int r10 = r15.zzc(r10)
            r16 = 1065353216(0x3f800000, float:1.0)
            r11 = 15
            if (r10 != r11) goto L_0x00bc
            int r10 = r15.zzc(r13)
            int r13 = r15.zzc(r13)
            if (r13 != 0) goto L_0x00b7
            goto L_0x00c6
        L_0x00b7:
            float r10 = (float) r10
            float r13 = (float) r13
            float r16 = r10 / r13
            goto L_0x00c3
        L_0x00bc:
            r13 = 7
            if (r10 >= r13) goto L_0x00c6
            float[] r13 = zza
            r16 = r13[r10]
        L_0x00c3:
            r10 = r16
            goto L_0x00c8
        L_0x00c6:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00c8:
            boolean r13 = r15.zzl()
            r11 = 2
            if (r13 == 0) goto L_0x0103
            r15.zzj(r11)
            r13 = 1
            r15.zzj(r13)
            boolean r13 = r15.zzl()
            if (r13 == 0) goto L_0x0103
            r13 = 15
            r15.zzj(r13)
            r15.zzi()
            r15.zzj(r13)
            r15.zzi()
            r15.zzj(r13)
            r15.zzi()
            r11 = 3
            r15.zzj(r11)
            r11 = 11
            r15.zzj(r11)
            r15.zzi()
            r15.zzj(r13)
            r15.zzi()
            r11 = 2
        L_0x0103:
            r15.zzc(r11)
            r15.zzi()
            r11 = 16
            int r11 = r15.zzc(r11)
            r15.zzi()
            boolean r13 = r15.zzl()
            if (r13 == 0) goto L_0x0128
            if (r11 != 0) goto L_0x011b
            goto L_0x0128
        L_0x011b:
            int r11 = r11 + -1
            r13 = 0
        L_0x011e:
            if (r11 <= 0) goto L_0x0125
            int r13 = r13 + 1
            int r11 = r11 >> 1
            goto L_0x011e
        L_0x0125:
            r15.zzj(r13)
        L_0x0128:
            r15.zzi()
            r11 = 13
            int r13 = r15.zzc(r11)
            r15.zzi()
            int r11 = r15.zzc(r11)
            r15.zzi()
            r15.zzi()
            com.google.android.gms.internal.ads.zzab r15 = new com.google.android.gms.internal.ads.zzab
            r15.<init>()
            r15.zzH(r14)
            java.lang.String r14 = "video/mp4v-es"
            r15.zzS(r14)
            r15.zzX(r13)
            r15.zzF(r11)
            r15.zzP(r10)
            java.util.List r10 = java.util.Collections.singletonList(r12)
            r15.zzI(r10)
            com.google.android.gms.internal.ads.zzad r10 = r15.zzY()
            r9.zzk(r10)
            r9 = 1
            r0.zzk = r9
        L_0x0165:
            com.google.android.gms.internal.ads.zzage r9 = r0.zzg
            r9.zza(r3, r1, r4)
            com.google.android.gms.internal.ads.zzagp r9 = r0.zzf
            if (r8 <= 0) goto L_0x0173
            r9.zza(r3, r1, r4)
            r10 = 0
            goto L_0x0174
        L_0x0173:
            int r10 = -r8
        L_0x0174:
            com.google.android.gms.internal.ads.zzagp r1 = r0.zzf
            boolean r1 = r1.zzd(r10)
            if (r1 == 0) goto L_0x019a
            com.google.android.gms.internal.ads.zzagp r1 = r0.zzf
            byte[] r8 = r1.zza
            int r1 = r1.zzb
            int r1 = com.google.android.gms.internal.ads.zzzp.zzb(r8, r1)
            com.google.android.gms.internal.ads.zzdy r8 = r0.zzc
            int r9 = com.google.android.gms.internal.ads.zzeg.zza
            com.google.android.gms.internal.ads.zzagp r9 = r0.zzf
            byte[] r9 = r9.zza
            r8.zzD(r9, r1)
            com.google.android.gms.internal.ads.zzahp r1 = r0.zzb
            long r8 = r0.zzl
            com.google.android.gms.internal.ads.zzdy r10 = r0.zzc
            r1.zza(r8, r10)
        L_0x019a:
            r1 = 178(0xb2, float:2.5E-43)
            if (r7 != r1) goto L_0x01b0
            byte[] r7 = r18.zzH()
            int r8 = r4 + 2
            byte r7 = r7[r8]
            r8 = 1
            if (r7 != r8) goto L_0x01ae
            com.google.android.gms.internal.ads.zzagp r7 = r0.zzf
            r7.zzc(r1)
        L_0x01ae:
            r7 = 178(0xb2, float:2.5E-43)
        L_0x01b0:
            int r1 = r2 - r4
            long r8 = r0.zzh
            com.google.android.gms.internal.ads.zzage r4 = r0.zzg
            long r10 = (long) r1
            long r8 = r8 - r10
            boolean r10 = r0.zzk
            r4.zzb(r8, r1, r10)
            com.google.android.gms.internal.ads.zzage r1 = r0.zzg
            long r8 = r0.zzl
            r1.zzc(r7, r8)
            r1 = r5
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagf.zza(com.google.android.gms.internal.ads.zzdy):void");
    }

    public final void zzb(zzyv zzyv, zzahm zzahm) {
        zzahm.zzc();
        this.zzi = zzahm.zzb();
        zzzz zzv = zzyv.zzv(zzahm.zza(), 2);
        this.zzj = zzv;
        this.zzg = new zzage(zzv);
        this.zzb.zzb(zzyv, zzahm);
    }

    public final void zzc() {
    }

    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    public final void zze() {
        zzzp.zze(this.zzd);
        this.zze.zzb();
        zzage zzage = this.zzg;
        if (zzage != null) {
            zzage.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0;
        this.zzl = -9223372036854775807L;
    }

    public zzagf(zzahp zzahp) {
        this.zzb = zzahp;
        this.zzd = new boolean[4];
        this.zze = new zzagd(RecyclerView.C1119a0.FLAG_IGNORE);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzagp(178, RecyclerView.C1119a0.FLAG_IGNORE);
        this.zzc = new zzdy();
    }
}
