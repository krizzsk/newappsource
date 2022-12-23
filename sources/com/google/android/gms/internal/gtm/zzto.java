package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzto extends zzss {
    private static final Logger zzb = Logger.getLogger(zzto.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzc = zzxy.zzx();
    public zztp zza;

    private zzto() {
    }

    public /* synthetic */ zzto(zztn zztn) {
    }

    public static int zzA(zzwk zzwk, zzwx zzwx) {
        zzsh zzsh = (zzsh) zzwk;
        int zzQ = zzsh.zzQ();
        if (zzQ == -1) {
            zzQ = zzwx.zza(zzsh);
            zzsh.zzT(zzQ);
        }
        return zzD(zzQ) + zzQ;
    }

    public static int zzB(String str) {
        int i;
        try {
            i = zzyd.zzc(str);
        } catch (zzyc unused) {
            i = str.getBytes(zzvi.zza).length;
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

    public static zzto zzF(byte[] bArr) {
        return new zztl(bArr, 0, bArr.length);
    }

    public static int zzt(byte[] bArr) {
        int length = bArr.length;
        return zzD(length) + length;
    }

    public static int zzu(zztd zztd) {
        int zzd = zztd.zzd();
        return zzD(zzd) + zzd;
    }

    @Deprecated
    public static int zzv(int i, zzwk zzwk, zzwx zzwx) {
        int zzD = zzD(i << 3);
        int i2 = zzD + zzD;
        zzsh zzsh = (zzsh) zzwk;
        int zzQ = zzsh.zzQ();
        if (zzQ == -1) {
            zzQ = zzwx.zza(zzsh);
            zzsh.zzT(zzQ);
        }
        return i2 + zzQ;
    }

    @Deprecated
    public static int zzw(zzwk zzwk) {
        return zzwk.zzX();
    }

    public static int zzx(int i) {
        if (i >= 0) {
            return zzD(i);
        }
        return 10;
    }

    public static int zzy(zzvq zzvq) {
        int zza2 = zzvq.zza();
        return zzD(zza2) + zza2;
    }

    public static int zzz(zzwk zzwk) {
        int zzX = zzwk.zzX();
        return zzD(zzX) + zzX;
    }

    public final void zzG() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzH(String str, zzyc zzyc) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzyc);
        byte[] bytes = str.getBytes(zzvi.zza);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zztm(e);
        } catch (zztm e2) {
            throw e2;
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zztd zztd) throws IOException;

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
