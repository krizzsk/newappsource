package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;

final class zzagi {
    private final zzzz zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final zzzr zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private final zzagh zzi = new zzagh((zzagg) null);
    private final zzagh zzj = new zzagh((zzagg) null);
    private boolean zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;

    public zzagi(zzzz zzzz, boolean z, boolean z2) {
        this.zza = zzzz;
        byte[] bArr = new byte[RecyclerView.C1119a0.FLAG_IGNORE];
        this.zze = bArr;
        this.zzd = new zzzr(bArr, 0, 0);
        this.zzk = false;
    }

    public final void zza(zzzn zzzn) {
        this.zzc.append(zzzn.zza, zzzn);
    }

    public final void zzb(zzzo zzzo) {
        this.zzb.append(zzzo.zzd, zzzo);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long j, int i, long j2) {
        this.zzf = i;
        this.zzh = j2;
        this.zzg = j;
    }

    public final boolean zze(long j, int i, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.zzf == 9) {
            if (z && this.zzk) {
                long j2 = this.zzg;
                int i2 = i + ((int) (j - j2));
                long j3 = this.zzm;
                if (j3 != -9223372036854775807L) {
                    boolean z4 = this.zzn;
                    long j4 = this.zzl;
                    this.zza.zzs(j3, z4 ? 1 : 0, (int) (j2 - j4), i2, (zzzy) null);
                }
            }
            this.zzl = this.zzg;
            this.zzm = this.zzh;
            this.zzn = false;
            this.zzk = true;
        }
        boolean z5 = this.zzn;
        int i3 = this.zzf;
        if (i3 == 5 || (z2 && i3 == 1)) {
            z3 = true;
        }
        boolean z6 = z5 | z3;
        this.zzn = z6;
        return z6;
    }
}
