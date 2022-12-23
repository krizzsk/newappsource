package com.google.android.gms.internal.gtm;

import java.io.IOException;

final class zztf extends zztj {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh = Integer.MAX_VALUE;

    public /* synthetic */ zztf(byte[] bArr, int i, int i2, boolean z, zzte zzte) {
        super((zzti) null);
        this.zze = bArr;
        this.zzf = 0;
    }

    public final int zza() {
        throw null;
    }

    public final int zzb(int i) throws zzvk {
        int i2 = this.zzh;
        this.zzh = 0;
        int i3 = this.zzf + this.zzg;
        this.zzf = i3;
        if (i3 > 0) {
            this.zzg = i3;
            this.zzf = 0;
        } else {
            this.zzg = 0;
        }
        return i2;
    }

    public final int zzc() throws IOException {
        throw null;
    }

    public final zztd zzd() throws IOException {
        throw null;
    }

    public final String zze() throws IOException {
        throw null;
    }

    public final String zzf() throws IOException {
        throw null;
    }

    public final void zzg(int i) throws zzvk {
        throw null;
    }

    public final void zzh(int i) {
        throw null;
    }

    public final boolean zzi() throws IOException {
        throw null;
    }

    public final boolean zzj() throws IOException {
        throw null;
    }

    public final boolean zzk(int i) throws IOException {
        throw null;
    }
}
