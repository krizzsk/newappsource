package com.google.android.gms.internal.ads;

final class zzve extends zzvb {
    private final boolean zze;
    private final zzuu zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzve(int r4, com.google.android.gms.internal.ads.zzck r5, int r6, com.google.android.gms.internal.ads.zzuu r7, int r8, int r9, boolean r10) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            r3.zzf = r7
            boolean r4 = r7.zzI
            r5 = 1
            if (r5 == r4) goto L_0x000d
            r4 = 16
            goto L_0x000f
        L_0x000d:
            r4 = 24
        L_0x000f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 0
            if (r10 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzad r0 = r3.zzd
            int r1 = r0.zzr
            float r0 = r0.zzt
            int r1 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0024
            r1 = 1325400064(0x4f000000, float:2.14748365E9)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0026
        L_0x0024:
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r3.zze = r0
            r0 = -1
            if (r10 == 0) goto L_0x004d
            com.google.android.gms.internal.ads.zzad r10 = r3.zzd
            int r1 = r10.zzr
            if (r1 == r0) goto L_0x0034
            if (r1 < 0) goto L_0x004d
        L_0x0034:
            int r1 = r10.zzs
            if (r1 == r0) goto L_0x003a
            if (r1 < 0) goto L_0x004d
        L_0x003a:
            float r1 = r10.zzt
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0045
            r6 = 0
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x004d
        L_0x0045:
            int r6 = r10.zzi
            if (r6 == r0) goto L_0x004b
            if (r6 < 0) goto L_0x004d
        L_0x004b:
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            r3.zzg = r6
            boolean r6 = com.google.android.gms.internal.ads.zzvf.zzi(r8, r9)
            r3.zzh = r6
            com.google.android.gms.internal.ads.zzad r6 = r3.zzd
            int r10 = r6.zzi
            r3.zzi = r10
            int r6 = r6.zza()
            r3.zzj = r6
            com.google.android.gms.internal.ads.zzad r6 = r3.zzd
            int r6 = r6.zzf
            int r6 = java.lang.Integer.bitCount(r9)
            r3.zzl = r6
            com.google.android.gms.internal.ads.zzad r6 = r3.zzd
            int r6 = r6.zzf
            r3.zzm = r5
            r6 = 0
        L_0x0073:
            com.google.android.gms.internal.ads.zzfrh r10 = r7.zzo
            int r10 = r10.size()
            if (r6 >= r10) goto L_0x0091
            com.google.android.gms.internal.ads.zzad r10 = r3.zzd
            java.lang.String r10 = r10.zzm
            if (r10 == 0) goto L_0x008e
            com.google.android.gms.internal.ads.zzfrh r1 = r7.zzo
            java.lang.Object r1 = r1.get(r6)
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L_0x008e
            goto L_0x0094
        L_0x008e:
            int r6 = r6 + 1
            goto L_0x0073
        L_0x0091:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0094:
            r3.zzk = r6
            r6 = r8 & 128(0x80, float:1.794E-43)
            r7 = 128(0x80, float:1.794E-43)
            if (r6 != r7) goto L_0x009e
            r6 = 1
            goto L_0x009f
        L_0x009e:
            r6 = 0
        L_0x009f:
            r3.zzo = r6
            r6 = r8 & 64
            r7 = 64
            if (r6 != r7) goto L_0x00a9
            r6 = 1
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            r3.zzp = r6
            com.google.android.gms.internal.ads.zzad r6 = r3.zzd
            java.lang.String r7 = r6.zzm
            r10 = 3
            r1 = 2
            if (r7 != 0) goto L_0x00b6
        L_0x00b4:
            r10 = 0
            goto L_0x00f5
        L_0x00b6:
            int r2 = r7.hashCode()
            switch(r2) {
                case -1662735862: goto L_0x00dc;
                case -1662541442: goto L_0x00d2;
                case 1331836730: goto L_0x00c8;
                case 1599127257: goto L_0x00be;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            goto L_0x00e6
        L_0x00be:
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 2
            goto L_0x00e7
        L_0x00c8:
            java.lang.String r2 = "video/avc"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 3
            goto L_0x00e7
        L_0x00d2:
            java.lang.String r2 = "video/hevc"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 1
            goto L_0x00e7
        L_0x00dc:
            java.lang.String r2 = "video/av01"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00e6
            r7 = 0
            goto L_0x00e7
        L_0x00e6:
            r7 = -1
        L_0x00e7:
            if (r7 == 0) goto L_0x00f4
            if (r7 == r5) goto L_0x00f5
            if (r7 == r1) goto L_0x00f2
            if (r7 == r10) goto L_0x00f0
            goto L_0x00b4
        L_0x00f0:
            r10 = 1
            goto L_0x00f5
        L_0x00f2:
            r10 = 2
            goto L_0x00f5
        L_0x00f4:
            r10 = 4
        L_0x00f5:
            r3.zzq = r10
            com.google.android.gms.internal.ads.zzuu r7 = r3.zzf
            boolean r10 = r7.zzP
            boolean r10 = com.google.android.gms.internal.ads.zzvf.zzi(r8, r10)
            if (r10 != 0) goto L_0x0103
        L_0x0101:
            r5 = 0
            goto L_0x0120
        L_0x0103:
            boolean r10 = r3.zze
            if (r10 != 0) goto L_0x010c
            boolean r7 = r7.zzG
            if (r7 != 0) goto L_0x010c
            goto L_0x0101
        L_0x010c:
            boolean r7 = com.google.android.gms.internal.ads.zzvf.zzi(r8, r9)
            if (r7 == 0) goto L_0x0120
            boolean r7 = r3.zzg
            if (r7 == 0) goto L_0x0120
            if (r10 == 0) goto L_0x0120
            int r6 = r6.zzi
            if (r6 == r0) goto L_0x0120
            r4 = r4 & r8
            if (r4 == 0) goto L_0x0120
            r5 = 2
        L_0x0120:
            r3.zzn = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.<init>(int, com.google.android.gms.internal.ads.zzck, int, com.google.android.gms.internal.ads.zzuu, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzve zzve, zzve zzve2) {
        zzfsp zzfsp;
        if (!zzve.zze || !zzve.zzh) {
            zzfsp = zzvf.zzb.zza();
        } else {
            zzfsp = zzvf.zzb;
        }
        zzfqw zzj2 = zzfqw.zzj();
        Integer valueOf = Integer.valueOf(zzve.zzi);
        Integer valueOf2 = Integer.valueOf(zzve2.zzi);
        boolean z = zzve.zzf.zzy;
        return zzj2.zzc(valueOf, valueOf2, zzvf.zzc).zzc(Integer.valueOf(zzve.zzj), Integer.valueOf(zzve2.zzj), zzfsp).zzc(Integer.valueOf(zzve.zzi), Integer.valueOf(zzve2.zzi), zzfsp).zza();
    }

    public static /* synthetic */ int zzd(zzve zzve, zzve zzve2) {
        zzfqw zzc = zzfqw.zzj().zzd(zzve.zzh, zzve2.zzh).zzb(zzve.zzl, zzve2.zzl).zzd(true, true).zzd(zzve.zze, zzve2.zze).zzd(zzve.zzg, zzve2.zzg).zzc(Integer.valueOf(zzve.zzk), Integer.valueOf(zzve2.zzk), zzfsp.zzc().zza());
        boolean z = zzve.zzo;
        zzfqw zzd = zzc.zzd(z, zzve2.zzo);
        boolean z2 = zzve.zzp;
        zzfqw zzd2 = zzd.zzd(z2, zzve2.zzp);
        if (z && z2) {
            zzd2 = zzd2.zzb(zzve.zzq, zzve2.zzq);
        }
        return zzd2.zza();
    }

    public final int zzb() {
        return this.zzn;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvb) {
        zzve zzve = (zzve) zzvb;
        if (!zzeg.zzS(this.zzd.zzm, zzve.zzd.zzm)) {
            return false;
        }
        boolean z = this.zzf.zzJ;
        if (this.zzo == zzve.zzo && this.zzp == zzve.zzp) {
            return true;
        }
        return false;
    }
}
