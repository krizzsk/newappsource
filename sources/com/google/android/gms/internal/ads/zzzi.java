package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzzi {
    public final List zza;
    public final int zzb;
    public final float zzc;
    public final String zzd;

    private zzzi(List list, int i, int i2, int i3, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = f;
        this.zzd = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x0283 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x028c A[Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a1 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b0 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0120 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0122 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzzi zza(com.google.android.gms.internal.ads.zzdy r30) throws com.google.android.gms.internal.ads.zzbp {
        /*
            r0 = r30
            r1 = 21
            r0.zzG(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r1 = r30.zzk()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r2 = 3
            r1 = r1 & r2
            int r3 = r30.zzk()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r4 = r30.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0018:
            r8 = 1
            if (r6 >= r3) goto L_0x0035
            r0.zzG(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r8 = r30.zzo()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r9 = 0
        L_0x0023:
            if (r9 >= r8) goto L_0x0032
            int r10 = r30.zzo()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r11 = r10 + 4
            int r7 = r7 + r11
            r0.zzG(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r9 = r9 + 1
            goto L_0x0023
        L_0x0032:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x0035:
            r0.zzF(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            byte[] r4 = new byte[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r6 = 0
            r9 = -1
            r17 = r6
            r6 = 0
            r9 = 0
            r14 = -1
            r15 = -1
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x0044:
            if (r6 >= r3) goto L_0x02e1
            int r11 = r30.zzk()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r11 = r11 & 127(0x7f, float:1.78E-43)
            int r12 = r30.zzo()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13 = 0
        L_0x0051:
            if (r13 >= r12) goto L_0x02d8
            int r10 = r30.zzo()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            byte[] r8 = com.google.android.gms.internal.ads.zzzp.zza     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r2 = 4
            java.lang.System.arraycopy(r8, r5, r4, r9, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r9 = r9 + 4
            byte[] r8 = r30.zzH()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r5 = r30.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            java.lang.System.arraycopy(r8, r5, r4, r9, r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r5 = 33
            if (r11 != r5) goto L_0x02c1
            if (r13 != 0) goto L_0x02c1
            int r5 = r9 + r10
            int r8 = r9 + 2
            com.google.android.gms.internal.ads.zzzr r13 = new com.google.android.gms.internal.ads.zzzr     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.<init>(r4, r8, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zze(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r5 = 3
            int r8 = r13.zza(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r5 = 2
            int r18 = r13.zza(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            boolean r19 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r14 = 5
            int r20 = r13.zza(r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r15 = 0
            r21 = 0
        L_0x0095:
            r14 = 32
            if (r15 >= r14) goto L_0x00a7
            boolean r14 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r14 == 0) goto L_0x00a4
            r14 = 1
            int r17 = r14 << r15
            r21 = r21 | r17
        L_0x00a4:
            int r15 = r15 + 1
            goto L_0x0095
        L_0x00a7:
            r14 = 6
            int[] r15 = new int[r14]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r2 = 0
        L_0x00ab:
            r5 = 8
            if (r2 >= r14) goto L_0x00b8
            int r5 = r13.zza(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r15[r2] = r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r2 = r2 + 1
            goto L_0x00ab
        L_0x00b8:
            int r23 = r13.zza(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r2 = 0
            r5 = 0
        L_0x00be:
            if (r2 >= r8) goto L_0x00d3
            boolean r24 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r24 == 0) goto L_0x00c8
            int r5 = r5 + 89
        L_0x00c8:
            boolean r24 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r24 == 0) goto L_0x00d0
            int r5 = r5 + 8
        L_0x00d0:
            int r2 = r2 + 1
            goto L_0x00be
        L_0x00d3:
            r13.zze(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r8 <= 0) goto L_0x00de
            int r2 = 8 - r8
            int r2 = r2 + r2
            r13.zze(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
        L_0x00de:
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r5 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r2 = 3
            if (r5 != r2) goto L_0x00ec
            r13.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r5 = 3
        L_0x00ec:
            int r2 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r24 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            boolean r25 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r25 == 0) goto L_0x0130
            int r25 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r26 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r27 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r28 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r14 = 1
            if (r5 == r14) goto L_0x011a
            r14 = 2
            if (r5 != r14) goto L_0x0115
            r29 = r3
            r3 = 1
            r5 = 2
            goto L_0x011d
        L_0x0115:
            r29 = r3
            r3 = 1
            r14 = 1
            goto L_0x011e
        L_0x011a:
            r29 = r3
            r3 = 1
        L_0x011d:
            r14 = 2
        L_0x011e:
            if (r5 != r3) goto L_0x0122
            r3 = 2
            goto L_0x0123
        L_0x0122:
            r3 = 1
        L_0x0123:
            int r25 = r25 + r26
            int r25 = r25 * r14
            int r2 = r2 - r25
            int r27 = r27 + r28
            int r27 = r27 * r3
            int r24 = r24 - r27
            goto L_0x0132
        L_0x0130:
            r29 = r3
        L_0x0132:
            r14 = r2
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r2 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            boolean r3 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r5 = 1
            if (r5 == r3) goto L_0x0146
            r3 = r8
            goto L_0x0147
        L_0x0146:
            r3 = 0
        L_0x0147:
            if (r3 > r8) goto L_0x0155
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r3 = r3 + 1
            goto L_0x0147
        L_0x0155:
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            boolean r3 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r3 == 0) goto L_0x01be
            boolean r3 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r3 == 0) goto L_0x01be
            r3 = 0
        L_0x0174:
            r5 = 4
            if (r3 >= r5) goto L_0x01be
            r5 = 0
        L_0x0178:
            r8 = 6
            if (r5 >= r8) goto L_0x01b6
            boolean r25 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r25 != 0) goto L_0x018a
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r26 = r11
            r27 = r12
        L_0x0188:
            r8 = 3
            goto L_0x01ab
        L_0x018a:
            r8 = 64
            int r25 = r3 + r3
            r22 = 4
            int r25 = r25 + 4
            r26 = r11
            r27 = r12
            r11 = 1
            int r12 = r11 << r25
            int r8 = java.lang.Math.min(r8, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r3 <= r11) goto L_0x01a2
            r13.zzb()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
        L_0x01a2:
            r11 = 0
        L_0x01a3:
            if (r11 >= r8) goto L_0x0188
            r13.zzb()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r11 = r11 + 1
            goto L_0x01a3
        L_0x01ab:
            if (r3 != r8) goto L_0x01af
            r11 = 3
            goto L_0x01b0
        L_0x01af:
            r11 = 1
        L_0x01b0:
            int r5 = r5 + r11
            r11 = r26
            r12 = r27
            goto L_0x0178
        L_0x01b6:
            r26 = r11
            r27 = r12
            r8 = 3
            int r3 = r3 + 1
            goto L_0x0174
        L_0x01be:
            r26 = r11
            r27 = r12
            r8 = 3
            r3 = 2
            r13.zze(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            boolean r3 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r3 == 0) goto L_0x01db
            r3 = 8
            r13.zze(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
        L_0x01db:
            int r3 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r5 = 0
            r11 = 0
            r12 = 0
        L_0x01e2:
            if (r5 >= r3) goto L_0x0230
            if (r5 == 0) goto L_0x01ea
            boolean r11 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
        L_0x01ea:
            if (r11 == 0) goto L_0x0204
            r13.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r8 = 0
        L_0x01f3:
            if (r8 > r12) goto L_0x0201
            boolean r25 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r25 != 0) goto L_0x01fe
            r13.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
        L_0x01fe:
            int r8 = r8 + 1
            goto L_0x01f3
        L_0x0201:
            r28 = r3
            goto L_0x022a
        L_0x0204:
            int r8 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r12 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r25 = r8 + r12
            r28 = r3
            r3 = 0
        L_0x0211:
            if (r3 >= r8) goto L_0x021c
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r3 = r3 + 1
            goto L_0x0211
        L_0x021c:
            r3 = 0
        L_0x021d:
            if (r3 >= r12) goto L_0x0228
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r3 = r3 + 1
            goto L_0x021d
        L_0x0228:
            r12 = r25
        L_0x022a:
            int r5 = r5 + 1
            r3 = r28
            r8 = 3
            goto L_0x01e2
        L_0x0230:
            boolean r3 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r3 == 0) goto L_0x0246
            r3 = 0
        L_0x0237:
            int r5 = r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r3 >= r5) goto L_0x0246
            r5 = 5
            int r8 = r2 + 5
            r13.zze(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r3 = r3 + 1
            goto L_0x0237
        L_0x0246:
            r2 = 2
            r13.zze(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            boolean r2 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r2 == 0) goto L_0x02b3
            boolean r2 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r2 == 0) goto L_0x027b
            r2 = 8
            int r2 = r13.zza(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r3 = 255(0xff, float:3.57E-43)
            if (r2 != r3) goto L_0x0272
            r2 = 16
            int r3 = r13.zza(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            int r2 = r13.zza(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r3 == 0) goto L_0x027b
            if (r2 == 0) goto L_0x027b
            float r3 = (float) r3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            float r2 = (float) r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            float r3 = r3 / r2
            goto L_0x027d
        L_0x0272:
            r3 = 17
            if (r2 >= r3) goto L_0x027b
            float[] r3 = com.google.android.gms.internal.ads.zzzp.zzb     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r3 = r3[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            goto L_0x027d
        L_0x027b:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x027d:
            boolean r2 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r2 == 0) goto L_0x0286
            r13.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
        L_0x0286:
            boolean r2 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r2 == 0) goto L_0x029b
            r2 = 4
            r13.zze(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            boolean r2 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r2 == 0) goto L_0x029b
            r2 = 24
            r13.zze(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
        L_0x029b:
            boolean r2 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r2 == 0) goto L_0x02a7
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r13.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
        L_0x02a7:
            r13.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            boolean r2 = r13.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            if (r2 == 0) goto L_0x02b5
            int r24 = r24 + r24
            goto L_0x02b5
        L_0x02b3:
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x02b5:
            r22 = r15
            java.lang.String r17 = com.google.android.gms.internal.ads.zzcy.zzb(r18, r19, r20, r21, r22, r23)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r16 = r3
            r15 = r24
            r13 = 0
            goto L_0x02c7
        L_0x02c1:
            r29 = r3
            r26 = r11
            r27 = r12
        L_0x02c7:
            int r9 = r9 + r10
            r0.zzG(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r2 = 1
            int r13 = r13 + r2
            r11 = r26
            r12 = r27
            r3 = r29
            r2 = 3
            r5 = 0
            r8 = 1
            goto L_0x0051
        L_0x02d8:
            r29 = r3
            int r6 = r6 + 1
            r2 = 3
            r5 = 0
            r8 = 1
            goto L_0x0044
        L_0x02e1:
            if (r7 != 0) goto L_0x02e8
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            goto L_0x02ec
        L_0x02e8:
            java.util.List r0 = java.util.Collections.singletonList(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
        L_0x02ec:
            r12 = r0
            com.google.android.gms.internal.ads.zzzi r0 = new com.google.android.gms.internal.ads.zzzi     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            r2 = 1
            int r13 = r1 + 1
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x02f7 }
            return r0
        L_0x02f7:
            r0 = move-exception
            java.lang.String r1 = "Error parsing HEVC config"
            com.google.android.gms.internal.ads.zzbp r0 = com.google.android.gms.internal.ads.zzbp.zza(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzi.zza(com.google.android.gms.internal.ads.zzdy):com.google.android.gms.internal.ads.zzzi");
    }
}
