package com.google.android.gms.internal.ads;

final class zzaau extends zzaat {
    private final zzdy zzb = new zzdy(zzzp.zza);
    private final zzdy zzc = new zzdy(4);
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaau(zzzz zzzz) {
        super(zzzz);
    }

    public final boolean zza(zzdy zzdy) throws zzaas {
        int zzk = zzdy.zzk();
        int i = zzk >> 4;
        int i2 = zzk & 15;
        if (i2 == 7) {
            this.zzg = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new zzaas(C16759e.m42349e("Video format not supported: ", i2));
    }

    public final boolean zzb(zzdy zzdy, long j) throws zzbp {
        int i;
        int zzk = zzdy.zzk();
        long zzf2 = (((long) zzdy.zzf()) * 1000) + j;
        if (zzk == 0) {
            if (!this.zze) {
                zzdy zzdy2 = new zzdy(new byte[zzdy.zza()]);
                zzdy.zzB(zzdy2.zzH(), 0, zzdy.zza());
                zzyb zza = zzyb.zza(zzdy2);
                this.zzd = zza.zzb;
                zzab zzab = new zzab();
                zzab.zzS("video/avc");
                zzab.zzx(zza.zzf);
                zzab.zzX(zza.zzc);
                zzab.zzF(zza.zzd);
                zzab.zzP(zza.zze);
                zzab.zzI(zza.zza);
                this.zza.zzk(zzab.zzY());
                this.zze = true;
                return false;
            }
        } else if (zzk == 1 && this.zze) {
            if (this.zzg == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.zzf && i == 0) {
                return false;
            }
            byte[] zzH = this.zzc.zzH();
            zzH[0] = 0;
            zzH[1] = 0;
            zzH[2] = 0;
            int i2 = 4 - this.zzd;
            int i3 = 0;
            while (zzdy.zza() > 0) {
                zzdy.zzB(this.zzc.zzH(), i2, this.zzd);
                this.zzc.zzF(0);
                int zzn = this.zzc.zzn();
                this.zzb.zzF(0);
                this.zza.zzq(this.zzb, 4);
                this.zza.zzq(zzdy, zzn);
                i3 = i3 + 4 + zzn;
            }
            this.zza.zzs(zzf2, i, i3, 0, (zzzy) null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
