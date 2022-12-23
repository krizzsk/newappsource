package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class zzqv implements zzqt {
    private zzqv() {
    }

    public /* synthetic */ zzqv(zzqu zzqu) {
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean zzc(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (!"secure-playback".equals(str) || !"video/avc".equals(str2)) {
            return false;
        }
        return true;
    }

    public final boolean zze() {
        return false;
    }
}
