package com.google.android.gms.internal.ads;

final class zzru extends zzrp {
    public static final Object zzd = new Object();
    private final Object zze;
    /* access modifiers changed from: private */
    public final Object zzf;

    private zzru(zzci zzci, Object obj, Object obj2) {
        super(zzci);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzru zzq(zzbb zzbb) {
        return new zzru(new zzrv(zzbb), zzch.zza, zzd);
    }

    public static zzru zzr(zzci zzci, Object obj, Object obj2) {
        return new zzru(zzci, obj, obj2);
    }

    public final int zza(Object obj) {
        Object obj2;
        zzci zzci = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzci.zza(obj);
    }

    public final zzcf zzd(int i, zzcf zzcf, boolean z) {
        this.zzc.zzd(i, zzcf, z);
        if (zzeg.zzS(zzcf.zzc, this.zzf) && z) {
            zzcf.zzc = zzd;
        }
        return zzcf;
    }

    public final zzch zze(int i, zzch zzch, long j) {
        this.zzc.zze(i, zzch, j);
        if (zzeg.zzS(zzch.zzc, this.zze)) {
            zzch.zzc = zzch.zza;
        }
        return zzch;
    }

    public final Object zzf(int i) {
        Object zzf2 = this.zzc.zzf(i);
        if (zzeg.zzS(zzf2, this.zzf)) {
            return zzd;
        }
        return zzf2;
    }

    public final zzru zzp(zzci zzci) {
        return new zzru(zzci, this.zze, this.zzf);
    }
}
