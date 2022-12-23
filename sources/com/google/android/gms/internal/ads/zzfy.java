package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;

final class zzfy {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec$CryptoInfo$Pattern zzb = new MediaCodec$CryptoInfo$Pattern(0, 0);

    public /* synthetic */ zzfy(MediaCodec.CryptoInfo cryptoInfo, zzfx zzfx) {
        this.zza = cryptoInfo;
    }

    public static /* bridge */ /* synthetic */ void zza(zzfy zzfy, int i, int i2) {
        zzfy.zzb.set(i, i2);
        zzfy.zza.setPattern(zzfy.zzb);
    }
}
