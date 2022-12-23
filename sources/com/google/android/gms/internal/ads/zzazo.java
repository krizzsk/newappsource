package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzazo {
    public final List zza;
    public final int zzb;
    public final float zzc;

    private zzazo(List list, int i, int i2, int i3, float f) {
        this.zza = list;
        this.zzb = i;
        this.zzc = f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x011e A[Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012e A[Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x016a A[Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x017b A[Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzazo zza(com.google.android.gms.internal.ads.zzazg r17) throws com.google.android.gms.internal.ads.zzarv {
        /*
            r0 = 4
            r1 = r17
            r1.zzw(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r0 = r17.zzg()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r2 = 3
            r0 = r0 & r2
            r3 = 1
            int r6 = r0 + 1
            if (r6 == r2) goto L_0x0192
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r5.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r0 = r17.zzg()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r0 = r0 & 31
            r4 = 0
            r7 = 0
        L_0x001e:
            if (r7 >= r0) goto L_0x002a
            byte[] r8 = zzb(r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r5.add(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r7 = r7 + 1
            goto L_0x001e
        L_0x002a:
            int r7 = r17.zzg()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r8 = 0
        L_0x002f:
            if (r8 >= r7) goto L_0x003b
            byte[] r9 = zzb(r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r5.add(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r8 = r8 + 1
            goto L_0x002f
        L_0x003b:
            r1 = -1
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L_0x0187
            java.lang.Object r0 = r5.get(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            byte[] r0 = (byte[]) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            java.lang.Object r1 = r5.get(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            byte[] r1 = (byte[]) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r0 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            com.google.android.gms.internal.ads.zzazh r8 = new com.google.android.gms.internal.ads.zzazh     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r8.<init>(r1, r6, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r0 = 8
            r8.zzd(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r1 = r8.zza(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r9 = 16
            r8.zzd(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r10 = 100
            if (r1 == r10) goto L_0x008e
            r10 = 110(0x6e, float:1.54E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 122(0x7a, float:1.71E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 244(0xf4, float:3.42E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 44
            if (r1 == r10) goto L_0x008e
            r10 = 83
            if (r1 == r10) goto L_0x008e
            r10 = 86
            if (r1 == r10) goto L_0x008e
            r10 = 118(0x76, float:1.65E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 128(0x80, float:1.794E-43)
            if (r1 == r10) goto L_0x008e
            r10 = 138(0x8a, float:1.93E-43)
            if (r1 != r10) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            r1 = 1
            goto L_0x00dc
        L_0x008e:
            int r1 = r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            if (r1 != r2) goto L_0x0099
            r8.zze()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r10 = 3
            goto L_0x009a
        L_0x0099:
            r10 = r1
        L_0x009a:
            r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r8.zzd(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            boolean r11 = r8.zze()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            if (r11 == 0) goto L_0x00dc
            if (r10 == r2) goto L_0x00ae
            r10 = 8
            goto L_0x00b0
        L_0x00ae:
            r10 = 12
        L_0x00b0:
            r11 = 0
        L_0x00b1:
            if (r11 >= r10) goto L_0x00dc
            boolean r12 = r8.zze()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            if (r12 == 0) goto L_0x00d9
            r12 = 6
            if (r11 >= r12) goto L_0x00bf
            r12 = 16
            goto L_0x00c1
        L_0x00bf:
            r12 = 64
        L_0x00c1:
            r13 = 0
            r14 = 8
            r15 = 8
        L_0x00c6:
            if (r13 >= r12) goto L_0x00d9
            if (r14 == 0) goto L_0x00d3
            int r14 = r8.zzb()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r14 = r14 + r15
            int r14 = r14 + 256
            int r14 = r14 % 256
        L_0x00d3:
            if (r14 == 0) goto L_0x00d6
            r15 = r14
        L_0x00d6:
            int r13 = r13 + 1
            goto L_0x00c6
        L_0x00d9:
            int r11 = r11 + 1
            goto L_0x00b1
        L_0x00dc:
            r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r10 = r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            if (r10 != 0) goto L_0x00e9
            r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            goto L_0x0104
        L_0x00e9:
            if (r10 != r3) goto L_0x0104
            r8.zze()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r8.zzb()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r8.zzb()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r10 = r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            long r10 = (long) r10     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
        L_0x00f9:
            long r12 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x0104
            r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r4 = r4 + 1
            goto L_0x00f9
        L_0x0104:
            r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r8.zzd(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r4 = r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r4 = r4 + r3
            int r10 = r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r10 = r10 + r3
            boolean r11 = r8.zze()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r12 = 2 - r11
            int r10 = r10 * r12
            if (r11 != 0) goto L_0x0121
            r8.zzd(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
        L_0x0121:
            r8.zzd(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r4 = r4 * 16
            int r10 = r10 * 16
            boolean r11 = r8.zze()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            if (r11 == 0) goto L_0x0156
            int r11 = r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r13 = r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r14 = r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r15 = r8.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            if (r1 != 0) goto L_0x0141
            goto L_0x014e
        L_0x0141:
            r16 = 2
            if (r1 != r2) goto L_0x0147
            r2 = 1
            goto L_0x0148
        L_0x0147:
            r2 = 2
        L_0x0148:
            if (r1 != r3) goto L_0x014b
            r3 = 2
        L_0x014b:
            int r12 = r12 * r3
            r3 = r2
        L_0x014e:
            int r11 = r11 + r13
            int r11 = r11 * r3
            int r4 = r4 - r11
            int r14 = r14 + r15
            int r14 = r14 * r12
            int r10 = r10 - r14
        L_0x0156:
            boolean r1 = r8.zze()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            if (r1 == 0) goto L_0x0183
            boolean r1 = r8.zze()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            if (r1 == 0) goto L_0x0183
            int r0 = r8.zza(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L_0x017b
            int r0 = r8.zza(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            int r1 = r8.zza(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            if (r0 == 0) goto L_0x0183
            if (r1 == 0) goto L_0x0183
            float r0 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            float r1 = (float) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            float r7 = r0 / r1
            goto L_0x0183
        L_0x017b:
            r1 = 17
            if (r0 >= r1) goto L_0x0183
            float[] r1 = com.google.android.gms.internal.ads.zzaze.zzb     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r7 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
        L_0x0183:
            r9 = r7
            r8 = r10
            r7 = r4
            goto L_0x018b
        L_0x0187:
            r7 = -1
            r8 = -1
            r9 = 1065353216(0x3f800000, float:1.0)
        L_0x018b:
            com.google.android.gms.internal.ads.zzazo r0 = new com.google.android.gms.internal.ads.zzazo     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            return r0
        L_0x0192:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            r0.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0198 }
        L_0x0198:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzarv r1 = new com.google.android.gms.internal.ads.zzarv
            java.lang.String r2 = "Error parsing AVC config"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazo.zza(com.google.android.gms.internal.ads.zzazg):com.google.android.gms.internal.ads.zzazo");
    }

    private static byte[] zzb(zzazg zzazg) {
        int zzj = zzazg.zzj();
        int zzc2 = zzazg.zzc();
        zzazg.zzw(zzj);
        return zzayz.zzb(zzazg.zza, zzc2, zzj);
    }
}
