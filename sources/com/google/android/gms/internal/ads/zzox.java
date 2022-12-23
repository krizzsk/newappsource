package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class zzox implements zzmz {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzmx zze;
    private zzmx zzf;
    private zzmx zzg;
    private zzmx zzh;
    private boolean zzi;
    private zzow zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzox() {
        zzmx zzmx = zzmx.zza;
        this.zze = zzmx;
        this.zzf = zzmx;
        this.zzg = zzmx;
        this.zzh = zzmx;
        ByteBuffer byteBuffer = zzmz.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    public final zzmx zza(zzmx zzmx) throws zzmy {
        if (zzmx.zzd == 2) {
            int i = this.zzb;
            if (i == -1) {
                i = zzmx.zzb;
            }
            this.zze = zzmx;
            zzmx zzmx2 = new zzmx(i, zzmx.zzc, 2);
            this.zzf = zzmx2;
            this.zzi = true;
            return zzmx2;
        }
        throw new zzmy(zzmx);
    }

    public final ByteBuffer zzb() {
        int zza;
        zzow zzow = this.zzj;
        if (zzow != null && (zza = zzow.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzow.zzd(this.zzl);
            this.zzo += (long) zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzmz.zza;
        return byteBuffer;
    }

    public final void zzc() {
        if (zzg()) {
            zzmx zzmx = this.zze;
            this.zzg = zzmx;
            zzmx zzmx2 = this.zzf;
            this.zzh = zzmx2;
            if (this.zzi) {
                this.zzj = new zzow(zzmx.zzb, zzmx.zzc, this.zzc, this.zzd, zzmx2.zzb);
            } else {
                zzow zzow = this.zzj;
                if (zzow != null) {
                    zzow.zzc();
                }
            }
        }
        this.zzm = zzmz.zza;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final void zzd() {
        zzow zzow = this.zzj;
        if (zzow != null) {
            zzow.zze();
        }
        this.zzp = true;
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzow zzow = this.zzj;
            zzow.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += (long) remaining;
            zzow.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzmx zzmx = zzmx.zza;
        this.zze = zzmx;
        this.zzf = zzmx;
        this.zzg = zzmx;
        this.zzh = zzmx;
        ByteBuffer byteBuffer = zzmz.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 4.0f) >= 1.0E-4f || Math.abs(this.zzd - 4.0f) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzh() {
        /*
            r3 = this;
            boolean r0 = r3.zzp
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.zzow r0 = r3.zzj
            if (r0 == 0) goto L_0x0013
            int r0 = r0.zza()
            if (r0 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzox.zzh():boolean");
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (((double) this.zzc) * ((double) j));
        }
        long j3 = this.zzn;
        zzow zzow = this.zzj;
        zzow.getClass();
        long zzb2 = j3 - ((long) zzow.zzb());
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        if (i == i2) {
            return zzeg.zzw(j, zzb2, j2);
        }
        return zzeg.zzw(j, zzb2 * ((long) i), j2 * ((long) i2));
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
