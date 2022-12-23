package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import p001a0.C0016g;

@TargetApi(16)
/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a */
public final class C3232a {

    /* renamed from: a */
    public final String f11659a;

    /* renamed from: b */
    public final boolean f11660b;

    /* renamed from: c */
    public final boolean f11661c;

    /* renamed from: d */
    public final String f11662d;

    /* renamed from: e */
    public final MediaCodecInfo.CodecCapabilities f11663e;

    public C3232a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z) {
        boolean z2;
        this.f11659a = (String) C3380a.m8503a(str);
        this.f11662d = str2;
        this.f11663e = codecCapabilities;
        boolean z3 = true;
        if (z || codecCapabilities == null || !m8188a(codecCapabilities)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f11660b = z2;
        this.f11661c = (codecCapabilities == null || !m8190b(codecCapabilities)) ? false : z3;
    }

    /* renamed from: b */
    public static boolean m8190b(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (C3406u.f12148a < 21 || !codecCapabilities.isFeatureSupported("tunneled-playback")) {
            return false;
        }
        return true;
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean mo14335a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11663e;
        if (codecCapabilities == null) {
            mo14334a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            mo14334a("sizeAndRate.vCaps");
            return false;
        } else if (m8189a(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m8189a(videoCapabilities, i2, i, d)) {
                StringBuilder s = C0016g.m35s("sizeAndRate.support, ", i, "x", i2, "x");
                s.append(d);
                mo14334a(s.toString());
                return false;
            }
            int i3 = C3406u.f12148a;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo14334a(String str) {
        int i = C3406u.f12148a;
    }

    /* renamed from: a */
    public static boolean m8188a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C3406u.f12148a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    @TargetApi(21)
    /* renamed from: a */
    public static boolean m8189a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
