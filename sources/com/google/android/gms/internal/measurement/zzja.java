package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

class zzja extends zziz {
    public final byte[] zza;

    public zzja(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzjd) || zzd() != ((zzjd) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzja)) {
            return obj.equals(this);
        }
        zzja zzja = (zzja) obj;
        int zzk = zzk();
        int zzk2 = zzja.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzja.zzd()) {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
        } else if (zzd <= zzja.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzja.zza;
            zzja.zzc();
            int i = 0;
            int i2 = 0;
            while (i < zzd) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(C13715c.m34244j("Ran off end of other: 0, ", zzd, ", ", zzja.zzd()));
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public final int zze(int i, int i2, int i3) {
        return zzkm.zzd(i, this.zza, 0, i3);
    }

    public final zzjd zzf(int i, int i2) {
        int zzj = zzjd.zzj(0, i2, zzd());
        if (zzj == 0) {
            return zzjd.zzb;
        }
        return new zzix(this.zza, 0, zzj);
    }

    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public final void zzh(zzit zzit) throws IOException {
        ((zzji) zzit).zzc(this.zza, 0, zzd());
    }

    public final boolean zzi() {
        return zznc.zzf(this.zza, 0, zzd());
    }
}
