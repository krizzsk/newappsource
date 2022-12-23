package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;

@TargetApi(24)
final class zzatk {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec$CryptoInfo$Pattern zzb = new MediaCodec$CryptoInfo$Pattern(0, 0);

    public /* synthetic */ zzatk(MediaCodec.CryptoInfo cryptoInfo, zzatj zzatj) {
        this.zza = cryptoInfo;
    }

    public static /* bridge */ /* synthetic */ void zza(zzatk zzatk, int i, int i2) {
        zzatk.zzb.set(0, 0);
        zzatk.zza.setPattern(zzatk.zzb);
    }
}
