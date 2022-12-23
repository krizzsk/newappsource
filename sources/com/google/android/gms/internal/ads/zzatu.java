package com.google.android.gms.internal.ads;

import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class zzatu {
    private static final byte[] zza = new byte[4096];
    private final zzayi zzb;
    private final long zzc;
    private long zzd;
    private byte[] zze = new byte[SQLiteDatabase.OPEN_FULLMUTEX];
    private int zzf;
    private int zzg;

    public zzatu(zzayi zzayi, long j, long j2) {
        this.zzb = zzayi;
        this.zzd = j;
        this.zzc = j2;
    }

    private final int zzj(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int zza2 = this.zzb.zza(bArr, i + i3, i2 - i3);
            if (zza2 != -1) {
                return i3 + zza2;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private final int zzk(byte[] bArr, int i, int i2) {
        int i3 = this.zzg;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.zze, 0, bArr, i, min);
        zzn(min);
        return min;
    }

    private final int zzl(int i) {
        int min = Math.min(this.zzg, i);
        zzn(min);
        return min;
    }

    private final void zzm(int i) {
        if (i != -1) {
            this.zzd += (long) i;
        }
    }

    private final void zzn(int i) {
        byte[] bArr;
        int i2 = this.zzg - i;
        this.zzg = i2;
        this.zzf = 0;
        byte[] bArr2 = this.zze;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[(SQLiteDatabase.OPEN_FULLMUTEX + i2)];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.zze = bArr;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int zzk = zzk(bArr, i, i2);
        if (zzk == 0) {
            zzk = zzj(bArr, i, i2, 0, true);
        }
        zzm(zzk);
        return zzk;
    }

    public final int zzb(int i) throws IOException, InterruptedException {
        int zzl = zzl(i);
        if (zzl == 0) {
            zzl = zzj(zza, 0, Math.min(i, 4096), 0, true);
        }
        zzm(zzl);
        return zzl;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzd;
    }

    public final void zze() {
        this.zzf = 0;
    }

    public final boolean zzf(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.zzf + i;
        int length = this.zze.length;
        if (i2 > length) {
            this.zze = Arrays.copyOf(this.zze, zzazn.zze(length + length, SQLiteDatabase.OPEN_FULLMUTEX + i2, i2 + 524288));
        }
        int min = Math.min(this.zzg - this.zzf, i);
        while (min < i) {
            min = zzj(this.zze, this.zzf, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.zzf + i;
        this.zzf = i3;
        this.zzg = Math.max(this.zzg, i3);
        return true;
    }

    public final boolean zzg(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!zzf(i2, false)) {
            return false;
        }
        System.arraycopy(this.zze, this.zzf - i2, bArr, i, i2);
        return true;
    }

    public final boolean zzh(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int zzk = zzk(bArr, i, i2);
        while (zzk < i2 && zzk != -1) {
            zzk = zzj(bArr, i, i2, zzk, z);
        }
        zzm(zzk);
        if (zzk != -1) {
            return true;
        }
        return false;
    }

    public final boolean zzi(int i, boolean z) throws IOException, InterruptedException {
        int zzl = zzl(i);
        while (zzl < i && zzl != -1) {
            zzl = zzj(zza, -zzl, Math.min(i, zzl + 4096), zzl, false);
        }
        zzm(zzl);
        if (zzl != -1) {
            return true;
        }
        return false;
    }
}
