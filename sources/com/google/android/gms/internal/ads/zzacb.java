package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

public final class zzacb {
    public static final zzabz zza = zzaby.zza;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004e, code lost:
        if ((r6 & 64) != 0) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.gms.internal.ads.zzbl zza(byte[] r10, int r11, com.google.android.gms.internal.ads.zzabz r12, com.google.android.gms.internal.ads.zzabc r13) {
        /*
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.google.android.gms.internal.ads.zzdy r0 = new com.google.android.gms.internal.ads.zzdy
            r0.<init>(r10, r11)
            int r10 = r0.zza()
            r11 = 2
            r1 = 10
            r2 = 4
            r3 = 0
            r4 = 1
            r5 = 0
            if (r10 >= r1) goto L_0x001a
        L_0x0017:
            r8 = r5
            goto L_0x0086
        L_0x001a:
            int r10 = r0.zzm()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r10 == r6) goto L_0x003b
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r6[r3] = r10
            java.lang.String r10 = "%06X"
            java.lang.String r10 = java.lang.String.format(r10, r6)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r6 = "Unexpected first three bytes of ID3 tag header: 0x"
            r6.concat(r10)
            goto L_0x0017
        L_0x003b:
            int r10 = r0.zzk()
            r0.zzG(r4)
            int r6 = r0.zzk()
            int r7 = r0.zzj()
            if (r10 != r11) goto L_0x0051
            r8 = r6 & 64
            if (r8 == 0) goto L_0x0078
            goto L_0x0017
        L_0x0051:
            r8 = 3
            if (r10 != r8) goto L_0x0062
            r8 = r6 & 64
            if (r8 == 0) goto L_0x0078
            int r8 = r0.zze()
            r0.zzG(r8)
            int r8 = r8 + r2
            int r7 = r7 - r8
            goto L_0x0078
        L_0x0062:
            if (r10 != r2) goto L_0x0017
            r8 = r6 & 64
            if (r8 == 0) goto L_0x0072
            int r8 = r0.zzj()
            int r9 = r8 + -4
            r0.zzG(r9)
            int r7 = r7 - r8
        L_0x0072:
            r8 = r6 & 16
            if (r8 == 0) goto L_0x0078
            int r7 = r7 + -10
        L_0x0078:
            if (r10 >= r2) goto L_0x0080
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0080
            r6 = 1
            goto L_0x0081
        L_0x0080:
            r6 = 0
        L_0x0081:
            com.google.android.gms.internal.ads.zzaca r8 = new com.google.android.gms.internal.ads.zzaca
            r8.<init>(r10, r6, r7)
        L_0x0086:
            if (r8 != 0) goto L_0x0089
            return r5
        L_0x0089:
            int r10 = r0.zzc()
            int r6 = r8.zza
            if (r6 != r11) goto L_0x0094
            r1 = 6
        L_0x0094:
            int r11 = r8.zzc
            boolean r6 = r8.zzb
            if (r6 == 0) goto L_0x00a6
            int r11 = r8.zzc
            int r11 = zze(r0, r11)
        L_0x00a6:
            int r10 = r10 + r11
            r0.zzE(r10)
            int r10 = r8.zza
            boolean r10 = zzj(r0, r10, r1, r3)
            if (r10 != 0) goto L_0x00c6
            int r10 = r8.zza
            if (r10 != r2) goto L_0x00c2
            boolean r10 = zzj(r0, r2, r1, r4)
            if (r10 == 0) goto L_0x00c2
            r3 = 1
            goto L_0x00c6
        L_0x00c2:
            int unused = r8.zza
            return r5
        L_0x00c6:
            int r10 = r0.zza()
            if (r10 < r1) goto L_0x00da
            int r10 = r8.zza
            com.google.android.gms.internal.ads.zzacc r10 = zzf(r10, r0, r3, r1, r12)
            if (r10 == 0) goto L_0x00c6
            r13.add(r10)
            goto L_0x00c6
        L_0x00da:
            com.google.android.gms.internal.ads.zzbl r10 = new com.google.android.gms.internal.ads.zzbl
            r10.<init>((java.util.List) r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacb.zza(byte[], int, com.google.android.gms.internal.ads.zzabz, com.google.android.gms.internal.ads.zzabc):com.google.android.gms.internal.ads.zzbl");
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            if ((zzd - i) % 2 == 0 && bArr[zzd + 1] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, zzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzdy zzdy, int i) {
        byte[] zzH = zzdy.zzH();
        int zzc = zzdy.zzc();
        int i2 = zzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzc + i) {
                return i;
            }
            if ((zzH[i2] & 255) == 255 && zzH[i3] == 0) {
                System.arraycopy(zzH, i2 + 2, zzH, i3, (i - (i2 - zzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: type inference failed for: r3v15, types: [com.google.android.gms.internal.ads.zzabv] */
    /* JADX WARNING: type inference failed for: r3v18, types: [com.google.android.gms.internal.ads.zzabn] */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0261, code lost:
        if (r9 == 67) goto L_0x0263;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a8 A[Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c1 A[Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0474 A[Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e2 A[Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04fa A[Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzacc zzf(int r34, com.google.android.gms.internal.ads.zzdy r35, boolean r36, int r37, com.google.android.gms.internal.ads.zzabz r38) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            int r4 = r35.zzk()
            int r5 = r35.zzk()
            int r6 = r35.zzk()
            r7 = 3
            r8 = 0
            if (r0 < r7) goto L_0x001d
            int r9 = r35.zzk()
            goto L_0x001e
        L_0x001d:
            r9 = 0
        L_0x001e:
            r10 = 4
            if (r0 != r10) goto L_0x003d
            int r11 = r35.zzn()
            if (r2 != 0) goto L_0x0048
            r12 = r11 & 255(0xff, float:3.57E-43)
            int r13 = r11 >> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 7
            r12 = r12 | r13
            int r13 = r11 >> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 14
            r12 = r12 | r13
            int r11 = r11 >> 24
            int r11 = r11 << 21
            r11 = r11 | r12
            goto L_0x0048
        L_0x003d:
            if (r0 != r7) goto L_0x0044
            int r11 = r35.zzn()
            goto L_0x0048
        L_0x0044:
            int r11 = r35.zzm()
        L_0x0048:
            if (r0 < r7) goto L_0x004f
            int r12 = r35.zzo()
            goto L_0x0050
        L_0x004f:
            r12 = 0
        L_0x0050:
            r13 = 0
            if (r4 != 0) goto L_0x0066
            if (r5 != 0) goto L_0x0066
            if (r6 != 0) goto L_0x0066
            if (r9 != 0) goto L_0x0066
            if (r11 != 0) goto L_0x0066
            if (r12 == 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            int r0 = r35.zzd()
            r1.zzF(r0)
            return r13
        L_0x0066:
            int r14 = r35.zzc()
            int r14 = r14 + r11
            int r15 = r35.zzd()
            if (r14 <= r15) goto L_0x0079
            int r0 = r35.zzd()
            r1.zzF(r0)
            return r13
        L_0x0079:
            if (r38 != 0) goto L_0x051b
            r15 = 1
            if (r0 != r7) goto L_0x009d
            r7 = r12 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0084
            r7 = 1
            goto L_0x0085
        L_0x0084:
            r7 = 0
        L_0x0085:
            r17 = r12 & 64
            if (r17 == 0) goto L_0x008c
            r17 = 1
            goto L_0x008e
        L_0x008c:
            r17 = 0
        L_0x008e:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x0094
            r12 = 1
            goto L_0x0095
        L_0x0094:
            r12 = 0
        L_0x0095:
            r18 = r17
            r19 = 0
            r17 = r12
            r12 = r7
            goto L_0x00d1
        L_0x009d:
            if (r0 != r10) goto L_0x00c9
            r7 = r12 & 64
            if (r7 == 0) goto L_0x00a5
            r7 = 1
            goto L_0x00a6
        L_0x00a5:
            r7 = 0
        L_0x00a6:
            r17 = r12 & 8
            if (r17 == 0) goto L_0x00ad
            r17 = 1
            goto L_0x00af
        L_0x00ad:
            r17 = 0
        L_0x00af:
            r18 = r12 & 4
            if (r18 == 0) goto L_0x00b6
            r18 = 1
            goto L_0x00b8
        L_0x00b6:
            r18 = 0
        L_0x00b8:
            r19 = r12 & 2
            if (r19 == 0) goto L_0x00bf
            r19 = 1
            goto L_0x00c1
        L_0x00bf:
            r19 = 0
        L_0x00c1:
            r12 = r12 & r15
            r33 = r17
            r17 = r7
            r7 = r33
            goto L_0x00d1
        L_0x00c9:
            r7 = 0
            r12 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x00d1:
            if (r7 != 0) goto L_0x0516
            if (r18 == 0) goto L_0x00d7
            goto L_0x0516
        L_0x00d7:
            if (r17 == 0) goto L_0x00de
            int r11 = r11 + -1
            r1.zzG(r15)
        L_0x00de:
            if (r12 == 0) goto L_0x00e5
            int r11 = r11 + -4
            r1.zzG(r10)
        L_0x00e5:
            if (r19 == 0) goto L_0x00eb
            int r11 = zze(r1, r11)
        L_0x00eb:
            r7 = 84
            r12 = 88
            r10 = -1
            r15 = 2
            if (r4 != r7) goto L_0x012a
            if (r5 != r12) goto L_0x012a
            if (r6 != r12) goto L_0x012a
            if (r0 == r15) goto L_0x00fb
            if (r9 != r12) goto L_0x012a
        L_0x00fb:
            if (r11 > 0) goto L_0x00fe
            goto L_0x0132
        L_0x00fe:
            int r2 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r3 = zzh(r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r11 = r11 + r10
            byte[] r7 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r1.zzB(r7, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r10 = zzc(r7, r8, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r11.<init>(r7, r8, r10, r3)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r8 = zzb(r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r10 = r10 + r8
            int r2 = zzc(r7, r10, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r2 = zzg(r7, r10, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            com.google.android.gms.internal.ads.zzack r3 = new com.google.android.gms.internal.ads.zzack     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r7 = "TXXX"
            r3.<init>(r7, r11, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            goto L_0x0157
        L_0x012a:
            if (r4 != r7) goto L_0x015c
            java.lang.String r2 = zzi(r0, r7, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            if (r11 > 0) goto L_0x013b
        L_0x0132:
            r17 = r4
            r3 = r5
            r4 = r6
        L_0x0136:
            r8 = r9
            r20 = r14
            goto L_0x04f8
        L_0x013b:
            int r3 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r7 = zzh(r3)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r11 = r11 + r10
            byte[] r10 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r1.zzB(r10, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r3 = zzc(r10, r8, r3)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r11.<init>(r10, r8, r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            com.google.android.gms.internal.ads.zzack r3 = new com.google.android.gms.internal.ads.zzack     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r3.<init>(r2, r13, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
        L_0x0157:
            r13 = r3
            goto L_0x0132
        L_0x0159:
            r0 = move-exception
            goto L_0x050d
        L_0x015c:
            r7 = 87
            java.lang.String r13 = "ISO-8859-1"
            if (r4 != r7) goto L_0x01a5
            if (r5 != r12) goto L_0x01a2
            if (r6 != r12) goto L_0x01a2
            if (r0 == r15) goto L_0x016a
            if (r9 != r12) goto L_0x01a2
        L_0x016a:
            if (r11 > 0) goto L_0x0176
            r17 = r4
            r3 = r5
            r4 = r6
            r8 = r9
            r20 = r14
        L_0x0173:
            r13 = 0
            goto L_0x04f8
        L_0x0176:
            int r2 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r3 = zzh(r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r11 = r11 + r10
            byte[] r7 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r1.zzB(r7, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r10 = zzc(r7, r8, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r11.<init>(r7, r8, r10, r3)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r2 = zzb(r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r10 = r10 + r2
            int r2 = zzd(r7, r10)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r2 = zzg(r7, r10, r2, r13)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            com.google.android.gms.internal.ads.zzacm r3 = new com.google.android.gms.internal.ads.zzacm     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r7 = "WXXX"
            r3.<init>(r7, r11, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            goto L_0x0157
        L_0x01a2:
            r12 = 87
            goto L_0x01a6
        L_0x01a5:
            r12 = r4
        L_0x01a6:
            if (r12 != r7) goto L_0x01c1
            java.lang.String r2 = zzi(r0, r7, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            byte[] r3 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r1.zzB(r3, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r7 = zzd(r3, r8)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r10.<init>(r3, r8, r7, r13)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            com.google.android.gms.internal.ads.zzacm r3 = new com.google.android.gms.internal.ads.zzacm     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r7 = 0
            r3.<init>(r2, r7, r10)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            goto L_0x0157
        L_0x01c1:
            r7 = 73
            r10 = 80
            if (r12 != r10) goto L_0x01ee
            r12 = 82
            if (r5 != r12) goto L_0x01ec
            if (r6 != r7) goto L_0x01ec
            r12 = 86
            if (r9 != r12) goto L_0x01ec
            byte[] r2 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r1.zzB(r2, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r3 = zzd(r2, r8)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r7.<init>(r2, r8, r3, r13)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r8 = 1
            int r3 = r3 + r8
            byte[] r2 = zzk(r2, r3, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            com.google.android.gms.internal.ads.zzaci r3 = new com.google.android.gms.internal.ads.zzaci     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r3.<init>(r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            goto L_0x0157
        L_0x01ec:
            r12 = 80
        L_0x01ee:
            r7 = 79
            r10 = 71
            if (r12 != r10) goto L_0x0246
            r12 = 69
            if (r5 != r12) goto L_0x0244
            if (r6 != r7) goto L_0x0244
            r12 = 66
            if (r9 == r12) goto L_0x0200
            if (r0 != r15) goto L_0x0244
        L_0x0200:
            int r2 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r3 = zzh(r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r7 = -1
            int r11 = r11 + r7
            byte[] r7 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r1.zzB(r7, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r10 = zzd(r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r12.<init>(r7, r8, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r8 = 1
            int r10 = r10 + r8
            int r8 = zzc(r7, r10, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r10 = zzg(r7, r10, r8, r3)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r13 = zzb(r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r8 = r8 + r13
            int r13 = zzc(r7, r8, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r3 = zzg(r7, r8, r13, r3)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r2 = zzb(r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            int r13 = r13 + r2
            byte[] r2 = zzk(r7, r13, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            com.google.android.gms.internal.ads.zzabx r7 = new com.google.android.gms.internal.ads.zzabx     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r7.<init>(r12, r10, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r17 = r4
            r3 = r5
            r4 = r6
            r13 = r7
            goto L_0x0136
        L_0x0244:
            r12 = 71
        L_0x0246:
            r10 = 65
            r7 = 67
            if (r0 != r15) goto L_0x0257
            r15 = 80
            if (r12 != r15) goto L_0x02d6
            r8 = 73
            if (r5 != r8) goto L_0x02d6
            if (r6 != r7) goto L_0x02d6
            goto L_0x0263
        L_0x0257:
            r8 = 73
            r15 = 80
            if (r12 != r10) goto L_0x02d6
            if (r5 != r15) goto L_0x02d6
            if (r6 != r8) goto L_0x02d6
            if (r9 != r7) goto L_0x02d6
        L_0x0263:
            int r2 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r3 = zzh(r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r7 = -1
            int r11 = r11 + r7
            byte[] r7 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r8 = 0
            r1.zzB(r7, r8, r11)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r10 = 2
            if (r0 != r10) goto L_0x0296
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r12 = 3
            r10.<init>(r7, r8, r12, r13)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r8 = "image/"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzfoa.zza(r10)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r8 = r8.concat(r10)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r10 = "image/jpg"
            boolean r10 = r10.equals(r8)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            if (r10 == 0) goto L_0x0294
            java.lang.String r8 = "image/jpeg"
        L_0x0294:
            r10 = 2
            goto L_0x02b2
        L_0x0296:
            int r10 = zzd(r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r12.<init>(r7, r8, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r8 = com.google.android.gms.internal.ads.zzfoa.zza(r12)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r12 = 47
            int r12 = r8.indexOf(r12)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r13 = -1
            if (r12 != r13) goto L_0x02b2
            java.lang.String r12 = "image/"
            java.lang.String r8 = r12.concat(r8)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
        L_0x02b2:
            int r12 = r10 + 1
            byte r12 = r7[r12]     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r12 = r12 & 255(0xff, float:3.57E-43)
            r13 = 2
            int r10 = r10 + r13
            int r13 = zzc(r7, r10, r2)     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0511, all -> 0x0159 }
            r20 = r14
            int r14 = r13 - r10
            r15.<init>(r7, r10, r14, r3)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r2 = zzb(r2)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r13 = r13 + r2
            byte[] r2 = zzk(r7, r13, r11)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            com.google.android.gms.internal.ads.zzabn r3 = new com.google.android.gms.internal.ads.zzabn     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r3.<init>(r8, r15, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            goto L_0x0327
        L_0x02d6:
            r20 = r14
            r8 = 77
            if (r12 != r7) goto L_0x032f
            r14 = 79
            if (r5 != r14) goto L_0x032f
            if (r6 != r8) goto L_0x032f
            if (r9 == r8) goto L_0x02e7
            r14 = 2
            if (r0 != r14) goto L_0x032f
        L_0x02e7:
            r2 = 4
            if (r11 >= r2) goto L_0x02f1
            r17 = r4
            r3 = r5
            r4 = r6
            r8 = r9
            goto L_0x0173
        L_0x02f1:
            int r2 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            java.lang.String r3 = zzh(r2)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r7 = 3
            byte[] r8 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r10 = 0
            r1.zzB(r8, r10, r7)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r12.<init>(r8, r10, r7)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r11 = r11 + -4
            byte[] r7 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r1.zzB(r7, r10, r11)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r8 = zzc(r7, r10, r2)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r11.<init>(r7, r10, r8, r3)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r10 = zzb(r2)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r8 = r8 + r10
            int r2 = zzc(r7, r8, r2)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            java.lang.String r2 = zzg(r7, r8, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            com.google.android.gms.internal.ads.zzabv r3 = new com.google.android.gms.internal.ads.zzabv     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r3.<init>(r12, r11, r2)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        L_0x0327:
            r13 = r3
            r17 = r4
            r3 = r5
            r4 = r6
            r8 = r9
            goto L_0x04f8
        L_0x032f:
            if (r12 != r7) goto L_0x03ae
            r14 = 72
            if (r5 != r14) goto L_0x03ae
            if (r6 != r10) goto L_0x03ae
            r10 = 80
            if (r9 != r10) goto L_0x03ae
            int r7 = r35.zzc()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            byte[] r8 = r35.zzH()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r8 = zzd(r8, r7)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            byte[] r12 = r35.zzH()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r14 = r8 - r7
            r10.<init>(r12, r7, r14, r13)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r12 = 1
            int r8 = r8 + r12
            r1.zzF(r8)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r26 = r35.zze()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r27 = r35.zze()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            long r12 = r35.zzs()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x036e
            r12 = -1
        L_0x036e:
            r28 = r12
            long r12 = r35.zzs()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x037f
            r12 = -1
        L_0x037f:
            r30 = r12
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r8.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r7 = r7 + r11
        L_0x0387:
            int r11 = r35.zzc()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            if (r11 >= r7) goto L_0x0398
            r11 = 0
            com.google.android.gms.internal.ads.zzacc r12 = zzf(r0, r1, r2, r3, r11)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            if (r12 == 0) goto L_0x0387
            r8.add(r12)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            goto L_0x0387
        L_0x0398:
            r2 = 0
            com.google.android.gms.internal.ads.zzacc[] r2 = new com.google.android.gms.internal.ads.zzacc[r2]     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            java.lang.Object[] r2 = r8.toArray(r2)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r32 = r2
            com.google.android.gms.internal.ads.zzacc[] r32 = (com.google.android.gms.internal.ads.zzacc[]) r32     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            com.google.android.gms.internal.ads.zzabr r3 = new com.google.android.gms.internal.ads.zzabr     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r24 = r3
            r25 = r10
            r24.<init>(r25, r26, r27, r28, r30, r32)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            goto L_0x0327
        L_0x03ae:
            if (r12 != r7) goto L_0x046a
            r10 = 84
            if (r5 != r10) goto L_0x046a
            r10 = 79
            if (r6 != r10) goto L_0x046a
            if (r9 != r7) goto L_0x046a
            int r7 = r35.zzc()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            byte[] r8 = r35.zzH()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r8 = zzd(r8, r7)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            byte[] r12 = r35.zzH()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r14 = r8 - r7
            r10.<init>(r12, r7, r14, r13)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r12 = 1
            int r8 = r8 + r12
            r1.zzF(r8)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r8 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r12 = r8 & 2
            if (r12 == 0) goto L_0x03e2
            r12 = 1
            r26 = 1
            goto L_0x03e5
        L_0x03e2:
            r12 = 1
            r26 = 0
        L_0x03e5:
            r8 = r8 & r12
            int r12 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r15 = 0
        L_0x03ed:
            if (r15 >= r12) goto L_0x0424
            r16 = r12
            int r12 = r35.zzc()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r17 = r4
            byte[] r4 = r35.zzH()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r4 = zzd(r4, r12)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r21 = r9
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r22 = r6
            byte[] r6 = r35.zzH()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r23 = r5
            int r5 = r4 - r12
            r9.<init>(r6, r12, r5, r13)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r14[r15] = r9     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r4 = r4 + 1
            r1.zzF(r4)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r15 = r15 + 1
            r12 = r16
            r4 = r17
            r9 = r21
            r6 = r22
            r5 = r23
            goto L_0x03ed
        L_0x0424:
            r17 = r4
            r23 = r5
            r22 = r6
            r21 = r9
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r7 = r7 + r11
        L_0x0432:
            int r5 = r35.zzc()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            if (r5 >= r7) goto L_0x0443
            r5 = 0
            com.google.android.gms.internal.ads.zzacc r6 = zzf(r0, r1, r2, r3, r5)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            if (r6 == 0) goto L_0x0432
            r4.add(r6)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            goto L_0x0432
        L_0x0443:
            r2 = 0
            com.google.android.gms.internal.ads.zzacc[] r3 = new com.google.android.gms.internal.ads.zzacc[r2]     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            java.lang.Object[] r2 = r4.toArray(r3)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r29 = r2
            com.google.android.gms.internal.ads.zzacc[] r29 = (com.google.android.gms.internal.ads.zzacc[]) r29     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            com.google.android.gms.internal.ads.zzabt r3 = new com.google.android.gms.internal.ads.zzabt     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r2 = 1
            if (r2 == r8) goto L_0x0456
            r27 = 0
            goto L_0x0458
        L_0x0456:
            r27 = 1
        L_0x0458:
            r24 = r3
            r25 = r10
            r28 = r14
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r13 = r3
            r8 = r21
            r4 = r22
            r3 = r23
            goto L_0x04f8
        L_0x046a:
            r17 = r4
            r23 = r5
            r22 = r6
            r21 = r9
            if (r12 != r8) goto L_0x04e2
            r2 = 76
            r3 = r23
            if (r3 != r2) goto L_0x04dd
            r2 = 76
            r4 = r22
            r8 = r21
            if (r4 != r2) goto L_0x04e8
            r2 = 84
            if (r8 != r2) goto L_0x04e8
            int r25 = r35.zzo()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r26 = r35.zzm()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r27 = r35.zzm()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r2 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r5 = r35.zzk()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            com.google.android.gms.internal.ads.zzdx r6 = new com.google.android.gms.internal.ads.zzdx     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            byte[] r7 = r35.zzH()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r9 = r35.zzd()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r6.zzg(r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r7 = r35.zzc()     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r7 = r7 * 8
            r6.zzh(r7)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r11 = r11 + -10
            int r11 = r11 * 8
            int r7 = r2 + r5
            int r11 = r11 / r7
            int[] r7 = new int[r11]     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int[] r9 = new int[r11]     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r10 = 0
        L_0x04bf:
            if (r10 >= r11) goto L_0x04d0
            int r12 = r6.zzc(r2)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r13 = r6.zzc(r5)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r7[r10] = r12     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r9[r10] = r13     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            int r10 = r10 + 1
            goto L_0x04bf
        L_0x04d0:
            com.google.android.gms.internal.ads.zzacg r2 = new com.google.android.gms.internal.ads.zzacg     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r24 = r2
            r28 = r7
            r29 = r9
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r13 = r2
            goto L_0x04f8
        L_0x04dd:
            r8 = r21
            r4 = r22
            goto L_0x04e8
        L_0x04e2:
            r8 = r21
            r4 = r22
            r3 = r23
        L_0x04e8:
            java.lang.String r2 = zzi(r0, r12, r3, r4, r8)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            byte[] r5 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r6 = 0
            r1.zzB(r5, r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            com.google.android.gms.internal.ads.zzabp r6 = new com.google.android.gms.internal.ads.zzabp     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r6.<init>(r2, r5)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            r13 = r6
        L_0x04f8:
            if (r13 != 0) goto L_0x0507
            r2 = r17
            zzi(r0, r2, r3, r4, r8)     // Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
            goto L_0x0507
        L_0x0500:
            r0 = move-exception
            r14 = r20
            goto L_0x050d
        L_0x0504:
            r14 = r20
            goto L_0x0511
        L_0x0507:
            r14 = r20
            r1.zzF(r14)
            return r13
        L_0x050d:
            r1.zzF(r14)
            throw r0
        L_0x0511:
            r1.zzF(r14)
            r0 = 0
            return r0
        L_0x0516:
            r0 = r13
            r1.zzF(r14)
            return r0
        L_0x051b:
            r0 = r13
            r1.zzF(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacb.zzf(int, com.google.android.gms.internal.ads.zzdy, boolean, int, com.google.android.gms.internal.ads.zzabz):com.google.android.gms.internal.ads.zzacc");
    }

    private static String zzg(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static String zzh(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r10 & androidx.recyclerview.widget.RecyclerView.C1119a0.FLAG_IGNORE) != 0) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zzj(com.google.android.gms.internal.ads.zzdy r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r19.zzc()
        L_0x0008:
            int r3 = r19.zza()     // Catch:{ all -> 0x00ae }
            r4 = 1
            r5 = r21
            if (r3 < r5) goto L_0x00aa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r19.zze()     // Catch:{ all -> 0x00ae }
            long r8 = r19.zzs()     // Catch:{ all -> 0x00ae }
            int r10 = r19.zzo()     // Catch:{ all -> 0x00ae }
            goto L_0x002c
        L_0x0022:
            int r7 = r19.zzm()     // Catch:{ all -> 0x00ae }
            int r8 = r19.zzm()     // Catch:{ all -> 0x00ae }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003b
            if (r10 == 0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            r1.zzF(r2)
            return r4
        L_0x003b:
            r7 = 4
            if (r0 != r7) goto L_0x006a
            if (r22 != 0) goto L_0x006a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004c
            r1.zzF(r2)
            return r6
        L_0x004c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L_0x006a:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0088:
            r3 = 0
        L_0x0089:
            r4 = 0
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            int r3 = r3 + 4
        L_0x008e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            r1.zzF(r2)
            return r6
        L_0x0097:
            int r3 = r19.zza()     // Catch:{ all -> 0x00ae }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a4
            r1.zzF(r2)
            return r6
        L_0x00a4:
            int r3 = (int) r8
            r1.zzG(r3)     // Catch:{ all -> 0x00ae }
            goto L_0x0008
        L_0x00aa:
            r1.zzF(r2)
            return r4
        L_0x00ae:
            r0 = move-exception
            r1.zzF(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacb.zzj(com.google.android.gms.internal.ads.zzdy, int, int, boolean):boolean");
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzeg.zzf;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }
}
