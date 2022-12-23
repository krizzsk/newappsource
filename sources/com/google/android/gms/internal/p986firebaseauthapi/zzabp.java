package com.google.android.gms.internal.p986firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabp */
public abstract class zzabp extends zzaau {
    private static final Logger zza = Logger.getLogger(zzabp.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzb = zzaez.zzx();
    public zzabq zze;

    private zzabp() {
    }

    public /* synthetic */ zzabp(zzabo zzabo) {
    }

    public static int zzA(zzadm zzadm, zzady zzady) {
        zzaao zzaao = (zzaao) zzadm;
        int zzn = zzaao.zzn();
        if (zzn == -1) {
            zzn = zzady.zza(zzaao);
            zzaao.zzp(zzn);
        }
        return zzE(zzn) + zzn;
    }

    public static int zzB(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzC(String str) {
        int i;
        try {
            i = zzafe.zzc(str);
        } catch (zzafd unused) {
            i = str.getBytes(zzacn.zzb).length;
        }
        return zzE(i) + i;
    }

    public static int zzD(int i) {
        return zzE(i << 3);
    }

    public static int zzE(int i) {
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

    public static int zzF(long j) {
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

    public static zzabp zzG(byte[] bArr) {
        return new zzabl(bArr, 0, bArr.length);
    }

    public static zzabp zzH(OutputStream outputStream, int i) {
        return new zzabn(outputStream, i);
    }

    public static int zzw(zzabe zzabe) {
        int zzd = zzabe.zzd();
        return zzE(zzd) + zzd;
    }

    @Deprecated
    public static int zzx(int i, zzadm zzadm, zzady zzady) {
        int zzE = zzE(i << 3);
        int i2 = zzE + zzE;
        zzaao zzaao = (zzaao) zzadm;
        int zzn = zzaao.zzn();
        if (zzn == -1) {
            zzn = zzady.zza(zzaao);
            zzaao.zzp(zzn);
        }
        return i2 + zzn;
    }

    public static int zzy(int i) {
        if (i >= 0) {
            return zzE(i);
        }
        return 10;
    }

    public static int zzz(zzacs zzacs) {
        int zza2 = zzacs.zza();
        return zzE(zza2) + zza2;
    }

    public final void zzI() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzJ(String str, zzafd zzafd) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzafd);
        byte[] bytes = str.getBytes(zzacn.zzb);
        try {
            int length = bytes.length;
            zzs(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzabm(e);
        }
    }

    public abstract void zzN() throws IOException;

    public abstract void zzO(byte b) throws IOException;

    public abstract void zzP(int i, boolean z) throws IOException;

    public abstract void zzQ(int i, zzabe zzabe) throws IOException;

    public abstract void zza(byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i2) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j) throws IOException;

    public abstract void zzk(long j) throws IOException;

    public abstract void zzl(int i, int i2) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(int i, zzadm zzadm, zzady zzady) throws IOException;

    public abstract void zzo(int i, String str) throws IOException;

    public abstract void zzq(int i, int i2) throws IOException;

    public abstract void zzr(int i, int i2) throws IOException;

    public abstract void zzs(int i) throws IOException;

    public abstract void zzt(int i, long j) throws IOException;

    public abstract void zzu(long j) throws IOException;
}
