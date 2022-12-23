package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

public final class zzqi extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzqg zzc;
    public final String zzd;
    public final zzqi zze;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzqi(com.google.android.gms.internal.ads.zzad r11, java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder init failed: ["
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r5 = r11.zzm
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r3 = r0.toString()
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.<init>(com.google.android.gms.internal.ads.zzad, java.lang.Throwable, boolean, int):void");
    }

    public static /* bridge */ /* synthetic */ zzqi zza(zzqi zzqi, zzqi zzqi2) {
        return new zzqi(zzqi.getMessage(), zzqi.getCause(), zzqi.zza, false, zzqi.zzc, zzqi.zzd, zzqi2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzqi(zzad zzad, Throwable th, boolean z, zzqg zzqg) {
        this(C25541a.m63882l("Decoder init failed: ", zzqg.zza, ", ", String.valueOf(zzad)), th, zzad.zzm, false, zzqg, (zzeg.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), (zzqi) null);
    }

    private zzqi(String str, Throwable th, String str2, boolean z, zzqg zzqg, String str3, zzqi zzqi) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzqg;
        this.zzd = str3;
        this.zze = zzqi;
    }
}
