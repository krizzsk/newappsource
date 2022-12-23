package com.google.android.gms.internal.contextmanager;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzlk extends zzkt {
    private static final Logger zzb = Logger.getLogger(zzlk.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzox.zzx();
    public zzll zza;

    private zzlk() {
    }

    public /* synthetic */ zzlk(zzlh zzlh) {
    }

    public static int zzA(zznn zznn, zznz zznz) {
        zzkm zzkm = (zzkm) zznn;
        int zzp = zzkm.zzp();
        if (zzp == -1) {
            zzp = zznz.zza(zzkm);
            zzkm.zzs(zzp);
        }
        return zzD(zzp) + zzp;
    }

    public static int zzB(String str) {
        int i;
        try {
            i = zzpc.zzc(str);
        } catch (zzpb unused) {
            i = str.getBytes(zzmn.zza).length;
        }
        return zzD(i) + i;
    }

    public static int zzC(int i) {
        return zzD(i << 3);
    }

    public static int zzD(int i) {
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

    public static int zzE(long j) {
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

    public static zzlk zzF(byte[] bArr) {
        return new zzli(bArr, 0, bArr.length);
    }

    public static int zzt(byte[] bArr) {
        int length = bArr.length;
        return zzD(length) + length;
    }

    public static int zzu(zzld zzld) {
        int zzd = zzld.zzd();
        return zzD(zzd) + zzd;
    }

    @Deprecated
    public static int zzv(int i, zznn zznn, zznz zznz) {
        int zzD = zzD(i << 3);
        int i2 = zzD + zzD;
        zzkm zzkm = (zzkm) zznn;
        int zzp = zzkm.zzp();
        if (zzp == -1) {
            zzp = zznz.zza(zzkm);
            zzkm.zzs(zzp);
        }
        return i2 + zzp;
    }

    @Deprecated
    public static int zzw(zznn zznn) {
        return zznn.zzv();
    }

    public static int zzx(int i) {
        if (i >= 0) {
            return zzD(i);
        }
        return 10;
    }

    public static int zzy(zzmv zzmv) {
        int zza2 = zzmv.zza();
        return zzD(zza2) + zza2;
    }

    public static int zzz(zznn zznn) {
        int zzv = zznn.zzv();
        return zzD(zzv) + zzv;
    }

    public final void zzG() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzH(String str, zzpb zzpb) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzpb);
        byte[] bytes = str.getBytes(zzmn.zza);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzlj(e);
        } catch (zzlj e2) {
            throw e2;
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzld zzld) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(int i) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzi(long j) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzm(int i, String str) throws IOException;

    public abstract void zzo(int i, int i2) throws IOException;

    public abstract void zzp(int i, int i2) throws IOException;

    public abstract void zzq(int i) throws IOException;

    public abstract void zzr(int i, long j) throws IOException;

    public abstract void zzs(long j) throws IOException;
}
