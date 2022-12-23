package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbsk extends zzcgh {
    private final Object zza = new Object();
    private final zzbb zzb;
    private boolean zzc;
    private int zzd;

    public zzbsk(zzbb zzbb) {
        this.zzb = zzbb;
        this.zzc = false;
        this.zzd = 0;
    }

    public final zzbsf zza() {
        boolean z;
        zzbsf zzbsf = new zzbsf(this);
        synchronized (this.zza) {
            zzi(new zzbsg(this, zzbsf), new zzbsh(this, zzbsf));
            if (this.zzd >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            this.zzd++;
        }
        return zzbsf;
    }

    public final void zzb() {
        boolean z;
        synchronized (this.zza) {
            if (this.zzd >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
    }

    public final void zzc() {
        boolean z;
        synchronized (this.zza) {
            if (this.zzd >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            if (!this.zzc || this.zzd != 0) {
                zze.zza("There are still references to the engine. Not destroying.");
            } else {
                zze.zza("No reference is left (including root). Cleaning up engine.");
                zzi(new zzbsj(this), new zzcgd());
            }
        }
    }

    public final void zzd() {
        boolean z;
        synchronized (this.zza) {
            if (this.zzd > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z);
            zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
    }
}
