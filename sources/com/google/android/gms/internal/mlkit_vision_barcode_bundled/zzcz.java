package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.nio.charset.Charset;

class zzcz extends zzcy {
    public final byte[] zza;

    public zzcz(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdb) || zzd() != ((zzdb) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzcz)) {
            return obj.equals(this);
        }
        zzcz zzcz = (zzcz) obj;
        int zzp = zzp();
        int zzp2 = zzcz.zzp();
        if (zzp == 0 || zzp2 == 0 || zzp == zzp2) {
            return zzg(zzcz, 0, zzd());
        }
        return false;
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
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    public final boolean zzg(zzdb zzdb, int i, int i2) {
        if (i2 <= zzdb.zzd()) {
            int i3 = i + i2;
            if (i3 > zzdb.zzd()) {
                int zzd = zzdb.zzd();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(zzd);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(zzdb instanceof zzcz)) {
                return zzdb.zzk(i, i3).equals(zzk(0, i2));
            } else {
                zzcz zzcz = (zzcz) zzdb;
                byte[] bArr = this.zza;
                byte[] bArr2 = zzcz.zza;
                int zzc = zzc() + i2;
                int zzc2 = zzc();
                int zzc3 = zzcz.zzc() + i;
                while (zzc2 < zzc) {
                    if (bArr[zzc2] != bArr2[zzc3]) {
                        return false;
                    }
                    zzc2++;
                    zzc3++;
                }
                return true;
            }
        } else {
            int zzd2 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(zzd2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int zzi(int i, int i2, int i3) {
        return zzel.zzd(i, this.zza, zzc() + i2, i3);
    }

    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzhe.zzf(i, this.zza, zzc, i3 + zzc);
    }

    public final zzdb zzk(int i, int i2) {
        int zzo = zzdb.zzo(i, i2, zzd());
        if (zzo == 0) {
            return zzdb.zzb;
        }
        return new zzcw(this.zza, zzc() + i, zzo);
    }

    public final String zzl(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    public final void zzm(zzcr zzcr) throws IOException {
        ((zzdg) zzcr).zzc(this.zza, zzc(), zzd());
    }

    public final boolean zzn() {
        int zzc = zzc();
        return zzhe.zzi(this.zza, zzc, zzd() + zzc);
    }
}
