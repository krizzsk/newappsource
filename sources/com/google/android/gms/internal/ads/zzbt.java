package com.google.android.gms.internal.ads;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzbt {
    public static final zzbt zza = new zzbt(1.0f, 1.0f);
    public static final zzl zzb = zzbs.zza;
    public final float zzc;
    public final float zzd;
    private final int zze;

    public zzbt(float f, float f2) {
        boolean z;
        boolean z2 = true;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        zzcw.zzd(f2 <= BitmapDescriptorFactory.HUE_RED ? false : z2);
        this.zzc = f;
        this.zzd = f2;
        this.zze = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbt.class == obj.getClass()) {
            zzbt zzbt = (zzbt) obj;
            return this.zzc == zzbt.zzc && this.zzd == zzbt.zzd;
        }
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.zzd) + ((Float.floatToRawIntBits(this.zzc) + 527) * 31);
    }

    public final String toString() {
        return zzeg.zzH("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j) {
        return j * ((long) this.zze);
    }
}
