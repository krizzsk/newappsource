package com.google.android.gms.internal.nearby;

import androidx.recyclerview.widget.RecyclerView;
import java.math.RoundingMode;
import java.util.Arrays;
import p001a0.C0016g;

final class zztb {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    private final String zze;
    /* access modifiers changed from: private */
    public final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;

    public zztb(String str, char[] cArr) {
        boolean z;
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int zzb2 = zztj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = zzb2;
            int min = Math.min(8, Integer.lowestOneBit(zzb2));
            try {
                this.zzc = 8 / min;
                this.zzd = zzb2 / min;
                this.zza = length - 1;
                byte[] bArr = new byte[RecyclerView.C1119a0.FLAG_IGNORE];
                Arrays.fill(bArr, (byte) -1);
                int i = 0;
                while (true) {
                    boolean z2 = true;
                    if (i >= cArr.length) {
                        break;
                    }
                    char c = cArr[i];
                    if (c < 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzsg.zze(z, "Non-ASCII character: %s", c);
                    if (bArr[c] != -1) {
                        z2 = false;
                    }
                    zzsg.zze(z2, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                    i++;
                }
                this.zzg = bArr;
                boolean[] zArr = new boolean[this.zzc];
                for (int i2 = 0; i2 < this.zzd; i2++) {
                    zArr[zztj.zza(i2 * 8, this.zzb, RoundingMode.CEILING)] = true;
                }
                this.zzh = zArr;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet ".concat(new String(cArr)), e);
            }
        } catch (ArithmeticException e2) {
            StringBuilder k = C13555b.m33972k("Illegal alphabet length ");
            k.append(cArr.length);
            throw new IllegalArgumentException(k.toString(), e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zztb) {
            return Arrays.equals(this.zzf, ((zztb) obj).zzf);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf);
    }

    public final String toString() {
        return this.zze;
    }

    public final char zza(int i) {
        return this.zzf[i];
    }

    public final int zzb(char c) throws zzte {
        if (c <= 127) {
            byte b = this.zzg[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new zzte("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
            }
            throw new zzte(C0016g.m28k("Unrecognized character: ", c));
        }
        throw new zzte("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
    }

    public final boolean zzc(int i) {
        return this.zzh[i % this.zzc];
    }

    public final boolean zzd(char c) {
        return c < 128 && this.zzg[c] != -1;
    }
}
