package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class zznw implements zzmz {
    public zzmx zzb;
    public zzmx zzc;
    private zzmx zzd;
    private zzmx zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zznw() {
        ByteBuffer byteBuffer = zzmz.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzmx zzmx = zzmx.zza;
        this.zzd = zzmx;
        this.zze = zzmx;
        this.zzb = zzmx;
        this.zzc = zzmx;
    }

    public final zzmx zza(zzmx zzmx) throws zzmy {
        this.zzd = zzmx;
        this.zze = zzi(zzmx);
        if (zzg()) {
            return this.zze;
        }
        return zzmx.zza;
    }

    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzmz.zza;
        return byteBuffer;
    }

    public final void zzc() {
        this.zzg = zzmz.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    public final void zzf() {
        zzc();
        this.zzf = zzmz.zza;
        zzmx zzmx = zzmx.zza;
        this.zzd = zzmx;
        this.zze = zzmx;
        this.zzb = zzmx;
        this.zzc = zzmx;
        zzm();
    }

    public boolean zzg() {
        return this.zze != zzmx.zza;
    }

    public boolean zzh() {
        return this.zzh && this.zzg == zzmz.zza;
    }

    public zzmx zzi(zzmx zzmx) throws zzmy {
        throw null;
    }

    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
