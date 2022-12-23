package com.google.android.gms.internal.ads;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.Collections;

final class zzaao extends zzaat {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaao(zzzz zzzz) {
        super(zzzz);
    }

    public final boolean zza(zzdy zzdy) throws zzaas {
        String str;
        if (!this.zzc) {
            int zzk = zzdy.zzk();
            int i = zzk >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzk >> 2) & 3];
                zzab zzab = new zzab();
                zzab.zzS("audio/mpeg");
                zzab.zzw(1);
                zzab.zzT(i2);
                this.zza.zzk(zzab.zzY());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                zzab zzab2 = new zzab();
                zzab2.zzS(str);
                zzab2.zzw(1);
                zzab2.zzT(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED);
                this.zza.zzk(zzab2.zzY());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzaas(C16759e.m42349e("Audio format not supported: ", i));
            }
            this.zzc = true;
        } else {
            zzdy.zzG(1);
        }
        return true;
    }

    public final boolean zzb(zzdy zzdy, long j) throws zzbp {
        if (this.zze == 2) {
            int zza = zzdy.zza();
            this.zza.zzq(zzdy, zza);
            this.zza.zzs(j, 1, zza, 0, (zzzy) null);
            return true;
        }
        int zzk = zzdy.zzk();
        if (zzk == 0 && !this.zzd) {
            int zza2 = zzdy.zza();
            byte[] bArr = new byte[zza2];
            zzdy.zzB(bArr, 0, zza2);
            zzxt zza3 = zzxu.zza(bArr);
            zzab zzab = new zzab();
            zzab.zzS("audio/mp4a-latm");
            zzab.zzx(zza3.zzc);
            zzab.zzw(zza3.zzb);
            zzab.zzT(zza3.zza);
            zzab.zzI(Collections.singletonList(bArr));
            this.zza.zzk(zzab.zzY());
            this.zzd = true;
            return false;
        } else if (this.zze == 10 && zzk != 1) {
            return false;
        } else {
            int zza4 = zzdy.zza();
            this.zza.zzq(zzdy, zza4);
            this.zza.zzs(j, 1, zza4, 0, (zzzy) null);
            return true;
        }
    }
}
