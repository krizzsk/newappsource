package com.google.android.gms.internal.places;

import java.io.IOException;
import java.nio.charset.Charset;

class zzag extends zzad {
    public final byte[] zzen;

    public zzag(byte[] bArr) {
        bArr.getClass();
        this.zzen = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzw) || size() != ((zzw) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return obj.equals(this);
        }
        zzag zzag = (zzag) obj;
        int zzaf = zzaf();
        int zzaf2 = zzag.zzaf();
        if (zzaf == 0 || zzaf2 == 0 || zzaf == zzaf2) {
            return zzb((zzw) zzag, 0, size());
        }
        return false;
    }

    public int size() {
        return this.zzen.length;
    }

    public final boolean zzae() {
        int zzag = zzag();
        return zzea.zzf(this.zzen, zzag, size() + zzag);
    }

    public int zzag() {
        return 0;
    }

    public final zzw zzb(int i, int i2) {
        int zzc = zzw.zzc(0, i2, size());
        if (zzc == 0) {
            return zzw.zzeg;
        }
        return new zzz(this.zzen, zzag(), zzc);
    }

    public byte zzi(int i) {
        return this.zzen[i];
    }

    public byte zzj(int i) {
        return this.zzen[i];
    }

    public void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzen, 0, bArr, 0, i3);
    }

    public final void zzb(zzt zzt) throws IOException {
        zzt.zzb(this.zzen, zzag(), size());
    }

    public final String zzb(Charset charset) {
        return new String(this.zzen, zzag(), size(), charset);
    }

    public final boolean zzb(zzw zzw, int i, int i2) {
        if (i2 > zzw.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzw.size()) {
            throw new IllegalArgumentException(C13715c.m34243i(59, "Ran off end of other: 0, ", i2, ", ", zzw.size()));
        } else if (!(zzw instanceof zzag)) {
            return zzw.zzb(0, i2).equals(zzb(0, i2));
        } else {
            zzag zzag = (zzag) zzw;
            byte[] bArr = this.zzen;
            byte[] bArr2 = zzag.zzen;
            int zzag2 = zzag() + i2;
            int zzag3 = zzag();
            int zzag4 = zzag.zzag();
            while (zzag3 < zzag2) {
                if (bArr[zzag3] != bArr2[zzag4]) {
                    return false;
                }
                zzag3++;
                zzag4++;
            }
            return true;
        }
    }

    public final int zzb(int i, int i2, int i3) {
        return zzbd.zzb(i, this.zzen, zzag(), i3);
    }
}
