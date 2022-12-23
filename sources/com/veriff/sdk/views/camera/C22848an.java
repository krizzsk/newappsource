package com.veriff.sdk.views.camera;

import android.media.MediaFormat;
import android.util.Size;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;
import p584jl.C17885a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007\u001a@\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0007\u001a\f\u0010\u0017\u001a\u00020\u0018*\u00020\u000bH\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\bH\u0002\u001a\u0014\u0010\u0019\u001a\u00020\b*\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo59060d2 = {"DEQUE_BUFFER_TIMEOUT_USEC", "", "ENCODER_INIT_TIMEOUT_MS", "NO_FRAMES_GRACE_MS", "log", "Lmobi/lab/veriff/util/Log;", "kotlin.jvm.PlatformType", "adjustBitrate", "", "targetBitrate", "targetSize", "Landroid/util/Size;", "encodedSize", "getVideoFormat", "Landroid/media/MediaFormat;", "mime", "", "width", "height", "colorFormat", "bitrate", "frameRate", "iFrameInterval", "area", "", "toMultipleOf", "value", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.an */
public final class C22848an {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C24465j f58009a = C24465j.m61536a(C22837al.class);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final Size m56255b(Size size, int i) {
        return new Size(m56250a(size.getWidth(), i), m56250a(size.getHeight(), i));
    }

    /* renamed from: a */
    public static final int m56251a(int i, Size size, Size size2) {
        C24362h.m61211f(size, "targetSize");
        C24362h.m61211f(size2, "encodedSize");
        return C17885a.m44457q0(((double) ((float) i)) * 0.001d * ((double) (m56249a(size2) / m56249a(size)))) * 1000;
    }

    /* renamed from: a */
    public static final MediaFormat m56252a(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        C24362h.m61211f(str, "mime");
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
        C24362h.m61210e(createVideoFormat, "MediaFormat.createVideoFormat(mime, width, height)");
        createVideoFormat.setInteger("color-format", i3);
        createVideoFormat.setInteger("bitrate", i4);
        createVideoFormat.setInteger("frame-rate", i5);
        createVideoFormat.setInteger("i-frame-interval", i6);
        createVideoFormat.setInteger(Scopes.PROFILE, 1);
        createVideoFormat.setInteger("level", 1);
        if (i3 == 20) {
            createVideoFormat.setInteger("slice-height", i2);
        }
        return createVideoFormat;
    }

    /* renamed from: a */
    private static final float m56249a(Size size) {
        return (float) (size.getHeight() * size.getWidth());
    }

    /* renamed from: a */
    private static final int m56250a(int i, int i2) {
        return i - (i % i2);
    }
}
