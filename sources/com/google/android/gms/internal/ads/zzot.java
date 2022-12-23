package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzot extends zzqj implements zzjc {
    private final Context zzb;
    /* access modifiers changed from: private */
    public final zznk zzc;
    private final zznr zzd;
    private int zze;
    private boolean zzf;
    private zzad zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    /* access modifiers changed from: private */
    public zzjt zzl;

    public zzot(Context context, zzqd zzqd, zzql zzql, boolean z, Handler handler, zznl zznl, zznr zznr) {
        super(1, zzqd, zzql, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zznr;
        this.zzc = new zznk(handler, zznl);
        zznr.zzn(new zzos(this, (zzor) null));
    }

    private final int zzaw(zzqg zzqg, zzad zzad) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zzqg.zza) || (i = zzeg.zza) >= 24 || (i == 23 && zzeg.zzW(this.zzb))) {
            return zzad.zzn;
        }
        return -1;
    }

    private static List zzax(zzql zzql, zzad zzad, boolean z, zznr zznr) throws zzqs {
        zzqg zzd2;
        String str = zzad.zzm;
        if (str == null) {
            return zzfrh.zzo();
        }
        if (zznr.zzv(zzad) && (zzd2 = zzqy.zzd()) != null) {
            return zzfrh.zzp(zzd2);
        }
        List zzf2 = zzqy.zzf(str, false, false);
        String zze2 = zzqy.zze(zzad);
        if (zze2 == null) {
            return zzfrh.zzm(zzf2);
        }
        List zzf3 = zzqy.zzf(zze2, false, false);
        zzfre zzi2 = zzfrh.zzi();
        zzi2.zzf(zzf2);
        zzi2.zzf(zzf3);
        return zzi2.zzg();
    }

    private final void zzay() {
        long zzb2 = this.zzd.zzb(zzM());
        if (zzb2 != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb2 = Math.max(this.zzh, zzb2);
            }
            this.zzh = zzb2;
            this.zzj = false;
        }
    }

    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    public final boolean zzM() {
        return super.zzM() && this.zzd.zzu();
    }

    public final boolean zzN() {
        return this.zzd.zzt() || super.zzN();
    }

    public final float zzP(float f, zzad zzad, zzad[] zzadArr) {
        int i = -1;
        for (zzad zzad2 : zzadArr) {
            int i2 = zzad2.zzA;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    public final int zzQ(zzql zzql, zzad zzad) throws zzqs {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean zzg2 = zzbo.zzg(zzad.zzm);
        int i4 = RecyclerView.C1119a0.FLAG_IGNORE;
        if (!zzg2) {
            return RecyclerView.C1119a0.FLAG_IGNORE;
        }
        if (zzeg.zza >= 21) {
            i = 32;
        } else {
            i = 0;
        }
        int i5 = zzad.zzF;
        boolean zzav = zzqj.zzav(zzad);
        if (zzav && this.zzd.zzv(zzad) && (i5 == 0 || zzqy.zzd() != null)) {
            return i | 140;
        }
        if (("audio/raw".equals(zzad.zzm) && !this.zzd.zzv(zzad)) || !this.zzd.zzv(zzeg.zzE(2, zzad.zzz, zzad.zzA))) {
            return 129;
        }
        List zzax = zzax(zzql, zzad, false, this.zzd);
        if (zzax.isEmpty()) {
            return 129;
        }
        if (!zzav) {
            return 130;
        }
        zzqg zzqg = (zzqg) zzax.get(0);
        boolean zzd2 = zzqg.zzd(zzad);
        if (!zzd2) {
            int i6 = 1;
            while (true) {
                if (i6 >= zzax.size()) {
                    break;
                }
                zzqg zzqg2 = (zzqg) zzax.get(i6);
                if (zzqg2.zzd(zzad)) {
                    zzqg = zzqg2;
                    z = false;
                    zzd2 = true;
                    break;
                }
                i6++;
            }
        }
        z = true;
        if (true != zzd2) {
            i2 = 3;
        } else {
            i2 = 4;
        }
        int i7 = 8;
        if (zzd2 && zzqg.zze(zzad)) {
            i7 = 16;
        }
        if (true != zzqg.zzg) {
            i3 = 0;
        } else {
            i3 = 64;
        }
        if (true != z) {
            i4 = 0;
        }
        return i2 | i7 | i | i3 | i4;
    }

    public final zzgn zzR(zzqg zzqg, zzad zzad, zzad zzad2) {
        int i;
        int i2;
        zzgn zzb2 = zzqg.zzb(zzad, zzad2);
        int i3 = zzb2.zze;
        if (zzaw(zzqg, zzad2) > this.zze) {
            i3 |= 64;
        }
        String str = zzqg.zza;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = zzb2.zzd;
            i = 0;
        }
        return new zzgn(str, zzad, zzad2, i2, i);
    }

    public final zzgn zzS(zzja zzja) throws zzgu {
        zzgn zzS = super.zzS(zzja);
        this.zzc.zzg(zzja.zza, zzS);
        return zzS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzqc zzV(com.google.android.gms.internal.ads.zzqg r8, com.google.android.gms.internal.ads.zzad r9, android.media.MediaCrypto r10, float r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzad[] r10 = r7.zzJ()
            int r0 = r7.zzaw(r8, r9)
            int r1 = r10.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 >= r1) goto L_0x0026
            r5 = r10[r4]
            com.google.android.gms.internal.ads.zzgn r6 = r8.zzb(r9, r5)
            int r6 = r6.zzd
            if (r6 == 0) goto L_0x0023
            int r5 = r7.zzaw(r8, r5)
            int r0 = java.lang.Math.max(r0, r5)
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0026:
            r7.zze = r0
            java.lang.String r10 = r8.zza
            int r0 = com.google.android.gms.internal.ads.zzeg.zza
            r1 = 24
            if (r0 >= r1) goto L_0x005e
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzeg.zzc
            java.lang.String r4 = "samsung"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.zzeg.zzb
            java.lang.String r4 = "zeroflte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "herolte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "heroqlte"
            boolean r10 = r10.startsWith(r4)
            if (r10 == 0) goto L_0x005e
        L_0x005c:
            r10 = 1
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            r7.zzf = r10
            java.lang.String r10 = r8.zzc
            int r4 = r7.zze
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r6 = "mime"
            r5.setString(r6, r10)
            int r10 = r9.zzz
            java.lang.String r6 = "channel-count"
            r5.setInteger(r6, r10)
            int r10 = r9.zzA
            java.lang.String r6 = "sample-rate"
            r5.setInteger(r6, r10)
            java.util.List r10 = r9.zzo
            com.google.android.gms.internal.ads.zzdp.zzb(r5, r10)
            java.lang.String r10 = "max-input-size"
            com.google.android.gms.internal.ads.zzdp.zza(r5, r10, r4)
            r10 = 23
            if (r0 < r10) goto L_0x00af
            java.lang.String r4 = "priority"
            r5.setInteger(r4, r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            if (r0 != r10) goto L_0x00aa
            java.lang.String r10 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r2 = "ZTE B2017G"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = "AXON 7 mini"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00af
        L_0x00aa:
            java.lang.String r10 = "operating-rate"
            r5.setFloat(r10, r11)
        L_0x00af:
            r10 = 28
            if (r0 > r10) goto L_0x00c2
            java.lang.String r10 = r9.zzm
            java.lang.String r11 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = "ac4-is-sync"
            r5.setInteger(r10, r3)
        L_0x00c2:
            if (r0 < r1) goto L_0x00db
            com.google.android.gms.internal.ads.zznr r10 = r7.zzd
            int r11 = r9.zzz
            int r1 = r9.zzA
            r2 = 4
            com.google.android.gms.internal.ads.zzad r11 = com.google.android.gms.internal.ads.zzeg.zzE(r2, r11, r1)
            int r10 = r10.zza(r11)
            r11 = 2
            if (r10 != r11) goto L_0x00db
            java.lang.String r10 = "pcm-encoding"
            r5.setInteger(r10, r2)
        L_0x00db:
            r10 = 32
            if (r0 < r10) goto L_0x00e6
            r10 = 99
            java.lang.String r11 = "max-output-channel-count"
            r5.setInteger(r11, r10)
        L_0x00e6:
            java.lang.String r10 = r8.zzb
            java.lang.String r11 = "audio/raw"
            boolean r10 = r11.equals(r10)
            r0 = 0
            if (r10 == 0) goto L_0x00fb
            java.lang.String r10 = r9.zzm
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00fb
            r10 = r9
            goto L_0x00fc
        L_0x00fb:
            r10 = r0
        L_0x00fc:
            r7.zzg = r10
            com.google.android.gms.internal.ads.zzqc r8 = com.google.android.gms.internal.ads.zzqc.zza(r8, r5, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzot.zzV(com.google.android.gms.internal.ads.zzqg, com.google.android.gms.internal.ads.zzad, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqc");
    }

    public final List zzW(zzql zzql, zzad zzad, boolean z) throws zzqs {
        return zzqy.zzg(zzax(zzql, zzad, false, this.zzd), zzad);
    }

    public final void zzX(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    public final void zzY(String str, zzqc zzqc, long j, long j2) {
        this.zzc.zzc(str, j, j2);
    }

    public final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    public final long zza() {
        if (zzbe() == 2) {
            zzay();
        }
        return this.zzh;
    }

    public final void zzaa(zzad zzad, MediaFormat mediaFormat) throws zzgu {
        int i;
        int i2;
        zzad zzad2 = this.zzg;
        int[] iArr = null;
        if (zzad2 != null) {
            zzad = zzad2;
        } else if (zzaj() != null) {
            if ("audio/raw".equals(zzad.zzm)) {
                i = zzad.zzB;
            } else if (zzeg.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = zzeg.zzn(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = 2;
            }
            zzab zzab = new zzab();
            zzab.zzS("audio/raw");
            zzab.zzN(i);
            zzab.zzC(zzad.zzC);
            zzab.zzD(zzad.zzD);
            zzab.zzw(mediaFormat.getInteger("channel-count"));
            zzab.zzT(mediaFormat.getInteger("sample-rate"));
            zzad zzY = zzab.zzY();
            if (this.zzf && zzY.zzz == 6 && (i2 = zzad.zzz) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < zzad.zzz; i3++) {
                    iArr[i3] = i3;
                }
            }
            zzad = zzY;
        }
        try {
            this.zzd.zzd(zzad, 0, iArr);
        } catch (zznm e) {
            throw zzbg(e, e.zza, false, 5001);
        }
    }

    public final void zzab() {
        this.zzj = true;
    }

    public final void zzac() {
        this.zzd.zzf();
    }

    public final void zzad(zzgc zzgc) {
        if (this.zzi && !zzgc.zzf()) {
            if (Math.abs(zzgc.zzd - this.zzh) > 500000) {
                this.zzh = zzgc.zzd;
            }
            this.zzi = false;
        }
    }

    public final void zzae() throws zzgu {
        try {
            this.zzd.zzi();
        } catch (zznq e) {
            throw zzbg(e, e.zzc, e.zzb, 5002);
        }
    }

    public final boolean zzaf(long j, long j2, zzqe zzqe, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzad zzad) throws zzgu {
        byteBuffer.getClass();
        if (this.zzg != null && (i2 & 2) != 0) {
            zzqe.getClass();
            zzqe.zzn(i, false);
            return true;
        } else if (z) {
            if (zzqe != null) {
                zzqe.zzn(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzf();
            return true;
        } else {
            try {
                if (!this.zzd.zzs(byteBuffer, j3, i3)) {
                    return false;
                }
                if (zzqe != null) {
                    zzqe.zzn(i, false);
                }
                this.zza.zze += i3;
                return true;
            } catch (zznn e) {
                throw zzbg(e, e.zzc, e.zzb, 5001);
            } catch (zznq e2) {
                throw zzbg(e2, zzad, e2.zzb, 5002);
            }
        }
    }

    public final boolean zzag(zzad zzad) {
        return this.zzd.zzv(zzad);
    }

    public final zzbt zzc() {
        return this.zzd.zzc();
    }

    public final void zzg(zzbt zzbt) {
        this.zzd.zzo(zzbt);
    }

    public final zzjc zzi() {
        return this;
    }

    public final void zzp(int i, Object obj) throws zzgu {
        if (i == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzd.zzk((zzi) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.zzd.zzq(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzl(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzjt) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.zzd.zzm((zzj) obj);
        }
    }

    public final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
                this.zzc.zze(this.zza);
            }
        } catch (Throwable th) {
            super.zzs();
            throw th;
        } finally {
            this.zzc.zze(this.zza);
        }
    }

    public final void zzt(boolean z, boolean z2) throws zzgu {
        super.zzt(z, z2);
        this.zzc.zzf(this.zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    public final void zzu(long j, boolean z) throws zzgu {
        super.zzu(j, z);
        this.zzd.zze();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    public final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    public final void zzw() {
        this.zzd.zzh();
    }

    public final void zzx() {
        zzay();
        this.zzd.zzg();
    }
}
