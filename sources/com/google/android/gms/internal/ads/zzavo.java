package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Pair;
import p001a0.C0016g;

@TargetApi(16)
public final class zzavo {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    private final String zze;
    private final MediaCodecInfo.CodecCapabilities zzf;

    private zzavo(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        str.getClass();
        this.zza = str;
        this.zze = str2;
        this.zzf = codecCapabilities;
        boolean z5 = true;
        if (z || codecCapabilities == null || zzazn.zza < 19 || !codecCapabilities.isFeatureSupported("adaptive-playback")) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.zzb = z3;
        if (codecCapabilities == null || zzazn.zza < 21 || !codecCapabilities.isFeatureSupported("tunneled-playback")) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.zzc = z4;
        if (!z2 && (codecCapabilities == null || zzazn.zza < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z5 = false;
        }
        this.zzd = z5;
    }

    public static zzavo zza(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzavo(str, str2, codecCapabilities, z, z2);
    }

    public static zzavo zzb(String str) {
        return new zzavo("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    private final void zzh(String str) {
        int i = zzazn.zza;
    }

    @TargetApi(21)
    private static boolean zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    @TargetApi(21)
    public final boolean zzc(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        } else {
            zzh(C16759e.m42349e("channelCount.support, ", i));
            return false;
        }
    }

    @TargetApi(21)
    public final boolean zzd(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            zzh(C16759e.m42349e("sampleRate.support, ", i));
            return false;
        }
    }

    public final boolean zze(String str) {
        String str2;
        if (str == null || this.zze == null) {
            return true;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            str2 = "video/avc";
        } else if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            str2 = "video/hevc";
        } else if (trim.startsWith("vp9")) {
            str2 = "video/x-vnd.on2.vp9";
        } else if (trim.startsWith("vp8")) {
            str2 = "video/x-vnd.on2.vp8";
        } else if (trim.startsWith("mp4a")) {
            str2 = "audio/mp4a-latm";
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            str2 = "audio/ac3";
        } else if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            str2 = "audio/eac3";
        } else if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            str2 = "audio/vnd.dts";
        } else if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            str2 = "audio/vnd.dts.hd";
        } else if (trim.startsWith("opus")) {
            str2 = "audio/opus";
        } else if (trim.startsWith("vorbis")) {
            str2 = "audio/vorbis";
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return true;
        }
        if (!this.zze.equals(str2)) {
            zzh(C25541a.m63882l("codec.mime ", str, ", ", str2));
            return false;
        }
        Pair zzb2 = zzawa.zzb(str);
        if (zzb2 == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzg()) {
            if (codecProfileLevel.profile == ((Integer) zzb2.first).intValue() && codecProfileLevel.level >= ((Integer) zzb2.second).intValue()) {
                return true;
            }
        }
        zzh(C25541a.m63882l("codec.profileLevel, ", str, ", ", str2));
        return false;
    }

    @TargetApi(21)
    public final boolean zzf(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzh("sizeAndRate.vCaps");
            return false;
        } else if (zzi(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !zzi(videoCapabilities, i2, i, d)) {
                StringBuilder s = C0016g.m35s("sizeAndRate.support, ", i, "x", i2, "x");
                s.append(d);
                zzh(s.toString());
                return false;
            }
            int i3 = zzazn.zza;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] zzg() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.zzf
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavo.zzg():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }
}
