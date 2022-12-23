package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.appboy.support.ValidationUtils;

final class zzaei {
    public final zzzz zza;
    public final zzaev zzb = new zzaev();
    public final zzdy zzc = new zzdy();
    public zzaew zzd;
    public zzaee zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzdy zzj = new zzdy(1);
    private final zzdy zzk = new zzdy();
    /* access modifiers changed from: private */
    public boolean zzl;

    public zzaei(zzzz zzzz, zzaew zzaew, zzaee zzaee) {
        this.zza = zzzz;
        this.zzd = zzaew;
        this.zze = zzaee;
        zzh(zzaew, zzaee);
    }

    public final int zza() {
        int i;
        if (!this.zzl) {
            i = this.zzd.zzg[this.zzf];
        } else if (this.zzb.zzj[this.zzf]) {
            i = 1;
        } else {
            i = 0;
        }
        if (zzf() != null) {
            return i | 1073741824;
        }
        return i;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzdy zzdy;
        boolean z;
        int i3;
        zzaeu zzf2 = zzf();
        if (zzf2 == null) {
            return 0;
        }
        int i4 = zzf2.zzd;
        if (i4 != 0) {
            zzdy = this.zzb.zzn;
        } else {
            byte[] bArr = (byte[]) zzeg.zzG(zzf2.zze);
            zzdy zzdy2 = this.zzk;
            int length = bArr.length;
            zzdy2.zzD(bArr, length);
            zzdy = this.zzk;
            i4 = length;
        }
        boolean zzb2 = this.zzb.zzb(this.zzf);
        if (zzb2 || i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        zzdy zzdy3 = this.zzj;
        byte[] zzH = zzdy3.zzH();
        if (true != z) {
            i3 = 0;
        } else {
            i3 = RecyclerView.C1119a0.FLAG_IGNORE;
        }
        zzH[0] = (byte) (i3 | i4);
        zzdy3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzdy, i4, 1);
        if (!z) {
            return i4 + 1;
        }
        if (!zzb2) {
            this.zzc.zzC(8);
            zzdy zzdy4 = this.zzc;
            byte[] zzH2 = zzdy4.zzH();
            zzH2[0] = 0;
            zzH2[1] = 1;
            zzH2[2] = 0;
            zzH2[3] = (byte) i2;
            zzH2[4] = (byte) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            zzH2[5] = (byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            zzH2[6] = (byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            zzH2[7] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            this.zza.zzr(zzdy4, 8, 1);
            return i4 + 9;
        }
        zzdy zzdy5 = this.zzb.zzn;
        int zzo = zzdy5.zzo();
        zzdy5.zzG(-2);
        int i5 = (zzo * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzC(i5);
            byte[] zzH3 = this.zzc.zzH();
            zzdy5.zzB(zzH3, 0, i5);
            int i6 = (((zzH3[2] & 255) << 8) | (zzH3[3] & 255)) + i2;
            zzH3[2] = (byte) ((i6 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            zzH3[3] = (byte) (i6 & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            zzdy5 = this.zzc;
        }
        this.zza.zzr(zzdy5, i5, 1);
        return i4 + 1 + i5;
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzaev zzaev = this.zzb;
        return zzaev.zzi[this.zzf];
    }

    public final zzaeu zzf() {
        if (!this.zzl) {
            return null;
        }
        zzaev zzaev = this.zzb;
        zzaee zzaee = zzaev.zza;
        int i = zzeg.zza;
        int i2 = zzaee.zza;
        zzaeu zzaeu = zzaev.zzm;
        if (zzaeu == null) {
            zzaeu = this.zzd.zza.zza(i2);
        }
        if (zzaeu == null || !zzaeu.zza) {
            return null;
        }
        return zzaeu;
    }

    public final void zzh(zzaew zzaew, zzaee zzaee) {
        this.zzd = zzaew;
        this.zze = zzaee;
        this.zza.zzk(zzaew.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzaev zzaev = this.zzb;
        zzaev.zzd = 0;
        zzaev.zzp = 0;
        zzaev.zzq = false;
        zzaev.zzk = false;
        zzaev.zzo = false;
        zzaev.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}
