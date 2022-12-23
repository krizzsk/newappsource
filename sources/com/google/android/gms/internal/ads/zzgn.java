package com.google.android.gms.internal.ads;

public final class zzgn {
    public final String zza;
    public final zzad zzb;
    public final zzad zzc;
    public final int zzd;
    public final int zze;

    public zzgn(String str, zzad zzad, zzad zzad2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            zzcw.zzd(z);
            zzcw.zzc(str);
            this.zza = str;
            zzad.getClass();
            this.zzb = zzad;
            zzad2.getClass();
            this.zzc = zzad2;
            this.zzd = i;
            this.zze = i2;
        }
        z = true;
        zzcw.zzd(z);
        zzcw.zzc(str);
        this.zza = str;
        zzad.getClass();
        this.zzb = zzad;
        zzad2.getClass();
        this.zzc = zzad2;
        this.zzd = i;
        this.zze = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgn.class == obj.getClass()) {
            zzgn zzgn = (zzgn) obj;
            if (this.zzd != zzgn.zzd || this.zze != zzgn.zze || !this.zza.equals(zzgn.zza) || !this.zzb.equals(zzgn.zzb) || !this.zzc.equals(zzgn.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int d = C13715c.m34238d(this.zza, (((this.zzd + 527) * 31) + this.zze) * 31, 31);
        return this.zzc.hashCode() + ((this.zzb.hashCode() + d) * 31);
    }
}
