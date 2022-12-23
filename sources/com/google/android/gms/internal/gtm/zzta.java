package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.nio.charset.Charset;

class zzta extends zzsz {
    public final byte[] zza;

    public zzta(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zztd) || zzd() != ((zztd) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzta)) {
            return obj.equals(this);
        }
        zzta zzta = (zzta) obj;
        int zzl = zzl();
        int zzl2 = zzta.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzta.zzd()) {
            int zzd2 = zzd();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzd);
            sb.append(zzd2);
            throw new IllegalArgumentException(sb.toString());
        } else if (zzd <= zzta.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzta.zza;
            int zzc = zzc() + zzd;
            int zzc2 = zzc();
            int zzc3 = zzta.zzc();
            while (zzc2 < zzc) {
                if (bArr[zzc2] != bArr2[zzc3]) {
                    return false;
                }
                zzc2++;
                zzc3++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(C13715c.m34243i(59, "Ran off end of other: 0, ", zzd, ", ", zzta.zzd()));
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
        return zzvi.zzd(i, this.zza, zzc(), i3);
    }

    public final zztd zzg(int i, int i2) {
        int zzk = zztd.zzk(0, i2, zzd());
        if (zzk == 0) {
            return zztd.zzb;
        }
        return new zzsx(this.zza, zzc(), zzk);
    }

    public final String zzh(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    public final void zzi(zzss zzss) throws IOException {
        ((zztl) zzss).zzc(this.zza, zzc(), zzd());
    }

    public final boolean zzj() {
        int zzc = zzc();
        return zzyd.zzf(this.zza, zzc, zzd() + zzc);
    }
}
