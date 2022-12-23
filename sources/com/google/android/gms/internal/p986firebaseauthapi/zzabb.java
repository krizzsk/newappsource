package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabb */
class zzabb extends zzaba {
    public final byte[] zza;

    public zzabb(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzabe) || zzd() != ((zzabe) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzabb)) {
            return obj.equals(this);
        }
        zzabb zzabb = (zzabb) obj;
        int zzm = zzm();
        int zzm2 = zzabb.zzm();
        if (zzm != 0 && zzm2 != 0 && zzm != zzm2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzabb.zzd()) {
            int zzd2 = zzd();
            throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
        } else if (zzd <= zzabb.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzabb.zza;
            zzabb.zzc();
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
            throw new IllegalArgumentException(C13715c.m34244j("Ran off end of other: 0, ", zzd, ", ", zzabb.zzd()));
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
        return zzacn.zzd(i, this.zza, 0, i3);
    }

    public final zzabe zzg(int i, int i2) {
        int zzl = zzabe.zzl(0, i2, zzd());
        if (zzl == 0) {
            return zzabe.zzb;
        }
        return new zzaay(this.zza, 0, zzl);
    }

    public final zzabi zzh() {
        return zzabi.zzu(this.zza, 0, zzd(), true);
    }

    public final String zzi(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    public final void zzj(zzaau zzaau) throws IOException {
        zzaau.zza(this.zza, 0, zzd());
    }

    public final boolean zzk() {
        return zzafe.zzf(this.zza, 0, zzd());
    }
}
