package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

final class zzfx extends zzcv {
    public final zzfz zza;
    public zzcx zzb = zzb();
    public final /* synthetic */ zzga zzc;

    public zzfx(zzga zzga) {
        this.zzc = zzga;
        this.zza = new zzfz(zzga, (zzfx) null);
    }

    private final zzcx zzb() {
        zzfz zzfz = this.zza;
        if (zzfz.hasNext()) {
            return zzfz.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final byte zza() {
        zzcx zzcx = this.zzb;
        if (zzcx != null) {
            byte zza2 = zzcx.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza2;
        }
        throw new NoSuchElementException();
    }
}
