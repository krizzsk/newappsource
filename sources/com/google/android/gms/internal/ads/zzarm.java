package com.google.android.gms.internal.ads;

final class zzarm {
    public final zzawy zza;
    public final Object zzb;
    public final int zzc;
    public final zzaxk[] zzd = new zzaxk[2];
    public final boolean[] zze = new boolean[2];
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzarm zzl;
    public zzaye zzm;
    private final zzarx[] zzn;
    private final zzary[] zzo;
    private final zzayd zzp;
    private final zzaxa zzq;
    private zzaye zzr;
    private final zzcio zzs;

    public zzarm(zzarx[] zzarxArr, zzary[] zzaryArr, long j, zzayd zzayd, zzcio zzcio, zzaxa zzaxa, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.zzn = zzarxArr;
        this.zzo = zzaryArr;
        this.zzf = j;
        this.zzp = zzayd;
        this.zzs = zzcio;
        this.zzq = zzaxa;
        obj.getClass();
        this.zzb = obj;
        this.zzc = i;
        this.zzg = i2;
        this.zzi = z;
        this.zzh = j2;
        this.zza = zzaxa.zze(i2, zzcio.zzl());
    }

    public final long zza(long j, boolean z) {
        return zzb(j, false, new boolean[2]);
    }

    public final long zzb(long j, boolean z, boolean[] zArr) {
        boolean z2;
        boolean z3;
        zzayb zzayb = this.zzm.zzb;
        int i = 0;
        while (true) {
            boolean z4 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.zze;
            if (z || !this.zzm.zza(this.zzr, i)) {
                z4 = false;
            }
            zArr2[i] = z4;
            i++;
        }
        long zzB = this.zza.zzB(zzayb.zzb(), this.zze, this.zzd, zArr, j);
        this.zzr = this.zzm;
        this.zzk = false;
        int i2 = 0;
        while (true) {
            zzaxk[] zzaxkArr = this.zzd;
            if (i2 < 2) {
                if (zzaxkArr[i2] != null) {
                    if (zzayb.zza(i2) != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zzayy.zze(z3);
                    this.zzk = true;
                } else {
                    if (zzayb.zza(i2) == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzayy.zze(z2);
                }
                i2++;
            } else {
                this.zzs.zzd(this.zzn, this.zzm.zza, zzayb);
                return zzB;
            }
        }
    }

    public final void zzc() {
        try {
            this.zzq.zzc(this.zza);
        } catch (RuntimeException unused) {
        }
    }

    public final boolean zzd() {
        return this.zzj && (!this.zzk || this.zza.zzg() == Long.MIN_VALUE);
    }

    public final boolean zze() throws zzare {
        zzaye zzc2 = this.zzp.zzc(this.zzo, this.zza.zzn());
        zzaye zzaye = this.zzr;
        if (zzaye != null) {
            int i = 0;
            while (i < 2) {
                if (zzc2.zza(zzaye, i)) {
                    i++;
                }
            }
            return false;
        }
        this.zzm = zzc2;
        return true;
    }
}
