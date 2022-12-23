package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;

final class zznt {
    private final zzns zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zznt(AudioTrack audioTrack) {
        int i = zzeg.zza;
        this.zza = new zzns(audioTrack);
        zzh(0);
    }

    private final void zzh(int i) {
        this.zzb = i;
        long j = 10000;
        if (i == 0) {
            this.zze = 0;
            this.zzf = -1;
            this.zzc = System.nanoTime() / 1000;
        } else if (i != 1) {
            j = (i == 2 || i == 3) ? 10000000 : 500000;
        } else {
            this.zzd = 10000;
            return;
        }
        this.zzd = j;
    }

    @TargetApi(19)
    public final long zza() {
        return this.zza.zza();
    }

    @TargetApi(19)
    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zzh(0);
        }
    }

    public final void zzd() {
        zzh(4);
    }

    public final void zze() {
        zzh(0);
    }

    public final boolean zzf() {
        return this.zzb == 2;
    }

    @TargetApi(19)
    public final boolean zzg(long j) {
        zzns zzns = this.zza;
        if (j - this.zze < this.zzd) {
            return false;
        }
        this.zze = j;
        boolean zzc2 = zzns.zzc();
        int i = this.zzb;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (!zzc2) {
                            return false;
                        }
                        zzh(0);
                        return true;
                    }
                } else if (zzc2) {
                    return true;
                } else {
                    zzh(0);
                    return false;
                }
            } else if (!zzc2) {
                zzh(0);
            } else if (this.zza.zza() > this.zzf) {
                zzh(2);
                return true;
            }
        } else if (zzc2) {
            if (this.zza.zzb() < this.zzc) {
                return false;
            }
            this.zzf = this.zza.zza();
            zzh(1);
            return true;
        } else if (j - this.zzc > 500000) {
            zzh(3);
            return false;
        }
        return zzc2;
    }
}