package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class zzth extends zztj {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl = Integer.MAX_VALUE;

    public /* synthetic */ zzth(InputStream inputStream, int i, zztg zztg) {
        super((zzti) null);
        zzvi.zzf(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List<byte[]> zzu(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zze.read(bArr, i2, min - i2);
                if (read != -1) {
                    this.zzk += read;
                    i2 += read;
                } else {
                    throw zzvk.zzj();
                }
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzv() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = this.zzk + i;
        int i3 = this.zzl;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzh = i4;
            this.zzg = i - i4;
            return;
        }
        this.zzh = 0;
    }

    private final void zzw(int i) throws IOException {
        if (zzx(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.zzk) - this.zzi) {
            throw zzvk.zzi();
        }
        throw zzvk.zzj();
    }

    private final boolean zzx(int i) throws IOException {
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i2 + i > i3) {
            int i4 = this.zzk;
            if (i > (Integer.MAX_VALUE - i4) - i2 || i4 + i2 + i > this.zzl) {
                return false;
            }
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.zzk + i2;
                this.zzk = i4;
                i3 = this.zzg - i2;
                this.zzg = i3;
                this.zzi = 0;
            }
            try {
                int read = this.zze.read(this.zzf, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    String valueOf = String.valueOf(this.zze.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.zzg += read;
                    zzv();
                    if (this.zzg >= i) {
                        return true;
                    }
                    return zzx(i);
                }
            } catch (zzvk e) {
                e.zzk();
                throw e;
            }
        } else {
            throw new IllegalStateException(C13715c.m34242h(77, "refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
    }

    private final byte[] zzy(int i, boolean z) throws IOException {
        byte[] zzz = zzz(i);
        if (zzz != null) {
            return zzz;
        }
        int i2 = this.zzi;
        int i3 = this.zzg;
        int i4 = i3 - i2;
        this.zzk += i3;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzu = zzu(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, i2, bArr, 0, i4);
        for (byte[] next : zzu) {
            int length = next.length;
            System.arraycopy(next, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] zzz(int i) throws IOException {
        if (i == 0) {
            return zzvi.zzc;
        }
        if (i >= 0) {
            int i2 = this.zzk;
            int i3 = this.zzi;
            int i4 = i2 + i3 + i;
            if (-2147483647 + i4 <= 0) {
                int i5 = this.zzl;
                if (i4 <= i5) {
                    int i6 = this.zzg - i3;
                    int i7 = i - i6;
                    if (i7 >= 4096) {
                        try {
                            if (i7 > this.zze.available()) {
                                return null;
                            }
                        } catch (zzvk e) {
                            e.zzk();
                            throw e;
                        }
                    }
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.zzf, this.zzi, bArr, 0, i6);
                    this.zzk += this.zzg;
                    this.zzi = 0;
                    this.zzg = 0;
                    while (i6 < i) {
                        try {
                            int read = this.zze.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.zzk += read;
                                i6 += read;
                            } else {
                                throw zzvk.zzj();
                            }
                        } catch (zzvk e2) {
                            e2.zzk();
                            throw e2;
                        }
                    }
                    return bArr;
                }
                zzr((i5 - i2) - i3);
                throw zzvk.zzj();
            }
            throw zzvk.zzi();
        }
        throw zzvk.zzf();
    }

    public final int zza() {
        return this.zzk + this.zzi;
    }

    public final int zzb(int i) throws zzvk {
        if (i >= 0) {
            int i2 = this.zzk + this.zzi + i;
            int i3 = this.zzl;
            if (i2 <= i3) {
                this.zzl = i2;
                zzv();
                return i3;
            }
            throw zzvk.zzj();
        }
        throw zzvk.zzf();
    }

    public final int zzc() throws IOException {
        if (zzi()) {
            this.zzj = 0;
            return 0;
        }
        int zzn = zzn();
        this.zzj = zzn;
        if ((zzn >>> 3) != 0) {
            return zzn;
        }
        throw zzvk.zzc();
    }

    public final zztd zzd() throws IOException {
        int zzn = zzn();
        int i = this.zzg;
        int i2 = this.zzi;
        if (zzn <= i - i2 && zzn > 0) {
            zztd zzn2 = zztd.zzn(this.zzf, i2, zzn);
            this.zzi += zzn;
            return zzn2;
        } else if (zzn == 0) {
            return zztd.zzb;
        } else {
            byte[] zzz = zzz(zzn);
            if (zzz != null) {
                return zztd.zzm(zzz);
            }
            int i3 = this.zzi;
            int i4 = this.zzg;
            int i5 = i4 - i3;
            this.zzk += i4;
            this.zzi = 0;
            this.zzg = 0;
            List<byte[]> zzu = zzu(zzn - i5);
            byte[] bArr = new byte[zzn];
            System.arraycopy(this.zzf, i3, bArr, 0, i5);
            for (byte[] next : zzu) {
                int length = next.length;
                System.arraycopy(next, 0, bArr, i5, length);
                i5 += length;
            }
            return zztd.zzp(bArr);
        }
    }

    public final String zze() throws IOException {
        int zzn = zzn();
        if (zzn > 0) {
            int i = this.zzg;
            int i2 = this.zzi;
            if (zzn <= i - i2) {
                String str = new String(this.zzf, i2, zzn, zzvi.zza);
                this.zzi += zzn;
                return str;
            }
        }
        if (zzn == 0) {
            return "";
        }
        if (zzn > this.zzg) {
            return new String(zzy(zzn, false), zzvi.zza);
        }
        zzw(zzn);
        String str2 = new String(this.zzf, this.zzi, zzn, zzvi.zza);
        this.zzi += zzn;
        return str2;
    }

    public final String zzf() throws IOException {
        byte[] bArr;
        int zzn = zzn();
        int i = this.zzi;
        int i2 = this.zzg;
        if (zzn <= i2 - i && zzn > 0) {
            bArr = this.zzf;
            this.zzi = i + zzn;
        } else if (zzn == 0) {
            return "";
        } else {
            if (zzn <= i2) {
                zzw(zzn);
                bArr = this.zzf;
                this.zzi = zzn;
            } else {
                bArr = zzy(zzn, false);
            }
            i = 0;
        }
        return zzyd.zzd(bArr, i, zzn);
    }

    public final void zzg(int i) throws zzvk {
        if (this.zzj != i) {
            throw zzvk.zzb();
        }
    }

    public final void zzh(int i) {
        this.zzl = i;
        zzv();
    }

    public final boolean zzi() throws IOException {
        return this.zzi == this.zzg && !zzx(1);
    }

    public final boolean zzj() throws IOException {
        return zzp() != 0;
    }

    public final boolean zzk(int i) throws IOException {
        int zzc;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzg - this.zzi >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzf;
                    int i4 = this.zzi;
                    this.zzi = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzvk.zze();
            }
            while (i3 < 10) {
                if (zzl() < 0) {
                    i3++;
                }
            }
            throw zzvk.zze();
            return true;
        } else if (i2 == 1) {
            zzr(8);
            return true;
        } else if (i2 == 2) {
            zzr(zzn());
            return true;
        } else if (i2 == 3) {
            do {
                zzc = zzc();
                if (zzc == 0 || !zzk(zzc)) {
                    zzg(((i >>> 3) << 3) | 4);
                }
                zzc = zzc();
                break;
            } while (!zzk(zzc));
            zzg(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzr(4);
                return true;
            }
            throw zzvk.zza();
        }
    }

    public final byte zzl() throws IOException {
        if (this.zzi == this.zzg) {
            zzw(1);
        }
        byte[] bArr = this.zzf;
        int i = this.zzi;
        this.zzi = i + 1;
        return bArr[i];
    }

    public final int zzm() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            zzw(4);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzn() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.zzi = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.zzi = r1
            return r0
        L_0x006c:
            long r0 = r5.zzq()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzth.zzn():int");
    }

    public final long zzo() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            zzw(8);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public final long zzp() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.zzi;
        int i2 = this.zzg;
        if (i2 != i) {
            byte[] bArr = this.zzf;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.zzi = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.zzi = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.zzi = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.zzi = i4;
                    return j;
                }
                j = (long) b;
                this.zzi = i4;
                return j;
            }
        }
        return zzq();
    }

    public final long zzq() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzl2 = zzl();
            j |= ((long) (zzl2 & Byte.MAX_VALUE)) << i;
            if ((zzl2 & 128) == 0) {
                return j;
            }
        }
        throw zzvk.zze();
    }

    public final void zzr(int i) throws IOException {
        int i2 = this.zzg;
        int i3 = this.zzi;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.zzi = i3 + i;
        } else if (i >= 0) {
            int i5 = this.zzk;
            int i6 = i5 + i3;
            int i7 = this.zzl;
            if (i6 + i <= i7) {
                this.zzk = i6;
                this.zzg = 0;
                this.zzi = 0;
                while (i4 < i) {
                    try {
                        long j = (long) (i - i4);
                        long skip = this.zze.skip(j);
                        int i8 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i8 < 0 || skip > j) {
                            String valueOf = String.valueOf(this.zze.getClass());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        } else if (i8 == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (zzvk e) {
                        e.zzk();
                        throw e;
                    } catch (Throwable th) {
                        this.zzk += i4;
                        zzv();
                        throw th;
                    }
                }
                this.zzk += i4;
                zzv();
                if (i4 < i) {
                    int i9 = this.zzg;
                    int i11 = i9 - this.zzi;
                    this.zzi = i9;
                    zzw(1);
                    while (true) {
                        int i12 = i - i11;
                        int i13 = this.zzg;
                        if (i12 > i13) {
                            i11 += i13;
                            this.zzi = i13;
                            zzw(1);
                        } else {
                            this.zzi = i12;
                            return;
                        }
                    }
                }
            } else {
                zzr((i7 - i5) - i3);
                throw zzvk.zzj();
            }
        } else {
            throw zzvk.zzf();
        }
    }
}
