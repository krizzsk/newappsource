package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class zzate extends zzavq implements zzazc {
    /* access modifiers changed from: private */
    public final zzaso zzb;
    private final zzata zzc = new zzata((zzasf) null, new zzash[0], new zzatd(this, (zzatc) null));
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    /* access modifiers changed from: private */
    public boolean zzh;

    public zzate(zzavs zzavs, zzats zzats, boolean z, Handler handler, zzasp zzasp) {
        super(1, zzavs, (zzats) null, true);
        this.zzb = new zzaso(handler, zzasp);
    }

    public final boolean zzE() {
        return super.zzE() && this.zzc.zzo();
    }

    public final boolean zzF() {
        return this.zzc.zzn() || super.zzF();
    }

    public final int zzH(zzavs zzavs, zzars zzars) throws zzavv {
        int i;
        int i2;
        int i3;
        String str = zzars.zzf;
        if (!zzazd.zza(str)) {
            return 0;
        }
        int i4 = zzazn.zza;
        if (i4 >= 21) {
            i = 16;
        } else {
            i = 0;
        }
        zzavo zzc2 = zzawa.zzc(str, false);
        if (zzc2 == null) {
            return 1;
        }
        int i5 = 2;
        if (i4 < 21 || (((i2 = zzars.zzs) == -1 || zzc2.zzd(i2)) && ((i3 = zzars.zzr) == -1 || zzc2.zzc(i3)))) {
            i5 = 3;
        }
        return i | 4 | i5;
    }

    public final long zzI() {
        long zza = this.zzc.zza(zzE());
        if (zza != Long.MIN_VALUE) {
            if (!this.zzh) {
                zza = Math.max(this.zzg, zza);
            }
            this.zzg = zza;
            this.zzh = false;
        }
        return this.zzg;
    }

    public final zzarw zzJ() {
        return this.zzc.zzc();
    }

    public final zzarw zzK(zzarw zzarw) {
        return this.zzc.zzd(zzarw);
    }

    public final zzavo zzM(zzavs zzavs, zzars zzars, boolean z) throws zzavv {
        return super.zzM(zzavs, zzars, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzO(com.google.android.gms.internal.ads.zzavo r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzars r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.zza
            int r7 = com.google.android.gms.internal.ads.zzazn.zza
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L_0x0037
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.zzazn.zzc
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.zzazn.zzb
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r3.zzd = r0
            android.media.MediaFormat r4 = r6.zzb()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzate.zzO(com.google.android.gms.internal.ads.zzavo, android.media.MediaCodec, com.google.android.gms.internal.ads.zzars, android.media.MediaCrypto):void");
    }

    public final void zzP(String str, long j, long j2) {
        this.zzb.zzd(str, j, j2);
    }

    public final void zzQ(zzars zzars) throws zzare {
        int i;
        super.zzQ(zzars);
        this.zzb.zzg(zzars);
        if ("audio/raw".equals(zzars.zzf)) {
            i = zzars.zzt;
        } else {
            i = 2;
        }
        this.zze = i;
        this.zzf = zzars.zzr;
    }

    public final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzare {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.zzd || integer != 6) {
            i = integer;
            iArr = null;
        } else {
            int i2 = this.zzf;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.zzf; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        }
        try {
            this.zzc.zze("audio/raw", i, integer2, this.zze, 0, iArr);
        } catch (zzasu e) {
            throw zzare.zza(e, zza());
        }
    }

    public final void zzS() throws zzare {
        try {
            this.zzc.zzi();
        } catch (zzasz e) {
            throw zzare.zza(e, zza());
        }
    }

    public final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzare {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zze++;
            this.zzc.zzf();
            return true;
        }
        try {
            if (!this.zzc.zzm(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zzd++;
            return true;
        } catch (zzasv | zzasz e) {
            throw zzare.zza(e, zza());
        }
    }

    public final zzazc zzi() {
        return this;
    }

    public final void zzl(int i, Object obj) throws zzare {
        if (i == 2) {
            this.zzc.zzl(((Float) obj).floatValue());
        }
    }

    public final void zzn() {
        try {
            this.zzc.zzj();
            try {
                super.zzn();
            } finally {
                this.zza.zza();
                this.zzb.zze(this.zza);
            }
        } catch (Throwable th) {
            super.zzn();
            throw th;
        } finally {
            this.zza.zza();
            this.zzb.zze(this.zza);
        }
    }

    public final void zzo(boolean z) throws zzare {
        super.zzo(z);
        this.zzb.zzf(this.zza);
        int i = zzg().zzb;
    }

    public final void zzp(long j, boolean z) throws zzare {
        super.zzp(j, z);
        this.zzc.zzk();
        this.zzg = j;
        this.zzh = true;
    }

    public final void zzq() {
        this.zzc.zzh();
    }

    public final void zzr() {
        this.zzc.zzg();
    }
}
