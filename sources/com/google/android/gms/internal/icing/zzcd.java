package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.nio.charset.Charset;

class zzcd extends zzcc {
    public final byte[] zza;

    public zzcd(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcf) || zzc() != ((zzcf) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzcd)) {
            return obj.equals(this);
        }
        zzcd zzcd = (zzcd) obj;
        int zzl = zzl();
        int zzl2 = zzcd.zzl();
        if (zzl != 0 && zzl2 != 0 && zzl != zzl2) {
            return false;
        }
        int zzc = zzc();
        if (zzc > zzcd.zzc()) {
            int zzc2 = zzc();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(zzc);
            sb.append(zzc2);
            throw new IllegalArgumentException(sb.toString());
        } else if (zzc <= zzcd.zzc()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzcd.zza;
            zzcd.zzd();
            int i = 0;
            int i2 = 0;
            while (i < zzc) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(C13715c.m34243i(59, "Ran off end of other: 0, ", zzc, ", ", zzcd.zzc()));
        }
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    public final zzcf zze(int i, int i2) {
        zzcf.zzm(0, i2, zzc());
        if (i2 == 0) {
            return zzcf.zzb;
        }
        return new zzca(this.zza, 0, i2);
    }

    public final void zzf(zzbw zzbw) throws IOException {
        ((zzck) zzbw).zzp(this.zza, 0, zzc());
    }

    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzc(), charset);
    }

    public final boolean zzh() {
        return zzfr.zzb(this.zza, 0, zzc());
    }

    public final int zzi(int i, int i2, int i3) {
        return zzdh.zzh(i, this.zza, 0, i3);
    }
}
