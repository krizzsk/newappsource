package com.google.android.gms.internal.icing;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzcm extends zzbw {
    private static final Logger zzb = Logger.getLogger(zzcm.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzfn.zza();
    public zzcn zza;

    private zzcm() {
    }

    public /* synthetic */ zzcm(zzcj zzcj) {
    }

    public static int zzA(zzcf zzcf) {
        int zzc2 = zzcf.zzc();
        return zzw(zzc2) + zzc2;
    }

    public static int zzB(zzee zzee, zzep zzep) {
        zzbs zzbs = (zzbs) zzee;
        int zzi = zzbs.zzi();
        if (zzi == -1) {
            zzi = zzep.zzd(zzbs);
            zzbs.zzj(zzi);
        }
        return zzw(zzi) + zzi;
    }

    @Deprecated
    public static int zzE(int i, zzee zzee, zzep zzep) {
        int zzw = zzw(i << 3);
        int i2 = zzw + zzw;
        zzbs zzbs = (zzbs) zzee;
        int zzi = zzbs.zzi();
        if (zzi == -1) {
            zzi = zzep.zzd(zzbs);
            zzbs.zzj(zzi);
        }
        return i2 + zzi;
    }

    public static zzcm zzt(byte[] bArr) {
        return new zzck(bArr, 0, bArr.length);
    }

    public static int zzu(int i) {
        return zzw(i << 3);
    }

    public static int zzv(int i) {
        if (i >= 0) {
            return zzw(i);
        }
        return 10;
    }

    public static int zzw(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int zzx(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int zzy(String str) {
        int i;
        try {
            i = zzfr.zzc(str);
        } catch (zzfq unused) {
            i = str.getBytes(zzdh.zza).length;
        }
        return zzw(i) + i;
    }

    public static int zzz(zzdm zzdm) {
        int zza2 = zzdm.zza();
        return zzw(zza2) + zza2;
    }

    public final void zzC() {
        if (zzs() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzD(String str, zzfq zzfq) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzfq);
        byte[] bytes = str.getBytes(zzdh.zza);
        try {
            int length = bytes.length;
            zzl(length);
            zzq(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(e);
        } catch (zzcl e2) {
            throw e2;
        }
    }

    public abstract void zza(int i, int i2) throws IOException;

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzd(int i, int i2) throws IOException;

    public abstract void zze(int i, long j) throws IOException;

    public abstract void zzf(int i, long j) throws IOException;

    public abstract void zzg(int i, boolean z) throws IOException;

    public abstract void zzh(int i, String str) throws IOException;

    public abstract void zzi(int i, zzcf zzcf) throws IOException;

    public abstract void zzj(byte b) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(int i) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(long j) throws IOException;

    public abstract void zzo(long j) throws IOException;

    public abstract void zzq(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzs();
}
