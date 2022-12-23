package com.google.android.gms.internal.ads;

import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzaxj implements zzaue {
    private final zzaxg zza = new zzaxg();
    private final zzaxf zzb = new zzaxf();
    private final zzazg zzc = new zzazg(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private zzaxh zze;
    private zzaxh zzf;
    private zzars zzg;
    private zzars zzh;
    private long zzi;
    private int zzj = SQLiteDatabase.OPEN_FULLMUTEX;
    private zzaxi zzk;
    private final zzayl zzl;

    public zzaxj(zzayl zzayl, byte[] bArr) {
        this.zzl = zzayl;
        zzaxh zzaxh = new zzaxh(0, SQLiteDatabase.OPEN_FULLMUTEX);
        this.zze = zzaxh;
        this.zzf = zzaxh;
    }

    private final int zzo(int i) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzaxh zzaxh = this.zzf;
            if (zzaxh.zzc) {
                this.zzf = zzaxh.zze;
            }
            zzaxh zzaxh2 = this.zzf;
            zzayf zzb2 = this.zzl.zzb();
            zzaxh zzaxh3 = new zzaxh(this.zzf.zzb, SQLiteDatabase.OPEN_FULLMUTEX);
            zzaxh2.zzd = zzb2;
            zzaxh2.zze = zzaxh3;
            zzaxh2.zzc = true;
        }
        return Math.min(i, SQLiteDatabase.OPEN_FULLMUTEX - this.zzj);
    }

    private final void zzp() {
        this.zza.zzg();
        zzaxh zzaxh = this.zze;
        if (zzaxh.zzc) {
            zzaxh zzaxh2 = this.zzf;
            int i = (((int) (zzaxh2.zza - zzaxh.zza)) / SQLiteDatabase.OPEN_FULLMUTEX) + (zzaxh2.zzc ? 1 : 0);
            zzayf[] zzayfArr = new zzayf[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzayfArr[i2] = zzaxh.zzd;
                zzaxh.zzd = null;
                zzaxh = zzaxh.zze;
            }
            this.zzl.zzd(zzayfArr);
        }
        zzaxh zzaxh3 = new zzaxh(0, SQLiteDatabase.OPEN_FULLMUTEX);
        this.zze = zzaxh3;
        this.zzf = zzaxh3;
        this.zzi = 0;
        this.zzj = SQLiteDatabase.OPEN_FULLMUTEX;
        this.zzl.zzg();
    }

    private final void zzq(long j) {
        while (true) {
            zzaxh zzaxh = this.zze;
            if (j >= zzaxh.zzb) {
                this.zzl.zzc(zzaxh.zzd);
                zzaxh zzaxh2 = this.zze;
                zzaxh2.zzd = null;
                this.zze = zzaxh2.zze;
            } else {
                return;
            }
        }
    }

    private final void zzr() {
        if (!this.zzd.compareAndSet(1, 0)) {
            zzp();
        }
    }

    private final void zzs(long j, byte[] bArr, int i) {
        zzq(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zze.zza);
            int min = Math.min(i - i2, SQLiteDatabase.OPEN_FULLMUTEX - i3);
            zzayf zzayf = this.zze.zzd;
            System.arraycopy(zzayf.zza, i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.zze.zzb) {
                this.zzl.zzc(zzayf);
                zzaxh zzaxh = this.zze;
                zzaxh.zzd = null;
                this.zze = zzaxh.zze;
            }
        }
    }

    private final boolean zzt() {
        return this.zzd.compareAndSet(0, 1);
    }

    public final void zza(zzars zzars) {
        zzars zzars2;
        if (zzars == null) {
            zzars2 = null;
        } else {
            zzars2 = zzars;
        }
        boolean zzk2 = this.zza.zzk(zzars2);
        this.zzh = zzars;
        zzaxi zzaxi = this.zzk;
        if (zzaxi != null && zzk2) {
            zzaxi.zzv(zzars2);
        }
    }

    public final void zzb(zzazg zzazg, int i) {
        if (zzt()) {
            while (i > 0) {
                int zzo = zzo(i);
                zzazg.zzq(this.zzf.zzd.zza, this.zzj, zzo);
                this.zzj += zzo;
                this.zzi += (long) zzo;
                i -= zzo;
            }
            zzr();
            return;
        }
        zzazg.zzw(i);
    }

    public final void zzc(long j, int i, int i2, int i3, zzaud zzaud) {
        if (zzt()) {
            try {
                this.zza.zzh(j, i, this.zzi - ((long) i2), i2, zzaud);
            } finally {
                zzr();
            }
        } else {
            long j2 = j;
            this.zza.zzi(j);
        }
    }

    public final int zzd(zzatu zzatu, int i, boolean z) throws IOException, InterruptedException {
        if (!zzt()) {
            int zzb2 = zzatu.zzb(i);
            if (zzb2 != -1) {
                return zzb2;
            }
            throw new EOFException();
        }
        try {
            int zza2 = zzatu.zza(this.zzf.zzd.zza, this.zzj, zzo(i));
            if (zza2 != -1) {
                this.zzj += zza2;
                this.zzi += (long) zza2;
                return zza2;
            }
            throw new EOFException();
        } finally {
            zzr();
        }
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final int zzf(zzart zzart, zzatn zzatn, boolean z, boolean z2, long j) {
        int i;
        zzatn zzatn2 = zzatn;
        int zzb2 = this.zza.zzb(zzart, zzatn, z, z2, this.zzg, this.zzb);
        if (zzb2 == -5) {
            this.zzg = zzart.zza;
            return -5;
        } else if (zzb2 != -4) {
            return -3;
        } else {
            if (!zzatn.zzf()) {
                if (zzatn2.zzc < j) {
                    zzatn2.zza(Integer.MIN_VALUE);
                }
                if (zzatn.zzi()) {
                    zzaxf zzaxf = this.zzb;
                    long j2 = zzaxf.zzb;
                    this.zzc.zzs(1);
                    zzs(j2, this.zzc.zza, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzc.zza[0];
                    byte b2 = b & 128;
                    byte b3 = b & Byte.MAX_VALUE;
                    zzatl zzatl = zzatn2.zza;
                    if (zzatl.zza == null) {
                        zzatl.zza = new byte[16];
                    }
                    zzs(j3, zzatl.zza, b3);
                    long j4 = j3 + ((long) b3);
                    if (b2 != 0) {
                        this.zzc.zzs(2);
                        zzs(j4, this.zzc.zza, 2);
                        j4 += 2;
                        i = this.zzc.zzj();
                    } else {
                        i = 1;
                    }
                    zzatl zzatl2 = zzatn2.zza;
                    int[] iArr = zzatl2.zzd;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzatl2.zze;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (b2 != 0) {
                        int i2 = i * 6;
                        this.zzc.zzs(i2);
                        zzs(j4, this.zzc.zza, i2);
                        j4 += (long) i2;
                        this.zzc.zzv(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr2[i3] = this.zzc.zzj();
                            iArr4[i3] = this.zzc.zzi();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzaxf.zza - ((int) (j4 - zzaxf.zzb));
                    }
                    zzaud zzaud = zzaxf.zzd;
                    zzatl zzatl3 = zzatn2.zza;
                    zzatl3.zzb(i, iArr2, iArr4, zzaud.zzb, zzatl3.zza, 1);
                    long j5 = zzaxf.zzb;
                    int i4 = (int) (j4 - j5);
                    zzaxf.zzb = j5 + ((long) i4);
                    zzaxf.zza -= i4;
                }
                zzatn2.zzh(this.zzb.zza);
                zzaxf zzaxf2 = this.zzb;
                long j6 = zzaxf2.zzb;
                ByteBuffer byteBuffer = zzatn2.zzb;
                int i5 = zzaxf2.zza;
                zzq(j6);
                while (i5 > 0) {
                    int i6 = (int) (j6 - this.zze.zza);
                    int min = Math.min(i5, SQLiteDatabase.OPEN_FULLMUTEX - i6);
                    zzayf zzayf = this.zze.zzd;
                    byteBuffer.put(zzayf.zza, i6, min);
                    j6 += (long) min;
                    i5 -= min;
                    if (j6 == this.zze.zzb) {
                        this.zzl.zzc(zzayf);
                        zzaxh zzaxh = this.zze;
                        zzaxh.zzd = null;
                        this.zze = zzaxh.zze;
                    }
                }
                zzq(this.zzb.zzc);
            }
            return -4;
        }
    }

    public final long zzg() {
        return this.zza.zzc();
    }

    public final zzars zzh() {
        return this.zza.zzf();
    }

    public final void zzi() {
        if (this.zzd.getAndSet(2) == 0) {
            zzp();
        }
    }

    public final void zzj(boolean z) {
        int i;
        AtomicInteger atomicInteger = this.zzd;
        if (true != z) {
            i = 2;
        } else {
            i = 0;
        }
        int andSet = atomicInteger.getAndSet(i);
        zzp();
        this.zza.zzj();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final void zzk(zzaxi zzaxi) {
        this.zzk = zzaxi;
    }

    public final void zzl() {
        long zzd2 = this.zza.zzd();
        if (zzd2 != -1) {
            zzq(zzd2);
        }
    }

    public final boolean zzm() {
        return this.zza.zzl();
    }

    public final boolean zzn(long j, boolean z) {
        long zze2 = this.zza.zze(j, z);
        if (zze2 == -1) {
            return false;
        }
        zzq(zze2);
        return true;
    }
}
