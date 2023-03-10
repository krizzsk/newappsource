package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class zzath implements zzash {
    private int zzb = -1;
    private int zzc = -1;
    private zzatg zzd;
    private float zze = 1.0f;
    private float zzf = 1.0f;
    private ByteBuffer zzg;
    private ShortBuffer zzh;
    private ByteBuffer zzi;
    private long zzj;
    private long zzk;
    private boolean zzl;

    public zzath() {
        ByteBuffer byteBuffer = zzash.zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer.asShortBuffer();
        this.zzi = byteBuffer;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return 2;
    }

    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.zzi;
        this.zzi = zzash.zza;
        return byteBuffer;
    }

    public final void zzd() {
        zzatg zzatg = new zzatg(this.zzc, this.zzb);
        this.zzd = zzatg;
        zzatg.zzf(this.zze);
        this.zzd.zze(this.zzf);
        this.zzi = zzash.zza;
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = false;
    }

    public final void zze() {
        this.zzd.zzc();
        this.zzl = true;
    }

    public final void zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzj += (long) remaining;
            this.zzd.zzd(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zza = this.zzd.zza() * this.zzb;
        int i = zza + zza;
        if (i > 0) {
            if (this.zzg.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.zzg = order;
                this.zzh = order.asShortBuffer();
            } else {
                this.zzg.clear();
                this.zzh.clear();
            }
            this.zzd.zzb(this.zzh);
            this.zzk += (long) i;
            this.zzg.limit(i);
            this.zzi = this.zzg;
        }
    }

    public final void zzg() {
        this.zzd = null;
        ByteBuffer byteBuffer = zzash.zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer.asShortBuffer();
        this.zzi = byteBuffer;
        this.zzb = -1;
        this.zzc = -1;
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = false;
    }

    public final boolean zzh(int i, int i2, int i3) throws zzasg {
        if (i3 != 2) {
            throw new zzasg(i, i2, i3);
        } else if (this.zzc == i && this.zzb == i2) {
            return false;
        } else {
            this.zzc = i;
            this.zzb = i2;
            return true;
        }
    }

    public final boolean zzi() {
        return Math.abs(this.zze + -1.0f) >= 0.01f || Math.abs(this.zzf + -1.0f) >= 0.01f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.zzd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzj() {
        /*
            r3 = this;
            boolean r0 = r3.zzl
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.zzatg r0 = r3.zzd
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzath.zzj():boolean");
    }

    public final float zzk(float f) {
        this.zzf = zzazn.zza(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    public final float zzl(float f) {
        float zza = zzazn.zza(f, 0.1f, 8.0f);
        this.zze = zza;
        return zza;
    }

    public final long zzm() {
        return this.zzj;
    }

    public final long zzn() {
        return this.zzk;
    }
}
