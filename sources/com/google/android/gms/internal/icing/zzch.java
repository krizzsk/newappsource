package com.google.android.gms.internal.icing;

final class zzch extends zzci {
    private final byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = Integer.MAX_VALUE;

    public /* synthetic */ zzch(byte[] bArr, int i, int i2, boolean z, zzcg zzcg) {
        super((zzcg) null);
        this.zza = bArr;
        this.zzb = 0;
    }

    public final int zza(int i) throws zzdj {
        int i2 = this.zzd;
        this.zzd = 0;
        int i3 = this.zzb + this.zzc;
        this.zzb = i3;
        if (i3 > 0) {
            this.zzc = i3;
            this.zzb = 0;
        } else {
            this.zzc = 0;
        }
        return i2;
    }
}
