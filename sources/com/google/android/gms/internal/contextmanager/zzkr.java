package com.google.android.gms.internal.contextmanager;

import java.io.IOException;

final class zzkr {
    public static int zza(byte[] bArr, int i, zzkq zzkq) throws zzmp {
        int zzj = zzj(bArr, i, zzkq);
        int i2 = zzkq.zza;
        if (i2 < 0) {
            throw zzmp.zzd();
        } else if (i2 > bArr.length - zzj) {
            throw zzmp.zzg();
        } else if (i2 == 0) {
            zzkq.zzc = zzld.zzb;
            return zzj;
        } else {
            zzkq.zzc = zzld.zzn(bArr, zzj, i2);
            return zzj + i2;
        }
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zznz zznz, byte[] bArr, int i, int i2, int i3, zzkq zzkq) throws IOException {
        zznq zznq = (zznq) zznz;
        Object zze = zznq.zze();
        int zzc = zznq.zzc(zze, bArr, i, i2, i3, zzkq);
        zznq.zzf(zze);
        zzkq.zzc = zze;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzd(com.google.android.gms.internal.contextmanager.zznz r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.contextmanager.zzkq r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zzk(r8, r7, r0, r10)
            int r8 = r10.zza
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zze()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zzh(r1, r2, r3, r4, r5)
            r6.zzf(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.contextmanager.zzmp r6 = com.google.android.gms.internal.contextmanager.zzmp.zzg()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zzkr.zzd(com.google.android.gms.internal.contextmanager.zznz, byte[], int, int, com.google.android.gms.internal.contextmanager.zzkq):int");
    }

    public static int zze(zznz<?> zznz, int i, byte[] bArr, int i2, int i3, zzmm<?> zzmm, zzkq zzkq) throws IOException {
        int zzd = zzd(zznz, bArr, i2, i3, zzkq);
        zzmm.add(zzkq.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzkq);
            if (i != zzkq.zza) {
                break;
            }
            zzd = zzd(zznz, bArr, zzj, i3, zzkq);
            zzmm.add(zzkq.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i, zzmm<?> zzmm, zzkq zzkq) throws IOException {
        zzmg zzmg = (zzmg) zzmm;
        int zzj = zzj(bArr, i, zzkq);
        int i2 = zzkq.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzkq);
            zzmg.zzh(zzkq.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzmp.zzg();
    }

    public static int zzg(byte[] bArr, int i, zzkq zzkq) throws zzmp {
        int zzj = zzj(bArr, i, zzkq);
        int i2 = zzkq.zza;
        if (i2 < 0) {
            throw zzmp.zzd();
        } else if (i2 == 0) {
            zzkq.zzc = "";
            return zzj;
        } else {
            zzkq.zzc = new String(bArr, zzj, i2, zzmn.zza);
            return zzj + i2;
        }
    }

    public static int zzh(byte[] bArr, int i, zzkq zzkq) throws zzmp {
        int zzj = zzj(bArr, i, zzkq);
        int i2 = zzkq.zza;
        if (i2 < 0) {
            throw zzmp.zzd();
        } else if (i2 == 0) {
            zzkq.zzc = "";
            return zzj;
        } else {
            zzkq.zzc = zzpc.zzd(bArr, zzj, i2);
            return zzj + i2;
        }
    }

    public static int zzi(int i, byte[] bArr, int i2, int i3, zzoo zzoo, zzkq zzkq) throws zzmp {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzm = zzm(bArr, i2, zzkq);
                zzoo.zzh(i, Long.valueOf(zzkq.zzb));
                return zzm;
            } else if (i4 == 1) {
                zzoo.zzh(i, Long.valueOf(zzo(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zzj = zzj(bArr, i2, zzkq);
                int i5 = zzkq.zza;
                if (i5 < 0) {
                    throw zzmp.zzd();
                } else if (i5 <= bArr.length - zzj) {
                    if (i5 == 0) {
                        zzoo.zzh(i, zzld.zzb);
                    } else {
                        zzoo.zzh(i, zzld.zzn(bArr, zzj, i5));
                    }
                    return zzj + i5;
                } else {
                    throw zzmp.zzg();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                zzoo zze = zzoo.zze();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i2, zzkq);
                    int i8 = zzkq.zza;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zzj2;
                        break;
                    }
                    i7 = i8;
                    i2 = zzi(i8, bArr, zzj2, i3, zze, zzkq);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzmp.zze();
                }
                zzoo.zzh(i, zze);
                return i2;
            } else if (i4 == 5) {
                zzoo.zzh(i, Integer.valueOf(zzb(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzmp.zzb();
            }
        } else {
            throw zzmp.zzb();
        }
    }

    public static int zzj(byte[] bArr, int i, zzkq zzkq) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzk(b, bArr, i2, zzkq);
        }
        zzkq.zza = b;
        return i2;
    }

    public static int zzk(int i, byte[] bArr, int i2, zzkq zzkq) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzkq.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzkq.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzkq.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i11 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzkq.zza = i9 | (b4 << 28);
            return i11;
        }
        int i12 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] < 0) {
                i11 = i13;
            } else {
                zzkq.zza = i12;
                return i13;
            }
        }
    }

    public static int zzl(int i, byte[] bArr, int i2, int i3, zzmm<?> zzmm, zzkq zzkq) {
        zzmg zzmg = (zzmg) zzmm;
        int zzj = zzj(bArr, i2, zzkq);
        zzmg.zzh(zzkq.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzkq);
            if (i != zzkq.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzkq);
            zzmg.zzh(zzkq.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i, zzkq zzkq) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            int i3 = i2 + 1;
            byte b = bArr[i2];
            long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
            int i4 = 7;
            while (b < 0) {
                int i5 = i3 + 1;
                byte b2 = bArr[i3];
                i4 += 7;
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
                int i6 = i5;
                b = b2;
                i3 = i6;
            }
            zzkq.zzb = j2;
            return i3;
        }
        zzkq.zzb = j;
        return i2;
    }

    public static int zzn(int i, byte[] bArr, int i2, int i3, zzkq zzkq) throws zzmp {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzm(bArr, i2, zzkq);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zzj(bArr, i2, zzkq) + zzkq.zza;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = zzj(bArr, i2, zzkq);
                    i6 = zzkq.zza;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = zzn(i6, bArr, i2, i3, zzkq);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzmp.zze();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzmp.zzb();
            }
        } else {
            throw zzmp.zzb();
        }
    }

    public static long zzo(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
