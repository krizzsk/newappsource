package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

public final class zzavp extends Exception {
    public final String zza;
    public final String zzb;
    public final String zzc;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzavp(com.google.android.gms.internal.ads.zzars r3, java.lang.Throwable r4, boolean r5, int r6) {
        /*
            r2 = this;
            java.lang.String r5 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder init failed: ["
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r2.<init>(r5, r4)
            java.lang.String r3 = r3.zzf
            r2.zza = r3
            r3 = 0
            r2.zzb = r3
            int r3 = java.lang.Math.abs(r6)
            java.lang.String r4 = "com.google.android.exoplayer.MediaCodecTrackRenderer_neg_"
            java.lang.String r3 = p379.C16759e.m42349e(r4, r3)
            r2.zzc = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavp.<init>(com.google.android.gms.internal.ads.zzars, java.lang.Throwable, boolean, int):void");
    }

    public zzavp(zzars zzars, Throwable th, boolean z, String str) {
        super(C25541a.m63882l("Decoder init failed: ", str, ", ", String.valueOf(zzars)), th);
        this.zza = zzars.zzf;
        this.zzb = str;
        String str2 = null;
        if (zzazn.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzc = str2;
    }
}
