package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

final class zzdd extends zzde {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze = Integer.MAX_VALUE;

    public /* synthetic */ zzdd(byte[] bArr, int i, int i2, boolean z, zzdc zzdc) {
        super((zzdc) null);
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i) throws zzen {
        int i2 = this.zze;
        this.zze = 0;
        int i3 = this.zzc + this.zzd;
        this.zzc = i3;
        if (i3 > 0) {
            this.zzd = i3;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i2;
    }
}
