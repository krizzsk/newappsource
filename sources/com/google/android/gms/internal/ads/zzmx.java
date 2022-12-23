package com.google.android.gms.internal.ads;

import p001a0.C0016g;
import p358af.C13437d;

public final class zzmx {
    public static final zzmx zza = new zzmx(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzmx(int i, int i2, int i3) {
        int i4;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        if (zzeg.zzU(i3)) {
            i4 = zzeg.zzo(i3, i2);
        } else {
            i4 = -1;
        }
        this.zze = i4;
    }

    public final String toString() {
        int i = this.zzb;
        int i2 = this.zzc;
        return C13437d.m33707l(C0016g.m35s("AudioFormat[sampleRate=", i, ", channelCount=", i2, ", encoding="), this.zzd, "]");
    }
}
