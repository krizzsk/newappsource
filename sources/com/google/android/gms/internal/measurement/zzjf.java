package com.google.android.gms.internal.measurement;

final class zzjf extends zzjh {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze = Integer.MAX_VALUE;

    public /* synthetic */ zzjf(byte[] bArr, int i, int i2, boolean z, zzje zzje) {
        super((zzjg) null);
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) throws zzko {
        int i2 = this.zze;
        this.zze = 0;
        int i3 = this.zzc + this.zzd;
        this.zzc = i3;
        if (i3 > 0) {
            this.zzd = i3;
            this.zzc = i3 - i3;
        } else {
            this.zzd = 0;
        }
        return i2;
    }
}
