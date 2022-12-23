package com.google.android.gms.internal.ads;

final class zzgiz extends zzgjc {
    private final int zzc;
    private final int zzd;

    public zzgiz(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgjg.zzq(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    public final byte zza(int i) {
        zzgjg.zzB(i, this.zzd);
        return this.zza[this.zzc + i];
    }

    public final byte zzb(int i) {
        return this.zza[this.zzc + i];
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }

    public final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, this.zzc + i, bArr, i2, i3);
    }
}
