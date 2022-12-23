package com.google.android.gms.internal.contextmanager;

import java.io.IOException;
import java.nio.charset.Charset;

class zzlb extends zzla {
    public final byte[] zza;

    public zzlb(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzld) || zzd() != ((zzld) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlb)) {
            return obj.equals(this);
        }
        zzlb zzlb = (zzlb) obj;
        int zzl = zzl();
        int zzl2 = zzlb.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzlb.zzd()) {
            int zzd2 = zzd();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzd);
            sb.append(zzd2);
            throw new IllegalArgumentException(sb.toString());
        } else if (zzd <= zzlb.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzlb.zza;
            zzlb.zzc();
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
            throw new IllegalArgumentException(C13715c.m34243i(59, "Ran off end of other: 0, ", zzd, ", ", zzlb.zzd()));
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

    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    public final int zzf(int i, int i2, int i3) {
        return zzmn.zzd(i, this.zza, 0, i3);
    }

    public final zzld zzg(int i, int i2) {
        int zzk = zzld.zzk(0, i2, zzd());
        if (zzk == 0) {
            return zzld.zzb;
        }
        return new zzky(this.zza, 0, zzk);
    }

    public final String zzh(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public final void zzi(zzkt zzkt) throws IOException {
        ((zzli) zzkt).zzc(this.zza, 0, zzd());
    }

    public final boolean zzj() {
        return zzpc.zzf(this.zza, 0, zzd());
    }
}
